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

import com.liferay.headless.admin.user.client.model.AccountGroup;
import com.liferay.headless.admin.user.client.model.PageAccountGroup;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccountGroupApi
 */
@Ignore
public class AccountGroupApiTest {

    private final AccountGroupApi api = new AccountGroupApi();

    /**
     * 
     *
     * Deletes an account group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountGroupTest() throws Exception {
        String accountGroupId = null;
        api.deleteAccountGroup(accountGroupId);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountGroupBatchTest() throws Exception {
        Object body = null;
        String callbackURL = null;
        api.deleteAccountGroupBatch(body, callbackURL);

        // TODO: test validations
    }
    /**
     * 
     *
     * Deletes an account group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountGroupByExternalReferenceCodeTest() throws Exception {
        String externalReferenceCode = null;
        api.deleteAccountGroupByExternalReferenceCode(externalReferenceCode);

        // TODO: test validations
    }
    /**
     * 
     *
     * Removes an account by their external reference code from an account group by external reference code
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountGroupByExternalReferenceCodeAccountByExternalReferenceCodeTest() throws Exception {
        String accountExternalReferenceCode = null;
        String externalReferenceCode = null;
        api.deleteAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountAccountGroupsPageTest() throws Exception {
        String accountId = null;
        String page = null;
        String pageSize = null;
        PageAccountGroup response = api.getAccountAccountGroupsPage(accountId, page, pageSize);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountByExternalReferenceCodeAccountExternalReferenceCodeAccountGroupsPageTest() throws Exception {
        String accountExternalReferenceCode = null;
        String page = null;
        String pageSize = null;
        PageAccountGroup response = api.getAccountByExternalReferenceCodeAccountExternalReferenceCodeAccountGroupsPage(accountExternalReferenceCode, page, pageSize);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountGroupTest() throws Exception {
        String accountGroupId = null;
        AccountGroup response = api.getAccountGroup(accountGroupId);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountGroupByExternalReferenceCodeTest() throws Exception {
        String externalReferenceCode = null;
        AccountGroup response = api.getAccountGroupByExternalReferenceCode(externalReferenceCode);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the account groups. Results can be paginated, filtered, searched, and sorted.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountGroupsPageTest() throws Exception {
        String filter = null;
        String page = null;
        String pageSize = null;
        String search = null;
        String sort = null;
        PageAccountGroup response = api.getAccountGroupsPage(filter, page, pageSize, search, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Updates the account group with information sent in the request body. Only the provided fields are updated.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchAccountGroupTest() throws Exception {
        String accountGroupId = null;
        AccountGroup body = null;
        AccountGroup response = api.patchAccountGroup(accountGroupId, body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Updates the account with information sent in the request body. Only the provided fields are updated.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchAccountGroupByExternalReferenceCodeTest() throws Exception {
        String externalReferenceCode = null;
        AccountGroup body = null;
        AccountGroup response = api.patchAccountGroupByExternalReferenceCode(externalReferenceCode, body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountAccountGroupsPageExportBatchTest() throws Exception {
        String accountId = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postAccountAccountGroupsPageExportBatch(accountId, callbackURL, contentType, fieldNames);

        // TODO: test validations
    }
    /**
     * 
     *
     * Creates a new account group
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountGroupTest() throws Exception {
        AccountGroup body = null;
        AccountGroup response = api.postAccountGroup(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountGroupBatchTest() throws Exception {
        Object body = null;
        String callbackURL = null;
        api.postAccountGroupBatch(body, callbackURL);

        // TODO: test validations
    }
    /**
     * 
     *
     * Assigns an account by its external reference code to an account group by external reference code
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountGroupByExternalReferenceCodeAccountByExternalReferenceCodeTest() throws Exception {
        String accountExternalReferenceCode = null;
        String externalReferenceCode = null;
        api.postAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountGroupsPageExportBatchTest() throws Exception {
        String filter = null;
        String search = null;
        String sort = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postAccountGroupsPageExportBatch(filter, search, sort, callbackURL, contentType, fieldNames);

        // TODO: test validations
    }
    /**
     * 
     *
     * Replaces the account group with information sent in the request body. Any missing fields are deleted unless they are required.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void putAccountGroupTest() throws Exception {
        String accountGroupId = null;
        AccountGroup body = null;
        AccountGroup response = api.putAccountGroup(accountGroupId, body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void putAccountGroupBatchTest() throws Exception {
        Object body = null;
        String callbackURL = null;
        api.putAccountGroupBatch(body, callbackURL);

        // TODO: test validations
    }
    /**
     * 
     *
     * Replaces the account group with information sent in the request body. Any missing fields are deleted unless they are required.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void putAccountGroupByExternalReferenceCodeTest() throws Exception {
        String externalReferenceCode = null;
        AccountGroup body = null;
        AccountGroup response = api.putAccountGroupByExternalReferenceCode(externalReferenceCode, body);

        // TODO: test validations
    }
}
