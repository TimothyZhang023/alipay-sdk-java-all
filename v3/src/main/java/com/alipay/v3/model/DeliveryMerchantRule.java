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
import com.alipay.v3.model.DeliveryMerchantInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * DeliveryMerchantRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryMerchantRule {
  public static final String SERIALIZED_NAME_BRAND_ID_LIST = "brand_id_list";
  @SerializedName(SERIALIZED_NAME_BRAND_ID_LIST)
  private List<String> brandIdList = null;

  public static final String SERIALIZED_NAME_DELIVERY_MERCHANT_INFOS = "delivery_merchant_infos";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MERCHANT_INFOS)
  private List<DeliveryMerchantInfo> deliveryMerchantInfos = null;

  public static final String SERIALIZED_NAME_DELIVERY_MERCHANT_MODE = "delivery_merchant_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MERCHANT_MODE)
  private String deliveryMerchantMode;

  public DeliveryMerchantRule() { 
  }

  public DeliveryMerchantRule brandIdList(List<String> brandIdList) {
    
    this.brandIdList = brandIdList;
    return this;
  }

  public DeliveryMerchantRule addBrandIdListItem(String brandIdListItem) {
    if (this.brandIdList == null) {
      this.brandIdList = new ArrayList<>();
    }
    this.brandIdList.add(brandIdListItem);
    return this;
  }

   /**
   * 指定品牌id。 说明：如商户需选择某个品牌下维护的收款账号，请上传相关品牌id
   * @return brandIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定品牌id。 说明：如商户需选择某个品牌下维护的收款账号，请上传相关品牌id")

  public List<String> getBrandIdList() {
    return brandIdList;
  }


  public void setBrandIdList(List<String> brandIdList) {
    this.brandIdList = brandIdList;
  }


  public DeliveryMerchantRule deliveryMerchantInfos(List<DeliveryMerchantInfo> deliveryMerchantInfos) {
    
    this.deliveryMerchantInfos = deliveryMerchantInfos;
    return this;
  }

  public DeliveryMerchantRule addDeliveryMerchantInfosItem(DeliveryMerchantInfo deliveryMerchantInfosItem) {
    if (this.deliveryMerchantInfos == null) {
      this.deliveryMerchantInfos = new ArrayList<>();
    }
    this.deliveryMerchantInfos.add(deliveryMerchantInfosItem);
    return this;
  }

   /**
   * 曝光商户选取列表。 说明：需要传入您期望曝光的商户的商户号，传入为空时默认使用投放优惠券活动的适用范围。 限制：曝光商户号需与投放归属商户号相同，或传入有跨主体授权关系的商户号或有弱绑定关系的M3账号
   * @return deliveryMerchantInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "曝光商户选取列表。 说明：需要传入您期望曝光的商户的商户号，传入为空时默认使用投放优惠券活动的适用范围。 限制：曝光商户号需与投放归属商户号相同，或传入有跨主体授权关系的商户号或有弱绑定关系的M3账号")

  public List<DeliveryMerchantInfo> getDeliveryMerchantInfos() {
    return deliveryMerchantInfos;
  }


  public void setDeliveryMerchantInfos(List<DeliveryMerchantInfo> deliveryMerchantInfos) {
    this.deliveryMerchantInfos = deliveryMerchantInfos;
  }


  public DeliveryMerchantRule deliveryMerchantMode(String deliveryMerchantMode) {
    
    this.deliveryMerchantMode = deliveryMerchantMode;
    return this;
  }

   /**
   * 指定支付成功页模式。
   * @return deliveryMerchantMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定支付成功页模式。")

  public String getDeliveryMerchantMode() {
    return deliveryMerchantMode;
  }


  public void setDeliveryMerchantMode(String deliveryMerchantMode) {
    this.deliveryMerchantMode = deliveryMerchantMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryMerchantRule deliveryMerchantRule = (DeliveryMerchantRule) o;
    return Objects.equals(this.brandIdList, deliveryMerchantRule.brandIdList) &&
        Objects.equals(this.deliveryMerchantInfos, deliveryMerchantRule.deliveryMerchantInfos) &&
        Objects.equals(this.deliveryMerchantMode, deliveryMerchantRule.deliveryMerchantMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandIdList, deliveryMerchantInfos, deliveryMerchantMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryMerchantRule {\n");
    sb.append("    brandIdList: ").append(toIndentedString(brandIdList)).append("\n");
    sb.append("    deliveryMerchantInfos: ").append(toIndentedString(deliveryMerchantInfos)).append("\n");
    sb.append("    deliveryMerchantMode: ").append(toIndentedString(deliveryMerchantMode)).append("\n");
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
    openapiFields.add("brand_id_list");
    openapiFields.add("delivery_merchant_infos");
    openapiFields.add("delivery_merchant_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryMerchantRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliveryMerchantRule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryMerchantRule is not found in the empty JSON string", DeliveryMerchantRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeliveryMerchantRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliveryMerchantRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("brand_id_list") != null && !jsonObj.get("brand_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("brand_id_list").toString()));
      }
      JsonArray jsonArraydeliveryMerchantInfos = jsonObj.getAsJsonArray("delivery_merchant_infos");
      if (jsonArraydeliveryMerchantInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("delivery_merchant_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `delivery_merchant_infos` to be an array in the JSON string but got `%s`", jsonObj.get("delivery_merchant_infos").toString()));
        }

        // validate the optional field `delivery_merchant_infos` (array)
        for (int i = 0; i < jsonArraydeliveryMerchantInfos.size(); i++) {
          DeliveryMerchantInfo.validateJsonObject(jsonArraydeliveryMerchantInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("delivery_merchant_mode") != null && !jsonObj.get("delivery_merchant_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_merchant_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_merchant_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryMerchantRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryMerchantRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryMerchantRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryMerchantRule.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryMerchantRule>() {
           @Override
           public void write(JsonWriter out, DeliveryMerchantRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryMerchantRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryMerchantRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryMerchantRule
  * @throws IOException if the JSON string is invalid with respect to DeliveryMerchantRule
  */
  public static DeliveryMerchantRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryMerchantRule.class);
  }

 /**
  * Convert an instance of DeliveryMerchantRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

