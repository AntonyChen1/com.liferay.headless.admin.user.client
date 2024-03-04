# RoleApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrganizationRoleUserAccountAssociation**](RoleApi.md#deleteOrganizationRoleUserAccountAssociation) | **DELETE** /v1.0/roles/{roleId}/association/user-account/{userAccountId}/organization/{organizationId} | 
[**deleteRoleUserAccountAssociation**](RoleApi.md#deleteRoleUserAccountAssociation) | **DELETE** /v1.0/roles/{roleId}/association/user-account/{userAccountId} | 
[**deleteSiteRoleUserAccountAssociation**](RoleApi.md#deleteSiteRoleUserAccountAssociation) | **DELETE** /v1.0/roles/{roleId}/association/user-account/{userAccountId}/site/{siteId} | 
[**getRole**](RoleApi.md#getRole) | **GET** /v1.0/roles/{roleId} | 
[**getRolesPage**](RoleApi.md#getRolesPage) | **GET** /v1.0/roles | 
[**postOrganizationRoleUserAccountAssociation**](RoleApi.md#postOrganizationRoleUserAccountAssociation) | **POST** /v1.0/roles/{roleId}/association/user-account/{userAccountId}/organization/{organizationId} | 
[**postRoleUserAccountAssociation**](RoleApi.md#postRoleUserAccountAssociation) | **POST** /v1.0/roles/{roleId}/association/user-account/{userAccountId} | 
[**postRolesPageExportBatch**](RoleApi.md#postRolesPageExportBatch) | **POST** /v1.0/roles/export-batch | 
[**postSiteRoleUserAccountAssociation**](RoleApi.md#postSiteRoleUserAccountAssociation) | **POST** /v1.0/roles/{roleId}/association/user-account/{userAccountId}/site/{siteId} | 

<a name="deleteOrganizationRoleUserAccountAssociation"></a>
# **deleteOrganizationRoleUserAccountAssociation**
> deleteOrganizationRoleUserAccountAssociation(roleId, userAccountId, organizationId)



Unassociates an organization role with a user account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String roleId = "roleId_example"; // String | 
String userAccountId = "userAccountId_example"; // String | 
String organizationId = "organizationId_example"; // String | 
try {
    apiInstance.deleteOrganizationRoleUserAccountAssociation(roleId, userAccountId, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#deleteOrganizationRoleUserAccountAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**|  |
 **userAccountId** | **String**|  |
 **organizationId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteRoleUserAccountAssociation"></a>
# **deleteRoleUserAccountAssociation**
> deleteRoleUserAccountAssociation(roleId, userAccountId)



Unassociates a role with a user account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String roleId = "roleId_example"; // String | 
String userAccountId = "userAccountId_example"; // String | 
try {
    apiInstance.deleteRoleUserAccountAssociation(roleId, userAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#deleteRoleUserAccountAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**|  |
 **userAccountId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteSiteRoleUserAccountAssociation"></a>
# **deleteSiteRoleUserAccountAssociation**
> deleteSiteRoleUserAccountAssociation(roleId, userAccountId, siteId)



Unassociates a site role with a user account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String roleId = "roleId_example"; // String | 
String userAccountId = "userAccountId_example"; // String | 
String siteId = "siteId_example"; // String | 
try {
    apiInstance.deleteSiteRoleUserAccountAssociation(roleId, userAccountId, siteId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#deleteSiteRoleUserAccountAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**|  |
 **userAccountId** | **String**|  |
 **siteId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getRole"></a>
# **getRole**
> Role getRole(roleId)



Retrieves the role.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String roleId = "roleId_example"; // String | 
try {
    Role result = apiInstance.getRole(roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#getRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**|  |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getRolesPage"></a>
# **getRolesPage**
> PageRole getRolesPage(types, page, pageSize, search)



Retrieves the portal instance&#x27;s roles. Results can be paginated.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String types = "types_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
try {
    PageRole result = apiInstance.getRolesPage(types, page, pageSize, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#getRolesPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **types** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **pageSize** | **String**|  | [optional]
 **search** | **String**|  | [optional]

### Return type

[**PageRole**](PageRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postOrganizationRoleUserAccountAssociation"></a>
# **postOrganizationRoleUserAccountAssociation**
> postOrganizationRoleUserAccountAssociation(roleId, userAccountId, organizationId)



Associates a organization role with a user account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String roleId = "roleId_example"; // String | 
String userAccountId = "userAccountId_example"; // String | 
String organizationId = "organizationId_example"; // String | 
try {
    apiInstance.postOrganizationRoleUserAccountAssociation(roleId, userAccountId, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#postOrganizationRoleUserAccountAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**|  |
 **userAccountId** | **String**|  |
 **organizationId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postRoleUserAccountAssociation"></a>
# **postRoleUserAccountAssociation**
> postRoleUserAccountAssociation(roleId, userAccountId)



Associates a role with a user account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String roleId = "roleId_example"; // String | 
String userAccountId = "userAccountId_example"; // String | 
try {
    apiInstance.postRoleUserAccountAssociation(roleId, userAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#postRoleUserAccountAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**|  |
 **userAccountId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="postRolesPageExportBatch"></a>
# **postRolesPageExportBatch**
> postRolesPageExportBatch(types, search, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String types = "types_example"; // String | 
String search = "search_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postRolesPageExportBatch(types, search, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#postRolesPageExportBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **types** | **String**|  | [optional]
 **search** | **String**|  | [optional]
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

<a name="postSiteRoleUserAccountAssociation"></a>
# **postSiteRoleUserAccountAssociation**
> postSiteRoleUserAccountAssociation(roleId, userAccountId, siteId)



Associates a site role with a user account

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String roleId = "roleId_example"; // String | 
String userAccountId = "userAccountId_example"; // String | 
String siteId = "siteId_example"; // String | 
try {
    apiInstance.postSiteRoleUserAccountAssociation(roleId, userAccountId, siteId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#postSiteRoleUserAccountAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**|  |
 **userAccountId** | **String**|  |
 **siteId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

