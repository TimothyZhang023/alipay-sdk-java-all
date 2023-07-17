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
 * AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_CONSUMPTION_END = "consumption_end";
  @SerializedName(SERIALIZED_NAME_CONSUMPTION_END)
  private String consumptionEnd;

  public static final String SERIALIZED_NAME_CONSUMPTION_START = "consumption_start";
  @SerializedName(SERIALIZED_NAME_CONSUMPTION_START)
  private String consumptionStart;

  public static final String SERIALIZED_NAME_EMPLOYEE_LIST = "employee_list";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_LIST)
  private List<String> employeeList = null;

  public static final String SERIALIZED_NAME_EMPLOYEE_OPEN_IDS = "employee_open_ids";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_OPEN_IDS)
  private List<String> employeeOpenIds = null;

  public AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel() { 
  }

  public AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel agreementNo(String agreementNo) {
    
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


  public AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel consumptionEnd(String consumptionEnd) {
    
    this.consumptionEnd = consumptionEnd;
    return this;
  }

   /**
   * 交易结束时间，格式：yyyy-MM-dd HH:mm:ss
   * @return consumptionEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-12-16 00:00:00", value = "交易结束时间，格式：yyyy-MM-dd HH:mm:ss")

  public String getConsumptionEnd() {
    return consumptionEnd;
  }


  public void setConsumptionEnd(String consumptionEnd) {
    this.consumptionEnd = consumptionEnd;
  }


  public AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel consumptionStart(String consumptionStart) {
    
    this.consumptionStart = consumptionStart;
    return this;
  }

   /**
   * 交易开始时间，格式：yyyy-MM-dd HH:mm:ss
   * @return consumptionStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-12-16 00:00:00", value = "交易开始时间，格式：yyyy-MM-dd HH:mm:ss")

  public String getConsumptionStart() {
    return consumptionStart;
  }


  public void setConsumptionStart(String consumptionStart) {
    this.consumptionStart = consumptionStart;
  }


  public AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel employeeList(List<String> employeeList) {
    
    this.employeeList = employeeList;
    return this;
  }

  public AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel addEmployeeListItem(String employeeListItem) {
    if (this.employeeList == null) {
      this.employeeList = new ArrayList<>();
    }
    this.employeeList.add(employeeListItem);
    return this;
  }

   /**
   * 员工支付宝UID列表，单次传入最大员工数量为10
   * @return employeeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2088210888827370\"]", value = "员工支付宝UID列表，单次传入最大员工数量为10")

  public List<String> getEmployeeList() {
    return employeeList;
  }


  public void setEmployeeList(List<String> employeeList) {
    this.employeeList = employeeList;
  }


  public AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel employeeOpenIds(List<String> employeeOpenIds) {
    
    this.employeeOpenIds = employeeOpenIds;
    return this;
  }

  public AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel addEmployeeOpenIdsItem(String employeeOpenIdsItem) {
    if (this.employeeOpenIds == null) {
      this.employeeOpenIds = new ArrayList<>();
    }
    this.employeeOpenIds.add(employeeOpenIdsItem);
    return this;
  }

   /**
   * 员工支付宝UID列表，单次传入最大员工数量为10
   * @return employeeOpenIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5\"]", value = "员工支付宝UID列表，单次传入最大员工数量为10")

  public List<String> getEmployeeOpenIds() {
    return employeeOpenIds;
  }


  public void setEmployeeOpenIds(List<String> employeeOpenIds) {
    this.employeeOpenIds = employeeOpenIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel alipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel = (AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel.agreementNo) &&
        Objects.equals(this.consumptionEnd, alipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel.consumptionEnd) &&
        Objects.equals(this.consumptionStart, alipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel.consumptionStart) &&
        Objects.equals(this.employeeList, alipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel.employeeList) &&
        Objects.equals(this.employeeOpenIds, alipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel.employeeOpenIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, consumptionEnd, consumptionStart, employeeList, employeeOpenIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    consumptionEnd: ").append(toIndentedString(consumptionEnd)).append("\n");
    sb.append("    consumptionStart: ").append(toIndentedString(consumptionStart)).append("\n");
    sb.append("    employeeList: ").append(toIndentedString(employeeList)).append("\n");
    sb.append("    employeeOpenIds: ").append(toIndentedString(employeeOpenIds)).append("\n");
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
    openapiFields.add("consumption_end");
    openapiFields.add("consumption_start");
    openapiFields.add("employee_list");
    openapiFields.add("employee_open_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel is not found in the empty JSON string", AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("consumption_end") != null && !jsonObj.get("consumption_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumption_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumption_end").toString()));
      }
      if (jsonObj.get("consumption_start") != null && !jsonObj.get("consumption_start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumption_start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumption_start").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("employee_list") != null && !jsonObj.get("employee_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_list` to be an array in the JSON string but got `%s`", jsonObj.get("employee_list").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("employee_open_ids") != null && !jsonObj.get("employee_open_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_open_ids` to be an array in the JSON string but got `%s`", jsonObj.get("employee_open_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel
  */
  public static AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

