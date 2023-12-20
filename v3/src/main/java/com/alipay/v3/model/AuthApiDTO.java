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
 * AuthApiDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthApiDTO {
  public static final String SERIALIZED_NAME_API_NAME = "api_name";
  @SerializedName(SERIALIZED_NAME_API_NAME)
  private String apiName;

  public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_PACKAGE_CODE = "package_code";
  @SerializedName(SERIALIZED_NAME_PACKAGE_CODE)
  private String packageCode;

  public AuthApiDTO() { 
  }

  public AuthApiDTO apiName(String apiName) {
    
    this.apiName = apiName;
    return this;
  }

   /**
   * 敏感信息可申请接口名
   * @return apiName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "app.mini.user.query", value = "敏感信息可申请接口名")

  public String getApiName() {
    return apiName;
  }


  public void setApiName(String apiName) {
    this.apiName = apiName;
  }


  public AuthApiDTO fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * 敏感信息申请字段
   * @return fieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "name,phone", value = "敏感信息申请字段")

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public AuthApiDTO packageCode(String packageCode) {
    
    this.packageCode = packageCode;
    return this;
  }

   /**
   * 敏感信息申请能力code值
   * @return packageCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201322123123", value = "敏感信息申请能力code值")

  public String getPackageCode() {
    return packageCode;
  }


  public void setPackageCode(String packageCode) {
    this.packageCode = packageCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthApiDTO authApiDTO = (AuthApiDTO) o;
    return Objects.equals(this.apiName, authApiDTO.apiName) &&
        Objects.equals(this.fieldName, authApiDTO.fieldName) &&
        Objects.equals(this.packageCode, authApiDTO.packageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiName, fieldName, packageCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthApiDTO {\n");
    sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    packageCode: ").append(toIndentedString(packageCode)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthApiDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthApiDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthApiDTO is not found in the empty JSON string", AuthApiDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthApiDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthApiDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthApiDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthApiDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthApiDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthApiDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthApiDTO>() {
           @Override
           public void write(JsonWriter out, AuthApiDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthApiDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthApiDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthApiDTO
  * @throws IOException if the JSON string is invalid with respect to AuthApiDTO
  */
  public static AuthApiDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthApiDTO.class);
  }

 /**
  * Convert an instance of AuthApiDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

