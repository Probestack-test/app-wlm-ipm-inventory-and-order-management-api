package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing order item information.
 */
@Schema(name = "OrderItem", description = "Data model describing order item information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class OrderItem {

  private Integer productId;

  private Integer quantity;

  private Double unitPrice;

  public OrderItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderItem(Integer productId, Integer quantity, Double unitPrice) {
    this.productId = productId;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public OrderItem productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * productId value for the OrderItemInput resource.
   * minimum: 1
   * @return productId
  */
  @NotNull @Min(1)   @Schema(name = "productId", description = "productId value for the OrderItemInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("productId")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public OrderItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * quantity value for the OrderItemInput resource.
   * minimum: 1
   * @return quantity
  */
  @NotNull @Min(1)   @Schema(name = "quantity", description = "quantity value for the OrderItemInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderItem unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Get unitPrice
   * minimum: 0
   * @return unitPrice
  */
  @NotNull @DecimalMin("0")   @Schema(name = "unitPrice", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("unitPrice")
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.productId, orderItem.productId) &&
        Objects.equals(this.quantity, orderItem.quantity) &&
        Objects.equals(this.unitPrice, orderItem.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, quantity, unitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

