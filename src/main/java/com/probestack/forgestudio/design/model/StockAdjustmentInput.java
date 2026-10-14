package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing stock adjustment input information.
 */
@Schema(name = "StockAdjustmentInput", description = "Data model describing stock adjustment input information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class StockAdjustmentInput {

  private Integer productId;

  private Integer warehouseId;

  private Integer quantityChange;

  private String reason;

  public StockAdjustmentInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StockAdjustmentInput(Integer productId, Integer warehouseId, Integer quantityChange, String reason) {
    this.productId = productId;
    this.warehouseId = warehouseId;
    this.quantityChange = quantityChange;
    this.reason = reason;
  }

  public StockAdjustmentInput productId(Integer productId) {
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

  public StockAdjustmentInput warehouseId(Integer warehouseId) {
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

  public StockAdjustmentInput quantityChange(Integer quantityChange) {
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

  public StockAdjustmentInput reason(String reason) {
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
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockAdjustmentInput stockAdjustmentInput = (StockAdjustmentInput) o;
    return Objects.equals(this.productId, stockAdjustmentInput.productId) &&
        Objects.equals(this.warehouseId, stockAdjustmentInput.warehouseId) &&
        Objects.equals(this.quantityChange, stockAdjustmentInput.quantityChange) &&
        Objects.equals(this.reason, stockAdjustmentInput.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, warehouseId, quantityChange, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockAdjustmentInput {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    quantityChange: ").append(toIndentedString(quantityChange)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

