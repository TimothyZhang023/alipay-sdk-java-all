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
import com.alipay.v3.model.EnterpriseOpenRuleRecordInfo;
import com.alipay.v3.model.EnterpriseOpenRuleRelationInfo;
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
 * EnterpriseOpenRuleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnterpriseOpenRuleInfo {
  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_ENTERPRISE_OPEN_RULE_RECORD_INFO_LIST = "enterprise_open_rule_record_info_list";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_OPEN_RULE_RECORD_INFO_LIST)
  private List<EnterpriseOpenRuleRecordInfo> enterpriseOpenRuleRecordInfoList = null;

  public static final String SERIALIZED_NAME_ENTERPRISE_OPEN_RULE_RELATION_INFO_LIST = "enterprise_open_rule_relation_info_list";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_OPEN_RULE_RELATION_INFO_LIST)
  private List<EnterpriseOpenRuleRelationInfo> enterpriseOpenRuleRelationInfoList = null;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_INVOICE_RULE_ID = "invoice_rule_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_RULE_ID)
  private String invoiceRuleId;

  public static final String SERIALIZED_NAME_INVOICE_RULE_NAME = "invoice_rule_name";
  @SerializedName(SERIALIZED_NAME_INVOICE_RULE_NAME)
  private String invoiceRuleName;

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_SELLER_TYPE = "seller_type";
  @SerializedName(SERIALIZED_NAME_SELLER_TYPE)
  private String sellerType;

  public EnterpriseOpenRuleInfo() { 
  }

  public EnterpriseOpenRuleInfo enterpriseId(String enterpriseId) {
    
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


  public EnterpriseOpenRuleInfo enterpriseOpenRuleRecordInfoList(List<EnterpriseOpenRuleRecordInfo> enterpriseOpenRuleRecordInfoList) {
    
    this.enterpriseOpenRuleRecordInfoList = enterpriseOpenRuleRecordInfoList;
    return this;
  }

  public EnterpriseOpenRuleInfo addEnterpriseOpenRuleRecordInfoListItem(EnterpriseOpenRuleRecordInfo enterpriseOpenRuleRecordInfoListItem) {
    if (this.enterpriseOpenRuleRecordInfoList == null) {
      this.enterpriseOpenRuleRecordInfoList = new ArrayList<>();
    }
    this.enterpriseOpenRuleRecordInfoList.add(enterpriseOpenRuleRecordInfoListItem);
    return this;
  }

   /**
   * 当前生效和下次生效的开票规则记录
   * @return enterpriseOpenRuleRecordInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "当前生效和下次生效的开票规则记录")

  public List<EnterpriseOpenRuleRecordInfo> getEnterpriseOpenRuleRecordInfoList() {
    return enterpriseOpenRuleRecordInfoList;
  }


  public void setEnterpriseOpenRuleRecordInfoList(List<EnterpriseOpenRuleRecordInfo> enterpriseOpenRuleRecordInfoList) {
    this.enterpriseOpenRuleRecordInfoList = enterpriseOpenRuleRecordInfoList;
  }


  public EnterpriseOpenRuleInfo enterpriseOpenRuleRelationInfoList(List<EnterpriseOpenRuleRelationInfo> enterpriseOpenRuleRelationInfoList) {
    
    this.enterpriseOpenRuleRelationInfoList = enterpriseOpenRuleRelationInfoList;
    return this;
  }

  public EnterpriseOpenRuleInfo addEnterpriseOpenRuleRelationInfoListItem(EnterpriseOpenRuleRelationInfo enterpriseOpenRuleRelationInfoListItem) {
    if (this.enterpriseOpenRuleRelationInfoList == null) {
      this.enterpriseOpenRuleRelationInfoList = new ArrayList<>();
    }
    this.enterpriseOpenRuleRelationInfoList.add(enterpriseOpenRuleRelationInfoListItem);
    return this;
  }

   /**
   * 开票规则绑定关系
   * @return enterpriseOpenRuleRelationInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开票规则绑定关系")

  public List<EnterpriseOpenRuleRelationInfo> getEnterpriseOpenRuleRelationInfoList() {
    return enterpriseOpenRuleRelationInfoList;
  }


  public void setEnterpriseOpenRuleRelationInfoList(List<EnterpriseOpenRuleRelationInfo> enterpriseOpenRuleRelationInfoList) {
    this.enterpriseOpenRuleRelationInfoList = enterpriseOpenRuleRelationInfoList;
  }


  public EnterpriseOpenRuleInfo gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-27 00:00:00", value = "创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public EnterpriseOpenRuleInfo gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 修改时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-27 00:00:00", value = "修改时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public EnterpriseOpenRuleInfo invoiceRuleId(String invoiceRuleId) {
    
    this.invoiceRuleId = invoiceRuleId;
    return this;
  }

   /**
   * 开票规则ID
   * @return invoiceRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021032900152710950000000001", value = "开票规则ID")

  public String getInvoiceRuleId() {
    return invoiceRuleId;
  }


  public void setInvoiceRuleId(String invoiceRuleId) {
    this.invoiceRuleId = invoiceRuleId;
  }


  public EnterpriseOpenRuleInfo invoiceRuleName(String invoiceRuleName) {
    
    this.invoiceRuleName = invoiceRuleName;
    return this;
  }

   /**
   * 开票规则名称
   * @return invoiceRuleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "开票规则测试1", value = "开票规则名称")

  public String getInvoiceRuleName() {
    return invoiceRuleName;
  }


  public void setInvoiceRuleName(String invoiceRuleName) {
    this.invoiceRuleName = invoiceRuleName;
  }


  public EnterpriseOpenRuleInfo ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * 所有者ID（企业情况下即为企业ID）
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "所有者ID（企业情况下即为企业ID）")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public EnterpriseOpenRuleInfo sellerType(String sellerType) {
    
    this.sellerType = sellerType;
    return this;
  }

   /**
   * 销方类型：TP开票、商户开票、商户优先 枚举定义：MERCHANT（商户）、TP（TP）
   * @return sellerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TP", value = "销方类型：TP开票、商户开票、商户优先 枚举定义：MERCHANT（商户）、TP（TP）")

  public String getSellerType() {
    return sellerType;
  }


  public void setSellerType(String sellerType) {
    this.sellerType = sellerType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseOpenRuleInfo enterpriseOpenRuleInfo = (EnterpriseOpenRuleInfo) o;
    return Objects.equals(this.enterpriseId, enterpriseOpenRuleInfo.enterpriseId) &&
        Objects.equals(this.enterpriseOpenRuleRecordInfoList, enterpriseOpenRuleInfo.enterpriseOpenRuleRecordInfoList) &&
        Objects.equals(this.enterpriseOpenRuleRelationInfoList, enterpriseOpenRuleInfo.enterpriseOpenRuleRelationInfoList) &&
        Objects.equals(this.gmtCreate, enterpriseOpenRuleInfo.gmtCreate) &&
        Objects.equals(this.gmtModified, enterpriseOpenRuleInfo.gmtModified) &&
        Objects.equals(this.invoiceRuleId, enterpriseOpenRuleInfo.invoiceRuleId) &&
        Objects.equals(this.invoiceRuleName, enterpriseOpenRuleInfo.invoiceRuleName) &&
        Objects.equals(this.ownerId, enterpriseOpenRuleInfo.ownerId) &&
        Objects.equals(this.sellerType, enterpriseOpenRuleInfo.sellerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterpriseId, enterpriseOpenRuleRecordInfoList, enterpriseOpenRuleRelationInfoList, gmtCreate, gmtModified, invoiceRuleId, invoiceRuleName, ownerId, sellerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseOpenRuleInfo {\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    enterpriseOpenRuleRecordInfoList: ").append(toIndentedString(enterpriseOpenRuleRecordInfoList)).append("\n");
    sb.append("    enterpriseOpenRuleRelationInfoList: ").append(toIndentedString(enterpriseOpenRuleRelationInfoList)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    invoiceRuleId: ").append(toIndentedString(invoiceRuleId)).append("\n");
    sb.append("    invoiceRuleName: ").append(toIndentedString(invoiceRuleName)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    sellerType: ").append(toIndentedString(sellerType)).append("\n");
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
    openapiFields.add("enterprise_id");
    openapiFields.add("enterprise_open_rule_record_info_list");
    openapiFields.add("enterprise_open_rule_relation_info_list");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("invoice_rule_id");
    openapiFields.add("invoice_rule_name");
    openapiFields.add("owner_id");
    openapiFields.add("seller_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EnterpriseOpenRuleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EnterpriseOpenRuleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnterpriseOpenRuleInfo is not found in the empty JSON string", EnterpriseOpenRuleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EnterpriseOpenRuleInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnterpriseOpenRuleInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      JsonArray jsonArrayenterpriseOpenRuleRecordInfoList = jsonObj.getAsJsonArray("enterprise_open_rule_record_info_list");
      if (jsonArrayenterpriseOpenRuleRecordInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("enterprise_open_rule_record_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `enterprise_open_rule_record_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("enterprise_open_rule_record_info_list").toString()));
        }

        // validate the optional field `enterprise_open_rule_record_info_list` (array)
        for (int i = 0; i < jsonArrayenterpriseOpenRuleRecordInfoList.size(); i++) {
          EnterpriseOpenRuleRecordInfo.validateJsonObject(jsonArrayenterpriseOpenRuleRecordInfoList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayenterpriseOpenRuleRelationInfoList = jsonObj.getAsJsonArray("enterprise_open_rule_relation_info_list");
      if (jsonArrayenterpriseOpenRuleRelationInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("enterprise_open_rule_relation_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `enterprise_open_rule_relation_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("enterprise_open_rule_relation_info_list").toString()));
        }

        // validate the optional field `enterprise_open_rule_relation_info_list` (array)
        for (int i = 0; i < jsonArrayenterpriseOpenRuleRelationInfoList.size(); i++) {
          EnterpriseOpenRuleRelationInfo.validateJsonObject(jsonArrayenterpriseOpenRuleRelationInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("invoice_rule_id") != null && !jsonObj.get("invoice_rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_rule_id").toString()));
      }
      if (jsonObj.get("invoice_rule_name") != null && !jsonObj.get("invoice_rule_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_rule_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_rule_name").toString()));
      }
      if (jsonObj.get("owner_id") != null && !jsonObj.get("owner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_id").toString()));
      }
      if (jsonObj.get("seller_type") != null && !jsonObj.get("seller_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seller_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seller_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseOpenRuleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseOpenRuleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseOpenRuleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseOpenRuleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseOpenRuleInfo>() {
           @Override
           public void write(JsonWriter out, EnterpriseOpenRuleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseOpenRuleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseOpenRuleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseOpenRuleInfo
  * @throws IOException if the JSON string is invalid with respect to EnterpriseOpenRuleInfo
  */
  public static EnterpriseOpenRuleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseOpenRuleInfo.class);
  }

 /**
  * Convert an instance of EnterpriseOpenRuleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

