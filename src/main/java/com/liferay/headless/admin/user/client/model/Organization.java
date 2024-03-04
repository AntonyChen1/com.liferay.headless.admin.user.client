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
import com.liferay.headless.admin.user.client.model.Account;
import com.liferay.headless.admin.user.client.model.CustomField;
import com.liferay.headless.admin.user.client.model.Location;
import com.liferay.headless.admin.user.client.model.Organization;
import com.liferay.headless.admin.user.client.model.OrganizationContactInformation;
import com.liferay.headless.admin.user.client.model.Service;
import com.liferay.headless.admin.user.client.model.UserAccount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
/**
 * Organization
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-04T10:04:24.474623+08:00[Asia/Shanghai]")

public class Organization {
  @SerializedName("actions")
  private Map<String, Map<String, String>> actions = null;

  @SerializedName("childOrganizations")
  private List<Organization> childOrganizations = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("customFields")
  private List<CustomField> customFields = null;

  @SerializedName("dateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("dateModified")
  private OffsetDateTime dateModified = null;

  @SerializedName("externalReferenceCode")
  private String externalReferenceCode = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("keywords")
  private List<String> keywords = null;

  @SerializedName("location")
  private Location location = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("numberOfAccounts")
  private Integer numberOfAccounts = null;

  @SerializedName("numberOfOrganizations")
  private Integer numberOfOrganizations = null;

  @SerializedName("numberOfUsers")
  private Integer numberOfUsers = null;

  @SerializedName("organizationAccounts")
  private List<Account> organizationAccounts = null;

  @SerializedName("organizationContactInformation")
  private OrganizationContactInformation organizationContactInformation = null;

  @SerializedName("parentOrganization")
  private Organization parentOrganization = null;

  @SerializedName("services")
  private List<Service> services = null;

  @SerializedName("treePath")
  private String treePath = null;

  @SerializedName("userAccounts")
  private List<UserAccount> userAccounts = null;

  @SerializedName("x-class-name")
  private String xClassName = "com.liferay.headless.admin.user.dto.v1_0.Organization";

   /**
   * Get actions
   * @return actions
  **/
  @Schema(description = "")
  public Map<String, Map<String, String>> getActions() {
    return actions;
  }

  public Organization childOrganizations(List<Organization> childOrganizations) {
    this.childOrganizations = childOrganizations;
    return this;
  }

  public Organization addChildOrganizationsItem(Organization childOrganizationsItem) {
    if (this.childOrganizations == null) {
      this.childOrganizations = new ArrayList<Organization>();
    }
    this.childOrganizations.add(childOrganizationsItem);
    return this;
  }

   /**
   * Get childOrganizations
   * @return childOrganizations
  **/
  @Schema(description = "")
  public List<Organization> getChildOrganizations() {
    return childOrganizations;
  }

  public void setChildOrganizations(List<Organization> childOrganizations) {
    this.childOrganizations = childOrganizations;
  }

  public Organization comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * The text of a comment associated with the organization.
   * @return comment
  **/
  @Schema(description = "The text of a comment associated with the organization.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Organization customFields(List<CustomField> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Organization addCustomFieldsItem(CustomField customFieldsItem) {
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

   /**
   * The organization&#x27;s creation date.
   * @return dateCreated
  **/
  @Schema(description = "The organization's creation date.")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

   /**
   * The most recent time any of the organization&#x27;s fields changed.
   * @return dateModified
  **/
  @Schema(description = "The most recent time any of the organization's fields changed.")
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public Organization externalReferenceCode(String externalReferenceCode) {
    this.externalReferenceCode = externalReferenceCode;
    return this;
  }

   /**
   * The optional external key of this organization.
   * @return externalReferenceCode
  **/
  @Schema(description = "The optional external key of this organization.")
  public String getExternalReferenceCode() {
    return externalReferenceCode;
  }

  public void setExternalReferenceCode(String externalReferenceCode) {
    this.externalReferenceCode = externalReferenceCode;
  }

  public Organization id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The organization&#x27;s ID.
   * @return id
  **/
  @Schema(description = "The organization's ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * A relative URL to the organization&#x27;s image.
   * @return image
  **/
  @Schema(description = "A relative URL to the organization's image.")
  public String getImage() {
    return image;
  }

   /**
   * A list of keywords describing the organization.
   * @return keywords
  **/
  @Schema(description = "A list of keywords describing the organization.")
  public List<String> getKeywords() {
    return keywords;
  }

  public Organization location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @Schema(description = "")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Organization name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The organization&#x27;s name.
   * @return name
  **/
  @Schema(description = "The organization's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * The number of this organization&#x27;s associated accounts.
   * @return numberOfAccounts
  **/
  @Schema(description = "The number of this organization's associated accounts.")
  public Integer getNumberOfAccounts() {
    return numberOfAccounts;
  }

   /**
   * The number of this organization&#x27;s child organizations.
   * @return numberOfOrganizations
  **/
  @Schema(description = "The number of this organization's child organizations.")
  public Integer getNumberOfOrganizations() {
    return numberOfOrganizations;
  }

   /**
   * The number of this organization&#x27;s associated users.
   * @return numberOfUsers
  **/
  @Schema(description = "The number of this organization's associated users.")
  public Integer getNumberOfUsers() {
    return numberOfUsers;
  }

  public Organization organizationAccounts(List<Account> organizationAccounts) {
    this.organizationAccounts = organizationAccounts;
    return this;
  }

  public Organization addOrganizationAccountsItem(Account organizationAccountsItem) {
    if (this.organizationAccounts == null) {
      this.organizationAccounts = new ArrayList<Account>();
    }
    this.organizationAccounts.add(organizationAccountsItem);
    return this;
  }

   /**
   * Get organizationAccounts
   * @return organizationAccounts
  **/
  @Schema(description = "")
  public List<Account> getOrganizationAccounts() {
    return organizationAccounts;
  }

  public void setOrganizationAccounts(List<Account> organizationAccounts) {
    this.organizationAccounts = organizationAccounts;
  }

  public Organization organizationContactInformation(OrganizationContactInformation organizationContactInformation) {
    this.organizationContactInformation = organizationContactInformation;
    return this;
  }

   /**
   * Get organizationContactInformation
   * @return organizationContactInformation
  **/
  @Schema(description = "")
  public OrganizationContactInformation getOrganizationContactInformation() {
    return organizationContactInformation;
  }

  public void setOrganizationContactInformation(OrganizationContactInformation organizationContactInformation) {
    this.organizationContactInformation = organizationContactInformation;
  }

  public Organization parentOrganization(Organization parentOrganization) {
    this.parentOrganization = parentOrganization;
    return this;
  }

   /**
   * Get parentOrganization
   * @return parentOrganization
  **/
  @Schema(description = "")
  public Organization getParentOrganization() {
    return parentOrganization;
  }

  public void setParentOrganization(Organization parentOrganization) {
    this.parentOrganization = parentOrganization;
  }

  public Organization services(List<Service> services) {
    this.services = services;
    return this;
  }

  public Organization addServicesItem(Service servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<Service>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * A list of services the organization provides. This follows the [&#x60;Service&#x60;](https://www.schema.org/Service) specification.
   * @return services
  **/
  @Schema(description = "A list of services the organization provides. This follows the [`Service`](https://www.schema.org/Service) specification.")
  public List<Service> getServices() {
    return services;
  }

  public void setServices(List<Service> services) {
    this.services = services;
  }

  public Organization treePath(String treePath) {
    this.treePath = treePath;
    return this;
  }

   /**
   * The tree path of the organization.
   * @return treePath
  **/
  @Schema(description = "The tree path of the organization.")
  public String getTreePath() {
    return treePath;
  }

  public void setTreePath(String treePath) {
    this.treePath = treePath;
  }

  public Organization userAccounts(List<UserAccount> userAccounts) {
    this.userAccounts = userAccounts;
    return this;
  }

  public Organization addUserAccountsItem(UserAccount userAccountsItem) {
    if (this.userAccounts == null) {
      this.userAccounts = new ArrayList<UserAccount>();
    }
    this.userAccounts.add(userAccountsItem);
    return this;
  }

   /**
   * Get userAccounts
   * @return userAccounts
  **/
  @Schema(description = "")
  public List<UserAccount> getUserAccounts() {
    return userAccounts;
  }

  public void setUserAccounts(List<UserAccount> userAccounts) {
    this.userAccounts = userAccounts;
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
    Organization organization = (Organization) o;
    return Objects.equals(this.actions, organization.actions) &&
        Objects.equals(this.childOrganizations, organization.childOrganizations) &&
        Objects.equals(this.comment, organization.comment) &&
        Objects.equals(this.customFields, organization.customFields) &&
        Objects.equals(this.dateCreated, organization.dateCreated) &&
        Objects.equals(this.dateModified, organization.dateModified) &&
        Objects.equals(this.externalReferenceCode, organization.externalReferenceCode) &&
        Objects.equals(this.id, organization.id) &&
        Objects.equals(this.image, organization.image) &&
        Objects.equals(this.keywords, organization.keywords) &&
        Objects.equals(this.location, organization.location) &&
        Objects.equals(this.name, organization.name) &&
        Objects.equals(this.numberOfAccounts, organization.numberOfAccounts) &&
        Objects.equals(this.numberOfOrganizations, organization.numberOfOrganizations) &&
        Objects.equals(this.numberOfUsers, organization.numberOfUsers) &&
        Objects.equals(this.organizationAccounts, organization.organizationAccounts) &&
        Objects.equals(this.organizationContactInformation, organization.organizationContactInformation) &&
        Objects.equals(this.parentOrganization, organization.parentOrganization) &&
        Objects.equals(this.services, organization.services) &&
        Objects.equals(this.treePath, organization.treePath) &&
        Objects.equals(this.userAccounts, organization.userAccounts) &&
        Objects.equals(this.xClassName, organization.xClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, childOrganizations, comment, customFields, dateCreated, dateModified, externalReferenceCode, id, image, keywords, location, name, numberOfAccounts, numberOfOrganizations, numberOfUsers, organizationAccounts, organizationContactInformation, parentOrganization, services, treePath, userAccounts, xClassName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    childOrganizations: ").append(toIndentedString(childOrganizations)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    externalReferenceCode: ").append(toIndentedString(externalReferenceCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberOfAccounts: ").append(toIndentedString(numberOfAccounts)).append("\n");
    sb.append("    numberOfOrganizations: ").append(toIndentedString(numberOfOrganizations)).append("\n");
    sb.append("    numberOfUsers: ").append(toIndentedString(numberOfUsers)).append("\n");
    sb.append("    organizationAccounts: ").append(toIndentedString(organizationAccounts)).append("\n");
    sb.append("    organizationContactInformation: ").append(toIndentedString(organizationContactInformation)).append("\n");
    sb.append("    parentOrganization: ").append(toIndentedString(parentOrganization)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    treePath: ").append(toIndentedString(treePath)).append("\n");
    sb.append("    userAccounts: ").append(toIndentedString(userAccounts)).append("\n");
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
