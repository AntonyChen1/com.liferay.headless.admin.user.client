# SegmentUserApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSegmentUserAccountsPage**](SegmentUserApi.md#getSegmentUserAccountsPage) | **GET** /v1.0/segments/{segmentId}/user-accounts | 

<a name="getSegmentUserAccountsPage"></a>
# **getSegmentUserAccountsPage**
> PageSegmentUser getSegmentUserAccountsPage(segmentId, page, pageSize)



Gets a segment&#x27;s users.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.SegmentUserApi;


SegmentUserApi apiInstance = new SegmentUserApi();
String segmentId = "segmentId_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
try {
    PageSegmentUser result = apiInstance.getSegmentUserAccountsPage(segmentId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentUserApi#getSegmentUserAccountsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **segmentId** | **String**|  |
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]

### Return type

[**PageSegmentUser**](PageSegmentUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

