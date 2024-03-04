# AccountGroupApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAccountGroup**](AccountGroupApi.md#deleteAccountGroup) | **DELETE** /v1.0/account-groups/{accountGroupId} | 
[**deleteAccountGroupBatch**](AccountGroupApi.md#deleteAccountGroupBatch) | **DELETE** /v1.0/account-groups/batch | 
[**deleteAccountGroupByExternalReferenceCode**](AccountGroupApi.md#deleteAccountGroupByExternalReferenceCode) | **DELETE** /v1.0/account-groups/by-external-reference-code/{externalReferenceCode} | 
[**deleteAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode**](AccountGroupApi.md#deleteAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode) | **DELETE** /v1.0/account-groups/by-external-reference-code/{accountExternalReferenceCode}/accounts/by-external-reference-code/{externalReferenceCode} | 
[**getAccountAccountGroupsPage**](AccountGroupApi.md#getAccountAccountGroupsPage) | **GET** /v1.0/accounts/{accountId}/account-groups | 
[**getAccountByExternalReferenceCodeAccountExternalReferenceCodeAccountGroupsPage**](AccountGroupApi.md#getAccountByExternalReferenceCodeAccountExternalReferenceCodeAccountGroupsPage) | **GET** /v1.0/accounts/by-external-reference-code/{accountExternalReferenceCode}/account-groups | 
[**getAccountGroup**](AccountGroupApi.md#getAccountGroup) | **GET** /v1.0/account-groups/{accountGroupId} | 
[**getAccountGroupByExternalReferenceCode**](AccountGroupApi.md#getAccountGroupByExternalReferenceCode) | **GET** /v1.0/account-groups/by-external-reference-code/{externalReferenceCode} | 
[**getAccountGroupsPage**](AccountGroupApi.md#getAccountGroupsPage) | **GET** /v1.0/account-groups | 
[**patchAccountGroup**](AccountGroupApi.md#patchAccountGroup) | **PATCH** /v1.0/account-groups/{accountGroupId} | 
[**patchAccountGroupByExternalReferenceCode**](AccountGroupApi.md#patchAccountGroupByExternalReferenceCode) | **PATCH** /v1.0/account-groups/by-external-reference-code/{externalReferenceCode} | 
[**postAccountAccountGroupsPageExportBatch**](AccountGroupApi.md#postAccountAccountGroupsPageExportBatch) | **POST** /v1.0/accounts/{accountId}/account-groups/export-batch | 
[**postAccountGroup**](AccountGroupApi.md#postAccountGroup) | **POST** /v1.0/account-groups | 
[**postAccountGroupBatch**](AccountGroupApi.md#postAccountGroupBatch) | **POST** /v1.0/account-groups/batch | 
[**postAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode**](AccountGroupApi.md#postAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode) | **POST** /v1.0/account-groups/by-external-reference-code/{accountExternalReferenceCode}/accounts/by-external-reference-code/{externalReferenceCode} | 
[**postAccountGroupsPageExportBatch**](AccountGroupApi.md#postAccountGroupsPageExportBatch) | **POST** /v1.0/account-groups/export-batch | 
[**putAccountGroup**](AccountGroupApi.md#putAccountGroup) | **PUT** /v1.0/account-groups/{accountGroupId} | 
[**putAccountGroupBatch**](AccountGroupApi.md#putAccountGroupBatch) | **PUT** /v1.0/account-groups/batch | 
[**putAccountGroupByExternalReferenceCode**](AccountGroupApi.md#putAccountGroupByExternalReferenceCode) | **PUT** /v1.0/account-groups/by-external-reference-code/{externalReferenceCode} | 

<a name="deleteAccountGroup"></a>
# **deleteAccountGroup**
> deleteAccountGroup(accountGroupId)



Deletes an account group.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String accountGroupId = "accountGroupId_example"; // String | 
try {
    apiInstance.deleteAccountGroup(accountGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#deleteAccountGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountGroupId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteAccountGroupBatch"></a>
# **deleteAccountGroupBatch**
> deleteAccountGroupBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.deleteAccountGroupBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#deleteAccountGroupBatch");
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

<a name="deleteAccountGroupByExternalReferenceCode"></a>
# **deleteAccountGroupByExternalReferenceCode**
> deleteAccountGroupByExternalReferenceCode(externalReferenceCode)



Deletes an account group.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    apiInstance.deleteAccountGroupByExternalReferenceCode(externalReferenceCode);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#deleteAccountGroupByExternalReferenceCode");
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

<a name="deleteAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode"></a>
# **deleteAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode**
> deleteAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode)



Removes an account by their external reference code from an account group by external reference code

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String accountExternalReferenceCode = "accountExternalReferenceCode_example"; // String | 
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    apiInstance.deleteAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#deleteAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountExternalReferenceCode** | **String**|  |
 **externalReferenceCode** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountAccountGroupsPage"></a>
# **getAccountAccountGroupsPage**
> PageAccountGroup getAccountAccountGroupsPage(accountId, page, pageSize)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String accountId = "accountId_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
try {
    PageAccountGroup result = apiInstance.getAccountAccountGroupsPage(accountId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#getAccountAccountGroupsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]

### Return type

[**PageAccountGroup**](PageAccountGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountByExternalReferenceCodeAccountExternalReferenceCodeAccountGroupsPage"></a>
# **getAccountByExternalReferenceCodeAccountExternalReferenceCodeAccountGroupsPage**
> PageAccountGroup getAccountByExternalReferenceCodeAccountExternalReferenceCodeAccountGroupsPage(accountExternalReferenceCode, page, pageSize)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String accountExternalReferenceCode = "accountExternalReferenceCode_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
try {
    PageAccountGroup result = apiInstance.getAccountByExternalReferenceCodeAccountExternalReferenceCodeAccountGroupsPage(accountExternalReferenceCode, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#getAccountByExternalReferenceCodeAccountExternalReferenceCodeAccountGroupsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountExternalReferenceCode** | **String**|  |
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]

### Return type

[**PageAccountGroup**](PageAccountGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountGroup"></a>
# **getAccountGroup**
> AccountGroup getAccountGroup(accountGroupId)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String accountGroupId = "accountGroupId_example"; // String | 
try {
    AccountGroup result = apiInstance.getAccountGroup(accountGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#getAccountGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountGroupId** | **String**|  |

### Return type

[**AccountGroup**](AccountGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountGroupByExternalReferenceCode"></a>
# **getAccountGroupByExternalReferenceCode**
> AccountGroup getAccountGroupByExternalReferenceCode(externalReferenceCode)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    AccountGroup result = apiInstance.getAccountGroupByExternalReferenceCode(externalReferenceCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#getAccountGroupByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |

### Return type

[**AccountGroup**](AccountGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountGroupsPage"></a>
# **getAccountGroupsPage**
> PageAccountGroup getAccountGroupsPage(filter, page, pageSize, search, sort)



Retrieves the account groups. Results can be paginated, filtered, searched, and sorted.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageAccountGroup result = apiInstance.getAccountGroupsPage(filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#getAccountGroupsPage");
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

[**PageAccountGroup**](PageAccountGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="patchAccountGroup"></a>
# **patchAccountGroup**
> AccountGroup patchAccountGroup(accountGroupId, body)



Updates the account group with information sent in the request body. Only the provided fields are updated.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String accountGroupId = "accountGroupId_example"; // String | 
AccountGroup body = new AccountGroup(); // AccountGroup | 
try {
    AccountGroup result = apiInstance.patchAccountGroup(accountGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#patchAccountGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountGroupId** | **String**|  |
 **body** | [**AccountGroup**](AccountGroup.md)|  | [optional]

### Return type

[**AccountGroup**](AccountGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="patchAccountGroupByExternalReferenceCode"></a>
# **patchAccountGroupByExternalReferenceCode**
> AccountGroup patchAccountGroupByExternalReferenceCode(externalReferenceCode, body)



Updates the account with information sent in the request body. Only the provided fields are updated.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
AccountGroup body = new AccountGroup(); // AccountGroup | 
try {
    AccountGroup result = apiInstance.patchAccountGroupByExternalReferenceCode(externalReferenceCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#patchAccountGroupByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **body** | [**AccountGroup**](AccountGroup.md)|  | [optional]

### Return type

[**AccountGroup**](AccountGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccountAccountGroupsPageExportBatch"></a>
# **postAccountAccountGroupsPageExportBatch**
> postAccountAccountGroupsPageExportBatch(accountId, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String accountId = "accountId_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postAccountAccountGroupsPageExportBatch(accountId, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#postAccountAccountGroupsPageExportBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
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

<a name="postAccountGroup"></a>
# **postAccountGroup**
> AccountGroup postAccountGroup(body)



Creates a new account group

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
AccountGroup body = new AccountGroup(); // AccountGroup | 
try {
    AccountGroup result = apiInstance.postAccountGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#postAccountGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountGroup**](AccountGroup.md)|  | [optional]

### Return type

[**AccountGroup**](AccountGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccountGroupBatch"></a>
# **postAccountGroupBatch**
> postAccountGroupBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.postAccountGroupBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#postAccountGroupBatch");
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

<a name="postAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode"></a>
# **postAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode**
> postAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode)



Assigns an account by its external reference code to an account group by external reference code

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String accountExternalReferenceCode = "accountExternalReferenceCode_example"; // String | 
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    apiInstance.postAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#postAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountExternalReferenceCode** | **String**|  |
 **externalReferenceCode** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postAccountGroupsPageExportBatch"></a>
# **postAccountGroupsPageExportBatch**
> postAccountGroupsPageExportBatch(filter, search, sort, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String filter = "filter_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postAccountGroupsPageExportBatch(filter, search, sort, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#postAccountGroupsPageExportBatch");
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

<a name="putAccountGroup"></a>
# **putAccountGroup**
> AccountGroup putAccountGroup(accountGroupId, body)



Replaces the account group with information sent in the request body. Any missing fields are deleted unless they are required.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String accountGroupId = "accountGroupId_example"; // String | 
AccountGroup body = new AccountGroup(); // AccountGroup | 
try {
    AccountGroup result = apiInstance.putAccountGroup(accountGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#putAccountGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountGroupId** | **String**|  |
 **body** | [**AccountGroup**](AccountGroup.md)|  | [optional]

### Return type

[**AccountGroup**](AccountGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="putAccountGroupBatch"></a>
# **putAccountGroupBatch**
> putAccountGroupBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.putAccountGroupBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#putAccountGroupBatch");
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

<a name="putAccountGroupByExternalReferenceCode"></a>
# **putAccountGroupByExternalReferenceCode**
> AccountGroup putAccountGroupByExternalReferenceCode(externalReferenceCode, body)



Replaces the account group with information sent in the request body. Any missing fields are deleted unless they are required.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.AccountGroupApi;


AccountGroupApi apiInstance = new AccountGroupApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
AccountGroup body = new AccountGroup(); // AccountGroup | 
try {
    AccountGroup result = apiInstance.putAccountGroupByExternalReferenceCode(externalReferenceCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountGroupApi#putAccountGroupByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **body** | [**AccountGroup**](AccountGroup.md)|  | [optional]

### Return type

[**AccountGroup**](AccountGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

