/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-12-12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * CloudResumeEducationExperience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudResumeEducationExperience {
  public static final String SERIALIZED_NAME_DEGREE = "degree";
  @SerializedName(SERIALIZED_NAME_DEGREE)
  private String degree;

  public static final String SERIALIZED_NAME_EDUCATION_STATUS = "education_status";
  @SerializedName(SERIALIZED_NAME_EDUCATION_STATUS)
  private String educationStatus;

  public static final String SERIALIZED_NAME_FINISH_SCHOOL_MONTH = "finish_school_month";
  @SerializedName(SERIALIZED_NAME_FINISH_SCHOOL_MONTH)
  private String finishSchoolMonth;

  public static final String SERIALIZED_NAME_FINISH_SCHOOL_YEAR = "finish_school_year";
  @SerializedName(SERIALIZED_NAME_FINISH_SCHOOL_YEAR)
  private Integer finishSchoolYear;

  public static final String SERIALIZED_NAME_IN_SCHOOL_MONTH = "in_school_month";
  @SerializedName(SERIALIZED_NAME_IN_SCHOOL_MONTH)
  private Integer inSchoolMonth;

  public static final String SERIALIZED_NAME_IN_SCHOOL_YEAR = "in_school_year";
  @SerializedName(SERIALIZED_NAME_IN_SCHOOL_YEAR)
  private Integer inSchoolYear;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_MAJOR = "major";
  @SerializedName(SERIALIZED_NAME_MAJOR)
  private String major;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Integer month;

  public static final String SERIALIZED_NAME_SCHOOL_NAME = "school_name";
  @SerializedName(SERIALIZED_NAME_SCHOOL_NAME)
  private String schoolName;

  public static final String SERIALIZED_NAME_TONG_ZHAO = "tong_zhao";
  @SerializedName(SERIALIZED_NAME_TONG_ZHAO)
  private Boolean tongZhao;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;

  public CloudResumeEducationExperience() { 
  }

  public CloudResumeEducationExperience degree(String degree) {
    
    this.degree = degree;
    return this;
  }

   /**
   * 学历
   * @return degree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BACHELOR", value = "学历")

  public String getDegree() {
    return degree;
  }


  public void setDegree(String degree) {
    this.degree = degree;
  }


  public CloudResumeEducationExperience educationStatus(String educationStatus) {
    
    this.educationStatus = educationStatus;
    return this;
  }

   /**
   * 教育状态
   * @return educationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FINISH_SCHOOL", value = "教育状态")

  public String getEducationStatus() {
    return educationStatus;
  }


  public void setEducationStatus(String educationStatus) {
    this.educationStatus = educationStatus;
  }


  public CloudResumeEducationExperience finishSchoolMonth(String finishSchoolMonth) {
    
    this.finishSchoolMonth = finishSchoolMonth;
    return this;
  }

   /**
   * 毕业月份
   * @return finishSchoolMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9", value = "毕业月份")

  public String getFinishSchoolMonth() {
    return finishSchoolMonth;
  }


  public void setFinishSchoolMonth(String finishSchoolMonth) {
    this.finishSchoolMonth = finishSchoolMonth;
  }


  public CloudResumeEducationExperience finishSchoolYear(Integer finishSchoolYear) {
    
    this.finishSchoolYear = finishSchoolYear;
    return this;
  }

   /**
   * 毕业年份
   * @return finishSchoolYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023", value = "毕业年份")

  public Integer getFinishSchoolYear() {
    return finishSchoolYear;
  }


  public void setFinishSchoolYear(Integer finishSchoolYear) {
    this.finishSchoolYear = finishSchoolYear;
  }


  public CloudResumeEducationExperience inSchoolMonth(Integer inSchoolMonth) {
    
    this.inSchoolMonth = inSchoolMonth;
    return this;
  }

   /**
   * 入学月份
   * @return inSchoolMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "入学月份")

  public Integer getInSchoolMonth() {
    return inSchoolMonth;
  }


  public void setInSchoolMonth(Integer inSchoolMonth) {
    this.inSchoolMonth = inSchoolMonth;
  }


  public CloudResumeEducationExperience inSchoolYear(Integer inSchoolYear) {
    
    this.inSchoolYear = inSchoolYear;
    return this;
  }

   /**
   * 入学年份
   * @return inSchoolYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023", value = "入学年份")

  public Integer getInSchoolYear() {
    return inSchoolYear;
  }


  public void setInSchoolYear(Integer inSchoolYear) {
    this.inSchoolYear = inSchoolYear;
  }


  public CloudResumeEducationExperience location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * 受教育地点
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "受教育地点", value = "受教育地点")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public CloudResumeEducationExperience major(String major) {
    
    this.major = major;
    return this;
  }

   /**
   * 上学专业
   * @return major
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "计算机科学与技术", value = "上学专业")

  public String getMajor() {
    return major;
  }


  public void setMajor(String major) {
    this.major = major;
  }


  public CloudResumeEducationExperience month(Integer month) {
    
    this.month = month;
    return this;
  }

   /**
   * 月
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "月")

  public Integer getMonth() {
    return month;
  }


  public void setMonth(Integer month) {
    this.month = month;
  }


  public CloudResumeEducationExperience schoolName(String schoolName) {
    
    this.schoolName = schoolName;
    return this;
  }

   /**
   * 学校名称
   * @return schoolName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "上海大学", value = "学校名称")

  public String getSchoolName() {
    return schoolName;
  }


  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }


  public CloudResumeEducationExperience tongZhao(Boolean tongZhao) {
    
    this.tongZhao = tongZhao;
    return this;
  }

   /**
   * 是否统招
   * @return tongZhao
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否统招")

  public Boolean getTongZhao() {
    return tongZhao;
  }


  public void setTongZhao(Boolean tongZhao) {
    this.tongZhao = tongZhao;
  }


  public CloudResumeEducationExperience year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * 年
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022", value = "年")

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudResumeEducationExperience cloudResumeEducationExperience = (CloudResumeEducationExperience) o;
    return Objects.equals(this.degree, cloudResumeEducationExperience.degree) &&
        Objects.equals(this.educationStatus, cloudResumeEducationExperience.educationStatus) &&
        Objects.equals(this.finishSchoolMonth, cloudResumeEducationExperience.finishSchoolMonth) &&
        Objects.equals(this.finishSchoolYear, cloudResumeEducationExperience.finishSchoolYear) &&
        Objects.equals(this.inSchoolMonth, cloudResumeEducationExperience.inSchoolMonth) &&
        Objects.equals(this.inSchoolYear, cloudResumeEducationExperience.inSchoolYear) &&
        Objects.equals(this.location, cloudResumeEducationExperience.location) &&
        Objects.equals(this.major, cloudResumeEducationExperience.major) &&
        Objects.equals(this.month, cloudResumeEducationExperience.month) &&
        Objects.equals(this.schoolName, cloudResumeEducationExperience.schoolName) &&
        Objects.equals(this.tongZhao, cloudResumeEducationExperience.tongZhao) &&
        Objects.equals(this.year, cloudResumeEducationExperience.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(degree, educationStatus, finishSchoolMonth, finishSchoolYear, inSchoolMonth, inSchoolYear, location, major, month, schoolName, tongZhao, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudResumeEducationExperience {\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    educationStatus: ").append(toIndentedString(educationStatus)).append("\n");
    sb.append("    finishSchoolMonth: ").append(toIndentedString(finishSchoolMonth)).append("\n");
    sb.append("    finishSchoolYear: ").append(toIndentedString(finishSchoolYear)).append("\n");
    sb.append("    inSchoolMonth: ").append(toIndentedString(inSchoolMonth)).append("\n");
    sb.append("    inSchoolYear: ").append(toIndentedString(inSchoolYear)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    schoolName: ").append(toIndentedString(schoolName)).append("\n");
    sb.append("    tongZhao: ").append(toIndentedString(tongZhao)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("degree");
    openapiFields.add("education_status");
    openapiFields.add("finish_school_month");
    openapiFields.add("finish_school_year");
    openapiFields.add("in_school_month");
    openapiFields.add("in_school_year");
    openapiFields.add("location");
    openapiFields.add("major");
    openapiFields.add("month");
    openapiFields.add("school_name");
    openapiFields.add("tong_zhao");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CloudResumeEducationExperience
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CloudResumeEducationExperience.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudResumeEducationExperience is not found in the empty JSON string", CloudResumeEducationExperience.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CloudResumeEducationExperience.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudResumeEducationExperience` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("degree") != null && !jsonObj.get("degree").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `degree` to be a primitive type in the JSON string but got `%s`", jsonObj.get("degree").toString()));
      }
      if (jsonObj.get("education_status") != null && !jsonObj.get("education_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `education_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("education_status").toString()));
      }
      if (jsonObj.get("finish_school_month") != null && !jsonObj.get("finish_school_month").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `finish_school_month` to be a primitive type in the JSON string but got `%s`", jsonObj.get("finish_school_month").toString()));
      }
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if (jsonObj.get("major") != null && !jsonObj.get("major").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `major` to be a primitive type in the JSON string but got `%s`", jsonObj.get("major").toString()));
      }
      if (jsonObj.get("school_name") != null && !jsonObj.get("school_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudResumeEducationExperience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudResumeEducationExperience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudResumeEducationExperience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudResumeEducationExperience.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudResumeEducationExperience>() {
           @Override
           public void write(JsonWriter out, CloudResumeEducationExperience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudResumeEducationExperience read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloudResumeEducationExperience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudResumeEducationExperience
  * @throws IOException if the JSON string is invalid with respect to CloudResumeEducationExperience
  */
  public static CloudResumeEducationExperience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudResumeEducationExperience.class);
  }

 /**
  * Convert an instance of CloudResumeEducationExperience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

