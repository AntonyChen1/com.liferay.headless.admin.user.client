# PostalAddressApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePostalAddress**](PostalAddressApi.md#deletePostalAddress) | **DELETE** /v1.0/postal-addresses/{postalAddressId} | 
[**deletePostalAddressBatch**](PostalAddressApi.md#deletePostalAddressBatch) | **DELETE** /v1.0/postal-addresses/batch | 
[**getAccountPostalAddressesPage**](PostalAddressApi.md#getAccountPostalAddressesPage) | **GET** /v1.0/accounts/{accountId}/postal-addresses | 
[**getOrganizationPostalAddressesPage**](PostalAddressApi.md#getOrganizationPostalAddressesPage) | **GET** /v1.0/organizations/{organizationId}/postal-addresses | 
[**getPostalAddress**](PostalAddressApi.md#getPostalAddress) | **GET** /v1.0/postal-addresses/{postalAddressId} | 
[**getUserAccountPostalAddressesPage**](PostalAddressApi.md#getUserAccountPostalAddressesPage) | **GET** /v1.0/user-accounts/{userAccountId}/postal-addresses | 
[**patchPostalAddress**](PostalAddressApi.md#patchPostalAddress) | **PATCH** /v1.0/postal-addresses/{postalAddressId} | 
[**postAccountPostalAddress**](PostalAddressApi.md#postAccountPostalAddress) | **POST** /v1.0/accounts/{accountId}/postal-addresses | 
[**postAccountPostalAddressBatch**](PostalAddressApi.md#postAccountPostalAddressBatch) | **POST** /v1.0/accounts/{accountId}/postal-addresses/batch | 
[**postAccountPostalAddressesPageExportBatch**](PostalAddressApi.md#postAccountPostalAddressesPageExportBatch) | **POST** /v1.0/accounts/{accountId}/postal-addresses/export-batch | 
[**postOrganizationPostalAddressesPageExportBatch**](PostalAddressApi.md#postOrganizationPostalAddressesPageExportBatch) | **POST** /v1.0/organizations/{organizationId}/postal-addresses/export-batch | 
[**postUserAccountPostalAddressesPageExportBatch**](PostalAddressApi.md#postUserAccountPostalAddressesPageExportBatch) | **POST** /v1.0/user-accounts/{userAccountId}/postal-addresses/export-batch | 
[**putPostalAddress**](PostalAddressApi.md#putPostalAddress) | **PUT** /v1.0/postal-addresses/{postalAddressId} | 
[**putPostalAddressBatch**](PostalAddressApi.md#putPostalAddressBatch) | **PUT** /v1.0/postal-addresses/batch | 

<a name="deletePostalAddress"></a>
# **deletePostalAddress**
> deletePostalAddress(postalAddressId)



Deletes the postal address

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
String postalAddressId = "postalAddressId_example"; // String | 
try {
    apiInstance.deletePostalAddress(postalAddressId);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#deletePostalAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postalAddressId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deletePostalAddressBatch"></a>
# **deletePostalAddressBatch**
> deletePostalAddressBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.deletePostalAddressBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#deletePostalAddressBatch");
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

<a name="getAccountPostalAddressesPage"></a>
# **getAccountPostalAddressesPage**
> PagePostalAddress getAccountPostalAddressesPage(accountId)



Retrieves the account&#x27;s postal addresses.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
String accountId = "accountId_example"; // String | 
try {
    PagePostalAddress result = apiInstance.getAccountPostalAddressesPage(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#getAccountPostalAddressesPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |

### Return type

[**PagePostalAddress**](PagePostalAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getOrganizationPostalAddressesPage"></a>
# **getOrganizationPostalAddressesPage**
> PagePostalAddress getOrganizationPostalAddressesPage(organizationId)



Retrieves the organization&#x27;s postal addresses.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
String organizationId = "organizationId_example"; // String | 
try {
    PagePostalAddress result = apiInstance.getOrganizationPostalAddressesPage(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#getOrganizationPostalAddressesPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |

### Return type

[**PagePostalAddress**](PagePostalAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPostalAddress"></a>
# **getPostalAddress**
> PostalAddress getPostalAddress(postalAddressId)



Retrieves the postal address.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
String postalAddressId = "postalAddressId_example"; // String | 
try {
    PostalAddress result = apiInstance.getPostalAddress(postalAddressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#getPostalAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postalAddressId** | **String**|  |

### Return type

[**PostalAddress**](PostalAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserAccountPostalAddressesPage"></a>
# **getUserAccountPostalAddressesPage**
> PagePostalAddress getUserAccountPostalAddressesPage(userAccountId)



Retrieves the user&#x27;s postal addresses.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
String userAccountId = "userAccountId_example"; // String | 
try {
    PagePostalAddress result = apiInstance.getUserAccountPostalAddressesPage(userAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#getUserAccountPostalAddressesPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**|  |

### Return type

[**PagePostalAddress**](PagePostalAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="patchPostalAddress"></a>
# **patchPostalAddress**
> PostalAddress patchPostalAddress(postalAddressId, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
String postalAddressId = "postalAddressId_example"; // String | 
PostalAddress body = new PostalAddress(); // PostalAddress | 
try {
    PostalAddress result = apiInstance.patchPostalAddress(postalAddressId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#patchPostalAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postalAddressId** | **String**|  |
 **body** | [**PostalAddress**](PostalAddress.md)|  | [optional]

### Return type

[**PostalAddress**](PostalAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccountPostalAddress"></a>
# **postAccountPostalAddress**
> PostalAddress postAccountPostalAddress(accountId, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
String accountId = "accountId_example"; // String | 
PostalAddress body = new PostalAddress(); // PostalAddress | 
try {
    PostalAddress result = apiInstance.postAccountPostalAddress(accountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#postAccountPostalAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **body** | [**PostalAddress**](PostalAddress.md)|  | [optional]

### Return type

[**PostalAddress**](PostalAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccountPostalAddressBatch"></a>
# **postAccountPostalAddressBatch**
> postAccountPostalAddressBatch(accountId, body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
String accountId = "accountId_example"; // String | 
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.postAccountPostalAddressBatch(accountId, body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#postAccountPostalAddressBatch");
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

<a name="postAccountPostalAddressesPageExportBatch"></a>
# **postAccountPostalAddressesPageExportBatch**
> postAccountPostalAddressesPageExportBatch(accountId, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
String accountId = "accountId_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postAccountPostalAddressesPageExportBatch(accountId, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#postAccountPostalAddressesPageExportBatch");
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

<a name="postOrganizationPostalAddressesPageExportBatch"></a>
# **postOrganizationPostalAddressesPageExportBatch**
> postOrganizationPostalAddressesPageExportBatch(organizationId, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
String organizationId = "organizationId_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postOrganizationPostalAddressesPageExportBatch(organizationId, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#postOrganizationPostalAddressesPageExportBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
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

<a name="postUserAccountPostalAddressesPageExportBatch"></a>
# **postUserAccountPostalAddressesPageExportBatch**
> postUserAccountPostalAddressesPageExportBatch(userAccountId, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
String userAccountId = "userAccountId_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postUserAccountPostalAddressesPageExportBatch(userAccountId, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#postUserAccountPostalAddressesPageExportBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**|  |
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

<a name="putPostalAddress"></a>
# **putPostalAddress**
> PostalAddress putPostalAddress(postalAddressId, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
String postalAddressId = "postalAddressId_example"; // String | 
PostalAddress body = new PostalAddress(); // PostalAddress | 
try {
    PostalAddress result = apiInstance.putPostalAddress(postalAddressId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#putPostalAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postalAddressId** | **String**|  |
 **body** | [**PostalAddress**](PostalAddress.md)|  | [optional]

### Return type

[**PostalAddress**](PostalAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="putPostalAddressBatch"></a>
# **putPostalAddressBatch**
> putPostalAddressBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PostalAddressApi;


PostalAddressApi apiInstance = new PostalAddressApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.putPostalAddressBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalAddressApi#putPostalAddressBatch");
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

