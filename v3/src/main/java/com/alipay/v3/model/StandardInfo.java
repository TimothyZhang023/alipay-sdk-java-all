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
import com.alipay.v3.model.AssetShareSourceInfo;
import com.alipay.v3.model.StandardConditionInfo;
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
 * StandardInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StandardInfo {
  public static final String SERIALIZED_NAME_ASSET_SHARE_SOURCE_INFO = "asset_share_source_info";
  @SerializedName(SERIALIZED_NAME_ASSET_SHARE_SOURCE_INFO)
  private AssetShareSourceInfo assetShareSourceInfo;

  public static final String SERIALIZED_NAME_CONSUME_MODE = "consume_mode";
  @SerializedName(SERIALIZED_NAME_CONSUME_MODE)
  private String consumeMode;

  public static final String SERIALIZED_NAME_EXPENSE_TYPE_SUB_CATEGORY = "expense_type_sub_category";
  @SerializedName(SERIALIZED_NAME_EXPENSE_TYPE_SUB_CATEGORY)
  private String expenseTypeSubCategory;

  public static final String SERIALIZED_NAME_OPEN_RULE_ID = "open_rule_id";
  @SerializedName(SERIALIZED_NAME_OPEN_RULE_ID)
  private String openRuleId;

  public static final String SERIALIZED_NAME_OUTER_SOURCE_ID = "outer_source_id";
  @SerializedName(SERIALIZED_NAME_OUTER_SOURCE_ID)
  private String outerSourceId;

  public static final String SERIALIZED_NAME_PAYMENT_POLICY = "payment_policy";
  @SerializedName(SERIALIZED_NAME_PAYMENT_POLICY)
  private String paymentPolicy;

  public static final String SERIALIZED_NAME_STANDARD_CONDITION_INFO_LIST = "standard_condition_info_list";
  @SerializedName(SERIALIZED_NAME_STANDARD_CONDITION_INFO_LIST)
  private List<StandardConditionInfo> standardConditionInfoList = null;

  public static final String SERIALIZED_NAME_STANDARD_DESC = "standard_desc";
  @SerializedName(SERIALIZED_NAME_STANDARD_DESC)
  private String standardDesc;

  public static final String SERIALIZED_NAME_STANDARD_ID = "standard_id";
  @SerializedName(SERIALIZED_NAME_STANDARD_ID)
  private String standardId;

  public static final String SERIALIZED_NAME_STANDARD_NAME = "standard_name";
  @SerializedName(SERIALIZED_NAME_STANDARD_NAME)
  private String standardName;

  public StandardInfo() { 
  }

  public StandardInfo assetShareSourceInfo(AssetShareSourceInfo assetShareSourceInfo) {
    
    this.assetShareSourceInfo = assetShareSourceInfo;
    return this;
  }

   /**
   * Get assetShareSourceInfo
   * @return assetShareSourceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetShareSourceInfo getAssetShareSourceInfo() {
    return assetShareSourceInfo;
  }


  public void setAssetShareSourceInfo(AssetShareSourceInfo assetShareSourceInfo) {
    this.assetShareSourceInfo = assetShareSourceInfo;
  }


  public StandardInfo consumeMode(String consumeMode) {
    
    this.consumeMode = consumeMode;
    return this;
  }

   /**
   * 消费模式，不填为默认模式，枚举值：COUPON_ONLY（仅支持点券） COUPON_AND_CAP（支持点券+余额） DEFAULT（默认模式） 点券：消费时找员工的点券，没有或者用完了不可付； 点券+余额：消费时找员工的点券，没有找员工的余额，没有或者用完了不可付。 默认：有给员工设置员工余额以员工余额为准，用完为止。否则只受规则里的限额和企业账户资金上限管控；
   * @return consumeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消费模式，不填为默认模式，枚举值：COUPON_ONLY（仅支持点券） COUPON_AND_CAP（支持点券+余额） DEFAULT（默认模式） 点券：消费时找员工的点券，没有或者用完了不可付； 点券+余额：消费时找员工的点券，没有找员工的余额，没有或者用完了不可付。 默认：有给员工设置员工余额以员工余额为准，用完为止。否则只受规则里的限额和企业账户资金上限管控；")

  public String getConsumeMode() {
    return consumeMode;
  }


  public void setConsumeMode(String consumeMode) {
    this.consumeMode = consumeMode;
  }


  public StandardInfo expenseTypeSubCategory(String expenseTypeSubCategory) {
    
    this.expenseTypeSubCategory = expenseTypeSubCategory;
    return this;
  }

   /**
   * 费用类型子类，当制度的费用类型为MEAL时，支持到店、外卖；当费用类型为非MEAL时，与费用类型保持一致
   * @return expenseTypeSubCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "费用类型子类，当制度的费用类型为MEAL时，支持到店、外卖；当费用类型为非MEAL时，与费用类型保持一致")

  public String getExpenseTypeSubCategory() {
    return expenseTypeSubCategory;
  }


  public void setExpenseTypeSubCategory(String expenseTypeSubCategory) {
    this.expenseTypeSubCategory = expenseTypeSubCategory;
  }


  public StandardInfo openRuleId(String openRuleId) {
    
    this.openRuleId = openRuleId;
    return this;
  }

   /**
   * 开票规则id，可通过接口alipay.ebpp.invoice.enterpriseconsume.enterpriseopenrule.create 创建并得到开票规则ID
   * @return openRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开票规则id，可通过接口alipay.ebpp.invoice.enterpriseconsume.enterpriseopenrule.create 创建并得到开票规则ID")

  public String getOpenRuleId() {
    return openRuleId;
  }


  public void setOpenRuleId(String openRuleId) {
    this.openRuleId = openRuleId;
  }


  public StandardInfo outerSourceId(String outerSourceId) {
    
    this.outerSourceId = outerSourceId;
    return this;
  }

   /**
   * 外部使用规则id，制度内使用规则该字段不允许重复
   * @return outerSourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "外部使用规则id，制度内使用规则该字段不允许重复")

  public String getOuterSourceId() {
    return outerSourceId;
  }


  public void setOuterSourceId(String outerSourceId) {
    this.outerSourceId = outerSourceId;
  }


  public StandardInfo paymentPolicy(String paymentPolicy) {
    
    this.paymentPolicy = paymentPolicy;
    return this;
  }

   /**
   * 支付策略 当笔消费金额大于规则可用余额时，用于控制支付策略，该字段缺省时采取因公账户和个人账户组合支付策略
   * @return paymentPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付策略 当笔消费金额大于规则可用余额时，用于控制支付策略，该字段缺省时采取因公账户和个人账户组合支付策略")

  public String getPaymentPolicy() {
    return paymentPolicy;
  }


  public void setPaymentPolicy(String paymentPolicy) {
    this.paymentPolicy = paymentPolicy;
  }


  public StandardInfo standardConditionInfoList(List<StandardConditionInfo> standardConditionInfoList) {
    
    this.standardConditionInfoList = standardConditionInfoList;
    return this;
  }

  public StandardInfo addStandardConditionInfoListItem(StandardConditionInfo standardConditionInfoListItem) {
    if (this.standardConditionInfoList == null) {
      this.standardConditionInfoList = new ArrayList<>();
    }
    this.standardConditionInfoList.add(standardConditionInfoListItem);
    return this;
  }

   /**
   * 使用规则条件列表
   * @return standardConditionInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "使用规则条件列表")

  public List<StandardConditionInfo> getStandardConditionInfoList() {
    return standardConditionInfoList;
  }


  public void setStandardConditionInfoList(List<StandardConditionInfo> standardConditionInfoList) {
    this.standardConditionInfoList = standardConditionInfoList;
  }


  public StandardInfo standardDesc(String standardDesc) {
    
    this.standardDesc = standardDesc;
    return this;
  }

   /**
   * 使用规则描述(敏感词校验)
   * @return standardDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "使用规则描述(敏感词校验)")

  public String getStandardDesc() {
    return standardDesc;
  }


  public void setStandardDesc(String standardDesc) {
    this.standardDesc = standardDesc;
  }


  public StandardInfo standardId(String standardId) {
    
    this.standardId = standardId;
    return this;
  }

   /**
   * 制度ID（创建使用规则时非必填）
   * @return standardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "制度ID（创建使用规则时非必填）")

  public String getStandardId() {
    return standardId;
  }


  public void setStandardId(String standardId) {
    this.standardId = standardId;
  }


  public StandardInfo standardName(String standardName) {
    
    this.standardName = standardName;
    return this;
  }

   /**
   * 规则名称
   * @return standardName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "规则名称")

  public String getStandardName() {
    return standardName;
  }


  public void setStandardName(String standardName) {
    this.standardName = standardName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardInfo standardInfo = (StandardInfo) o;
    return Objects.equals(this.assetShareSourceInfo, standardInfo.assetShareSourceInfo) &&
        Objects.equals(this.consumeMode, standardInfo.consumeMode) &&
        Objects.equals(this.expenseTypeSubCategory, standardInfo.expenseTypeSubCategory) &&
        Objects.equals(this.openRuleId, standardInfo.openRuleId) &&
        Objects.equals(this.outerSourceId, standardInfo.outerSourceId) &&
        Objects.equals(this.paymentPolicy, standardInfo.paymentPolicy) &&
        Objects.equals(this.standardConditionInfoList, standardInfo.standardConditionInfoList) &&
        Objects.equals(this.standardDesc, standardInfo.standardDesc) &&
        Objects.equals(this.standardId, standardInfo.standardId) &&
        Objects.equals(this.standardName, standardInfo.standardName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetShareSourceInfo, consumeMode, expenseTypeSubCategory, openRuleId, outerSourceId, paymentPolicy, standardConditionInfoList, standardDesc, standardId, standardName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardInfo {\n");
    sb.append("    assetShareSourceInfo: ").append(toIndentedString(assetShareSourceInfo)).append("\n");
    sb.append("    consumeMode: ").append(toIndentedString(consumeMode)).append("\n");
    sb.append("    expenseTypeSubCategory: ").append(toIndentedString(expenseTypeSubCategory)).append("\n");
    sb.append("    openRuleId: ").append(toIndentedString(openRuleId)).append("\n");
    sb.append("    outerSourceId: ").append(toIndentedString(outerSourceId)).append("\n");
    sb.append("    paymentPolicy: ").append(toIndentedString(paymentPolicy)).append("\n");
    sb.append("    standardConditionInfoList: ").append(toIndentedString(standardConditionInfoList)).append("\n");
    sb.append("    standardDesc: ").append(toIndentedString(standardDesc)).append("\n");
    sb.append("    standardId: ").append(toIndentedString(standardId)).append("\n");
    sb.append("    standardName: ").append(toIndentedString(standardName)).append("\n");
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
    openapiFields.add("asset_share_source_info");
    openapiFields.add("consume_mode");
    openapiFields.add("expense_type_sub_category");
    openapiFields.add("open_rule_id");
    openapiFields.add("outer_source_id");
    openapiFields.add("payment_policy");
    openapiFields.add("standard_condition_info_list");
    openapiFields.add("standard_desc");
    openapiFields.add("standard_id");
    openapiFields.add("standard_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StandardInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StandardInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StandardInfo is not found in the empty JSON string", StandardInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StandardInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StandardInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `asset_share_source_info`
      if (jsonObj.getAsJsonObject("asset_share_source_info") != null) {
        AssetShareSourceInfo.validateJsonObject(jsonObj.getAsJsonObject("asset_share_source_info"));
      }
      if (jsonObj.get("consume_mode") != null && !jsonObj.get("consume_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consume_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consume_mode").toString()));
      }
      if (jsonObj.get("expense_type_sub_category") != null && !jsonObj.get("expense_type_sub_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expense_type_sub_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expense_type_sub_category").toString()));
      }
      if (jsonObj.get("open_rule_id") != null && !jsonObj.get("open_rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_rule_id").toString()));
      }
      if (jsonObj.get("outer_source_id") != null && !jsonObj.get("outer_source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outer_source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outer_source_id").toString()));
      }
      if (jsonObj.get("payment_policy") != null && !jsonObj.get("payment_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_policy").toString()));
      }
      JsonArray jsonArraystandardConditionInfoList = jsonObj.getAsJsonArray("standard_condition_info_list");
      if (jsonArraystandardConditionInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("standard_condition_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `standard_condition_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("standard_condition_info_list").toString()));
        }

        // validate the optional field `standard_condition_info_list` (array)
        for (int i = 0; i < jsonArraystandardConditionInfoList.size(); i++) {
          StandardConditionInfo.validateJsonObject(jsonArraystandardConditionInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("standard_desc") != null && !jsonObj.get("standard_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_desc").toString()));
      }
      if (jsonObj.get("standard_id") != null && !jsonObj.get("standard_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_id").toString()));
      }
      if (jsonObj.get("standard_name") != null && !jsonObj.get("standard_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StandardInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StandardInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StandardInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StandardInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StandardInfo>() {
           @Override
           public void write(JsonWriter out, StandardInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StandardInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StandardInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StandardInfo
  * @throws IOException if the JSON string is invalid with respect to StandardInfo
  */
  public static StandardInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StandardInfo.class);
  }

 /**
  * Convert an instance of StandardInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

