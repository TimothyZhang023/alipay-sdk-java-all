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
 * AnttechOceanbaseTestplatformTaskQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AnttechOceanbaseTestplatformTaskQueryModel {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_PALYER = "palyer";
  @SerializedName(SERIALIZED_NAME_PALYER)
  private String palyer;

  public static final String SERIALIZED_NAME_RUN_TASK_RETRY = "run_task_retry";
  @SerializedName(SERIALIZED_NAME_RUN_TASK_RETRY)
  private Integer runTaskRetry;

  public static final String SERIALIZED_NAME_RUN_TASK_TIME_OUT_MINUTES = "run_task_time_out_minutes";
  @SerializedName(SERIALIZED_NAME_RUN_TASK_TIME_OUT_MINUTES)
  private Integer runTaskTimeOutMinutes;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_TEST_CASES = "test_cases";
  @SerializedName(SERIALIZED_NAME_TEST_CASES)
  private String testCases;

  public static final String SERIALIZED_NAME_TEST_INFO = "test_info";
  @SerializedName(SERIALIZED_NAME_TEST_INFO)
  private String testInfo;

  public static final String SERIALIZED_NAME_TEST_SUITE = "test_suite";
  @SerializedName(SERIALIZED_NAME_TEST_SUITE)
  private String testSuite;

  public AnttechOceanbaseTestplatformTaskQueryModel() { 
  }

  public AnttechOceanbaseTestplatformTaskQueryModel endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 筛选结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-04-18 15:28:52", value = "筛选结束时间")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AnttechOceanbaseTestplatformTaskQueryModel palyer(String palyer) {
    
    this.palyer = palyer;
    return this;
  }

   /**
   * 参赛选手的名字
   * @return palyer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "无名选手", value = "参赛选手的名字")

  public String getPalyer() {
    return palyer;
  }


  public void setPalyer(String palyer) {
    this.palyer = palyer;
  }


  public AnttechOceanbaseTestplatformTaskQueryModel runTaskRetry(Integer runTaskRetry) {
    
    this.runTaskRetry = runTaskRetry;
    return this;
  }

   /**
   * 允许超时任务的重试次数
   * @return runTaskRetry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "允许超时任务的重试次数")

  public Integer getRunTaskRetry() {
    return runTaskRetry;
  }


  public void setRunTaskRetry(Integer runTaskRetry) {
    this.runTaskRetry = runTaskRetry;
  }


  public AnttechOceanbaseTestplatformTaskQueryModel runTaskTimeOutMinutes(Integer runTaskTimeOutMinutes) {
    
    this.runTaskTimeOutMinutes = runTaskTimeOutMinutes;
    return this;
  }

   /**
   * 获取任务时先获取超时任务，这里传入的是超时的分钟数。默认30分钟。
   * @return runTaskTimeOutMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "获取任务时先获取超时任务，这里传入的是超时的分钟数。默认30分钟。")

  public Integer getRunTaskTimeOutMinutes() {
    return runTaskTimeOutMinutes;
  }


  public void setRunTaskTimeOutMinutes(Integer runTaskTimeOutMinutes) {
    this.runTaskTimeOutMinutes = runTaskTimeOutMinutes;
  }


  public AnttechOceanbaseTestplatformTaskQueryModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 获取任务的筛选条件
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-04-15 18:36:24", value = "获取任务的筛选条件")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AnttechOceanbaseTestplatformTaskQueryModel testCases(String testCases) {
    
    this.testCases = testCases;
    return this;
  }

   /**
   * 二级提测题目
   * @return testCases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "查询元数据校验select-meta", value = "二级提测题目")

  public String getTestCases() {
    return testCases;
  }


  public void setTestCases(String testCases) {
    this.testCases = testCases;
  }


  public AnttechOceanbaseTestplatformTaskQueryModel testInfo(String testInfo) {
    
    this.testInfo = testInfo;
    return this;
  }

   /**
   * 测试结果描述、备注信息
   * @return testInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "代码风格比较好", value = "测试结果描述、备注信息")

  public String getTestInfo() {
    return testInfo;
  }


  public void setTestInfo(String testInfo) {
    this.testInfo = testInfo;
  }


  public AnttechOceanbaseTestplatformTaskQueryModel testSuite(String testSuite) {
    
    this.testSuite = testSuite;
    return this;
  }

   /**
   * 一级提测题目
   * @return testSuite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mini-ob", value = "一级提测题目")

  public String getTestSuite() {
    return testSuite;
  }


  public void setTestSuite(String testSuite) {
    this.testSuite = testSuite;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnttechOceanbaseTestplatformTaskQueryModel anttechOceanbaseTestplatformTaskQueryModel = (AnttechOceanbaseTestplatformTaskQueryModel) o;
    return Objects.equals(this.endTime, anttechOceanbaseTestplatformTaskQueryModel.endTime) &&
        Objects.equals(this.palyer, anttechOceanbaseTestplatformTaskQueryModel.palyer) &&
        Objects.equals(this.runTaskRetry, anttechOceanbaseTestplatformTaskQueryModel.runTaskRetry) &&
        Objects.equals(this.runTaskTimeOutMinutes, anttechOceanbaseTestplatformTaskQueryModel.runTaskTimeOutMinutes) &&
        Objects.equals(this.startTime, anttechOceanbaseTestplatformTaskQueryModel.startTime) &&
        Objects.equals(this.testCases, anttechOceanbaseTestplatformTaskQueryModel.testCases) &&
        Objects.equals(this.testInfo, anttechOceanbaseTestplatformTaskQueryModel.testInfo) &&
        Objects.equals(this.testSuite, anttechOceanbaseTestplatformTaskQueryModel.testSuite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, palyer, runTaskRetry, runTaskTimeOutMinutes, startTime, testCases, testInfo, testSuite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnttechOceanbaseTestplatformTaskQueryModel {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    palyer: ").append(toIndentedString(palyer)).append("\n");
    sb.append("    runTaskRetry: ").append(toIndentedString(runTaskRetry)).append("\n");
    sb.append("    runTaskTimeOutMinutes: ").append(toIndentedString(runTaskTimeOutMinutes)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    testCases: ").append(toIndentedString(testCases)).append("\n");
    sb.append("    testInfo: ").append(toIndentedString(testInfo)).append("\n");
    sb.append("    testSuite: ").append(toIndentedString(testSuite)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("palyer");
    openapiFields.add("run_task_retry");
    openapiFields.add("run_task_time_out_minutes");
    openapiFields.add("start_time");
    openapiFields.add("test_cases");
    openapiFields.add("test_info");
    openapiFields.add("test_suite");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnttechOceanbaseTestplatformTaskQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AnttechOceanbaseTestplatformTaskQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnttechOceanbaseTestplatformTaskQueryModel is not found in the empty JSON string", AnttechOceanbaseTestplatformTaskQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AnttechOceanbaseTestplatformTaskQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnttechOceanbaseTestplatformTaskQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("palyer") != null && !jsonObj.get("palyer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `palyer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("palyer").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("test_cases") != null && !jsonObj.get("test_cases").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `test_cases` to be a primitive type in the JSON string but got `%s`", jsonObj.get("test_cases").toString()));
      }
      if (jsonObj.get("test_info") != null && !jsonObj.get("test_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `test_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("test_info").toString()));
      }
      if (jsonObj.get("test_suite") != null && !jsonObj.get("test_suite").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `test_suite` to be a primitive type in the JSON string but got `%s`", jsonObj.get("test_suite").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnttechOceanbaseTestplatformTaskQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnttechOceanbaseTestplatformTaskQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnttechOceanbaseTestplatformTaskQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnttechOceanbaseTestplatformTaskQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AnttechOceanbaseTestplatformTaskQueryModel>() {
           @Override
           public void write(JsonWriter out, AnttechOceanbaseTestplatformTaskQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnttechOceanbaseTestplatformTaskQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnttechOceanbaseTestplatformTaskQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnttechOceanbaseTestplatformTaskQueryModel
  * @throws IOException if the JSON string is invalid with respect to AnttechOceanbaseTestplatformTaskQueryModel
  */
  public static AnttechOceanbaseTestplatformTaskQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnttechOceanbaseTestplatformTaskQueryModel.class);
  }

 /**
  * Convert an instance of AnttechOceanbaseTestplatformTaskQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

