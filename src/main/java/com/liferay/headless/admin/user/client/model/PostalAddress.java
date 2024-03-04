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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * A list of user&#x27;s postal addresses, with one optionally marked as primary.
 */
@Schema(description = "A list of user's postal addresses, with one optionally marked as primary.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-04T10:04:24.474623+08:00[Asia/Shanghai]")

public class PostalAddress {
  @SerializedName("addressCountry")
  private String addressCountry = null;

  @SerializedName("addressCountry_i18n")
  private Map<String, String> addressCountryI18n = null;

  @SerializedName("addressLocality")
  private String addressLocality = null;

  @SerializedName("addressRegion")
  private String addressRegion = null;

  @SerializedName("addressType")
  private String addressType = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("primary")
  private Boolean primary = null;

  @SerializedName("streetAddressLine1")
  private String streetAddressLine1 = null;

  @SerializedName("streetAddressLine2")
  private String streetAddressLine2 = null;

  @SerializedName("streetAddressLine3")
  private String streetAddressLine3 = null;

  @SerializedName("x-class-name")
  private String xClassName = "com.liferay.headless.admin.user.dto.v1_0.PostalAddress";

  public PostalAddress addressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
    return this;
  }

   /**
   * The address&#x27;s country (e.g., USA).
   * @return addressCountry
  **/
  @Schema(description = "The address's country (e.g., USA).")
  public String getAddressCountry() {
    return addressCountry;
  }

  public void setAddressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
  }

  public PostalAddress addressCountryI18n(Map<String, String> addressCountryI18n) {
    this.addressCountryI18n = addressCountryI18n;
    return this;
  }

  public PostalAddress putAddressCountryI18nItem(String key, String addressCountryI18nItem) {
    if (this.addressCountryI18n == null) {
      this.addressCountryI18n = new HashMap<String, String>();
    }
    this.addressCountryI18n.put(key, addressCountryI18nItem);
    return this;
  }

   /**
   * Get addressCountryI18n
   * @return addressCountryI18n
  **/
  @Schema(description = "")
  public Map<String, String> getAddressCountryI18n() {
    return addressCountryI18n;
  }

  public void setAddressCountryI18n(Map<String, String> addressCountryI18n) {
    this.addressCountryI18n = addressCountryI18n;
  }

  public PostalAddress addressLocality(String addressLocality) {
    this.addressLocality = addressLocality;
    return this;
  }

   /**
   * The address&#x27;s locality (e.g., city).
   * @return addressLocality
  **/
  @Schema(description = "The address's locality (e.g., city).")
  public String getAddressLocality() {
    return addressLocality;
  }

  public void setAddressLocality(String addressLocality) {
    this.addressLocality = addressLocality;
  }

  public PostalAddress addressRegion(String addressRegion) {
    this.addressRegion = addressRegion;
    return this;
  }

   /**
   * The address&#x27;s region (e.g., state).
   * @return addressRegion
  **/
  @Schema(description = "The address's region (e.g., state).")
  public String getAddressRegion() {
    return addressRegion;
  }

  public void setAddressRegion(String addressRegion) {
    this.addressRegion = addressRegion;
  }

  public PostalAddress addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * The address&#x27;s type.
   * @return addressType
  **/
  @Schema(description = "The address's type.")
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

   /**
   * The address&#x27;s ID.
   * @return id
  **/
  @Schema(description = "The address's ID.")
  public Long getId() {
    return id;
  }

  public PostalAddress name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The address&#x27;s name.
   * @return name
  **/
  @Schema(description = "The address's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostalAddress phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number.
   * @return phoneNumber
  **/
  @Schema(description = "The phone number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PostalAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The address&#x27;s postal code (e.g., zip code).
   * @return postalCode
  **/
  @Schema(description = "The address's postal code (e.g., zip code).")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public PostalAddress primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * A flag that identifies whether this is the main address of the user/organization.
   * @return primary
  **/
  @Schema(description = "A flag that identifies whether this is the main address of the user/organization.")
  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public PostalAddress streetAddressLine1(String streetAddressLine1) {
    this.streetAddressLine1 = streetAddressLine1;
    return this;
  }

   /**
   * The street address&#x27;s first line (e.g., 1600 Amphitheatre Pkwy.).
   * @return streetAddressLine1
  **/
  @Schema(description = "The street address's first line (e.g., 1600 Amphitheatre Pkwy.).")
  public String getStreetAddressLine1() {
    return streetAddressLine1;
  }

  public void setStreetAddressLine1(String streetAddressLine1) {
    this.streetAddressLine1 = streetAddressLine1;
  }

  public PostalAddress streetAddressLine2(String streetAddressLine2) {
    this.streetAddressLine2 = streetAddressLine2;
    return this;
  }

   /**
   * The street address&#x27;s second line.
   * @return streetAddressLine2
  **/
  @Schema(description = "The street address's second line.")
  public String getStreetAddressLine2() {
    return streetAddressLine2;
  }

  public void setStreetAddressLine2(String streetAddressLine2) {
    this.streetAddressLine2 = streetAddressLine2;
  }

  public PostalAddress streetAddressLine3(String streetAddressLine3) {
    this.streetAddressLine3 = streetAddressLine3;
    return this;
  }

   /**
   * The street address&#x27;s third line.
   * @return streetAddressLine3
  **/
  @Schema(description = "The street address's third line.")
  public String getStreetAddressLine3() {
    return streetAddressLine3;
  }

  public void setStreetAddressLine3(String streetAddressLine3) {
    this.streetAddressLine3 = streetAddressLine3;
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
    PostalAddress postalAddress = (PostalAddress) o;
    return Objects.equals(this.addressCountry, postalAddress.addressCountry) &&
        Objects.equals(this.addressCountryI18n, postalAddress.addressCountryI18n) &&
        Objects.equals(this.addressLocality, postalAddress.addressLocality) &&
        Objects.equals(this.addressRegion, postalAddress.addressRegion) &&
        Objects.equals(this.addressType, postalAddress.addressType) &&
        Objects.equals(this.id, postalAddress.id) &&
        Objects.equals(this.name, postalAddress.name) &&
        Objects.equals(this.phoneNumber, postalAddress.phoneNumber) &&
        Objects.equals(this.postalCode, postalAddress.postalCode) &&
        Objects.equals(this.primary, postalAddress.primary) &&
        Objects.equals(this.streetAddressLine1, postalAddress.streetAddressLine1) &&
        Objects.equals(this.streetAddressLine2, postalAddress.streetAddressLine2) &&
        Objects.equals(this.streetAddressLine3, postalAddress.streetAddressLine3) &&
        Objects.equals(this.xClassName, postalAddress.xClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressCountry, addressCountryI18n, addressLocality, addressRegion, addressType, id, name, phoneNumber, postalCode, primary, streetAddressLine1, streetAddressLine2, streetAddressLine3, xClassName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostalAddress {\n");
    
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    addressCountryI18n: ").append(toIndentedString(addressCountryI18n)).append("\n");
    sb.append("    addressLocality: ").append(toIndentedString(addressLocality)).append("\n");
    sb.append("    addressRegion: ").append(toIndentedString(addressRegion)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    streetAddressLine1: ").append(toIndentedString(streetAddressLine1)).append("\n");
    sb.append("    streetAddressLine2: ").append(toIndentedString(streetAddressLine2)).append("\n");
    sb.append("    streetAddressLine3: ").append(toIndentedString(streetAddressLine3)).append("\n");
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
