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
 * EinvTrade
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EinvTrade {
  public static final String SERIALIZED_NAME_BILL_NO = "bill_no";
  @SerializedName(SERIALIZED_NAME_BILL_NO)
  private String billNo;

  public static final String SERIALIZED_NAME_BILL_TIME = "bill_time";
  @SerializedName(SERIALIZED_NAME_BILL_TIME)
  private String billTime;

  public static final String SERIALIZED_NAME_CITY_NAME = "city_name";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName;

  public static final String SERIALIZED_NAME_DETAIL_JSON = "detail_json";
  @SerializedName(SERIALIZED_NAME_DETAIL_JSON)
  private String detailJson;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl;

  public static final String SERIALIZED_NAME_EXTEND_MAP = "extend_map";
  @SerializedName(SERIALIZED_NAME_EXTEND_MAP)
  private String extendMap;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_OUT_JSON = "out_json";
  @SerializedName(SERIALIZED_NAME_OUT_JSON)
  private String outJson;

  public static final String SERIALIZED_NAME_PAYEE_NAME = "payee_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_NAME)
  private String payeeName;

  public static final String SERIALIZED_NAME_PAYMENT_AMOUNT = "payment_amount";
  @SerializedName(SERIALIZED_NAME_PAYMENT_AMOUNT)
  private String paymentAmount;

  public static final String SERIALIZED_NAME_PAYMENT_TIME = "payment_time";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TIME)
  private String paymentTime;

  public static final String SERIALIZED_NAME_SOUCE = "souce";
  @SerializedName(SERIALIZED_NAME_SOUCE)
  private String souce;

  public static final String SERIALIZED_NAME_TRADE_TYPE = "trade_type";
  @SerializedName(SERIALIZED_NAME_TRADE_TYPE)
  private String tradeType;

  public EinvTrade() { 
  }

  public EinvTrade billNo(String billNo) {
    
    this.billNo = billNo;
    return this;
  }

   /**
   * 订单编号
   * @return billNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "订单编号")

  public String getBillNo() {
    return billNo;
  }


  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }


  public EinvTrade billTime(String billTime) {
    
    this.billTime = billTime;
    return this;
  }

   /**
   * 下单时间
   * @return billTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "下单时间")

  public String getBillTime() {
    return billTime;
  }


  public void setBillTime(String billTime) {
    this.billTime = billTime;
  }


  public EinvTrade cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * 商户所在城市(经营地址)
   * @return cityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户所在城市(经营地址)")

  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public EinvTrade detailJson(String detailJson) {
    
    this.detailJson = detailJson;
    return this;
  }

   /**
   * 账单明细信息，酒店水单信息，行程单信息，餐饮小票信息
   * @return detailJson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "账单明细信息，酒店水单信息，行程单信息，餐饮小票信息")

  public String getDetailJson() {
    return detailJson;
  }


  public void setDetailJson(String detailJson) {
    this.detailJson = detailJson;
  }


  public EinvTrade downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 账单明细信息，酒店水单，行程单，餐饮小票等pdf原件链接
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "账单明细信息，酒店水单，行程单，餐饮小票等pdf原件链接")

  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public EinvTrade extendMap(String extendMap) {
    
    this.extendMap = extendMap;
    return this;
  }

   /**
   * 扩展参数  不同组的k-v通过换行符区分
   * @return extendMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展参数  不同组的k-v通过换行符区分")

  public String getExtendMap() {
    return extendMap;
  }


  public void setExtendMap(String extendMap) {
    this.extendMap = extendMap;
  }


  public EinvTrade merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * 商家名称（显示名称，非企业名称，餐饮店、酒店、打车平台名称）
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家名称（显示名称，非企业名称，餐饮店、酒店、打车平台名称）")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public EinvTrade outJson(String outJson) {
    
    this.outJson = outJson;
    return this;
  }

   /**
   * 透传字段，不做处理，用于isv向后续报销税控方传递特殊信息标记
   * @return outJson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "透传字段，不做处理，用于isv向后续报销税控方传递特殊信息标记")

  public String getOutJson() {
    return outJson;
  }


  public void setOutJson(String outJson) {
    this.outJson = outJson;
  }


  public EinvTrade payeeName(String payeeName) {
    
    this.payeeName = payeeName;
    return this;
  }

   /**
   * 销方名称
   * @return payeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "销方名称")

  public String getPayeeName() {
    return payeeName;
  }


  public void setPayeeName(String payeeName) {
    this.payeeName = payeeName;
  }


  public EinvTrade paymentAmount(String paymentAmount) {
    
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * 支付金额  对应账单中的交易金额
   * @return paymentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付金额  对应账单中的交易金额")

  public String getPaymentAmount() {
    return paymentAmount;
  }


  public void setPaymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }


  public EinvTrade paymentTime(String paymentTime) {
    
    this.paymentTime = paymentTime;
    return this;
  }

   /**
   * 支付时间  对应账单中的账单日期
   * @return paymentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付时间  对应账单中的账单日期")

  public String getPaymentTime() {
    return paymentTime;
  }


  public void setPaymentTime(String paymentTime) {
    this.paymentTime = paymentTime;
  }


  public EinvTrade souce(String souce) {
    
    this.souce = souce;
    return this;
  }

   /**
   * 交易类型来源 需要按照枚举映射  consume 账单  hotel 酒店水单  itinerary 打车行程单  catering 餐饮小票
   * @return souce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交易类型来源 需要按照枚举映射  consume 账单  hotel 酒店水单  itinerary 打车行程单  catering 餐饮小票")

  public String getSouce() {
    return souce;
  }


  public void setSouce(String souce) {
    this.souce = souce;
  }


  public EinvTrade tradeType(String tradeType) {
    
    this.tradeType = tradeType;
    return this;
  }

   /**
   * 交易类型/账单分类
   * @return tradeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交易类型/账单分类")

  public String getTradeType() {
    return tradeType;
  }


  public void setTradeType(String tradeType) {
    this.tradeType = tradeType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EinvTrade einvTrade = (EinvTrade) o;
    return Objects.equals(this.billNo, einvTrade.billNo) &&
        Objects.equals(this.billTime, einvTrade.billTime) &&
        Objects.equals(this.cityName, einvTrade.cityName) &&
        Objects.equals(this.detailJson, einvTrade.detailJson) &&
        Objects.equals(this.downloadUrl, einvTrade.downloadUrl) &&
        Objects.equals(this.extendMap, einvTrade.extendMap) &&
        Objects.equals(this.merchantName, einvTrade.merchantName) &&
        Objects.equals(this.outJson, einvTrade.outJson) &&
        Objects.equals(this.payeeName, einvTrade.payeeName) &&
        Objects.equals(this.paymentAmount, einvTrade.paymentAmount) &&
        Objects.equals(this.paymentTime, einvTrade.paymentTime) &&
        Objects.equals(this.souce, einvTrade.souce) &&
        Objects.equals(this.tradeType, einvTrade.tradeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billNo, billTime, cityName, detailJson, downloadUrl, extendMap, merchantName, outJson, payeeName, paymentAmount, paymentTime, souce, tradeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EinvTrade {\n");
    sb.append("    billNo: ").append(toIndentedString(billNo)).append("\n");
    sb.append("    billTime: ").append(toIndentedString(billTime)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    detailJson: ").append(toIndentedString(detailJson)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    extendMap: ").append(toIndentedString(extendMap)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    outJson: ").append(toIndentedString(outJson)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentTime: ").append(toIndentedString(paymentTime)).append("\n");
    sb.append("    souce: ").append(toIndentedString(souce)).append("\n");
    sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
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
    openapiFields.add("bill_no");
    openapiFields.add("bill_time");
    openapiFields.add("city_name");
    openapiFields.add("detail_json");
    openapiFields.add("download_url");
    openapiFields.add("extend_map");
    openapiFields.add("merchant_name");
    openapiFields.add("out_json");
    openapiFields.add("payee_name");
    openapiFields.add("payment_amount");
    openapiFields.add("payment_time");
    openapiFields.add("souce");
    openapiFields.add("trade_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EinvTrade
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EinvTrade.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EinvTrade is not found in the empty JSON string", EinvTrade.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EinvTrade.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EinvTrade` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("bill_no") != null && !jsonObj.get("bill_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_no").toString()));
      }
      if (jsonObj.get("bill_time") != null && !jsonObj.get("bill_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_time").toString()));
      }
      if (jsonObj.get("city_name") != null && !jsonObj.get("city_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_name").toString()));
      }
      if (jsonObj.get("detail_json") != null && !jsonObj.get("detail_json").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail_json` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail_json").toString()));
      }
      if (jsonObj.get("download_url") != null && !jsonObj.get("download_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `download_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("download_url").toString()));
      }
      if (jsonObj.get("extend_map") != null && !jsonObj.get("extend_map").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_map` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_map").toString()));
      }
      if (jsonObj.get("merchant_name") != null && !jsonObj.get("merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_name").toString()));
      }
      if (jsonObj.get("out_json") != null && !jsonObj.get("out_json").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_json` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_json").toString()));
      }
      if (jsonObj.get("payee_name") != null && !jsonObj.get("payee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_name").toString()));
      }
      if (jsonObj.get("payment_amount") != null && !jsonObj.get("payment_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_amount").toString()));
      }
      if (jsonObj.get("payment_time") != null && !jsonObj.get("payment_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_time").toString()));
      }
      if (jsonObj.get("souce") != null && !jsonObj.get("souce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `souce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("souce").toString()));
      }
      if (jsonObj.get("trade_type") != null && !jsonObj.get("trade_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EinvTrade.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EinvTrade' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EinvTrade> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EinvTrade.class));

       return (TypeAdapter<T>) new TypeAdapter<EinvTrade>() {
           @Override
           public void write(JsonWriter out, EinvTrade value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EinvTrade read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EinvTrade given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EinvTrade
  * @throws IOException if the JSON string is invalid with respect to EinvTrade
  */
  public static EinvTrade fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EinvTrade.class);
  }

 /**
  * Convert an instance of EinvTrade to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

