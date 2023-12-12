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
 * AlipayTradeQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeQueryModel {
  public static final String SERIALIZED_NAME_ORG_PID = "org_pid";
  @SerializedName(SERIALIZED_NAME_ORG_PID)
  private String orgPid;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_QUERY_OPTIONS = "query_options";
  @SerializedName(SERIALIZED_NAME_QUERY_OPTIONS)
  private List<String> queryOptions = null;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeQueryModel() { 
  }

  public AlipayTradeQueryModel orgPid(String orgPid) {
    
    this.orgPid = orgPid;
    return this;
  }

   /**
   * 银行间联模式下有用，其它场景请不要使用；  双联通过该参数指定需要查询的交易所属收单机构的pid;
   * @return orgPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117952222", value = "银行间联模式下有用，其它场景请不要使用；  双联通过该参数指定需要查询的交易所属收单机构的pid;")

  public String getOrgPid() {
    return orgPid;
  }


  public void setOrgPid(String orgPid) {
    this.orgPid = orgPid;
  }


  public AlipayTradeQueryModel outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * 订单支付时传入的商户订单号,和支付宝交易号不能同时为空。  trade_no,out_trade_no如果同时存在优先取trade_no
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20150320010101001", value = "订单支付时传入的商户订单号,和支付宝交易号不能同时为空。  trade_no,out_trade_no如果同时存在优先取trade_no")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public AlipayTradeQueryModel queryOptions(List<String> queryOptions) {
    
    this.queryOptions = queryOptions;
    return this;
  }

  public AlipayTradeQueryModel addQueryOptionsItem(String queryOptionsItem) {
    if (this.queryOptions == null) {
      this.queryOptions = new ArrayList<>();
    }
    this.queryOptions.add(queryOptionsItem);
    return this;
  }

   /**
   * 查询选项，商户传入该参数可定制本接口同步响应额外返回的信息字段，数组格式。支持枚举如下：trade_settle_info：返回的交易结算信息，包含分账、补差等信息； fund_bill_list：交易支付使用的资金渠道； voucher_detail_list：交易支付时使用的所有优惠券信息； discount_goods_detail：交易支付所使用的单品券优惠的商品优惠信息； mdiscount_amount：商家优惠金额； medical_insurance_info：医保信息；
   * @return queryOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "trade_settle_info", value = "查询选项，商户传入该参数可定制本接口同步响应额外返回的信息字段，数组格式。支持枚举如下：trade_settle_info：返回的交易结算信息，包含分账、补差等信息； fund_bill_list：交易支付使用的资金渠道； voucher_detail_list：交易支付时使用的所有优惠券信息； discount_goods_detail：交易支付所使用的单品券优惠的商品优惠信息； mdiscount_amount：商家优惠金额； medical_insurance_info：医保信息；")

  public List<String> getQueryOptions() {
    return queryOptions;
  }


  public void setQueryOptions(List<String> queryOptions) {
    this.queryOptions = queryOptions;
  }


  public AlipayTradeQueryModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号，和商户订单号不能同时为空
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014112611001004680 073956707", value = "支付宝交易号，和商户订单号不能同时为空")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradeQueryModel alipayTradeQueryModel = (AlipayTradeQueryModel) o;
    return Objects.equals(this.orgPid, alipayTradeQueryModel.orgPid) &&
        Objects.equals(this.outTradeNo, alipayTradeQueryModel.outTradeNo) &&
        Objects.equals(this.queryOptions, alipayTradeQueryModel.queryOptions) &&
        Objects.equals(this.tradeNo, alipayTradeQueryModel.tradeNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgPid, outTradeNo, queryOptions, tradeNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeQueryModel {\n");
    sb.append("    orgPid: ").append(toIndentedString(orgPid)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    queryOptions: ").append(toIndentedString(queryOptions)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("org_pid");
    openapiFields.add("out_trade_no");
    openapiFields.add("query_options");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeQueryModel is not found in the empty JSON string", AlipayTradeQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("org_pid") != null && !jsonObj.get("org_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_pid").toString()));
      }
      if (jsonObj.get("out_trade_no") != null && !jsonObj.get("out_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_trade_no").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("query_options") != null && !jsonObj.get("query_options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_options` to be an array in the JSON string but got `%s`", jsonObj.get("query_options").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeQueryModel
  */
  public static AlipayTradeQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeQueryModel.class);
  }

 /**
  * Convert an instance of AlipayTradeQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

