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

import com.liferay.headless.admin.user.client.model.PagePostalAddress;
import com.liferay.headless.admin.user.client.model.PostalAddress;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PostalAddressApi
 */
@Ignore
public class PostalAddressApiTest {

    private final PostalAddressApi api = new PostalAddressApi();

    /**
     * 
     *
     * Deletes the postal address
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deletePostalAddressTest() throws Exception {
        String postalAddressId = null;
        api.deletePostalAddress(postalAddressId);

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
    public void deletePostalAddressBatchTest() throws Exception {
        Object body = null;
        String callbackURL = null;
        api.deletePostalAddressBatch(body, callbackURL);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the account&#x27;s postal addresses.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountPostalAddressesPageTest() throws Exception {
        String accountId = null;
        PagePostalAddress response = api.getAccountPostalAddressesPage(accountId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the organization&#x27;s postal addresses.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOrganizationPostalAddressesPageTest() throws Exception {
        String organizationId = null;
        PagePostalAddress response = api.getOrganizationPostalAddressesPage(organizationId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the postal address.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPostalAddressTest() throws Exception {
        String postalAddressId = null;
        PostalAddress response = api.getPostalAddress(postalAddressId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the user&#x27;s postal addresses.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserAccountPostalAddressesPageTest() throws Exception {
        String userAccountId = null;
        PagePostalAddress response = api.getUserAccountPostalAddressesPage(userAccountId);

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
    public void patchPostalAddressTest() throws Exception {
        String postalAddressId = null;
        PostalAddress body = null;
        PostalAddress response = api.patchPostalAddress(postalAddressId, body);

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
    public void postAccountPostalAddressTest() throws Exception {
        String accountId = null;
        PostalAddress body = null;
        PostalAddress response = api.postAccountPostalAddress(accountId, body);

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
    public void postAccountPostalAddressBatchTest() throws Exception {
        String accountId = null;
        Object body = null;
        String callbackURL = null;
        api.postAccountPostalAddressBatch(accountId, body, callbackURL);

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
    public void postAccountPostalAddressesPageExportBatchTest() throws Exception {
        String accountId = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postAccountPostalAddressesPageExportBatch(accountId, callbackURL, contentType, fieldNames);

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
    public void postOrganizationPostalAddressesPageExportBatchTest() throws Exception {
        String organizationId = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postOrganizationPostalAddressesPageExportBatch(organizationId, callbackURL, contentType, fieldNames);

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
    public void postUserAccountPostalAddressesPageExportBatchTest() throws Exception {
        String userAccountId = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postUserAccountPostalAddressesPageExportBatch(userAccountId, callbackURL, contentType, fieldNames);

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
    public void putPostalAddressTest() throws Exception {
        String postalAddressId = null;
        PostalAddress body = null;
        PostalAddress response = api.putPostalAddress(postalAddressId, body);

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
    public void putPostalAddressBatchTest() throws Exception {
        Object body = null;
        String callbackURL = null;
        api.putPostalAddressBatch(body, callbackURL);

        // TODO: test validations
    }
}