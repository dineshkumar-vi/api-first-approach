package com.apifirst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiErrorResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-25T00:07:42.828-06:00")

public class ApiErrorResponseData   {
  @JsonProperty("errorCode")
  private Integer errorCode = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  public ApiErrorResponseData errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Client Error Code.
   * @return errorCode
  **/
  @ApiModelProperty(value = "Client Error Code.")


  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public ApiErrorResponseData errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Client Error Message.
   * @return errorMessage
  **/
  @ApiModelProperty(value = "Client Error Message.")


  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ApiErrorResponseData timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Time Stamp.
   * @return timestamp
  **/
  @ApiModelProperty(value = "Time Stamp.")


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiErrorResponseData apiErrorResponseData = (ApiErrorResponseData) o;
    return Objects.equals(this.errorCode, apiErrorResponseData.errorCode) &&
        Objects.equals(this.errorMessage, apiErrorResponseData.errorMessage) &&
        Objects.equals(this.timestamp, apiErrorResponseData.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiErrorResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

