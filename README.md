[![FINOS - Incubating](https://cdn.jsdelivr.net/gh/finos/contrib-toolbox@master/images/badge-incubating.svg)](https://community.finos.org/docs/governance/Software-Projects/stages/incubating)

[![Codefresh build status]( https://g.codefresh.io/api/badges/pipeline/regnosysops/FINOS%2Fcommon-domain-model?type=cf-1)]( https://g.codefresh.io/public/accounts/regnosysops/pipelines/new/63ecb79bde06416b39d81e70)

# Common Domain Model (CDM)

The Common Domain Model is an open standard project hosted under FINOS, the [Fintech Open Source Foundation](https://community.finos.org/docs/governance/Standards-Projects), starting in February 2023.   \
 \
The standard is developed through the [Community Specification](https://community.finos.org/docs/governance/#open-standard-projects) open governance process, and underlying code assets are released under the [Community Specification License 1.0](https://github.com/finos/standards-project-blueprint/blob/master/governance-documents/4._License.md). For versions before 4.0.0 and other license details, check License.md

To participate in the standard process and working group meetings, [enroll as a participant](https://github.com/finos/standards-project-blueprint/blob/master/governance-documents/Getting%20Started.md#best-practices) by completing a [Community Specification Contributor License Agreement](https://community.finos.org/docs/governance/Standards-Projects#ip-licensing-requirements) (CSL CLA).  All meetings are to be held [in accordance with the FINOS policies and procedures](https://community.finos.org/docs/governance/meeting-procedures).

For a more detailed overview of the existing Working Group and standard Participants, Editors and Maintainers, please see [Governance.md](https://github.com/finos/standards-project-blueprint/blob/master/governance-documents/5._Governance.md). For more information on discussions and announcements subscribe to our mailing list using the following [link](mailto:cdm+subscribe@lists.finos.org).

## Governance overview

### Roles

The CSL specifies [three different contribution roles](https://github.com/finos/standards-project-blueprint/blob/master/governance-documents/5._Governance.md#1roles) for each specific Working Group:

* Maintainers - those who drive consensus within the working group
* Editors - those who codify ideas into a formal specification
* Participants - anyone who provides contributions to the project under a signed CSL CLA. A great way to sign the CLA is to open a Pull Request to add your name to the [Participants.md](https://github.com/finos/standards-project-blueprint/blob/master/governance-documents/participants.md) file. 

### Active Working Groups

The following Working Groups are currently activated or about to be setup for this project:

* [Contribution Review Working Group](https://www.finos.org/finos-community-calendar)
* [Collateral Working Group](https://www.finos.org/finos-community-calendar)
* [Technology Architecture Working Group](https://www.finos.org/finos-community-calendar)
* [Structured Products Working Group](https://www.finos.org/finos-community-calendar)
* [FINOS CDM Steering Working Group](https://www.finos.org/finos-community-calendar)
* [ISLA CDM Working Group (Securities Lending)](https://www.islaemea.org/working-groups/)
* [ISLA CDM Trading Working Group (Securities Lending)](https://www.islaemea.org/working-groups/)
* [ISLA Document Digitisation Working Group (GMSLA)](https://www.islaemea.org/working-groups/)
* ICMA CDM SteerCo for repo and bonds

Changes to the CDM may be proposed by CDM Working Groups, individual corporate contributors, or individual contributors.

![alt_text](documentation/source/images/finos-cdm-governance-structure.png "image_tooltip")

## 2. Working Groups

**2.1.0 Any Participant may propose a Working Group.** Proposals for the formation of a new Working Group are made by completion of a [new CDM Working Group](https://github.com/finos/common-domain-model) template, clearly stating the objectives, deliverables and committed maintainers/editors for the proposed Working Group. 

**2.1.1 Approval of Specification Changes by Working Groups.** Participants of each Working Group approve the “proposed” changes from that working group; the “approved changes” within a given Working Group will be brought to the Steering Working Group as a proposed “Pre-Draft” contribution.

* Participants of the CDM Steering Working Group approve DRAFT specification releases.
* Maintainers of the CDM Steering Working Group will approve merging of the proposed “Pre-Draft” changes (coming from other Working Groups or otherwise from community) into the repo.

**2.2.0 CDM Steering Working Group.** The CDM Steering Working Group will review and approve completed Working Group formation proposals per 2.1.0.

**2.2.1 CDM Steering Working Group Purpose:** The Steering Working Group is responsible for developing the technical and modelling guidelines, setting and revising the project’s strategic roadmap, and for vetting proposed changes. The CDM Steering Working Group may approve or establish additional working groups.

**2.2.2 Appointment of CDM Steering Working Group Maintainers:**

* At the launch of the project, up to two initial Maintainers will be nominated by ICMA, ISDA, and ISLA (collectively, the “trade associations”).
* Additional CDM Steering Group  Maintainers may be proposed by Participants. Proposed maintainers will be approved via consensus of the Participants and with agreement of existing Maintainers, and should meet the following criteria:
    * Proven experience in data modelling and/or software development in financial markets.
    * In-depth understanding and proven track record of contribution to the CDM, as well as other data standards (such as ISO) and messaging protocols (such as FIX, FpML or Swift).

**2.2.3 CDM Steering Working Group Decision Making:** As outlined in [governance.md](https://github.com/finos/standards-project-blueprint/blob/master/governance-documents/5._Governance.md#2decision-making), The CDM Steering Working Group will operate by consensus-based decision-making. Maintainers are responsible for determining and documenting when consensus has been reached. In the event a clear consensus is not reached, Maintainers may call for a simple majority vote of Participants to determine outcomes.

**2.2.4 CDM Steering Working Group Appointment of the Editor(s):** Editors will review and implement pull requests not expressed in code, test and release new functionalities, resolve bugs and implement approved improvements. 

## CDM Design Principles

Contributions to the CDM have to comply with the following set of design principles that include the following concepts:

* **Normalisation** through abstraction of common components
* **Composability** where objects are composed and qualified from the bottom up
* **Mapping** to existing industry messaging formats
* **Embedded logic** to represent industry processes
* **Modularisation** into logical layers \

## CDM development guidelines 

The CDM Development Guidelines are defined by the Steering Working Group. The full set of CDM development guidelines can be found [here](https://cdm.docs.rosetta-technology.io/source/contribution.html).

## Getting involved 

Interact with the CDM community


### 
**GitHub**

CDM activity primarily happens in this [CDM GitHub repository](https://github.com/finos/common-domain-model). [Watch](https://docs.github.com/en/account-and-profile/managing-subscriptions-and-notifications-on-github/setting-up-notifications/configuring-notifications#configuring-your-watch-settings-for-an-individual-repository) the repository in order to be notified of new Pull Requests and issues.


### 
**Email**

If you'd like to receive official updates, please send an email to help@finos.org. You can join the CDM mailing list by sending an email to [cdm+subscribe@lists.finos.org](mailto:cdm+subscribe@lists.finos.org). 


### 
**Meetings**

Finally, another great way to interact with the community is to attend the bi-weekly CDM Contribution Review Working Group, monthly Collateral Working Group, monthly FINOS CDM Structured Products Working Group, monthly Steering Technology Architecture Working Group, and/or quarterly FINOS CDM Steering Working Group: email help@finos.org to be added to the meeting invites directly, or find the meeting in the [FINOS Community Calendar](https://calendar.google.com/calendar/embed?src=finos.org_fac8mo1rfc6ehscg0d80fi8jig%40group.calendar.google.com). If you are using an outlook calender you can add the meetings to your calender directly by downloading the ics files shown [here.](https://github.com/eteridvalishvili/common-domain-model/tree/master/meeting-ics-files)


### 
**Need help?**

Email help@finos.org. if you need help getting started in the CDM Community or if you encounter technical difficulties accessing repositories, mailing lists or meetings. 


## Contributing

See guidelines for the licensing agreement [here](https://github.com/finos/common-domain-model/blob/master/.github/CONTRIBUTING.md).

To implement changes in the CDM repository resolving an issue please read our [contribution guidelines](https://cdm.docs.rosetta-technology.io/source/contribution.html).

NOTE: Commits and pull requests to FINOS repositories will only be accepted from those contributors with an active, executed Individual Contributor License Agreement (ICLA) with FINOS, OR who are covered under an existing and active Corporate Contribution License Agreement (CCLA) executed with FINOS. Commits from individuals not covered under an ICLA or CCLA will be flagged and blocked by the Linux Foundation EasyCLA tool. Please note that some CCLAs require individuals/employees to be explicitly named on the CCLA.

Need an ICLA? Unsure if you are covered under an existing CCLA? Email help@finos.org.

### Contribution via Rosetta

The [Rosetta Design](https://rosetta-technology.io/design) application can be used to contribute to the CDM without setting up any development environment. Rosetta Design’s [source control integration](https://docs.rosetta-technology.io/rosetta/rosetta-products/1-workspace/#source-control-integration) means that a PR is automatically created to a fork of the FINOS CDM under the [Rosetta Models](https://github.com/rosetta-models) GitHub Organisation.

Steps:
  1. Create a Workspace for the CDM in Rosetta Design
  1. Review and contribute change in Rosetta Design - which will create PR in the rosetta-models organisation
  1. Create a PR to the Finos Github. See instructions [here](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request-from-a-fork)

### Contributing via GitHub

1. Fork it (https://github.com/finos/common-domain-model)
1. Create your feature branch (`git checkout -b feature/my-new-feature`)
1. Make a change - _hint_ you can make changes to Rosetta files directly on your desktop using the [Rosetta VS Code plugin](https://github.com/REGnosys/rosetta-dsl/tree/master/rosetta-ide/vscode)
1. Read our [contribution guidelines](.github/CONTRIBUTING.md) and [Community Code of Conduct](https://www.finos.org/code-of-conduct)
1. Commit your changes (`git commit -am 'My New Feature'`)
1. Push to the branch (`git push origin feature/my-new-feature`)
1. Create a new Pull Request

## Documentation

The CDM has extensive documentation which is kept up to date. Any change to the CDM should be accompanied by documentation. See docs guide [here](https://cdm.docs.rosetta-technology.io/source/contribution.html#documentation-style-guide)


_NOTE:_ Commits and pull requests to FINOS repositories will only be accepted from those contributors with an active, executed Individual Contributor License Agreement (ICLA) with FINOS OR who are covered under an existing and active Corporate Contribution License Agreement (CCLA) executed with FINOS. Commits from individuals not covered under an ICLA or CCLA will be flagged and blocked by the FINOS Clabot tool (or [EasyCLA](https://community.finos.org/docs/governance/Software-Projects/easycla)). Please note that some CCLAs require individuals/employees to be explicitly named on the CCLA.

*Need an ICLA? Unsure if you are covered under an existing CCLA? Email [help@finos.org](mailto:help@finos.org)*

## License

Copyright 2021 FINOS and CDM Participants

Specifications in the repository are subject to the Community Specification License 1.0 available in the [LICENSE.md](LICENSE.md) file.
