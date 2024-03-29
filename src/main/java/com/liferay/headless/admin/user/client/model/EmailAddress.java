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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * A list of the user&#x27;s email addresses, with one optionally marked as primary.
 */
@Schema(description = "A list of the user's email addresses, with one optionally marked as primary.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-04T10:04:24.474623+08:00[Asia/Shanghai]")

public class EmailAddress {
  @SerializedName("emailAddress")
  private String emailAddress = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("primary")
  private Boolean primary = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("x-class-name")
  private String xClassName = "com.liferay.headless.admin.user.dto.v1_0.EmailAddress";

  public EmailAddress emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address.
   * @return emailAddress
  **/
  @Schema(description = "The email address.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

   /**
   * The email address&#x27;s ID.
   * @return id
  **/
  @Schema(description = "The email address's ID.")
  public Long getId() {
    return id;
  }

  public EmailAddress primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * A flag that indicates whether this is the main email address of the user/organization.
   * @return primary
  **/
  @Schema(description = "A flag that indicates whether this is the main email address of the user/organization.")
  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public EmailAddress type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The email address&#x27;s type.
   * @return type
  **/
  @Schema(description = "The email address's type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
    EmailAddress emailAddress = (EmailAddress) o;
    return Objects.equals(this.emailAddress, emailAddress.emailAddress) &&
        Objects.equals(this.id, emailAddress.id) &&
        Objects.equals(this.primary, emailAddress.primary) &&
        Objects.equals(this.type, emailAddress.type) &&
        Objects.equals(this.xClassName, emailAddress.xClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, id, primary, type, xClassName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAddress {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
