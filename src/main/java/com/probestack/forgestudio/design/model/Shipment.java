package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing shipment information.
 */
@Schema(name = "Shipment", description = "Data model describing shipment information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class Shipment {

  private Integer orderId;

  private String carrier;

  private String trackingNumber;

  private Integer id;

  /**
   * Gets or Sets status
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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> shippedAt = JsonNullable.<OffsetDateTime>undefined();

  public Shipment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Shipment(Integer orderId, String carrier, String trackingNumber, Integer id, StatusEnum status) {
    this.orderId = orderId;
    this.carrier = carrier;
    this.trackingNumber = trackingNumber;
    this.id = id;
    this.status = status;
  }

  public Shipment orderId(Integer orderId) {
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

  public Shipment carrier(String carrier) {
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

  public Shipment trackingNumber(String trackingNumber) {
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

  public Shipment id(Integer id) {
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

  public Shipment status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Shipment shippedAt(OffsetDateTime shippedAt) {
    this.shippedAt = JsonNullable.of(shippedAt);
    return this;
  }

  /**
   * Get shippedAt
   * @return shippedAt
  */
  @Valid   @Schema(name = "shippedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippedAt")
  public JsonNullable<OffsetDateTime> getShippedAt() {
    return shippedAt;
  }

  public void setShippedAt(JsonNullable<OffsetDateTime> shippedAt) {
    this.shippedAt = shippedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.orderId, shipment.orderId) &&
        Objects.equals(this.carrier, shipment.carrier) &&
        Objects.equals(this.trackingNumber, shipment.trackingNumber) &&
        Objects.equals(this.id, shipment.id) &&
        Objects.equals(this.status, shipment.status) &&
        equalsNullable(this.shippedAt, shipment.shippedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, carrier, trackingNumber, id, status, hashCodeNullable(shippedAt));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    shippedAt: ").append(toIndentedString(shippedAt)).append("\n");
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

