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
import com.alipay.v3.model.ActivityShopInfo;
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
 * AlipayMarketingActivityShopBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityShopBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_SHOP_INFOS = "shop_infos";
  @SerializedName(SERIALIZED_NAME_SHOP_INFOS)
  private List<ActivityShopInfo> shopInfos = null;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private Integer totalSize;

  public AlipayMarketingActivityShopBatchqueryResponseModel() { 
  }

  public AlipayMarketingActivityShopBatchqueryResponseModel activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 活动id
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016042700826004508401111111", value = "活动id")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public AlipayMarketingActivityShopBatchqueryResponseModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 分页查询页码。
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "分页查询页码。")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayMarketingActivityShopBatchqueryResponseModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页查询单页数据条数。
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "分页查询单页数据条数。")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayMarketingActivityShopBatchqueryResponseModel shopInfos(List<ActivityShopInfo> shopInfos) {
    
    this.shopInfos = shopInfos;
    return this;
  }

  public AlipayMarketingActivityShopBatchqueryResponseModel addShopInfosItem(ActivityShopInfo shopInfosItem) {
    if (this.shopInfos == null) {
      this.shopInfos = new ArrayList<>();
    }
    this.shopInfos.add(shopInfosItem);
    return this;
  }

   /**
   * 可用门店列表
   * @return shopInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "可用门店列表")

  public List<ActivityShopInfo> getShopInfos() {
    return shopInfos;
  }


  public void setShopInfos(List<ActivityShopInfo> shopInfos) {
    this.shopInfos = shopInfos;
  }


  public AlipayMarketingActivityShopBatchqueryResponseModel totalSize(Integer totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * 可用门店总数量
   * @return totalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "可用门店总数量")

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
    AlipayMarketingActivityShopBatchqueryResponseModel alipayMarketingActivityShopBatchqueryResponseModel = (AlipayMarketingActivityShopBatchqueryResponseModel) o;
    return Objects.equals(this.activityId, alipayMarketingActivityShopBatchqueryResponseModel.activityId) &&
        Objects.equals(this.pageNum, alipayMarketingActivityShopBatchqueryResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayMarketingActivityShopBatchqueryResponseModel.pageSize) &&
        Objects.equals(this.shopInfos, alipayMarketingActivityShopBatchqueryResponseModel.shopInfos) &&
        Objects.equals(this.totalSize, alipayMarketingActivityShopBatchqueryResponseModel.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, pageNum, pageSize, shopInfos, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityShopBatchqueryResponseModel {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    shopInfos: ").append(toIndentedString(shopInfos)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("shop_infos");
    openapiFields.add("total_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityShopBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityShopBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityShopBatchqueryResponseModel is not found in the empty JSON string", AlipayMarketingActivityShopBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityShopBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityShopBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("activity_id") != null && !jsonObj.get("activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_id").toString()));
      }
      JsonArray jsonArrayshopInfos = jsonObj.getAsJsonArray("shop_infos");
      if (jsonArrayshopInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("shop_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `shop_infos` to be an array in the JSON string but got `%s`", jsonObj.get("shop_infos").toString()));
        }

        // validate the optional field `shop_infos` (array)
        for (int i = 0; i < jsonArrayshopInfos.size(); i++) {
          ActivityShopInfo.validateJsonObject(jsonArrayshopInfos.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityShopBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityShopBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityShopBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityShopBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityShopBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityShopBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityShopBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityShopBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityShopBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityShopBatchqueryResponseModel
  */
  public static AlipayMarketingActivityShopBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityShopBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityShopBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

