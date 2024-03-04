# AccountRoleApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAccountAccountRoleUserAccountAssociation**](AccountRoleApi.md#deleteAccountAccountRoleUserAccountAssociation) | **DELETE** /v1.0/accounts/{accountId}/account-roles/{accountRoleId}/user-accounts/{userAccountId} | 
[**deleteAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress**](AccountRoleApi.md#deleteAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress) | **DELETE** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/account-roles/{accountRoleId}/user-accounts/by-email-address/{emailAddress} | 
[**deleteAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode**](AccountRoleApi.md#deleteAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode) | **DELETE** /v1.0/accounts/by-external-reference-code/{accountExternalReferenceCode}/account-roles/{accountRoleId}/user-accounts/by-external-reference-code/{externalReferenceCode} | 
[**getAccountAccountRolesByExternalReferenceCodePage**](AccountRoleApi.md#getAccountAccountRolesByExternalReferenceCodePage) | **GET** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/account-roles | 
[**getAccountAccountRolesPage**](AccountRoleApi.md#getAccountAccountRolesPage) | **GET** /v1.0/accounts/{accountId}/account-roles | 
[**getAccountByExternalReferenceCodeUserAccountByEmailAddressAccountRolesPage**](AccountRoleApi.md#getAccountByExternalReferenceCodeUserAccountByEmailAddressAccountRolesPage) | **GET** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/user-accounts/by-email-address/{emailAddress}/account-roles | 
[**getAccountByExternalReferenceCodeUserAccountByExternalReferenceCodeAccountRolesPage**](AccountRoleApi.md#getAccountByExternalReferenceCodeUserAccountByExternalReferenceCodeAccountRolesPage) | **GET** /v1.0/accounts/by-external-reference-code/{accountExternalReferenceCode}/user-accounts/by-external-reference-code/{externalReferenceCode}/account-roles | 
[**postAccountAccountRole**](AccountRoleApi.md#postAccountAccountRole) | **POST** /v1.0/accounts/{accountId}/account-roles | 
[**postAccountAccountRoleBatch**](AccountRoleApi.md#postAccountAccountRoleBatch) | **POST** /v1.0/accounts/{accountId}/account-roles/batch | 
[**postAccountAccountRoleByExternalReferenceCode**](AccountRoleApi.md#postAccountAccountRoleByExternalReferenceCode) | **POST** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/account-roles | 
[**postAccountAccountRoleUserAccountAssociation**](AccountRoleApi.md#postAccountAccountRoleUserAccountAssociation) | **POST** /v1.0/accounts/{accountId}/account-roles/{accountRoleId}/user-accounts/{userAccountId} | 
[**postAccountAccountRolesPageExportBatch**](AccountRoleApi.md#postAccountAccountRolesPageExportBatch) | **POST** /v1.0/accounts/{accountId}/account-roles/export-batch | 
[**postAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress**](AccountRoleApi.md#postAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress) | **POST** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/account-roles/{accountRoleId}/user-accounts/by-email-address/{emailAddress} | 
[**postAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode**](AccountRoleApi.md#postAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode) | **POST** /v1.0/accounts/by-external-reference-code/{accountExternalReferenceCode}/account-roles/{accountRoleId}/user-accounts/by-external-reference-code/{externalReferenceCode} | 

<a name="deleteAccountAccountRoleUserAccountAssociation"></a>
# **deleteAccountAccountRoleUserAccountAssociation**
> deleteAccountAccountRoleUserAccountAssociation(accountId, accountRoleId, userAccountId)



Unassigns account users to the account role

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String accountId = "accountId_example"; // String | 
String accountRoleId = "accountRoleId_example"; // String | 
String userAccountId = "userAccountId_example"; // String | 
try {
    apiInstance.deleteAccountAccountRoleUserAccountAssociation(accountId, accountRoleId, userAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#deleteAccountAccountRoleUserAccountAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **accountRoleId** | **String**|  |
 **userAccountId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress"></a>
# **deleteAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress**
> deleteAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress(externalReferenceCode, accountRoleId, emailAddress)



Unassigns account users by email address from the account role

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
String accountRoleId = "accountRoleId_example"; // String | 
String emailAddress = "emailAddress_example"; // String | 
try {
    apiInstance.deleteAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress(externalReferenceCode, accountRoleId, emailAddress);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#deleteAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **accountRoleId** | **String**|  |
 **emailAddress** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode"></a>
# **deleteAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode**
> deleteAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode(accountExternalReferenceCode, accountRoleId, externalReferenceCode)



Unassigns account users by external reference code from the account role

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String accountExternalReferenceCode = "accountExternalReferenceCode_example"; // String | 
String accountRoleId = "accountRoleId_example"; // String | 
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    apiInstance.deleteAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode(accountExternalReferenceCode, accountRoleId, externalReferenceCode);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#deleteAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountExternalReferenceCode** | **String**|  |
 **accountRoleId** | **String**|  |
 **externalReferenceCode** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountAccountRolesByExternalReferenceCodePage"></a>
# **getAccountAccountRolesByExternalReferenceCodePage**
> PageAccountRole getAccountAccountRolesByExternalReferenceCodePage(externalReferenceCode, keywords, filter, page, pageSize, sort)



Gets the account&#x27;s roles

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
String keywords = "keywords_example"; // String | 
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageAccountRole result = apiInstance.getAccountAccountRolesByExternalReferenceCodePage(externalReferenceCode, keywords, filter, page, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#getAccountAccountRolesByExternalReferenceCodePage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **keywords** | **String**|  | [optional]
 **filter** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**PageAccountRole**](PageAccountRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountAccountRolesPage"></a>
# **getAccountAccountRolesPage**
> PageAccountRole getAccountAccountRolesPage(accountId, keywords, filter, page, pageSize, sort)



Gets the account&#x27;s roles

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String accountId = "accountId_example"; // String | 
String keywords = "keywords_example"; // String | 
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageAccountRole result = apiInstance.getAccountAccountRolesPage(accountId, keywords, filter, page, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#getAccountAccountRolesPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **keywords** | **String**|  | [optional]
 **filter** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**PageAccountRole**](PageAccountRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountByExternalReferenceCodeUserAccountByEmailAddressAccountRolesPage"></a>
# **getAccountByExternalReferenceCodeUserAccountByEmailAddressAccountRolesPage**
> PageAccountRole getAccountByExternalReferenceCodeUserAccountByEmailAddressAccountRolesPage(externalReferenceCode, emailAddress)



Gets a user&#x27;s account roles by their email address from an account by external reference code

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
String emailAddress = "emailAddress_example"; // String | 
try {
    PageAccountRole result = apiInstance.getAccountByExternalReferenceCodeUserAccountByEmailAddressAccountRolesPage(externalReferenceCode, emailAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#getAccountByExternalReferenceCodeUserAccountByEmailAddressAccountRolesPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **emailAddress** | **String**|  |

### Return type

[**PageAccountRole**](PageAccountRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountByExternalReferenceCodeUserAccountByExternalReferenceCodeAccountRolesPage"></a>
# **getAccountByExternalReferenceCodeUserAccountByExternalReferenceCodeAccountRolesPage**
> PageAccountRole getAccountByExternalReferenceCodeUserAccountByExternalReferenceCodeAccountRolesPage(accountExternalReferenceCode, externalReferenceCode)



Gets a user&#x27;s account roles by their external reference code from an account by external reference code

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String accountExternalReferenceCode = "accountExternalReferenceCode_example"; // String | 
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    PageAccountRole result = apiInstance.getAccountByExternalReferenceCodeUserAccountByExternalReferenceCodeAccountRolesPage(accountExternalReferenceCode, externalReferenceCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#getAccountByExternalReferenceCodeUserAccountByExternalReferenceCodeAccountRolesPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountExternalReferenceCode** | **String**|  |
 **externalReferenceCode** | **String**|  |

### Return type

[**PageAccountRole**](PageAccountRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postAccountAccountRole"></a>
# **postAccountAccountRole**
> AccountRole postAccountAccountRole(accountId, body)



Adds a role for the account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String accountId = "accountId_example"; // String | 
AccountRole body = new AccountRole(); // AccountRole | 
try {
    AccountRole result = apiInstance.postAccountAccountRole(accountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#postAccountAccountRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **body** | [**AccountRole**](AccountRole.md)|  | [optional]

### Return type

[**AccountRole**](AccountRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccountAccountRoleBatch"></a>
# **postAccountAccountRoleBatch**
> postAccountAccountRoleBatch(accountId, body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String accountId = "accountId_example"; // String | 
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.postAccountAccountRoleBatch(accountId, body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#postAccountAccountRoleBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **body** | [**Object**](Object.md)|  | [optional]
 **callbackURL** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountAccountRoleByExternalReferenceCode"></a>
# **postAccountAccountRoleByExternalReferenceCode**
> AccountRole postAccountAccountRoleByExternalReferenceCode(externalReferenceCode, body)



Adds a role for the account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
AccountRole body = new AccountRole(); // AccountRole | 
try {
    AccountRole result = apiInstance.postAccountAccountRoleByExternalReferenceCode(externalReferenceCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#postAccountAccountRoleByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **body** | [**AccountRole**](AccountRole.md)|  | [optional]

### Return type

[**AccountRole**](AccountRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccountAccountRoleUserAccountAssociation"></a>
# **postAccountAccountRoleUserAccountAssociation**
> postAccountAccountRoleUserAccountAssociation(accountId, accountRoleId, userAccountId)



Assigns account users to the account role

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String accountId = "accountId_example"; // String | 
String accountRoleId = "accountRoleId_example"; // String | 
String userAccountId = "userAccountId_example"; // String | 
try {
    apiInstance.postAccountAccountRoleUserAccountAssociation(accountId, accountRoleId, userAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#postAccountAccountRoleUserAccountAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **accountRoleId** | **String**|  |
 **userAccountId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postAccountAccountRolesPageExportBatch"></a>
# **postAccountAccountRolesPageExportBatch**
> postAccountAccountRolesPageExportBatch(accountId, keywords, filter, sort, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String accountId = "accountId_example"; // String | 
String keywords = "keywords_example"; // String | 
String filter = "filter_example"; // String | 
String sort = "sort_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postAccountAccountRolesPageExportBatch(accountId, keywords, filter, sort, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#postAccountAccountRolesPageExportBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **keywords** | **String**|  | [optional]
 **filter** | **String**|  | [optional]
 **sort** | **String**|  | [optional]
 **callbackURL** | **String**|  | [optional]
 **contentType** | **String**|  | [optional]
 **fieldNames** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress"></a>
# **postAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress**
> postAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress(externalReferenceCode, accountRoleId, emailAddress)



Assigns account users by email address to the account role

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
String accountRoleId = "accountRoleId_example"; // String | 
String emailAddress = "emailAddress_example"; // String | 
try {
    apiInstance.postAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress(externalReferenceCode, accountRoleId, emailAddress);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#postAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **accountRoleId** | **String**|  |
 **emailAddress** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode"></a>
# **postAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode**
> postAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode(accountExternalReferenceCode, accountRoleId, externalReferenceCode)



Assigns account users by external reference code to the account role

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountRoleApi;


AccountRoleApi apiInstance = new AccountRoleApi();
String accountExternalReferenceCode = "accountExternalReferenceCode_example"; // String | 
String accountRoleId = "accountRoleId_example"; // String | 
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    apiInstance.postAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode(accountExternalReferenceCode, accountRoleId, externalReferenceCode);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRoleApi#postAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountExternalReferenceCode** | **String**|  |
 **accountRoleId** | **String**|  |
 **externalReferenceCode** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

