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

import com.liferay.headless.admin.user.client.model.PagePhone;
import com.liferay.headless.admin.user.client.model.Phone;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PhoneApi
 */
@Ignore
public class PhoneApiTest {

    private final PhoneApi api = new PhoneApi();

    /**
     * 
     *
     * Retrieves the organization&#x27;s phone numbers.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOrganizationPhonesPageTest() throws Exception {
        String organizationId = null;
        PagePhone response = api.getOrganizationPhonesPage(organizationId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the phone number.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPhoneTest() throws Exception {
        String phoneId = null;
        Phone response = api.getPhone(phoneId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the user&#x27;s phone numbers.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserAccountPhonesPageTest() throws Exception {
        String userAccountId = null;
        PagePhone response = api.getUserAccountPhonesPage(userAccountId);

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
    public void postOrganizationPhonesPageExportBatchTest() throws Exception {
        String organizationId = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postOrganizationPhonesPageExportBatch(organizationId, callbackURL, contentType, fieldNames);

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
    public void postUserAccountPhonesPageExportBatchTest() throws Exception {
        String userAccountId = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postUserAccountPhonesPageExportBatch(userAccountId, callbackURL, contentType, fieldNames);

        // TODO: test validations
    }
}
