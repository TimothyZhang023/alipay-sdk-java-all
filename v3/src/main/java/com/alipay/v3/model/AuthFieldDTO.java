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
 * AuthFieldDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthFieldDTO {
  public static final String SERIALIZED_NAME_API_NAME = "api_name";
  @SerializedName(SERIALIZED_NAME_API_NAME)
  private String apiName;

  public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_PACKAGE_CODE = "package_code";
  @SerializedName(SERIALIZED_NAME_PACKAGE_CODE)
  private String packageCode;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_USER_APP_ID = "user_app_id";
  @SerializedName(SERIALIZED_NAME_USER_APP_ID)
  private String userAppId;

  public AuthFieldDTO() { 
  }

  public AuthFieldDTO apiName(String apiName) {
    
    this.apiName = apiName;
    return this;
  }

   /**
   * 接口英文名称
   * @return apiName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipay.user.info.share", value = "接口英文名称")

  public String getApiName() {
    return apiName;
  }


  public void setApiName(String apiName) {
    this.apiName = apiName;
  }


  public AuthFieldDTO fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * 接口字段英文名称
   * @return fieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mobile", value = "接口字段英文名称")

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public AuthFieldDTO packageCode(String packageCode) {
    
    this.packageCode = packageCode;
    return this;
  }

   /**
   * 接口归属的功能code
   * @return packageCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190910140822144236", value = "接口归属的功能code")

  public String getPackageCode() {
    return packageCode;
  }


  public void setPackageCode(String packageCode) {
    this.packageCode = packageCode;
  }


  public AuthFieldDTO reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 驳回原因
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "使用场景不在信息开放的范围内", value = "驳回原因")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public AuthFieldDTO status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * AUDIT 审核中，AGREE通过，REJECT驳回，INVALID无效（isv代申请场景)
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUDIT", value = "AUDIT 审核中，AGREE通过，REJECT驳回，INVALID无效（isv代申请场景)")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AuthFieldDTO userAppId(String userAppId) {
    
    this.userAppId = userAppId;
    return this;
  }

   /**
   * 用户应用app_id
   * @return userAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2008001193675073", value = "用户应用app_id")

  public String getUserAppId() {
    return userAppId;
  }


  public void setUserAppId(String userAppId) {
    this.userAppId = userAppId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthFieldDTO authFieldDTO = (AuthFieldDTO) o;
    return Objects.equals(this.apiName, authFieldDTO.apiName) &&
        Objects.equals(this.fieldName, authFieldDTO.fieldName) &&
        Objects.equals(this.packageCode, authFieldDTO.packageCode) &&
        Objects.equals(this.reason, authFieldDTO.reason) &&
        Objects.equals(this.status, authFieldDTO.status) &&
        Objects.equals(this.userAppId, authFieldDTO.userAppId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiName, fieldName, packageCode, reason, status, userAppId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthFieldDTO {\n");
    sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    packageCode: ").append(toIndentedString(packageCode)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userAppId: ").append(toIndentedString(userAppId)).append("\n");
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
    openapiFields.add("api_name");
    openapiFields.add("field_name");
    openapiFields.add("package_code");
    openapiFields.add("reason");
    openapiFields.add("status");
    openapiFields.add("user_app_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthFieldDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthFieldDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthFieldDTO is not found in the empty JSON string", AuthFieldDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthFieldDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthFieldDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("api_name") != null && !jsonObj.get("api_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_name").toString()));
      }
      if (jsonObj.get("field_name") != null && !jsonObj.get("field_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field_name").toString()));
      }
      if (jsonObj.get("package_code") != null && !jsonObj.get("package_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_code").toString()));
      }
      if (jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("user_app_id") != null && !jsonObj.get("user_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_app_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthFieldDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthFieldDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthFieldDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthFieldDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthFieldDTO>() {
           @Override
           public void write(JsonWriter out, AuthFieldDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthFieldDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthFieldDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthFieldDTO
  * @throws IOException if the JSON string is invalid with respect to AuthFieldDTO
  */
  public static AuthFieldDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthFieldDTO.class);
  }

 /**
  * Convert an instance of AuthFieldDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

