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
 * OpenCertifyIdentityParam
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenCertifyIdentityParam {
  public static final String SERIALIZED_NAME_CERT_DIGEST = "cert_digest";
  @SerializedName(SERIALIZED_NAME_CERT_DIGEST)
  private String certDigest;

  public static final String SERIALIZED_NAME_CERT_NAME = "cert_name";
  @SerializedName(SERIALIZED_NAME_CERT_NAME)
  private String certName;

  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_CERT_TYPE = "cert_type";
  @SerializedName(SERIALIZED_NAME_CERT_TYPE)
  private String certType;

  public static final String SERIALIZED_NAME_FACIAL_PICTURE_FRONT = "facial_picture_front";
  @SerializedName(SERIALIZED_NAME_FACIAL_PICTURE_FRONT)
  private String facialPictureFront;

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identity_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private String identityType;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_PHONE_NO = "phone_no";
  @SerializedName(SERIALIZED_NAME_PHONE_NO)
  private String phoneNo;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public OpenCertifyIdentityParam() { 
  }

  public OpenCertifyIdentityParam certDigest(String certDigest) {
    
    this.certDigest = certDigest;
    return this;
  }

   /**
   * cert_digest： 身份信息摘要
   * @return certDigest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21232f297a57a5a743894a0e4a801fc3", value = "cert_digest： 身份信息摘要")

  public String getCertDigest() {
    return certDigest;
  }


  public void setCertDigest(String certDigest) {
    this.certDigest = certDigest;
  }


  public OpenCertifyIdentityParam certName(String certName) {
    
    this.certName = certName;
    return this;
  }

   /**
   * cert_name： 填入真实姓名
   * @return certName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "cert_name： 填入真实姓名")

  public String getCertName() {
    return certName;
  }


  public void setCertName(String certName) {
    this.certName = certName;
  }


  public OpenCertifyIdentityParam certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * cert_no： 填入姓名相匹配的证件号码
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "260104197909275964", value = "cert_no： 填入姓名相匹配的证件号码")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public OpenCertifyIdentityParam certType(String certType) {
    
    this.certType = certType;
    return this;
  }

   /**
   * cert_type： 1、若为身份证，填IDENTITY_CARD； 2、若为港澳居民来往内地通行证，填HOME_VISIT_PERMIT_HK_MC； 3、若为台湾居民来往内地通行证，填HOME_VISIT_PERMIT_TAIWAN； 4、若为港澳居民居住证，填RESIDENCE_PERMIT_HK_MC； 5、若为台湾居民居住证，填RESIDENCE_PERMIT_TAIWAN；
   * @return certType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IDENTITY_CARD", value = "cert_type： 1、若为身份证，填IDENTITY_CARD； 2、若为港澳居民来往内地通行证，填HOME_VISIT_PERMIT_HK_MC； 3、若为台湾居民来往内地通行证，填HOME_VISIT_PERMIT_TAIWAN； 4、若为港澳居民居住证，填RESIDENCE_PERMIT_HK_MC； 5、若为台湾居民居住证，填RESIDENCE_PERMIT_TAIWAN；")

  public String getCertType() {
    return certType;
  }


  public void setCertType(String certType) {
    this.certType = certType;
  }


  public OpenCertifyIdentityParam facialPictureFront(String facialPictureFront) {
    
    this.facialPictureFront = facialPictureFront;
    return this;
  }

   /**
   * facial_picture_front： 活体人脸图片base64串，主要用于离线人脸比对
   * @return facialPictureFront
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xydasf==", value = "facial_picture_front： 活体人脸图片base64串，主要用于离线人脸比对")

  public String getFacialPictureFront() {
    return facialPictureFront;
  }


  public void setFacialPictureFront(String facialPictureFront) {
    this.facialPictureFront = facialPictureFront;
  }


  public OpenCertifyIdentityParam identityType(String identityType) {
    
    this.identityType = identityType;
    return this;
  }

   /**
   * identity_type 1.若本人验证，使用CERT_INFO； 2.若代他人验证，使用AGENT_CERT_INFO；
   * @return identityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CERT_INFO", value = "identity_type 1.若本人验证，使用CERT_INFO； 2.若代他人验证，使用AGENT_CERT_INFO；")

  public String getIdentityType() {
    return identityType;
  }


  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }


  public OpenCertifyIdentityParam openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * open_id： 开放平台用户ID
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "open_id： 开放平台用户ID")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public OpenCertifyIdentityParam phoneNo(String phoneNo) {
    
    this.phoneNo = phoneNo;
    return this;
  }

   /**
   * phone_no： 填写姓名相匹配的手机号
   * @return phoneNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13000000000", value = "phone_no： 填写姓名相匹配的手机号")

  public String getPhoneNo() {
    return phoneNo;
  }


  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }


  public OpenCertifyIdentityParam userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * user_id： 支付宝用户ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxx", value = "user_id： 支付宝用户ID")

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
    OpenCertifyIdentityParam openCertifyIdentityParam = (OpenCertifyIdentityParam) o;
    return Objects.equals(this.certDigest, openCertifyIdentityParam.certDigest) &&
        Objects.equals(this.certName, openCertifyIdentityParam.certName) &&
        Objects.equals(this.certNo, openCertifyIdentityParam.certNo) &&
        Objects.equals(this.certType, openCertifyIdentityParam.certType) &&
        Objects.equals(this.facialPictureFront, openCertifyIdentityParam.facialPictureFront) &&
        Objects.equals(this.identityType, openCertifyIdentityParam.identityType) &&
        Objects.equals(this.openId, openCertifyIdentityParam.openId) &&
        Objects.equals(this.phoneNo, openCertifyIdentityParam.phoneNo) &&
        Objects.equals(this.userId, openCertifyIdentityParam.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certDigest, certName, certNo, certType, facialPictureFront, identityType, openId, phoneNo, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenCertifyIdentityParam {\n");
    sb.append("    certDigest: ").append(toIndentedString(certDigest)).append("\n");
    sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
    sb.append("    facialPictureFront: ").append(toIndentedString(facialPictureFront)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    phoneNo: ").append(toIndentedString(phoneNo)).append("\n");
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
    openapiFields.add("cert_digest");
    openapiFields.add("cert_name");
    openapiFields.add("cert_no");
    openapiFields.add("cert_type");
    openapiFields.add("facial_picture_front");
    openapiFields.add("identity_type");
    openapiFields.add("open_id");
    openapiFields.add("phone_no");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OpenCertifyIdentityParam
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OpenCertifyIdentityParam.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenCertifyIdentityParam is not found in the empty JSON string", OpenCertifyIdentityParam.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OpenCertifyIdentityParam.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenCertifyIdentityParam` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cert_digest") != null && !jsonObj.get("cert_digest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_digest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_digest").toString()));
      }
      if (jsonObj.get("cert_name") != null && !jsonObj.get("cert_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_name").toString()));
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("cert_type") != null && !jsonObj.get("cert_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_type").toString()));
      }
      if (jsonObj.get("facial_picture_front") != null && !jsonObj.get("facial_picture_front").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `facial_picture_front` to be a primitive type in the JSON string but got `%s`", jsonObj.get("facial_picture_front").toString()));
      }
      if (jsonObj.get("identity_type") != null && !jsonObj.get("identity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_type").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("phone_no") != null && !jsonObj.get("phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_no").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenCertifyIdentityParam.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenCertifyIdentityParam' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenCertifyIdentityParam> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenCertifyIdentityParam.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenCertifyIdentityParam>() {
           @Override
           public void write(JsonWriter out, OpenCertifyIdentityParam value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenCertifyIdentityParam read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenCertifyIdentityParam given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenCertifyIdentityParam
  * @throws IOException if the JSON string is invalid with respect to OpenCertifyIdentityParam
  */
  public static OpenCertifyIdentityParam fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenCertifyIdentityParam.class);
  }

 /**
  * Convert an instance of OpenCertifyIdentityParam to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

