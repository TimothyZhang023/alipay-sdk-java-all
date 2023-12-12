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
import com.alipay.v3.model.OrderItem;
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
 * AlipayOpenServicemarketOrderQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenServicemarketOrderQueryResponseModel {
  public static final String SERIALIZED_NAME_AUTO_UPGRADE = "auto_upgrade";
  @SerializedName(SERIALIZED_NAME_AUTO_UPGRADE)
  private Boolean autoUpgrade;

  public static final String SERIALIZED_NAME_COMMODITY_ID = "commodity_id";
  @SerializedName(SERIALIZED_NAME_COMMODITY_ID)
  private String commodityId;

  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Integer currentPage;

  public static final String SERIALIZED_NAME_ORDER_ITEMS = "order_items";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEMS)
  private List<OrderItem> orderItems = null;

  public static final String SERIALIZED_NAME_SPECIFICATIONS = "specifications";
  @SerializedName(SERIALIZED_NAME_SPECIFICATIONS)
  private String specifications;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private Integer totalSize;

  public AlipayOpenServicemarketOrderQueryResponseModel() { 
  }

  public AlipayOpenServicemarketOrderQueryResponseModel autoUpgrade(Boolean autoUpgrade) {
    
    this.autoUpgrade = autoUpgrade;
    return this;
  }

   /**
   * true：开启；false：关闭；需要同步校验commodity_id，如果没有查询到订购信息的话，忽略该字段返回值
   * @return autoUpgrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "true：开启；false：关闭；需要同步校验commodity_id，如果没有查询到订购信息的话，忽略该字段返回值")

  public Boolean getAutoUpgrade() {
    return autoUpgrade;
  }


  public void setAutoUpgrade(Boolean autoUpgrade) {
    this.autoUpgrade = autoUpgrade;
  }


  public AlipayOpenServicemarketOrderQueryResponseModel commodityId(String commodityId) {
    
    this.commodityId = commodityId;
    return this;
  }

   /**
   * 订购服务商品ID
   * @return commodityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201604290086730119", value = "订购服务商品ID")

  public String getCommodityId() {
    return commodityId;
  }


  public void setCommodityId(String commodityId) {
    this.commodityId = commodityId;
  }


  public AlipayOpenServicemarketOrderQueryResponseModel currentPage(Integer currentPage) {
    
    this.currentPage = currentPage;
    return this;
  }

   /**
   * 当前查询页（本接口支持最多查询100条记录）
   * @return currentPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前查询页（本接口支持最多查询100条记录）")

  public Integer getCurrentPage() {
    return currentPage;
  }


  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }


  public AlipayOpenServicemarketOrderQueryResponseModel orderItems(List<OrderItem> orderItems) {
    
    this.orderItems = orderItems;
    return this;
  }

  public AlipayOpenServicemarketOrderQueryResponseModel addOrderItemsItem(OrderItem orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

   /**
   * 订单明细列表
   * @return orderItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "订单明细列表")

  public List<OrderItem> getOrderItems() {
    return orderItems;
  }


  public void setOrderItems(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
  }


  public AlipayOpenServicemarketOrderQueryResponseModel specifications(String specifications) {
    
    this.specifications = specifications;
    return this;
  }

   /**
   * 用于区分同一个服务的不同版本
   * @return specifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "标准版、试用版", value = "用于区分同一个服务的不同版本")

  public String getSpecifications() {
    return specifications;
  }


  public void setSpecifications(String specifications) {
    this.specifications = specifications;
  }


  public AlipayOpenServicemarketOrderQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * MERCHANT_ORDED（待服务商接单）
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MERCHANT_ORDED", value = "MERCHANT_ORDED（待服务商接单）")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayOpenServicemarketOrderQueryResponseModel totalSize(Integer totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * 总记录数
   * @return totalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "总记录数")

  public Integer getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenServicemarketOrderQueryResponseModel alipayOpenServicemarketOrderQueryResponseModel = (AlipayOpenServicemarketOrderQueryResponseModel) o;
    return Objects.equals(this.autoUpgrade, alipayOpenServicemarketOrderQueryResponseModel.autoUpgrade) &&
        Objects.equals(this.commodityId, alipayOpenServicemarketOrderQueryResponseModel.commodityId) &&
        Objects.equals(this.currentPage, alipayOpenServicemarketOrderQueryResponseModel.currentPage) &&
        Objects.equals(this.orderItems, alipayOpenServicemarketOrderQueryResponseModel.orderItems) &&
        Objects.equals(this.specifications, alipayOpenServicemarketOrderQueryResponseModel.specifications) &&
        Objects.equals(this.status, alipayOpenServicemarketOrderQueryResponseModel.status) &&
        Objects.equals(this.totalSize, alipayOpenServicemarketOrderQueryResponseModel.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoUpgrade, commodityId, currentPage, orderItems, specifications, status, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenServicemarketOrderQueryResponseModel {\n");
    sb.append("    autoUpgrade: ").append(toIndentedString(autoUpgrade)).append("\n");
    sb.append("    commodityId: ").append(toIndentedString(commodityId)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    specifications: ").append(toIndentedString(specifications)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
    openapiFields.add("auto_upgrade");
    openapiFields.add("commodity_id");
    openapiFields.add("current_page");
    openapiFields.add("order_items");
    openapiFields.add("specifications");
    openapiFields.add("status");
    openapiFields.add("total_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenServicemarketOrderQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenServicemarketOrderQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenServicemarketOrderQueryResponseModel is not found in the empty JSON string", AlipayOpenServicemarketOrderQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenServicemarketOrderQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenServicemarketOrderQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("commodity_id") != null && !jsonObj.get("commodity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commodity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commodity_id").toString()));
      }
      JsonArray jsonArrayorderItems = jsonObj.getAsJsonArray("order_items");
      if (jsonArrayorderItems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("order_items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `order_items` to be an array in the JSON string but got `%s`", jsonObj.get("order_items").toString()));
        }

        // validate the optional field `order_items` (array)
        for (int i = 0; i < jsonArrayorderItems.size(); i++) {
          OrderItem.validateJsonObject(jsonArrayorderItems.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("specifications") != null && !jsonObj.get("specifications").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specifications` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specifications").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenServicemarketOrderQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenServicemarketOrderQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenServicemarketOrderQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenServicemarketOrderQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenServicemarketOrderQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenServicemarketOrderQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenServicemarketOrderQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenServicemarketOrderQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenServicemarketOrderQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenServicemarketOrderQueryResponseModel
  */
  public static AlipayOpenServicemarketOrderQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenServicemarketOrderQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenServicemarketOrderQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

