package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing shipment input information.
 */
@Schema(name = "ShipmentInput", description = "Data model describing shipment input information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class ShipmentInput {

  private Integer orderId;

  private String carrier;

  private String trackingNumber;

  public ShipmentInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ShipmentInput(Integer orderId, String carrier, String trackingNumber) {
    this.orderId = orderId;
    this.carrier = carrier;
    this.trackingNumber = trackingNumber;
  }

  public ShipmentInput orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * orderId value for the ShipmentInput resource.
   * minimum: 1
   * @return orderId
  */
  @NotNull @Min(1)   @Schema(name = "orderId", description = "orderId value for the ShipmentInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("orderId")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public ShipmentInput carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * carrier value for the ShipmentInput resource.
   * @return carrier
  */
  @NotNull @Size(min = 2)   @Schema(name = "carrier", description = "carrier value for the ShipmentInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public ShipmentInput trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

  /**
   * trackingNumber value for the ShipmentInput resource.
   * @return trackingNumber
  */
  @NotNull @Size(min = 2)   @Schema(name = "trackingNumber", description = "trackingNumber value for the ShipmentInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trackingNumber")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentInput shipmentInput = (ShipmentInput) o;
    return Objects.equals(this.orderId, shipmentInput.orderId) &&
        Objects.equals(this.carrier, shipmentInput.carrier) &&
        Objects.equals(this.trackingNumber, shipmentInput.trackingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, carrier, trackingNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentInput {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
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

