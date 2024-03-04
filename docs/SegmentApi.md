# SegmentApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSiteSegmentsPage**](SegmentApi.md#getSiteSegmentsPage) | **GET** /v1.0/sites/{siteId}/segments | 
[**getSiteUserAccountSegmentsPage**](SegmentApi.md#getSiteUserAccountSegmentsPage) | **GET** /v1.0/sites/{siteId}/user-accounts/{userAccountId}/segments | 
[**postSiteSegmentsPageExportBatch**](SegmentApi.md#postSiteSegmentsPageExportBatch) | **POST** /v1.0/sites/{siteId}/segments/export-batch | 

<a name="getSiteSegmentsPage"></a>
# **getSiteSegmentsPage**
> PageSegment getSiteSegmentsPage(siteId, page, pageSize)



Gets a site&#x27;s segments.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.SegmentApi;


SegmentApi apiInstance = new SegmentApi();
String siteId = "siteId_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
try {
    PageSegment result = apiInstance.getSiteSegmentsPage(siteId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentApi#getSiteSegmentsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**|  |
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]

### Return type

[**PageSegment**](PageSegment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getSiteUserAccountSegmentsPage"></a>
# **getSiteUserAccountSegmentsPage**
> PageSegment getSiteUserAccountSegmentsPage(siteId, userAccountId)



Gets a user&#x27;s segments. The set of available headers are: Accept-Language (string), Host (string), User-Agent (string), X-Browser (string), X-Cookies (collection string), X-Device-Brand (string), X-Device-Model (string), X-Device-Screen-Resolution-Height (double), X-Device-Screen-Resolution-Width (double), X-Last-Sign-In-Date-Time (date time) and X-Signed-In (boolean). Local date will be always present in the request.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.SegmentApi;


SegmentApi apiInstance = new SegmentApi();
String siteId = "siteId_example"; // String | 
String userAccountId = "userAccountId_example"; // String | 
try {
    PageSegment result = apiInstance.getSiteUserAccountSegmentsPage(siteId, userAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentApi#getSiteUserAccountSegmentsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**|  |
 **userAccountId** | **String**|  |

### Return type

[**PageSegment**](PageSegment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postSiteSegmentsPageExportBatch"></a>
# **postSiteSegmentsPageExportBatch**
> postSiteSegmentsPageExportBatch(siteId, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.SegmentApi;


SegmentApi apiInstance = new SegmentApi();
String siteId = "siteId_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postSiteSegmentsPageExportBatch(siteId, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentApi#postSiteSegmentsPageExportBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**|  |
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

