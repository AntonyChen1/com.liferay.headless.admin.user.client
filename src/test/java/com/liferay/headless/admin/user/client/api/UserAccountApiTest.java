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

import com.liferay.headless.admin.user.client.model.PageUserAccount;
import com.liferay.headless.admin.user.client.model.UserAccount;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserAccountApi
 */
//@Ignore
public class UserAccountApiTest {

    private final UserAccountApi api = new UserAccountApi();

    /**
     * 
     *
     * Removes a user by their external reference code from an account by external reference code
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountByExternalReferenceCodeUserAccountByExternalReferenceCodeTest() throws Exception {
        String accountExternalReferenceCode = null;
        String externalReferenceCode = null;
        api.deleteAccountByExternalReferenceCodeUserAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode);

        // TODO: test validations
    }
    /**
     * 
     *
     * Removes a user assigned to an account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountUserAccountTest() throws Exception {
        String accountId = null;
        String userAccountId = null;
        api.deleteAccountUserAccount(accountId, userAccountId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Removes a user from an account by their email address
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountUserAccountByEmailAddressTest() throws Exception {
        String accountId = null;
        String emailAddress = null;
        api.deleteAccountUserAccountByEmailAddress(accountId, emailAddress);

        // TODO: test validations
    }
    /**
     * 
     *
     * Removes a user from an account by external reference code by their email address
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountUserAccountByExternalReferenceCodeByEmailAddressTest() throws Exception {
        String externalReferenceCode = null;
        String emailAddress = null;
        api.deleteAccountUserAccountByExternalReferenceCodeByEmailAddress(externalReferenceCode, emailAddress);

        // TODO: test validations
    }
    /**
     * 
     *
     * Removes users from an account by their email addresses
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountUserAccountsByEmailAddressTest() throws Exception {
        String accountId = null;
        List<String> body = null;
        api.deleteAccountUserAccountsByEmailAddress(accountId, body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Removes users from an account by their email addresses
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAccountUserAccountsByExternalReferenceCodeByEmailAddressTest() throws Exception {
        String externalReferenceCode = null;
        List<String> body = null;
        api.deleteAccountUserAccountsByExternalReferenceCodeByEmailAddress(externalReferenceCode, body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Deletes the user account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUserAccountTest() throws Exception {
        String userAccountId = null;
        api.deleteUserAccount(userAccountId);

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
    public void deleteUserAccountBatchTest() throws Exception {
        Object body = null;
        String callbackURL = null;
        api.deleteUserAccountBatch(body, callbackURL);

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
    public void deleteUserAccountByExternalReferenceCodeTest() throws Exception {
        String externalReferenceCode = null;
        api.deleteUserAccountByExternalReferenceCode(externalReferenceCode);

        // TODO: test validations
    }
    /**
     * 
     *
     * Gets a user by their external reference code to an account by external reference code
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountByExternalReferenceCodeUserAccountByExternalReferenceCodeTest() throws Exception {
        String accountExternalReferenceCode = null;
        String externalReferenceCode = null;
        UserAccount response = api.getAccountByExternalReferenceCodeUserAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode);

        // TODO: test validations
    }
    /**
     * 
     *
     * Gets a user assigned to an account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountUserAccountTest() throws Exception {
        String accountId = null;
        String userAccountId = null;
        UserAccount response = api.getAccountUserAccount(accountId, userAccountId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Gets the users assigned to an account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountUserAccountsByExternalReferenceCodePageTest() throws Exception {
        String externalReferenceCode = null;
        String filter = null;
        String page = null;
        String pageSize = null;
        String search = null;
        String sort = null;
        PageUserAccount response = api.getAccountUserAccountsByExternalReferenceCodePage(externalReferenceCode, filter, page, pageSize, search, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Gets the users assigned to an account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountUserAccountsPageTest() throws Exception {
        String accountId = null;
        String filter = null;
        String page = null;
        String pageSize = null;
        String search = null;
        String sort = null;
        PageUserAccount response = api.getAccountUserAccountsPage(accountId, filter, page, pageSize, search, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves information about the user who made the request.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMyUserAccountTest() throws Exception {
        UserAccount response = api.getMyUserAccount();

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the organization&#x27;s members (users). Results can be paginated, filtered, searched, and sorted.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOrganizationUserAccountsPageTest() throws Exception {
        String organizationId = null;
        String filter = null;
        String page = null;
        String pageSize = null;
        String search = null;
        String sort = null;
        PageUserAccount response = api.getOrganizationUserAccountsPage(organizationId, filter, page, pageSize, search, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the site members&#x27; user accounts. Results can be paginated, filtered, searched, and sorted.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSiteUserAccountsPageTest() throws Exception {
        String siteId = null;
        String filter = null;
        String page = null;
        String pageSize = null;
        String search = null;
        String sort = null;
        PageUserAccount response = api.getSiteUserAccountsPage(siteId, filter, page, pageSize, search, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the user account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserAccountTest() throws Exception {
        String userAccountId = null;
        UserAccount response = api.getUserAccount(userAccountId);

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
    public void getUserAccountByEmailAddressTest() throws Exception {
        String emailAddress = "test@liferay.com";
        String address = "localhost:8080";
        String scheme = "http";
        String token = "eyJ0eXAiOiJhdCtqd3QiLCJhbGciOiJSUzI1NiJ9.eyJqdGkiOiI1MWQxZDc2MzhjZTI3OGE2NDEzOWFiYjIzZjdkM2NlZmZmOWRhOGE3OWE1YjRjMmE4YjI2OGQ1NmM1MmM3Y2UiLCJjbGllbnRfaWQiOiJpZC0zZTliODRlMi04MzRiLWY5ODAtNTFiMS1kZjc0NDY5YmZmMzciLCJpYXQiOjE3MDk1MzMzMDcsImV4cCI6MTcwOTUzMzkwNywic3ViIjoiMjAxMjMiLCJ1c2VybmFtZSI6InRlc3QiLCJpc3MiOiJsb2NhbGhvc3QiLCJzY29wZSI6IkxpZmVyYXkuSGVhZGxlc3MuQWRtaW4uVXNlci5ldmVyeXRoaW5nLnJlYWQgTGlmZXJheS5IZWFkbGVzcy5EZWxpdmVyeS5ldmVyeXRoaW5nIiwiZ3JhbnRfdHlwZSI6ImNsaWVudF9jcmVkZW50aWFscyJ9.eChb1wpfH3m65gyOw6HVMvmcaPTFNQq20Sz0nohGwa9zn9iv4RCi4TuZRTEBduyvN9SS_41qpk9Rrg4bs3PC7E7Q5RmDTLPfXw8hZjTNpGwxryPoQaJabEbmjTMd0SrAECgxfQSoOIZyVIHKIVnN08aKcpEmvSbHeOmIUS6D-01KFo8BpezOec_PD1Lf3sZtMkljjAGr3vUJ22EUrosqKMDbruJWlp4NsCQIlN6zubZX7clrJ98UcJQjY6i38To2ahyJgliFYiIo6G6pwONUa-9pX7QRfNs-bShmmcB_0sXYGGLD0lUOLXXoNFYNGyyYVob0N1AawHcG2MeplDXUXw";
        UserAccountApi api = new UserAccountApi(token, address, scheme);
        UserAccount response = api.getUserAccountByEmailAddress(emailAddress);
        String res = response.getEmailAddress();

        Assert.assertEquals(emailAddress, res);
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
    public void getUserAccountByExternalReferenceCodeTest() throws Exception {
        String externalReferenceCode = null;
        UserAccount response = api.getUserAccountByExternalReferenceCode(externalReferenceCode);

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
    public void getUserAccountsByStatusPageTest() throws Exception {
        String status = null;
        String filter = null;
        String page = null;
        String pageSize = null;
        String search = null;
        String sort = null;
        PageUserAccount response = api.getUserAccountsByStatusPage(status, filter, page, pageSize, search, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the user accounts. Results can be paginated, filtered, searched, and sorted.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserAccountsPageTest() throws Exception {
        String filter = null;
        String page = null;
        String pageSize = null;
        String search = null;
        String sort = null;
        PageUserAccount response = api.getUserAccountsPage(filter, page, pageSize, search, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Updates the user account with information sent in the request body. Only the provided fields are updated.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchUserAccountTest() throws Exception {
        String userAccountId = null;
        UserAccount body = null;
        UserAccount response = api.patchUserAccount(userAccountId, body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Assigns a user by their external reference code to an account by external reference code
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountByExternalReferenceCodeUserAccountByExternalReferenceCodeTest() throws Exception {
        String accountExternalReferenceCode = null;
        String externalReferenceCode = null;
        api.postAccountByExternalReferenceCodeUserAccountByExternalReferenceCode(accountExternalReferenceCode, externalReferenceCode);

        // TODO: test validations
    }
    /**
     * 
     *
     * Creates a user and assigns them to the account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountUserAccountTest() throws Exception {
        String accountId = null;
        UserAccount body = null;
        UserAccount response = api.postAccountUserAccount(accountId, body);

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
    public void postAccountUserAccountBatchTest() throws Exception {
        String accountId = null;
        Object body = null;
        String callbackURL = null;
        api.postAccountUserAccountBatch(accountId, body, callbackURL);

        // TODO: test validations
    }
    /**
     * 
     *
     * Assigns a user to an account by their email address
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountUserAccountByEmailAddressTest() throws Exception {
        String accountId = null;
        String emailAddress = null;
        UserAccount response = api.postAccountUserAccountByEmailAddress(accountId, emailAddress);

        // TODO: test validations
    }
    /**
     * 
     *
     * Creates a user and assigns them to the account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountUserAccountByExternalReferenceCodeTest() throws Exception {
        String externalReferenceCode = null;
        UserAccount body = null;
        UserAccount response = api.postAccountUserAccountByExternalReferenceCode(externalReferenceCode, body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Assigns a user to an account by external reference code by their email address
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountUserAccountByExternalReferenceCodeByEmailAddressTest() throws Exception {
        String externalReferenceCode = null;
        String emailAddress = null;
        api.postAccountUserAccountByExternalReferenceCodeByEmailAddress(externalReferenceCode, emailAddress);

        // TODO: test validations
    }
    /**
     * 
     *
     * Assigns users to an account by their email addresses
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountUserAccountsByEmailAddressTest() throws Exception {
        String accountId = null;
        List<String> body = null;
        String accountRoleIds = null;
        PageUserAccount response = api.postAccountUserAccountsByEmailAddress(accountId, body, accountRoleIds);

        // TODO: test validations
    }
    /**
     * 
     *
     * Assigns users to an account by their email addresses
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAccountUserAccountsByExternalReferenceCodeByEmailAddressTest() throws Exception {
        String externalReferenceCode = null;
        List<String> body = null;
        api.postAccountUserAccountsByExternalReferenceCodeByEmailAddress(externalReferenceCode, body);

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
    public void postAccountUserAccountsPageExportBatchTest() throws Exception {
        String accountId = null;
        String filter = null;
        String search = null;
        String sort = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postAccountUserAccountsPageExportBatch(accountId, filter, search, sort, callbackURL, contentType, fieldNames);

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
    public void postOrganizationUserAccountsPageExportBatchTest() throws Exception {
        String organizationId = null;
        String filter = null;
        String search = null;
        String sort = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postOrganizationUserAccountsPageExportBatch(organizationId, filter, search, sort, callbackURL, contentType, fieldNames);

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
    public void postSiteUserAccountsPageExportBatchTest() throws Exception {
        String siteId = null;
        String filter = null;
        String search = null;
        String sort = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postSiteUserAccountsPageExportBatch(siteId, filter, search, sort, callbackURL, contentType, fieldNames);

        // TODO: test validations
    }
    /**
     * 
     *
     * Creates a new user account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUserAccountTest() throws Exception {
        UserAccount body = null;
        UserAccount response = api.postUserAccount(body);

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
    public void postUserAccountBatchTest() throws Exception {
        Object body = null;
        String callbackURL = null;
        api.postUserAccountBatch(body, callbackURL);

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
    public void postUserAccountImageTest() throws Exception {
        String userAccountId = null;
        Map<String, String> values = null;
        api.postUserAccountImage(userAccountId, values);

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
    public void postUserAccountsPageExportBatchTest() throws Exception {
        String filter = null;
        String search = null;
        String sort = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postUserAccountsPageExportBatch(filter, search, sort, callbackURL, contentType, fieldNames);

        // TODO: test validations
    }
    /**
     * 
     *
     * Replaces the user account with information sent in the request body. Any missing fields are deleted unless they are required.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void putUserAccountTest() throws Exception {
        String userAccountId = null;
        UserAccount body = null;
        UserAccount response = api.putUserAccount(userAccountId, body);

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
    public void putUserAccountBatchTest() throws Exception {
        Object body = null;
        String callbackURL = null;
        api.putUserAccountBatch(body, callbackURL);

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
    public void putUserAccountByExternalReferenceCodeTest() throws Exception {
        String externalReferenceCode = null;
        UserAccount body = null;
        UserAccount response = api.putUserAccountByExternalReferenceCode(externalReferenceCode, body);

        // TODO: test validations
    }
}
