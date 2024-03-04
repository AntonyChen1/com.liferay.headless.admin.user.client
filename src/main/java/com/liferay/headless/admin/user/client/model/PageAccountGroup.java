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

package com.liferay.headless.admin.user.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.liferay.headless.admin.user.client.model.AccountGroup;
import com.liferay.headless.admin.user.client.model.Facet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * PageAccountGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-04T10:04:24.474623+08:00[Asia/Shanghai]")

public class PageAccountGroup {
  @SerializedName("items")
  private List<AccountGroup> items = null;

  @SerializedName("lastPage")
  private Long lastPage = null;

  @SerializedName("totalCount")
  private Long totalCount = null;

  @SerializedName("actions")
  private Map<String, Map<String, String>> actions = null;

  @SerializedName("facets")
  private List<Facet> facets = null;

  @SerializedName("pageSize")
  private Long pageSize = null;

  @SerializedName("page")
  private Long page = null;

  public PageAccountGroup items(List<AccountGroup> items) {
    this.items = items;
    return this;
  }

  public PageAccountGroup addItemsItem(AccountGroup itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<AccountGroup>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<AccountGroup> getItems() {
    return items;
  }

  public void setItems(List<AccountGroup> items) {
    this.items = items;
  }

  public PageAccountGroup lastPage(Long lastPage) {
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Get lastPage
   * @return lastPage
  **/
  @Schema(description = "")
  public Long getLastPage() {
    return lastPage;
  }

  public void setLastPage(Long lastPage) {
    this.lastPage = lastPage;
  }

  public PageAccountGroup totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public PageAccountGroup actions(Map<String, Map<String, String>> actions) {
    this.actions = actions;
    return this;
  }

  public PageAccountGroup putActionsItem(String key, Map<String, String> actionsItem) {
    if (this.actions == null) {
      this.actions = new HashMap<String, Map<String, String>>();
    }
    this.actions.put(key, actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @Schema(description = "")
  public Map<String, Map<String, String>> getActions() {
    return actions;
  }

  public void setActions(Map<String, Map<String, String>> actions) {
    this.actions = actions;
  }

  public PageAccountGroup facets(List<Facet> facets) {
    this.facets = facets;
    return this;
  }

  public PageAccountGroup addFacetsItem(Facet facetsItem) {
    if (this.facets == null) {
      this.facets = new ArrayList<Facet>();
    }
    this.facets.add(facetsItem);
    return this;
  }

   /**
   * Get facets
   * @return facets
  **/
  @Schema(description = "")
  public List<Facet> getFacets() {
    return facets;
  }

  public void setFacets(List<Facet> facets) {
    this.facets = facets;
  }

  public PageAccountGroup pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public PageAccountGroup page(Long page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @Schema(description = "")
  public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageAccountGroup pageAccountGroup = (PageAccountGroup) o;
    return Objects.equals(this.items, pageAccountGroup.items) &&
        Objects.equals(this.lastPage, pageAccountGroup.lastPage) &&
        Objects.equals(this.totalCount, pageAccountGroup.totalCount) &&
        Objects.equals(this.actions, pageAccountGroup.actions) &&
        Objects.equals(this.facets, pageAccountGroup.facets) &&
        Objects.equals(this.pageSize, pageAccountGroup.pageSize) &&
        Objects.equals(this.page, pageAccountGroup.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, lastPage, totalCount, actions, facets, pageSize, page);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageAccountGroup {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
