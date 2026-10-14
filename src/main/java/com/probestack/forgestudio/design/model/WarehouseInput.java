package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing warehouse input information.
 */
@Schema(name = "WarehouseInput", description = "Data model describing warehouse input information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class WarehouseInput {

  private String name;

  private String location;

  public WarehouseInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WarehouseInput(String name, String location) {
    this.name = name;
    this.location = location;
  }

  public WarehouseInput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name value for the WarehouseInput resource.
   * @return name
  */
  @NotNull @Size(min = 2)   @Schema(name = "name", description = "name value for the WarehouseInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WarehouseInput location(String location) {
    this.location = location;
    return this;
  }

  /**
   * location value for the WarehouseInput resource.
   * @return location
  */
  @NotNull @Size(min = 2)   @Schema(name = "location", description = "location value for the WarehouseInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarehouseInput warehouseInput = (WarehouseInput) o;
    return Objects.equals(this.name, warehouseInput.name) &&
        Objects.equals(this.location, warehouseInput.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehouseInput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

