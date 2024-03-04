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

import com.liferay.headless.admin.user.client.model.PageSegment;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SegmentApi
 */
@Ignore
public class SegmentApiTest {

    private final SegmentApi api = new SegmentApi();

    /**
     * 
     *
     * Gets a site&#x27;s segments.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSiteSegmentsPageTest() throws Exception {
        String siteId = null;
        String page = null;
        String pageSize = null;
        PageSegment response = api.getSiteSegmentsPage(siteId, page, pageSize);

        // TODO: test validations
    }
    /**
     * 
     *
     * Gets a user&#x27;s segments. The set of available headers are: Accept-Language (string), Host (string), User-Agent (string), X-Browser (string), X-Cookies (collection string), X-Device-Brand (string), X-Device-Model (string), X-Device-Screen-Resolution-Height (double), X-Device-Screen-Resolution-Width (double), X-Last-Sign-In-Date-Time (date time) and X-Signed-In (boolean). Local date will be always present in the request.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSiteUserAccountSegmentsPageTest() throws Exception {
        String siteId = null;
        String userAccountId = null;
        PageSegment response = api.getSiteUserAccountSegmentsPage(siteId, userAccountId);

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
    public void postSiteSegmentsPageExportBatchTest() throws Exception {
        String siteId = null;
        String callbackURL = null;
        String contentType = null;
        String fieldNames = null;
        api.postSiteSegmentsPageExportBatch(siteId, callbackURL, contentType, fieldNames);

        // TODO: test validations
    }
}