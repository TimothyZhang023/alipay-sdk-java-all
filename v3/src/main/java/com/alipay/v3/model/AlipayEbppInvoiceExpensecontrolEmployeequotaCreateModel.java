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
 * AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effective_end_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private String effectiveEndDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "effective_start_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private String effectiveStartDate;

  public static final String SERIALIZED_NAME_OUTER_SOURCE_ID = "outer_source_id";
  @SerializedName(SERIALIZED_NAME_OUTER_SOURCE_ID)
  private String outerSourceId;

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_OWNER_OPEN_ID = "owner_open_id";
  @SerializedName(SERIALIZED_NAME_OWNER_OPEN_ID)
  private String ownerOpenId;

  public static final String SERIALIZED_NAME_OWNER_TYPE = "owner_type";
  @SerializedName(SERIALIZED_NAME_OWNER_TYPE)
  private String ownerType;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_QUOTA_MODEL = "quota_model";
  @SerializedName(SERIALIZED_NAME_QUOTA_MODEL)
  private String quotaModel;

  public static final String SERIALIZED_NAME_QUOTA_VALUE = "quota_value";
  @SerializedName(SERIALIZED_NAME_QUOTA_VALUE)
  private String quotaValue;

  public AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel() { 
  }

  public AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账号ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "共同账号ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel agreementNo(String agreementNo) {
    
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


  public AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel effectiveEndDate(String effectiveEndDate) {
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * 余额失效时间（默认有效期100年）
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-01 00:00:00", value = "余额失效时间（默认有效期100年）")

  public String getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(String effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }


  public AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel effectiveStartDate(String effectiveStartDate) {
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * 余额生效时间(默认当前时间)
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 00:00:00", value = "余额生效时间(默认当前时间)")

  public String getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }


  public AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel outerSourceId(String outerSourceId) {
    
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


  public AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * 切换open_id前请使用：余额所属者ID owner_type为员工时为员工支付宝ID
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088210888827370", value = "切换open_id前请使用：余额所属者ID owner_type为员工时为员工支付宝ID")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel ownerOpenId(String ownerOpenId) {
    
    this.ownerOpenId = ownerOpenId;
    return this;
  }

   /**
   * 切换open_id后请使用：余额所属者ID owner_type为员工时为员工open_id
   * @return ownerOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcdxxxx", value = "切换open_id后请使用：余额所属者ID owner_type为员工时为员工open_id")

  public String getOwnerOpenId() {
    return ownerOpenId;
  }


  public void setOwnerOpenId(String ownerOpenId) {
    this.ownerOpenId = ownerOpenId;
  }


  public AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel ownerType(String ownerType) {
    
    this.ownerType = ownerType;
    return this;
  }

   /**
   * 余额所属者类型 EMPLOYEE: 员工
   * @return ownerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EMPLOYEE", value = "余额所属者类型 EMPLOYEE: 员工")

  public String getOwnerType() {
    return ownerType;
  }


  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
  }


  public AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * 外部平台编码（通常为接入方大写英文缩写）
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RJ", value = "外部平台编码（通常为接入方大写英文缩写）")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel quotaModel(String quotaModel) {
    
    this.quotaModel = quotaModel;
    return this;
  }

   /**
   * 余额同步模式，默认 DEFAULT_STANDARD
   * @return quotaModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT_STANDARD", value = "余额同步模式，默认 DEFAULT_STANDARD")

  public String getQuotaModel() {
    return quotaModel;
  }


  public void setQuotaModel(String quotaModel) {
    this.quotaModel = quotaModel;
  }


  public AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel quotaValue(String quotaValue) {
    
    this.quotaValue = quotaValue;
    return this;
  }

   /**
   * 余额，以（分）为单位 特殊说明：余额不超过100000元
   * @return quotaValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "余额，以（分）为单位 特殊说明：余额不超过100000元")

  public String getQuotaValue() {
    return quotaValue;
  }


  public void setQuotaValue(String quotaValue) {
    this.quotaValue = quotaValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel = (AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.agreementNo) &&
        Objects.equals(this.effectiveEndDate, alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.effectiveEndDate) &&
        Objects.equals(this.effectiveStartDate, alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.effectiveStartDate) &&
        Objects.equals(this.outerSourceId, alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.outerSourceId) &&
        Objects.equals(this.ownerId, alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.ownerId) &&
        Objects.equals(this.ownerOpenId, alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.ownerOpenId) &&
        Objects.equals(this.ownerType, alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.ownerType) &&
        Objects.equals(this.platform, alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.platform) &&
        Objects.equals(this.quotaModel, alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.quotaModel) &&
        Objects.equals(this.quotaValue, alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.quotaValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, effectiveEndDate, effectiveStartDate, outerSourceId, ownerId, ownerOpenId, ownerType, platform, quotaModel, quotaValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    outerSourceId: ").append(toIndentedString(outerSourceId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerOpenId: ").append(toIndentedString(ownerOpenId)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    quotaModel: ").append(toIndentedString(quotaModel)).append("\n");
    sb.append("    quotaValue: ").append(toIndentedString(quotaValue)).append("\n");
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
    openapiFields.add("agreement_no");
    openapiFields.add("effective_end_date");
    openapiFields.add("effective_start_date");
    openapiFields.add("outer_source_id");
    openapiFields.add("owner_id");
    openapiFields.add("owner_open_id");
    openapiFields.add("owner_type");
    openapiFields.add("platform");
    openapiFields.add("quota_model");
    openapiFields.add("quota_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel is not found in the empty JSON string", AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("effective_end_date") != null && !jsonObj.get("effective_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_end_date").toString()));
      }
      if (jsonObj.get("effective_start_date") != null && !jsonObj.get("effective_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_start_date").toString()));
      }
      if (jsonObj.get("outer_source_id") != null && !jsonObj.get("outer_source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outer_source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outer_source_id").toString()));
      }
      if (jsonObj.get("owner_id") != null && !jsonObj.get("owner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_id").toString()));
      }
      if (jsonObj.get("owner_open_id") != null && !jsonObj.get("owner_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_open_id").toString()));
      }
      if (jsonObj.get("owner_type") != null && !jsonObj.get("owner_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_type").toString()));
      }
      if (jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if (jsonObj.get("quota_model") != null && !jsonObj.get("quota_model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_model").toString()));
      }
      if (jsonObj.get("quota_value") != null && !jsonObj.get("quota_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel
  */
  public static AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

