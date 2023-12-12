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
import com.alipay.v3.model.AmountTypeSyncData;
import com.alipay.v3.model.DiscountTypeSyncData;
import com.alipay.v3.model.TimesTypeSyncData;
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
 * ZhimaMerchantZmgoCumulateSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaMerchantZmgoCumulateSyncModel {
  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_AMOUNT_TYPE_SYNC_DATA = "amount_type_sync_data";
  @SerializedName(SERIALIZED_NAME_AMOUNT_TYPE_SYNC_DATA)
  private AmountTypeSyncData amountTypeSyncData;

  public static final String SERIALIZED_NAME_BIZ_ACTION = "biz_action";
  @SerializedName(SERIALIZED_NAME_BIZ_ACTION)
  private String bizAction;

  public static final String SERIALIZED_NAME_BIZ_TIME = "biz_time";
  @SerializedName(SERIALIZED_NAME_BIZ_TIME)
  private String bizTime;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_DISCOUNT_TYPE_SYNC_DATA = "discount_type_sync_data";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_TYPE_SYNC_DATA)
  private DiscountTypeSyncData discountTypeSyncData;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PROVIDER_PID = "provider_pid";
  @SerializedName(SERIALIZED_NAME_PROVIDER_PID)
  private String providerPid;

  public static final String SERIALIZED_NAME_REFER_OUT_BIZ_NO = "refer_out_biz_no";
  @SerializedName(SERIALIZED_NAME_REFER_OUT_BIZ_NO)
  private String referOutBizNo;

  public static final String SERIALIZED_NAME_SUB_BIZ_ACTION = "sub_biz_action";
  @SerializedName(SERIALIZED_NAME_SUB_BIZ_ACTION)
  private String subBizAction;

  public static final String SERIALIZED_NAME_TIMES_TYPE_SYNC_DATA = "times_type_sync_data";
  @SerializedName(SERIALIZED_NAME_TIMES_TYPE_SYNC_DATA)
  private TimesTypeSyncData timesTypeSyncData;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public ZhimaMerchantZmgoCumulateSyncModel() { 
  }

  public ZhimaMerchantZmgoCumulateSyncModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 芝麻go协议号，唯一标识一个芝麻go协议。
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20195108518085620000", value = "芝麻go协议号，唯一标识一个芝麻go协议。")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public ZhimaMerchantZmgoCumulateSyncModel amountTypeSyncData(AmountTypeSyncData amountTypeSyncData) {
    
    this.amountTypeSyncData = amountTypeSyncData;
    return this;
  }

   /**
   * Get amountTypeSyncData
   * @return amountTypeSyncData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AmountTypeSyncData getAmountTypeSyncData() {
    return amountTypeSyncData;
  }


  public void setAmountTypeSyncData(AmountTypeSyncData amountTypeSyncData) {
    this.amountTypeSyncData = amountTypeSyncData;
  }


  public ZhimaMerchantZmgoCumulateSyncModel bizAction(String bizAction) {
    
    this.bizAction = bizAction;
    return this;
  }

   /**
   * 数据回传的动作类型。枚举如下： * POSITIVE：正向回传，即订单金额累加，优惠累加，任务次数累加。 * REVERSE：逆向回传，即订单金额退款，优惠退款，任务次数回退。
   * @return bizAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "POSITIVE", value = "数据回传的动作类型。枚举如下： * POSITIVE：正向回传，即订单金额累加，优惠累加，任务次数累加。 * REVERSE：逆向回传，即订单金额退款，优惠退款，任务次数回退。")

  public String getBizAction() {
    return bizAction;
  }


  public void setBizAction(String bizAction) {
    this.bizAction = bizAction;
  }


  public ZhimaMerchantZmgoCumulateSyncModel bizTime(String bizTime) {
    
    this.bizTime = bizTime;
    return this;
  }

   /**
   * 回传数据发生的实际时间，包括：订单交易时间，优惠核销时间，以及任务完成时间。为必传入参。 如：用户在【2019-03-08 00:00:00】核销了一个红包，但是【2019-03-10 00:00:00】才进行数据回传，此时biz_time取值红包核销的时间，也就是【2019-03-08 00:00:00】。
   * @return bizTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-03-08 19:51:35", value = "回传数据发生的实际时间，包括：订单交易时间，优惠核销时间，以及任务完成时间。为必传入参。 如：用户在【2019-03-08 00:00:00】核销了一个红包，但是【2019-03-10 00:00:00】才进行数据回传，此时biz_time取值红包核销的时间，也就是【2019-03-08 00:00:00】。")

  public String getBizTime() {
    return bizTime;
  }


  public void setBizTime(String bizTime) {
    this.bizTime = bizTime;
  }


  public ZhimaMerchantZmgoCumulateSyncModel dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * 回传数据类型，枚举： TASK - 进度型，影响进度 DISCOUNT - 优惠型
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TASK", value = "回传数据类型，枚举： TASK - 进度型，影响进度 DISCOUNT - 优惠型")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public ZhimaMerchantZmgoCumulateSyncModel discountTypeSyncData(DiscountTypeSyncData discountTypeSyncData) {
    
    this.discountTypeSyncData = discountTypeSyncData;
    return this;
  }

   /**
   * Get discountTypeSyncData
   * @return discountTypeSyncData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiscountTypeSyncData getDiscountTypeSyncData() {
    return discountTypeSyncData;
  }


  public void setDiscountTypeSyncData(DiscountTypeSyncData discountTypeSyncData) {
    this.discountTypeSyncData = discountTypeSyncData;
  }


  public ZhimaMerchantZmgoCumulateSyncModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public ZhimaMerchantZmgoCumulateSyncModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务号，唯一标识一笔回传数据。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020081211223006150094012926289", value = "外部业务号，唯一标识一笔回传数据。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public ZhimaMerchantZmgoCumulateSyncModel providerPid(String providerPid) {
    
    this.providerPid = providerPid;
    return this;
  }

   /**
   * 数据回传的商户 ID，即和用户发生业务来往的 PID 主体。商户账号在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
   * @return providerPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088621805983504", value = "数据回传的商户 ID，即和用户发生业务来往的 PID 主体。商户账号在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。")

  public String getProviderPid() {
    return providerPid;
  }


  public void setProviderPid(String providerPid) {
    this.providerPid = providerPid;
  }


  public ZhimaMerchantZmgoCumulateSyncModel referOutBizNo(String referOutBizNo) {
    
    this.referOutBizNo = referOutBizNo;
    return this;
  }

   /**
   * 逆向对应的正向外部业务号。逆向场景为必传入参。也就是biz_action为REVERSE时为必传入参。 逆向时需通过此字段明确对应的正向的外部业务号。
   * @return referOutBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020081211223006150094012926289", value = "逆向对应的正向外部业务号。逆向场景为必传入参。也就是biz_action为REVERSE时为必传入参。 逆向时需通过此字段明确对应的正向的外部业务号。")

  public String getReferOutBizNo() {
    return referOutBizNo;
  }


  public void setReferOutBizNo(String referOutBizNo) {
    this.referOutBizNo = referOutBizNo;
  }


  public ZhimaMerchantZmgoCumulateSyncModel subBizAction(String subBizAction) {
    
    this.subBizAction = subBizAction;
    return this;
  }

   /**
   * 数据回传动作子类型，枚举值，为必传入参。 ADD - 新增数据 UPDATE - 修改数据 备注：UPDATE只能更新金额信息。
   * @return subBizAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ADD", value = "数据回传动作子类型，枚举值，为必传入参。 ADD - 新增数据 UPDATE - 修改数据 备注：UPDATE只能更新金额信息。")

  public String getSubBizAction() {
    return subBizAction;
  }


  public void setSubBizAction(String subBizAction) {
    this.subBizAction = subBizAction;
  }


  public ZhimaMerchantZmgoCumulateSyncModel timesTypeSyncData(TimesTypeSyncData timesTypeSyncData) {
    
    this.timesTypeSyncData = timesTypeSyncData;
    return this;
  }

   /**
   * Get timesTypeSyncData
   * @return timesTypeSyncData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimesTypeSyncData getTimesTypeSyncData() {
    return timesTypeSyncData;
  }


  public void setTimesTypeSyncData(TimesTypeSyncData timesTypeSyncData) {
    this.timesTypeSyncData = timesTypeSyncData;
  }


  public ZhimaMerchantZmgoCumulateSyncModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。 
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088602002015001", value = "用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。 ")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaMerchantZmgoCumulateSyncModel zhimaMerchantZmgoCumulateSyncModel = (ZhimaMerchantZmgoCumulateSyncModel) o;
    return Objects.equals(this.agreementId, zhimaMerchantZmgoCumulateSyncModel.agreementId) &&
        Objects.equals(this.amountTypeSyncData, zhimaMerchantZmgoCumulateSyncModel.amountTypeSyncData) &&
        Objects.equals(this.bizAction, zhimaMerchantZmgoCumulateSyncModel.bizAction) &&
        Objects.equals(this.bizTime, zhimaMerchantZmgoCumulateSyncModel.bizTime) &&
        Objects.equals(this.dataType, zhimaMerchantZmgoCumulateSyncModel.dataType) &&
        Objects.equals(this.discountTypeSyncData, zhimaMerchantZmgoCumulateSyncModel.discountTypeSyncData) &&
        Objects.equals(this.openId, zhimaMerchantZmgoCumulateSyncModel.openId) &&
        Objects.equals(this.outBizNo, zhimaMerchantZmgoCumulateSyncModel.outBizNo) &&
        Objects.equals(this.providerPid, zhimaMerchantZmgoCumulateSyncModel.providerPid) &&
        Objects.equals(this.referOutBizNo, zhimaMerchantZmgoCumulateSyncModel.referOutBizNo) &&
        Objects.equals(this.subBizAction, zhimaMerchantZmgoCumulateSyncModel.subBizAction) &&
        Objects.equals(this.timesTypeSyncData, zhimaMerchantZmgoCumulateSyncModel.timesTypeSyncData) &&
        Objects.equals(this.userId, zhimaMerchantZmgoCumulateSyncModel.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, amountTypeSyncData, bizAction, bizTime, dataType, discountTypeSyncData, openId, outBizNo, providerPid, referOutBizNo, subBizAction, timesTypeSyncData, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaMerchantZmgoCumulateSyncModel {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    amountTypeSyncData: ").append(toIndentedString(amountTypeSyncData)).append("\n");
    sb.append("    bizAction: ").append(toIndentedString(bizAction)).append("\n");
    sb.append("    bizTime: ").append(toIndentedString(bizTime)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    discountTypeSyncData: ").append(toIndentedString(discountTypeSyncData)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    providerPid: ").append(toIndentedString(providerPid)).append("\n");
    sb.append("    referOutBizNo: ").append(toIndentedString(referOutBizNo)).append("\n");
    sb.append("    subBizAction: ").append(toIndentedString(subBizAction)).append("\n");
    sb.append("    timesTypeSyncData: ").append(toIndentedString(timesTypeSyncData)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("agreement_id");
    openapiFields.add("amount_type_sync_data");
    openapiFields.add("biz_action");
    openapiFields.add("biz_time");
    openapiFields.add("data_type");
    openapiFields.add("discount_type_sync_data");
    openapiFields.add("open_id");
    openapiFields.add("out_biz_no");
    openapiFields.add("provider_pid");
    openapiFields.add("refer_out_biz_no");
    openapiFields.add("sub_biz_action");
    openapiFields.add("times_type_sync_data");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaMerchantZmgoCumulateSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaMerchantZmgoCumulateSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaMerchantZmgoCumulateSyncModel is not found in the empty JSON string", ZhimaMerchantZmgoCumulateSyncModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaMerchantZmgoCumulateSyncModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaMerchantZmgoCumulateSyncModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      // validate the optional field `amount_type_sync_data`
      if (jsonObj.getAsJsonObject("amount_type_sync_data") != null) {
        AmountTypeSyncData.validateJsonObject(jsonObj.getAsJsonObject("amount_type_sync_data"));
      }
      if (jsonObj.get("biz_action") != null && !jsonObj.get("biz_action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_action").toString()));
      }
      if (jsonObj.get("biz_time") != null && !jsonObj.get("biz_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_time").toString()));
      }
      if (jsonObj.get("data_type") != null && !jsonObj.get("data_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_type").toString()));
      }
      // validate the optional field `discount_type_sync_data`
      if (jsonObj.getAsJsonObject("discount_type_sync_data") != null) {
        DiscountTypeSyncData.validateJsonObject(jsonObj.getAsJsonObject("discount_type_sync_data"));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("provider_pid") != null && !jsonObj.get("provider_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider_pid").toString()));
      }
      if (jsonObj.get("refer_out_biz_no") != null && !jsonObj.get("refer_out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refer_out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refer_out_biz_no").toString()));
      }
      if (jsonObj.get("sub_biz_action") != null && !jsonObj.get("sub_biz_action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_biz_action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_biz_action").toString()));
      }
      // validate the optional field `times_type_sync_data`
      if (jsonObj.getAsJsonObject("times_type_sync_data") != null) {
        TimesTypeSyncData.validateJsonObject(jsonObj.getAsJsonObject("times_type_sync_data"));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaMerchantZmgoCumulateSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaMerchantZmgoCumulateSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaMerchantZmgoCumulateSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaMerchantZmgoCumulateSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaMerchantZmgoCumulateSyncModel>() {
           @Override
           public void write(JsonWriter out, ZhimaMerchantZmgoCumulateSyncModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaMerchantZmgoCumulateSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaMerchantZmgoCumulateSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaMerchantZmgoCumulateSyncModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaMerchantZmgoCumulateSyncModel
  */
  public static ZhimaMerchantZmgoCumulateSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaMerchantZmgoCumulateSyncModel.class);
  }

 /**
  * Convert an instance of ZhimaMerchantZmgoCumulateSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

