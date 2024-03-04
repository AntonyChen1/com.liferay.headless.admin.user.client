# SubscriptionApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMyUserAccountSubscription**](SubscriptionApi.md#deleteMyUserAccountSubscription) | **DELETE** /v1.0/my-user-account/subscriptions/{subscriptionId} | 
[**getMyUserAccountSubscription**](SubscriptionApi.md#getMyUserAccountSubscription) | **GET** /v1.0/my-user-account/subscriptions/{subscriptionId} | 
[**getMyUserAccountSubscriptionsPage**](SubscriptionApi.md#getMyUserAccountSubscriptionsPage) | **GET** /v1.0/my-user-account/subscriptions | 

<a name="deleteMyUserAccountSubscription"></a>
# **deleteMyUserAccountSubscription**
> deleteMyUserAccountSubscription(subscriptionId)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.SubscriptionApi;


SubscriptionApi apiInstance = new SubscriptionApi();
String subscriptionId = "subscriptionId_example"; // String | 
try {
    apiInstance.deleteMyUserAccountSubscription(subscriptionId);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#deleteMyUserAccountSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getMyUserAccountSubscription"></a>
# **getMyUserAccountSubscription**
> Subscription getMyUserAccountSubscription(subscriptionId)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.SubscriptionApi;


SubscriptionApi apiInstance = new SubscriptionApi();
String subscriptionId = "subscriptionId_example"; // String | 
try {
    Subscription result = apiInstance.getMyUserAccountSubscription(subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#getMyUserAccountSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **String**|  |

### Return type

[**Subscription**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getMyUserAccountSubscriptionsPage"></a>
# **getMyUserAccountSubscriptionsPage**
> PageSubscription getMyUserAccountSubscriptionsPage(contentType, page, pageSize)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.SubscriptionApi;


SubscriptionApi apiInstance = new SubscriptionApi();
String contentType = "contentType_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
try {
    PageSubscription result = apiInstance.getMyUserAccountSubscriptionsPage(contentType, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionApi#getMyUserAccountSubscriptionsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]

### Return type

[**PageSubscription**](PageSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

