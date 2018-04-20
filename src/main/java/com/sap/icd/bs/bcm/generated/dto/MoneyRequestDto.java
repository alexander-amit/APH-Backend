package com.sap.icd.bs.bcm.generated.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * MoneyRequestDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-20T11:52:57.861+05:30")

public class MoneyRequestDto   {
  @JsonProperty("phonenumber")
  private String phonenumber = null;

  @JsonProperty("rupee")
  private String rupee = null;

  public MoneyRequestDto phonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
    return this;
  }

   /**
   * Get phonenumber
   * @return phonenumber
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getPhonenumber() {
    return phonenumber;
  }

  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }

  public MoneyRequestDto rupee(String rupee) {
    this.rupee = rupee;
    return this;
  }

   /**
   * Get rupee
   * @return rupee
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getRupee() {
    return rupee;
  }

  public void setRupee(String rupee) {
    this.rupee = rupee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoneyRequestDto moneyRequestDto = (MoneyRequestDto) o;
    return Objects.equals(this.phonenumber, moneyRequestDto.phonenumber) &&
        Objects.equals(this.rupee, moneyRequestDto.rupee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phonenumber, rupee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyRequestDto {\n");
    
    sb.append("    phonenumber: ").append(toIndentedString(phonenumber)).append("\n");
    sb.append("    rupee: ").append(toIndentedString(rupee)).append("\n");
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

