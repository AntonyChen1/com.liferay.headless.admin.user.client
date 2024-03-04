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

import com.liferay.headless.admin.user.client.model.PageRole;
import com.liferay.headless.admin.user.client.model.Role;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RoleApi
 */
@Ignore
public class RoleApiTest {

    private final RoleApi api = new RoleApi();

    /**
     * 
     *
     * Unassociates an organization role with a user account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteOrganizationRoleUserAccountAssociationTest() throws Exception {
        String roleId = null;
        String userAccountId = null;
        String organizationId = null;
        api.deleteOrganizationRoleUserAccountAssociation(roleId, userAccountId, organizationId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Unassociates a role with a user account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteRoleUserAccountAssociationTest() throws Exception {
        String roleId = null;
        String userAccountId = null;
        api.deleteRoleUserAccountAssociation(roleId, userAccountId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Unassociates a site role with a user account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteSiteRoleUserAccountAssociationTest() throws Exception {
        String roleId = null;
        String userAccountId = null;
        String siteId = null;
        api.deleteSiteRoleUserAccountAssociation(roleId, userAccountId, siteId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the role.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRoleTest() throws Exception {
        String roleId = null;
        Role response = api.getRole(roleId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieves the portal instance&#x27;s roles. Results can be paginated.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRolesPageTest() throws Exception {
        String types = null;
        String page = null;
        String pageSize = null;
        String search = null;
        PageRole response = api.getRolesPage(types, page, pageSize, search);

        // TODO: test validations
    }
    /**
     * 
     *
     * Associates a organization role with a user account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postOrganizationRoleUserAccountAssociationTest() throws Exception {
        String roleId = null;
        String userAccountId = null;
        String organizationId = null;
        api.postOrganizationRoleUserAccountAssociation(roleId, userAccountId, organizationId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Associates a role with a user account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postRoleUserAccountAssociationTest() throws Exception {
        String roleId = null;
        String userAccountId = null;
        api.postRoleUserAccountAssociation(roleId, userAccountId);

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
    public void postRolesPageExportBatchTest() throws Exception {
        String types = null;
        String search = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postRolesPageExportBatch(types, search, callbackURL, contentType, fieldNames);

        // TODO: test validations
    }
    /**
     * 
     *
     * Associates a site role with a user account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSiteRoleUserAccountAssociationTest() throws Exception {
        String roleId = null;
        String userAccountId = null;
        String siteId = null;
        api.postSiteRoleUserAccountAssociation(roleId, userAccountId, siteId);

        // TODO: test validations
    }
}
