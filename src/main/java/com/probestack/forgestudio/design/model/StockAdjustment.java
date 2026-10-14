package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing stock adjustment information.
 */
@Schema(name = "StockAdjustment", description = "Data model describing stock adjustment information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class StockAdjustment {

  private Integer productId;

  private Integer warehouseId;

  private Integer quantityChange;

  private String reason;

  private Integer id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public StockAdjustment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StockAdjustment(Integer productId, Integer warehouseId, Integer quantityChange, String reason, Integer id, OffsetDateTime createdAt) {
    this.productId = productId;
    this.warehouseId = warehouseId;
    this.quantityChange = quantityChange;
    this.reason = reason;
    this.id = id;
    this.createdAt = createdAt;
  }

  public StockAdjustment productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * productId value for the StockAdjustmentInput resource.
   * minimum: 1
   * @return productId
  */
  @NotNull @Min(1)   @Schema(name = "productId", description = "productId value for the StockAdjustmentInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("productId")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public StockAdjustment warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  /**
   * warehouseId value for the StockAdjustmentInput resource.
   * minimum: 1
   * @return warehouseId
  */
  @NotNull @Min(1)   @Schema(name = "warehouseId", description = "warehouseId value for the StockAdjustmentInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  public StockAdjustment quantityChange(Integer quantityChange) {
    this.quantityChange = quantityChange;
    return this;
  }

  /**
   * Signed change to stock. Must be nonzero.
   * @return quantityChange
  */
  @NotNull   @Schema(name = "quantityChange", description = "Signed change to stock. Must be nonzero.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quantityChange")
  public Integer getQuantityChange() {
    return quantityChange;
  }

  public void setQuantityChange(Integer quantityChange) {
    this.quantityChange = quantityChange;
  }

  public StockAdjustment reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * reason value for the StockAdjustmentInput resource.
   * @return reason
  */
  @NotNull @Size(min = 3)   @Schema(name = "reason", description = "reason value for the StockAdjustmentInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public StockAdjustment id(Integer id) {
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

  public StockAdjustment createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @NotNull @Valid   @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockAdjustment stockAdjustment = (StockAdjustment) o;
    return Objects.equals(this.productId, stockAdjustment.productId) &&
        Objects.equals(this.warehouseId, stockAdjustment.warehouseId) &&
        Objects.equals(this.quantityChange, stockAdjustment.quantityChange) &&
        Objects.equals(this.reason, stockAdjustment.reason) &&
        Objects.equals(this.id, stockAdjustment.id) &&
        Objects.equals(this.createdAt, stockAdjustment.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, warehouseId, quantityChange, reason, id, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockAdjustment {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    quantityChange: ").append(toIndentedString(quantityChange)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

