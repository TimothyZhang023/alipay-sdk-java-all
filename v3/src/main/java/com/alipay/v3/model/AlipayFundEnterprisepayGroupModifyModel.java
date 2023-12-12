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
import com.alipay.v3.model.FundExtInfo;
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
 * AlipayFundEnterprisepayGroupModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundEnterprisepayGroupModifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_FUND_EXT_INFO = "fund_ext_info";
  @SerializedName(SERIALIZED_NAME_FUND_EXT_INFO)
  private FundExtInfo fundExtInfo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPERATION_TYPE_LIST = "operation_type_list";
  @SerializedName(SERIALIZED_NAME_OPERATION_TYPE_LIST)
  private List<String> operationTypeList = null;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public AlipayFundEnterprisepayGroupModifyModel() { 
  }

  public AlipayFundEnterprisepayGroupModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业签约账户ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088888888", value = "企业签约账户ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayFundEnterprisepayGroupModifyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 平台和企业的三方授权协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1231231321323", value = "平台和企业的三方授权协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayFundEnterprisepayGroupModifyModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 场景码，联系支付宝分配
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ANT_GROUP", value = "场景码，联系支付宝分配")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayFundEnterprisepayGroupModifyModel fundExtInfo(FundExtInfo fundExtInfo) {
    
    this.fundExtInfo = fundExtInfo;
    return this;
  }

   /**
   * Get fundExtInfo
   * @return fundExtInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FundExtInfo getFundExtInfo() {
    return fundExtInfo;
  }


  public void setFundExtInfo(FundExtInfo fundExtInfo) {
    this.fundExtInfo = fundExtInfo;
  }


  public AlipayFundEnterprisepayGroupModifyModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 群组名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "后勤组", value = "群组名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AlipayFundEnterprisepayGroupModifyModel operationTypeList(List<String> operationTypeList) {
    
    this.operationTypeList = operationTypeList;
    return this;
  }

  public AlipayFundEnterprisepayGroupModifyModel addOperationTypeListItem(String operationTypeListItem) {
    if (this.operationTypeList == null) {
      this.operationTypeList = new ArrayList<>();
    }
    this.operationTypeList.add(operationTypeListItem);
    return this;
  }

   /**
   * 更新操作类型：多个时逗号分隔 NAME-群组名称 FUND-出资信息 字段不传时，默认全量更新
   * @return operationTypeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"NAME\",\"FUND\"]", value = "更新操作类型：多个时逗号分隔 NAME-群组名称 FUND-出资信息 字段不传时，默认全量更新")

  public List<String> getOperationTypeList() {
    return operationTypeList;
  }


  public void setOperationTypeList(List<String> operationTypeList) {
    this.operationTypeList = operationTypeList;
  }


  public AlipayFundEnterprisepayGroupModifyModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12123123", value = "外部业务号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayFundEnterprisepayGroupModifyModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 产品码，默认值 ENTERPRISE_PAY
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE_PAY", value = "产品码，默认值 ENTERPRISE_PAY")

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
    AlipayFundEnterprisepayGroupModifyModel alipayFundEnterprisepayGroupModifyModel = (AlipayFundEnterprisepayGroupModifyModel) o;
    return Objects.equals(this.accountId, alipayFundEnterprisepayGroupModifyModel.accountId) &&
        Objects.equals(this.agreementNo, alipayFundEnterprisepayGroupModifyModel.agreementNo) &&
        Objects.equals(this.bizScene, alipayFundEnterprisepayGroupModifyModel.bizScene) &&
        Objects.equals(this.fundExtInfo, alipayFundEnterprisepayGroupModifyModel.fundExtInfo) &&
        Objects.equals(this.name, alipayFundEnterprisepayGroupModifyModel.name) &&
        Objects.equals(this.operationTypeList, alipayFundEnterprisepayGroupModifyModel.operationTypeList) &&
        Objects.equals(this.outBizNo, alipayFundEnterprisepayGroupModifyModel.outBizNo) &&
        Objects.equals(this.productCode, alipayFundEnterprisepayGroupModifyModel.productCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, bizScene, fundExtInfo, name, operationTypeList, outBizNo, productCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundEnterprisepayGroupModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    fundExtInfo: ").append(toIndentedString(fundExtInfo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationTypeList: ").append(toIndentedString(operationTypeList)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
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
    openapiFields.add("agreement_no");
    openapiFields.add("biz_scene");
    openapiFields.add("fund_ext_info");
    openapiFields.add("name");
    openapiFields.add("operation_type_list");
    openapiFields.add("out_biz_no");
    openapiFields.add("product_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundEnterprisepayGroupModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundEnterprisepayGroupModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundEnterprisepayGroupModifyModel is not found in the empty JSON string", AlipayFundEnterprisepayGroupModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundEnterprisepayGroupModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundEnterprisepayGroupModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      // validate the optional field `fund_ext_info`
      if (jsonObj.getAsJsonObject("fund_ext_info") != null) {
        FundExtInfo.validateJsonObject(jsonObj.getAsJsonObject("fund_ext_info"));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("operation_type_list") != null && !jsonObj.get("operation_type_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_type_list` to be an array in the JSON string but got `%s`", jsonObj.get("operation_type_list").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundEnterprisepayGroupModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundEnterprisepayGroupModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundEnterprisepayGroupModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundEnterprisepayGroupModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundEnterprisepayGroupModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundEnterprisepayGroupModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundEnterprisepayGroupModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundEnterprisepayGroupModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundEnterprisepayGroupModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundEnterprisepayGroupModifyModel
  */
  public static AlipayFundEnterprisepayGroupModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundEnterprisepayGroupModifyModel.class);
  }

 /**
  * Convert an instance of AlipayFundEnterprisepayGroupModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

