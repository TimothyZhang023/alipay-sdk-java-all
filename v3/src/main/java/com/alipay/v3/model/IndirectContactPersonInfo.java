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
 * IndirectContactPersonInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IndirectContactPersonInfo {
  public static final String SERIALIZED_NAME_CONTACT_CARD_NO = "contact_card_no";
  @SerializedName(SERIALIZED_NAME_CONTACT_CARD_NO)
  private String contactCardNo;

  public static final String SERIALIZED_NAME_CONTACT_CERT_TYPE = "contact_cert_type";
  @SerializedName(SERIALIZED_NAME_CONTACT_CERT_TYPE)
  private String contactCertType;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName;

  public static final String SERIALIZED_NAME_CONTACT_PHONE_NO = "contact_phone_no";
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE_NO)
  private String contactPhoneNo;

  public IndirectContactPersonInfo() { 
  }

  public IndirectContactPersonInfo contactCardNo(String contactCardNo) {
    
    this.contactCardNo = contactCardNo;
    return this;
  }

   /**
   * 联系人身份证件号。 可传身份证、港澳居民来往内地通行证、港澳居民居住证、台湾居民来往大陆通行证、台湾居民居住证、护照、外国人永久居住证等证件号码，号码枚举见contact_card_type。若传身份证，需保证18位，且英文字母大写
   * @return contactCardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "233330199001010001", value = "联系人身份证件号。 可传身份证、港澳居民来往内地通行证、港澳居民居住证、台湾居民来往大陆通行证、台湾居民居住证、护照、外国人永久居住证等证件号码，号码枚举见contact_card_type。若传身份证，需保证18位，且英文字母大写")

  public String getContactCardNo() {
    return contactCardNo;
  }


  public void setContactCardNo(String contactCardNo) {
    this.contactCardNo = contactCardNo;
  }


  public IndirectContactPersonInfo contactCertType(String contactCertType) {
    
    this.contactCertType = contactCertType;
    return this;
  }

   /**
   * 联系人证件类型，枚举值：中国大陆居民-身份证(RESIDENT)、其他国家或地区居民-护照(PASSPORT)、中国港澳居民-来往内地通行证(PASSPORT_HK_MO)、中国台湾居民-来往大陆通行证(PASSPORT_TWN)、港澳居民居住证（RESIDENCE_PERMIT_HM）、台湾居民居住证（RESIDENCE_PERMIT_TW）、外国人永久居住证（PERMANENT_RESIDENCE_FOREIGNER）。个体户/企业/事业单位/社会组织：可选择任一证件类型。小微商户仅支持身份证类型。
   * @return contactCertType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RESIDENT", value = "联系人证件类型，枚举值：中国大陆居民-身份证(RESIDENT)、其他国家或地区居民-护照(PASSPORT)、中国港澳居民-来往内地通行证(PASSPORT_HK_MO)、中国台湾居民-来往大陆通行证(PASSPORT_TWN)、港澳居民居住证（RESIDENCE_PERMIT_HM）、台湾居民居住证（RESIDENCE_PERMIT_TW）、外国人永久居住证（PERMANENT_RESIDENCE_FOREIGNER）。个体户/企业/事业单位/社会组织：可选择任一证件类型。小微商户仅支持身份证类型。")

  public String getContactCertType() {
    return contactCertType;
  }


  public void setContactCertType(String contactCertType) {
    this.contactCertType = contactCertType;
  }


  public IndirectContactPersonInfo contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * 联系人姓名
   * @return contactName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "联系人姓名")

  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public IndirectContactPersonInfo contactPhoneNo(String contactPhoneNo) {
    
    this.contactPhoneNo = contactPhoneNo;
    return this;
  }

   /**
   * 联系人手机
   * @return contactPhoneNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19999999999", value = "联系人手机")

  public String getContactPhoneNo() {
    return contactPhoneNo;
  }


  public void setContactPhoneNo(String contactPhoneNo) {
    this.contactPhoneNo = contactPhoneNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndirectContactPersonInfo indirectContactPersonInfo = (IndirectContactPersonInfo) o;
    return Objects.equals(this.contactCardNo, indirectContactPersonInfo.contactCardNo) &&
        Objects.equals(this.contactCertType, indirectContactPersonInfo.contactCertType) &&
        Objects.equals(this.contactName, indirectContactPersonInfo.contactName) &&
        Objects.equals(this.contactPhoneNo, indirectContactPersonInfo.contactPhoneNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactCardNo, contactCertType, contactName, contactPhoneNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndirectContactPersonInfo {\n");
    sb.append("    contactCardNo: ").append(toIndentedString(contactCardNo)).append("\n");
    sb.append("    contactCertType: ").append(toIndentedString(contactCertType)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactPhoneNo: ").append(toIndentedString(contactPhoneNo)).append("\n");
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
    openapiFields.add("contact_card_no");
    openapiFields.add("contact_cert_type");
    openapiFields.add("contact_name");
    openapiFields.add("contact_phone_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IndirectContactPersonInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IndirectContactPersonInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndirectContactPersonInfo is not found in the empty JSON string", IndirectContactPersonInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IndirectContactPersonInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IndirectContactPersonInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("contact_card_no") != null && !jsonObj.get("contact_card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_card_no").toString()));
      }
      if (jsonObj.get("contact_cert_type") != null && !jsonObj.get("contact_cert_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_cert_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_cert_type").toString()));
      }
      if (jsonObj.get("contact_name") != null && !jsonObj.get("contact_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_name").toString()));
      }
      if (jsonObj.get("contact_phone_no") != null && !jsonObj.get("contact_phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_phone_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndirectContactPersonInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndirectContactPersonInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndirectContactPersonInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndirectContactPersonInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<IndirectContactPersonInfo>() {
           @Override
           public void write(JsonWriter out, IndirectContactPersonInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IndirectContactPersonInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IndirectContactPersonInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IndirectContactPersonInfo
  * @throws IOException if the JSON string is invalid with respect to IndirectContactPersonInfo
  */
  public static IndirectContactPersonInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndirectContactPersonInfo.class);
  }

 /**
  * Convert an instance of IndirectContactPersonInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

