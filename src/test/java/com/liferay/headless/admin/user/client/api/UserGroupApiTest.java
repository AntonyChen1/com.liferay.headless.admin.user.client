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

import com.liferay.headless.admin.user.client.model.PageUserGroup;
import com.liferay.headless.admin.user.client.model.UserGroup;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserGroupApi
 */
@Ignore
public class UserGroupApiTest {

    private final UserGroupApi api = new UserGroupApi();

    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUserGroupTest() throws Exception {
        String userGroupId = null;
        api.deleteUserGroup(userGroupId);

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
    public void deleteUserGroupBatchTest() throws Exception {
        Object body = null;
        String callbackURL = null;
        api.deleteUserGroupBatch(body, callbackURL);

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
    public void deleteUserGroupByExternalReferenceCodeTest() throws Exception {
        String externalReferenceCode = null;
        api.deleteUserGroupByExternalReferenceCode(externalReferenceCode);

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
    public void deleteUserGroupUsersTest() throws Exception {
        String userGroupId = null;
        List<Long> body = null;
        api.deleteUserGroupUsers(userGroupId, body);

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
    public void getUserGroupTest() throws Exception {
        String userGroupId = null;
        UserGroup response = api.getUserGroup(userGroupId);

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
    public void getUserGroupByExternalReferenceCodeTest() throws Exception {
        String externalReferenceCode = null;
        UserGroup response = api.getUserGroupByExternalReferenceCode(externalReferenceCode);

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
    public void getUserGroupsPageTest() throws Exception {
        String filter = null;
        String page = null;
        String pageSize = null;
        String search = null;
        String sort = null;
        PageUserGroup response = api.getUserGroupsPage(filter, page, pageSize, search, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the user&#x27;s user groups.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserUserGroupsTest() throws Exception {
        String userAccountId = null;
        PageUserGroup response = api.getUserUserGroups(userAccountId);

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
    public void patchUserGroupTest() throws Exception {
        String userGroupId = null;
        UserGroup body = null;
        UserGroup response = api.patchUserGroup(userGroupId, body);

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
    public void patchUserGroupByExternalReferenceCodeTest() throws Exception {
        String externalReferenceCode = null;
        UserGroup body = null;
        UserGroup response = api.patchUserGroupByExternalReferenceCode(externalReferenceCode, body);

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
    public void postUserGroupTest() throws Exception {
        UserGroup body = null;
        UserGroup response = api.postUserGroup(body);

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
    public void postUserGroupBatchTest() throws Exception {
        Object body = null;
        String callbackURL = null;
        api.postUserGroupBatch(body, callbackURL);

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
    public void postUserGroupUsersTest() throws Exception {
        String userGroupId = null;
        List<Long> body = null;
        api.postUserGroupUsers(userGroupId, body);

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
    public void postUserGroupsPageExportBatchTest() throws Exception {
        String filter = null;
        String search = null;
        String sort = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postUserGroupsPageExportBatch(filter, search, sort, callbackURL, contentType, fieldNames);

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
    public void putUserGroupTest() throws Exception {
        String userGroupId = null;
        UserGroup body = null;
        UserGroup response = api.putUserGroup(userGroupId, body);

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
    public void putUserGroupBatchTest() throws Exception {
        Object body = null;
        String callbackURL = null;
        api.putUserGroupBatch(body, callbackURL);

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
    public void putUserGroupByExternalReferenceCodeTest() throws Exception {
        String externalReferenceCode = null;
        UserGroup body = null;
        UserGroup response = api.putUserGroupByExternalReferenceCode(externalReferenceCode, body);

        // TODO: test validations
    }
}
