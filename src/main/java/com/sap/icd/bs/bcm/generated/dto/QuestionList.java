package com.sap.icd.bs.bcm.generated.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sap.icd.bs.bcm.generated.dto.QuestionDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * QuestionList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-19T11:24:25.131+05:30")

public class QuestionList   {
  @JsonProperty("stream")
  private String stream = null;

  @JsonProperty("year")
  private String year = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("quesList")
  private List<QuestionDto> quesList = new ArrayList<QuestionDto>();

  public QuestionList stream(String stream) {
    this.stream = stream;
    return this;
  }

   /**
   * Get stream
   * @return stream
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getStream() {
    return stream;
  }

  public void setStream(String stream) {
    this.stream = stream;
  }

  public QuestionList year(String year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public QuestionList subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public QuestionList quesList(List<QuestionDto> quesList) {
    this.quesList = quesList;
    return this;
  }

  public QuestionList addQuesListItem(QuestionDto quesListItem) {
    this.quesList.add(quesListItem);
    return this;
  }

   /**
   * Get quesList
   * @return quesList
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public List<QuestionDto> getQuesList() {
    return quesList;
  }

  public void setQuesList(List<QuestionDto> quesList) {
    this.quesList = quesList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionList questionList = (QuestionList) o;
    return Objects.equals(this.stream, questionList.stream) &&
        Objects.equals(this.year, questionList.year) &&
        Objects.equals(this.subject, questionList.subject) &&
        Objects.equals(this.quesList, questionList.quesList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stream, year, subject, quesList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionList {\n");
    
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    quesList: ").append(toIndentedString(quesList)).append("\n");
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

