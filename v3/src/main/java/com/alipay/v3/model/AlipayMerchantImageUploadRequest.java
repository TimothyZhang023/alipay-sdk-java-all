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
import com.alipay.v3.model.AlipayMerchantImageUploadModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
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
 * AlipayMerchantImageUploadRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantImageUploadRequest {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AlipayMerchantImageUploadModel data;

  public static final String SERIALIZED_NAME_IMAGE_CONTENT = "image_content";
  @SerializedName(SERIALIZED_NAME_IMAGE_CONTENT)
  private File imageContent;

  public AlipayMerchantImageUploadRequest() { 
  }

  public AlipayMerchantImageUploadRequest data(AlipayMerchantImageUploadModel data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlipayMerchantImageUploadModel getData() {
    return data;
  }


  public void setData(AlipayMerchantImageUploadModel data) {
    this.data = data;
  }


  public AlipayMerchantImageUploadRequest imageContent(File imageContent) {
    
    this.imageContent = imageContent;
    return this;
  }

   /**
   * Get imageContent
   * @return imageContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getImageContent() {
    return imageContent;
  }


  public void setImageContent(File imageContent) {
    this.imageContent = imageContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMerchantImageUploadRequest alipayMerchantImageUploadRequest = (AlipayMerchantImageUploadRequest) o;
    return Objects.equals(this.data, alipayMerchantImageUploadRequest.data) &&
        Objects.equals(this.imageContent, alipayMerchantImageUploadRequest.imageContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, imageContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantImageUploadRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    imageContent: ").append(toIndentedString(imageContent)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("image_content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantImageUploadRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantImageUploadRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantImageUploadRequest is not found in the empty JSON string", AlipayMerchantImageUploadRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMerchantImageUploadRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMerchantImageUploadRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        AlipayMerchantImageUploadModel.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantImageUploadRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantImageUploadRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantImageUploadRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantImageUploadRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantImageUploadRequest>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantImageUploadRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMerchantImageUploadRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMerchantImageUploadRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantImageUploadRequest
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantImageUploadRequest
  */
  public static AlipayMerchantImageUploadRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantImageUploadRequest.class);
  }

 /**
  * Convert an instance of AlipayMerchantImageUploadRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

