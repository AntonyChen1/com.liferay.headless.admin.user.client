# Organization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) |  |  [optional]
**childOrganizations** | [**List&lt;Organization&gt;**](Organization.md) |  |  [optional]
**comment** | **String** | The text of a comment associated with the organization. |  [optional]
**customFields** | [**List&lt;CustomField&gt;**](CustomField.md) |  |  [optional]
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The organization&#x27;s creation date. |  [optional]
**dateModified** | [**OffsetDateTime**](OffsetDateTime.md) | The most recent time any of the organization&#x27;s fields changed. |  [optional]
**externalReferenceCode** | **String** | The optional external key of this organization. |  [optional]
**id** | **String** | The organization&#x27;s ID. |  [optional]
**image** | **String** | A relative URL to the organization&#x27;s image. |  [optional]
**keywords** | **List&lt;String&gt;** | A list of keywords describing the organization. |  [optional]
**location** | [**Location**](Location.md) |  |  [optional]
**name** | **String** | The organization&#x27;s name. |  [optional]
**numberOfAccounts** | **Integer** | The number of this organization&#x27;s associated accounts. |  [optional]
**numberOfOrganizations** | **Integer** | The number of this organization&#x27;s child organizations. |  [optional]
**numberOfUsers** | **Integer** | The number of this organization&#x27;s associated users. |  [optional]
**organizationAccounts** | [**List&lt;Account&gt;**](Account.md) |  |  [optional]
**organizationContactInformation** | [**OrganizationContactInformation**](OrganizationContactInformation.md) |  |  [optional]
**parentOrganization** | [**Organization**](Organization.md) |  |  [optional]
**services** | [**List&lt;Service&gt;**](Service.md) | A list of services the organization provides. This follows the [&#x60;Service&#x60;](https://www.schema.org/Service) specification. |  [optional]
**treePath** | **String** | The tree path of the organization. |  [optional]
**userAccounts** | [**List&lt;UserAccount&gt;**](UserAccount.md) |  |  [optional]
**xClassName** | **String** |  |  [optional]
