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
import com.alipay.v3.model.CardUserInfo;
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
 * AlipayMarketingCardQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCardQueryModel {
  public static final String SERIALIZED_NAME_CARD_USER_INFO = "card_user_info";
  @SerializedName(SERIALIZED_NAME_CARD_USER_INFO)
  private CardUserInfo cardUserInfo;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_TARGET_CARD_NO = "target_card_no";
  @SerializedName(SERIALIZED_NAME_TARGET_CARD_NO)
  private String targetCardNo;

  public static final String SERIALIZED_NAME_TARGET_CARD_NO_TYPE = "target_card_no_type";
  @SerializedName(SERIALIZED_NAME_TARGET_CARD_NO_TYPE)
  private String targetCardNoType;

  public AlipayMarketingCardQueryModel() { 
  }

  public AlipayMarketingCardQueryModel cardUserInfo(CardUserInfo cardUserInfo) {
    
    this.cardUserInfo = cardUserInfo;
    return this;
  }

   /**
   * Get cardUserInfo
   * @return cardUserInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardUserInfo getCardUserInfo() {
    return cardUserInfo;
  }


  public void setCardUserInfo(CardUserInfo cardUserInfo) {
    this.cardUserInfo = cardUserInfo;
  }


  public AlipayMarketingCardQueryModel extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 扩展信息，暂时没有
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "扩展信息，暂时没有")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public AlipayMarketingCardQueryModel targetCardNo(String targetCardNo) {
    
    this.targetCardNo = targetCardNo;
    return this;
  }

   /**
   * 操作卡号。 若target_card_no_type为  BIZ_CARD，则该值为业务卡号，即alipay.marketing.card.open(会员卡开卡)返回结果中的card_info#biz_card_no。 若target_card_no_type为 D_QR_CODE 或D_BAR_CODE，则该值为动态码值。 若target_card_no_type为 EXTERNAL_CARD，则该值为外部卡号。
   * @return targetCardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0000001", value = "操作卡号。 若target_card_no_type为  BIZ_CARD，则该值为业务卡号，即alipay.marketing.card.open(会员卡开卡)返回结果中的card_info#biz_card_no。 若target_card_no_type为 D_QR_CODE 或D_BAR_CODE，则该值为动态码值。 若target_card_no_type为 EXTERNAL_CARD，则该值为外部卡号。")

  public String getTargetCardNo() {
    return targetCardNo;
  }


  public void setTargetCardNo(String targetCardNo) {
    this.targetCardNo = targetCardNo;
  }


  public AlipayMarketingCardQueryModel targetCardNoType(String targetCardNoType) {
    
    this.targetCardNoType = targetCardNoType;
    return this;
  }

   /**
   * 卡号ID类型
   * @return targetCardNoType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BIZ_CARD", value = "卡号ID类型")

  public String getTargetCardNoType() {
    return targetCardNoType;
  }


  public void setTargetCardNoType(String targetCardNoType) {
    this.targetCardNoType = targetCardNoType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCardQueryModel alipayMarketingCardQueryModel = (AlipayMarketingCardQueryModel) o;
    return Objects.equals(this.cardUserInfo, alipayMarketingCardQueryModel.cardUserInfo) &&
        Objects.equals(this.extInfo, alipayMarketingCardQueryModel.extInfo) &&
        Objects.equals(this.targetCardNo, alipayMarketingCardQueryModel.targetCardNo) &&
        Objects.equals(this.targetCardNoType, alipayMarketingCardQueryModel.targetCardNoType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardUserInfo, extInfo, targetCardNo, targetCardNoType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCardQueryModel {\n");
    sb.append("    cardUserInfo: ").append(toIndentedString(cardUserInfo)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    targetCardNo: ").append(toIndentedString(targetCardNo)).append("\n");
    sb.append("    targetCardNoType: ").append(toIndentedString(targetCardNoType)).append("\n");
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
    openapiFields.add("card_user_info");
    openapiFields.add("ext_info");
    openapiFields.add("target_card_no");
    openapiFields.add("target_card_no_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCardQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCardQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCardQueryModel is not found in the empty JSON string", AlipayMarketingCardQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCardQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCardQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `card_user_info`
      if (jsonObj.getAsJsonObject("card_user_info") != null) {
        CardUserInfo.validateJsonObject(jsonObj.getAsJsonObject("card_user_info"));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      if (jsonObj.get("target_card_no") != null && !jsonObj.get("target_card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_card_no").toString()));
      }
      if (jsonObj.get("target_card_no_type") != null && !jsonObj.get("target_card_no_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_card_no_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_card_no_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCardQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCardQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCardQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCardQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCardQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCardQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCardQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCardQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCardQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCardQueryModel
  */
  public static AlipayMarketingCardQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCardQueryModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCardQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

