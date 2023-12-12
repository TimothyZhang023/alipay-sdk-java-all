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
 * AlipayFundEnterprisepaySignResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundEnterprisepaySignResponseModel {
  public static final String SERIALIZED_NAME_SIGN_TOKEN = "sign_token";
  @SerializedName(SERIALIZED_NAME_SIGN_TOKEN)
  private String signToken;

  public static final String SERIALIZED_NAME_SIGN_URL = "sign_url";
  @SerializedName(SERIALIZED_NAME_SIGN_URL)
  private String signUrl;

  public AlipayFundEnterprisepaySignResponseModel() { 
  }

  public AlipayFundEnterprisepaySignResponseModel signToken(String signToken) {
    
    this.signToken = signToken;
    return this;
  }

   /**
   * 签约凭证
   * @return signToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "signToken", value = "签约凭证")

  public String getSignToken() {
    return signToken;
  }


  public void setSignToken(String signToken) {
    this.signToken = signToken;
  }


  public AlipayFundEnterprisepaySignResponseModel signUrl(String signUrl) {
    
    this.signUrl = signUrl;
    return this;
  }

   /**
   * 签约链接，用于跳转到开户页面
   * @return signUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://business-site-default.dev.alipay.net/page/EnterprisePay/Account?signToken=12324", value = "签约链接，用于跳转到开户页面")

  public String getSignUrl() {
    return signUrl;
  }


  public void setSignUrl(String signUrl) {
    this.signUrl = signUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundEnterprisepaySignResponseModel alipayFundEnterprisepaySignResponseModel = (AlipayFundEnterprisepaySignResponseModel) o;
    return Objects.equals(this.signToken, alipayFundEnterprisepaySignResponseModel.signToken) &&
        Objects.equals(this.signUrl, alipayFundEnterprisepaySignResponseModel.signUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signToken, signUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundEnterprisepaySignResponseModel {\n");
    sb.append("    signToken: ").append(toIndentedString(signToken)).append("\n");
    sb.append("    signUrl: ").append(toIndentedString(signUrl)).append("\n");
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
    openapiFields.add("sign_token");
    openapiFields.add("sign_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundEnterprisepaySignResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundEnterprisepaySignResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundEnterprisepaySignResponseModel is not found in the empty JSON string", AlipayFundEnterprisepaySignResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundEnterprisepaySignResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundEnterprisepaySignResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("sign_token") != null && !jsonObj.get("sign_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_token").toString()));
      }
      if (jsonObj.get("sign_url") != null && !jsonObj.get("sign_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundEnterprisepaySignResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundEnterprisepaySignResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundEnterprisepaySignResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundEnterprisepaySignResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundEnterprisepaySignResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundEnterprisepaySignResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundEnterprisepaySignResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundEnterprisepaySignResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundEnterprisepaySignResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundEnterprisepaySignResponseModel
  */
  public static AlipayFundEnterprisepaySignResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundEnterprisepaySignResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundEnterprisepaySignResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

