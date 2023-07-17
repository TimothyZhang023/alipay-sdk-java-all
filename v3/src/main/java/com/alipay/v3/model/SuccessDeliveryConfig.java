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
import com.alipay.v3.model.DeliveryConfig;
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
 * SuccessDeliveryConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SuccessDeliveryConfig {
  public static final String SERIALIZED_NAME_DELIVERY_CONFIG = "delivery_config";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CONFIG)
  private DeliveryConfig deliveryConfig;

  public SuccessDeliveryConfig() { 
  }

  public SuccessDeliveryConfig deliveryConfig(DeliveryConfig deliveryConfig) {
    
    this.deliveryConfig = deliveryConfig;
    return this;
  }

   /**
   * Get deliveryConfig
   * @return deliveryConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryConfig getDeliveryConfig() {
    return deliveryConfig;
  }


  public void setDeliveryConfig(DeliveryConfig deliveryConfig) {
    this.deliveryConfig = deliveryConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessDeliveryConfig successDeliveryConfig = (SuccessDeliveryConfig) o;
    return Objects.equals(this.deliveryConfig, successDeliveryConfig.deliveryConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessDeliveryConfig {\n");
    sb.append("    deliveryConfig: ").append(toIndentedString(deliveryConfig)).append("\n");
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
    openapiFields.add("delivery_config");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuccessDeliveryConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SuccessDeliveryConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuccessDeliveryConfig is not found in the empty JSON string", SuccessDeliveryConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SuccessDeliveryConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuccessDeliveryConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `delivery_config`
      if (jsonObj.getAsJsonObject("delivery_config") != null) {
        DeliveryConfig.validateJsonObject(jsonObj.getAsJsonObject("delivery_config"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuccessDeliveryConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuccessDeliveryConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuccessDeliveryConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuccessDeliveryConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<SuccessDeliveryConfig>() {
           @Override
           public void write(JsonWriter out, SuccessDeliveryConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuccessDeliveryConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuccessDeliveryConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuccessDeliveryConfig
  * @throws IOException if the JSON string is invalid with respect to SuccessDeliveryConfig
  */
  public static SuccessDeliveryConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuccessDeliveryConfig.class);
  }

 /**
  * Convert an instance of SuccessDeliveryConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

