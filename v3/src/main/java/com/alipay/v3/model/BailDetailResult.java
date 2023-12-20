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
 * BailDetailResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BailDetailResult {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_BAIL_TYPE = "bail_type";
  @SerializedName(SERIALIZED_NAME_BAIL_TYPE)
  private String bailType;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private String balance;

  public static final String SERIALIZED_NAME_BIZ_DESC = "biz_desc";
  @SerializedName(SERIALIZED_NAME_BIZ_DESC)
  private String bizDesc;

  public static final String SERIALIZED_NAME_BIZ_ORIG_NO = "biz_orig_no";
  @SerializedName(SERIALIZED_NAME_BIZ_ORIG_NO)
  private String bizOrigNo;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_TRANS_DT = "trans_dt";
  @SerializedName(SERIALIZED_NAME_TRANS_DT)
  private String transDt;

  public static final String SERIALIZED_NAME_TRANS_LOG_ID = "trans_log_id";
  @SerializedName(SERIALIZED_NAME_TRANS_LOG_ID)
  private String transLogId;

  public BailDetailResult() { 
  }

  public BailDetailResult amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 保证金收支金额
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "保证金收支金额")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public BailDetailResult bailType(String bailType) {
    
    this.bailType = bailType;
    return this;
  }

   /**
   * 保证金类型描述，仅供参考
   * @return bailType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "天猫保证金", value = "保证金类型描述，仅供参考")

  public String getBailType() {
    return bailType;
  }


  public void setBailType(String bailType) {
    this.bailType = bailType;
  }


  public BailDetailResult balance(String balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 本次操作后的保证金余额。字段数据展示为\&quot;--\&quot;，表明数据暂未更新，请稍等1分钟后重试。
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.00", value = "本次操作后的保证金余额。字段数据展示为\"--\"，表明数据暂未更新，请稍等1分钟后重试。")

  public String getBalance() {
    return balance;
  }


  public void setBalance(String balance) {
    this.balance = balance;
  }


  public BailDetailResult bizDesc(String bizDesc) {
    
    this.bizDesc = bizDesc;
    return this;
  }

   /**
   * 业务描述，资金收支对应的详细业务场景信息
   * @return bizDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "余额账户迁入", value = "业务描述，资金收支对应的详细业务场景信息")

  public String getBizDesc() {
    return bizDesc;
  }


  public void setBizDesc(String bizDesc) {
    this.bizDesc = bizDesc;
  }


  public BailDetailResult bizOrigNo(String bizOrigNo) {
    
    this.bizOrigNo = bizOrigNo;
    return this;
  }

   /**
   * 业务基础订单号，资金收支对应的原始业务订单唯一识别编号
   * @return bizOrigNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1***", value = "业务基础订单号，资金收支对应的原始业务订单唯一识别编号")

  public String getBizOrigNo() {
    return bizOrigNo;
  }


  public void setBizOrigNo(String bizOrigNo) {
    this.bizOrigNo = bizOrigNo;
  }


  public BailDetailResult memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 保证金说明
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "保证金冻结", value = "保证金说明")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public BailDetailResult transDt(String transDt) {
    
    this.transDt = transDt;
    return this;
  }

   /**
   * 业务发生时间
   * @return transDt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01 00:00:00", value = "业务发生时间")

  public String getTransDt() {
    return transDt;
  }


  public void setTransDt(String transDt) {
    this.transDt = transDt;
  }


  public BailDetailResult transLogId(String transLogId) {
    
    this.transLogId = transLogId;
    return this;
  }

   /**
   * 保证金业务流水号
   * @return transLogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190101***", value = "保证金业务流水号")

  public String getTransLogId() {
    return transLogId;
  }


  public void setTransLogId(String transLogId) {
    this.transLogId = transLogId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BailDetailResult bailDetailResult = (BailDetailResult) o;
    return Objects.equals(this.amount, bailDetailResult.amount) &&
        Objects.equals(this.bailType, bailDetailResult.bailType) &&
        Objects.equals(this.balance, bailDetailResult.balance) &&
        Objects.equals(this.bizDesc, bailDetailResult.bizDesc) &&
        Objects.equals(this.bizOrigNo, bailDetailResult.bizOrigNo) &&
        Objects.equals(this.memo, bailDetailResult.memo) &&
        Objects.equals(this.transDt, bailDetailResult.transDt) &&
        Objects.equals(this.transLogId, bailDetailResult.transLogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bailType, balance, bizDesc, bizOrigNo, memo, transDt, transLogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BailDetailResult {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bailType: ").append(toIndentedString(bailType)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    bizDesc: ").append(toIndentedString(bizDesc)).append("\n");
    sb.append("    bizOrigNo: ").append(toIndentedString(bizOrigNo)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    transDt: ").append(toIndentedString(transDt)).append("\n");
    sb.append("    transLogId: ").append(toIndentedString(transLogId)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("bail_type");
    openapiFields.add("balance");
    openapiFields.add("biz_desc");
    openapiFields.add("biz_orig_no");
    openapiFields.add("memo");
    openapiFields.add("trans_dt");
    openapiFields.add("trans_log_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BailDetailResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BailDetailResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BailDetailResult is not found in the empty JSON string", BailDetailResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BailDetailResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BailDetailResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("bail_type") != null && !jsonObj.get("bail_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bail_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bail_type").toString()));
      }
      if (jsonObj.get("balance") != null && !jsonObj.get("balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balance").toString()));
      }
      if (jsonObj.get("biz_desc") != null && !jsonObj.get("biz_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_desc").toString()));
      }
      if (jsonObj.get("biz_orig_no") != null && !jsonObj.get("biz_orig_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_orig_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_orig_no").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("trans_dt") != null && !jsonObj.get("trans_dt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_dt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_dt").toString()));
      }
      if (jsonObj.get("trans_log_id") != null && !jsonObj.get("trans_log_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_log_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_log_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BailDetailResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BailDetailResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BailDetailResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BailDetailResult.class));

       return (TypeAdapter<T>) new TypeAdapter<BailDetailResult>() {
           @Override
           public void write(JsonWriter out, BailDetailResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BailDetailResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BailDetailResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BailDetailResult
  * @throws IOException if the JSON string is invalid with respect to BailDetailResult
  */
  public static BailDetailResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BailDetailResult.class);
  }

 /**
  * Convert an instance of BailDetailResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

