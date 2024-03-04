# PhoneApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrganizationPhonesPage**](PhoneApi.md#getOrganizationPhonesPage) | **GET** /v1.0/organizations/{organizationId}/phones | 
[**getPhone**](PhoneApi.md#getPhone) | **GET** /v1.0/phones/{phoneId} | 
[**getUserAccountPhonesPage**](PhoneApi.md#getUserAccountPhonesPage) | **GET** /v1.0/user-accounts/{userAccountId}/phones | 
[**postOrganizationPhonesPageExportBatch**](PhoneApi.md#postOrganizationPhonesPageExportBatch) | **POST** /v1.0/organizations/{organizationId}/phones/export-batch | 
[**postUserAccountPhonesPageExportBatch**](PhoneApi.md#postUserAccountPhonesPageExportBatch) | **POST** /v1.0/user-accounts/{userAccountId}/phones/export-batch | 

<a name="getOrganizationPhonesPage"></a>
# **getOrganizationPhonesPage**
> PagePhone getOrganizationPhonesPage(organizationId)



Retrieves the organization&#x27;s phone numbers.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PhoneApi;


PhoneApi apiInstance = new PhoneApi();
String organizationId = "organizationId_example"; // String | 
try {
    PagePhone result = apiInstance.getOrganizationPhonesPage(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneApi#getOrganizationPhonesPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |

### Return type

[**PagePhone**](PagePhone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPhone"></a>
# **getPhone**
> Phone getPhone(phoneId)



Retrieves the phone number.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PhoneApi;


PhoneApi apiInstance = new PhoneApi();
String phoneId = "phoneId_example"; // String | 
try {
    Phone result = apiInstance.getPhone(phoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneApi#getPhone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneId** | **String**|  |

### Return type

[**Phone**](Phone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserAccountPhonesPage"></a>
# **getUserAccountPhonesPage**
> PagePhone getUserAccountPhonesPage(userAccountId)



Retrieves the user&#x27;s phone numbers.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PhoneApi;


PhoneApi apiInstance = new PhoneApi();
String userAccountId = "userAccountId_example"; // String | 
try {
    PagePhone result = apiInstance.getUserAccountPhonesPage(userAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneApi#getUserAccountPhonesPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**|  |

### Return type

[**PagePhone**](PagePhone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postOrganizationPhonesPageExportBatch"></a>
# **postOrganizationPhonesPageExportBatch**
> postOrganizationPhonesPageExportBatch(organizationId, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PhoneApi;


PhoneApi apiInstance = new PhoneApi();
String organizationId = "organizationId_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postOrganizationPhonesPageExportBatch(organizationId, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneApi#postOrganizationPhonesPageExportBatch");
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

<a name="postUserAccountPhonesPageExportBatch"></a>
# **postUserAccountPhonesPageExportBatch**
> postUserAccountPhonesPageExportBatch(userAccountId, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.PhoneApi;


PhoneApi apiInstance = new PhoneApi();
String userAccountId = "userAccountId_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postUserAccountPhonesPageExportBatch(userAccountId, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneApi#postUserAccountPhonesPageExportBatch");
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

