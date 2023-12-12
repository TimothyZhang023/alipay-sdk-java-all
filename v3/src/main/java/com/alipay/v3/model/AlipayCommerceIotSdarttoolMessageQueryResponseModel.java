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
 * AlipayCommerceIotSdarttoolMessageQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceIotSdarttoolMessageQueryResponseModel {
  public static final String SERIALIZED_NAME_CONSUME_ERR_CODE = "consume_err_code";
  @SerializedName(SERIALIZED_NAME_CONSUME_ERR_CODE)
  private String consumeErrCode;

  public static final String SERIALIZED_NAME_CONSUME_ERR_MSG = "consume_err_msg";
  @SerializedName(SERIALIZED_NAME_CONSUME_ERR_MSG)
  private String consumeErrMsg;

  public static final String SERIALIZED_NAME_CONSUME_STATE = "consume_state";
  @SerializedName(SERIALIZED_NAME_CONSUME_STATE)
  private Integer consumeState;

  public static final String SERIALIZED_NAME_DELIVER_CNT = "deliver_cnt";
  @SerializedName(SERIALIZED_NAME_DELIVER_CNT)
  private Integer deliverCnt;

  public static final String SERIALIZED_NAME_DELIVER_STATUS = "deliver_status";
  @SerializedName(SERIALIZED_NAME_DELIVER_STATUS)
  private String deliverStatus;

  public static final String SERIALIZED_NAME_LAST_DELIVER_AT = "last_deliver_at";
  @SerializedName(SERIALIZED_NAME_LAST_DELIVER_AT)
  private Integer lastDeliverAt;

  public static final String SERIALIZED_NAME_MSG_ACK_TIME = "msg_ack_time";
  @SerializedName(SERIALIZED_NAME_MSG_ACK_TIME)
  private Integer msgAckTime;

  public static final String SERIALIZED_NAME_MSG_BIDA = "msg_bida";
  @SerializedName(SERIALIZED_NAME_MSG_BIDA)
  private Integer msgBida;

  public static final String SERIALIZED_NAME_MSG_EXPIRE_TIME = "msg_expire_time";
  @SerializedName(SERIALIZED_NAME_MSG_EXPIRE_TIME)
  private Integer msgExpireTime;

  public static final String SERIALIZED_NAME_MSG_GMT_CREATE = "msg_gmt_create";
  @SerializedName(SERIALIZED_NAME_MSG_GMT_CREATE)
  private Integer msgGmtCreate;

  public static final String SERIALIZED_NAME_MSG_PRIORITY = "msg_priority";
  @SerializedName(SERIALIZED_NAME_MSG_PRIORITY)
  private Integer msgPriority;

  public AlipayCommerceIotSdarttoolMessageQueryResponseModel() { 
  }

  public AlipayCommerceIotSdarttoolMessageQueryResponseModel consumeErrCode(String consumeErrCode) {
    
    this.consumeErrCode = consumeErrCode;
    return this;
  }

   /**
   * 消息消费返回码，不用的消息类型返回码不一样
   * @return consumeErrCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PRINT_FAIL", value = "消息消费返回码，不用的消息类型返回码不一样")

  public String getConsumeErrCode() {
    return consumeErrCode;
  }


  public void setConsumeErrCode(String consumeErrCode) {
    this.consumeErrCode = consumeErrCode;
  }


  public AlipayCommerceIotSdarttoolMessageQueryResponseModel consumeErrMsg(String consumeErrMsg) {
    
    this.consumeErrMsg = consumeErrMsg;
    return this;
  }

   /**
   * 消息消费错误原因
   * @return consumeErrMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "消息消费错误原因", value = "消息消费错误原因")

  public String getConsumeErrMsg() {
    return consumeErrMsg;
  }


  public void setConsumeErrMsg(String consumeErrMsg) {
    this.consumeErrMsg = consumeErrMsg;
  }


  public AlipayCommerceIotSdarttoolMessageQueryResponseModel consumeState(Integer consumeState) {
    
    this.consumeState = consumeState;
    return this;
  }

   /**
   * 消息消费状态1-未消费; 2-消费成功；3-消费失败
   * @return consumeState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "消息消费状态1-未消费; 2-消费成功；3-消费失败")

  public Integer getConsumeState() {
    return consumeState;
  }


  public void setConsumeState(Integer consumeState) {
    this.consumeState = consumeState;
  }


  public AlipayCommerceIotSdarttoolMessageQueryResponseModel deliverCnt(Integer deliverCnt) {
    
    this.deliverCnt = deliverCnt;
    return this;
  }

   /**
   * 消息投递次数
   * @return deliverCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "消息投递次数")

  public Integer getDeliverCnt() {
    return deliverCnt;
  }


  public void setDeliverCnt(Integer deliverCnt) {
    this.deliverCnt = deliverCnt;
  }


  public AlipayCommerceIotSdarttoolMessageQueryResponseModel deliverStatus(String deliverStatus) {
    
    this.deliverStatus = deliverStatus;
    return this;
  }

   /**
   * 消息投递状态 1: 未投递 2: 投递中 3: 投递成功 4: 投递失败 5: 消息失效不再发送
   * @return deliverStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "消息投递状态 1: 未投递 2: 投递中 3: 投递成功 4: 投递失败 5: 消息失效不再发送")

  public String getDeliverStatus() {
    return deliverStatus;
  }


  public void setDeliverStatus(String deliverStatus) {
    this.deliverStatus = deliverStatus;
  }


  public AlipayCommerceIotSdarttoolMessageQueryResponseModel lastDeliverAt(Integer lastDeliverAt) {
    
    this.lastDeliverAt = lastDeliverAt;
    return this;
  }

   /**
   * 消息最后一次发送时间
   * @return lastDeliverAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1574752505481", value = "消息最后一次发送时间")

  public Integer getLastDeliverAt() {
    return lastDeliverAt;
  }


  public void setLastDeliverAt(Integer lastDeliverAt) {
    this.lastDeliverAt = lastDeliverAt;
  }


  public AlipayCommerceIotSdarttoolMessageQueryResponseModel msgAckTime(Integer msgAckTime) {
    
    this.msgAckTime = msgAckTime;
    return this;
  }

   /**
   * 消息确认消费时间(ms)
   * @return msgAckTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1574752506609", value = "消息确认消费时间(ms)")

  public Integer getMsgAckTime() {
    return msgAckTime;
  }


  public void setMsgAckTime(Integer msgAckTime) {
    this.msgAckTime = msgAckTime;
  }


  public AlipayCommerceIotSdarttoolMessageQueryResponseModel msgBida(Integer msgBida) {
    
    this.msgBida = msgBida;
    return this;
  }

   /**
   * 消息必达类型 1-非必达; 2-必达.
   * @return msgBida
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "消息必达类型 1-非必达; 2-必达.")

  public Integer getMsgBida() {
    return msgBida;
  }


  public void setMsgBida(Integer msgBida) {
    this.msgBida = msgBida;
  }


  public AlipayCommerceIotSdarttoolMessageQueryResponseModel msgExpireTime(Integer msgExpireTime) {
    
    this.msgExpireTime = msgExpireTime;
    return this;
  }

   /**
   * 消息过期时间(ms)
   * @return msgExpireTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1575011705405", value = "消息过期时间(ms)")

  public Integer getMsgExpireTime() {
    return msgExpireTime;
  }


  public void setMsgExpireTime(Integer msgExpireTime) {
    this.msgExpireTime = msgExpireTime;
  }


  public AlipayCommerceIotSdarttoolMessageQueryResponseModel msgGmtCreate(Integer msgGmtCreate) {
    
    this.msgGmtCreate = msgGmtCreate;
    return this;
  }

   /**
   * 消息创建时间(ms)
   * @return msgGmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1575028811454", value = "消息创建时间(ms)")

  public Integer getMsgGmtCreate() {
    return msgGmtCreate;
  }


  public void setMsgGmtCreate(Integer msgGmtCreate) {
    this.msgGmtCreate = msgGmtCreate;
  }


  public AlipayCommerceIotSdarttoolMessageQueryResponseModel msgPriority(Integer msgPriority) {
    
    this.msgPriority = msgPriority;
    return this;
  }

   /**
   * 消息投递优先级
   * @return msgPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "消息投递优先级")

  public Integer getMsgPriority() {
    return msgPriority;
  }


  public void setMsgPriority(Integer msgPriority) {
    this.msgPriority = msgPriority;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceIotSdarttoolMessageQueryResponseModel alipayCommerceIotSdarttoolMessageQueryResponseModel = (AlipayCommerceIotSdarttoolMessageQueryResponseModel) o;
    return Objects.equals(this.consumeErrCode, alipayCommerceIotSdarttoolMessageQueryResponseModel.consumeErrCode) &&
        Objects.equals(this.consumeErrMsg, alipayCommerceIotSdarttoolMessageQueryResponseModel.consumeErrMsg) &&
        Objects.equals(this.consumeState, alipayCommerceIotSdarttoolMessageQueryResponseModel.consumeState) &&
        Objects.equals(this.deliverCnt, alipayCommerceIotSdarttoolMessageQueryResponseModel.deliverCnt) &&
        Objects.equals(this.deliverStatus, alipayCommerceIotSdarttoolMessageQueryResponseModel.deliverStatus) &&
        Objects.equals(this.lastDeliverAt, alipayCommerceIotSdarttoolMessageQueryResponseModel.lastDeliverAt) &&
        Objects.equals(this.msgAckTime, alipayCommerceIotSdarttoolMessageQueryResponseModel.msgAckTime) &&
        Objects.equals(this.msgBida, alipayCommerceIotSdarttoolMessageQueryResponseModel.msgBida) &&
        Objects.equals(this.msgExpireTime, alipayCommerceIotSdarttoolMessageQueryResponseModel.msgExpireTime) &&
        Objects.equals(this.msgGmtCreate, alipayCommerceIotSdarttoolMessageQueryResponseModel.msgGmtCreate) &&
        Objects.equals(this.msgPriority, alipayCommerceIotSdarttoolMessageQueryResponseModel.msgPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumeErrCode, consumeErrMsg, consumeState, deliverCnt, deliverStatus, lastDeliverAt, msgAckTime, msgBida, msgExpireTime, msgGmtCreate, msgPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceIotSdarttoolMessageQueryResponseModel {\n");
    sb.append("    consumeErrCode: ").append(toIndentedString(consumeErrCode)).append("\n");
    sb.append("    consumeErrMsg: ").append(toIndentedString(consumeErrMsg)).append("\n");
    sb.append("    consumeState: ").append(toIndentedString(consumeState)).append("\n");
    sb.append("    deliverCnt: ").append(toIndentedString(deliverCnt)).append("\n");
    sb.append("    deliverStatus: ").append(toIndentedString(deliverStatus)).append("\n");
    sb.append("    lastDeliverAt: ").append(toIndentedString(lastDeliverAt)).append("\n");
    sb.append("    msgAckTime: ").append(toIndentedString(msgAckTime)).append("\n");
    sb.append("    msgBida: ").append(toIndentedString(msgBida)).append("\n");
    sb.append("    msgExpireTime: ").append(toIndentedString(msgExpireTime)).append("\n");
    sb.append("    msgGmtCreate: ").append(toIndentedString(msgGmtCreate)).append("\n");
    sb.append("    msgPriority: ").append(toIndentedString(msgPriority)).append("\n");
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
    openapiFields.add("consume_err_code");
    openapiFields.add("consume_err_msg");
    openapiFields.add("consume_state");
    openapiFields.add("deliver_cnt");
    openapiFields.add("deliver_status");
    openapiFields.add("last_deliver_at");
    openapiFields.add("msg_ack_time");
    openapiFields.add("msg_bida");
    openapiFields.add("msg_expire_time");
    openapiFields.add("msg_gmt_create");
    openapiFields.add("msg_priority");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceIotSdarttoolMessageQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceIotSdarttoolMessageQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceIotSdarttoolMessageQueryResponseModel is not found in the empty JSON string", AlipayCommerceIotSdarttoolMessageQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceIotSdarttoolMessageQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceIotSdarttoolMessageQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("consume_err_code") != null && !jsonObj.get("consume_err_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consume_err_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consume_err_code").toString()));
      }
      if (jsonObj.get("consume_err_msg") != null && !jsonObj.get("consume_err_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consume_err_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consume_err_msg").toString()));
      }
      if (jsonObj.get("deliver_status") != null && !jsonObj.get("deliver_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliver_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliver_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceIotSdarttoolMessageQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceIotSdarttoolMessageQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceIotSdarttoolMessageQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceIotSdarttoolMessageQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceIotSdarttoolMessageQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceIotSdarttoolMessageQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceIotSdarttoolMessageQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceIotSdarttoolMessageQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceIotSdarttoolMessageQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceIotSdarttoolMessageQueryResponseModel
  */
  public static AlipayCommerceIotSdarttoolMessageQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceIotSdarttoolMessageQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceIotSdarttoolMessageQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

