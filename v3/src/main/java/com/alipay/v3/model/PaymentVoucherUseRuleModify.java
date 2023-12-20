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
import com.alipay.v3.model.PaymentVoucherAvailableGoodsModify;
import com.alipay.v3.model.PaymentVoucherAvailableMerchantModify;
import com.alipay.v3.model.PaymentVoucherValidPeriodModify;
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
 * PaymentVoucherUseRuleModify
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentVoucherUseRuleModify {
  public static final String SERIALIZED_NAME_AVAILABLE_APP_IDS = "available_app_ids";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_APP_IDS)
  private String availableAppIds;

  public static final String SERIALIZED_NAME_AVAILABLE_GOODS = "available_goods";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_GOODS)
  private PaymentVoucherAvailableGoodsModify availableGoods;

  public static final String SERIALIZED_NAME_AVAILABLE_MERCHANT = "available_merchant";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_MERCHANT)
  private PaymentVoucherAvailableMerchantModify availableMerchant;

  public static final String SERIALIZED_NAME_AVAILABLE_STORE_IDS = "available_store_ids";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_STORE_IDS)
  private String availableStoreIds;

  public static final String SERIALIZED_NAME_VOUCHER_VALID_PERIOD = "voucher_valid_period";
  @SerializedName(SERIALIZED_NAME_VOUCHER_VALID_PERIOD)
  private PaymentVoucherValidPeriodModify voucherValidPeriod;

  public PaymentVoucherUseRuleModify() { 
  }

  public PaymentVoucherUseRuleModify availableAppIds(String availableAppIds) {
    
    this.availableAppIds = availableAppIds;
    return this;
  }

   /**
   * 可核销的支付宝小程序id   限制：  1、必须是支付宝小程序  2、如果包含重复的小程序id会自动进行去重操作。 3、可核销小程序范围只能扩大不能缩小
   * @return availableAppIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2021238412323412\"]", value = "可核销的支付宝小程序id   限制：  1、必须是支付宝小程序  2、如果包含重复的小程序id会自动进行去重操作。 3、可核销小程序范围只能扩大不能缩小")

  public String getAvailableAppIds() {
    return availableAppIds;
  }


  public void setAvailableAppIds(String availableAppIds) {
    this.availableAppIds = availableAppIds;
  }


  public PaymentVoucherUseRuleModify availableGoods(PaymentVoucherAvailableGoodsModify availableGoods) {
    
    this.availableGoods = availableGoods;
    return this;
  }

   /**
   * Get availableGoods
   * @return availableGoods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentVoucherAvailableGoodsModify getAvailableGoods() {
    return availableGoods;
  }


  public void setAvailableGoods(PaymentVoucherAvailableGoodsModify availableGoods) {
    this.availableGoods = availableGoods;
  }


  public PaymentVoucherUseRuleModify availableMerchant(PaymentVoucherAvailableMerchantModify availableMerchant) {
    
    this.availableMerchant = availableMerchant;
    return this;
  }

   /**
   * Get availableMerchant
   * @return availableMerchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentVoucherAvailableMerchantModify getAvailableMerchant() {
    return availableMerchant;
  }


  public void setAvailableMerchant(PaymentVoucherAvailableMerchantModify availableMerchant) {
    this.availableMerchant = availableMerchant;
  }


  public PaymentVoucherUseRuleModify availableStoreIds(String availableStoreIds) {
    
    this.availableStoreIds = availableStoreIds;
    return this;
  }

   /**
   * 可核销支付门店id。   限制：  1、available_store_ids中的门店id必须是支付宝门店id。  2、available_store_ids如果包含重复的门店id会自动进行去重操作。 3、可核销门店范围只能扩大不能缩小
   * @return availableStoreIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2018051000502000000011111111\",\"2018040200502000000011111111\",\"2018062800502000000022271997\"]", value = "可核销支付门店id。   限制：  1、available_store_ids中的门店id必须是支付宝门店id。  2、available_store_ids如果包含重复的门店id会自动进行去重操作。 3、可核销门店范围只能扩大不能缩小")

  public String getAvailableStoreIds() {
    return availableStoreIds;
  }


  public void setAvailableStoreIds(String availableStoreIds) {
    this.availableStoreIds = availableStoreIds;
  }


  public PaymentVoucherUseRuleModify voucherValidPeriod(PaymentVoucherValidPeriodModify voucherValidPeriod) {
    
    this.voucherValidPeriod = voucherValidPeriod;
    return this;
  }

   /**
   * Get voucherValidPeriod
   * @return voucherValidPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentVoucherValidPeriodModify getVoucherValidPeriod() {
    return voucherValidPeriod;
  }


  public void setVoucherValidPeriod(PaymentVoucherValidPeriodModify voucherValidPeriod) {
    this.voucherValidPeriod = voucherValidPeriod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentVoucherUseRuleModify paymentVoucherUseRuleModify = (PaymentVoucherUseRuleModify) o;
    return Objects.equals(this.availableAppIds, paymentVoucherUseRuleModify.availableAppIds) &&
        Objects.equals(this.availableGoods, paymentVoucherUseRuleModify.availableGoods) &&
        Objects.equals(this.availableMerchant, paymentVoucherUseRuleModify.availableMerchant) &&
        Objects.equals(this.availableStoreIds, paymentVoucherUseRuleModify.availableStoreIds) &&
        Objects.equals(this.voucherValidPeriod, paymentVoucherUseRuleModify.voucherValidPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableAppIds, availableGoods, availableMerchant, availableStoreIds, voucherValidPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentVoucherUseRuleModify {\n");
    sb.append("    availableAppIds: ").append(toIndentedString(availableAppIds)).append("\n");
    sb.append("    availableGoods: ").append(toIndentedString(availableGoods)).append("\n");
    sb.append("    availableMerchant: ").append(toIndentedString(availableMerchant)).append("\n");
    sb.append("    availableStoreIds: ").append(toIndentedString(availableStoreIds)).append("\n");
    sb.append("    voucherValidPeriod: ").append(toIndentedString(voucherValidPeriod)).append("\n");
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
    openapiFields.add("available_app_ids");
    openapiFields.add("available_goods");
    openapiFields.add("available_merchant");
    openapiFields.add("available_store_ids");
    openapiFields.add("voucher_valid_period");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentVoucherUseRuleModify
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentVoucherUseRuleModify.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentVoucherUseRuleModify is not found in the empty JSON string", PaymentVoucherUseRuleModify.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentVoucherUseRuleModify.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentVoucherUseRuleModify` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("available_app_ids") != null && !jsonObj.get("available_app_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_app_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_app_ids").toString()));
      }
      // validate the optional field `available_goods`
      if (jsonObj.getAsJsonObject("available_goods") != null) {
        PaymentVoucherAvailableGoodsModify.validateJsonObject(jsonObj.getAsJsonObject("available_goods"));
      }
      // validate the optional field `available_merchant`
      if (jsonObj.getAsJsonObject("available_merchant") != null) {
        PaymentVoucherAvailableMerchantModify.validateJsonObject(jsonObj.getAsJsonObject("available_merchant"));
      }
      if (jsonObj.get("available_store_ids") != null && !jsonObj.get("available_store_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_store_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_store_ids").toString()));
      }
      // validate the optional field `voucher_valid_period`
      if (jsonObj.getAsJsonObject("voucher_valid_period") != null) {
        PaymentVoucherValidPeriodModify.validateJsonObject(jsonObj.getAsJsonObject("voucher_valid_period"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentVoucherUseRuleModify.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentVoucherUseRuleModify' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentVoucherUseRuleModify> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentVoucherUseRuleModify.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentVoucherUseRuleModify>() {
           @Override
           public void write(JsonWriter out, PaymentVoucherUseRuleModify value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentVoucherUseRuleModify read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentVoucherUseRuleModify given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentVoucherUseRuleModify
  * @throws IOException if the JSON string is invalid with respect to PaymentVoucherUseRuleModify
  */
  public static PaymentVoucherUseRuleModify fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentVoucherUseRuleModify.class);
  }

 /**
  * Convert an instance of PaymentVoucherUseRuleModify to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

