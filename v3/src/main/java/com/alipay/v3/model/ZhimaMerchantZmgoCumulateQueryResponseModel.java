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
import com.alipay.v3.model.CumulateDataDetail;
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
 * ZhimaMerchantZmgoCumulateQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaMerchantZmgoCumulateQueryResponseModel {
  public static final String SERIALIZED_NAME_AGGR_AMOUNT = "aggr_amount";
  @SerializedName(SERIALIZED_NAME_AGGR_AMOUNT)
  private String aggrAmount;

  public static final String SERIALIZED_NAME_AGGR_DISCOUNT_AMOUNT = "aggr_discount_amount";
  @SerializedName(SERIALIZED_NAME_AGGR_DISCOUNT_AMOUNT)
  private String aggrDiscountAmount;

  public static final String SERIALIZED_NAME_AGGR_TIMES = "aggr_times";
  @SerializedName(SERIALIZED_NAME_AGGR_TIMES)
  private Integer aggrTimes;

  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_DETAIL_LIST = "detail_list";
  @SerializedName(SERIALIZED_NAME_DETAIL_LIST)
  private List<CumulateDataDetail> detailList = null;

  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason;

  public static final String SERIALIZED_NAME_PAGE_NO = "page_no";
  @SerializedName(SERIALIZED_NAME_PAGE_NO)
  private Integer pageNo;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public ZhimaMerchantZmgoCumulateQueryResponseModel() { 
  }

  public ZhimaMerchantZmgoCumulateQueryResponseModel aggrAmount(String aggrAmount) {
    
    this.aggrAmount = aggrAmount;
    return this;
  }

   /**
   * 总共累计金额
   * @return aggrAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99.99", value = "总共累计金额")

  public String getAggrAmount() {
    return aggrAmount;
  }


  public void setAggrAmount(String aggrAmount) {
    this.aggrAmount = aggrAmount;
  }


  public ZhimaMerchantZmgoCumulateQueryResponseModel aggrDiscountAmount(String aggrDiscountAmount) {
    
    this.aggrDiscountAmount = aggrDiscountAmount;
    return this;
  }

   /**
   * 总共累计优惠金额
   * @return aggrDiscountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "83.88", value = "总共累计优惠金额")

  public String getAggrDiscountAmount() {
    return aggrDiscountAmount;
  }


  public void setAggrDiscountAmount(String aggrDiscountAmount) {
    this.aggrDiscountAmount = aggrDiscountAmount;
  }


  public ZhimaMerchantZmgoCumulateQueryResponseModel aggrTimes(Integer aggrTimes) {
    
    this.aggrTimes = aggrTimes;
    return this;
  }

   /**
   * 总共累计次数
   * @return aggrTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "总共累计次数")

  public Integer getAggrTimes() {
    return aggrTimes;
  }


  public void setAggrTimes(Integer aggrTimes) {
    this.aggrTimes = aggrTimes;
  }


  public ZhimaMerchantZmgoCumulateQueryResponseModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 芝麻go协议号，唯一标识一个芝麻go协议。
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20195108518085620000", value = "芝麻go协议号，唯一标识一个芝麻go协议。")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public ZhimaMerchantZmgoCumulateQueryResponseModel detailList(List<CumulateDataDetail> detailList) {
    
    this.detailList = detailList;
    return this;
  }

  public ZhimaMerchantZmgoCumulateQueryResponseModel addDetailListItem(CumulateDataDetail detailListItem) {
    if (this.detailList == null) {
      this.detailList = new ArrayList<>();
    }
    this.detailList.add(detailListItem);
    return this;
  }

   /**
   * 详情数据列表
   * @return detailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "详情数据列表")

  public List<CumulateDataDetail> getDetailList() {
    return detailList;
  }


  public void setDetailList(List<CumulateDataDetail> detailList) {
    this.detailList = detailList;
  }


  public ZhimaMerchantZmgoCumulateQueryResponseModel failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 查询失败原因
   * @return failReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "协议已经失效", value = "查询失败原因")

  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public ZhimaMerchantZmgoCumulateQueryResponseModel pageNo(Integer pageNo) {
    
    this.pageNo = pageNo;
    return this;
  }

   /**
   * 分页参数，返回传入的值。
   * @return pageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "分页参数，返回传入的值。")

  public Integer getPageNo() {
    return pageNo;
  }


  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }


  public ZhimaMerchantZmgoCumulateQueryResponseModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页参数，返回传入的值。
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "分页参数，返回传入的值。")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaMerchantZmgoCumulateQueryResponseModel zhimaMerchantZmgoCumulateQueryResponseModel = (ZhimaMerchantZmgoCumulateQueryResponseModel) o;
    return Objects.equals(this.aggrAmount, zhimaMerchantZmgoCumulateQueryResponseModel.aggrAmount) &&
        Objects.equals(this.aggrDiscountAmount, zhimaMerchantZmgoCumulateQueryResponseModel.aggrDiscountAmount) &&
        Objects.equals(this.aggrTimes, zhimaMerchantZmgoCumulateQueryResponseModel.aggrTimes) &&
        Objects.equals(this.agreementId, zhimaMerchantZmgoCumulateQueryResponseModel.agreementId) &&
        Objects.equals(this.detailList, zhimaMerchantZmgoCumulateQueryResponseModel.detailList) &&
        Objects.equals(this.failReason, zhimaMerchantZmgoCumulateQueryResponseModel.failReason) &&
        Objects.equals(this.pageNo, zhimaMerchantZmgoCumulateQueryResponseModel.pageNo) &&
        Objects.equals(this.pageSize, zhimaMerchantZmgoCumulateQueryResponseModel.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggrAmount, aggrDiscountAmount, aggrTimes, agreementId, detailList, failReason, pageNo, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaMerchantZmgoCumulateQueryResponseModel {\n");
    sb.append("    aggrAmount: ").append(toIndentedString(aggrAmount)).append("\n");
    sb.append("    aggrDiscountAmount: ").append(toIndentedString(aggrDiscountAmount)).append("\n");
    sb.append("    aggrTimes: ").append(toIndentedString(aggrTimes)).append("\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    detailList: ").append(toIndentedString(detailList)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("aggr_amount");
    openapiFields.add("aggr_discount_amount");
    openapiFields.add("aggr_times");
    openapiFields.add("agreement_id");
    openapiFields.add("detail_list");
    openapiFields.add("fail_reason");
    openapiFields.add("page_no");
    openapiFields.add("page_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaMerchantZmgoCumulateQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaMerchantZmgoCumulateQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaMerchantZmgoCumulateQueryResponseModel is not found in the empty JSON string", ZhimaMerchantZmgoCumulateQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaMerchantZmgoCumulateQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaMerchantZmgoCumulateQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("aggr_amount") != null && !jsonObj.get("aggr_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggr_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggr_amount").toString()));
      }
      if (jsonObj.get("aggr_discount_amount") != null && !jsonObj.get("aggr_discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggr_discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggr_discount_amount").toString()));
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      JsonArray jsonArraydetailList = jsonObj.getAsJsonArray("detail_list");
      if (jsonArraydetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("detail_list").toString()));
        }

        // validate the optional field `detail_list` (array)
        for (int i = 0; i < jsonArraydetailList.size(); i++) {
          CumulateDataDetail.validateJsonObject(jsonArraydetailList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("fail_reason") != null && !jsonObj.get("fail_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaMerchantZmgoCumulateQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaMerchantZmgoCumulateQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaMerchantZmgoCumulateQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaMerchantZmgoCumulateQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaMerchantZmgoCumulateQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaMerchantZmgoCumulateQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaMerchantZmgoCumulateQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaMerchantZmgoCumulateQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaMerchantZmgoCumulateQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaMerchantZmgoCumulateQueryResponseModel
  */
  public static ZhimaMerchantZmgoCumulateQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaMerchantZmgoCumulateQueryResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaMerchantZmgoCumulateQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

