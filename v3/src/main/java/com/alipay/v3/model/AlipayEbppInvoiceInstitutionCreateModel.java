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
import com.alipay.v3.model.IssueRuleInfo;
import com.alipay.v3.model.StandardInfo;
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
 * AlipayEbppInvoiceInstitutionCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceInstitutionCreateModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_CONSULT_MODE = "consult_mode";
  @SerializedName(SERIALIZED_NAME_CONSULT_MODE)
  private String consultMode;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effective_end_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private String effectiveEndDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "effective_start_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private String effectiveStartDate;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_EXPENSE_TYPE = "expense_type";
  @SerializedName(SERIALIZED_NAME_EXPENSE_TYPE)
  private String expenseType;

  public static final String SERIALIZED_NAME_INSTITUTION_DESC = "institution_desc";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_DESC)
  private String institutionDesc;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_ISSUE_RULE_INFO_LIST = "issue_rule_info_list";
  @SerializedName(SERIALIZED_NAME_ISSUE_RULE_INFO_LIST)
  private List<IssueRuleInfo> issueRuleInfoList = null;

  public static final String SERIALIZED_NAME_SCENE_TYPE = "scene_type";
  @SerializedName(SERIALIZED_NAME_SCENE_TYPE)
  private String sceneType;

  public static final String SERIALIZED_NAME_STANDARD_INFO_LIST = "standard_info_list";
  @SerializedName(SERIALIZED_NAME_STANDARD_INFO_LIST)
  private List<StandardInfo> standardInfoList = null;

  public AlipayEbppInvoiceInstitutionCreateModel() { 
  }

  public AlipayEbppInvoiceInstitutionCreateModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业共同账户id
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业共同账户id")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceInstitutionCreateModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20225415889003553", value = "授权签约协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceInstitutionCreateModel consultMode(String consultMode) {
    
    this.consultMode = consultMode;
    return this;
  }

   /**
   * 费控咨询模式，默认为0。
   * @return consultMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "费控咨询模式，默认为0。")

  public String getConsultMode() {
    return consultMode;
  }


  public void setConsultMode(String consultMode) {
    this.consultMode = consultMode;
  }


  public AlipayEbppInvoiceInstitutionCreateModel effectiveEndDate(String effectiveEndDate) {
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * 制度生效结束时间
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-09-30 23:59:59", value = "制度生效结束时间")

  public String getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(String effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }


  public AlipayEbppInvoiceInstitutionCreateModel effectiveStartDate(String effectiveStartDate) {
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * 制度生效起始时间
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-09-10 00:00:00", value = "制度生效起始时间")

  public String getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }


  public AlipayEbppInvoiceInstitutionCreateModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123412341234", value = "企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceInstitutionCreateModel expenseType(String expenseType) {
    
    this.expenseType = expenseType;
    return this;
  }

   /**
   * 费用类型
   * @return expenseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MEAL", value = "费用类型")

  public String getExpenseType() {
    return expenseType;
  }


  public void setExpenseType(String expenseType) {
    this.expenseType = expenseType;
  }


  public AlipayEbppInvoiceInstitutionCreateModel institutionDesc(String institutionDesc) {
    
    this.institutionDesc = institutionDesc;
    return this;
  }

   /**
   * 制度描述
   * @return institutionDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "餐补制度", value = "制度描述")

  public String getInstitutionDesc() {
    return institutionDesc;
  }


  public void setInstitutionDesc(String institutionDesc) {
    this.institutionDesc = institutionDesc;
  }


  public AlipayEbppInvoiceInstitutionCreateModel institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * 制度名称
   * @return institutionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "费用制度", value = "制度名称")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  public AlipayEbppInvoiceInstitutionCreateModel issueRuleInfoList(List<IssueRuleInfo> issueRuleInfoList) {
    
    this.issueRuleInfoList = issueRuleInfoList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionCreateModel addIssueRuleInfoListItem(IssueRuleInfo issueRuleInfoListItem) {
    if (this.issueRuleInfoList == null) {
      this.issueRuleInfoList = new ArrayList<>();
    }
    this.issueRuleInfoList.add(issueRuleInfoListItem);
    return this;
  }

   /**
   * 发放规则列表
   * @return issueRuleInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发放规则列表")

  public List<IssueRuleInfo> getIssueRuleInfoList() {
    return issueRuleInfoList;
  }


  public void setIssueRuleInfoList(List<IssueRuleInfo> issueRuleInfoList) {
    this.issueRuleInfoList = issueRuleInfoList;
  }


  public AlipayEbppInvoiceInstitutionCreateModel sceneType(String sceneType) {
    
    this.sceneType = sceneType;
    return this;
  }

   /**
   * 因公场景
   * @return sceneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OVERTIME", value = "因公场景")

  public String getSceneType() {
    return sceneType;
  }


  public void setSceneType(String sceneType) {
    this.sceneType = sceneType;
  }


  public AlipayEbppInvoiceInstitutionCreateModel standardInfoList(List<StandardInfo> standardInfoList) {
    
    this.standardInfoList = standardInfoList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionCreateModel addStandardInfoListItem(StandardInfo standardInfoListItem) {
    if (this.standardInfoList == null) {
      this.standardInfoList = new ArrayList<>();
    }
    this.standardInfoList.add(standardInfoListItem);
    return this;
  }

   /**
   * 使用规则列表
   * @return standardInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "使用规则列表")

  public List<StandardInfo> getStandardInfoList() {
    return standardInfoList;
  }


  public void setStandardInfoList(List<StandardInfo> standardInfoList) {
    this.standardInfoList = standardInfoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceInstitutionCreateModel alipayEbppInvoiceInstitutionCreateModel = (AlipayEbppInvoiceInstitutionCreateModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceInstitutionCreateModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceInstitutionCreateModel.agreementNo) &&
        Objects.equals(this.consultMode, alipayEbppInvoiceInstitutionCreateModel.consultMode) &&
        Objects.equals(this.effectiveEndDate, alipayEbppInvoiceInstitutionCreateModel.effectiveEndDate) &&
        Objects.equals(this.effectiveStartDate, alipayEbppInvoiceInstitutionCreateModel.effectiveStartDate) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceInstitutionCreateModel.enterpriseId) &&
        Objects.equals(this.expenseType, alipayEbppInvoiceInstitutionCreateModel.expenseType) &&
        Objects.equals(this.institutionDesc, alipayEbppInvoiceInstitutionCreateModel.institutionDesc) &&
        Objects.equals(this.institutionName, alipayEbppInvoiceInstitutionCreateModel.institutionName) &&
        Objects.equals(this.issueRuleInfoList, alipayEbppInvoiceInstitutionCreateModel.issueRuleInfoList) &&
        Objects.equals(this.sceneType, alipayEbppInvoiceInstitutionCreateModel.sceneType) &&
        Objects.equals(this.standardInfoList, alipayEbppInvoiceInstitutionCreateModel.standardInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, consultMode, effectiveEndDate, effectiveStartDate, enterpriseId, expenseType, institutionDesc, institutionName, issueRuleInfoList, sceneType, standardInfoList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceInstitutionCreateModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    consultMode: ").append(toIndentedString(consultMode)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    expenseType: ").append(toIndentedString(expenseType)).append("\n");
    sb.append("    institutionDesc: ").append(toIndentedString(institutionDesc)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    issueRuleInfoList: ").append(toIndentedString(issueRuleInfoList)).append("\n");
    sb.append("    sceneType: ").append(toIndentedString(sceneType)).append("\n");
    sb.append("    standardInfoList: ").append(toIndentedString(standardInfoList)).append("\n");
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
    openapiFields.add("consult_mode");
    openapiFields.add("effective_end_date");
    openapiFields.add("effective_start_date");
    openapiFields.add("enterprise_id");
    openapiFields.add("expense_type");
    openapiFields.add("institution_desc");
    openapiFields.add("institution_name");
    openapiFields.add("issue_rule_info_list");
    openapiFields.add("scene_type");
    openapiFields.add("standard_info_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceInstitutionCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceInstitutionCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceInstitutionCreateModel is not found in the empty JSON string", AlipayEbppInvoiceInstitutionCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceInstitutionCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceInstitutionCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("consult_mode") != null && !jsonObj.get("consult_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consult_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consult_mode").toString()));
      }
      if (jsonObj.get("effective_end_date") != null && !jsonObj.get("effective_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_end_date").toString()));
      }
      if (jsonObj.get("effective_start_date") != null && !jsonObj.get("effective_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_start_date").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("expense_type") != null && !jsonObj.get("expense_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expense_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expense_type").toString()));
      }
      if (jsonObj.get("institution_desc") != null && !jsonObj.get("institution_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_desc").toString()));
      }
      if (jsonObj.get("institution_name") != null && !jsonObj.get("institution_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_name").toString()));
      }
      JsonArray jsonArrayissueRuleInfoList = jsonObj.getAsJsonArray("issue_rule_info_list");
      if (jsonArrayissueRuleInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("issue_rule_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `issue_rule_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("issue_rule_info_list").toString()));
        }

        // validate the optional field `issue_rule_info_list` (array)
        for (int i = 0; i < jsonArrayissueRuleInfoList.size(); i++) {
          IssueRuleInfo.validateJsonObject(jsonArrayissueRuleInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("scene_type") != null && !jsonObj.get("scene_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene_type").toString()));
      }
      JsonArray jsonArraystandardInfoList = jsonObj.getAsJsonArray("standard_info_list");
      if (jsonArraystandardInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("standard_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `standard_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("standard_info_list").toString()));
        }

        // validate the optional field `standard_info_list` (array)
        for (int i = 0; i < jsonArraystandardInfoList.size(); i++) {
          StandardInfo.validateJsonObject(jsonArraystandardInfoList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceInstitutionCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceInstitutionCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceInstitutionCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceInstitutionCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceInstitutionCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceInstitutionCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceInstitutionCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceInstitutionCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceInstitutionCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceInstitutionCreateModel
  */
  public static AlipayEbppInvoiceInstitutionCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceInstitutionCreateModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceInstitutionCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

