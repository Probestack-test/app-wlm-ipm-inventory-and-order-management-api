package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data model describing auth token information.
 */
@Schema(name = "AuthToken", description = "Data model describing auth token information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")public class AuthToken {

  private String accessToken;

  private String tokenType;

  private Integer expiresIn;

  public AuthToken() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuthToken(String accessToken, String tokenType, Integer expiresIn) {
    this.accessToken = accessToken;
    this.tokenType = tokenType;
    this.expiresIn = expiresIn;
  }

  public AuthToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * accessToken value for the AuthToken resource.
   * @return accessToken
  */
  @NotNull   @Schema(name = "accessToken", description = "accessToken value for the AuthToken resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accessToken")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AuthToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * tokenType value for the AuthToken resource.
   * @return tokenType
  */
  @NotNull   @Schema(name = "tokenType", example = "Bearer", description = "tokenType value for the AuthToken resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tokenType")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public AuthToken expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * expiresIn value for the AuthToken resource.
   * @return expiresIn
  */
  @NotNull   @Schema(name = "expiresIn", example = "3600", description = "expiresIn value for the AuthToken resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expiresIn")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthToken authToken = (AuthToken) o;
    return Objects.equals(this.accessToken, authToken.accessToken) &&
        Objects.equals(this.tokenType, authToken.tokenType) &&
        Objects.equals(this.expiresIn, authToken.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, expiresIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthToken {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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

