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
 * InteligentSendRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteligentSendRule {
  public static final String SERIALIZED_NAME_ALLOW_REPEAT_SEND = "allow_repeat_send";
  @SerializedName(SERIALIZED_NAME_ALLOW_REPEAT_SEND)
  private String allowRepeatSend;

  public static final String SERIALIZED_NAME_MIN_COST = "min_cost";
  @SerializedName(SERIALIZED_NAME_MIN_COST)
  private String minCost;

  public static final String SERIALIZED_NAME_SEND_BUDGET = "send_budget";
  @SerializedName(SERIALIZED_NAME_SEND_BUDGET)
  private String sendBudget;

  public static final String SERIALIZED_NAME_SEND_NUM = "send_num";
  @SerializedName(SERIALIZED_NAME_SEND_NUM)
  private String sendNum;

  public InteligentSendRule() { 
  }

  public InteligentSendRule allowRepeatSend(String allowRepeatSend) {
    
    this.allowRepeatSend = allowRepeatSend;
    return this;
  }

   /**
   * 是否允许重复发奖：  true代表允许，false代表不允许  默认不设置，表明用户领取券后如果没有核销则不允许再次领取券  如果设置为true，表明如果用户领取券后没有核销，还可以继续领取该券
   * @return allowRepeatSend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否允许重复发奖：  true代表允许，false代表不允许  默认不设置，表明用户领取券后如果没有核销则不允许再次领取券  如果设置为true，表明如果用户领取券后没有核销，还可以继续领取该券")

  public String getAllowRepeatSend() {
    return allowRepeatSend;
  }


  public void setAllowRepeatSend(String allowRepeatSend) {
    this.allowRepeatSend = allowRepeatSend;
  }


  public InteligentSendRule minCost(String minCost) {
    
    this.minCost = minCost;
    return this;
  }

   /**
   * 发券最低消费金额，单位元  活动类型为消费送且不是消费送礼包时设置  多营销工具之间不允许设置重复值
   * @return minCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "发券最低消费金额，单位元  活动类型为消费送且不是消费送礼包时设置  多营销工具之间不允许设置重复值")

  public String getMinCost() {
    return minCost;
  }


  public void setMinCost(String minCost) {
    this.minCost = minCost;
  }


  public InteligentSendRule sendBudget(String sendBudget) {
    
    this.sendBudget = sendBudget;
    return this;
  }

   /**
   * 券的预算数量（仅对口令送随机抽奖有效，即当活动类型为GUESS_SEND，且营销工具PromoTool的个数大于1时，此字段必填，其余情况此字段必为空）
   * @return sendBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "券的预算数量（仅对口令送随机抽奖有效，即当活动类型为GUESS_SEND，且营销工具PromoTool的个数大于1时，此字段必填，其余情况此字段必为空）")

  public String getSendBudget() {
    return sendBudget;
  }


  public void setSendBudget(String sendBudget) {
    this.sendBudget = sendBudget;
  }


  public InteligentSendRule sendNum(String sendNum) {
    
    this.sendNum = sendNum;
    return this;
  }

   /**
   * 发券数目  最少发1张券，最多发5张券
   * @return sendNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "发券数目  最少发1张券，最多发5张券")

  public String getSendNum() {
    return sendNum;
  }


  public void setSendNum(String sendNum) {
    this.sendNum = sendNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteligentSendRule inteligentSendRule = (InteligentSendRule) o;
    return Objects.equals(this.allowRepeatSend, inteligentSendRule.allowRepeatSend) &&
        Objects.equals(this.minCost, inteligentSendRule.minCost) &&
        Objects.equals(this.sendBudget, inteligentSendRule.sendBudget) &&
        Objects.equals(this.sendNum, inteligentSendRule.sendNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowRepeatSend, minCost, sendBudget, sendNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteligentSendRule {\n");
    sb.append("    allowRepeatSend: ").append(toIndentedString(allowRepeatSend)).append("\n");
    sb.append("    minCost: ").append(toIndentedString(minCost)).append("\n");
    sb.append("    sendBudget: ").append(toIndentedString(sendBudget)).append("\n");
    sb.append("    sendNum: ").append(toIndentedString(sendNum)).append("\n");
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
    openapiFields.add("allow_repeat_send");
    openapiFields.add("min_cost");
    openapiFields.add("send_budget");
    openapiFields.add("send_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteligentSendRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InteligentSendRule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteligentSendRule is not found in the empty JSON string", InteligentSendRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteligentSendRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteligentSendRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("allow_repeat_send") != null && !jsonObj.get("allow_repeat_send").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allow_repeat_send` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allow_repeat_send").toString()));
      }
      if (jsonObj.get("min_cost") != null && !jsonObj.get("min_cost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min_cost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min_cost").toString()));
      }
      if (jsonObj.get("send_budget") != null && !jsonObj.get("send_budget").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `send_budget` to be a primitive type in the JSON string but got `%s`", jsonObj.get("send_budget").toString()));
      }
      if (jsonObj.get("send_num") != null && !jsonObj.get("send_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `send_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("send_num").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteligentSendRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteligentSendRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteligentSendRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteligentSendRule.class));

       return (TypeAdapter<T>) new TypeAdapter<InteligentSendRule>() {
           @Override
           public void write(JsonWriter out, InteligentSendRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteligentSendRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteligentSendRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteligentSendRule
  * @throws IOException if the JSON string is invalid with respect to InteligentSendRule
  */
  public static InteligentSendRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteligentSendRule.class);
  }

 /**
  * Convert an instance of InteligentSendRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

