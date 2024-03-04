# AccountApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAccount**](AccountApi.md#deleteAccount) | **DELETE** /v1.0/accounts/{accountId} | 
[**deleteAccountBatch**](AccountApi.md#deleteAccountBatch) | **DELETE** /v1.0/accounts/batch | 
[**deleteAccountByExternalReferenceCode**](AccountApi.md#deleteAccountByExternalReferenceCode) | **DELETE** /v1.0/accounts/by-external-reference-code/{externalReferenceCode} | 
[**deleteOrganizationAccounts**](AccountApi.md#deleteOrganizationAccounts) | **DELETE** /v1.0/organizations/{organizationId}/accounts | 
[**deleteOrganizationAccountsByExternalReferenceCode**](AccountApi.md#deleteOrganizationAccountsByExternalReferenceCode) | **DELETE** /v1.0/organizations/{organizationId}/accounts/by-external-reference-code | 
[**getAccount**](AccountApi.md#getAccount) | **GET** /v1.0/accounts/{accountId} | 
[**getAccountByExternalReferenceCode**](AccountApi.md#getAccountByExternalReferenceCode) | **GET** /v1.0/accounts/by-external-reference-code/{externalReferenceCode} | 
[**getAccountsPage**](AccountApi.md#getAccountsPage) | **GET** /v1.0/accounts | 
[**getOrganizationAccountsPage**](AccountApi.md#getOrganizationAccountsPage) | **GET** /v1.0/organizations/{organizationId}/accounts | 
[**patchAccount**](AccountApi.md#patchAccount) | **PATCH** /v1.0/accounts/{accountId} | 
[**patchAccountByExternalReferenceCode**](AccountApi.md#patchAccountByExternalReferenceCode) | **PATCH** /v1.0/accounts/by-external-reference-code/{externalReferenceCode} | 
[**patchOrganizationMoveAccounts**](AccountApi.md#patchOrganizationMoveAccounts) | **PATCH** /v1.0/organizations/move-accounts/{sourceOrganizationId}/{targetOrganizationId} | 
[**patchOrganizationMoveAccountsByExternalReferenceCode**](AccountApi.md#patchOrganizationMoveAccountsByExternalReferenceCode) | **PATCH** /v1.0/organizations/move-accounts/{sourceOrganizationId}/{targetOrganizationId}/by-external-reference-code | 
[**postAccount**](AccountApi.md#postAccount) | **POST** /v1.0/accounts | 
[**postAccountBatch**](AccountApi.md#postAccountBatch) | **POST** /v1.0/accounts/batch | 
[**postAccountsPageExportBatch**](AccountApi.md#postAccountsPageExportBatch) | **POST** /v1.0/accounts/export-batch | 
[**postOrganizationAccounts**](AccountApi.md#postOrganizationAccounts) | **POST** /v1.0/organizations/{organizationId}/accounts | 
[**postOrganizationAccountsByExternalReferenceCode**](AccountApi.md#postOrganizationAccountsByExternalReferenceCode) | **POST** /v1.0/organizations/{organizationId}/accounts/by-external-reference-code | 
[**postOrganizationAccountsPageExportBatch**](AccountApi.md#postOrganizationAccountsPageExportBatch) | **POST** /v1.0/organizations/{organizationId}/accounts/export-batch | 
[**putAccount**](AccountApi.md#putAccount) | **PUT** /v1.0/accounts/{accountId} | 
[**putAccountBatch**](AccountApi.md#putAccountBatch) | **PUT** /v1.0/accounts/batch | 
[**putAccountByExternalReferenceCode**](AccountApi.md#putAccountByExternalReferenceCode) | **PUT** /v1.0/accounts/by-external-reference-code/{externalReferenceCode} | 

<a name="deleteAccount"></a>
# **deleteAccount**
> deleteAccount(accountId)



Deletes an account.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String accountId = "accountId_example"; // String | 
try {
    apiInstance.deleteAccount(accountId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#deleteAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteAccountBatch"></a>
# **deleteAccountBatch**
> deleteAccountBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.deleteAccountBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#deleteAccountBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]
 **callbackURL** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountByExternalReferenceCode"></a>
# **deleteAccountByExternalReferenceCode**
> deleteAccountByExternalReferenceCode(externalReferenceCode)



Deletes an account.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    apiInstance.deleteAccountByExternalReferenceCode(externalReferenceCode);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#deleteAccountByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteOrganizationAccounts"></a>
# **deleteOrganizationAccounts**
> deleteOrganizationAccounts(organizationId, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String organizationId = "organizationId_example"; // String | 
List<Long> body = Arrays.asList(56L); // List<Long> | 
try {
    apiInstance.deleteOrganizationAccounts(organizationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#deleteOrganizationAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **body** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteOrganizationAccountsByExternalReferenceCode"></a>
# **deleteOrganizationAccountsByExternalReferenceCode**
> deleteOrganizationAccountsByExternalReferenceCode(organizationId, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String organizationId = "organizationId_example"; // String | 
List<String> body = Arrays.asList("body_example"); // List<String> | 
try {
    apiInstance.deleteOrganizationAccountsByExternalReferenceCode(organizationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#deleteOrganizationAccountsByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **body** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getAccount"></a>
# **getAccount**
> Account getAccount(accountId)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String accountId = "accountId_example"; // String | 
try {
    Account result = apiInstance.getAccount(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountByExternalReferenceCode"></a>
# **getAccountByExternalReferenceCode**
> Account getAccountByExternalReferenceCode(externalReferenceCode)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    Account result = apiInstance.getAccountByExternalReferenceCode(externalReferenceCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountsPage"></a>
# **getAccountsPage**
> PageAccount getAccountsPage(filter, page, pageSize, search, sort)



Retrieves the accounts. Results can be paginated, filtered, searched, and sorted.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageAccount result = apiInstance.getAccountsPage(filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]
 **search** | **String**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**PageAccount**](PageAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getOrganizationAccountsPage"></a>
# **getOrganizationAccountsPage**
> PageAccount getOrganizationAccountsPage(organizationId, filter, page, pageSize, search, sort)



Retrieves the organization&#x27;s members (accounts). Results can be paginated, filtered, searched, and sorted.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String organizationId = "organizationId_example"; // String | 
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageAccount result = apiInstance.getOrganizationAccountsPage(organizationId, filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getOrganizationAccountsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **filter** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]
 **search** | **String**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**PageAccount**](PageAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="patchAccount"></a>
# **patchAccount**
> Account patchAccount(accountId, body)



Updates the account with information sent in the request body. Only the provided fields are updated.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String accountId = "accountId_example"; // String | 
Account body = new Account(); // Account | 
try {
    Account result = apiInstance.patchAccount(accountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#patchAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **body** | [**Account**](Account.md)|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="patchAccountByExternalReferenceCode"></a>
# **patchAccountByExternalReferenceCode**
> Account patchAccountByExternalReferenceCode(externalReferenceCode, body)



Updates the account with information sent in the request body. Only the provided fields are updated.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
Account body = new Account(); // Account | 
try {
    Account result = apiInstance.patchAccountByExternalReferenceCode(externalReferenceCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#patchAccountByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **body** | [**Account**](Account.md)|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="patchOrganizationMoveAccounts"></a>
# **patchOrganizationMoveAccounts**
> patchOrganizationMoveAccounts(sourceOrganizationId, targetOrganizationId, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String sourceOrganizationId = "sourceOrganizationId_example"; // String | 
String targetOrganizationId = "targetOrganizationId_example"; // String | 
List<Long> body = Arrays.asList(56L); // List<Long> | 
try {
    apiInstance.patchOrganizationMoveAccounts(sourceOrganizationId, targetOrganizationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#patchOrganizationMoveAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceOrganizationId** | **String**|  |
 **targetOrganizationId** | **String**|  |
 **body** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="patchOrganizationMoveAccountsByExternalReferenceCode"></a>
# **patchOrganizationMoveAccountsByExternalReferenceCode**
> patchOrganizationMoveAccountsByExternalReferenceCode(sourceOrganizationId, targetOrganizationId, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String sourceOrganizationId = "sourceOrganizationId_example"; // String | 
String targetOrganizationId = "targetOrganizationId_example"; // String | 
List<String> body = Arrays.asList("body_example"); // List<String> | 
try {
    apiInstance.patchOrganizationMoveAccountsByExternalReferenceCode(sourceOrganizationId, targetOrganizationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#patchOrganizationMoveAccountsByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceOrganizationId** | **String**|  |
 **targetOrganizationId** | **String**|  |
 **body** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccount"></a>
# **postAccount**
> Account postAccount(body)



Creates a new account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
Account body = new Account(); // Account | 
try {
    Account result = apiInstance.postAccount(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#postAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Account**](Account.md)|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccountBatch"></a>
# **postAccountBatch**
> postAccountBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.postAccountBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#postAccountBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]
 **callbackURL** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountsPageExportBatch"></a>
# **postAccountsPageExportBatch**
> postAccountsPageExportBatch(filter, search, sort, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String filter = "filter_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postAccountsPageExportBatch(filter, search, sort, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#postAccountsPageExportBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]
 **search** | **String**|  | [optional]
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

<a name="postOrganizationAccounts"></a>
# **postOrganizationAccounts**
> postOrganizationAccounts(organizationId, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String organizationId = "organizationId_example"; // String | 
List<Long> body = Arrays.asList(56L); // List<Long> | 
try {
    apiInstance.postOrganizationAccounts(organizationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#postOrganizationAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **body** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postOrganizationAccountsByExternalReferenceCode"></a>
# **postOrganizationAccountsByExternalReferenceCode**
> postOrganizationAccountsByExternalReferenceCode(organizationId, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String organizationId = "organizationId_example"; // String | 
List<String> body = Arrays.asList("body_example"); // List<String> | 
try {
    apiInstance.postOrganizationAccountsByExternalReferenceCode(organizationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#postOrganizationAccountsByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **body** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postOrganizationAccountsPageExportBatch"></a>
# **postOrganizationAccountsPageExportBatch**
> postOrganizationAccountsPageExportBatch(organizationId, filter, search, sort, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String organizationId = "organizationId_example"; // String | 
String filter = "filter_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postOrganizationAccountsPageExportBatch(organizationId, filter, search, sort, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#postOrganizationAccountsPageExportBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **filter** | **String**|  | [optional]
 **search** | **String**|  | [optional]
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

<a name="putAccount"></a>
# **putAccount**
> Account putAccount(accountId, body)



Replaces the account with information sent in the request body. Any missing fields are deleted unless they are required.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String accountId = "accountId_example"; // String | 
Account body = new Account(); // Account | 
try {
    Account result = apiInstance.putAccount(accountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#putAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **body** | [**Account**](Account.md)|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="putAccountBatch"></a>
# **putAccountBatch**
> putAccountBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.putAccountBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#putAccountBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]
 **callbackURL** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putAccountByExternalReferenceCode"></a>
# **putAccountByExternalReferenceCode**
> Account putAccountByExternalReferenceCode(externalReferenceCode, body)



Replaces the account with information sent in the request body. Any missing fields are deleted unless they are required.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
Account body = new Account(); // Account | 
try {
    Account result = apiInstance.putAccountByExternalReferenceCode(externalReferenceCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#putAccountByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **body** | [**Account**](Account.md)|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

