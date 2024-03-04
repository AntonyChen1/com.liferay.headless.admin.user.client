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
import com.liferay.headless.admin.user.client.model.RoleBrief;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * A list of the user&#x27;s sites.
 */
@Schema(description = "A list of the user's sites.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-04T10:04:24.474623+08:00[Asia/Shanghai]")

public class SiteBrief {
  @SerializedName("descriptiveName")
  private String descriptiveName = null;

  @SerializedName("descriptiveName_i18n")
  private Map<String, String> descriptiveNameI18n = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("name_i18n")
  private Map<String, String> nameI18n = null;

  @SerializedName("roleBriefs")
  private List<RoleBrief> roleBriefs = null;

  @SerializedName("x-class-name")
  private String xClassName = "com.liferay.headless.admin.user.dto.v1_0.SiteBrief";

   /**
   * The site&#x27;s descriptive name.
   * @return descriptiveName
  **/
  @Schema(description = "The site's descriptive name.")
  public String getDescriptiveName() {
    return descriptiveName;
  }

   /**
   * Get descriptiveNameI18n
   * @return descriptiveNameI18n
  **/
  @Schema(description = "")
  public Map<String, String> getDescriptiveNameI18n() {
    return descriptiveNameI18n;
  }

   /**
   * The site&#x27;s ID.
   * @return id
  **/
  @Schema(description = "The site's ID.")
  public Long getId() {
    return id;
  }

   /**
   * The site&#x27;s name.
   * @return name
  **/
  @Schema(description = "The site's name.")
  public String getName() {
    return name;
  }

   /**
   * Get nameI18n
   * @return nameI18n
  **/
  @Schema(description = "")
  public Map<String, String> getNameI18n() {
    return nameI18n;
  }

   /**
   * A list of the user&#x27;s roles.
   * @return roleBriefs
  **/
  @Schema(description = "A list of the user's roles.")
  public List<RoleBrief> getRoleBriefs() {
    return roleBriefs;
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
    SiteBrief siteBrief = (SiteBrief) o;
    return Objects.equals(this.descriptiveName, siteBrief.descriptiveName) &&
        Objects.equals(this.descriptiveNameI18n, siteBrief.descriptiveNameI18n) &&
        Objects.equals(this.id, siteBrief.id) &&
        Objects.equals(this.name, siteBrief.name) &&
        Objects.equals(this.nameI18n, siteBrief.nameI18n) &&
        Objects.equals(this.roleBriefs, siteBrief.roleBriefs) &&
        Objects.equals(this.xClassName, siteBrief.xClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptiveName, descriptiveNameI18n, id, name, nameI18n, roleBriefs, xClassName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteBrief {\n");
    
    sb.append("    descriptiveName: ").append(toIndentedString(descriptiveName)).append("\n");
    sb.append("    descriptiveNameI18n: ").append(toIndentedString(descriptiveNameI18n)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameI18n: ").append(toIndentedString(nameI18n)).append("\n");
    sb.append("    roleBriefs: ").append(toIndentedString(roleBriefs)).append("\n");
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
