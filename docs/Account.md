# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountUserAccounts** | [**List&lt;UserAccount&gt;**](UserAccount.md) | The users linked to the account |  [optional]
**actions** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Block of actions allowed by the user making the request. |  [optional]
**customFields** | [**List&lt;CustomField&gt;**](CustomField.md) |  |  [optional]
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The account&#x27;s creation date. |  [optional]
**dateModified** | [**OffsetDateTime**](OffsetDateTime.md) | The account&#x27;s most recent modification date. |  [optional]
**defaultBillingAddressId** | **Long** |  |  [optional]
**defaultShippingAddressId** | **Long** |  |  [optional]
**description** | **String** |  |  [optional]
**domains** | **List&lt;String&gt;** | The account&#x27;s email domains. Users assigned to this account generally will have email addresses under one of these domains. |  [optional]
**externalReferenceCode** | **String** | The optional external key of this account. |  [optional]
**id** | **Long** |  |  [optional]
**logoId** | **Long** |  |  [optional]
**logoURL** | **String** |  |  [optional]
**name** | **String** |  | 
**numberOfUsers** | **Integer** | The number of this account&#x27;s associated users. |  [optional]
**organizationIds** | **List&lt;Long&gt;** |  |  [optional]
**parentAccountId** | **Long** |  |  [optional]
**postalAddresses** | [**List&lt;PostalAddress&gt;**](PostalAddress.md) | The addresses linked to the account |  [optional]
**status** | **Integer** |  |  [optional]
**taxId** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**xClassName** | **String** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BUSINESS | &quot;business&quot;
GUEST | &quot;guest&quot;
PERSON | &quot;person&quot;
SUPPLIER | &quot;supplier&quot;
