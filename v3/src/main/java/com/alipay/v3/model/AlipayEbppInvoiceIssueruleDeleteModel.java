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
 * AlipayEbppInvoiceIssueruleDeleteModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceIssueruleDeleteModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_ISSUE_RULE_ID_LIST = "issue_rule_id_list";
  @SerializedName(SERIALIZED_NAME_ISSUE_RULE_ID_LIST)
  private List<String> issueRuleIdList = null;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public AlipayEbppInvoiceIssueruleDeleteModel() { 
  }

  public AlipayEbppInvoiceIssueruleDeleteModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户id
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "共同账户id")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceIssueruleDeleteModel agreementNo(String agreementNo) {
    
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


  public AlipayEbppInvoiceIssueruleDeleteModel enterpriseId(String enterpriseId) {
    
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


  public AlipayEbppInvoiceIssueruleDeleteModel issueRuleIdList(List<String> issueRuleIdList) {
    
    this.issueRuleIdList = issueRuleIdList;
    return this;
  }

  public AlipayEbppInvoiceIssueruleDeleteModel addIssueRuleIdListItem(String issueRuleIdListItem) {
    if (this.issueRuleIdList == null) {
      this.issueRuleIdList = new ArrayList<>();
    }
    this.issueRuleIdList.add(issueRuleIdListItem);
    return this;
  }

   /**
   * 需要删除的发放规则id列表
   * @return issueRuleIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2022052000152618690000000005\"]", value = "需要删除的发放规则id列表")

  public List<String> getIssueRuleIdList() {
    return issueRuleIdList;
  }


  public void setIssueRuleIdList(List<String> issueRuleIdList) {
    this.issueRuleIdList = issueRuleIdList;
  }


  public AlipayEbppInvoiceIssueruleDeleteModel targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 目标值id
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022052000152618690000000005", value = "目标值id")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public AlipayEbppInvoiceIssueruleDeleteModel targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * 发放规则关联的目标类型
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INSTITUTION", value = "发放规则关联的目标类型")

  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceIssueruleDeleteModel alipayEbppInvoiceIssueruleDeleteModel = (AlipayEbppInvoiceIssueruleDeleteModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceIssueruleDeleteModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceIssueruleDeleteModel.agreementNo) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceIssueruleDeleteModel.enterpriseId) &&
        Objects.equals(this.issueRuleIdList, alipayEbppInvoiceIssueruleDeleteModel.issueRuleIdList) &&
        Objects.equals(this.targetId, alipayEbppInvoiceIssueruleDeleteModel.targetId) &&
        Objects.equals(this.targetType, alipayEbppInvoiceIssueruleDeleteModel.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, enterpriseId, issueRuleIdList, targetId, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceIssueruleDeleteModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    issueRuleIdList: ").append(toIndentedString(issueRuleIdList)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
    openapiFields.add("enterprise_id");
    openapiFields.add("issue_rule_id_list");
    openapiFields.add("target_id");
    openapiFields.add("target_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceIssueruleDeleteModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceIssueruleDeleteModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceIssueruleDeleteModel is not found in the empty JSON string", AlipayEbppInvoiceIssueruleDeleteModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceIssueruleDeleteModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceIssueruleDeleteModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("issue_rule_id_list") != null && !jsonObj.get("issue_rule_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_rule_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("issue_rule_id_list").toString()));
      }
      if (jsonObj.get("target_id") != null && !jsonObj.get("target_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_id").toString()));
      }
      if (jsonObj.get("target_type") != null && !jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceIssueruleDeleteModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceIssueruleDeleteModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceIssueruleDeleteModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceIssueruleDeleteModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceIssueruleDeleteModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceIssueruleDeleteModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceIssueruleDeleteModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceIssueruleDeleteModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceIssueruleDeleteModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceIssueruleDeleteModel
  */
  public static AlipayEbppInvoiceIssueruleDeleteModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceIssueruleDeleteModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceIssueruleDeleteModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

