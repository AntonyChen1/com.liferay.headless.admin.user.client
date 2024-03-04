# EmailAddressApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEmailAddress**](EmailAddressApi.md#getEmailAddress) | **GET** /v1.0/email-addresses/{emailAddressId} | 
[**getOrganizationEmailAddressesPage**](EmailAddressApi.md#getOrganizationEmailAddressesPage) | **GET** /v1.0/organizations/{organizationId}/email-addresses | 
[**getUserAccountEmailAddressesPage**](EmailAddressApi.md#getUserAccountEmailAddressesPage) | **GET** /v1.0/user-accounts/{userAccountId}/email-addresses | 
[**postOrganizationEmailAddressesPageExportBatch**](EmailAddressApi.md#postOrganizationEmailAddressesPageExportBatch) | **POST** /v1.0/organizations/{organizationId}/email-addresses/export-batch | 
[**postUserAccountEmailAddressesPageExportBatch**](EmailAddressApi.md#postUserAccountEmailAddressesPageExportBatch) | **POST** /v1.0/user-accounts/{userAccountId}/email-addresses/export-batch | 

<a name="getEmailAddress"></a>
# **getEmailAddress**
> EmailAddress getEmailAddress(emailAddressId)



Retrieves the email address.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.EmailAddressApi;


EmailAddressApi apiInstance = new EmailAddressApi();
String emailAddressId = "emailAddressId_example"; // String | 
try {
    EmailAddress result = apiInstance.getEmailAddress(emailAddressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailAddressApi#getEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddressId** | **String**|  |

### Return type

[**EmailAddress**](EmailAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getOrganizationEmailAddressesPage"></a>
# **getOrganizationEmailAddressesPage**
> PageEmailAddress getOrganizationEmailAddressesPage(organizationId)



Retrieves the organization&#x27;s email addresses.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.EmailAddressApi;


EmailAddressApi apiInstance = new EmailAddressApi();
String organizationId = "organizationId_example"; // String | 
try {
    PageEmailAddress result = apiInstance.getOrganizationEmailAddressesPage(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailAddressApi#getOrganizationEmailAddressesPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |

### Return type

[**PageEmailAddress**](PageEmailAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserAccountEmailAddressesPage"></a>
# **getUserAccountEmailAddressesPage**
> PageEmailAddress getUserAccountEmailAddressesPage(userAccountId)



Retrieves the user&#x27;s email addresses.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.EmailAddressApi;


EmailAddressApi apiInstance = new EmailAddressApi();
String userAccountId = "userAccountId_example"; // String | 
try {
    PageEmailAddress result = apiInstance.getUserAccountEmailAddressesPage(userAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailAddressApi#getUserAccountEmailAddressesPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**|  |

### Return type

[**PageEmailAddress**](PageEmailAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postOrganizationEmailAddressesPageExportBatch"></a>
# **postOrganizationEmailAddressesPageExportBatch**
> postOrganizationEmailAddressesPageExportBatch(organizationId, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.EmailAddressApi;


EmailAddressApi apiInstance = new EmailAddressApi();
String organizationId = "organizationId_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postOrganizationEmailAddressesPageExportBatch(organizationId, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailAddressApi#postOrganizationEmailAddressesPageExportBatch");
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

<a name="postUserAccountEmailAddressesPageExportBatch"></a>
# **postUserAccountEmailAddressesPageExportBatch**
> postUserAccountEmailAddressesPageExportBatch(userAccountId, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.EmailAddressApi;


EmailAddressApi apiInstance = new EmailAddressApi();
String userAccountId = "userAccountId_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postUserAccountEmailAddressesPageExportBatch(userAccountId, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailAddressApi#postUserAccountEmailAddressesPageExportBatch");
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

