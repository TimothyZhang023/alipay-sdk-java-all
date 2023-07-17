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
 * AlipayOpenMiniTipsDeliveryModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniTipsDeliveryModifyModel {
  public static final String SERIALIZED_NAME_DELIVERY_ID = "delivery_id";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ID)
  private String deliveryId;

  public static final String SERIALIZED_NAME_OPERATE_TYPE = "operate_type";
  @SerializedName(SERIALIZED_NAME_OPERATE_TYPE)
  private String operateType;

  public AlipayOpenMiniTipsDeliveryModifyModel() { 
  }

  public AlipayOpenMiniTipsDeliveryModifyModel deliveryId(String deliveryId) {
    
    this.deliveryId = deliveryId;
    return this;
  }

   /**
   * 收藏引导投放活动ID
   * @return deliveryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20211114000003057595", value = "收藏引导投放活动ID")

  public String getDeliveryId() {
    return deliveryId;
  }


  public void setDeliveryId(String deliveryId) {
    this.deliveryId = deliveryId;
  }


  public AlipayOpenMiniTipsDeliveryModifyModel operateType(String operateType) {
    
    this.operateType = operateType;
    return this;
  }

   /**
   * 活动投放操作类型
   * @return operateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RESUME", value = "活动投放操作类型")

  public String getOperateType() {
    return operateType;
  }


  public void setOperateType(String operateType) {
    this.operateType = operateType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniTipsDeliveryModifyModel alipayOpenMiniTipsDeliveryModifyModel = (AlipayOpenMiniTipsDeliveryModifyModel) o;
    return Objects.equals(this.deliveryId, alipayOpenMiniTipsDeliveryModifyModel.deliveryId) &&
        Objects.equals(this.operateType, alipayOpenMiniTipsDeliveryModifyModel.operateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryId, operateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniTipsDeliveryModifyModel {\n");
    sb.append("    deliveryId: ").append(toIndentedString(deliveryId)).append("\n");
    sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
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
    openapiFields.add("delivery_id");
    openapiFields.add("operate_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniTipsDeliveryModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniTipsDeliveryModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniTipsDeliveryModifyModel is not found in the empty JSON string", AlipayOpenMiniTipsDeliveryModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniTipsDeliveryModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniTipsDeliveryModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("delivery_id") != null && !jsonObj.get("delivery_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_id").toString()));
      }
      if (jsonObj.get("operate_type") != null && !jsonObj.get("operate_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operate_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operate_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniTipsDeliveryModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniTipsDeliveryModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniTipsDeliveryModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniTipsDeliveryModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniTipsDeliveryModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniTipsDeliveryModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniTipsDeliveryModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniTipsDeliveryModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniTipsDeliveryModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniTipsDeliveryModifyModel
  */
  public static AlipayOpenMiniTipsDeliveryModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniTipsDeliveryModifyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniTipsDeliveryModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

