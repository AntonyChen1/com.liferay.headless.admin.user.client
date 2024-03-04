# SiteApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMyUserAccountSitesPage**](SiteApi.md#getMyUserAccountSitesPage) | **GET** /v1.0/my-user-account/sites | 
[**getSite**](SiteApi.md#getSite) | **GET** /v1.0/sites/{siteId} | 
[**getSiteByFriendlyUrlPath**](SiteApi.md#getSiteByFriendlyUrlPath) | **GET** /v1.0/sites/by-friendly-url-path/{friendlyUrlPath} | 

<a name="getMyUserAccountSitesPage"></a>
# **getMyUserAccountSitesPage**
> PageSite getMyUserAccountSitesPage(page, pageSize)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.SiteApi;


SiteApi apiInstance = new SiteApi();
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
try {
    PageSite result = apiInstance.getMyUserAccountSitesPage(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteApi#getMyUserAccountSitesPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]

### Return type

[**PageSite**](PageSite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getSite"></a>
# **getSite**
> Site getSite(siteId)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.SiteApi;


SiteApi apiInstance = new SiteApi();
String siteId = "siteId_example"; // String | 
try {
    Site result = apiInstance.getSite(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteApi#getSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**|  |

### Return type

[**Site**](Site.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getSiteByFriendlyUrlPath"></a>
# **getSiteByFriendlyUrlPath**
> Site getSiteByFriendlyUrlPath(friendlyUrlPath)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.SiteApi;


SiteApi apiInstance = new SiteApi();
String friendlyUrlPath = "friendlyUrlPath_example"; // String | 
try {
    Site result = apiInstance.getSiteByFriendlyUrlPath(friendlyUrlPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteApi#getSiteByFriendlyUrlPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **friendlyUrlPath** | **String**|  |

### Return type

[**Site**](Site.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

