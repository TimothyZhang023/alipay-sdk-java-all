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
 * AlipayEbppInvoiceInstitutionExpenseruleDeleteModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceInstitutionExpenseruleDeleteModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_STANDARD_ID_LIST = "standard_id_list";
  @SerializedName(SERIALIZED_NAME_STANDARD_ID_LIST)
  private List<String> standardIdList = null;

  public AlipayEbppInvoiceInstitutionExpenseruleDeleteModel() { 
  }

  public AlipayEbppInvoiceInstitutionExpenseruleDeleteModel accountId(String accountId) {
    
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


  public AlipayEbppInvoiceInstitutionExpenseruleDeleteModel agreementNo(String agreementNo) {
    
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


  public AlipayEbppInvoiceInstitutionExpenseruleDeleteModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleDeleteModel institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * 制度id
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022070600152617780000000001", value = "制度id")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleDeleteModel standardIdList(List<String> standardIdList) {
    
    this.standardIdList = standardIdList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionExpenseruleDeleteModel addStandardIdListItem(String standardIdListItem) {
    if (this.standardIdList == null) {
      this.standardIdList = new ArrayList<>();
    }
    this.standardIdList.add(standardIdListItem);
    return this;
  }

   /**
   * 删除的使用规则id列表
   * @return standardIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2021062800152601350000001468\"]", value = "删除的使用规则id列表")

  public List<String> getStandardIdList() {
    return standardIdList;
  }


  public void setStandardIdList(List<String> standardIdList) {
    this.standardIdList = standardIdList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceInstitutionExpenseruleDeleteModel alipayEbppInvoiceInstitutionExpenseruleDeleteModel = (AlipayEbppInvoiceInstitutionExpenseruleDeleteModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceInstitutionExpenseruleDeleteModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceInstitutionExpenseruleDeleteModel.agreementNo) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceInstitutionExpenseruleDeleteModel.enterpriseId) &&
        Objects.equals(this.institutionId, alipayEbppInvoiceInstitutionExpenseruleDeleteModel.institutionId) &&
        Objects.equals(this.standardIdList, alipayEbppInvoiceInstitutionExpenseruleDeleteModel.standardIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, enterpriseId, institutionId, standardIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceInstitutionExpenseruleDeleteModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    standardIdList: ").append(toIndentedString(standardIdList)).append("\n");
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
    openapiFields.add("institution_id");
    openapiFields.add("standard_id_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceInstitutionExpenseruleDeleteModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceInstitutionExpenseruleDeleteModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceInstitutionExpenseruleDeleteModel is not found in the empty JSON string", AlipayEbppInvoiceInstitutionExpenseruleDeleteModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceInstitutionExpenseruleDeleteModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceInstitutionExpenseruleDeleteModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("institution_id") != null && !jsonObj.get("institution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("standard_id_list") != null && !jsonObj.get("standard_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("standard_id_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceInstitutionExpenseruleDeleteModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceInstitutionExpenseruleDeleteModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceInstitutionExpenseruleDeleteModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceInstitutionExpenseruleDeleteModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceInstitutionExpenseruleDeleteModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceInstitutionExpenseruleDeleteModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceInstitutionExpenseruleDeleteModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceInstitutionExpenseruleDeleteModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceInstitutionExpenseruleDeleteModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceInstitutionExpenseruleDeleteModel
  */
  public static AlipayEbppInvoiceInstitutionExpenseruleDeleteModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceInstitutionExpenseruleDeleteModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceInstitutionExpenseruleDeleteModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

