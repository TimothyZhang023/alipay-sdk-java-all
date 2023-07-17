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
 * AlipayUserCertdocCertverifyPreconsultModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserCertdocCertverifyPreconsultModel {
  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_CERT_TYPE = "cert_type";
  @SerializedName(SERIALIZED_NAME_CERT_TYPE)
  private String certType;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_LOGON_ID = "logon_id";
  @SerializedName(SERIALIZED_NAME_LOGON_ID)
  private String logonId;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public AlipayUserCertdocCertverifyPreconsultModel() { 
  }

  public AlipayUserCertdocCertverifyPreconsultModel certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * 证件号
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "230100199901010001", value = "证件号")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public AlipayUserCertdocCertverifyPreconsultModel certType(String certType) {
    
    this.certType = certType;
    return this;
  }

   /**
   * 证件类型。暂仅支持 IDENTITY_CARD （身份证）。
   * @return certType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IDENTITY_CARD", value = "证件类型。暂仅支持 IDENTITY_CARD （身份证）。")

  public String getCertType() {
    return certType;
  }


  public void setCertType(String certType) {
    this.certType = certType;
  }


  public AlipayUserCertdocCertverifyPreconsultModel extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 拓展字段,JSON格式
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "拓展字段,JSON格式")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public AlipayUserCertdocCertverifyPreconsultModel logonId(String logonId) {
    
    this.logonId = logonId;
    return this;
  }

   /**
   * 支付宝登录名
   * @return logonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sample@sample.com", value = "支付宝登录名")

  public String getLogonId() {
    return logonId;
  }


  public void setLogonId(String logonId) {
    this.logonId = logonId;
  }


  public AlipayUserCertdocCertverifyPreconsultModel mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * 手机号码
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13812345678", value = "手机号码")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public AlipayUserCertdocCertverifyPreconsultModel userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * 真实姓名
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "真实姓名")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayUserCertdocCertverifyPreconsultModel alipayUserCertdocCertverifyPreconsultModel = (AlipayUserCertdocCertverifyPreconsultModel) o;
    return Objects.equals(this.certNo, alipayUserCertdocCertverifyPreconsultModel.certNo) &&
        Objects.equals(this.certType, alipayUserCertdocCertverifyPreconsultModel.certType) &&
        Objects.equals(this.extInfo, alipayUserCertdocCertverifyPreconsultModel.extInfo) &&
        Objects.equals(this.logonId, alipayUserCertdocCertverifyPreconsultModel.logonId) &&
        Objects.equals(this.mobile, alipayUserCertdocCertverifyPreconsultModel.mobile) &&
        Objects.equals(this.userName, alipayUserCertdocCertverifyPreconsultModel.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certNo, certType, extInfo, logonId, mobile, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserCertdocCertverifyPreconsultModel {\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    logonId: ").append(toIndentedString(logonId)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
    openapiFields.add("cert_no");
    openapiFields.add("cert_type");
    openapiFields.add("ext_info");
    openapiFields.add("logon_id");
    openapiFields.add("mobile");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserCertdocCertverifyPreconsultModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserCertdocCertverifyPreconsultModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserCertdocCertverifyPreconsultModel is not found in the empty JSON string", AlipayUserCertdocCertverifyPreconsultModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayUserCertdocCertverifyPreconsultModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayUserCertdocCertverifyPreconsultModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("cert_type") != null && !jsonObj.get("cert_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_type").toString()));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      if (jsonObj.get("logon_id") != null && !jsonObj.get("logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logon_id").toString()));
      }
      if (jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if (jsonObj.get("user_name") != null && !jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserCertdocCertverifyPreconsultModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserCertdocCertverifyPreconsultModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserCertdocCertverifyPreconsultModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserCertdocCertverifyPreconsultModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserCertdocCertverifyPreconsultModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserCertdocCertverifyPreconsultModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayUserCertdocCertverifyPreconsultModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayUserCertdocCertverifyPreconsultModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserCertdocCertverifyPreconsultModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserCertdocCertverifyPreconsultModel
  */
  public static AlipayUserCertdocCertverifyPreconsultModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserCertdocCertverifyPreconsultModel.class);
  }

 /**
  * Convert an instance of AlipayUserCertdocCertverifyPreconsultModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

