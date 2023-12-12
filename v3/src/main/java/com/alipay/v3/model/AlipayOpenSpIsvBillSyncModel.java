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
 * AlipayOpenSpIsvBillSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpIsvBillSyncModel {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_GENERATE_TIME = "generate_time";
  @SerializedName(SERIALIZED_NAME_GENERATE_TIME)
  private String generateTime;

  public static final String SERIALIZED_NAME_ITEM_CODE = "item_code";
  @SerializedName(SERIALIZED_NAME_ITEM_CODE)
  private String itemCode;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PAY_TIME = "pay_time";
  @SerializedName(SERIALIZED_NAME_PAY_TIME)
  private String payTime;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_PROMOTOR_PID = "promotor_pid";
  @SerializedName(SERIALIZED_NAME_PROMOTOR_PID)
  private String promotorPid;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUB_PROMOTOR_PID = "sub_promotor_pid";
  @SerializedName(SERIALIZED_NAME_SUB_PROMOTOR_PID)
  private String subPromotorPid;

  public AlipayOpenSpIsvBillSyncModel() { 
  }

  public AlipayOpenSpIsvBillSyncModel endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 账单结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-11-10", value = "账单结束时间")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AlipayOpenSpIsvBillSyncModel generateTime(String generateTime) {
    
    this.generateTime = generateTime;
    return this;
  }

   /**
   * 出账时间，回传出账信息时，必须传递
   * @return generateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-14 00:00:00", value = "出账时间，回传出账信息时，必须传递")

  public String getGenerateTime() {
    return generateTime;
  }


  public void setGenerateTime(String generateTime) {
    this.generateTime = generateTime;
  }


  public AlipayOpenSpIsvBillSyncModel itemCode(String itemCode) {
    
    this.itemCode = itemCode;
    return this;
  }

   /**
   * 服务优选商品编码
   * @return itemCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SS010301000000001234", value = "服务优选商品编码")

  public String getItemCode() {
    return itemCode;
  }


  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }


  public AlipayOpenSpIsvBillSyncModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务号，传isv系统生成的账单号，需要保证唯一
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021000000000", value = "外部业务号，传isv系统生成的账单号，需要保证唯一")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayOpenSpIsvBillSyncModel payTime(String payTime) {
    
    this.payTime = payTime;
    return this;
  }

   /**
   * 账单支付时间，回传支付数时，必须传递
   * @return payTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-14 00:00:00", value = "账单支付时间，回传支付数时，必须传递")

  public String getPayTime() {
    return payTime;
  }


  public void setPayTime(String payTime) {
    this.payTime = payTime;
  }


  public AlipayOpenSpIsvBillSyncModel price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * 账单金额，这里填写的是整数，单位为分，比如1元，那么输入100
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "账单金额，这里填写的是整数，单位为分，比如1元，那么输入100")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public AlipayOpenSpIsvBillSyncModel promotorPid(String promotorPid) {
    
    this.promotorPid = promotorPid;
    return this;
  }

   /**
   * 推广服务商(S2)pid
   * @return promotorPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301912341234", value = "推广服务商(S2)pid")

  public String getPromotorPid() {
    return promotorPid;
  }


  public void setPromotorPid(String promotorPid) {
    this.promotorPid = promotorPid;
  }


  public AlipayOpenSpIsvBillSyncModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 账单开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-10", value = "账单开始时间")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AlipayOpenSpIsvBillSyncModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * GENERATE_BILL代表”已出账“，PAID_BILL代表”已支付“，选择这两者之一
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GENERATE_BILL", value = "GENERATE_BILL代表”已出账“，PAID_BILL代表”已支付“，选择这两者之一")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayOpenSpIsvBillSyncModel subPromotorPid(String subPromotorPid) {
    
    this.subPromotorPid = subPromotorPid;
    return this;
  }

   /**
   * S1回传的S2的操作员工子账号，如果是子账号操作，请回传
   * @return subPromotorPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20211011000000", value = "S1回传的S2的操作员工子账号，如果是子账号操作，请回传")

  public String getSubPromotorPid() {
    return subPromotorPid;
  }


  public void setSubPromotorPid(String subPromotorPid) {
    this.subPromotorPid = subPromotorPid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSpIsvBillSyncModel alipayOpenSpIsvBillSyncModel = (AlipayOpenSpIsvBillSyncModel) o;
    return Objects.equals(this.endTime, alipayOpenSpIsvBillSyncModel.endTime) &&
        Objects.equals(this.generateTime, alipayOpenSpIsvBillSyncModel.generateTime) &&
        Objects.equals(this.itemCode, alipayOpenSpIsvBillSyncModel.itemCode) &&
        Objects.equals(this.outBizNo, alipayOpenSpIsvBillSyncModel.outBizNo) &&
        Objects.equals(this.payTime, alipayOpenSpIsvBillSyncModel.payTime) &&
        Objects.equals(this.price, alipayOpenSpIsvBillSyncModel.price) &&
        Objects.equals(this.promotorPid, alipayOpenSpIsvBillSyncModel.promotorPid) &&
        Objects.equals(this.startTime, alipayOpenSpIsvBillSyncModel.startTime) &&
        Objects.equals(this.status, alipayOpenSpIsvBillSyncModel.status) &&
        Objects.equals(this.subPromotorPid, alipayOpenSpIsvBillSyncModel.subPromotorPid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, generateTime, itemCode, outBizNo, payTime, price, promotorPid, startTime, status, subPromotorPid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpIsvBillSyncModel {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    generateTime: ").append(toIndentedString(generateTime)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    payTime: ").append(toIndentedString(payTime)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    promotorPid: ").append(toIndentedString(promotorPid)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subPromotorPid: ").append(toIndentedString(subPromotorPid)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("generate_time");
    openapiFields.add("item_code");
    openapiFields.add("out_biz_no");
    openapiFields.add("pay_time");
    openapiFields.add("price");
    openapiFields.add("promotor_pid");
    openapiFields.add("start_time");
    openapiFields.add("status");
    openapiFields.add("sub_promotor_pid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpIsvBillSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpIsvBillSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpIsvBillSyncModel is not found in the empty JSON string", AlipayOpenSpIsvBillSyncModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSpIsvBillSyncModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSpIsvBillSyncModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("generate_time") != null && !jsonObj.get("generate_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generate_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generate_time").toString()));
      }
      if (jsonObj.get("item_code") != null && !jsonObj.get("item_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_code").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("pay_time") != null && !jsonObj.get("pay_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_time").toString()));
      }
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if (jsonObj.get("promotor_pid") != null && !jsonObj.get("promotor_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotor_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promotor_pid").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("sub_promotor_pid") != null && !jsonObj.get("sub_promotor_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_promotor_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_promotor_pid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpIsvBillSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpIsvBillSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpIsvBillSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpIsvBillSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpIsvBillSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpIsvBillSyncModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSpIsvBillSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSpIsvBillSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpIsvBillSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpIsvBillSyncModel
  */
  public static AlipayOpenSpIsvBillSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpIsvBillSyncModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpIsvBillSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

