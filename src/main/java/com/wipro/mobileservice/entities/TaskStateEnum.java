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

package com.wipro.mobileservice.entities;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * state of the task
 */
@JsonAdapter(TaskStateEnum.Adapter.class)
public enum TaskStateEnum {
  INITIAL("Initial"),
  REJECTED("Rejected"),
  CANCELLED("Cancelled"),
  DONE("Done"),
  FINAL("Final"),
  TERMINATED_WITH_ERROR("Terminated with Error"),
  IN_PROGRESS("In Progress");

  private String value;

  TaskStateEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaskStateEnum fromValue(String input) {
    for (TaskStateEnum b : TaskStateEnum.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TaskStateEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaskStateEnum enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public TaskStateEnum read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TaskStateEnum.fromValue((String)(value));
    }
  }
}
