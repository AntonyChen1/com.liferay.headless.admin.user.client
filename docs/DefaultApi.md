# DefaultApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOpenAPI**](DefaultApi.md#getOpenAPI) | **GET** /v1.0/openapi.{type} | 

<a name="getOpenAPI"></a>
# **getOpenAPI**
> getOpenAPI(type)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String type = "type_example"; // String | 
try {
    apiInstance.getOpenAPI(type);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getOpenAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

