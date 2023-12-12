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
 * AlipayDataBillEreceiptApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayDataBillEreceiptApplyModel {
  public static final String SERIALIZED_NAME_BILL_USER_ID = "bill_user_id";
  @SerializedName(SERIALIZED_NAME_BILL_USER_ID)
  private String billUserId;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AlipayDataBillEreceiptApplyModel() { 
  }

  public AlipayDataBillEreceiptApplyModel billUserId(String billUserId) {
    
    this.billUserId = billUserId;
    return this;
  }

   /**
   * 授权商户pid。需调用方获取商户授权，才可使用。
   * @return billUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088********9999", value = "授权商户pid。需调用方获取商户授权，才可使用。")

  public String getBillUserId() {
    return billUserId;
  }


  public void setBillUserId(String billUserId) {
    this.billUserId = billUserId;
  }


  public AlipayDataBillEreceiptApplyModel key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * 根据不同业务类型，传入不同参数。 格式如下： * ACCOUNT_LOG_DETAIL - 传入账务流水号，示例：117007*********9151 * ACCOUNT_FLOW_DETAIL - 传入流水日期区间示例：20220301-20220331 * FUND_DETAIL - 传入资金单据号，示例：2022051511007***************0731 * ACCOUNT_LOG_SUM_DAILY - 传入日期，示例：2022-01-01 * ACCOUNT_LOG_SUM_MONTHLY - 传入月份，示例：2022-01
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020xxx", value = "根据不同业务类型，传入不同参数。 格式如下： * ACCOUNT_LOG_DETAIL - 传入账务流水号，示例：117007*********9151 * ACCOUNT_FLOW_DETAIL - 传入流水日期区间示例：20220301-20220331 * FUND_DETAIL - 传入资金单据号，示例：2022051511007***************0731 * ACCOUNT_LOG_SUM_DAILY - 传入日期，示例：2022-01-01 * ACCOUNT_LOG_SUM_MONTHLY - 传入月份，示例：2022-01")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public AlipayDataBillEreceiptApplyModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 申请的类型。可传入： * ACCOUNT_LOG_DETAIL - 余额收支证明 * ACCOUNT_FLOW_DETAIL - 余额收支流水证明 * FUND_DETAIL - 转入转出收支证明 * ACCOUNT_LOG_SUM_DAILY - 收支汇总证明（日汇总） * ACCOUNT_LOG_SUM_MONTHLY - 收支汇总证明（月汇总）
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FUND_DETAIL", value = "申请的类型。可传入： * ACCOUNT_LOG_DETAIL - 余额收支证明 * ACCOUNT_FLOW_DETAIL - 余额收支流水证明 * FUND_DETAIL - 转入转出收支证明 * ACCOUNT_LOG_SUM_DAILY - 收支汇总证明（日汇总） * ACCOUNT_LOG_SUM_MONTHLY - 收支汇总证明（月汇总）")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayDataBillEreceiptApplyModel alipayDataBillEreceiptApplyModel = (AlipayDataBillEreceiptApplyModel) o;
    return Objects.equals(this.billUserId, alipayDataBillEreceiptApplyModel.billUserId) &&
        Objects.equals(this.key, alipayDataBillEreceiptApplyModel.key) &&
        Objects.equals(this.type, alipayDataBillEreceiptApplyModel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billUserId, key, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayDataBillEreceiptApplyModel {\n");
    sb.append("    billUserId: ").append(toIndentedString(billUserId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("bill_user_id");
    openapiFields.add("key");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayDataBillEreceiptApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayDataBillEreceiptApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayDataBillEreceiptApplyModel is not found in the empty JSON string", AlipayDataBillEreceiptApplyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayDataBillEreceiptApplyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayDataBillEreceiptApplyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("bill_user_id") != null && !jsonObj.get("bill_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_user_id").toString()));
      }
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayDataBillEreceiptApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayDataBillEreceiptApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayDataBillEreceiptApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayDataBillEreceiptApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayDataBillEreceiptApplyModel>() {
           @Override
           public void write(JsonWriter out, AlipayDataBillEreceiptApplyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayDataBillEreceiptApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayDataBillEreceiptApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayDataBillEreceiptApplyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayDataBillEreceiptApplyModel
  */
  public static AlipayDataBillEreceiptApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayDataBillEreceiptApplyModel.class);
  }

 /**
  * Convert an instance of AlipayDataBillEreceiptApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

