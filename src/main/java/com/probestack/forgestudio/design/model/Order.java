package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.OrderItem;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing order information.
 */
@Schema(name = "Order", description = "Data model describing order information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class Order {

  private Integer id;

  private String customerEmail;

  @Valid
  private List<@Valid OrderItem> items = new ArrayList<>();

  private String shippingAddress;

  /**
   * status value for the Order resource.
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    CONFIRMED("CONFIRMED"),
    
    SHIPPED("SHIPPED"),
    
    CANCELLED("CANCELLED");

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

  private Double totalAmount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public Order() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Order(Integer id, String customerEmail, List<@Valid OrderItem> items, String shippingAddress, StatusEnum status, Double totalAmount) {
    this.id = id;
    this.customerEmail = customerEmail;
    this.items = items;
    this.shippingAddress = shippingAddress;
    this.status = status;
    this.totalAmount = totalAmount;
  }

  public Order id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id value for the Order resource.
   * @return id
  */
    @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "id value for the Order resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Order customerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
    return this;
  }

  /**
   * customerEmail value for the Order resource.
   * @return customerEmail
  */
  @NotNull @jakarta.validation.constraints.Email   @Schema(name = "customerEmail", description = "customerEmail value for the Order resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customerEmail")
  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public Order items(List<@Valid OrderItem> items) {
    this.items = items;
    return this;
  }

  public Order addItemsItem(OrderItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * items value for the Order resource.
   * @return items
  */
  @NotNull @Valid   @Schema(name = "items", description = "items value for the Order resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid OrderItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderItem> items) {
    this.items = items;
  }

  public Order shippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

  /**
   * shippingAddress value for the Order resource.
   * @return shippingAddress
  */
  @NotNull   @Schema(name = "shippingAddress", description = "shippingAddress value for the Order resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("shippingAddress")
  public String getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * status value for the Order resource.
   * @return status
  */
  @NotNull   @Schema(name = "status", description = "status value for the Order resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Order totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * totalAmount value for the Order resource.
   * minimum: 0
   * @return totalAmount
  */
  @NotNull @DecimalMin("0")   @Schema(name = "totalAmount", description = "totalAmount value for the Order resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalAmount")
  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Order createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * createdAt value for the Order resource.
   * @return createdAt
  */
  @Valid   @Schema(name = "createdAt", description = "createdAt value for the Order resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.customerEmail, order.customerEmail) &&
        Objects.equals(this.items, order.items) &&
        Objects.equals(this.shippingAddress, order.shippingAddress) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.totalAmount, order.totalAmount) &&
        Objects.equals(this.createdAt, order.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerEmail, items, shippingAddress, status, totalAmount, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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

