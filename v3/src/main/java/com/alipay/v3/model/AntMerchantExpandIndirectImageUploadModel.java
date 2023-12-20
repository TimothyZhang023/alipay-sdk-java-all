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
 * AntMerchantExpandIndirectImageUploadModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandIndirectImageUploadModel {
  public static final String SERIALIZED_NAME_IMAGE_TYPE = "image_type";
  @SerializedName(SERIALIZED_NAME_IMAGE_TYPE)
  private String imageType;

  public AntMerchantExpandIndirectImageUploadModel() { 
  }

  public AntMerchantExpandIndirectImageUploadModel imageType(String imageType) {
    
    this.imageType = imageType;
    return this;
  }

   /**
   * 图片格式，支持格式：bmp、jpg、jpeg、png、gif.
   * @return imageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jpg", value = "图片格式，支持格式：bmp、jpg、jpeg、png、gif.")

  public String getImageType() {
    return imageType;
  }


  public void setImageType(String imageType) {
    this.imageType = imageType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntMerchantExpandIndirectImageUploadModel antMerchantExpandIndirectImageUploadModel = (AntMerchantExpandIndirectImageUploadModel) o;
    return Objects.equals(this.imageType, antMerchantExpandIndirectImageUploadModel.imageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandIndirectImageUploadModel {\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
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
    openapiFields.add("image_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandIndirectImageUploadModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandIndirectImageUploadModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandIndirectImageUploadModel is not found in the empty JSON string", AntMerchantExpandIndirectImageUploadModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AntMerchantExpandIndirectImageUploadModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AntMerchantExpandIndirectImageUploadModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("image_type") != null && !jsonObj.get("image_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AntMerchantExpandIndirectImageUploadModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandIndirectImageUploadModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandIndirectImageUploadModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandIndirectImageUploadModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandIndirectImageUploadModel>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandIndirectImageUploadModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AntMerchantExpandIndirectImageUploadModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AntMerchantExpandIndirectImageUploadModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandIndirectImageUploadModel
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandIndirectImageUploadModel
  */
  public static AntMerchantExpandIndirectImageUploadModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandIndirectImageUploadModel.class);
  }

 /**
  * Convert an instance of AntMerchantExpandIndirectImageUploadModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

