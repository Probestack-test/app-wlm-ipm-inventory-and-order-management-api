package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing product input information.
 */
@Schema(name = "ProductInput", description = "Data model describing product input information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class ProductInput {

  private String sku;

  private String name;

  private String category;

  private Double price;

  private Boolean active = true;

  public ProductInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductInput(String sku, String name, Double price) {
    this.sku = sku;
    this.name = name;
    this.price = price;
  }

  public ProductInput sku(String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * sku value for the ProductInput resource.
   * @return sku
  */
  @NotNull @Size(min = 1)   @Schema(name = "sku", description = "sku value for the ProductInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public ProductInput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name value for the ProductInput resource.
   * @return name
  */
  @NotNull @Size(min = 2)   @Schema(name = "name", description = "name value for the ProductInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductInput category(String category) {
    this.category = category;
    return this;
  }

  /**
   * category value for the ProductInput resource.
   * @return category
  */
    @Schema(name = "category", description = "category value for the ProductInput resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ProductInput price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * price value for the ProductInput resource.
   * minimum: 0
   * @return price
  */
  @NotNull @DecimalMin("0")   @Schema(name = "price", description = "price value for the ProductInput resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public ProductInput active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * active value for the ProductInput resource.
   * @return active
  */
    @Schema(name = "active", description = "active value for the ProductInput resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductInput productInput = (ProductInput) o;
    return Objects.equals(this.sku, productInput.sku) &&
        Objects.equals(this.name, productInput.name) &&
        Objects.equals(this.category, productInput.category) &&
        Objects.equals(this.price, productInput.price) &&
        Objects.equals(this.active, productInput.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, name, category, price, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductInput {\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

