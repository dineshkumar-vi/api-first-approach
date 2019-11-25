package com.apifirst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-25T00:07:42.828-06:00")

public class Cart   {
  /**
   * Cart Type - Origin Device.
   */
  public enum TypeEnum {
    IOS("iOS"),
    
    DESKTOP("Desktop"),
    
    BROWSEREXTENSION("BrowserExtension"),
    
    POS("POS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("productName")
  private String productName = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("SKU")
  private String SKU = null;

  @JsonProperty("avilability")
  private Boolean avilability = null;

  public Cart type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Cart Type - Origin Device.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Cart Type - Origin Device.")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Cart productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Product Name.
   * @return productName
  **/
  @ApiModelProperty(required = true, value = "Product Name.")
  @NotNull


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Cart quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Product Quantity.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Product Quantity.")
  @NotNull


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Cart SKU(String SKU) {
    this.SKU = SKU;
    return this;
  }

   /**
   * Product Sku number.
   * @return SKU
  **/
  @ApiModelProperty(value = "Product Sku number.")


  public String getSKU() {
    return SKU;
  }

  public void setSKU(String SKU) {
    this.SKU = SKU;
  }

  public Cart avilability(Boolean avilability) {
    this.avilability = avilability;
    return this;
  }

   /**
   * Product avilable in the regitsry or not.
   * @return avilability
  **/
  @ApiModelProperty(value = "Product avilable in the regitsry or not.")


  public Boolean getAvilability() {
    return avilability;
  }

  public void setAvilability(Boolean avilability) {
    this.avilability = avilability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cart cart = (Cart) o;
    return Objects.equals(this.type, cart.type) &&
        Objects.equals(this.productName, cart.productName) &&
        Objects.equals(this.quantity, cart.quantity) &&
        Objects.equals(this.SKU, cart.SKU) &&
        Objects.equals(this.avilability, cart.avilability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, productName, quantity, SKU, avilability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    SKU: ").append(toIndentedString(SKU)).append("\n");
    sb.append("    avilability: ").append(toIndentedString(avilability)).append("\n");
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

