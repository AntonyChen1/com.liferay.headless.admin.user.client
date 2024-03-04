# WebUrlApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrganizationWebUrlsPage**](WebUrlApi.md#getOrganizationWebUrlsPage) | **GET** /v1.0/organizations/{organizationId}/web-urls | 
[**getUserAccountWebUrlsPage**](WebUrlApi.md#getUserAccountWebUrlsPage) | **GET** /v1.0/user-accounts/{userAccountId}/web-urls | 
[**getWebUrl**](WebUrlApi.md#getWebUrl) | **GET** /v1.0/web-urls/{webUrlId} | 
[**postOrganizationWebUrlsPageExportBatch**](WebUrlApi.md#postOrganizationWebUrlsPageExportBatch) | **POST** /v1.0/organizations/{organizationId}/web-urls/export-batch | 
[**postUserAccountWebUrlsPageExportBatch**](WebUrlApi.md#postUserAccountWebUrlsPageExportBatch) | **POST** /v1.0/user-accounts/{userAccountId}/web-urls/export-batch | 

<a name="getOrganizationWebUrlsPage"></a>
# **getOrganizationWebUrlsPage**
> PageWebUrl getOrganizationWebUrlsPage(organizationId)



Retrieves the organization&#x27;s URLs.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.WebUrlApi;


WebUrlApi apiInstance = new WebUrlApi();
String organizationId = "organizationId_example"; // String | 
try {
    PageWebUrl result = apiInstance.getOrganizationWebUrlsPage(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebUrlApi#getOrganizationWebUrlsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |

### Return type

[**PageWebUrl**](PageWebUrl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserAccountWebUrlsPage"></a>
# **getUserAccountWebUrlsPage**
> PageWebUrl getUserAccountWebUrlsPage(userAccountId)



Retrieves the user&#x27;s URLs.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.WebUrlApi;


WebUrlApi apiInstance = new WebUrlApi();
String userAccountId = "userAccountId_example"; // String | 
try {
    PageWebUrl result = apiInstance.getUserAccountWebUrlsPage(userAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebUrlApi#getUserAccountWebUrlsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**|  |

### Return type

[**PageWebUrl**](PageWebUrl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getWebUrl"></a>
# **getWebUrl**
> WebUrl getWebUrl(webUrlId)



Retrieves the web URL.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.WebUrlApi;


WebUrlApi apiInstance = new WebUrlApi();
String webUrlId = "webUrlId_example"; // String | 
try {
    WebUrl result = apiInstance.getWebUrl(webUrlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebUrlApi#getWebUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webUrlId** | **String**|  |

### Return type

[**WebUrl**](WebUrl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postOrganizationWebUrlsPageExportBatch"></a>
# **postOrganizationWebUrlsPageExportBatch**
> postOrganizationWebUrlsPageExportBatch(organizationId, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.WebUrlApi;


WebUrlApi apiInstance = new WebUrlApi();
String organizationId = "organizationId_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postOrganizationWebUrlsPageExportBatch(organizationId, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling WebUrlApi#postOrganizationWebUrlsPageExportBatch");
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

<a name="postUserAccountWebUrlsPageExportBatch"></a>
# **postUserAccountWebUrlsPageExportBatch**
> postUserAccountWebUrlsPageExportBatch(userAccountId, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.WebUrlApi;


WebUrlApi apiInstance = new WebUrlApi();
String userAccountId = "userAccountId_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postUserAccountWebUrlsPageExportBatch(userAccountId, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling WebUrlApi#postUserAccountWebUrlsPageExportBatch");
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

