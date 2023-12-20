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
import com.alipay.v3.model.JointAccountMemberDTO;
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
 * AlipayFundJointaccountMemberBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundJointaccountMemberBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_MEMBER_LIST = "member_list";
  @SerializedName(SERIALIZED_NAME_MEMBER_LIST)
  private List<JointAccountMemberDTO> memberList = null;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private String pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private String totalCount;

  public static final String SERIALIZED_NAME_TOTAL_PAGE_COUNT = "total_page_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE_COUNT)
  private String totalPageCount;

  public AlipayFundJointaccountMemberBatchqueryResponseModel() { 
  }

  public AlipayFundJointaccountMemberBatchqueryResponseModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088900976746215", value = "共同账户ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayFundJointaccountMemberBatchqueryResponseModel memberList(List<JointAccountMemberDTO> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public AlipayFundJointaccountMemberBatchqueryResponseModel addMemberListItem(JointAccountMemberDTO memberListItem) {
    if (this.memberList == null) {
      this.memberList = new ArrayList<>();
    }
    this.memberList.add(memberListItem);
    return this;
  }

   /**
   * 员工列表
   * @return memberList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "员工列表")

  public List<JointAccountMemberDTO> getMemberList() {
    return memberList;
  }


  public void setMemberList(List<JointAccountMemberDTO> memberList) {
    this.memberList = memberList;
  }


  public AlipayFundJointaccountMemberBatchqueryResponseModel pageNum(String pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 当前页数，使用游标方式查询时，没有该字段
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页数，使用游标方式查询时，没有该字段")

  public String getPageNum() {
    return pageNum;
  }


  public void setPageNum(String pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayFundJointaccountMemberBatchqueryResponseModel pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 当前记录数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前记录数")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayFundJointaccountMemberBatchqueryResponseModel totalCount(String totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 总条数
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "总条数")

  public String getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(String totalCount) {
    this.totalCount = totalCount;
  }


  public AlipayFundJointaccountMemberBatchqueryResponseModel totalPageCount(String totalPageCount) {
    
    this.totalPageCount = totalPageCount;
    return this;
  }

   /**
   * 总页数
   * @return totalPageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "总页数")

  public String getTotalPageCount() {
    return totalPageCount;
  }


  public void setTotalPageCount(String totalPageCount) {
    this.totalPageCount = totalPageCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundJointaccountMemberBatchqueryResponseModel alipayFundJointaccountMemberBatchqueryResponseModel = (AlipayFundJointaccountMemberBatchqueryResponseModel) o;
    return Objects.equals(this.accountId, alipayFundJointaccountMemberBatchqueryResponseModel.accountId) &&
        Objects.equals(this.memberList, alipayFundJointaccountMemberBatchqueryResponseModel.memberList) &&
        Objects.equals(this.pageNum, alipayFundJointaccountMemberBatchqueryResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayFundJointaccountMemberBatchqueryResponseModel.pageSize) &&
        Objects.equals(this.totalCount, alipayFundJointaccountMemberBatchqueryResponseModel.totalCount) &&
        Objects.equals(this.totalPageCount, alipayFundJointaccountMemberBatchqueryResponseModel.totalPageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, memberList, pageNum, pageSize, totalCount, totalPageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundJointaccountMemberBatchqueryResponseModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    memberList: ").append(toIndentedString(memberList)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalPageCount: ").append(toIndentedString(totalPageCount)).append("\n");
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
    openapiFields.add("member_list");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("total_count");
    openapiFields.add("total_page_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundJointaccountMemberBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundJointaccountMemberBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundJointaccountMemberBatchqueryResponseModel is not found in the empty JSON string", AlipayFundJointaccountMemberBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundJointaccountMemberBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundJointaccountMemberBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      JsonArray jsonArraymemberList = jsonObj.getAsJsonArray("member_list");
      if (jsonArraymemberList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("member_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `member_list` to be an array in the JSON string but got `%s`", jsonObj.get("member_list").toString()));
        }

        // validate the optional field `member_list` (array)
        for (int i = 0; i < jsonArraymemberList.size(); i++) {
          JointAccountMemberDTO.validateJsonObject(jsonArraymemberList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("page_num") != null && !jsonObj.get("page_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_num").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
      if (jsonObj.get("total_count") != null && !jsonObj.get("total_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_count").toString()));
      }
      if (jsonObj.get("total_page_count") != null && !jsonObj.get("total_page_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_page_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_page_count").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundJointaccountMemberBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundJointaccountMemberBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundJointaccountMemberBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundJointaccountMemberBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundJointaccountMemberBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundJointaccountMemberBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundJointaccountMemberBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundJointaccountMemberBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundJointaccountMemberBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundJointaccountMemberBatchqueryResponseModel
  */
  public static AlipayFundJointaccountMemberBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundJointaccountMemberBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundJointaccountMemberBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

