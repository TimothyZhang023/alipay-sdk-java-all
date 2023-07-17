/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-07-17
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
 * ChatMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChatMessage {
  public static final String SERIALIZED_NAME_MESSAGE_CONTENT = "message_content";
  @SerializedName(SERIALIZED_NAME_MESSAGE_CONTENT)
  private String messageContent;

  public static final String SERIALIZED_NAME_MESSAGE_TYPE = "message_type";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
  private String messageType;

  public static final String SERIALIZED_NAME_SEND_TIME = "send_time";
  @SerializedName(SERIALIZED_NAME_SEND_TIME)
  private String sendTime;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_USER_TYPE = "user_type";
  @SerializedName(SERIALIZED_NAME_USER_TYPE)
  private String userType;

  public ChatMessage() { 
  }

  public ChatMessage messageContent(String messageContent) {
    
    this.messageContent = messageContent;
    return this;
  }

   /**
   * 消息内容
   * @return messageContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "你好", value = "消息内容")

  public String getMessageContent() {
    return messageContent;
  }


  public void setMessageContent(String messageContent) {
    this.messageContent = messageContent;
  }


  public ChatMessage messageType(String messageType) {
    
    this.messageType = messageType;
    return this;
  }

   /**
   * 消息内容类型,默认TEXT,包括: TEXT(文本消息),IMAGE(图片消息),FILE(文件消息)
   * @return messageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TEXT", value = "消息内容类型,默认TEXT,包括: TEXT(文本消息),IMAGE(图片消息),FILE(文件消息)")

  public String getMessageType() {
    return messageType;
  }


  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }


  public ChatMessage sendTime(String sendTime) {
    
    this.sendTime = sendTime;
    return this;
  }

   /**
   * 消息发送时间，按照ISO8601标准表示，比如：2018-12-24T15:38:17.824+08:00
   * @return sendTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-05-12 06:06:02", value = "消息发送时间，按照ISO8601标准表示，比如：2018-12-24T15:38:17.824+08:00")

  public String getSendTime() {
    return sendTime;
  }


  public void setSendTime(String sendTime) {
    this.sendTime = sendTime;
  }


  public ChatMessage userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * 发送者名称
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "李明", value = "发送者名称")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  public ChatMessage userType(String userType) {
    
    this.userType = userType;
    return this;
  }

   /**
   * 发送者类型: VISITOR(访客) ,AGENT(在线客服) ,SYSTEM(系统)
   * @return userType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VISITOR", value = "发送者类型: VISITOR(访客) ,AGENT(在线客服) ,SYSTEM(系统)")

  public String getUserType() {
    return userType;
  }


  public void setUserType(String userType) {
    this.userType = userType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatMessage chatMessage = (ChatMessage) o;
    return Objects.equals(this.messageContent, chatMessage.messageContent) &&
        Objects.equals(this.messageType, chatMessage.messageType) &&
        Objects.equals(this.sendTime, chatMessage.sendTime) &&
        Objects.equals(this.userName, chatMessage.userName) &&
        Objects.equals(this.userType, chatMessage.userType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageContent, messageType, sendTime, userName, userType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMessage {\n");
    sb.append("    messageContent: ").append(toIndentedString(messageContent)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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
    openapiFields.add("message_content");
    openapiFields.add("message_type");
    openapiFields.add("send_time");
    openapiFields.add("user_name");
    openapiFields.add("user_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChatMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ChatMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChatMessage is not found in the empty JSON string", ChatMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChatMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChatMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("message_content") != null && !jsonObj.get("message_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_content").toString()));
      }
      if (jsonObj.get("message_type") != null && !jsonObj.get("message_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_type").toString()));
      }
      if (jsonObj.get("send_time") != null && !jsonObj.get("send_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `send_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("send_time").toString()));
      }
      if (jsonObj.get("user_name") != null && !jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
      if (jsonObj.get("user_type") != null && !jsonObj.get("user_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatMessage>() {
           @Override
           public void write(JsonWriter out, ChatMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChatMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChatMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatMessage
  * @throws IOException if the JSON string is invalid with respect to ChatMessage
  */
  public static ChatMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatMessage.class);
  }

 /**
  * Convert an instance of ChatMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

