# OrganizationApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAccountByExternalReferenceCodeOrganization**](OrganizationApi.md#deleteAccountByExternalReferenceCodeOrganization) | **DELETE** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/organizations/{organizationId} | 
[**deleteAccountOrganization**](OrganizationApi.md#deleteAccountOrganization) | **DELETE** /v1.0/accounts/{accountId}/organizations/{organizationId} | 
[**deleteOrganization**](OrganizationApi.md#deleteOrganization) | **DELETE** /v1.0/organizations/{organizationId} | 
[**deleteOrganizationBatch**](OrganizationApi.md#deleteOrganizationBatch) | **DELETE** /v1.0/organizations/batch | 
[**deleteOrganizationByExternalReferenceCode**](OrganizationApi.md#deleteOrganizationByExternalReferenceCode) | **DELETE** /v1.0/organizations/by-external-reference-code/{externalReferenceCode} | 
[**deleteUserAccountByEmailAddress**](OrganizationApi.md#deleteUserAccountByEmailAddress) | **DELETE** /v1.0/organizations/{organizationId}/user-accounts/by-email-address/{emailAddress} | 
[**deleteUserAccountsByEmailAddress**](OrganizationApi.md#deleteUserAccountsByEmailAddress) | **DELETE** /v1.0/organizations/{organizationId}/user-accounts/by-email-address | 
[**getAccountByExternalReferenceCodeOrganization**](OrganizationApi.md#getAccountByExternalReferenceCodeOrganization) | **GET** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/organizations/{organizationId} | 
[**getAccountByExternalReferenceCodeOrganizationsPage**](OrganizationApi.md#getAccountByExternalReferenceCodeOrganizationsPage) | **GET** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/organizations | 
[**getAccountOrganization**](OrganizationApi.md#getAccountOrganization) | **GET** /v1.0/accounts/{accountId}/organizations/{organizationId} | 
[**getAccountOrganizationsPage**](OrganizationApi.md#getAccountOrganizationsPage) | **GET** /v1.0/accounts/{accountId}/organizations | 
[**getOrganization**](OrganizationApi.md#getOrganization) | **GET** /v1.0/organizations/{organizationId} | 
[**getOrganizationByExternalReferenceCode**](OrganizationApi.md#getOrganizationByExternalReferenceCode) | **GET** /v1.0/organizations/by-external-reference-code/{externalReferenceCode} | 
[**getOrganizationChildOrganizationsPage**](OrganizationApi.md#getOrganizationChildOrganizationsPage) | **GET** /v1.0/organizations/{organizationId}/child-organizations | 
[**getOrganizationOrganizationsPage**](OrganizationApi.md#getOrganizationOrganizationsPage) | **GET** /v1.0/organizations/{parentOrganizationId}/organizations | 
[**getOrganizationsPage**](OrganizationApi.md#getOrganizationsPage) | **GET** /v1.0/organizations | 
[**patchOrganization**](OrganizationApi.md#patchOrganization) | **PATCH** /v1.0/organizations/{organizationId} | 
[**patchOrganizationByExternalReferenceCode**](OrganizationApi.md#patchOrganizationByExternalReferenceCode) | **PATCH** /v1.0/organizations/by-external-reference-code/{externalReferenceCode} | 
[**postAccountByExternalReferenceCodeOrganization**](OrganizationApi.md#postAccountByExternalReferenceCodeOrganization) | **POST** /v1.0/accounts/by-external-reference-code/{externalReferenceCode}/organizations/{organizationId} | 
[**postAccountOrganization**](OrganizationApi.md#postAccountOrganization) | **POST** /v1.0/accounts/{accountId}/organizations/{organizationId} | 
[**postAccountOrganizationsPageExportBatch**](OrganizationApi.md#postAccountOrganizationsPageExportBatch) | **POST** /v1.0/accounts/{accountId}/organizations/export-batch | 
[**postOrganization**](OrganizationApi.md#postOrganization) | **POST** /v1.0/organizations | 
[**postOrganizationBatch**](OrganizationApi.md#postOrganizationBatch) | **POST** /v1.0/organizations/batch | 
[**postOrganizationsPageExportBatch**](OrganizationApi.md#postOrganizationsPageExportBatch) | **POST** /v1.0/organizations/export-batch | 
[**postUserAccountByEmailAddress**](OrganizationApi.md#postUserAccountByEmailAddress) | **POST** /v1.0/organizations/{organizationId}/user-accounts/by-email-address/{emailAddress} | 
[**postUserAccountsByEmailAddress**](OrganizationApi.md#postUserAccountsByEmailAddress) | **POST** /v1.0/organizations/{organizationId}/user-accounts/by-email-address | 
[**putOrganization**](OrganizationApi.md#putOrganization) | **PUT** /v1.0/organizations/{organizationId} | 
[**putOrganizationBatch**](OrganizationApi.md#putOrganizationBatch) | **PUT** /v1.0/organizations/batch | 
[**putOrganizationByExternalReferenceCode**](OrganizationApi.md#putOrganizationByExternalReferenceCode) | **PUT** /v1.0/organizations/by-external-reference-code/{externalReferenceCode} | 

<a name="deleteAccountByExternalReferenceCodeOrganization"></a>
# **deleteAccountByExternalReferenceCodeOrganization**
> deleteAccountByExternalReferenceCodeOrganization(externalReferenceCode, organizationId)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
String organizationId = "organizationId_example"; // String | 
try {
    apiInstance.deleteAccountByExternalReferenceCodeOrganization(externalReferenceCode, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#deleteAccountByExternalReferenceCodeOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **organizationId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteAccountOrganization"></a>
# **deleteAccountOrganization**
> deleteAccountOrganization(accountId, organizationId)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String accountId = "accountId_example"; // String | 
String organizationId = "organizationId_example"; // String | 
try {
    apiInstance.deleteAccountOrganization(accountId, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#deleteAccountOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **organizationId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteOrganization"></a>
# **deleteOrganization**
> deleteOrganization(organizationId)



Deletes an organization.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String organizationId = "organizationId_example"; // String | 
try {
    apiInstance.deleteOrganization(organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#deleteOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteOrganizationBatch"></a>
# **deleteOrganizationBatch**
> deleteOrganizationBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.deleteOrganizationBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#deleteOrganizationBatch");
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

<a name="deleteOrganizationByExternalReferenceCode"></a>
# **deleteOrganizationByExternalReferenceCode**
> deleteOrganizationByExternalReferenceCode(externalReferenceCode)



Deletes an organization.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    apiInstance.deleteOrganizationByExternalReferenceCode(externalReferenceCode);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#deleteOrganizationByExternalReferenceCode");
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

<a name="deleteUserAccountByEmailAddress"></a>
# **deleteUserAccountByEmailAddress**
> deleteUserAccountByEmailAddress(organizationId, emailAddress)



Removes a user from an organization by their email address

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String organizationId = "organizationId_example"; // String | 
String emailAddress = "emailAddress_example"; // String | 
try {
    apiInstance.deleteUserAccountByEmailAddress(organizationId, emailAddress);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#deleteUserAccountByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **emailAddress** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteUserAccountsByEmailAddress"></a>
# **deleteUserAccountsByEmailAddress**
> deleteUserAccountsByEmailAddress(organizationId, body)



Removes users from an organization by their email addresses

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String organizationId = "organizationId_example"; // String | 
List<String> body = Arrays.asList("body_example"); // List<String> | 
try {
    apiInstance.deleteUserAccountsByEmailAddress(organizationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#deleteUserAccountsByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **body** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getAccountByExternalReferenceCodeOrganization"></a>
# **getAccountByExternalReferenceCodeOrganization**
> Organization getAccountByExternalReferenceCodeOrganization(externalReferenceCode, organizationId)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
String organizationId = "organizationId_example"; // String | 
try {
    Organization result = apiInstance.getAccountByExternalReferenceCodeOrganization(externalReferenceCode, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getAccountByExternalReferenceCodeOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **organizationId** | **String**|  |

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountByExternalReferenceCodeOrganizationsPage"></a>
# **getAccountByExternalReferenceCodeOrganizationsPage**
> PageOrganization getAccountByExternalReferenceCodeOrganizationsPage(externalReferenceCode, filter, page, pageSize, search, sort)



Retrieves the account&#x27;s organizations. Results can be paginated, filtered, searched, and sorted.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageOrganization result = apiInstance.getAccountByExternalReferenceCodeOrganizationsPage(externalReferenceCode, filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getAccountByExternalReferenceCodeOrganizationsPage");
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

[**PageOrganization**](PageOrganization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountOrganization"></a>
# **getAccountOrganization**
> Organization getAccountOrganization(accountId, organizationId)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String accountId = "accountId_example"; // String | 
String organizationId = "organizationId_example"; // String | 
try {
    Organization result = apiInstance.getAccountOrganization(accountId, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getAccountOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **organizationId** | **String**|  |

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAccountOrganizationsPage"></a>
# **getAccountOrganizationsPage**
> PageOrganization getAccountOrganizationsPage(accountId, filter, page, pageSize, search, sort)



Retrieves the account&#x27;s organizations. Results can be paginated, filtered, searched, and sorted.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String accountId = "accountId_example"; // String | 
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageOrganization result = apiInstance.getAccountOrganizationsPage(accountId, filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getAccountOrganizationsPage");
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

[**PageOrganization**](PageOrganization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getOrganization"></a>
# **getOrganization**
> Organization getOrganization(organizationId)



Retrieves the organization.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String organizationId = "organizationId_example"; // String | 
try {
    Organization result = apiInstance.getOrganization(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getOrganizationByExternalReferenceCode"></a>
# **getOrganizationByExternalReferenceCode**
> Organization getOrganizationByExternalReferenceCode(externalReferenceCode)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    Organization result = apiInstance.getOrganizationByExternalReferenceCode(externalReferenceCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getOrganizationChildOrganizationsPage"></a>
# **getOrganizationChildOrganizationsPage**
> PageOrganization getOrganizationChildOrganizationsPage(organizationId, flatten, filter, page, pageSize, search, sort)



Retrieves the parent organization&#x27;s child organizations. Results can be paginated, filtered, searched, and sorted.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String organizationId = "organizationId_example"; // String | 
String flatten = "flatten_example"; // String | 
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageOrganization result = apiInstance.getOrganizationChildOrganizationsPage(organizationId, flatten, filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationChildOrganizationsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **flatten** | **String**|  | [optional]
 **filter** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]
 **search** | **String**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**PageOrganization**](PageOrganization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getOrganizationOrganizationsPage"></a>
# **getOrganizationOrganizationsPage**
> PageOrganization getOrganizationOrganizationsPage(parentOrganizationId, flatten, filter, page, pageSize, search, sort)



Retrieves the parent organization&#x27;s child organizations. Results can be paginated, filtered, searched, and sorted.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String parentOrganizationId = "parentOrganizationId_example"; // String | 
String flatten = "flatten_example"; // String | 
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageOrganization result = apiInstance.getOrganizationOrganizationsPage(parentOrganizationId, flatten, filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationOrganizationsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentOrganizationId** | **String**|  |
 **flatten** | **String**|  | [optional]
 **filter** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]
 **search** | **String**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**PageOrganization**](PageOrganization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getOrganizationsPage"></a>
# **getOrganizationsPage**
> PageOrganization getOrganizationsPage(flatten, filter, page, pageSize, search, sort)



Retrieves the organizations. Results can be paginated, filtered, searched, and sorted.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String flatten = "flatten_example"; // String | 
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageOrganization result = apiInstance.getOrganizationsPage(flatten, filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flatten** | **String**|  | [optional]
 **filter** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]
 **search** | **String**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**PageOrganization**](PageOrganization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="patchOrganization"></a>
# **patchOrganization**
> Organization patchOrganization(organizationId, body)



Updates the organization with the information sent in the request body. Fields not present in the request body are left unchanged.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String organizationId = "organizationId_example"; // String | 
Organization body = new Organization(); // Organization | 
try {
    Organization result = apiInstance.patchOrganization(organizationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#patchOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **body** | [**Organization**](Organization.md)|  | [optional]

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="patchOrganizationByExternalReferenceCode"></a>
# **patchOrganizationByExternalReferenceCode**
> Organization patchOrganizationByExternalReferenceCode(externalReferenceCode, body)



Updates the organization with information sent in the request body. Only the provided fields are updated.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
Organization body = new Organization(); // Organization | 
try {
    Organization result = apiInstance.patchOrganizationByExternalReferenceCode(externalReferenceCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#patchOrganizationByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **body** | [**Organization**](Organization.md)|  | [optional]

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postAccountByExternalReferenceCodeOrganization"></a>
# **postAccountByExternalReferenceCodeOrganization**
> postAccountByExternalReferenceCodeOrganization(externalReferenceCode, organizationId)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
String organizationId = "organizationId_example"; // String | 
try {
    apiInstance.postAccountByExternalReferenceCodeOrganization(externalReferenceCode, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#postAccountByExternalReferenceCodeOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **organizationId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postAccountOrganization"></a>
# **postAccountOrganization**
> postAccountOrganization(accountId, organizationId)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String accountId = "accountId_example"; // String | 
String organizationId = "organizationId_example"; // String | 
try {
    apiInstance.postAccountOrganization(accountId, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#postAccountOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **organizationId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postAccountOrganizationsPageExportBatch"></a>
# **postAccountOrganizationsPageExportBatch**
> postAccountOrganizationsPageExportBatch(accountId, filter, search, sort, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String accountId = "accountId_example"; // String | 
String filter = "filter_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postAccountOrganizationsPageExportBatch(accountId, filter, search, sort, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#postAccountOrganizationsPageExportBatch");
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

<a name="postOrganization"></a>
# **postOrganization**
> Organization postOrganization(body)



Creates a new organization

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
Organization body = new Organization(); // Organization | 
try {
    Organization result = apiInstance.postOrganization(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#postOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Organization**](Organization.md)|  | [optional]

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postOrganizationBatch"></a>
# **postOrganizationBatch**
> postOrganizationBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.postOrganizationBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#postOrganizationBatch");
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

<a name="postOrganizationsPageExportBatch"></a>
# **postOrganizationsPageExportBatch**
> postOrganizationsPageExportBatch(filter, search, sort, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String filter = "filter_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postOrganizationsPageExportBatch(filter, search, sort, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#postOrganizationsPageExportBatch");
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

<a name="postUserAccountByEmailAddress"></a>
# **postUserAccountByEmailAddress**
> UserAccount postUserAccountByEmailAddress(organizationId, emailAddress)



Assigns a user to an organization by their email address

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String organizationId = "organizationId_example"; // String | 
String emailAddress = "emailAddress_example"; // String | 
try {
    UserAccount result = apiInstance.postUserAccountByEmailAddress(organizationId, emailAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#postUserAccountByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **emailAddress** | **String**|  |

### Return type

[**UserAccount**](UserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postUserAccountsByEmailAddress"></a>
# **postUserAccountsByEmailAddress**
> PageUserAccount postUserAccountsByEmailAddress(organizationId, body, organizationRoleIds)



Assigns users to an organization by their email addresses

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String organizationId = "organizationId_example"; // String | 
List<String> body = Arrays.asList("body_example"); // List<String> | 
String organizationRoleIds = "organizationRoleIds_example"; // String | 
try {
    PageUserAccount result = apiInstance.postUserAccountsByEmailAddress(organizationId, body, organizationRoleIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#postUserAccountsByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **body** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **organizationRoleIds** | **String**|  | [optional]

### Return type

[**PageUserAccount**](PageUserAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="putOrganization"></a>
# **putOrganization**
> Organization putOrganization(organizationId, body)



Replaces the organization with information sent in the request body. Any missing fields are deleted unless they are required.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String organizationId = "organizationId_example"; // String | 
Organization body = new Organization(); // Organization | 
try {
    Organization result = apiInstance.putOrganization(organizationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#putOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  |
 **body** | [**Organization**](Organization.md)|  | [optional]

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="putOrganizationBatch"></a>
# **putOrganizationBatch**
> putOrganizationBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.putOrganizationBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#putOrganizationBatch");
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

<a name="putOrganizationByExternalReferenceCode"></a>
# **putOrganizationByExternalReferenceCode**
> Organization putOrganizationByExternalReferenceCode(externalReferenceCode, body)



Replaces the organization with information sent in the request body. Any missing fields are deleted unless they are required.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
Organization body = new Organization(); // Organization | 
try {
    Organization result = apiInstance.putOrganizationByExternalReferenceCode(externalReferenceCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#putOrganizationByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **body** | [**Organization**](Organization.md)|  | [optional]

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

