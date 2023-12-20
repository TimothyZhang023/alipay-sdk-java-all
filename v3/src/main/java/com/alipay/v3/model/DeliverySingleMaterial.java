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
 * DeliverySingleMaterial
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliverySingleMaterial {
  public static final String SERIALIZED_NAME_DELIVERY_IMAGE = "delivery_image";
  @SerializedName(SERIALIZED_NAME_DELIVERY_IMAGE)
  private String deliveryImage;

  public DeliverySingleMaterial() { 
  }

  public DeliverySingleMaterial deliveryImage(String deliveryImage) {
    
    this.deliveryImage = deliveryImage;
    return this;
  }

   /**
   * 投放计划图片素材。通过接口alipay.marketing.material.image.upload上传图片返回的resource_id。
   * @return deliveryImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "投放计划图片素材。通过接口alipay.marketing.material.image.upload上传图片返回的resource_id。")

  public String getDeliveryImage() {
    return deliveryImage;
  }


  public void setDeliveryImage(String deliveryImage) {
    this.deliveryImage = deliveryImage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliverySingleMaterial deliverySingleMaterial = (DeliverySingleMaterial) o;
    return Objects.equals(this.deliveryImage, deliverySingleMaterial.deliveryImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliverySingleMaterial {\n");
    sb.append("    deliveryImage: ").append(toIndentedString(deliveryImage)).append("\n");
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
    openapiFields.add("delivery_image");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliverySingleMaterial
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliverySingleMaterial.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliverySingleMaterial is not found in the empty JSON string", DeliverySingleMaterial.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeliverySingleMaterial.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliverySingleMaterial` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("delivery_image") != null && !jsonObj.get("delivery_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_image").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliverySingleMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliverySingleMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliverySingleMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliverySingleMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliverySingleMaterial>() {
           @Override
           public void write(JsonWriter out, DeliverySingleMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliverySingleMaterial read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliverySingleMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliverySingleMaterial
  * @throws IOException if the JSON string is invalid with respect to DeliverySingleMaterial
  */
  public static DeliverySingleMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliverySingleMaterial.class);
  }

 /**
  * Convert an instance of DeliverySingleMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

