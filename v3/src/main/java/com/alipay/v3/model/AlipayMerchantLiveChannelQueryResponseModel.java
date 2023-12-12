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
 * AlipayMerchantLiveChannelQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantLiveChannelQueryResponseModel {
  public static final String SERIALIZED_NAME_CHANNEL_CONTENT = "channel_content";
  @SerializedName(SERIALIZED_NAME_CHANNEL_CONTENT)
  private String channelContent;

  public static final String SERIALIZED_NAME_CHANNEL_IDENTITY = "channel_identity";
  @SerializedName(SERIALIZED_NAME_CHANNEL_IDENTITY)
  private String channelIdentity;

  public static final String SERIALIZED_NAME_CHANNEL_SECRET = "channel_secret";
  @SerializedName(SERIALIZED_NAME_CHANNEL_SECRET)
  private String channelSecret;

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private String channelType;

  public AlipayMerchantLiveChannelQueryResponseModel() { 
  }

  public AlipayMerchantLiveChannelQueryResponseModel channelContent(String channelContent) {
    
    this.channelContent = channelContent;
    return this;
  }

   /**
   * 渠道内容，包含主播、文章的上游信息。字符串内容为Map，需要转换
   * @return channelContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "渠道内容，包含主播、文章的上游信息。字符串内容为Map，需要转换")

  public String getChannelContent() {
    return channelContent;
  }


  public void setChannelContent(String channelContent) {
    this.channelContent = channelContent;
  }


  public AlipayMerchantLiveChannelQueryResponseModel channelIdentity(String channelIdentity) {
    
    this.channelIdentity = channelIdentity;
    return this;
  }

   /**
   * 渠道业务标识
   * @return channelIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A202212020736054901000799_2292541656", value = "渠道业务标识")

  public String getChannelIdentity() {
    return channelIdentity;
  }


  public void setChannelIdentity(String channelIdentity) {
    this.channelIdentity = channelIdentity;
  }


  public AlipayMerchantLiveChannelQueryResponseModel channelSecret(String channelSecret) {
    
    this.channelSecret = channelSecret;
    return this;
  }

   /**
   * 渠道密文
   * @return channelSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "b07d6694341b69c406522d3ff28d9807", value = "渠道密文")

  public String getChannelSecret() {
    return channelSecret;
  }


  public void setChannelSecret(String channelSecret) {
    this.channelSecret = channelSecret;
  }


  public AlipayMerchantLiveChannelQueryResponseModel channelType(String channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * 渠道类型
   * @return channelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LIVE_POCKET", value = "渠道类型")

  public String getChannelType() {
    return channelType;
  }


  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMerchantLiveChannelQueryResponseModel alipayMerchantLiveChannelQueryResponseModel = (AlipayMerchantLiveChannelQueryResponseModel) o;
    return Objects.equals(this.channelContent, alipayMerchantLiveChannelQueryResponseModel.channelContent) &&
        Objects.equals(this.channelIdentity, alipayMerchantLiveChannelQueryResponseModel.channelIdentity) &&
        Objects.equals(this.channelSecret, alipayMerchantLiveChannelQueryResponseModel.channelSecret) &&
        Objects.equals(this.channelType, alipayMerchantLiveChannelQueryResponseModel.channelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelContent, channelIdentity, channelSecret, channelType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantLiveChannelQueryResponseModel {\n");
    sb.append("    channelContent: ").append(toIndentedString(channelContent)).append("\n");
    sb.append("    channelIdentity: ").append(toIndentedString(channelIdentity)).append("\n");
    sb.append("    channelSecret: ").append(toIndentedString(channelSecret)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
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
    openapiFields.add("channel_content");
    openapiFields.add("channel_identity");
    openapiFields.add("channel_secret");
    openapiFields.add("channel_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantLiveChannelQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantLiveChannelQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantLiveChannelQueryResponseModel is not found in the empty JSON string", AlipayMerchantLiveChannelQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMerchantLiveChannelQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMerchantLiveChannelQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("channel_content") != null && !jsonObj.get("channel_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_content").toString()));
      }
      if (jsonObj.get("channel_identity") != null && !jsonObj.get("channel_identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_identity").toString()));
      }
      if (jsonObj.get("channel_secret") != null && !jsonObj.get("channel_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_secret").toString()));
      }
      if (jsonObj.get("channel_type") != null && !jsonObj.get("channel_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantLiveChannelQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantLiveChannelQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantLiveChannelQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantLiveChannelQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantLiveChannelQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantLiveChannelQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMerchantLiveChannelQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMerchantLiveChannelQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantLiveChannelQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantLiveChannelQueryResponseModel
  */
  public static AlipayMerchantLiveChannelQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantLiveChannelQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantLiveChannelQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

