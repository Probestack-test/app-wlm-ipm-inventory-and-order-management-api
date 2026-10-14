package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.OrderItemInput;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing order input information.
 */
@Schema(name = "OrderInput", description = "Data model describing order input information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class OrderInput {

  private String customerEmail;

  @Valid
  private List<@Valid OrderItemInput> items = new ArrayList<>();

  private String shippingAddress;

  public OrderInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderInput(String customerEmail, List<@Valid OrderItemInput> items, String shippingAddress) {
    this.customerEmail = customerEmail;
    this.items = items;
    this.shippingAddress = shippingAddress;
  }

  public OrderInput customerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
    return this;
  }

  /**
   * customerEmail value for the OrderInput resource.
   * @return customerEmail
  */
  @NotNull @jakarta.validation.constraints.Email   @Schema(name = "customerEmail", description = "customerEmail value for the OrderInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customerEmail")
  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public OrderInput items(List<@Valid OrderItemInput> items) {
    this.items = items;
    return this;
  }

  public OrderInput addItemsItem(OrderItemInput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * items value for the OrderInput resource.
   * @return items
  */
  @NotNull @Valid @Size(min = 1)   @Schema(name = "items", description = "items value for the OrderInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid OrderItemInput> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderItemInput> items) {
    this.items = items;
  }

  public OrderInput shippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

  /**
   * shippingAddress value for the OrderInput resource.
   * @return shippingAddress
  */
  @NotNull @Size(min = 5)   @Schema(name = "shippingAddress", description = "shippingAddress value for the OrderInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("shippingAddress")
  public String getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderInput orderInput = (OrderInput) o;
    return Objects.equals(this.customerEmail, orderInput.customerEmail) &&
        Objects.equals(this.items, orderInput.items) &&
        Objects.equals(this.shippingAddress, orderInput.shippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerEmail, items, shippingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderInput {\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
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

