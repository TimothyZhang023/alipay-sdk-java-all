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
import com.alipay.v3.model.SubMerchant;
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
 * BatchSettleDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BatchSettleDetail {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_DESC = "error_desc";
  @SerializedName(SERIALIZED_NAME_ERROR_DESC)
  private String errorDesc;

  public static final String SERIALIZED_NAME_SETTLE_ACCOUNT_ID = "settle_account_id";
  @SerializedName(SERIALIZED_NAME_SETTLE_ACCOUNT_ID)
  private String settleAccountId;

  public static final String SERIALIZED_NAME_SETTLE_ACCOUNT_ID_TYPE = "settle_account_id_type";
  @SerializedName(SERIALIZED_NAME_SETTLE_ACCOUNT_ID_TYPE)
  private String settleAccountIdType;

  public static final String SERIALIZED_NAME_SETTLE_ACCOUNT_OPEN_ID = "settle_account_open_id";
  @SerializedName(SERIALIZED_NAME_SETTLE_ACCOUNT_OPEN_ID)
  private String settleAccountOpenId;

  public static final String SERIALIZED_NAME_SETTLE_ACCOUNT_TYPE = "settle_account_type";
  @SerializedName(SERIALIZED_NAME_SETTLE_ACCOUNT_TYPE)
  private String settleAccountType;

  public static final String SERIALIZED_NAME_SETTLE_ENTITY_ID = "settle_entity_id";
  @SerializedName(SERIALIZED_NAME_SETTLE_ENTITY_ID)
  private String settleEntityId;

  public static final String SERIALIZED_NAME_SETTLE_ENTITY_TYPE = "settle_entity_type";
  @SerializedName(SERIALIZED_NAME_SETTLE_ENTITY_TYPE)
  private String settleEntityType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUB_MERCHANT = "sub_merchant";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT)
  private SubMerchant subMerchant;

  public BatchSettleDetail() { 
  }

  public BatchSettleDetail amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 结算金额，单位为元
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000.00", value = "结算金额，单位为元")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public BatchSettleDetail currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * 结算币种
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CNY", value = "结算币种")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public BatchSettleDetail errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 错误编码，SETTLE_ACCOUNT_ERROR：结算账户信息有误；BANK_DISHONOR：银行提现退票；UNKNOWN_ERROR：未知错误
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BANK_DISHONOR", value = "错误编码，SETTLE_ACCOUNT_ERROR：结算账户信息有误；BANK_DISHONOR：银行提现退票；UNKNOWN_ERROR：未知错误")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public BatchSettleDetail errorDesc(String errorDesc) {
    
    this.errorDesc = errorDesc;
    return this;
  }

   /**
   * 错误描述
   * @return errorDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "成功", value = "错误描述")

  public String getErrorDesc() {
    return errorDesc;
  }


  public void setErrorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
  }


  public BatchSettleDetail settleAccountId(String settleAccountId) {
    
    this.settleAccountId = settleAccountId;
    return this;
  }

   /**
   * 结算账户id。当结算账户id类型是cardSerialNo时，本参数为用户在支付宝绑定的卡编号；当结算账户id类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号；当结算账户id类型是loginName时，本参数为用户的支付宝登录号
   * @return settleAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "159******78", value = "结算账户id。当结算账户id类型是cardSerialNo时，本参数为用户在支付宝绑定的卡编号；当结算账户id类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号；当结算账户id类型是loginName时，本参数为用户的支付宝登录号")

  public String getSettleAccountId() {
    return settleAccountId;
  }


  public void setSettleAccountId(String settleAccountId) {
    this.settleAccountId = settleAccountId;
  }


  public BatchSettleDetail settleAccountIdType(String settleAccountIdType) {
    
    this.settleAccountIdType = settleAccountIdType;
    return this;
  }

   /**
   * 结算账户id类型。  当settle_account_type 为bankCard时，本参数为cardSerialNo，表示结算账户id是银行卡编号;  当settle_account_type 为alipayBalance时，本参数为userId或者loginName，其中userId表示结算账户id是支付宝唯一用户号，loginName表示结算账户id是支付宝登录号
   * @return settleAccountIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "loginName", value = "结算账户id类型。  当settle_account_type 为bankCard时，本参数为cardSerialNo，表示结算账户id是银行卡编号;  当settle_account_type 为alipayBalance时，本参数为userId或者loginName，其中userId表示结算账户id是支付宝唯一用户号，loginName表示结算账户id是支付宝登录号")

  public String getSettleAccountIdType() {
    return settleAccountIdType;
  }


  public void setSettleAccountIdType(String settleAccountIdType) {
    this.settleAccountIdType = settleAccountIdType;
  }


  public BatchSettleDetail settleAccountOpenId(String settleAccountOpenId) {
    
    this.settleAccountOpenId = settleAccountOpenId;
    return this;
  }

   /**
   * 结算账户的OpenId，本参数是用户在该应用（AppId）下的唯一用户标识。
   * @return settleAccountOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "093PJtAPYb2UkQ0mXk_X86Z_FaMou-DtIEvERQ8X8yqKaEf", value = "结算账户的OpenId，本参数是用户在该应用（AppId）下的唯一用户标识。")

  public String getSettleAccountOpenId() {
    return settleAccountOpenId;
  }


  public void setSettleAccountOpenId(String settleAccountOpenId) {
    this.settleAccountOpenId = settleAccountOpenId;
  }


  public BatchSettleDetail settleAccountType(String settleAccountType) {
    
    this.settleAccountType = settleAccountType;
    return this;
  }

   /**
   * 结算账户类型。 bankCard: 结算账户为银行卡； alipayBalance: 结算账户为支付宝余额户
   * @return settleAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipayBalance", value = "结算账户类型。 bankCard: 结算账户为银行卡； alipayBalance: 结算账户为支付宝余额户")

  public String getSettleAccountType() {
    return settleAccountType;
  }


  public void setSettleAccountType(String settleAccountType) {
    this.settleAccountType = settleAccountType;
  }


  public BatchSettleDetail settleEntityId(String settleEntityId) {
    
    this.settleEntityId = settleEntityId;
    return this;
  }

   /**
   * 结算主体账号。 当结算主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID
   * @return settleEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19023454", value = "结算主体账号。 当结算主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID")

  public String getSettleEntityId() {
    return settleEntityId;
  }


  public void setSettleEntityId(String settleEntityId) {
    this.settleEntityId = settleEntityId;
  }


  public BatchSettleDetail settleEntityType(String settleEntityType) {
    
    this.settleEntityType = settleEntityType;
    return this;
  }

   /**
   * 结算主体类型。 SecondMerchant：结算主体为二级商户; Store：结算主体为门店；
   * @return settleEntityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SecondMerchant", value = "结算主体类型。 SecondMerchant：结算主体为二级商户; Store：结算主体为门店；")

  public String getSettleEntityType() {
    return settleEntityType;
  }


  public void setSettleEntityType(String settleEntityType) {
    this.settleEntityType = settleEntityType;
  }


  public BatchSettleDetail status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * ACCEPT_SUCCESS：受理成功； SUCCESS：结算成功； FAIL：结算失败；FAIL_RETRY：失败重试。
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BANK_DEALING", value = "ACCEPT_SUCCESS：受理成功； SUCCESS：结算成功； FAIL：结算失败；FAIL_RETRY：失败重试。")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public BatchSettleDetail subMerchant(SubMerchant subMerchant) {
    
    this.subMerchant = subMerchant;
    return this;
  }

   /**
   * Get subMerchant
   * @return subMerchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubMerchant getSubMerchant() {
    return subMerchant;
  }


  public void setSubMerchant(SubMerchant subMerchant) {
    this.subMerchant = subMerchant;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchSettleDetail batchSettleDetail = (BatchSettleDetail) o;
    return Objects.equals(this.amount, batchSettleDetail.amount) &&
        Objects.equals(this.currency, batchSettleDetail.currency) &&
        Objects.equals(this.errorCode, batchSettleDetail.errorCode) &&
        Objects.equals(this.errorDesc, batchSettleDetail.errorDesc) &&
        Objects.equals(this.settleAccountId, batchSettleDetail.settleAccountId) &&
        Objects.equals(this.settleAccountIdType, batchSettleDetail.settleAccountIdType) &&
        Objects.equals(this.settleAccountOpenId, batchSettleDetail.settleAccountOpenId) &&
        Objects.equals(this.settleAccountType, batchSettleDetail.settleAccountType) &&
        Objects.equals(this.settleEntityId, batchSettleDetail.settleEntityId) &&
        Objects.equals(this.settleEntityType, batchSettleDetail.settleEntityType) &&
        Objects.equals(this.status, batchSettleDetail.status) &&
        Objects.equals(this.subMerchant, batchSettleDetail.subMerchant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, errorCode, errorDesc, settleAccountId, settleAccountIdType, settleAccountOpenId, settleAccountType, settleEntityId, settleEntityType, status, subMerchant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchSettleDetail {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDesc: ").append(toIndentedString(errorDesc)).append("\n");
    sb.append("    settleAccountId: ").append(toIndentedString(settleAccountId)).append("\n");
    sb.append("    settleAccountIdType: ").append(toIndentedString(settleAccountIdType)).append("\n");
    sb.append("    settleAccountOpenId: ").append(toIndentedString(settleAccountOpenId)).append("\n");
    sb.append("    settleAccountType: ").append(toIndentedString(settleAccountType)).append("\n");
    sb.append("    settleEntityId: ").append(toIndentedString(settleEntityId)).append("\n");
    sb.append("    settleEntityType: ").append(toIndentedString(settleEntityType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subMerchant: ").append(toIndentedString(subMerchant)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("error_code");
    openapiFields.add("error_desc");
    openapiFields.add("settle_account_id");
    openapiFields.add("settle_account_id_type");
    openapiFields.add("settle_account_open_id");
    openapiFields.add("settle_account_type");
    openapiFields.add("settle_entity_id");
    openapiFields.add("settle_entity_type");
    openapiFields.add("status");
    openapiFields.add("sub_merchant");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BatchSettleDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BatchSettleDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchSettleDetail is not found in the empty JSON string", BatchSettleDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BatchSettleDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchSettleDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (jsonObj.get("error_code") != null && !jsonObj.get("error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_code").toString()));
      }
      if (jsonObj.get("error_desc") != null && !jsonObj.get("error_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_desc").toString()));
      }
      if (jsonObj.get("settle_account_id") != null && !jsonObj.get("settle_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_account_id").toString()));
      }
      if (jsonObj.get("settle_account_id_type") != null && !jsonObj.get("settle_account_id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_account_id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_account_id_type").toString()));
      }
      if (jsonObj.get("settle_account_open_id") != null && !jsonObj.get("settle_account_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_account_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_account_open_id").toString()));
      }
      if (jsonObj.get("settle_account_type") != null && !jsonObj.get("settle_account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_account_type").toString()));
      }
      if (jsonObj.get("settle_entity_id") != null && !jsonObj.get("settle_entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_entity_id").toString()));
      }
      if (jsonObj.get("settle_entity_type") != null && !jsonObj.get("settle_entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_entity_type").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `sub_merchant`
      if (jsonObj.getAsJsonObject("sub_merchant") != null) {
        SubMerchant.validateJsonObject(jsonObj.getAsJsonObject("sub_merchant"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchSettleDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchSettleDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchSettleDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchSettleDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchSettleDetail>() {
           @Override
           public void write(JsonWriter out, BatchSettleDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchSettleDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BatchSettleDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BatchSettleDetail
  * @throws IOException if the JSON string is invalid with respect to BatchSettleDetail
  */
  public static BatchSettleDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchSettleDetail.class);
  }

 /**
  * Convert an instance of BatchSettleDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

