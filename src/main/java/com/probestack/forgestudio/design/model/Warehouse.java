package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing warehouse information.
 */
@Schema(name = "Warehouse", description = "Data model describing warehouse information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class Warehouse {

  private String name;

  private String location;

  private Integer id;

  public Warehouse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Warehouse(String name, String location, Integer id) {
    this.name = name;
    this.location = location;
    this.id = id;
  }

  public Warehouse name(String name) {
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

  public Warehouse location(String location) {
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

  public Warehouse id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
    @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Warehouse warehouse = (Warehouse) o;
    return Objects.equals(this.name, warehouse.name) &&
        Objects.equals(this.location, warehouse.location) &&
        Objects.equals(this.id, warehouse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warehouse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

