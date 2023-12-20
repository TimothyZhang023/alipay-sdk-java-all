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
 * OrderVoucherMerchantAllShop
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderVoucherMerchantAllShop {
  public static final String SERIALIZED_NAME_EXCLUDE_SHOP_IDS = "exclude_shop_ids";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_SHOP_IDS)
  private List<String> excludeShopIds = null;

  public OrderVoucherMerchantAllShop() { 
  }

  public OrderVoucherMerchantAllShop excludeShopIds(List<String> excludeShopIds) {
    
    this.excludeShopIds = excludeShopIds;
    return this;
  }

  public OrderVoucherMerchantAllShop addExcludeShopIdsItem(String excludeShopIdsItem) {
    if (this.excludeShopIds == null) {
      this.excludeShopIds = new ArrayList<>();
    }
    this.excludeShopIds.add(excludeShopIdsItem);
    return this;
  }

   /**
   * 券不可使用的门店列表。指定商户全部门店可用时可通过该字段排除部分不可用门店。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id  接口参数是列表类型。
   * @return excludeShopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券不可使用的门店列表。指定商户全部门店可用时可通过该字段排除部分不可用门店。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id  接口参数是列表类型。")

  public List<String> getExcludeShopIds() {
    return excludeShopIds;
  }


  public void setExcludeShopIds(List<String> excludeShopIds) {
    this.excludeShopIds = excludeShopIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderVoucherMerchantAllShop orderVoucherMerchantAllShop = (OrderVoucherMerchantAllShop) o;
    return Objects.equals(this.excludeShopIds, orderVoucherMerchantAllShop.excludeShopIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeShopIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderVoucherMerchantAllShop {\n");
    sb.append("    excludeShopIds: ").append(toIndentedString(excludeShopIds)).append("\n");
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
    openapiFields.add("exclude_shop_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderVoucherMerchantAllShop
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderVoucherMerchantAllShop.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderVoucherMerchantAllShop is not found in the empty JSON string", OrderVoucherMerchantAllShop.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderVoucherMerchantAllShop.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderVoucherMerchantAllShop` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("exclude_shop_ids") != null && !jsonObj.get("exclude_shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `exclude_shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("exclude_shop_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderVoucherMerchantAllShop.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderVoucherMerchantAllShop' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderVoucherMerchantAllShop> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderVoucherMerchantAllShop.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderVoucherMerchantAllShop>() {
           @Override
           public void write(JsonWriter out, OrderVoucherMerchantAllShop value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderVoucherMerchantAllShop read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderVoucherMerchantAllShop given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderVoucherMerchantAllShop
  * @throws IOException if the JSON string is invalid with respect to OrderVoucherMerchantAllShop
  */
  public static OrderVoucherMerchantAllShop fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderVoucherMerchantAllShop.class);
  }

 /**
  * Convert an instance of OrderVoucherMerchantAllShop to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

