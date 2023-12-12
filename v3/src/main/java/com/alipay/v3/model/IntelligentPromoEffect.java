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
 * IntelligentPromoEffect
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IntelligentPromoEffect {
  public static final String SERIALIZED_NAME_AVG_PRIZE_INCREASE = "avg_prize_increase";
  @SerializedName(SERIALIZED_NAME_AVG_PRIZE_INCREASE)
  private String avgPrizeIncrease;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private String cost;

  public static final String SERIALIZED_NAME_CURRENT_TOTAL_AMOUNT = "current_total_amount";
  @SerializedName(SERIALIZED_NAME_CURRENT_TOTAL_AMOUNT)
  private String currentTotalAmount;

  public static final String SERIALIZED_NAME_EFFECT_ID = "effect_id";
  @SerializedName(SERIALIZED_NAME_EFFECT_ID)
  private String effectId;

  public static final String SERIALIZED_NAME_GMT_FROM = "gmt_from";
  @SerializedName(SERIALIZED_NAME_GMT_FROM)
  private String gmtFrom;

  public static final String SERIALIZED_NAME_GMT_TO = "gmt_to";
  @SerializedName(SERIALIZED_NAME_GMT_TO)
  private String gmtTo;

  public static final String SERIALIZED_NAME_GMV = "gmv";
  @SerializedName(SERIALIZED_NAME_GMV)
  private String gmv;

  public static final String SERIALIZED_NAME_REMAIN_STOCK_NUM = "remain_stock_num";
  @SerializedName(SERIALIZED_NAME_REMAIN_STOCK_NUM)
  private Integer remainStockNum;

  public static final String SERIALIZED_NAME_REPAY_RATE_INCREASE = "repay_rate_increase";
  @SerializedName(SERIALIZED_NAME_REPAY_RATE_INCREASE)
  private String repayRateIncrease;

  public static final String SERIALIZED_NAME_SEND_COUNT_INCREASE = "send_count_increase";
  @SerializedName(SERIALIZED_NAME_SEND_COUNT_INCREASE)
  private String sendCountIncrease;

  public static final String SERIALIZED_NAME_TAKE_COUNT = "take_count";
  @SerializedName(SERIALIZED_NAME_TAKE_COUNT)
  private Integer takeCount;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USE_COUNT = "use_count";
  @SerializedName(SERIALIZED_NAME_USE_COUNT)
  private Integer useCount;

  public IntelligentPromoEffect() { 
  }

  public IntelligentPromoEffect avgPrizeIncrease(String avgPrizeIncrease) {
    
    this.avgPrizeIncrease = avgPrizeIncrease;
    return this;
  }

   /**
   * 平均客单价提升比例
   * @return avgPrizeIncrease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "平均客单价提升比例")

  public String getAvgPrizeIncrease() {
    return avgPrizeIncrease;
  }


  public void setAvgPrizeIncrease(String avgPrizeIncrease) {
    this.avgPrizeIncrease = avgPrizeIncrease;
  }


  public IntelligentPromoEffect cost(String cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 成本
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "成本")

  public String getCost() {
    return cost;
  }


  public void setCost(String cost) {
    this.cost = cost;
  }


  public IntelligentPromoEffect currentTotalAmount(String currentTotalAmount) {
    
    this.currentTotalAmount = currentTotalAmount;
    return this;
  }

   /**
   * 当前效益
   * @return currentTotalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "当前效益")

  public String getCurrentTotalAmount() {
    return currentTotalAmount;
  }


  public void setCurrentTotalAmount(String currentTotalAmount) {
    this.currentTotalAmount = currentTotalAmount;
  }


  public IntelligentPromoEffect effectId(String effectId) {
    
    this.effectId = effectId;
    return this;
  }

   /**
   * 营销活动的预期效果id
   * @return effectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "营销活动的预期效果id")

  public String getEffectId() {
    return effectId;
  }


  public void setEffectId(String effectId) {
    this.effectId = effectId;
  }


  public IntelligentPromoEffect gmtFrom(String gmtFrom) {
    
    this.gmtFrom = gmtFrom;
    return this;
  }

   /**
   * 时间范围左值
   * @return gmtFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "时间范围左值")

  public String getGmtFrom() {
    return gmtFrom;
  }


  public void setGmtFrom(String gmtFrom) {
    this.gmtFrom = gmtFrom;
  }


  public IntelligentPromoEffect gmtTo(String gmtTo) {
    
    this.gmtTo = gmtTo;
    return this;
  }

   /**
   * 时间范围右值
   * @return gmtTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "时间范围右值")

  public String getGmtTo() {
    return gmtTo;
  }


  public void setGmtTo(String gmtTo) {
    this.gmtTo = gmtTo;
  }


  public IntelligentPromoEffect gmv(String gmv) {
    
    this.gmv = gmv;
    return this;
  }

   /**
   * 成交额
   * @return gmv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "成交额")

  public String getGmv() {
    return gmv;
  }


  public void setGmv(String gmv) {
    this.gmv = gmv;
  }


  public IntelligentPromoEffect remainStockNum(Integer remainStockNum) {
    
    this.remainStockNum = remainStockNum;
    return this;
  }

   /**
   * 剩余库存数
   * @return remainStockNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "剩余库存数")

  public Integer getRemainStockNum() {
    return remainStockNum;
  }


  public void setRemainStockNum(Integer remainStockNum) {
    this.remainStockNum = remainStockNum;
  }


  public IntelligentPromoEffect repayRateIncrease(String repayRateIncrease) {
    
    this.repayRateIncrease = repayRateIncrease;
    return this;
  }

   /**
   * 复购率提升比例
   * @return repayRateIncrease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "复购率提升比例")

  public String getRepayRateIncrease() {
    return repayRateIncrease;
  }


  public void setRepayRateIncrease(String repayRateIncrease) {
    this.repayRateIncrease = repayRateIncrease;
  }


  public IntelligentPromoEffect sendCountIncrease(String sendCountIncrease) {
    
    this.sendCountIncrease = sendCountIncrease;
    return this;
  }

   /**
   * 发券量提升比例
   * @return sendCountIncrease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发券量提升比例")

  public String getSendCountIncrease() {
    return sendCountIncrease;
  }


  public void setSendCountIncrease(String sendCountIncrease) {
    this.sendCountIncrease = sendCountIncrease;
  }


  public IntelligentPromoEffect takeCount(Integer takeCount) {
    
    this.takeCount = takeCount;
    return this;
  }

   /**
   * 发券数量
   * @return takeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发券数量")

  public Integer getTakeCount() {
    return takeCount;
  }


  public void setTakeCount(Integer takeCount) {
    this.takeCount = takeCount;
  }


  public IntelligentPromoEffect type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 营销活动效果类型。FORECAST：预估；STATISTICS：统计
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "营销活动效果类型。FORECAST：预估；STATISTICS：统计")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public IntelligentPromoEffect useCount(Integer useCount) {
    
    this.useCount = useCount;
    return this;
  }

   /**
   * 核销量
   * @return useCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "核销量")

  public Integer getUseCount() {
    return useCount;
  }


  public void setUseCount(Integer useCount) {
    this.useCount = useCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntelligentPromoEffect intelligentPromoEffect = (IntelligentPromoEffect) o;
    return Objects.equals(this.avgPrizeIncrease, intelligentPromoEffect.avgPrizeIncrease) &&
        Objects.equals(this.cost, intelligentPromoEffect.cost) &&
        Objects.equals(this.currentTotalAmount, intelligentPromoEffect.currentTotalAmount) &&
        Objects.equals(this.effectId, intelligentPromoEffect.effectId) &&
        Objects.equals(this.gmtFrom, intelligentPromoEffect.gmtFrom) &&
        Objects.equals(this.gmtTo, intelligentPromoEffect.gmtTo) &&
        Objects.equals(this.gmv, intelligentPromoEffect.gmv) &&
        Objects.equals(this.remainStockNum, intelligentPromoEffect.remainStockNum) &&
        Objects.equals(this.repayRateIncrease, intelligentPromoEffect.repayRateIncrease) &&
        Objects.equals(this.sendCountIncrease, intelligentPromoEffect.sendCountIncrease) &&
        Objects.equals(this.takeCount, intelligentPromoEffect.takeCount) &&
        Objects.equals(this.type, intelligentPromoEffect.type) &&
        Objects.equals(this.useCount, intelligentPromoEffect.useCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgPrizeIncrease, cost, currentTotalAmount, effectId, gmtFrom, gmtTo, gmv, remainStockNum, repayRateIncrease, sendCountIncrease, takeCount, type, useCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntelligentPromoEffect {\n");
    sb.append("    avgPrizeIncrease: ").append(toIndentedString(avgPrizeIncrease)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    currentTotalAmount: ").append(toIndentedString(currentTotalAmount)).append("\n");
    sb.append("    effectId: ").append(toIndentedString(effectId)).append("\n");
    sb.append("    gmtFrom: ").append(toIndentedString(gmtFrom)).append("\n");
    sb.append("    gmtTo: ").append(toIndentedString(gmtTo)).append("\n");
    sb.append("    gmv: ").append(toIndentedString(gmv)).append("\n");
    sb.append("    remainStockNum: ").append(toIndentedString(remainStockNum)).append("\n");
    sb.append("    repayRateIncrease: ").append(toIndentedString(repayRateIncrease)).append("\n");
    sb.append("    sendCountIncrease: ").append(toIndentedString(sendCountIncrease)).append("\n");
    sb.append("    takeCount: ").append(toIndentedString(takeCount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    useCount: ").append(toIndentedString(useCount)).append("\n");
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
    openapiFields.add("avg_prize_increase");
    openapiFields.add("cost");
    openapiFields.add("current_total_amount");
    openapiFields.add("effect_id");
    openapiFields.add("gmt_from");
    openapiFields.add("gmt_to");
    openapiFields.add("gmv");
    openapiFields.add("remain_stock_num");
    openapiFields.add("repay_rate_increase");
    openapiFields.add("send_count_increase");
    openapiFields.add("take_count");
    openapiFields.add("type");
    openapiFields.add("use_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IntelligentPromoEffect
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IntelligentPromoEffect.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntelligentPromoEffect is not found in the empty JSON string", IntelligentPromoEffect.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IntelligentPromoEffect.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntelligentPromoEffect` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("avg_prize_increase") != null && !jsonObj.get("avg_prize_increase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avg_prize_increase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avg_prize_increase").toString()));
      }
      if (jsonObj.get("cost") != null && !jsonObj.get("cost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cost").toString()));
      }
      if (jsonObj.get("current_total_amount") != null && !jsonObj.get("current_total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_total_amount").toString()));
      }
      if (jsonObj.get("effect_id") != null && !jsonObj.get("effect_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effect_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effect_id").toString()));
      }
      if (jsonObj.get("gmt_from") != null && !jsonObj.get("gmt_from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_from").toString()));
      }
      if (jsonObj.get("gmt_to") != null && !jsonObj.get("gmt_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_to").toString()));
      }
      if (jsonObj.get("gmv") != null && !jsonObj.get("gmv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmv").toString()));
      }
      if (jsonObj.get("repay_rate_increase") != null && !jsonObj.get("repay_rate_increase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repay_rate_increase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repay_rate_increase").toString()));
      }
      if (jsonObj.get("send_count_increase") != null && !jsonObj.get("send_count_increase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `send_count_increase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("send_count_increase").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntelligentPromoEffect.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntelligentPromoEffect' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntelligentPromoEffect> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntelligentPromoEffect.class));

       return (TypeAdapter<T>) new TypeAdapter<IntelligentPromoEffect>() {
           @Override
           public void write(JsonWriter out, IntelligentPromoEffect value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntelligentPromoEffect read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntelligentPromoEffect given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntelligentPromoEffect
  * @throws IOException if the JSON string is invalid with respect to IntelligentPromoEffect
  */
  public static IntelligentPromoEffect fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntelligentPromoEffect.class);
  }

 /**
  * Convert an instance of IntelligentPromoEffect to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

