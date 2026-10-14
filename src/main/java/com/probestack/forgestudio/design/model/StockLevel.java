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
 * Data model describing stock level information.
 */
@Schema(name = "StockLevel", description = "Data model describing stock level information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class StockLevel {

  private Integer productId;

  private Integer warehouseId;

  private Integer quantity;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public StockLevel() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StockLevel(Integer productId, Integer warehouseId, Integer quantity) {
    this.productId = productId;
    this.warehouseId = warehouseId;
    this.quantity = quantity;
  }

  public StockLevel productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * productId value for the StockLevel resource.
   * @return productId
  */
  @NotNull   @Schema(name = "productId", description = "productId value for the StockLevel resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("productId")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public StockLevel warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  /**
   * warehouseId value for the StockLevel resource.
   * @return warehouseId
  */
  @NotNull   @Schema(name = "warehouseId", description = "warehouseId value for the StockLevel resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  public StockLevel quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * quantity value for the StockLevel resource.
   * minimum: 0
   * @return quantity
  */
  @NotNull @Min(0)   @Schema(name = "quantity", description = "quantity value for the StockLevel resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public StockLevel updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * updatedAt value for the StockLevel resource.
   * @return updatedAt
  */
  @Valid   @Schema(name = "updatedAt", description = "updatedAt value for the StockLevel resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockLevel stockLevel = (StockLevel) o;
    return Objects.equals(this.productId, stockLevel.productId) &&
        Objects.equals(this.warehouseId, stockLevel.warehouseId) &&
        Objects.equals(this.quantity, stockLevel.quantity) &&
        Objects.equals(this.updatedAt, stockLevel.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, warehouseId, quantity, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockLevel {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

