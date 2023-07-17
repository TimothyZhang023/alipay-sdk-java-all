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
import com.alipay.v3.model.TransferDetailResult;
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
 * AlipayDataBillTransferQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayDataBillTransferQueryResponseModel {
  public static final String SERIALIZED_NAME_DETAIL_LIST = "detail_list";
  @SerializedName(SERIALIZED_NAME_DETAIL_LIST)
  private List<TransferDetailResult> detailList = null;

  public static final String SERIALIZED_NAME_PAGE_NO = "page_no";
  @SerializedName(SERIALIZED_NAME_PAGE_NO)
  private String pageNo;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private String totalSize;

  public AlipayDataBillTransferQueryResponseModel() { 
  }

  public AlipayDataBillTransferQueryResponseModel detailList(List<TransferDetailResult> detailList) {
    
    this.detailList = detailList;
    return this;
  }

  public AlipayDataBillTransferQueryResponseModel addDetailListItem(TransferDetailResult detailListItem) {
    if (this.detailList == null) {
      this.detailList = new ArrayList<>();
    }
    this.detailList.add(detailListItem);
    return this;
  }

   /**
   * 充值、提现、转账明细记录
   * @return detailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "充值、提现、转账明细记录")

  public List<TransferDetailResult> getDetailList() {
    return detailList;
  }


  public void setDetailList(List<TransferDetailResult> detailList) {
    this.detailList = detailList;
  }


  public AlipayDataBillTransferQueryResponseModel pageNo(String pageNo) {
    
    this.pageNo = pageNo;
    return this;
  }

   /**
   * 分页号，从1开始
   * @return pageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "分页号，从1开始")

  public String getPageNo() {
    return pageNo;
  }


  public void setPageNo(String pageNo) {
    this.pageNo = pageNo;
  }


  public AlipayDataBillTransferQueryResponseModel pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页大小1000-2000
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000", value = "分页大小1000-2000")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayDataBillTransferQueryResponseModel totalSize(String totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * 充值、提现、转账明细总数。返回满足查询条件的明细的数量
   * @return totalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "充值、提现、转账明细总数。返回满足查询条件的明细的数量")

  public String getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(String totalSize) {
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
    AlipayDataBillTransferQueryResponseModel alipayDataBillTransferQueryResponseModel = (AlipayDataBillTransferQueryResponseModel) o;
    return Objects.equals(this.detailList, alipayDataBillTransferQueryResponseModel.detailList) &&
        Objects.equals(this.pageNo, alipayDataBillTransferQueryResponseModel.pageNo) &&
        Objects.equals(this.pageSize, alipayDataBillTransferQueryResponseModel.pageSize) &&
        Objects.equals(this.totalSize, alipayDataBillTransferQueryResponseModel.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailList, pageNo, pageSize, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayDataBillTransferQueryResponseModel {\n");
    sb.append("    detailList: ").append(toIndentedString(detailList)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("detail_list");
    openapiFields.add("page_no");
    openapiFields.add("page_size");
    openapiFields.add("total_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayDataBillTransferQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayDataBillTransferQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayDataBillTransferQueryResponseModel is not found in the empty JSON string", AlipayDataBillTransferQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayDataBillTransferQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayDataBillTransferQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraydetailList = jsonObj.getAsJsonArray("detail_list");
      if (jsonArraydetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("detail_list").toString()));
        }

        // validate the optional field `detail_list` (array)
        for (int i = 0; i < jsonArraydetailList.size(); i++) {
          TransferDetailResult.validateJsonObject(jsonArraydetailList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("page_no") != null && !jsonObj.get("page_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_no").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
      if (jsonObj.get("total_size") != null && !jsonObj.get("total_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayDataBillTransferQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayDataBillTransferQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayDataBillTransferQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayDataBillTransferQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayDataBillTransferQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayDataBillTransferQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayDataBillTransferQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayDataBillTransferQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayDataBillTransferQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayDataBillTransferQueryResponseModel
  */
  public static AlipayDataBillTransferQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayDataBillTransferQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayDataBillTransferQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

