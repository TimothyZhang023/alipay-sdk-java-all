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
import com.alipay.v3.model.AuthorizedRuleDTO;
import com.alipay.v3.model.JointAccountQuotaDTO;
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
 * AlipayFundJointaccountRuleModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundJointaccountRuleModifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_ACCOUNT_QUOTA = "account_quota";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_QUOTA)
  private List<JointAccountQuotaDTO> accountQuota = null;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_AUTHORIZED_RULE = "authorized_rule";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_RULE)
  private AuthorizedRuleDTO authorizedRule;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public AlipayFundJointaccountRuleModifyModel() { 
  }

  public AlipayFundJointaccountRuleModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 账本ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088402123951081", value = "账本ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayFundJointaccountRuleModifyModel accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * 账本名称
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "账本名称", value = "账本名称")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public AlipayFundJointaccountRuleModifyModel accountQuota(List<JointAccountQuotaDTO> accountQuota) {
    
    this.accountQuota = accountQuota;
    return this;
  }

  public AlipayFundJointaccountRuleModifyModel addAccountQuotaItem(JointAccountQuotaDTO accountQuotaItem) {
    if (this.accountQuota == null) {
      this.accountQuota = new ArrayList<>();
    }
    this.accountQuota.add(accountQuotaItem);
    return this;
  }

   /**
   * 账户额度
   * @return accountQuota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "账户额度")

  public List<JointAccountQuotaDTO> getAccountQuota() {
    return accountQuota;
  }


  public void setAccountQuota(List<JointAccountQuotaDTO> accountQuota) {
    this.accountQuota = accountQuota;
  }


  public AlipayFundJointaccountRuleModifyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088402124305476", value = "授权协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayFundJointaccountRuleModifyModel authorizedRule(AuthorizedRuleDTO authorizedRule) {
    
    this.authorizedRule = authorizedRule;
    return this;
  }

   /**
   * Get authorizedRule
   * @return authorizedRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthorizedRuleDTO getAuthorizedRule() {
    return authorizedRule;
  }


  public void setAuthorizedRule(AuthorizedRuleDTO authorizedRule) {
    this.authorizedRule = authorizedRule;
  }


  public AlipayFundJointaccountRuleModifyModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 场景码
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "场景码")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayFundJointaccountRuleModifyModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 产品码
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE_PAY", value = "产品码")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundJointaccountRuleModifyModel alipayFundJointaccountRuleModifyModel = (AlipayFundJointaccountRuleModifyModel) o;
    return Objects.equals(this.accountId, alipayFundJointaccountRuleModifyModel.accountId) &&
        Objects.equals(this.accountName, alipayFundJointaccountRuleModifyModel.accountName) &&
        Objects.equals(this.accountQuota, alipayFundJointaccountRuleModifyModel.accountQuota) &&
        Objects.equals(this.agreementNo, alipayFundJointaccountRuleModifyModel.agreementNo) &&
        Objects.equals(this.authorizedRule, alipayFundJointaccountRuleModifyModel.authorizedRule) &&
        Objects.equals(this.bizScene, alipayFundJointaccountRuleModifyModel.bizScene) &&
        Objects.equals(this.productCode, alipayFundJointaccountRuleModifyModel.productCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountQuota, agreementNo, authorizedRule, bizScene, productCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundJointaccountRuleModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountQuota: ").append(toIndentedString(accountQuota)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    authorizedRule: ").append(toIndentedString(authorizedRule)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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
    openapiFields.add("account_name");
    openapiFields.add("account_quota");
    openapiFields.add("agreement_no");
    openapiFields.add("authorized_rule");
    openapiFields.add("biz_scene");
    openapiFields.add("product_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundJointaccountRuleModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundJointaccountRuleModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundJointaccountRuleModifyModel is not found in the empty JSON string", AlipayFundJointaccountRuleModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundJointaccountRuleModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundJointaccountRuleModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("account_name") != null && !jsonObj.get("account_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_name").toString()));
      }
      JsonArray jsonArrayaccountQuota = jsonObj.getAsJsonArray("account_quota");
      if (jsonArrayaccountQuota != null) {
        // ensure the json data is an array
        if (!jsonObj.get("account_quota").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `account_quota` to be an array in the JSON string but got `%s`", jsonObj.get("account_quota").toString()));
        }

        // validate the optional field `account_quota` (array)
        for (int i = 0; i < jsonArrayaccountQuota.size(); i++) {
          JointAccountQuotaDTO.validateJsonObject(jsonArrayaccountQuota.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      // validate the optional field `authorized_rule`
      if (jsonObj.getAsJsonObject("authorized_rule") != null) {
        AuthorizedRuleDTO.validateJsonObject(jsonObj.getAsJsonObject("authorized_rule"));
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundJointaccountRuleModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundJointaccountRuleModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundJointaccountRuleModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundJointaccountRuleModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundJointaccountRuleModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundJointaccountRuleModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundJointaccountRuleModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundJointaccountRuleModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundJointaccountRuleModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundJointaccountRuleModifyModel
  */
  public static AlipayFundJointaccountRuleModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundJointaccountRuleModifyModel.class);
  }

 /**
  * Convert an instance of AlipayFundJointaccountRuleModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

