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
 * UserAssetInfoVO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserAssetInfoVO {
  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_ASSET_TYPE = "asset_type";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private String assetType;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_USER_OPEN_ID = "user_open_id";
  @SerializedName(SERIALIZED_NAME_USER_OPEN_ID)
  private String userOpenId;

  public UserAssetInfoVO() { 
  }

  public UserAssetInfoVO assetId(String assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 资产ID
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123412341234", value = "资产ID")

  public String getAssetId() {
    return assetId;
  }


  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public UserAssetInfoVO assetType(String assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * 资产类型
   * @return assetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACCOUNT_BOOK_ID", value = "资产类型")

  public String getAssetType() {
    return assetType;
  }


  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }


  public UserAssetInfoVO userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 支付宝用户ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088XXXX", value = "支付宝用户ID")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public UserAssetInfoVO userOpenId(String userOpenId) {
    
    this.userOpenId = userOpenId;
    return this;
  }

   /**
   * 支付宝用户开放ID
   * @return userOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ioe2318sjrahdsksmvj28471", value = "支付宝用户开放ID")

  public String getUserOpenId() {
    return userOpenId;
  }


  public void setUserOpenId(String userOpenId) {
    this.userOpenId = userOpenId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAssetInfoVO userAssetInfoVO = (UserAssetInfoVO) o;
    return Objects.equals(this.assetId, userAssetInfoVO.assetId) &&
        Objects.equals(this.assetType, userAssetInfoVO.assetType) &&
        Objects.equals(this.userId, userAssetInfoVO.userId) &&
        Objects.equals(this.userOpenId, userAssetInfoVO.userOpenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, userId, userOpenId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAssetInfoVO {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userOpenId: ").append(toIndentedString(userOpenId)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("asset_type");
    openapiFields.add("user_id");
    openapiFields.add("user_open_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserAssetInfoVO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserAssetInfoVO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserAssetInfoVO is not found in the empty JSON string", UserAssetInfoVO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserAssetInfoVO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserAssetInfoVO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("asset_id") != null && !jsonObj.get("asset_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_id").toString()));
      }
      if (jsonObj.get("asset_type") != null && !jsonObj.get("asset_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_type").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (jsonObj.get("user_open_id") != null && !jsonObj.get("user_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_open_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserAssetInfoVO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserAssetInfoVO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserAssetInfoVO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserAssetInfoVO.class));

       return (TypeAdapter<T>) new TypeAdapter<UserAssetInfoVO>() {
           @Override
           public void write(JsonWriter out, UserAssetInfoVO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserAssetInfoVO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserAssetInfoVO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserAssetInfoVO
  * @throws IOException if the JSON string is invalid with respect to UserAssetInfoVO
  */
  public static UserAssetInfoVO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserAssetInfoVO.class);
  }

 /**
  * Convert an instance of UserAssetInfoVO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

