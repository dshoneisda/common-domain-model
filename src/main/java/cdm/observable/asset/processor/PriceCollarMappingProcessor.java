package cdm.observable.asset.processor;

import cdm.base.math.UnitType;
import cdm.observable.asset.Price;
import cdm.observable.asset.PriceQuantity;
import cdm.observable.asset.PriceTypeEnum;
import cdm.observable.asset.metafields.FieldWithMetaPrice;
import com.regnosys.rosetta.common.translation.Mapping;
import com.regnosys.rosetta.common.translation.MappingContext;
import com.regnosys.rosetta.common.translation.MappingProcessor;
import com.regnosys.rosetta.common.translation.Path;
import com.rosetta.model.lib.RosettaModelObjectBuilder;
import com.rosetta.model.lib.path.RosettaPath;
import com.rosetta.model.metafields.FieldWithMetaString;
import com.rosetta.model.metafields.MetaFields;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static cdm.base.math.UnitType.UnitTypeBuilder;
import static com.regnosys.rosetta.common.translation.MappingProcessorUtils.updateMappingSuccess;

/**
 * Mapper required due to mapping issues with multiple prices.
 * <p>
 * Fix synonym mapping logic and remove these mappers.
 */
@SuppressWarnings("unused")
public class PriceCollarMappingProcessor extends MappingProcessor {

	public PriceCollarMappingProcessor(RosettaPath modelPath, List<Path> synonymPaths, MappingContext context) {
		super(modelPath, synonymPaths, context);
	}

	@Override
	public void map(Path synonymPath, List<? extends RosettaModelObjectBuilder> builder, RosettaModelObjectBuilder parent) {
		Path startsWithPath = startsWithPath("capFloorStream", synonymPath);
		Optional<Mapping> floorRateMapping = getNonNullMapping(startsWithPath, "floorRateSchedule", "initialValue");
		Optional<Mapping> capRateMapping = getNonNullMapping(startsWithPath, "capRateSchedule", "initialValue");
		if (floorRateMapping.isPresent() && capRateMapping.isPresent()) {
			UnitTypeBuilder unitType = getUnitTypeNotionalCurrency(startsWithPath);
			((PriceQuantity.PriceQuantityBuilder) parent)
					.addPriceBuilder(getPrice(floorRateMapping, unitType, unitType, PriceTypeEnum.FLOOR_RATE));
			updateMappingSuccess(floorRateMapping.get(), getModelPath());
		}
	}

	private Path startsWithPath(String pathElement, Path path) {
		if (path.endsWith(pathElement)) {
			return path;
		}
		Path parent = path.getParent();
		if (parent != null) {
			return startsWithPath(pathElement, parent);
		}
		throw new IllegalArgumentException(String.format("Path element %s not found in path %s", pathElement, path));
	}

	private FieldWithMetaPrice.FieldWithMetaPriceBuilder getPrice(Optional<Mapping> price, UnitTypeBuilder unitOfAmount, UnitTypeBuilder perUnitOfAmount, PriceTypeEnum priceType) {
		return FieldWithMetaPrice.builder()
				.setValueBuilder(Price.builder()
						.setAmountBuilder(toBigDecimalValue(price))
						.setPriceType(priceType)
						.setUnitOfAmountBuilder(unitOfAmount)
						.setPerUnitOfAmountBuilder(perUnitOfAmount));
	}

	private UnitTypeBuilder getUnitTypeNotionalCurrency(Path startsWithPath) {
		UnitTypeBuilder unitType = UnitType.builder()
				.setCurrencyBuilder(FieldWithMetaString.builder()
						.setValue(getStringValue(startsWithPath, "notionalStepSchedule", "currency"))
						.setMeta(MetaFields.builder()
								.setScheme(getStringValue(startsWithPath, "notionalStepSchedule", "currency", "currencyScheme"))
								.build()));
		return unitType;
	}

	private Optional<Mapping> getNonNullMapping(Path startsWith, String... endsWith) {
		return getMappings().stream()
				.filter(m -> startsWith.fullStartMatches(m.getXmlPath()))
				.filter(m -> m.getXmlPath().endsWith(endsWith))
				.filter(m -> m.getXmlValue() != null)
				.findFirst();
	}

	private BigDecimal toBigDecimalValue(Optional<Mapping> mapping) {
		return mapping.map(Mapping::getXmlValue).map(String::valueOf).map(BigDecimal::new).orElse(null);
	}

	private String getStringValue(Path startsWith, String... endsWith) {
		return getNonNullMapping(startsWith, endsWith)
				.map(Mapping::getXmlValue)
				.map(String::valueOf)
				.orElse(null);
	}
}
