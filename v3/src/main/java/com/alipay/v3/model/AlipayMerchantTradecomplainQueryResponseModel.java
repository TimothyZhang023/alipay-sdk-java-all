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
import com.alipay.v3.model.ReplyRecordResponse;
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
 * AlipayMerchantTradecomplainQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantTradecomplainQueryResponseModel {
  public static final String SERIALIZED_NAME_COMPLAIN_EVENT_ID = "complain_event_id";
  @SerializedName(SERIALIZED_NAME_COMPLAIN_EVENT_ID)
  private String complainEventId;

  public static final String SERIALIZED_NAME_COMPLAIN_REASON = "complain_reason";
  @SerializedName(SERIALIZED_NAME_COMPLAIN_REASON)
  private String complainReason;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_FINISHED = "gmt_finished";
  @SerializedName(SERIALIZED_NAME_GMT_FINISHED)
  private String gmtFinished;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<String> images = null;

  public static final String SERIALIZED_NAME_LEAF_CATEGORY_NAME = "leaf_category_name";
  @SerializedName(SERIALIZED_NAME_LEAF_CATEGORY_NAME)
  private String leafCategoryName;

  public static final String SERIALIZED_NAME_MERCHANT_ORDER_NO = "merchant_order_no";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ORDER_NO)
  private String merchantOrderNo;

  public static final String SERIALIZED_NAME_PHONE_NO = "phone_no";
  @SerializedName(SERIALIZED_NAME_PHONE_NO)
  private String phoneNo;

  public static final String SERIALIZED_NAME_REPLY_DETAIL_INFOS = "reply_detail_infos";
  @SerializedName(SERIALIZED_NAME_REPLY_DETAIL_INFOS)
  private List<ReplyRecordResponse> replyDetailInfos = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public static final String SERIALIZED_NAME_TRADE_AMOUNT = "trade_amount";
  @SerializedName(SERIALIZED_NAME_TRADE_AMOUNT)
  private String tradeAmount;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayMerchantTradecomplainQueryResponseModel() { 
  }

  public AlipayMerchantTradecomplainQueryResponseModel complainEventId(String complainEventId) {
    
    this.complainEventId = complainEventId;
    return this;
  }

   /**
   * 支付宝侧投诉单号
   * @return complainEventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020092300102000000001459758", value = "支付宝侧投诉单号")

  public String getComplainEventId() {
    return complainEventId;
  }


  public void setComplainEventId(String complainEventId) {
    this.complainEventId = complainEventId;
  }


  public AlipayMerchantTradecomplainQueryResponseModel complainReason(String complainReason) {
    
    this.complainReason = complainReason;
    return this;
  }

   /**
   * 用户投诉原因
   * @return complainReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "重复扣款", value = "用户投诉原因")

  public String getComplainReason() {
    return complainReason;
  }


  public void setComplainReason(String complainReason) {
    this.complainReason = complainReason;
  }


  public AlipayMerchantTradecomplainQueryResponseModel content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 用户投诉内容
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "已经扣除了我的钱，为什么再次扣款？？？", value = "用户投诉内容")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public AlipayMerchantTradecomplainQueryResponseModel gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 投诉单创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-02-14 14:23:12", value = "投诉单创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public AlipayMerchantTradecomplainQueryResponseModel gmtFinished(String gmtFinished) {
    
    this.gmtFinished = gmtFinished;
    return this;
  }

   /**
   * 投诉单完结时间
   * @return gmtFinished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-02-14 14:23:12", value = "投诉单完结时间")

  public String getGmtFinished() {
    return gmtFinished;
  }


  public void setGmtFinished(String gmtFinished) {
    this.gmtFinished = gmtFinished;
  }


  public AlipayMerchantTradecomplainQueryResponseModel gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 投诉单修改时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-02-14 14:23:12", value = "投诉单修改时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public AlipayMerchantTradecomplainQueryResponseModel images(List<String> images) {
    
    this.images = images;
    return this;
  }

  public AlipayMerchantTradecomplainQueryResponseModel addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * 投诉图片
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"http://mdn.alipay.com/wsdk/img?fileid=A*ME4GQq2j-5oAAAAAAAAAAAAAAQAAAQ&amp;t=83fed12ef006ebcd8df04dfe79faad6c&amp;bi=openpunsh&amp;ts=0&amp;zoom=original\"]", value = "投诉图片")

  public List<String> getImages() {
    return images;
  }


  public void setImages(List<String> images) {
    this.images = images;
  }


  public AlipayMerchantTradecomplainQueryResponseModel leafCategoryName(String leafCategoryName) {
    
    this.leafCategoryName = leafCategoryName;
    return this;
  }

   /**
   * 用户投诉诉求
   * @return leafCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "我要退款", value = "用户投诉诉求")

  public String getLeafCategoryName() {
    return leafCategoryName;
  }


  public void setLeafCategoryName(String leafCategoryName) {
    this.leafCategoryName = leafCategoryName;
  }


  public AlipayMerchantTradecomplainQueryResponseModel merchantOrderNo(String merchantOrderNo) {
    
    this.merchantOrderNo = merchantOrderNo;
    return this;
  }

   /**
   * 商家订单号
   * @return merchantOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tp1234567899", value = "商家订单号")

  public String getMerchantOrderNo() {
    return merchantOrderNo;
  }


  public void setMerchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
  }


  public AlipayMerchantTradecomplainQueryResponseModel phoneNo(String phoneNo) {
    
    this.phoneNo = phoneNo;
    return this;
  }

   /**
   * 投诉人电话号码
   * @return phoneNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13656767876", value = "投诉人电话号码")

  public String getPhoneNo() {
    return phoneNo;
  }


  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }


  public AlipayMerchantTradecomplainQueryResponseModel replyDetailInfos(List<ReplyRecordResponse> replyDetailInfos) {
    
    this.replyDetailInfos = replyDetailInfos;
    return this;
  }

  public AlipayMerchantTradecomplainQueryResponseModel addReplyDetailInfosItem(ReplyRecordResponse replyDetailInfosItem) {
    if (this.replyDetailInfos == null) {
      this.replyDetailInfos = new ArrayList<>();
    }
    this.replyDetailInfos.add(replyDetailInfosItem);
    return this;
  }

   /**
   * 用户与商家之间的协商记录
   * @return replyDetailInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户与商家之间的协商记录")

  public List<ReplyRecordResponse> getReplyDetailInfos() {
    return replyDetailInfos;
  }


  public void setReplyDetailInfos(List<ReplyRecordResponse> replyDetailInfos) {
    this.replyDetailInfos = replyDetailInfos;
  }


  public AlipayMerchantTradecomplainQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 状态  待处理：MERCHANT_PROCESSING  已处理：MERCHANT_FEEDBACKED  投诉完结：FINISHED  投诉关闭：CANCELLED  客服处理中：PLATFORM_PROCESSING  客服处理完结：PLATFORM_FINISH  投诉关闭：CLOSED
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MERCHANT_PROCESSING", value = "状态  待处理：MERCHANT_PROCESSING  已处理：MERCHANT_FEEDBACKED  投诉完结：FINISHED  投诉关闭：CANCELLED  客服处理中：PLATFORM_PROCESSING  客服处理完结：PLATFORM_FINISH  投诉关闭：CLOSED")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayMerchantTradecomplainQueryResponseModel targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 应用id，例如小程序id、生活号id、商家pid
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018001307627807", value = "应用id，例如小程序id、生活号id、商家pid")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public AlipayMerchantTradecomplainQueryResponseModel targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * 应用类型 例如小程序：APPID 生活号：PUBLICID 商家账户：PID
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPID", value = "应用类型 例如小程序：APPID 生活号：PUBLICID 商家账户：PID")

  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }


  public AlipayMerchantTradecomplainQueryResponseModel tradeAmount(String tradeAmount) {
    
    this.tradeAmount = tradeAmount;
    return this;
  }

   /**
   * 交易金额，单位元
   * @return tradeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.04", value = "交易金额，单位元")

  public String getTradeAmount() {
    return tradeAmount;
  }


  public void setTradeAmount(String tradeAmount) {
    this.tradeAmount = tradeAmount;
  }


  public AlipayMerchantTradecomplainQueryResponseModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020092322001448341410785740", value = "支付宝交易号")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMerchantTradecomplainQueryResponseModel alipayMerchantTradecomplainQueryResponseModel = (AlipayMerchantTradecomplainQueryResponseModel) o;
    return Objects.equals(this.complainEventId, alipayMerchantTradecomplainQueryResponseModel.complainEventId) &&
        Objects.equals(this.complainReason, alipayMerchantTradecomplainQueryResponseModel.complainReason) &&
        Objects.equals(this.content, alipayMerchantTradecomplainQueryResponseModel.content) &&
        Objects.equals(this.gmtCreate, alipayMerchantTradecomplainQueryResponseModel.gmtCreate) &&
        Objects.equals(this.gmtFinished, alipayMerchantTradecomplainQueryResponseModel.gmtFinished) &&
        Objects.equals(this.gmtModified, alipayMerchantTradecomplainQueryResponseModel.gmtModified) &&
        Objects.equals(this.images, alipayMerchantTradecomplainQueryResponseModel.images) &&
        Objects.equals(this.leafCategoryName, alipayMerchantTradecomplainQueryResponseModel.leafCategoryName) &&
        Objects.equals(this.merchantOrderNo, alipayMerchantTradecomplainQueryResponseModel.merchantOrderNo) &&
        Objects.equals(this.phoneNo, alipayMerchantTradecomplainQueryResponseModel.phoneNo) &&
        Objects.equals(this.replyDetailInfos, alipayMerchantTradecomplainQueryResponseModel.replyDetailInfos) &&
        Objects.equals(this.status, alipayMerchantTradecomplainQueryResponseModel.status) &&
        Objects.equals(this.targetId, alipayMerchantTradecomplainQueryResponseModel.targetId) &&
        Objects.equals(this.targetType, alipayMerchantTradecomplainQueryResponseModel.targetType) &&
        Objects.equals(this.tradeAmount, alipayMerchantTradecomplainQueryResponseModel.tradeAmount) &&
        Objects.equals(this.tradeNo, alipayMerchantTradecomplainQueryResponseModel.tradeNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complainEventId, complainReason, content, gmtCreate, gmtFinished, gmtModified, images, leafCategoryName, merchantOrderNo, phoneNo, replyDetailInfos, status, targetId, targetType, tradeAmount, tradeNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantTradecomplainQueryResponseModel {\n");
    sb.append("    complainEventId: ").append(toIndentedString(complainEventId)).append("\n");
    sb.append("    complainReason: ").append(toIndentedString(complainReason)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtFinished: ").append(toIndentedString(gmtFinished)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    leafCategoryName: ").append(toIndentedString(leafCategoryName)).append("\n");
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    phoneNo: ").append(toIndentedString(phoneNo)).append("\n");
    sb.append("    replyDetailInfos: ").append(toIndentedString(replyDetailInfos)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    tradeAmount: ").append(toIndentedString(tradeAmount)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("complain_event_id");
    openapiFields.add("complain_reason");
    openapiFields.add("content");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_finished");
    openapiFields.add("gmt_modified");
    openapiFields.add("images");
    openapiFields.add("leaf_category_name");
    openapiFields.add("merchant_order_no");
    openapiFields.add("phone_no");
    openapiFields.add("reply_detail_infos");
    openapiFields.add("status");
    openapiFields.add("target_id");
    openapiFields.add("target_type");
    openapiFields.add("trade_amount");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantTradecomplainQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantTradecomplainQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantTradecomplainQueryResponseModel is not found in the empty JSON string", AlipayMerchantTradecomplainQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMerchantTradecomplainQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMerchantTradecomplainQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("complain_event_id") != null && !jsonObj.get("complain_event_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `complain_event_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("complain_event_id").toString()));
      }
      if (jsonObj.get("complain_reason") != null && !jsonObj.get("complain_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `complain_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("complain_reason").toString()));
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_finished") != null && !jsonObj.get("gmt_finished").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_finished` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_finished").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("images") != null && !jsonObj.get("images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `images` to be an array in the JSON string but got `%s`", jsonObj.get("images").toString()));
      }
      if (jsonObj.get("leaf_category_name") != null && !jsonObj.get("leaf_category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leaf_category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leaf_category_name").toString()));
      }
      if (jsonObj.get("merchant_order_no") != null && !jsonObj.get("merchant_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_order_no").toString()));
      }
      if (jsonObj.get("phone_no") != null && !jsonObj.get("phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_no").toString()));
      }
      JsonArray jsonArrayreplyDetailInfos = jsonObj.getAsJsonArray("reply_detail_infos");
      if (jsonArrayreplyDetailInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("reply_detail_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `reply_detail_infos` to be an array in the JSON string but got `%s`", jsonObj.get("reply_detail_infos").toString()));
        }

        // validate the optional field `reply_detail_infos` (array)
        for (int i = 0; i < jsonArrayreplyDetailInfos.size(); i++) {
          ReplyRecordResponse.validateJsonObject(jsonArrayreplyDetailInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("target_id") != null && !jsonObj.get("target_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_id").toString()));
      }
      if (jsonObj.get("target_type") != null && !jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
      if (jsonObj.get("trade_amount") != null && !jsonObj.get("trade_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_amount").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantTradecomplainQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantTradecomplainQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantTradecomplainQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantTradecomplainQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantTradecomplainQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantTradecomplainQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMerchantTradecomplainQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMerchantTradecomplainQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantTradecomplainQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantTradecomplainQueryResponseModel
  */
  public static AlipayMerchantTradecomplainQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantTradecomplainQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantTradecomplainQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

