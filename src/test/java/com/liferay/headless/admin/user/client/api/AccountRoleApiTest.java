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

import com.liferay.headless.admin.user.client.model.AccountRole;
import com.liferay.headless.admin.user.client.model.PageAccountRole;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccountRoleApi
 */
@Ignore
public class AccountRoleApiTest {

    private final AccountRoleApi api = new AccountRoleApi();

    /**
     * 
     *
     * Unassigns account users to the account role
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountAccountRoleUserAccountAssociationTest() throws Exception {
        String accountId = null;
        String accountRoleId = null;
        String userAccountId = null;
        api.deleteAccountAccountRoleUserAccountAssociation(accountId, accountRoleId, userAccountId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Unassigns account users by email address from the account role
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddressTest() throws Exception {
        String externalReferenceCode = null;
        String accountRoleId = null;
        String emailAddress = null;
        api.deleteAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress(externalReferenceCode, accountRoleId, emailAddress);

        // TODO: test validations
    }
    /**
     * 
     *
     * Unassigns account users by external reference code from the account role
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCodeTest() throws Exception {
        String accountExternalReferenceCode = null;
        String accountRoleId = null;
        String externalReferenceCode = null;
        api.deleteAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode(accountExternalReferenceCode, accountRoleId, externalReferenceCode);

        // TODO: test validations
    }
    /**
     * 
     *
     * Gets the account&#x27;s roles
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountAccountRolesByExternalReferenceCodePageTest() throws Exception {
        String externalReferenceCode = null;
        String keywords = null;
        String filter = null;
        String page = null;
        String pageSize = null;
        String sort = null;
        PageAccountRole response = api.getAccountAccountRolesByExternalReferenceCodePage(externalReferenceCode, keywords, filter, page, pageSize, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Gets the account&#x27;s roles
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountAccountRolesPageTest() throws Exception {
        String accountId = null;
        String keywords = null;
        String filter = null;
        String page = null;
        String pageSize = null;
        String sort = null;
        PageAccountRole response = api.getAccountAccountRolesPage(accountId, keywords, filter, page, pageSize, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Gets a user&#x27;s account roles by their email address from an account by external reference code
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountByExternalReferenceCodeUserAccountByEmailAddressAccountRolesPageTest() throws Exception {
        String externalReferenceCode = null;
        String emailAddress = null;
        PageAccountRole response = api.getAccountByExternalReferenceCodeUserAccountByEmailAddressAccountRolesPage(externalReferenceCode, emailAddress);

        // TODO: test validations
    }
    /**
     * 
     *
     * Gets a user&#x27;s account roles by their external reference code from an account by external reference code
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountByExternalReferenceCodeUserAccountByExternalReferenceCodeAccountRolesPageTest() throws Exception {
        String accountExternalReferenceCode = null;
        String externalReferenceCode = null;
        PageAccountRole response = api.getAccountByExternalReferenceCodeUserAccountByExternalReferenceCodeAccountRolesPage(accountExternalReferenceCode, externalReferenceCode);

        // TODO: test validations
    }
    /**
     * 
     *
     * Adds a role for the account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountAccountRoleTest() throws Exception {
        String accountId = null;
        AccountRole body = null;
        AccountRole response = api.postAccountAccountRole(accountId, body);

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
    public void postAccountAccountRoleBatchTest() throws Exception {
        String accountId = null;
        Object body = null;
        String callbackURL = null;
        api.postAccountAccountRoleBatch(accountId, body, callbackURL);

        // TODO: test validations
    }
    /**
     * 
     *
     * Adds a role for the account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountAccountRoleByExternalReferenceCodeTest() throws Exception {
        String externalReferenceCode = null;
        AccountRole body = null;
        AccountRole response = api.postAccountAccountRoleByExternalReferenceCode(externalReferenceCode, body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Assigns account users to the account role
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountAccountRoleUserAccountAssociationTest() throws Exception {
        String accountId = null;
        String accountRoleId = null;
        String userAccountId = null;
        api.postAccountAccountRoleUserAccountAssociation(accountId, accountRoleId, userAccountId);

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
    public void postAccountAccountRolesPageExportBatchTest() throws Exception {
        String accountId = null;
        String keywords = null;
        String filter = null;
        String sort = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postAccountAccountRolesPageExportBatch(accountId, keywords, filter, sort, callbackURL, contentType, fieldNames);

        // TODO: test validations
    }
    /**
     * 
     *
     * Assigns account users by email address to the account role
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddressTest() throws Exception {
        String externalReferenceCode = null;
        String accountRoleId = null;
        String emailAddress = null;
        api.postAccountByExternalReferenceCodeAccountRoleUserAccountByEmailAddress(externalReferenceCode, accountRoleId, emailAddress);

        // TODO: test validations
    }
    /**
     * 
     *
     * Assigns account users by external reference code to the account role
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCodeTest() throws Exception {
        String accountExternalReferenceCode = null;
        String accountRoleId = null;
        String externalReferenceCode = null;
        api.postAccountByExternalReferenceCodeAccountRoleUserAccountByExternalReferenceCode(accountExternalReferenceCode, accountRoleId, externalReferenceCode);

        // TODO: test validations
    }
}
