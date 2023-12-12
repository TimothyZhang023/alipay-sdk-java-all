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
 * AntMerchantExpandApprecommendAccountCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandApprecommendAccountCreateModel {
  public static final String SERIALIZED_NAME_ACC_NO = "acc_no";
  @SerializedName(SERIALIZED_NAME_ACC_NO)
  private String accNo;

  public static final String SERIALIZED_NAME_APP_NO = "app_no";
  @SerializedName(SERIALIZED_NAME_APP_NO)
  private String appNo;

  public AntMerchantExpandApprecommendAccountCreateModel() { 
  }

  public AntMerchantExpandApprecommendAccountCreateModel accNo(String accNo) {
    
    this.accNo = accNo;
    return this;
  }

   /**
   * 待绑定账号PID
   * @return accNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088001969784501", value = "待绑定账号PID")

  public String getAccNo() {
    return accNo;
  }


  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }


  public AntMerchantExpandApprecommendAccountCreateModel appNo(String appNo) {
    
    this.appNo = appNo;
    return this;
  }

   /**
   * 待绑定小程序的app_id
   * @return appNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021000155639069", value = "待绑定小程序的app_id")

  public String getAppNo() {
    return appNo;
  }


  public void setAppNo(String appNo) {
    this.appNo = appNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntMerchantExpandApprecommendAccountCreateModel antMerchantExpandApprecommendAccountCreateModel = (AntMerchantExpandApprecommendAccountCreateModel) o;
    return Objects.equals(this.accNo, antMerchantExpandApprecommendAccountCreateModel.accNo) &&
        Objects.equals(this.appNo, antMerchantExpandApprecommendAccountCreateModel.appNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accNo, appNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandApprecommendAccountCreateModel {\n");
    sb.append("    accNo: ").append(toIndentedString(accNo)).append("\n");
    sb.append("    appNo: ").append(toIndentedString(appNo)).append("\n");
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
    openapiFields.add("acc_no");
    openapiFields.add("app_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandApprecommendAccountCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandApprecommendAccountCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandApprecommendAccountCreateModel is not found in the empty JSON string", AntMerchantExpandApprecommendAccountCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AntMerchantExpandApprecommendAccountCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AntMerchantExpandApprecommendAccountCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("acc_no") != null && !jsonObj.get("acc_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acc_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acc_no").toString()));
      }
      if (jsonObj.get("app_no") != null && !jsonObj.get("app_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AntMerchantExpandApprecommendAccountCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandApprecommendAccountCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandApprecommendAccountCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandApprecommendAccountCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandApprecommendAccountCreateModel>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandApprecommendAccountCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AntMerchantExpandApprecommendAccountCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AntMerchantExpandApprecommendAccountCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandApprecommendAccountCreateModel
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandApprecommendAccountCreateModel
  */
  public static AntMerchantExpandApprecommendAccountCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandApprecommendAccountCreateModel.class);
  }

 /**
  * Convert an instance of AntMerchantExpandApprecommendAccountCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

