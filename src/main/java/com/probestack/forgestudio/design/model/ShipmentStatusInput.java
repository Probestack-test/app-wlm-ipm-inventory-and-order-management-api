package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing shipment status input information.
 */
@Schema(name = "ShipmentStatusInput", description = "Data model describing shipment status input information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class ShipmentStatusInput {

  /**
   * status value for the ShipmentStatusInput resource.
   */
  public enum StatusEnum {
    CREATED("CREATED"),
    
    IN_TRANSIT("IN_TRANSIT"),
    
    DELIVERED("DELIVERED"),
    
    RETURNED("RETURNED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  public ShipmentStatusInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ShipmentStatusInput(StatusEnum status) {
    this.status = status;
  }

  public ShipmentStatusInput status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * status value for the ShipmentStatusInput resource.
   * @return status
  */
  @NotNull   @Schema(name = "status", description = "status value for the ShipmentStatusInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentStatusInput shipmentStatusInput = (ShipmentStatusInput) o;
    return Objects.equals(this.status, shipmentStatusInput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentStatusInput {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

