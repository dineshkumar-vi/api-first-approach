package com.apifirst.model;

import java.util.Objects;
import com.apifirst.model.ApiSuccessResponseData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiSuccessResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-25T00:07:42.828-06:00")

public class ApiSuccessResponse   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("data")
  private ApiSuccessResponseData data = null;

  public ApiSuccessResponse code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Response Code.
   * @return code
  **/
  @ApiModelProperty(value = "Response Code.")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ApiSuccessResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Response Status.
   * @return status
  **/
  @ApiModelProperty(value = "Response Status.")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ApiSuccessResponse data(ApiSuccessResponseData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ApiSuccessResponseData getData() {
    return data;
  }

  public void setData(ApiSuccessResponseData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) o;
    return Objects.equals(this.code, apiSuccessResponse.code) &&
        Objects.equals(this.status, apiSuccessResponse.status) &&
        Objects.equals(this.data, apiSuccessResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, status, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSuccessResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

