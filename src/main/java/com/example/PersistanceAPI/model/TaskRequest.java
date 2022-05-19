/*
 * MobileAccess v1.3.0
 *  ##### **NaaS API Version:** 2.4.0 ##### **mobileAccess service version:** 1.2.3 ## OVERVIEW TMF 640 - Activation and Configuration API. This is a strategic mobileAccess service aiming to provide network capabilities to products.   **Note: Enum values are case sensitive**
 *
 * OpenAPI spec version: 2.4.5
 * Contact: D1701045@team.telstra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.example.PersistanceAPI.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.example.PersistanceAPI.model.RelatedParty;
import com.example.PersistanceAPI.model.RelatedService;
import com.example.PersistanceAPI.model.TaskCharacteristic;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * TaskRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-11T13:23:04.291Z[GMT]")
public class TaskRequest {
  @SerializedName("relatedService")
  private List<RelatedService> relatedService = new ArrayList<RelatedService>();

  @SerializedName("relatedParty")
  private List<RelatedParty> relatedParty = null;

  @SerializedName("taskCharacteristic")
  private List<TaskCharacteristic> taskCharacteristic = null;

  public TaskRequest relatedService(List<RelatedService> relatedService) {
    this.relatedService = relatedService;
    return this;
  }

  public TaskRequest addRelatedServiceItem(RelatedService relatedServiceItem) {
    this.relatedService.add(relatedServiceItem);
    return this;
  }

   /**
   * SupportingService is a collection of child Service Instances.
   * @return relatedService
  **/
  @Schema(required = true, description = "SupportingService is a collection of child Service Instances.")
  public List<RelatedService> getRelatedService() {
    return relatedService;
  }

  public void setRelatedService(List<RelatedService> relatedService) {
    this.relatedService = relatedService;
  }

  public TaskRequest relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public TaskRequest addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

   /**
   * Consumer group that creates the task instance. Must be provided by consumer so that domain can store this information. This is part of Group ID implementation which will be used by Domain to send asynchronous events and notifications back to consumer.
   * @return relatedParty
  **/
  @Schema(description = "Consumer group that creates the task instance. Must be provided by consumer so that domain can store this information. This is part of Group ID implementation which will be used by Domain to send asynchronous events and notifications back to consumer.")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public TaskRequest taskCharacteristic(List<TaskCharacteristic> taskCharacteristic) {
    this.taskCharacteristic = taskCharacteristic;
    return this;
  }

  public TaskRequest addTaskCharacteristicItem(TaskCharacteristic taskCharacteristicItem) {
    if (this.taskCharacteristic == null) {
      this.taskCharacteristic = new ArrayList<TaskCharacteristic>();
    }
    this.taskCharacteristic.add(taskCharacteristicItem);
    return this;
  }

   /**
   * A list of task characteristics represented as name/value pairs.
   * @return taskCharacteristic
  **/
  @Schema(description = "A list of task characteristics represented as name/value pairs.")
  public List<TaskCharacteristic> getTaskCharacteristic() {
    return taskCharacteristic;
  }

  public void setTaskCharacteristic(List<TaskCharacteristic> taskCharacteristic) {
    this.taskCharacteristic = taskCharacteristic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskRequest taskRequest = (TaskRequest) o;
    return Objects.equals(this.relatedService, taskRequest.relatedService) &&
        Objects.equals(this.relatedParty, taskRequest.relatedParty) &&
        Objects.equals(this.taskCharacteristic, taskRequest.taskCharacteristic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedService, relatedParty, taskCharacteristic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskRequest {\n");
    
    sb.append("    relatedService: ").append(toIndentedString(relatedService)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    taskCharacteristic: ").append(toIndentedString(taskCharacteristic)).append("\n");
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