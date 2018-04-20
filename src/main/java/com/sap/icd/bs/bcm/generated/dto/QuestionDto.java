package com.sap.icd.bs.bcm.generated.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * QuestionDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-20T11:52:57.861+05:30")

public class QuestionDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("stream")
  private String stream = null;

  @JsonProperty("year")
  private String year = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("ques")
  private String ques = null;

  @JsonProperty("opt1")
  private String opt1 = null;

  @JsonProperty("opt2")
  private String opt2 = null;

  @JsonProperty("opt3")
  private String opt3 = null;

  @JsonProperty("opt4")
  private String opt4 = null;

  @JsonProperty("correctAns")
  private String correctAns = null;

  @JsonProperty("explanation")
  private String explanation = null;

  public QuestionDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QuestionDto stream(String stream) {
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

  public QuestionDto year(String year) {
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

  public QuestionDto subject(String subject) {
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

  public QuestionDto ques(String ques) {
    this.ques = ques;
    return this;
  }

   /**
   * Get ques
   * @return ques
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getQues() {
    return ques;
  }

  public void setQues(String ques) {
    this.ques = ques;
  }

  public QuestionDto opt1(String opt1) {
    this.opt1 = opt1;
    return this;
  }

   /**
   * Get opt1
   * @return opt1
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getOpt1() {
    return opt1;
  }

  public void setOpt1(String opt1) {
    this.opt1 = opt1;
  }

  public QuestionDto opt2(String opt2) {
    this.opt2 = opt2;
    return this;
  }

   /**
   * Get opt2
   * @return opt2
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getOpt2() {
    return opt2;
  }

  public void setOpt2(String opt2) {
    this.opt2 = opt2;
  }

  public QuestionDto opt3(String opt3) {
    this.opt3 = opt3;
    return this;
  }

   /**
   * Get opt3
   * @return opt3
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getOpt3() {
    return opt3;
  }

  public void setOpt3(String opt3) {
    this.opt3 = opt3;
  }

  public QuestionDto opt4(String opt4) {
    this.opt4 = opt4;
    return this;
  }

   /**
   * Get opt4
   * @return opt4
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getOpt4() {
    return opt4;
  }

  public void setOpt4(String opt4) {
    this.opt4 = opt4;
  }

  public QuestionDto correctAns(String correctAns) {
    this.correctAns = correctAns;
    return this;
  }

   /**
   * Get correctAns
   * @return correctAns
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getCorrectAns() {
    return correctAns;
  }

  public void setCorrectAns(String correctAns) {
    this.correctAns = correctAns;
  }

  public QuestionDto explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

   /**
   * Get explanation
   * @return explanation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionDto questionDto = (QuestionDto) o;
    return Objects.equals(this.id, questionDto.id) &&
        Objects.equals(this.stream, questionDto.stream) &&
        Objects.equals(this.year, questionDto.year) &&
        Objects.equals(this.subject, questionDto.subject) &&
        Objects.equals(this.ques, questionDto.ques) &&
        Objects.equals(this.opt1, questionDto.opt1) &&
        Objects.equals(this.opt2, questionDto.opt2) &&
        Objects.equals(this.opt3, questionDto.opt3) &&
        Objects.equals(this.opt4, questionDto.opt4) &&
        Objects.equals(this.correctAns, questionDto.correctAns) &&
        Objects.equals(this.explanation, questionDto.explanation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, stream, year, subject, ques, opt1, opt2, opt3, opt4, correctAns, explanation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    ques: ").append(toIndentedString(ques)).append("\n");
    sb.append("    opt1: ").append(toIndentedString(opt1)).append("\n");
    sb.append("    opt2: ").append(toIndentedString(opt2)).append("\n");
    sb.append("    opt3: ").append(toIndentedString(opt3)).append("\n");
    sb.append("    opt4: ").append(toIndentedString(opt4)).append("\n");
    sb.append("    correctAns: ").append(toIndentedString(correctAns)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
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

