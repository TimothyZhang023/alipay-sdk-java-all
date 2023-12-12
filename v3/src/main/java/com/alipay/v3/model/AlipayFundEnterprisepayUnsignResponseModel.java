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
 * AlipayFundEnterprisepayUnsignResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundEnterprisepayUnsignResponseModel {
  public static final String SERIALIZED_NAME_UNSIGN_TOKEN = "unsign_token";
  @SerializedName(SERIALIZED_NAME_UNSIGN_TOKEN)
  private String unsignToken;

  public static final String SERIALIZED_NAME_UNSIGN_URL = "unsign_url";
  @SerializedName(SERIALIZED_NAME_UNSIGN_URL)
  private String unsignUrl;

  public AlipayFundEnterprisepayUnsignResponseModel() { 
  }

  public AlipayFundEnterprisepayUnsignResponseModel unsignToken(String unsignToken) {
    
    this.unsignToken = unsignToken;
    return this;
  }

   /**
   * 解约凭证
   * @return unsignToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "700e15fc014d463eb84600676f1976b4", value = "解约凭证")

  public String getUnsignToken() {
    return unsignToken;
  }


  public void setUnsignToken(String unsignToken) {
    this.unsignToken = unsignToken;
  }


  public AlipayFundEnterprisepayUnsignResponseModel unsignUrl(String unsignUrl) {
    
    this.unsignUrl = unsignUrl;
    return this;
  }

   /**
   * 解约链接
   * @return unsignUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://business-site-default.dev.alipay.net/page/EnterprisePay/Account?unsignToken=12324", value = "解约链接")

  public String getUnsignUrl() {
    return unsignUrl;
  }


  public void setUnsignUrl(String unsignUrl) {
    this.unsignUrl = unsignUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundEnterprisepayUnsignResponseModel alipayFundEnterprisepayUnsignResponseModel = (AlipayFundEnterprisepayUnsignResponseModel) o;
    return Objects.equals(this.unsignToken, alipayFundEnterprisepayUnsignResponseModel.unsignToken) &&
        Objects.equals(this.unsignUrl, alipayFundEnterprisepayUnsignResponseModel.unsignUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unsignToken, unsignUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundEnterprisepayUnsignResponseModel {\n");
    sb.append("    unsignToken: ").append(toIndentedString(unsignToken)).append("\n");
    sb.append("    unsignUrl: ").append(toIndentedString(unsignUrl)).append("\n");
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
    openapiFields.add("unsign_token");
    openapiFields.add("unsign_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundEnterprisepayUnsignResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundEnterprisepayUnsignResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundEnterprisepayUnsignResponseModel is not found in the empty JSON string", AlipayFundEnterprisepayUnsignResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundEnterprisepayUnsignResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundEnterprisepayUnsignResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("unsign_token") != null && !jsonObj.get("unsign_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unsign_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unsign_token").toString()));
      }
      if (jsonObj.get("unsign_url") != null && !jsonObj.get("unsign_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unsign_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unsign_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundEnterprisepayUnsignResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundEnterprisepayUnsignResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundEnterprisepayUnsignResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundEnterprisepayUnsignResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundEnterprisepayUnsignResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundEnterprisepayUnsignResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundEnterprisepayUnsignResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundEnterprisepayUnsignResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundEnterprisepayUnsignResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundEnterprisepayUnsignResponseModel
  */
  public static AlipayFundEnterprisepayUnsignResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundEnterprisepayUnsignResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundEnterprisepayUnsignResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

