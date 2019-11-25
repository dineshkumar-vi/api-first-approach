package com.apifirst.model;

import java.util.Objects;
import com.apifirst.model.Cart;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Carts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-25T00:07:42.828-06:00")

public class Carts   {
  @JsonProperty("award")
  private List<Cart> award = null;

  public Carts award(List<Cart> award) {
    this.award = award;
    return this;
  }

  public Carts addAwardItem(Cart awardItem) {
    if (this.award == null) {
      this.award = new ArrayList<Cart>();
    }
    this.award.add(awardItem);
    return this;
  }

   /**
   * Get award
   * @return award
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Cart> getAward() {
    return award;
  }

  public void setAward(List<Cart> award) {
    this.award = award;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carts carts = (Carts) o;
    return Objects.equals(this.award, carts.award);
  }

  @Override
  public int hashCode() {
    return Objects.hash(award);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carts {\n");
    
    sb.append("    award: ").append(toIndentedString(award)).append("\n");
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

