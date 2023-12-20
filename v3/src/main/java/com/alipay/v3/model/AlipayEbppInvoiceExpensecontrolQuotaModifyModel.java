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
 * AlipayEbppInvoiceExpensecontrolQuotaModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpensecontrolQuotaModifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_OUTER_SOURCE_ID = "outer_source_id";
  @SerializedName(SERIALIZED_NAME_OUTER_SOURCE_ID)
  private String outerSourceId;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_QUOTA_ID = "quota_id";
  @SerializedName(SERIALIZED_NAME_QUOTA_ID)
  private String quotaId;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private String shareMode;

  public AlipayEbppInvoiceExpensecontrolQuotaModifyModel() { 
  }

  public AlipayEbppInvoiceExpensecontrolQuotaModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业共同账户ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业共同账户ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaModifyModel action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * 变更模式
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ADD", value = "变更模式")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaModifyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001112341234", value = "授权签约协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaModifyModel amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 变更的金额/余额，以（分）为单位，当变更的资产类型为次卡时，当前的单位为次
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "变更的金额/余额，以（分）为单位，当变更的资产类型为次卡时，当前的单位为次")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaModifyModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业ID
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业ID")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaModifyModel outerSourceId(String outerSourceId) {
    
    this.outerSourceId = outerSourceId;
    return this;
  }

   /**
   * 外部操作幂等ID（接入方接口调用幂等控制ID）
   * @return outerSourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TN00000000000001", value = "外部操作幂等ID（接入方接口调用幂等控制ID）")

  public String getOuterSourceId() {
    return outerSourceId;
  }


  public void setOuterSourceId(String outerSourceId) {
    this.outerSourceId = outerSourceId;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaModifyModel platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * 外部平台编码
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RJ", value = "外部平台编码")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaModifyModel quotaId(String quotaId) {
    
    this.quotaId = quotaId;
    return this;
  }

   /**
   * 额度ID
   * @return quotaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021062800152601350000001468", value = "额度ID")

  public String getQuotaId() {
    return quotaId;
  }


  public void setQuotaId(String quotaId) {
    this.quotaId = quotaId;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaModifyModel shareMode(String shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * 是否可转赠，1表示可转赠，0表示不可转赠
   * @return shareMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "是否可转赠，1表示可转赠，0表示不可转赠")

  public String getShareMode() {
    return shareMode;
  }


  public void setShareMode(String shareMode) {
    this.shareMode = shareMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceExpensecontrolQuotaModifyModel alipayEbppInvoiceExpensecontrolQuotaModifyModel = (AlipayEbppInvoiceExpensecontrolQuotaModifyModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceExpensecontrolQuotaModifyModel.accountId) &&
        Objects.equals(this.action, alipayEbppInvoiceExpensecontrolQuotaModifyModel.action) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceExpensecontrolQuotaModifyModel.agreementNo) &&
        Objects.equals(this.amount, alipayEbppInvoiceExpensecontrolQuotaModifyModel.amount) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceExpensecontrolQuotaModifyModel.enterpriseId) &&
        Objects.equals(this.outerSourceId, alipayEbppInvoiceExpensecontrolQuotaModifyModel.outerSourceId) &&
        Objects.equals(this.platform, alipayEbppInvoiceExpensecontrolQuotaModifyModel.platform) &&
        Objects.equals(this.quotaId, alipayEbppInvoiceExpensecontrolQuotaModifyModel.quotaId) &&
        Objects.equals(this.shareMode, alipayEbppInvoiceExpensecontrolQuotaModifyModel.shareMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, action, agreementNo, amount, enterpriseId, outerSourceId, platform, quotaId, shareMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpensecontrolQuotaModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    outerSourceId: ").append(toIndentedString(outerSourceId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
    sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("action");
    openapiFields.add("agreement_no");
    openapiFields.add("amount");
    openapiFields.add("enterprise_id");
    openapiFields.add("outer_source_id");
    openapiFields.add("platform");
    openapiFields.add("quota_id");
    openapiFields.add("share_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpensecontrolQuotaModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpensecontrolQuotaModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpensecontrolQuotaModifyModel is not found in the empty JSON string", AlipayEbppInvoiceExpensecontrolQuotaModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceExpensecontrolQuotaModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceExpensecontrolQuotaModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("outer_source_id") != null && !jsonObj.get("outer_source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outer_source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outer_source_id").toString()));
      }
      if (jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if (jsonObj.get("quota_id") != null && !jsonObj.get("quota_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_id").toString()));
      }
      if (jsonObj.get("share_mode") != null && !jsonObj.get("share_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `share_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("share_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpensecontrolQuotaModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpensecontrolQuotaModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpensecontrolQuotaModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpensecontrolQuotaModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpensecontrolQuotaModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpensecontrolQuotaModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceExpensecontrolQuotaModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceExpensecontrolQuotaModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpensecontrolQuotaModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpensecontrolQuotaModifyModel
  */
  public static AlipayEbppInvoiceExpensecontrolQuotaModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpensecontrolQuotaModifyModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpensecontrolQuotaModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

