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
 * WebUrl
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-04T10:04:24.474623+08:00[Asia/Shanghai]")

public class WebUrl {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("primary")
  private Boolean primary = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("urlType")
  private String urlType = null;

  @SerializedName("x-class-name")
  private String xClassName = "com.liferay.headless.admin.user.dto.v1_0.WebUrl";

  public WebUrl id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The URL&#x27;s ID.
   * @return id
  **/
  @Schema(description = "The URL's ID.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public WebUrl primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * A flag that identifies whether this is the main web address of the user/organization.
   * @return primary
  **/
  @Schema(description = "A flag that identifies whether this is the main web address of the user/organization.")
  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public WebUrl url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The absolute URL.
   * @return url
  **/
  @Schema(description = "The absolute URL.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebUrl urlType(String urlType) {
    this.urlType = urlType;
    return this;
  }

   /**
   * The URL&#x27;s type.
   * @return urlType
  **/
  @Schema(description = "The URL's type.")
  public String getUrlType() {
    return urlType;
  }

  public void setUrlType(String urlType) {
    this.urlType = urlType;
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
    WebUrl webUrl = (WebUrl) o;
    return Objects.equals(this.id, webUrl.id) &&
        Objects.equals(this.primary, webUrl.primary) &&
        Objects.equals(this.url, webUrl.url) &&
        Objects.equals(this.urlType, webUrl.urlType) &&
        Objects.equals(this.xClassName, webUrl.xClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, primary, url, urlType, xClassName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebUrl {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlType: ").append(toIndentedString(urlType)).append("\n");
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
