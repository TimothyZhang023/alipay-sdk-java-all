/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-12-20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.InteligentDataCondition;
import com.alipay.v3.model.InteligentForbiddenTime;
import com.alipay.v3.model.InteligentUseTime;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * InteligentUseRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteligentUseRule {
  public static final String SERIALIZED_NAME_INTELIGENT_FORBIDDEN_TIME = "inteligent_forbidden_time";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_FORBIDDEN_TIME)
  private InteligentForbiddenTime inteligentForbiddenTime;

  public static final String SERIALIZED_NAME_INTELIGENT_USE_TIMES = "inteligent_use_times";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_USE_TIMES)
  private List<InteligentUseTime> inteligentUseTimes = null;

  public static final String SERIALIZED_NAME_LIMIT_RULE = "limit_rule";
  @SerializedName(SERIALIZED_NAME_LIMIT_RULE)
  private String limitRule;

  public static final String SERIALIZED_NAME_MIN_CONSUME = "min_consume";
  @SerializedName(SERIALIZED_NAME_MIN_CONSUME)
  private String minConsume;

  public static final String SERIALIZED_NAME_MIN_CONSUME_CONDITION = "min_consume_condition";
  @SerializedName(SERIALIZED_NAME_MIN_CONSUME_CONDITION)
  private InteligentDataCondition minConsumeCondition;

  public static final String SERIALIZED_NAME_PAY_REDIRECT_URL = "pay_redirect_url";
  @SerializedName(SERIALIZED_NAME_PAY_REDIRECT_URL)
  private String payRedirectUrl;

  public static final String SERIALIZED_NAME_SUIT_SHOPS = "suit_shops";
  @SerializedName(SERIALIZED_NAME_SUIT_SHOPS)
  private List<String> suitShops = null;

  public InteligentUseRule() { 
  }

  public InteligentUseRule inteligentForbiddenTime(InteligentForbiddenTime inteligentForbiddenTime) {
    
    this.inteligentForbiddenTime = inteligentForbiddenTime;
    return this;
  }

   /**
   * Get inteligentForbiddenTime
   * @return inteligentForbiddenTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InteligentForbiddenTime getInteligentForbiddenTime() {
    return inteligentForbiddenTime;
  }


  public void setInteligentForbiddenTime(InteligentForbiddenTime inteligentForbiddenTime) {
    this.inteligentForbiddenTime = inteligentForbiddenTime;
  }


  public InteligentUseRule inteligentUseTimes(List<InteligentUseTime> inteligentUseTimes) {
    
    this.inteligentUseTimes = inteligentUseTimes;
    return this;
  }

  public InteligentUseRule addInteligentUseTimesItem(InteligentUseTime inteligentUseTimesItem) {
    if (this.inteligentUseTimes == null) {
      this.inteligentUseTimes = new ArrayList<>();
    }
    this.inteligentUseTimes.add(inteligentUseTimesItem);
    return this;
  }

   /**
   * 券可用时间段
   * @return inteligentUseTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券可用时间段")

  public List<InteligentUseTime> getInteligentUseTimes() {
    return inteligentUseTimes;
  }


  public void setInteligentUseTimes(List<InteligentUseTime> inteligentUseTimes) {
    this.inteligentUseTimes = inteligentUseTimes;
  }


  public InteligentUseRule limitRule(String limitRule) {
    
    this.limitRule = limitRule;
    return this;
  }

   /**
   * 优惠券的使用支付渠道限制规  则，  不受支付渠道限制  :USE_NO_LIMIT;  仅限口碑储值卡支付时可用  :USE_ON_CURRENT_PAY_C  HANNEL;  口碑储值卡支付时不可用  :NOT_ALLOWED_USE;  【备注】支付渠道限制不允许修改
   * @return limitRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USE_NO_LIMIT", value = "优惠券的使用支付渠道限制规  则，  不受支付渠道限制  :USE_NO_LIMIT;  仅限口碑储值卡支付时可用  :USE_ON_CURRENT_PAY_C  HANNEL;  口碑储值卡支付时不可用  :NOT_ALLOWED_USE;  【备注】支付渠道限制不允许修改")

  public String getLimitRule() {
    return limitRule;
  }


  public void setLimitRule(String limitRule) {
    this.limitRule = limitRule;
  }


  public InteligentUseRule minConsume(String minConsume) {
    
    this.minConsume = minConsume;
    return this;
  }

   /**
   * 券核销的最低消费门槛，单位元
   * @return minConsume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "券核销的最低消费门槛，单位元")

  public String getMinConsume() {
    return minConsume;
  }


  public void setMinConsume(String minConsume) {
    this.minConsume = minConsume;
  }


  public InteligentUseRule minConsumeCondition(InteligentDataCondition minConsumeCondition) {
    
    this.minConsumeCondition = minConsumeCondition;
    return this;
  }

   /**
   * Get minConsumeCondition
   * @return minConsumeCondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InteligentDataCondition getMinConsumeCondition() {
    return minConsumeCondition;
  }


  public void setMinConsumeCondition(InteligentDataCondition minConsumeCondition) {
    this.minConsumeCondition = minConsumeCondition;
  }


  public InteligentUseRule payRedirectUrl(String payRedirectUrl) {
    
    this.payRedirectUrl = payRedirectUrl;
    return this;
  }

   /**
   * 券买单跳转链接
   * @return payRedirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://mycar-parkingplatform.alipay-eco.com/pbizplatform/park/parking/stayPayCarList?entrance=1", value = "券买单跳转链接")

  public String getPayRedirectUrl() {
    return payRedirectUrl;
  }


  public void setPayRedirectUrl(String payRedirectUrl) {
    this.payRedirectUrl = payRedirectUrl;
  }


  public InteligentUseRule suitShops(List<String> suitShops) {
    
    this.suitShops = suitShops;
    return this;
  }

  public InteligentUseRule addSuitShopsItem(String suitShopsItem) {
    if (this.suitShops == null) {
      this.suitShops = new ArrayList<>();
    }
    this.suitShops.add(suitShopsItem);
    return this;
  }

   /**
   * 券适用门店列表  仅品牌商发起的招商活动可为空  直发奖类型活动必须与活动适用门店一致  最多支持10w家门店
   * @return suitShops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015110600077000000002125023,2015110600077000000002125022", value = "券适用门店列表  仅品牌商发起的招商活动可为空  直发奖类型活动必须与活动适用门店一致  最多支持10w家门店")

  public List<String> getSuitShops() {
    return suitShops;
  }


  public void setSuitShops(List<String> suitShops) {
    this.suitShops = suitShops;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteligentUseRule inteligentUseRule = (InteligentUseRule) o;
    return Objects.equals(this.inteligentForbiddenTime, inteligentUseRule.inteligentForbiddenTime) &&
        Objects.equals(this.inteligentUseTimes, inteligentUseRule.inteligentUseTimes) &&
        Objects.equals(this.limitRule, inteligentUseRule.limitRule) &&
        Objects.equals(this.minConsume, inteligentUseRule.minConsume) &&
        Objects.equals(this.minConsumeCondition, inteligentUseRule.minConsumeCondition) &&
        Objects.equals(this.payRedirectUrl, inteligentUseRule.payRedirectUrl) &&
        Objects.equals(this.suitShops, inteligentUseRule.suitShops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inteligentForbiddenTime, inteligentUseTimes, limitRule, minConsume, minConsumeCondition, payRedirectUrl, suitShops);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteligentUseRule {\n");
    sb.append("    inteligentForbiddenTime: ").append(toIndentedString(inteligentForbiddenTime)).append("\n");
    sb.append("    inteligentUseTimes: ").append(toIndentedString(inteligentUseTimes)).append("\n");
    sb.append("    limitRule: ").append(toIndentedString(limitRule)).append("\n");
    sb.append("    minConsume: ").append(toIndentedString(minConsume)).append("\n");
    sb.append("    minConsumeCondition: ").append(toIndentedString(minConsumeCondition)).append("\n");
    sb.append("    payRedirectUrl: ").append(toIndentedString(payRedirectUrl)).append("\n");
    sb.append("    suitShops: ").append(toIndentedString(suitShops)).append("\n");
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
    openapiFields.add("inteligent_forbidden_time");
    openapiFields.add("inteligent_use_times");
    openapiFields.add("limit_rule");
    openapiFields.add("min_consume");
    openapiFields.add("min_consume_condition");
    openapiFields.add("pay_redirect_url");
    openapiFields.add("suit_shops");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteligentUseRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InteligentUseRule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteligentUseRule is not found in the empty JSON string", InteligentUseRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteligentUseRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteligentUseRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `inteligent_forbidden_time`
      if (jsonObj.getAsJsonObject("inteligent_forbidden_time") != null) {
        InteligentForbiddenTime.validateJsonObject(jsonObj.getAsJsonObject("inteligent_forbidden_time"));
      }
      JsonArray jsonArrayinteligentUseTimes = jsonObj.getAsJsonArray("inteligent_use_times");
      if (jsonArrayinteligentUseTimes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("inteligent_use_times").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `inteligent_use_times` to be an array in the JSON string but got `%s`", jsonObj.get("inteligent_use_times").toString()));
        }

        // validate the optional field `inteligent_use_times` (array)
        for (int i = 0; i < jsonArrayinteligentUseTimes.size(); i++) {
          InteligentUseTime.validateJsonObject(jsonArrayinteligentUseTimes.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("limit_rule") != null && !jsonObj.get("limit_rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limit_rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limit_rule").toString()));
      }
      if (jsonObj.get("min_consume") != null && !jsonObj.get("min_consume").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min_consume` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min_consume").toString()));
      }
      // validate the optional field `min_consume_condition`
      if (jsonObj.getAsJsonObject("min_consume_condition") != null) {
        InteligentDataCondition.validateJsonObject(jsonObj.getAsJsonObject("min_consume_condition"));
      }
      if (jsonObj.get("pay_redirect_url") != null && !jsonObj.get("pay_redirect_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_redirect_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_redirect_url").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("suit_shops") != null && !jsonObj.get("suit_shops").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `suit_shops` to be an array in the JSON string but got `%s`", jsonObj.get("suit_shops").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteligentUseRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteligentUseRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteligentUseRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteligentUseRule.class));

       return (TypeAdapter<T>) new TypeAdapter<InteligentUseRule>() {
           @Override
           public void write(JsonWriter out, InteligentUseRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteligentUseRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteligentUseRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteligentUseRule
  * @throws IOException if the JSON string is invalid with respect to InteligentUseRule
  */
  public static InteligentUseRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteligentUseRule.class);
  }

 /**
  * Convert an instance of InteligentUseRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

