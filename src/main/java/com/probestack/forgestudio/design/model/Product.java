package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing product information.
 */
@Schema(name = "Product", description = "Data model describing product information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class Product {

  private String sku;

  private String name;

  private String category;

  private Double price;

  private Boolean active = true;

  private Integer id;

  public Product() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Product(String sku, String name, Double price, Integer id) {
    this.sku = sku;
    this.name = name;
    this.price = price;
    this.id = id;
  }

  public Product sku(String sku) {
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

  public Product name(String name) {
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

  public Product category(String category) {
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

  public Product price(Double price) {
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

  public Product active(Boolean active) {
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

  public Product id(Integer id) {
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
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.sku, product.sku) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.category, product.category) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.active, product.active) &&
        Objects.equals(this.id, product.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, name, category, price, active, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

