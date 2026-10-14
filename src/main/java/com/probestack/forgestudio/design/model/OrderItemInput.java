package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing order item input information.
 */
@Schema(name = "OrderItemInput", description = "Data model describing order item input information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class OrderItemInput {

  private Integer productId;

  private Integer quantity;

  public OrderItemInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderItemInput(Integer productId, Integer quantity) {
    this.productId = productId;
    this.quantity = quantity;
  }

  public OrderItemInput productId(Integer productId) {
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

  public OrderItemInput quantity(Integer quantity) {
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
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemInput orderItemInput = (OrderItemInput) o;
    return Objects.equals(this.productId, orderItemInput.productId) &&
        Objects.equals(this.quantity, orderItemInput.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemInput {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

