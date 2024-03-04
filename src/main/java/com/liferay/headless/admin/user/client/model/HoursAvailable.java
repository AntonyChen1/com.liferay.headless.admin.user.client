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
 * A list of hours when the organization is open. This follows the [&#x60;OpeningHoursSpecification&#x60;](https://www.schema.org/OpeningHoursSpecification) specification.
 */
@Schema(description = "A list of hours when the organization is open. This follows the [`OpeningHoursSpecification`](https://www.schema.org/OpeningHoursSpecification) specification.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-04T10:04:24.474623+08:00[Asia/Shanghai]")

public class HoursAvailable {
  @SerializedName("closes")
  private String closes = null;

  @SerializedName("dayOfWeek")
  private String dayOfWeek = null;

  @SerializedName("opens")
  private String opens = null;

  @SerializedName("x-class-name")
  private String xClassName = "com.liferay.headless.admin.user.dto.v1_0.HoursAvailable";

  public HoursAvailable closes(String closes) {
    this.closes = closes;
    return this;
  }

   /**
   * The organization&#x27;s closing time (in &#x60;HH:MM&#x60; format).
   * @return closes
  **/
  @Schema(description = "The organization's closing time (in `HH:MM` format).")
  public String getCloses() {
    return closes;
  }

  public void setCloses(String closes) {
    this.closes = closes;
  }

  public HoursAvailable dayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * The day of the week.
   * @return dayOfWeek
  **/
  @Schema(description = "The day of the week.")
  public String getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public HoursAvailable opens(String opens) {
    this.opens = opens;
    return this;
  }

   /**
   * The organization&#x27;s opening time (in &#x60;HH:MM&#x60; format).
   * @return opens
  **/
  @Schema(description = "The organization's opening time (in `HH:MM` format).")
  public String getOpens() {
    return opens;
  }

  public void setOpens(String opens) {
    this.opens = opens;
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
    HoursAvailable hoursAvailable = (HoursAvailable) o;
    return Objects.equals(this.closes, hoursAvailable.closes) &&
        Objects.equals(this.dayOfWeek, hoursAvailable.dayOfWeek) &&
        Objects.equals(this.opens, hoursAvailable.opens) &&
        Objects.equals(this.xClassName, hoursAvailable.xClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closes, dayOfWeek, opens, xClassName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoursAvailable {\n");
    
    sb.append("    closes: ").append(toIndentedString(closes)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
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