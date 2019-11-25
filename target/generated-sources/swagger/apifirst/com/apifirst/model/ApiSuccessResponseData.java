package com.apifirst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiSuccessResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-25T00:07:42.828-06:00")

public class ApiSuccessResponseData   {
  @JsonProperty("recordsProcessed")
  private Integer recordsProcessed = null;

  @JsonProperty("recordsBlocked")
  private Integer recordsBlocked = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  public ApiSuccessResponseData recordsProcessed(Integer recordsProcessed) {
    this.recordsProcessed = recordsProcessed;
    return this;
  }

   /**
   * Records Procced.
   * @return recordsProcessed
  **/
  @ApiModelProperty(value = "Records Procced.")


  public Integer getRecordsProcessed() {
    return recordsProcessed;
  }

  public void setRecordsProcessed(Integer recordsProcessed) {
    this.recordsProcessed = recordsProcessed;
  }

  public ApiSuccessResponseData recordsBlocked(Integer recordsBlocked) {
    this.recordsBlocked = recordsBlocked;
    return this;
  }

   /**
   * Records Blocked.
   * @return recordsBlocked
  **/
  @ApiModelProperty(value = "Records Blocked.")


  public Integer getRecordsBlocked() {
    return recordsBlocked;
  }

  public void setRecordsBlocked(Integer recordsBlocked) {
    this.recordsBlocked = recordsBlocked;
  }

  public ApiSuccessResponseData timestamp(String timestamp) {
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
    ApiSuccessResponseData apiSuccessResponseData = (ApiSuccessResponseData) o;
    return Objects.equals(this.recordsProcessed, apiSuccessResponseData.recordsProcessed) &&
        Objects.equals(this.recordsBlocked, apiSuccessResponseData.recordsBlocked) &&
        Objects.equals(this.timestamp, apiSuccessResponseData.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordsProcessed, recordsBlocked, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSuccessResponseData {\n");
    
    sb.append("    recordsProcessed: ").append(toIndentedString(recordsProcessed)).append("\n");
    sb.append("    recordsBlocked: ").append(toIndentedString(recordsBlocked)).append("\n");
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

