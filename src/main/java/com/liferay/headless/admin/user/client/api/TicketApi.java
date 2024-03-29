/*
 * Headless Admin User
 * A Java client JAR is available for use with the group ID 'com.liferay', artifact ID 'com.liferay.headless.admin.user.client', and version '4.0.49'.
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.liferay.headless.admin.user.client.api;

import com.liferay.headless.admin.user.client.ApiCallback;
import com.liferay.headless.admin.user.client.ApiClient;
import com.liferay.headless.admin.user.client.ApiException;
import com.liferay.headless.admin.user.client.ApiResponse;
import com.liferay.headless.admin.user.client.Configuration;
import com.liferay.headless.admin.user.client.Pair;
import com.liferay.headless.admin.user.client.ProgressRequestBody;
import com.liferay.headless.admin.user.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.liferay.headless.admin.user.client.model.Ticket;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketApi {
    private ApiClient apiClient;

    public TicketApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TicketApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getUserAccountEmailVerificationTicket
     * @param userAccountId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserAccountEmailVerificationTicketCall(String userAccountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1.0/user-accounts/{userAccountId}/email-verification-ticket"
            .replaceAll("\\{" + "userAccountId" + "\\}", apiClient.escapeString(userAccountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUserAccountEmailVerificationTicketValidateBeforeCall(String userAccountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userAccountId' is set
        if (userAccountId == null) {
            throw new ApiException("Missing the required parameter 'userAccountId' when calling getUserAccountEmailVerificationTicket(Async)");
        }
        
        com.squareup.okhttp.Call call = getUserAccountEmailVerificationTicketCall(userAccountId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Retrieves the user&#x27;s email verification ticket.
     * @param userAccountId  (required)
     * @return Ticket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Ticket getUserAccountEmailVerificationTicket(String userAccountId) throws ApiException {
        ApiResponse<Ticket> resp = getUserAccountEmailVerificationTicketWithHttpInfo(userAccountId);
        return resp.getData();
    }

    /**
     * 
     * Retrieves the user&#x27;s email verification ticket.
     * @param userAccountId  (required)
     * @return ApiResponse&lt;Ticket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Ticket> getUserAccountEmailVerificationTicketWithHttpInfo(String userAccountId) throws ApiException {
        com.squareup.okhttp.Call call = getUserAccountEmailVerificationTicketValidateBeforeCall(userAccountId, null, null);
        Type localVarReturnType = new TypeToken<Ticket>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieves the user&#x27;s email verification ticket.
     * @param userAccountId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserAccountEmailVerificationTicketAsync(String userAccountId, final ApiCallback<Ticket> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUserAccountEmailVerificationTicketValidateBeforeCall(userAccountId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Ticket>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserAccountPasswordResetTicket
     * @param userAccountId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserAccountPasswordResetTicketCall(String userAccountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1.0/user-accounts/{userAccountId}/password-reset-ticket"
            .replaceAll("\\{" + "userAccountId" + "\\}", apiClient.escapeString(userAccountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUserAccountPasswordResetTicketValidateBeforeCall(String userAccountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userAccountId' is set
        if (userAccountId == null) {
            throw new ApiException("Missing the required parameter 'userAccountId' when calling getUserAccountPasswordResetTicket(Async)");
        }
        
        com.squareup.okhttp.Call call = getUserAccountPasswordResetTicketCall(userAccountId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Retrieves the user&#x27;s password reset ticket.
     * @param userAccountId  (required)
     * @return Ticket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Ticket getUserAccountPasswordResetTicket(String userAccountId) throws ApiException {
        ApiResponse<Ticket> resp = getUserAccountPasswordResetTicketWithHttpInfo(userAccountId);
        return resp.getData();
    }

    /**
     * 
     * Retrieves the user&#x27;s password reset ticket.
     * @param userAccountId  (required)
     * @return ApiResponse&lt;Ticket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Ticket> getUserAccountPasswordResetTicketWithHttpInfo(String userAccountId) throws ApiException {
        com.squareup.okhttp.Call call = getUserAccountPasswordResetTicketValidateBeforeCall(userAccountId, null, null);
        Type localVarReturnType = new TypeToken<Ticket>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieves the user&#x27;s password reset ticket.
     * @param userAccountId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserAccountPasswordResetTicketAsync(String userAccountId, final ApiCallback<Ticket> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUserAccountPasswordResetTicketValidateBeforeCall(userAccountId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Ticket>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
