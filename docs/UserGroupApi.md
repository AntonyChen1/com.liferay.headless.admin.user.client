# UserGroupApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserGroup**](UserGroupApi.md#deleteUserGroup) | **DELETE** /v1.0/user-groups/{userGroupId} | 
[**deleteUserGroupBatch**](UserGroupApi.md#deleteUserGroupBatch) | **DELETE** /v1.0/user-groups/batch | 
[**deleteUserGroupByExternalReferenceCode**](UserGroupApi.md#deleteUserGroupByExternalReferenceCode) | **DELETE** /v1.0/user-groups/by-external-reference-code/{externalReferenceCode} | 
[**deleteUserGroupUsers**](UserGroupApi.md#deleteUserGroupUsers) | **DELETE** /v1.0/user-groups/{userGroupId}/user-group-users | 
[**getUserGroup**](UserGroupApi.md#getUserGroup) | **GET** /v1.0/user-groups/{userGroupId} | 
[**getUserGroupByExternalReferenceCode**](UserGroupApi.md#getUserGroupByExternalReferenceCode) | **GET** /v1.0/user-groups/by-external-reference-code/{externalReferenceCode} | 
[**getUserGroupsPage**](UserGroupApi.md#getUserGroupsPage) | **GET** /v1.0/user-groups | 
[**getUserUserGroups**](UserGroupApi.md#getUserUserGroups) | **GET** /v1.0/user-accounts/{userAccountId}/user-groups | 
[**patchUserGroup**](UserGroupApi.md#patchUserGroup) | **PATCH** /v1.0/user-groups/{userGroupId} | 
[**patchUserGroupByExternalReferenceCode**](UserGroupApi.md#patchUserGroupByExternalReferenceCode) | **PATCH** /v1.0/user-groups/by-external-reference-code/{externalReferenceCode} | 
[**postUserGroup**](UserGroupApi.md#postUserGroup) | **POST** /v1.0/user-groups | 
[**postUserGroupBatch**](UserGroupApi.md#postUserGroupBatch) | **POST** /v1.0/user-groups/batch | 
[**postUserGroupUsers**](UserGroupApi.md#postUserGroupUsers) | **POST** /v1.0/user-groups/{userGroupId}/user-group-users | 
[**postUserGroupsPageExportBatch**](UserGroupApi.md#postUserGroupsPageExportBatch) | **POST** /v1.0/user-groups/export-batch | 
[**putUserGroup**](UserGroupApi.md#putUserGroup) | **PUT** /v1.0/user-groups/{userGroupId} | 
[**putUserGroupBatch**](UserGroupApi.md#putUserGroupBatch) | **PUT** /v1.0/user-groups/batch | 
[**putUserGroupByExternalReferenceCode**](UserGroupApi.md#putUserGroupByExternalReferenceCode) | **PUT** /v1.0/user-groups/by-external-reference-code/{externalReferenceCode} | 

<a name="deleteUserGroup"></a>
# **deleteUserGroup**
> deleteUserGroup(userGroupId)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
String userGroupId = "userGroupId_example"; // String | 
try {
    apiInstance.deleteUserGroup(userGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#deleteUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteUserGroupBatch"></a>
# **deleteUserGroupBatch**
> deleteUserGroupBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.deleteUserGroupBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#deleteUserGroupBatch");
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

<a name="deleteUserGroupByExternalReferenceCode"></a>
# **deleteUserGroupByExternalReferenceCode**
> deleteUserGroupByExternalReferenceCode(externalReferenceCode)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    apiInstance.deleteUserGroupByExternalReferenceCode(externalReferenceCode);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#deleteUserGroupByExternalReferenceCode");
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

<a name="deleteUserGroupUsers"></a>
# **deleteUserGroupUsers**
> deleteUserGroupUsers(userGroupId, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
String userGroupId = "userGroupId_example"; // String | 
List<Long> body = Arrays.asList(56L); // List<Long> | 
try {
    apiInstance.deleteUserGroupUsers(userGroupId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#deleteUserGroupUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **String**|  |
 **body** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getUserGroup"></a>
# **getUserGroup**
> UserGroup getUserGroup(userGroupId)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
String userGroupId = "userGroupId_example"; // String | 
try {
    UserGroup result = apiInstance.getUserGroup(userGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#getUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **String**|  |

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserGroupByExternalReferenceCode"></a>
# **getUserGroupByExternalReferenceCode**
> UserGroup getUserGroupByExternalReferenceCode(externalReferenceCode)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
try {
    UserGroup result = apiInstance.getUserGroupByExternalReferenceCode(externalReferenceCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#getUserGroupByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserGroupsPage"></a>
# **getUserGroupsPage**
> PageUserGroup getUserGroupsPage(filter, page, pageSize, search, sort)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
String filter = "filter_example"; // String | 
String page = "page_example"; // String | 
String pageSize = "pageSize_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
try {
    PageUserGroup result = apiInstance.getUserGroupsPage(filter, page, pageSize, search, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#getUserGroupsPage");
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

[**PageUserGroup**](PageUserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserUserGroups"></a>
# **getUserUserGroups**
> PageUserGroup getUserUserGroups(userAccountId)



Retrieves the user&#x27;s user groups.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
String userAccountId = "userAccountId_example"; // String | 
try {
    PageUserGroup result = apiInstance.getUserUserGroups(userAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#getUserUserGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**|  |

### Return type

[**PageUserGroup**](PageUserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="patchUserGroup"></a>
# **patchUserGroup**
> UserGroup patchUserGroup(userGroupId, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
String userGroupId = "userGroupId_example"; // String | 
UserGroup body = new UserGroup(); // UserGroup | 
try {
    UserGroup result = apiInstance.patchUserGroup(userGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#patchUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **String**|  |
 **body** | [**UserGroup**](UserGroup.md)|  | [optional]

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="patchUserGroupByExternalReferenceCode"></a>
# **patchUserGroupByExternalReferenceCode**
> UserGroup patchUserGroupByExternalReferenceCode(externalReferenceCode, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
UserGroup body = new UserGroup(); // UserGroup | 
try {
    UserGroup result = apiInstance.patchUserGroupByExternalReferenceCode(externalReferenceCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#patchUserGroupByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **body** | [**UserGroup**](UserGroup.md)|  | [optional]

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postUserGroup"></a>
# **postUserGroup**
> UserGroup postUserGroup(body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
UserGroup body = new UserGroup(); // UserGroup | 
try {
    UserGroup result = apiInstance.postUserGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#postUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserGroup**](UserGroup.md)|  | [optional]

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postUserGroupBatch"></a>
# **postUserGroupBatch**
> postUserGroupBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.postUserGroupBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#postUserGroupBatch");
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

<a name="postUserGroupUsers"></a>
# **postUserGroupUsers**
> postUserGroupUsers(userGroupId, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
String userGroupId = "userGroupId_example"; // String | 
List<Long> body = Arrays.asList(56L); // List<Long> | 
try {
    apiInstance.postUserGroupUsers(userGroupId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#postUserGroupUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **String**|  |
 **body** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="postUserGroupsPageExportBatch"></a>
# **postUserGroupsPageExportBatch**
> postUserGroupsPageExportBatch(filter, search, sort, callbackURL, contentType, fieldNames)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
String filter = "filter_example"; // String | 
String search = "search_example"; // String | 
String sort = "sort_example"; // String | 
String callbackURL = "callbackURL_example"; // String | 
String contentType = "contentType_example"; // String | 
String fieldNames = "fieldNames_example"; // String | 
try {
    apiInstance.postUserGroupsPageExportBatch(filter, search, sort, callbackURL, contentType, fieldNames);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#postUserGroupsPageExportBatch");
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

<a name="putUserGroup"></a>
# **putUserGroup**
> UserGroup putUserGroup(userGroupId, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
String userGroupId = "userGroupId_example"; // String | 
UserGroup body = new UserGroup(); // UserGroup | 
try {
    UserGroup result = apiInstance.putUserGroup(userGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#putUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **String**|  |
 **body** | [**UserGroup**](UserGroup.md)|  | [optional]

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="putUserGroupBatch"></a>
# **putUserGroupBatch**
> putUserGroupBatch(body, callbackURL)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
Object body = null; // Object | 
String callbackURL = "callbackURL_example"; // String | 
try {
    apiInstance.putUserGroupBatch(body, callbackURL);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#putUserGroupBatch");
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

<a name="putUserGroupByExternalReferenceCode"></a>
# **putUserGroupByExternalReferenceCode**
> UserGroup putUserGroupByExternalReferenceCode(externalReferenceCode, body)



### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.UserGroupApi;


UserGroupApi apiInstance = new UserGroupApi();
String externalReferenceCode = "externalReferenceCode_example"; // String | 
UserGroup body = new UserGroup(); // UserGroup | 
try {
    UserGroup result = apiInstance.putUserGroupByExternalReferenceCode(externalReferenceCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#putUserGroupByExternalReferenceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalReferenceCode** | **String**|  |
 **body** | [**UserGroup**](UserGroup.md)|  | [optional]

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

