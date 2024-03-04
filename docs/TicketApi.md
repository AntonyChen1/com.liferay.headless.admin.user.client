# TicketApi

All URIs are relative to *http://localhost:8080/o/headless-admin-user/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserAccountEmailVerificationTicket**](TicketApi.md#getUserAccountEmailVerificationTicket) | **GET** /v1.0/user-accounts/{userAccountId}/email-verification-ticket | 
[**getUserAccountPasswordResetTicket**](TicketApi.md#getUserAccountPasswordResetTicket) | **GET** /v1.0/user-accounts/{userAccountId}/password-reset-ticket | 

<a name="getUserAccountEmailVerificationTicket"></a>
# **getUserAccountEmailVerificationTicket**
> Ticket getUserAccountEmailVerificationTicket(userAccountId)



Retrieves the user&#x27;s email verification ticket.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.TicketApi;


TicketApi apiInstance = new TicketApi();
String userAccountId = "userAccountId_example"; // String | 
try {
    Ticket result = apiInstance.getUserAccountEmailVerificationTicket(userAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketApi#getUserAccountEmailVerificationTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**|  |

### Return type

[**Ticket**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getUserAccountPasswordResetTicket"></a>
# **getUserAccountPasswordResetTicket**
> Ticket getUserAccountPasswordResetTicket(userAccountId)



Retrieves the user&#x27;s password reset ticket.

### Example
```java
// Import classes:
//import com.liferay.headless.admin.user.client.ApiException;
//import com.liferay.headless.admin.user.client.api.TicketApi;


TicketApi apiInstance = new TicketApi();
String userAccountId = "userAccountId_example"; // String | 
try {
    Ticket result = apiInstance.getUserAccountPasswordResetTicket(userAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketApi#getUserAccountPasswordResetTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**|  |

### Return type

[**Ticket**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

