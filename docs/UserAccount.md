# UserAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountBriefs** | [**List&lt;AccountBrief&gt;**](AccountBrief.md) | A list of the user&#x27;s account. |  [optional]
**actions** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) |  |  [optional]
**additionalName** | **String** | The user&#x27;s additional name (e.g., middle name). |  [optional]
**alternateName** | **String** | The user&#x27;s alias or screen name. |  [optional]
**birthDate** | [**OffsetDateTime**](OffsetDateTime.md) | The user&#x27;s date of birth, in ISO 8601 format. |  [optional]
**currentPassword** | **String** |  |  [optional]
**customFields** | [**List&lt;CustomField&gt;**](CustomField.md) |  |  [optional]
**dashboardURL** | **String** | A relative URL to the user&#x27;s dashboard. |  [optional]
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The creation date of the user&#x27;s account. |  [optional]
**dateModified** | [**OffsetDateTime**](OffsetDateTime.md) | The last time any field of the user&#x27;s account was changed. |  [optional]
**emailAddress** | **String** | The user&#x27;s main email address. |  [optional]
**externalReferenceCode** | **String** | The optional external key of this user account. |  [optional]
**familyName** | **String** | The user&#x27;s surname (last name). |  [optional]
**givenName** | **String** | The user&#x27;s first name. |  [optional]
**honorificPrefix** | **String** | The user&#x27;s title (e.g., Dr., Mr., Mrs, Ms., etc.). |  [optional]
**honorificSuffix** | **String** | The user&#x27;s suffix (e.g., II, Jr., PhD, etc.). |  [optional]
**id** | **Long** | The user&#x27;s ID. |  [optional]
**image** | **String** | A relative URL to the user&#x27;s profile image. |  [optional]
**jobTitle** | **String** | The user&#x27;s job title. |  [optional]
**keywords** | **List&lt;String&gt;** | A list of keywords describing the user. |  [optional]
**lastLoginDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last time the user logged in. |  [optional]
**name** | **String** | The user&#x27;s full name. |  [optional]
**organizationBriefs** | [**List&lt;OrganizationBrief&gt;**](OrganizationBrief.md) | A list of the user&#x27;s organizations. |  [optional]
**password** | **String** |  |  [optional]
**profileURL** | **String** | A relative URL to the user&#x27;s profile. |  [optional]
**roleBriefs** | [**List&lt;RoleBrief&gt;**](RoleBrief.md) | A list of the user&#x27;s roles. |  [optional]
**siteBriefs** | [**List&lt;SiteBrief&gt;**](SiteBrief.md) | A list of the user&#x27;s sites. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The user&#x27;s status. |  [optional]
**userAccountContactInformation** | [**UserAccountContactInformation**](UserAccountContactInformation.md) |  |  [optional]
**userGroupBriefs** | [**List&lt;UserGroupBrief&gt;**](UserGroupBrief.md) | A list of the user&#x27;s userGroups. |  [optional]
**xClassName** | **String** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;Active&quot;
INACTIVE | &quot;Inactive&quot;
