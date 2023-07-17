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
import com.alipay.v3.model.MutipleCurrencyDetail;
import com.alipay.v3.model.Participant;
import com.alipay.v3.model.SignData;
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
 * AlipayFundTransUniTransferModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundTransUniTransferModel {
  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_BUSINESS_PARAMS = "business_params";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PARAMS)
  private String businessParams;

  public static final String SERIALIZED_NAME_MUTIPLE_CURRENCY_DETAIL = "mutiple_currency_detail";
  @SerializedName(SERIALIZED_NAME_MUTIPLE_CURRENCY_DETAIL)
  private MutipleCurrencyDetail mutipleCurrencyDetail;

  public static final String SERIALIZED_NAME_ORDER_TITLE = "order_title";
  @SerializedName(SERIALIZED_NAME_ORDER_TITLE)
  private String orderTitle;

  public static final String SERIALIZED_NAME_ORIGINAL_ORDER_ID = "original_order_id";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_ORDER_ID)
  private String originalOrderId;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PASSBACK_PARAMS = "passback_params";
  @SerializedName(SERIALIZED_NAME_PASSBACK_PARAMS)
  private String passbackParams;

  public static final String SERIALIZED_NAME_PAYEE_INFO = "payee_info";
  @SerializedName(SERIALIZED_NAME_PAYEE_INFO)
  private Participant payeeInfo;

  public static final String SERIALIZED_NAME_PAYER_INFO = "payer_info";
  @SerializedName(SERIALIZED_NAME_PAYER_INFO)
  private Participant payerInfo;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  public static final String SERIALIZED_NAME_SIGN_DATA = "sign_data";
  @SerializedName(SERIALIZED_NAME_SIGN_DATA)
  private SignData signData;

  public static final String SERIALIZED_NAME_TRANS_AMOUNT = "trans_amount";
  @SerializedName(SERIALIZED_NAME_TRANS_AMOUNT)
  private String transAmount;

  public AlipayFundTransUniTransferModel() { 
  }

  public AlipayFundTransUniTransferModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 描述特定的业务场景，可传的参数如下： DIRECT_TRANSFER：单笔无密转账到支付宝，B2C现金红包; PERSONAL_COLLECTION：C2C现金红包-领红包
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DIRECT_TRANSFER", value = "描述特定的业务场景，可传的参数如下： DIRECT_TRANSFER：单笔无密转账到支付宝，B2C现金红包; PERSONAL_COLLECTION：C2C现金红包-领红包")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayFundTransUniTransferModel businessParams(String businessParams) {
    
    this.businessParams = businessParams;
    return this;
  }

   /**
   * 转账业务请求的扩展参数，支持传入的扩展参数如下： sub_biz_scene 子业务场景，红包业务必传，取值REDPACKET，C2C现金红包、B2C现金红包均需传入
   * @return businessParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"sub_biz_scene\":\"REDPACKET\"}", value = "转账业务请求的扩展参数，支持传入的扩展参数如下： sub_biz_scene 子业务场景，红包业务必传，取值REDPACKET，C2C现金红包、B2C现金红包均需传入")

  public String getBusinessParams() {
    return businessParams;
  }


  public void setBusinessParams(String businessParams) {
    this.businessParams = businessParams;
  }


  public AlipayFundTransUniTransferModel mutipleCurrencyDetail(MutipleCurrencyDetail mutipleCurrencyDetail) {
    
    this.mutipleCurrencyDetail = mutipleCurrencyDetail;
    return this;
  }

   /**
   * Get mutipleCurrencyDetail
   * @return mutipleCurrencyDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MutipleCurrencyDetail getMutipleCurrencyDetail() {
    return mutipleCurrencyDetail;
  }


  public void setMutipleCurrencyDetail(MutipleCurrencyDetail mutipleCurrencyDetail) {
    this.mutipleCurrencyDetail = mutipleCurrencyDetail;
  }


  public AlipayFundTransUniTransferModel orderTitle(String orderTitle) {
    
    this.orderTitle = orderTitle;
    return this;
  }

   /**
   * 转账业务的标题，用于在支付宝用户的账单里显示
   * @return orderTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "转账标题", value = "转账业务的标题，用于在支付宝用户的账单里显示")

  public String getOrderTitle() {
    return orderTitle;
  }


  public void setOrderTitle(String orderTitle) {
    this.orderTitle = orderTitle;
  }


  public AlipayFundTransUniTransferModel originalOrderId(String originalOrderId) {
    
    this.originalOrderId = originalOrderId;
    return this;
  }

   /**
   * 原支付宝业务单号。C2C现金红包-红包领取时，传红包支付时返回的支付宝单号；B2C现金红包、单笔无密转账到支付宝不需要该参数。
   * @return originalOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190620110075000006640000063056", value = "原支付宝业务单号。C2C现金红包-红包领取时，传红包支付时返回的支付宝单号；B2C现金红包、单笔无密转账到支付宝不需要该参数。")

  public String getOriginalOrderId() {
    return originalOrderId;
  }


  public void setOriginalOrderId(String originalOrderId) {
    this.originalOrderId = originalOrderId;
  }


  public AlipayFundTransUniTransferModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 商家侧唯一订单号，由商家自定义。对于不同转账请求，商家需保证该订单号在自身系统唯一。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201806300001", value = "商家侧唯一订单号，由商家自定义。对于不同转账请求，商家需保证该订单号在自身系统唯一。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayFundTransUniTransferModel passbackParams(String passbackParams) {
    
    this.passbackParams = passbackParams;
    return this;
  }

   /**
   * 公用回传参数，如果请求时传递了该参数，则异步通知商户时会回传该参数。
   * @return passbackParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"merchantBizType\":\"peerPay\"}", value = "公用回传参数，如果请求时传递了该参数，则异步通知商户时会回传该参数。")

  public String getPassbackParams() {
    return passbackParams;
  }


  public void setPassbackParams(String passbackParams) {
    this.passbackParams = passbackParams;
  }


  public AlipayFundTransUniTransferModel payeeInfo(Participant payeeInfo) {
    
    this.payeeInfo = payeeInfo;
    return this;
  }

   /**
   * Get payeeInfo
   * @return payeeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Participant getPayeeInfo() {
    return payeeInfo;
  }


  public void setPayeeInfo(Participant payeeInfo) {
    this.payeeInfo = payeeInfo;
  }


  public AlipayFundTransUniTransferModel payerInfo(Participant payerInfo) {
    
    this.payerInfo = payerInfo;
    return this;
  }

   /**
   * Get payerInfo
   * @return payerInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Participant getPayerInfo() {
    return payerInfo;
  }


  public void setPayerInfo(Participant payerInfo) {
    this.payerInfo = payerInfo;
  }


  public AlipayFundTransUniTransferModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 业务产品码， 单笔无密转账到支付宝账户固定为: TRANS_ACCOUNT_NO_PWD； 收发现金红包固定为: STD_RED_PACKET；
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRANS_ACCOUNT_NO_PWD", value = "业务产品码， 单笔无密转账到支付宝账户固定为: TRANS_ACCOUNT_NO_PWD； 收发现金红包固定为: STD_RED_PACKET；")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public AlipayFundTransUniTransferModel remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 业务备注
   * @return remark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "单笔转账", value = "业务备注")

  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public AlipayFundTransUniTransferModel signData(SignData signData) {
    
    this.signData = signData;
    return this;
  }

   /**
   * Get signData
   * @return signData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignData getSignData() {
    return signData;
  }


  public void setSignData(SignData signData) {
    this.signData = signData;
  }


  public AlipayFundTransUniTransferModel transAmount(String transAmount) {
    
    this.transAmount = transAmount;
    return this;
  }

   /**
   * 订单总金额，单位为元，精确到小数点后两位，STD_RED_PACKET产品取值范围[0.01,100000000]； TRANS_ACCOUNT_NO_PWD产品取值范围[0.1,100000000]
   * @return transAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23.00", value = "订单总金额，单位为元，精确到小数点后两位，STD_RED_PACKET产品取值范围[0.01,100000000]； TRANS_ACCOUNT_NO_PWD产品取值范围[0.1,100000000]")

  public String getTransAmount() {
    return transAmount;
  }


  public void setTransAmount(String transAmount) {
    this.transAmount = transAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundTransUniTransferModel alipayFundTransUniTransferModel = (AlipayFundTransUniTransferModel) o;
    return Objects.equals(this.bizScene, alipayFundTransUniTransferModel.bizScene) &&
        Objects.equals(this.businessParams, alipayFundTransUniTransferModel.businessParams) &&
        Objects.equals(this.mutipleCurrencyDetail, alipayFundTransUniTransferModel.mutipleCurrencyDetail) &&
        Objects.equals(this.orderTitle, alipayFundTransUniTransferModel.orderTitle) &&
        Objects.equals(this.originalOrderId, alipayFundTransUniTransferModel.originalOrderId) &&
        Objects.equals(this.outBizNo, alipayFundTransUniTransferModel.outBizNo) &&
        Objects.equals(this.passbackParams, alipayFundTransUniTransferModel.passbackParams) &&
        Objects.equals(this.payeeInfo, alipayFundTransUniTransferModel.payeeInfo) &&
        Objects.equals(this.payerInfo, alipayFundTransUniTransferModel.payerInfo) &&
        Objects.equals(this.productCode, alipayFundTransUniTransferModel.productCode) &&
        Objects.equals(this.remark, alipayFundTransUniTransferModel.remark) &&
        Objects.equals(this.signData, alipayFundTransUniTransferModel.signData) &&
        Objects.equals(this.transAmount, alipayFundTransUniTransferModel.transAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizScene, businessParams, mutipleCurrencyDetail, orderTitle, originalOrderId, outBizNo, passbackParams, payeeInfo, payerInfo, productCode, remark, signData, transAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundTransUniTransferModel {\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    businessParams: ").append(toIndentedString(businessParams)).append("\n");
    sb.append("    mutipleCurrencyDetail: ").append(toIndentedString(mutipleCurrencyDetail)).append("\n");
    sb.append("    orderTitle: ").append(toIndentedString(orderTitle)).append("\n");
    sb.append("    originalOrderId: ").append(toIndentedString(originalOrderId)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    passbackParams: ").append(toIndentedString(passbackParams)).append("\n");
    sb.append("    payeeInfo: ").append(toIndentedString(payeeInfo)).append("\n");
    sb.append("    payerInfo: ").append(toIndentedString(payerInfo)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    signData: ").append(toIndentedString(signData)).append("\n");
    sb.append("    transAmount: ").append(toIndentedString(transAmount)).append("\n");
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
    openapiFields.add("biz_scene");
    openapiFields.add("business_params");
    openapiFields.add("mutiple_currency_detail");
    openapiFields.add("order_title");
    openapiFields.add("original_order_id");
    openapiFields.add("out_biz_no");
    openapiFields.add("passback_params");
    openapiFields.add("payee_info");
    openapiFields.add("payer_info");
    openapiFields.add("product_code");
    openapiFields.add("remark");
    openapiFields.add("sign_data");
    openapiFields.add("trans_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundTransUniTransferModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundTransUniTransferModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundTransUniTransferModel is not found in the empty JSON string", AlipayFundTransUniTransferModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundTransUniTransferModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundTransUniTransferModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      if (jsonObj.get("business_params") != null && !jsonObj.get("business_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_params").toString()));
      }
      // validate the optional field `mutiple_currency_detail`
      if (jsonObj.getAsJsonObject("mutiple_currency_detail") != null) {
        MutipleCurrencyDetail.validateJsonObject(jsonObj.getAsJsonObject("mutiple_currency_detail"));
      }
      if (jsonObj.get("order_title") != null && !jsonObj.get("order_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_title").toString()));
      }
      if (jsonObj.get("original_order_id") != null && !jsonObj.get("original_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_order_id").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("passback_params") != null && !jsonObj.get("passback_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passback_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passback_params").toString()));
      }
      // validate the optional field `payee_info`
      if (jsonObj.getAsJsonObject("payee_info") != null) {
        Participant.validateJsonObject(jsonObj.getAsJsonObject("payee_info"));
      }
      // validate the optional field `payer_info`
      if (jsonObj.getAsJsonObject("payer_info") != null) {
        Participant.validateJsonObject(jsonObj.getAsJsonObject("payer_info"));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
      if (jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
      // validate the optional field `sign_data`
      if (jsonObj.getAsJsonObject("sign_data") != null) {
        SignData.validateJsonObject(jsonObj.getAsJsonObject("sign_data"));
      }
      if (jsonObj.get("trans_amount") != null && !jsonObj.get("trans_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundTransUniTransferModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundTransUniTransferModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundTransUniTransferModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundTransUniTransferModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundTransUniTransferModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundTransUniTransferModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundTransUniTransferModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundTransUniTransferModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundTransUniTransferModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundTransUniTransferModel
  */
  public static AlipayFundTransUniTransferModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundTransUniTransferModel.class);
  }

 /**
  * Convert an instance of AlipayFundTransUniTransferModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

