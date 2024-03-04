# UserAccountApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAccountByExternalReferenceCodeUserAccountByExternalReferenceCode**](UserAccountApi.md#deleteAccountByExternalReferenceCodeUserAccountByExternalReferenceCode) | **DELETE** /v1.0/accounts/by-external-reference-code/{accountExternalReferenceCode}/user-accounts/by-external-reference-code/{externalReferenceCode} | 
[**deleteAccountUserAccount**](UserAccountApi.md#deleteAccountUserAccount) | **DELETE** /v1.0/accounts/{accountId}/user-accounts/{userAccountId} | 
[**deleteAccountUserAccountByEmailAddress**](UserAccountApi.md#deleteAccountUserAccountByEmailAddress) | **DELETE** /v1.0/accounts/{accountId}/user-accounts/by-email-address/{emailAddress} | 
[**deleteAccountUserAccountByExternalReferenceCodeByEmailAddress**](UserAccountApi.md#deleteAccountUserAccountByExternalReferenceCodeByEmailAddress) | **DELETE** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/user-accounts/by-email-address/{emailAddress} | 
[**deleteAccountUserAccountsByEmailAddress**](UserAccountApi.md#deleteAccountUserAccountsByEmailAddress) | **DELETE** /v1.0/accounts/{accountId}/user-accounts/by-email-address | 
[**deleteAccountUserAccountsByExternalReferenceCodeByEmailAddress**](UserAccountApi.md#deleteAccountUserAccountsByExternalReferenceCodeByEmailAddress) | **DELETE** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/user-accounts/by-email-address | 
[**deleteUserAccount**](UserAccountApi.md#deleteUserAccount) | **DELETE** /v1.0/user-accounts/{userAccountId} | 
[**deleteUserAccountBatch**](UserAccountApi.md#deleteUserAccountBatch) | **DELETE** /v1.0/user-accounts/batch | 
[**deleteUserAccountByExternalReferenceCode**](UserAccountApi.md#deleteUserAccountByExternalReferenceCode) | **DELETE** /v1.0/user-accounts/by-external-reference-code/{externalReferenceCode} | 
[**getAccountByExternalReferenceCodeUserAccountByExternalReferenceCode**](UserAccountApi.md#getAccountByExternalReferenceCodeUserAccountByExternalReferenceCode) | **GET** /v1.0/accounts/by-external-reference-code/{accountExternalReferenceCode}/user-accounts/by-external-reference-code/{externalReferenceCode} | 
[**getAccountUserAccount**](UserAccountApi.md#getAccountUserAccount) | **GET** /v1.0/accounts/{accountId}/user-accounts/{userAccountId} | 
[**getAccountUserAccountsByExternalReferenceCodePage**](UserAccountApi.md#getAccountUserAccountsByExternalReferenceCodePage) | **GET** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/user-accounts | 
[**getAccountUserAccountsPage**](UserAccountApi.md#getAccountUserAccountsPage) | **GET** /v1.0/accounts/{accountId}/user-accounts | 
[**getMyUserAccount**](UserAccountApi.md#getMyUserAccount) | **GET** /v1.0/my-user-account | 
[**getOrganizationUserAccountsPage**](UserAccountApi.md#getOrganizationUserAccountsPage) | **GET** /v1.0/organizations/{organizationId}/user-accounts | 
[**getSiteUserAccountsPage**](UserAccountApi.md#getSiteUserAccountsPage) | **GET** /v1.0/sites/{siteId}/user-accounts | 
[**getUserAccount**](UserAccountApi.md#getUserAccount) | **GET** /v1.0/user-accounts/{userAccountId} | 
[**getUserAccountByEmailAddress**](UserAccountApi.md#getUserAccountByEmailAddress) | **GET** /v1.0/user-accounts/by-email-address/{emailAddress} | 
[**getUserAccountByExternalReferenceCode**](UserAccountApi.md#getUserAccountByExternalReferenceCode) | **GET** /v1.0/user-accounts/by-external-reference-code/{externalReferenceCode} | 
[**getUserAccountsByStatusPage**](UserAccountApi.md#getUserAccountsByStatusPage) | **GET** /v1.0/user-accounts/by-status/{status} | 
[**getUserAccountsPage**](UserAccountApi.md#getUserAccountsPage) | **GET** /v1.0/user-accounts | 
[**patchUserAccount**](UserAccountApi.md#patchUserAccount) | **PATCH** /v1.0/user-accounts/{userAccountId} | 
[**postAccountByExternalReferenceCodeUserAccountByExternalReferenceCode**](UserAccountApi.md#postAccountByExternalReferenceCodeUserAccountByExternalReferenceCode) | **POST** /v1.0/accounts/by-external-reference-code/{accountExternalReferenceCode}/user-accounts/by-external-reference-code/{externalReferenceCode} | 
[**postAccountUserAccount**](UserAccountApi.md#postAccountUserAccount) | **POST** /v1.0/accounts/{accountId}/user-accounts | 
[**postAccountUserAccountBatch**](UserAccountApi.md#postAccountUserAccountBatch) | **POST** /v1.0/accounts/{accountId}/user-accounts/batch | 
[**postAccountUserAccountByEmailAddress**](UserAccountApi.md#postAccountUserAccountByEmailAddress) | **POST** /v1.0/accounts/{accountId}/user-accounts/by-email-address/{emailAddress} | 
[**postAccountUserAccountByExternalReferenceCode**](UserAccountApi.md#postAccountUserAccountByExternalReferenceCode) | **POST** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/user-accounts | 
[**postAccountUserAccountByExternalReferenceCodeByEmailAddress**](UserAccountApi.md#postAccountUserAccountByExternalReferenceCodeByEmailAddress) | **POST** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/user-accounts/by-email-address/{emailAddress} | 
[**postAccountUserAccountsByEmailAddress**](UserAccountApi.md#postAccountUserAccountsByEmailAddress) | **POST** /v1.0/accounts/{accountId}/user-accounts/by-email-address | 
[**postAccountUserAccountsByExternalReferenceCodeByEmailAddress**](UserAccountApi.md#postAccountUserAccountsByExternalReferenceCodeByEmailAddress) | **POST** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/user-accounts/by-email-address | 
[**postAccountUserAccountsPageExportBatch**](UserAccountApi.md#postAccountUserAccountsPageExportBatch) | **POST** /v1.0/accounts/{accountId}/user-accounts/export-batch | 
[**postOrganizationUserAccountsPageExportBatch**](UserAccountApi.md#postOrganizationUserAccountsPageExportBatch) | **POST** /v1.0/organizations/{organizationId}/user-accounts/export-batch | 
[**postSiteUserAccountsPageExportBatch**](UserAccountApi.md#postSiteUserAccountsPageExportBatch) | **POST** /v1.0/sites/{siteId}/user-accounts/export-batch | 
[**postUserAccount**](UserAccountApi.md#postUserAccount) | **POST** /v1.0/user-accounts | 
[**postUserAccountBatch**](UserAccountApi.md#postUserAccountBatch) | **POST** /v1.0/user-accounts/batch | 
[**postUserAccountImage**](UserAccountApi.md#postUserAccountImage) | **POST** /v1.0/user-accounts/{userAccountId}/image | 
[**postUserAccountsPageExportBatch**](UserAccountApi.md#postUserAccountsPageExportBatch) | **POST** /v1.0/user-accounts/export-batch | 
[**putUserAccount**](UserAccountApi.md#putUserAccount) | **PUT** /v1.0/user-accounts/{userAccountId} | 
[**putUserAccountBatch**](UserAccountApi.md#putUserAccountBatch) | **PUT** /v1.0/user-accounts/batch | 
[**putUserAccountByExternalReferenceCode**](UserAccountApi.md#putUserAccountByExternalReferenceCode) | **PUT** /v1.0/user-accounts/by-external-reference-code/{externalReferenceCode} | 

<a name="deleteAccountByExternalReferenceCodeUserAccountByExternalReferenceCode"></a>
# **deleteAccountByExternalReferenceCodeUserAccountByExternalReferenceCode**
> deleteAccountByExternalReferenceCodeUserAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode)



Removes a user by their external reference code from an account by external reference code

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String accountExternalReferenceCode = "accountExternalReferenceCode_example"; // String | 
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    apiInstance.deleteAccountByExternalReferenceCodeUserAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#deleteAccountByExternalReferenceCodeUserAccountByExternalReferenceCode");
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

<a name="deleteAccountUserAccount"></a>
# **deleteAccountUserAccount**
> deleteAccountUserAccount(accountId, userAccountId)



Removes a user assigned to an account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String accountId = "accountId_example"; // String | 
String userAccountId = "userAccountId_example"; // String | 
try {
    apiInstance.deleteAccountUserAccount(accountId, userAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#deleteAccountUserAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **userAccountId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteAccountUserAccountByEmailAddress"></a>
# **deleteAccountUserAccountByEmailAddress**
> deleteAccountUserAccountByEmailAddress(accountId, emailAddress)



Removes a user from an account by their email address

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String accountId = "accountId_example"; // String | 
String emailAddress = "emailAddress_example"; // String | 
try {
    apiInstance.deleteAccountUserAccountByEmailAddress(accountId, emailAddress);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#deleteAccountUserAccountByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **emailAddress** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteAccountUserAccountByExternalReferenceCodeByEmailAddress"></a>
# **deleteAccountUserAccountByExternalReferenceCodeByEmailAddress**
> deleteAccountUserAccountByExternalReferenceCodeByEmailAddress(externalReferenceCode, emailAddress)



Removes a user from an account by external reference code by their email address

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
String emailAddress = "emailAddress_example"; // String | 
try {
    apiInstance.deleteAccountUserAccountByExternalReferenceCodeByEmailAddress(externalReferenceCode, emailAddress);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#deleteAccountUserAccountByExternalReferenceCodeByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **emailAddress** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteAccountUserAccountsByEmailAddress"></a>
# **deleteAccountUserAccountsByEmailAddress**
> deleteAccountUserAccountsByEmailAddress(accountId, body)



Removes users from an account by their email addresses

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String accountId = "accountId_example"; // String | 
List<String> body = Arrays.asList("body_example"); // List<String> | 
try {
    apiInstance.deleteAccountUserAccountsByEmailAddress(accountId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#deleteAccountUserAccountsByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **body** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteAccountUserAccountsByExternalReferenceCodeByEmailAddress"></a>
# **deleteAccountUserAccountsByExternalReferenceCodeByEmailAddress**
> deleteAccountUserAccountsByExternalReferenceCodeByEmailAddress(externalReferenceCode, body)



Removes users from an account by their email addresses

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
List<String> body = Arrays.asList("body_example"); // List<String> | 
try {
    apiInstance.deleteAccountUserAccountsByExternalReferenceCodeByEmailAddress(externalReferenceCode, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#deleteAccountUserAccountsByExternalReferenceCodeByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **body** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteUserAccount"></a>
# **deleteUserAccount**
> deleteUserAccount(userAccountId)



Deletes the user account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String userAccountId = "userAccountId_example"; // String | 
try {
    apiInstance.deleteUserAccount(userAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#deleteUserAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteUserAccountBatch"></a>
# **deleteUserAccountBatch**
> deleteUserAccountBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.deleteUserAccountBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#deleteUserAccountBatch");
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

<a name="deleteUserAccountByExternalReferenceCode"></a>
# **deleteUserAccountByExternalReferenceCode**
> deleteUserAccountByExternalReferenceCode(externalReferenceCode)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    apiInstance.deleteUserAccountByExternalReferenceCode(externalReferenceCode);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#deleteUserAccountByExternalReferenceCode");
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

<a name="getAccountByExternalReferenceCodeUserAccountByExternalReferenceCode"></a>
# **getAccountByExternalReferenceCodeUserAccountByExternalReferenceCode**
> UserAccount getAccountByExternalReferenceCodeUserAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode)



Gets a user by their external reference code to an account by external reference code

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String accountExternalReferenceCode = "accountExternalReferenceCode_example"; // String | 
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    UserAccount result = apiInstance.getAccountByExternalReferenceCodeUserAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#getAccountByExternalReferenceCodeUserAccountByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountExternalReferenceCode** | **String**|  |
 **externalReferenceCode** | **String**|  |

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountUserAccount"></a>
# **getAccountUserAccount**
> UserAccount getAccountUserAccount(accountId, userAccountId)



Gets a user assigned to an account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String accountId = "accountId_example"; // String | 
String userAccountId = "userAccountId_example"; // String | 
try {
    UserAccount result = apiInstance.getAccountUserAccount(accountId, userAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#getAccountUserAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **userAccountId** | **String**|  |

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountUserAccountsByExternalReferenceCodePage"></a>
# **getAccountUserAccountsByExternalReferenceCodePage**
> PageUserAccount getAccountUserAccountsByExternalReferenceCodePage(externalReferenceCode, filter, page, pageSize, search, sort)



Gets the users assigned to an account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageUserAccount result = apiInstance.getAccountUserAccountsByExternalReferenceCodePage(externalReferenceCode, filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#getAccountUserAccountsByExternalReferenceCodePage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **filter** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]
 **search** | **String**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**PageUserAccount**](PageUserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountUserAccountsPage"></a>
# **getAccountUserAccountsPage**
> PageUserAccount getAccountUserAccountsPage(accountId, filter, page, pageSize, search, sort)



Gets the users assigned to an account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String accountId = "accountId_example"; // String | 
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageUserAccount result = apiInstance.getAccountUserAccountsPage(accountId, filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#getAccountUserAccountsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **filter** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]
 **search** | **String**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**PageUserAccount**](PageUserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getMyUserAccount"></a>
# **getMyUserAccount**
> UserAccount getMyUserAccount()



Retrieves information about the user who made the request.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
try {
    UserAccount result = apiInstance.getMyUserAccount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#getMyUserAccount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getOrganizationUserAccountsPage"></a>
# **getOrganizationUserAccountsPage**
> PageUserAccount getOrganizationUserAccountsPage(organizationId, filter, page, pageSize, search, sort)



Retrieves the organization&#x27;s members (users). Results can be paginated, filtered, searched, and sorted.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String organizationId = "organizationId_example"; // String | 
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageUserAccount result = apiInstance.getOrganizationUserAccountsPage(organizationId, filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#getOrganizationUserAccountsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **filter** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]
 **search** | **String**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**PageUserAccount**](PageUserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getSiteUserAccountsPage"></a>
# **getSiteUserAccountsPage**
> PageUserAccount getSiteUserAccountsPage(siteId, filter, page, pageSize, search, sort)



Retrieves the site members&#x27; user accounts. Results can be paginated, filtered, searched, and sorted.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String siteId = "siteId_example"; // String | 
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageUserAccount result = apiInstance.getSiteUserAccountsPage(siteId, filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#getSiteUserAccountsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**|  |
 **filter** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]
 **search** | **String**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**PageUserAccount**](PageUserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserAccount"></a>
# **getUserAccount**
> UserAccount getUserAccount(userAccountId)



Retrieves the user account.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String userAccountId = "userAccountId_example"; // String | 
try {
    UserAccount result = apiInstance.getUserAccount(userAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#getUserAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**|  |

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserAccountByEmailAddress"></a>
# **getUserAccountByEmailAddress**
> UserAccount getUserAccountByEmailAddress(emailAddress)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String emailAddress = "emailAddress_example"; // String | 
try {
    UserAccount result = apiInstance.getUserAccountByEmailAddress(emailAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#getUserAccountByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddress** | **String**|  |

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserAccountByExternalReferenceCode"></a>
# **getUserAccountByExternalReferenceCode**
> UserAccount getUserAccountByExternalReferenceCode(externalReferenceCode)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    UserAccount result = apiInstance.getUserAccountByExternalReferenceCode(externalReferenceCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#getUserAccountByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserAccountsByStatusPage"></a>
# **getUserAccountsByStatusPage**
> PageUserAccount getUserAccountsByStatusPage(status, filter, page, pageSize, search, sort)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String status = "status_example"; // String | 
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageUserAccount result = apiInstance.getUserAccountsByStatusPage(status, filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#getUserAccountsByStatusPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**|  |
 **filter** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]
 **search** | **String**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**PageUserAccount**](PageUserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserAccountsPage"></a>
# **getUserAccountsPage**
> PageUserAccount getUserAccountsPage(filter, page, pageSize, search, sort)



Retrieves the user accounts. Results can be paginated, filtered, searched, and sorted.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageUserAccount result = apiInstance.getUserAccountsPage(filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#getUserAccountsPage");
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

[**PageUserAccount**](PageUserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="patchUserAccount"></a>
# **patchUserAccount**
> UserAccount patchUserAccount(userAccountId, body)



Updates the user account with information sent in the request body. Only the provided fields are updated.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String userAccountId = "userAccountId_example"; // String | 
UserAccount body = new UserAccount(); // UserAccount | 
try {
    UserAccount result = apiInstance.patchUserAccount(userAccountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#patchUserAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**|  |
 **body** | [**UserAccount**](UserAccount.md)|  | [optional]

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccountByExternalReferenceCodeUserAccountByExternalReferenceCode"></a>
# **postAccountByExternalReferenceCodeUserAccountByExternalReferenceCode**
> postAccountByExternalReferenceCodeUserAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode)



Assigns a user by their external reference code to an account by external reference code

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String accountExternalReferenceCode = "accountExternalReferenceCode_example"; // String | 
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    apiInstance.postAccountByExternalReferenceCodeUserAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postAccountByExternalReferenceCodeUserAccountByExternalReferenceCode");
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

<a name="postAccountUserAccount"></a>
# **postAccountUserAccount**
> UserAccount postAccountUserAccount(accountId, body)



Creates a user and assigns them to the account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String accountId = "accountId_example"; // String | 
UserAccount body = new UserAccount(); // UserAccount | 
try {
    UserAccount result = apiInstance.postAccountUserAccount(accountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postAccountUserAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **body** | [**UserAccount**](UserAccount.md)|  | [optional]

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccountUserAccountBatch"></a>
# **postAccountUserAccountBatch**
> postAccountUserAccountBatch(accountId, body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String accountId = "accountId_example"; // String | 
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.postAccountUserAccountBatch(accountId, body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postAccountUserAccountBatch");
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

<a name="postAccountUserAccountByEmailAddress"></a>
# **postAccountUserAccountByEmailAddress**
> UserAccount postAccountUserAccountByEmailAddress(accountId, emailAddress)



Assigns a user to an account by their email address

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String accountId = "accountId_example"; // String | 
String emailAddress = "emailAddress_example"; // String | 
try {
    UserAccount result = apiInstance.postAccountUserAccountByEmailAddress(accountId, emailAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postAccountUserAccountByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **emailAddress** | **String**|  |

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postAccountUserAccountByExternalReferenceCode"></a>
# **postAccountUserAccountByExternalReferenceCode**
> UserAccount postAccountUserAccountByExternalReferenceCode(externalReferenceCode, body)



Creates a user and assigns them to the account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
UserAccount body = new UserAccount(); // UserAccount | 
try {
    UserAccount result = apiInstance.postAccountUserAccountByExternalReferenceCode(externalReferenceCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postAccountUserAccountByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **body** | [**UserAccount**](UserAccount.md)|  | [optional]

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccountUserAccountByExternalReferenceCodeByEmailAddress"></a>
# **postAccountUserAccountByExternalReferenceCodeByEmailAddress**
> postAccountUserAccountByExternalReferenceCodeByEmailAddress(externalReferenceCode, emailAddress)



Assigns a user to an account by external reference code by their email address

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
String emailAddress = "emailAddress_example"; // String | 
try {
    apiInstance.postAccountUserAccountByExternalReferenceCodeByEmailAddress(externalReferenceCode, emailAddress);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postAccountUserAccountByExternalReferenceCodeByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **emailAddress** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postAccountUserAccountsByEmailAddress"></a>
# **postAccountUserAccountsByEmailAddress**
> PageUserAccount postAccountUserAccountsByEmailAddress(accountId, body, accountRoleIds)



Assigns users to an account by their email addresses

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String accountId = "accountId_example"; // String | 
List<String> body = Arrays.asList("body_example"); // List<String> | 
String accountRoleIds = "accountRoleIds_example"; // String | 
try {
    PageUserAccount result = apiInstance.postAccountUserAccountsByEmailAddress(accountId, body, accountRoleIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postAccountUserAccountsByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **body** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **accountRoleIds** | **String**|  | [optional]

### Return type

[**PageUserAccount**](PageUserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccountUserAccountsByExternalReferenceCodeByEmailAddress"></a>
# **postAccountUserAccountsByExternalReferenceCodeByEmailAddress**
> postAccountUserAccountsByExternalReferenceCodeByEmailAddress(externalReferenceCode, body)



Assigns users to an account by their email addresses

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
List<String> body = Arrays.asList("body_example"); // List<String> | 
try {
    apiInstance.postAccountUserAccountsByExternalReferenceCodeByEmailAddress(externalReferenceCode, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postAccountUserAccountsByExternalReferenceCodeByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **body** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccountUserAccountsPageExportBatch"></a>
# **postAccountUserAccountsPageExportBatch**
> postAccountUserAccountsPageExportBatch(accountId, filter, search, sort, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String accountId = "accountId_example"; // String | 
String filter = "filter_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postAccountUserAccountsPageExportBatch(accountId, filter, search, sort, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postAccountUserAccountsPageExportBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
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

<a name="postOrganizationUserAccountsPageExportBatch"></a>
# **postOrganizationUserAccountsPageExportBatch**
> postOrganizationUserAccountsPageExportBatch(organizationId, filter, search, sort, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String organizationId = "organizationId_example"; // String | 
String filter = "filter_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postOrganizationUserAccountsPageExportBatch(organizationId, filter, search, sort, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postOrganizationUserAccountsPageExportBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
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

<a name="postSiteUserAccountsPageExportBatch"></a>
# **postSiteUserAccountsPageExportBatch**
> postSiteUserAccountsPageExportBatch(siteId, filter, search, sort, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String siteId = "siteId_example"; // String | 
String filter = "filter_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postSiteUserAccountsPageExportBatch(siteId, filter, search, sort, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postSiteUserAccountsPageExportBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**|  |
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

<a name="postUserAccount"></a>
# **postUserAccount**
> UserAccount postUserAccount(body)



Creates a new user account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
UserAccount body = new UserAccount(); // UserAccount | 
try {
    UserAccount result = apiInstance.postUserAccount(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postUserAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserAccount**](UserAccount.md)|  | [optional]

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postUserAccountBatch"></a>
# **postUserAccountBatch**
> postUserAccountBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.postUserAccountBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postUserAccountBatch");
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

<a name="postUserAccountImage"></a>
# **postUserAccountImage**
> postUserAccountImage(userAccountId, values)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String userAccountId = "userAccountId_example"; // String | 
Map<String, String> values = new HashMap(); // Map<String, String> | 
try {
    apiInstance.postUserAccountImage(userAccountId, values);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postUserAccountImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**|  |
 **values** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="postUserAccountsPageExportBatch"></a>
# **postUserAccountsPageExportBatch**
> postUserAccountsPageExportBatch(filter, search, sort, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String filter = "filter_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postUserAccountsPageExportBatch(filter, search, sort, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#postUserAccountsPageExportBatch");
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

<a name="putUserAccount"></a>
# **putUserAccount**
> UserAccount putUserAccount(userAccountId, body)



Replaces the user account with information sent in the request body. Any missing fields are deleted unless they are required.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String userAccountId = "userAccountId_example"; // String | 
UserAccount body = new UserAccount(); // UserAccount | 
try {
    UserAccount result = apiInstance.putUserAccount(userAccountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#putUserAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**|  |
 **body** | [**UserAccount**](UserAccount.md)|  | [optional]

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="putUserAccountBatch"></a>
# **putUserAccountBatch**
> putUserAccountBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.putUserAccountBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#putUserAccountBatch");
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

<a name="putUserAccountByExternalReferenceCode"></a>
# **putUserAccountByExternalReferenceCode**
> UserAccount putUserAccountByExternalReferenceCode(externalReferenceCode, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserAccountApi;


UserAccountApi apiInstance = new UserAccountApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
UserAccount body = new UserAccount(); // UserAccount | 
try {
    UserAccount result = apiInstance.putUserAccountByExternalReferenceCode(externalReferenceCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#putUserAccountByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **body** | [**UserAccount**](UserAccount.md)|  | [optional]

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

