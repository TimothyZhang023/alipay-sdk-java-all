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
 * AlipayFundAuthOrderUnfreezeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundAuthOrderUnfreezeModel {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_AUTH_NO = "auth_no";
  @SerializedName(SERIALIZED_NAME_AUTH_NO)
  private String authNo;

  public static final String SERIALIZED_NAME_EXTRA_PARAM = "extra_param";
  @SerializedName(SERIALIZED_NAME_EXTRA_PARAM)
  private String extraParam;

  public static final String SERIALIZED_NAME_NOTIFY_URL = "notify_url";
  @SerializedName(SERIALIZED_NAME_NOTIFY_URL)
  private String notifyUrl;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  public AlipayFundAuthOrderUnfreezeModel() { 
  }

  public AlipayFundAuthOrderUnfreezeModel amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 本次操作解冻的金额，单位为：元（人民币），精确到小数点后两位。 取值范围：[0.01,100000000.00]
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20.11", value = "本次操作解冻的金额，单位为：元（人民币），精确到小数点后两位。 取值范围：[0.01,100000000.00]")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AlipayFundAuthOrderUnfreezeModel authNo(String authNo) {
    
    this.authNo = authNo;
    return this;
  }

   /**
   * 支付宝资金授权订单号。
   * @return authNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016101210002001810258115912", value = "支付宝资金授权订单号。")

  public String getAuthNo() {
    return authNo;
  }


  public void setAuthNo(String authNo) {
    this.authNo = authNo;
  }


  public AlipayFundAuthOrderUnfreezeModel extraParam(String extraParam) {
    
    this.extraParam = extraParam;
    return this;
  }

   /**
   * 解冻扩展信息。map&lt;string, string&gt;的json格式，目前支持如下key： unfreezeBizInfo：由芝麻消费，当前支持value如下： \&quot;bizComplete\&quot;:\&quot;true\&quot;——标识本次解冻用户已履约，true表示信用单履约完结
   * @return extraParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"unfreezeBizInfo\": \"{\\\"bizComplete\\\":\\\"true\\\"}\"}", value = "解冻扩展信息。map<string, string>的json格式，目前支持如下key： unfreezeBizInfo：由芝麻消费，当前支持value如下： \"bizComplete\":\"true\"——标识本次解冻用户已履约，true表示信用单履约完结")

  public String getExtraParam() {
    return extraParam;
  }


  public void setExtraParam(String extraParam) {
    this.extraParam = extraParam;
  }


  public AlipayFundAuthOrderUnfreezeModel notifyUrl(String notifyUrl) {
    
    this.notifyUrl = notifyUrl;
    return this;
  }

   /**
   * 通知地址
   * @return notifyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "通知地址")

  public String getNotifyUrl() {
    return notifyUrl;
  }


  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }


  public AlipayFundAuthOrderUnfreezeModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 解冻请求流水号。 如果是针对同一笔授权单不同的解冻请求，如第一次解冻1元，第二次解冻2元，则解冻请求流水号必须不重复； 如果是针对同一笔解冻请求的多次发起，则需要保证每次发起，解冻请求流水号和解冻金额都相同
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016101200104001110081001", value = "解冻请求流水号。 如果是针对同一笔授权单不同的解冻请求，如第一次解冻1元，第二次解冻2元，则解冻请求流水号必须不重复； 如果是针对同一笔解冻请求的多次发起，则需要保证每次发起，解冻请求流水号和解冻金额都相同")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayFundAuthOrderUnfreezeModel remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 商户对本次解冻操作的附言描述
   * @return remark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014-05期解冻200.00元", value = "商户对本次解冻操作的附言描述")

  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundAuthOrderUnfreezeModel alipayFundAuthOrderUnfreezeModel = (AlipayFundAuthOrderUnfreezeModel) o;
    return Objects.equals(this.amount, alipayFundAuthOrderUnfreezeModel.amount) &&
        Objects.equals(this.authNo, alipayFundAuthOrderUnfreezeModel.authNo) &&
        Objects.equals(this.extraParam, alipayFundAuthOrderUnfreezeModel.extraParam) &&
        Objects.equals(this.notifyUrl, alipayFundAuthOrderUnfreezeModel.notifyUrl) &&
        Objects.equals(this.outRequestNo, alipayFundAuthOrderUnfreezeModel.outRequestNo) &&
        Objects.equals(this.remark, alipayFundAuthOrderUnfreezeModel.remark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, authNo, extraParam, notifyUrl, outRequestNo, remark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundAuthOrderUnfreezeModel {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    authNo: ").append(toIndentedString(authNo)).append("\n");
    sb.append("    extraParam: ").append(toIndentedString(extraParam)).append("\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
    openapiFields.add("auth_no");
    openapiFields.add("extra_param");
    openapiFields.add("notify_url");
    openapiFields.add("out_request_no");
    openapiFields.add("remark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundAuthOrderUnfreezeModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundAuthOrderUnfreezeModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundAuthOrderUnfreezeModel is not found in the empty JSON string", AlipayFundAuthOrderUnfreezeModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundAuthOrderUnfreezeModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundAuthOrderUnfreezeModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("auth_no") != null && !jsonObj.get("auth_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_no").toString()));
      }
      if (jsonObj.get("extra_param") != null && !jsonObj.get("extra_param").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extra_param` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extra_param").toString()));
      }
      if (jsonObj.get("notify_url") != null && !jsonObj.get("notify_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_url").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundAuthOrderUnfreezeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundAuthOrderUnfreezeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundAuthOrderUnfreezeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundAuthOrderUnfreezeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundAuthOrderUnfreezeModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundAuthOrderUnfreezeModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundAuthOrderUnfreezeModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundAuthOrderUnfreezeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundAuthOrderUnfreezeModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundAuthOrderUnfreezeModel
  */
  public static AlipayFundAuthOrderUnfreezeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundAuthOrderUnfreezeModel.class);
  }

 /**
  * Convert an instance of AlipayFundAuthOrderUnfreezeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

