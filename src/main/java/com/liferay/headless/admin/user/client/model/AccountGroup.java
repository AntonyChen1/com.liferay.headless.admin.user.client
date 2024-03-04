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
import com.liferay.headless.admin.user.client.model.CustomField;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * AccountGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-04T10:04:24.474623+08:00[Asia/Shanghai]")

public class AccountGroup {
  @SerializedName("actions")
  private Map<String, Map<String, String>> actions = null;

  @SerializedName("customFields")
  private List<CustomField> customFields = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("externalReferenceCode")
  private String externalReferenceCode = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("x-class-name")
  private String xClassName = "com.liferay.headless.admin.user.dto.v1_0.AccountGroup";

   /**
   * Block of actions allowed by the user making the request.
   * @return actions
  **/
  @Schema(description = "Block of actions allowed by the user making the request.")
  public Map<String, Map<String, String>> getActions() {
    return actions;
  }

  public AccountGroup customFields(List<CustomField> customFields) {
    this.customFields = customFields;
    return this;
  }

  public AccountGroup addCustomFieldsItem(CustomField customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<CustomField>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @Schema(description = "")
  public List<CustomField> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<CustomField> customFields) {
    this.customFields = customFields;
  }

  public AccountGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(example = "AccountGroup Description", description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountGroup externalReferenceCode(String externalReferenceCode) {
    this.externalReferenceCode = externalReferenceCode;
    return this;
  }

   /**
   * Get externalReferenceCode
   * @return externalReferenceCode
  **/
  @Schema(example = "AB-34098-789-N", description = "")
  public String getExternalReferenceCode() {
    return externalReferenceCode;
  }

  public void setExternalReferenceCode(String externalReferenceCode) {
    this.externalReferenceCode = externalReferenceCode;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "30130", description = "")
  public Long getId() {
    return id;
  }

  public AccountGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "AccountGroup Name", required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * Get xClassName
   * @return xClassName
  **/
  @Schema(description = "")
  public String getXClassName() {
    return xClassName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountGroup accountGroup = (AccountGroup) o;
    return Objects.equals(this.actions, accountGroup.actions) &&
        Objects.equals(this.customFields, accountGroup.customFields) &&
        Objects.equals(this.description, accountGroup.description) &&
        Objects.equals(this.externalReferenceCode, accountGroup.externalReferenceCode) &&
        Objects.equals(this.id, accountGroup.id) &&
        Objects.equals(this.name, accountGroup.name) &&
        Objects.equals(this.xClassName, accountGroup.xClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, customFields, description, externalReferenceCode, id, name, xClassName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGroup {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalReferenceCode: ").append(toIndentedString(externalReferenceCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    xClassName: ").append(toIndentedString(xClassName)).append("\n");
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