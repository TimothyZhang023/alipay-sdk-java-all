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
 * ArticleSummaryAnalysisData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArticleSummaryAnalysisData {
  public static final String SERIALIZED_NAME_AVG_READ_TIME = "avg_read_time";
  @SerializedName(SERIALIZED_NAME_AVG_READ_TIME)
  private String avgReadTime;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_DELIVER_USER_CNT = "deliver_user_cnt";
  @SerializedName(SERIALIZED_NAME_DELIVER_USER_CNT)
  private Integer deliverUserCnt;

  public static final String SERIALIZED_NAME_EXPOSE_USER_CNT = "expose_user_cnt";
  @SerializedName(SERIALIZED_NAME_EXPOSE_USER_CNT)
  private Integer exposeUserCnt;

  public static final String SERIALIZED_NAME_PRAISE_USER_CNT = "praise_user_cnt";
  @SerializedName(SERIALIZED_NAME_PRAISE_USER_CNT)
  private Integer praiseUserCnt;

  public static final String SERIALIZED_NAME_READ_USER_CNT = "read_user_cnt";
  @SerializedName(SERIALIZED_NAME_READ_USER_CNT)
  private Integer readUserCnt;

  public static final String SERIALIZED_NAME_REPLY_USER_CNT = "reply_user_cnt";
  @SerializedName(SERIALIZED_NAME_REPLY_USER_CNT)
  private Integer replyUserCnt;

  public static final String SERIALIZED_NAME_SHARE_USER_CNT = "share_user_cnt";
  @SerializedName(SERIALIZED_NAME_SHARE_USER_CNT)
  private Integer shareUserCnt;

  public ArticleSummaryAnalysisData() { 
  }

  public ArticleSummaryAnalysisData avgReadTime(String avgReadTime) {
    
    this.avgReadTime = avgReadTime;
    return this;
  }

   /**
   * 人均阅读时长
   * @return avgReadTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50.39", value = "人均阅读时长")

  public String getAvgReadTime() {
    return avgReadTime;
  }


  public void setAvgReadTime(String avgReadTime) {
    this.avgReadTime = avgReadTime;
  }


  public ArticleSummaryAnalysisData date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 日期
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20171101", value = "日期")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public ArticleSummaryAnalysisData deliverUserCnt(Integer deliverUserCnt) {
    
    this.deliverUserCnt = deliverUserCnt;
    return this;
  }

   /**
   * 送达人数
   * @return deliverUserCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "送达人数")

  public Integer getDeliverUserCnt() {
    return deliverUserCnt;
  }


  public void setDeliverUserCnt(Integer deliverUserCnt) {
    this.deliverUserCnt = deliverUserCnt;
  }


  public ArticleSummaryAnalysisData exposeUserCnt(Integer exposeUserCnt) {
    
    this.exposeUserCnt = exposeUserCnt;
    return this;
  }

   /**
   * 图文曝光人数
   * @return exposeUserCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "图文曝光人数")

  public Integer getExposeUserCnt() {
    return exposeUserCnt;
  }


  public void setExposeUserCnt(Integer exposeUserCnt) {
    this.exposeUserCnt = exposeUserCnt;
  }


  public ArticleSummaryAnalysisData praiseUserCnt(Integer praiseUserCnt) {
    
    this.praiseUserCnt = praiseUserCnt;
    return this;
  }

   /**
   * 点赞数
   * @return praiseUserCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "点赞数")

  public Integer getPraiseUserCnt() {
    return praiseUserCnt;
  }


  public void setPraiseUserCnt(Integer praiseUserCnt) {
    this.praiseUserCnt = praiseUserCnt;
  }


  public ArticleSummaryAnalysisData readUserCnt(Integer readUserCnt) {
    
    this.readUserCnt = readUserCnt;
    return this;
  }

   /**
   * 图文阅读人数
   * @return readUserCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "图文阅读人数")

  public Integer getReadUserCnt() {
    return readUserCnt;
  }


  public void setReadUserCnt(Integer readUserCnt) {
    this.readUserCnt = readUserCnt;
  }


  public ArticleSummaryAnalysisData replyUserCnt(Integer replyUserCnt) {
    
    this.replyUserCnt = replyUserCnt;
    return this;
  }

   /**
   * 评论数
   * @return replyUserCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "评论数")

  public Integer getReplyUserCnt() {
    return replyUserCnt;
  }


  public void setReplyUserCnt(Integer replyUserCnt) {
    this.replyUserCnt = replyUserCnt;
  }


  public ArticleSummaryAnalysisData shareUserCnt(Integer shareUserCnt) {
    
    this.shareUserCnt = shareUserCnt;
    return this;
  }

   /**
   * 分享人数
   * @return shareUserCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "40", value = "分享人数")

  public Integer getShareUserCnt() {
    return shareUserCnt;
  }


  public void setShareUserCnt(Integer shareUserCnt) {
    this.shareUserCnt = shareUserCnt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleSummaryAnalysisData articleSummaryAnalysisData = (ArticleSummaryAnalysisData) o;
    return Objects.equals(this.avgReadTime, articleSummaryAnalysisData.avgReadTime) &&
        Objects.equals(this.date, articleSummaryAnalysisData.date) &&
        Objects.equals(this.deliverUserCnt, articleSummaryAnalysisData.deliverUserCnt) &&
        Objects.equals(this.exposeUserCnt, articleSummaryAnalysisData.exposeUserCnt) &&
        Objects.equals(this.praiseUserCnt, articleSummaryAnalysisData.praiseUserCnt) &&
        Objects.equals(this.readUserCnt, articleSummaryAnalysisData.readUserCnt) &&
        Objects.equals(this.replyUserCnt, articleSummaryAnalysisData.replyUserCnt) &&
        Objects.equals(this.shareUserCnt, articleSummaryAnalysisData.shareUserCnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgReadTime, date, deliverUserCnt, exposeUserCnt, praiseUserCnt, readUserCnt, replyUserCnt, shareUserCnt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleSummaryAnalysisData {\n");
    sb.append("    avgReadTime: ").append(toIndentedString(avgReadTime)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    deliverUserCnt: ").append(toIndentedString(deliverUserCnt)).append("\n");
    sb.append("    exposeUserCnt: ").append(toIndentedString(exposeUserCnt)).append("\n");
    sb.append("    praiseUserCnt: ").append(toIndentedString(praiseUserCnt)).append("\n");
    sb.append("    readUserCnt: ").append(toIndentedString(readUserCnt)).append("\n");
    sb.append("    replyUserCnt: ").append(toIndentedString(replyUserCnt)).append("\n");
    sb.append("    shareUserCnt: ").append(toIndentedString(shareUserCnt)).append("\n");
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
    openapiFields.add("avg_read_time");
    openapiFields.add("date");
    openapiFields.add("deliver_user_cnt");
    openapiFields.add("expose_user_cnt");
    openapiFields.add("praise_user_cnt");
    openapiFields.add("read_user_cnt");
    openapiFields.add("reply_user_cnt");
    openapiFields.add("share_user_cnt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArticleSummaryAnalysisData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ArticleSummaryAnalysisData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArticleSummaryAnalysisData is not found in the empty JSON string", ArticleSummaryAnalysisData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ArticleSummaryAnalysisData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ArticleSummaryAnalysisData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("avg_read_time") != null && !jsonObj.get("avg_read_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avg_read_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avg_read_time").toString()));
      }
      if (jsonObj.get("date") != null && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArticleSummaryAnalysisData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArticleSummaryAnalysisData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArticleSummaryAnalysisData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArticleSummaryAnalysisData.class));

       return (TypeAdapter<T>) new TypeAdapter<ArticleSummaryAnalysisData>() {
           @Override
           public void write(JsonWriter out, ArticleSummaryAnalysisData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ArticleSummaryAnalysisData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ArticleSummaryAnalysisData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArticleSummaryAnalysisData
  * @throws IOException if the JSON string is invalid with respect to ArticleSummaryAnalysisData
  */
  public static ArticleSummaryAnalysisData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArticleSummaryAnalysisData.class);
  }

 /**
  * Convert an instance of ArticleSummaryAnalysisData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

