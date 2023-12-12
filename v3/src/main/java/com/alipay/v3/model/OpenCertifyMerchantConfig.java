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
 * OpenCertifyMerchantConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenCertifyMerchantConfig {
  public static final String SERIALIZED_NAME_AUTH_SCOPE = "auth_scope";
  @SerializedName(SERIALIZED_NAME_AUTH_SCOPE)
  private String authScope;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private String authType;

  public static final String SERIALIZED_NAME_FACE_RESERVE_STRATEGY = "face_reserve_strategy";
  @SerializedName(SERIALIZED_NAME_FACE_RESERVE_STRATEGY)
  private String faceReserveStrategy;

  public static final String SERIALIZED_NAME_FACIAL_PICTURE_LEVEL = "facial_picture_level";
  @SerializedName(SERIALIZED_NAME_FACIAL_PICTURE_LEVEL)
  private String facialPictureLevel;

  public static final String SERIALIZED_NAME_LINKED_MERCHANT_APP_ID = "linked_merchant_app_id";
  @SerializedName(SERIALIZED_NAME_LINKED_MERCHANT_APP_ID)
  private String linkedMerchantAppId;

  public static final String SERIALIZED_NAME_LINKED_MERCHANT_LOGO_URL = "linked_merchant_logo_url";
  @SerializedName(SERIALIZED_NAME_LINKED_MERCHANT_LOGO_URL)
  private String linkedMerchantLogoUrl;

  public static final String SERIALIZED_NAME_LINKED_MERCHANT_NAME = "linked_merchant_name";
  @SerializedName(SERIALIZED_NAME_LINKED_MERCHANT_NAME)
  private String linkedMerchantName;

  public static final String SERIALIZED_NAME_OUT_PUT_FACIAL_PICTURE = "out_put_facial_picture";
  @SerializedName(SERIALIZED_NAME_OUT_PUT_FACIAL_PICTURE)
  private Boolean outPutFacialPicture;

  public static final String SERIALIZED_NAME_RETURN_URL = "return_url";
  @SerializedName(SERIALIZED_NAME_RETURN_URL)
  private String returnUrl;

  public OpenCertifyMerchantConfig() { 
  }

  public OpenCertifyMerchantConfig authScope(String authScope) {
    
    this.authScope = authScope;
    return this;
  }

   /**
   * 用于开放认证授权
   * @return authScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx", value = "用于开放认证授权")

  public String getAuthScope() {
    return authScope;
  }


  public void setAuthScope(String authScope) {
    this.authScope = authScope;
  }


  public OpenCertifyMerchantConfig authType(String authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * 用于指定授权类型，与auth_scope配合使用
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx", value = "用于指定授权类型，与auth_scope配合使用")

  public String getAuthType() {
    return authType;
  }


  public void setAuthType(String authType) {
    this.authType = authType;
  }


  public OpenCertifyMerchantConfig faceReserveStrategy(String faceReserveStrategy) {
    
    this.faceReserveStrategy = faceReserveStrategy;
    return this;
  }

   /**
   * 不传默认为reserve
   * @return faceReserveStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "reserve", value = "不传默认为reserve")

  public String getFaceReserveStrategy() {
    return faceReserveStrategy;
  }


  public void setFaceReserveStrategy(String faceReserveStrategy) {
    this.faceReserveStrategy = faceReserveStrategy;
  }


  public OpenCertifyMerchantConfig facialPictureLevel(String facialPictureLevel) {
    
    this.facialPictureLevel = facialPictureLevel;
    return this;
  }

   /**
   * 若有特殊人脸等级采集要求，可指定等级
   * @return facialPictureLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FIN0", value = "若有特殊人脸等级采集要求，可指定等级")

  public String getFacialPictureLevel() {
    return facialPictureLevel;
  }


  public void setFacialPictureLevel(String facialPictureLevel) {
    this.facialPictureLevel = facialPictureLevel;
  }


  public OpenCertifyMerchantConfig linkedMerchantAppId(String linkedMerchantAppId) {
    
    this.linkedMerchantAppId = linkedMerchantAppId;
    return this;
  }

   /**
   * 用于授权二级商户操作
   * @return linkedMerchantAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "202134xxxx", value = "用于授权二级商户操作")

  public String getLinkedMerchantAppId() {
    return linkedMerchantAppId;
  }


  public void setLinkedMerchantAppId(String linkedMerchantAppId) {
    this.linkedMerchantAppId = linkedMerchantAppId;
  }


  public OpenCertifyMerchantConfig linkedMerchantLogoUrl(String linkedMerchantLogoUrl) {
    
    this.linkedMerchantLogoUrl = linkedMerchantLogoUrl;
    return this;
  }

   /**
   * 用于指定展示的商户logo
   * @return linkedMerchantLogoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://xxx", value = "用于指定展示的商户logo")

  public String getLinkedMerchantLogoUrl() {
    return linkedMerchantLogoUrl;
  }


  public void setLinkedMerchantLogoUrl(String linkedMerchantLogoUrl) {
    this.linkedMerchantLogoUrl = linkedMerchantLogoUrl;
  }


  public OpenCertifyMerchantConfig linkedMerchantName(String linkedMerchantName) {
    
    this.linkedMerchantName = linkedMerchantName;
    return this;
  }

   /**
   * 用于指定展示的商户名称
   * @return linkedMerchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州xx公司", value = "用于指定展示的商户名称")

  public String getLinkedMerchantName() {
    return linkedMerchantName;
  }


  public void setLinkedMerchantName(String linkedMerchantName) {
    this.linkedMerchantName = linkedMerchantName;
  }


  public OpenCertifyMerchantConfig outPutFacialPicture(Boolean outPutFacialPicture) {
    
    this.outPutFacialPicture = outPutFacialPicture;
    return this;
  }

   /**
   * 在拥有该权限前提下，用于商户控制是否透出活体人脸
   * @return outPutFacialPicture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "在拥有该权限前提下，用于商户控制是否透出活体人脸")

  public Boolean getOutPutFacialPicture() {
    return outPutFacialPicture;
  }


  public void setOutPutFacialPicture(Boolean outPutFacialPicture) {
    this.outPutFacialPicture = outPutFacialPicture;
  }


  public OpenCertifyMerchantConfig returnUrl(String returnUrl) {
    
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * 认证成功后需要跳转的地址，一般为商户业务页面；若无跳转地址可填空字符\&quot;\&quot;;
   * @return returnUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://xxx", value = "认证成功后需要跳转的地址，一般为商户业务页面；若无跳转地址可填空字符\"\";")

  public String getReturnUrl() {
    return returnUrl;
  }


  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenCertifyMerchantConfig openCertifyMerchantConfig = (OpenCertifyMerchantConfig) o;
    return Objects.equals(this.authScope, openCertifyMerchantConfig.authScope) &&
        Objects.equals(this.authType, openCertifyMerchantConfig.authType) &&
        Objects.equals(this.faceReserveStrategy, openCertifyMerchantConfig.faceReserveStrategy) &&
        Objects.equals(this.facialPictureLevel, openCertifyMerchantConfig.facialPictureLevel) &&
        Objects.equals(this.linkedMerchantAppId, openCertifyMerchantConfig.linkedMerchantAppId) &&
        Objects.equals(this.linkedMerchantLogoUrl, openCertifyMerchantConfig.linkedMerchantLogoUrl) &&
        Objects.equals(this.linkedMerchantName, openCertifyMerchantConfig.linkedMerchantName) &&
        Objects.equals(this.outPutFacialPicture, openCertifyMerchantConfig.outPutFacialPicture) &&
        Objects.equals(this.returnUrl, openCertifyMerchantConfig.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authScope, authType, faceReserveStrategy, facialPictureLevel, linkedMerchantAppId, linkedMerchantLogoUrl, linkedMerchantName, outPutFacialPicture, returnUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenCertifyMerchantConfig {\n");
    sb.append("    authScope: ").append(toIndentedString(authScope)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    faceReserveStrategy: ").append(toIndentedString(faceReserveStrategy)).append("\n");
    sb.append("    facialPictureLevel: ").append(toIndentedString(facialPictureLevel)).append("\n");
    sb.append("    linkedMerchantAppId: ").append(toIndentedString(linkedMerchantAppId)).append("\n");
    sb.append("    linkedMerchantLogoUrl: ").append(toIndentedString(linkedMerchantLogoUrl)).append("\n");
    sb.append("    linkedMerchantName: ").append(toIndentedString(linkedMerchantName)).append("\n");
    sb.append("    outPutFacialPicture: ").append(toIndentedString(outPutFacialPicture)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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
    openapiFields.add("auth_scope");
    openapiFields.add("auth_type");
    openapiFields.add("face_reserve_strategy");
    openapiFields.add("facial_picture_level");
    openapiFields.add("linked_merchant_app_id");
    openapiFields.add("linked_merchant_logo_url");
    openapiFields.add("linked_merchant_name");
    openapiFields.add("out_put_facial_picture");
    openapiFields.add("return_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OpenCertifyMerchantConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OpenCertifyMerchantConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenCertifyMerchantConfig is not found in the empty JSON string", OpenCertifyMerchantConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OpenCertifyMerchantConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenCertifyMerchantConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("auth_scope") != null && !jsonObj.get("auth_scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_scope").toString()));
      }
      if (jsonObj.get("auth_type") != null && !jsonObj.get("auth_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_type").toString()));
      }
      if (jsonObj.get("face_reserve_strategy") != null && !jsonObj.get("face_reserve_strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `face_reserve_strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("face_reserve_strategy").toString()));
      }
      if (jsonObj.get("facial_picture_level") != null && !jsonObj.get("facial_picture_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `facial_picture_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("facial_picture_level").toString()));
      }
      if (jsonObj.get("linked_merchant_app_id") != null && !jsonObj.get("linked_merchant_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linked_merchant_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linked_merchant_app_id").toString()));
      }
      if (jsonObj.get("linked_merchant_logo_url") != null && !jsonObj.get("linked_merchant_logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linked_merchant_logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linked_merchant_logo_url").toString()));
      }
      if (jsonObj.get("linked_merchant_name") != null && !jsonObj.get("linked_merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linked_merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linked_merchant_name").toString()));
      }
      if (jsonObj.get("return_url") != null && !jsonObj.get("return_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenCertifyMerchantConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenCertifyMerchantConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenCertifyMerchantConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenCertifyMerchantConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenCertifyMerchantConfig>() {
           @Override
           public void write(JsonWriter out, OpenCertifyMerchantConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenCertifyMerchantConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenCertifyMerchantConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenCertifyMerchantConfig
  * @throws IOException if the JSON string is invalid with respect to OpenCertifyMerchantConfig
  */
  public static OpenCertifyMerchantConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenCertifyMerchantConfig.class);
  }

 /**
  * Convert an instance of OpenCertifyMerchantConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

