/*
 * MercadoLibre API
 * MercadoLibre API Documentation.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

//Gerardo Ornelas
/**
 * Rule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class Rule {
  @JsonProperty("free_mode")
  private String freeMode = null;
  
  @JsonProperty("free_shipping_flag")
  private Boolean freeShippingFlag = null;
  
  @JsonProperty("value")
  private String value = null;
  
  //free_mode
  public Rule freeMode(String freeMode) {
    this.freeMode = freeMode;
    return this;
  }

  /**
   * Get freeMode
   * @return freeMode
  **/
  @ApiModelProperty(value = "")
  public String getFreeMode() {
    return freeMode;
  }

  public void setFreeMode(String freeMode) {
    this.freeMode = freeMode;
  }
  
  //freeShippingFlag
  public Rule freeShippingFlag(Boolean freeShippingFlag) {
    this.freeShippingFlag = freeShippingFlag;
    return this;
  }

  /**
   * Get freeShippingFlag
   * @return freeShippingFlag
  **/
  @ApiModelProperty(value = "")
  public Boolean getFreeShippingFlag() {
    return freeShippingFlag;
  }

  public void setFreeShippingFlag(Boolean freeShippingFlag) {
    this.freeShippingFlag = freeShippingFlag;
  }
  
  //value
  public Rule value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.freeMode, rule.freeMode) &&
        Objects.equals(this.freeShippingFlag, rule.freeShippingFlag) &&
        Objects.equals(this.value, rule.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeMode, freeShippingFlag, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    
    sb.append("    freeMode: ").append(toIndentedString(freeMode)).append("\n");
    sb.append("    freeShippingFlag: ").append(toIndentedString(freeShippingFlag)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

