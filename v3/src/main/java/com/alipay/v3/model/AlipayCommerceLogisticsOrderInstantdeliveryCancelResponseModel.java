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
 * AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel {
  public static final String SERIALIZED_NAME_CANCEL_FEE = "cancel_fee";
  @SerializedName(SERIALIZED_NAME_CANCEL_FEE)
  private String cancelFee;

  public AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel() { 
  }

  public AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel cancelFee(String cancelFee) {
    
    this.cancelFee = cancelFee;
    return this;
  }

   /**
   * 取消金额
   * @return cancelFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "取消金额")

  public String getCancelFee() {
    return cancelFee;
  }


  public void setCancelFee(String cancelFee) {
    this.cancelFee = cancelFee;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel alipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel = (AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel) o;
    return Objects.equals(this.cancelFee, alipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel.cancelFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel {\n");
    sb.append("    cancelFee: ").append(toIndentedString(cancelFee)).append("\n");
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
    openapiFields.add("cancel_fee");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel is not found in the empty JSON string", AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cancel_fee") != null && !jsonObj.get("cancel_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancel_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancel_fee").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel
  */
  public static AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceLogisticsOrderInstantdeliveryCancelResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

