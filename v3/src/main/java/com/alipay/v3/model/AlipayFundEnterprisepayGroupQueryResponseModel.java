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
 * AlipayFundEnterprisepayGroupQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundEnterprisepayGroupQueryResponseModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_FUND_GROUP_ID = "fund_group_id";
  @SerializedName(SERIALIZED_NAME_FUND_GROUP_ID)
  private String fundGroupId;

  public static final String SERIALIZED_NAME_FUND_IDENTITY = "fund_identity";
  @SerializedName(SERIALIZED_NAME_FUND_IDENTITY)
  private String fundIdentity;

  public static final String SERIALIZED_NAME_GROUP_NAME = "group_name";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_OUT_GROUP_ID = "out_group_id";
  @SerializedName(SERIALIZED_NAME_OUT_GROUP_ID)
  private String outGroupId;

  public AlipayFundEnterprisepayGroupQueryResponseModel() { 
  }

  public AlipayFundEnterprisepayGroupQueryResponseModel accountId(String accountId) {
    
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


  public AlipayFundEnterprisepayGroupQueryResponseModel fundGroupId(String fundGroupId) {
    
    this.fundGroupId = fundGroupId;
    return this;
  }

   /**
   * 内部群组号
   * @return fundGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088888888", value = "内部群组号")

  public String getFundGroupId() {
    return fundGroupId;
  }


  public void setFundGroupId(String fundGroupId) {
    this.fundGroupId = fundGroupId;
  }


  public AlipayFundEnterprisepayGroupQueryResponseModel fundIdentity(String fundIdentity) {
    
    this.fundIdentity = fundIdentity;
    return this;
  }

   /**
   * 该群所对应的出资主体账号
   * @return fundIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20888888", value = "该群所对应的出资主体账号")

  public String getFundIdentity() {
    return fundIdentity;
  }


  public void setFundIdentity(String fundIdentity) {
    this.fundIdentity = fundIdentity;
  }


  public AlipayFundEnterprisepayGroupQueryResponseModel groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * 群组名称
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "群组", value = "群组名称")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public AlipayFundEnterprisepayGroupQueryResponseModel outGroupId(String outGroupId) {
    
    this.outGroupId = outGroupId;
    return this;
  }

   /**
   * 外部群组号
   * @return outGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1231231", value = "外部群组号")

  public String getOutGroupId() {
    return outGroupId;
  }


  public void setOutGroupId(String outGroupId) {
    this.outGroupId = outGroupId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundEnterprisepayGroupQueryResponseModel alipayFundEnterprisepayGroupQueryResponseModel = (AlipayFundEnterprisepayGroupQueryResponseModel) o;
    return Objects.equals(this.accountId, alipayFundEnterprisepayGroupQueryResponseModel.accountId) &&
        Objects.equals(this.fundGroupId, alipayFundEnterprisepayGroupQueryResponseModel.fundGroupId) &&
        Objects.equals(this.fundIdentity, alipayFundEnterprisepayGroupQueryResponseModel.fundIdentity) &&
        Objects.equals(this.groupName, alipayFundEnterprisepayGroupQueryResponseModel.groupName) &&
        Objects.equals(this.outGroupId, alipayFundEnterprisepayGroupQueryResponseModel.outGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, fundGroupId, fundIdentity, groupName, outGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundEnterprisepayGroupQueryResponseModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    fundGroupId: ").append(toIndentedString(fundGroupId)).append("\n");
    sb.append("    fundIdentity: ").append(toIndentedString(fundIdentity)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    outGroupId: ").append(toIndentedString(outGroupId)).append("\n");
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
    openapiFields.add("fund_group_id");
    openapiFields.add("fund_identity");
    openapiFields.add("group_name");
    openapiFields.add("out_group_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundEnterprisepayGroupQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundEnterprisepayGroupQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundEnterprisepayGroupQueryResponseModel is not found in the empty JSON string", AlipayFundEnterprisepayGroupQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundEnterprisepayGroupQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundEnterprisepayGroupQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("fund_group_id") != null && !jsonObj.get("fund_group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fund_group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fund_group_id").toString()));
      }
      if (jsonObj.get("fund_identity") != null && !jsonObj.get("fund_identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fund_identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fund_identity").toString()));
      }
      if (jsonObj.get("group_name") != null && !jsonObj.get("group_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_name").toString()));
      }
      if (jsonObj.get("out_group_id") != null && !jsonObj.get("out_group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_group_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundEnterprisepayGroupQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundEnterprisepayGroupQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundEnterprisepayGroupQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundEnterprisepayGroupQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundEnterprisepayGroupQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundEnterprisepayGroupQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundEnterprisepayGroupQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundEnterprisepayGroupQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundEnterprisepayGroupQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundEnterprisepayGroupQueryResponseModel
  */
  public static AlipayFundEnterprisepayGroupQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundEnterprisepayGroupQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundEnterprisepayGroupQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

