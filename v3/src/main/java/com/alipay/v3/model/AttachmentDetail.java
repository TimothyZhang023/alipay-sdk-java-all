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
 * AttachmentDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AttachmentDetail {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_FILE_URL = "file_url";
  @SerializedName(SERIALIZED_NAME_FILE_URL)
  private String fileUrl;

  public AttachmentDetail() { 
  }

  public AttachmentDetail code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 创建流程时指定的附件code，可能为空。（身份证正反面的固定code：正面：ESIGN_IDCARD，背面：ESIGN_BACK_IDCARD）
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "phonePicture", value = "创建流程时指定的附件code，可能为空。（身份证正反面的固定code：正面：ESIGN_IDCARD，背面：ESIGN_BACK_IDCARD）")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public AttachmentDetail fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * 附件文件名
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "手机正面照.pdf", value = "附件文件名")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public AttachmentDetail fileUrl(String fileUrl) {
    
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * 附件下载地址
   * @return fileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://asset.tsign.cn/apps/esign-nuxt-website/prod/1.0.7/img/1acc358.png", value = "附件下载地址")

  public String getFileUrl() {
    return fileUrl;
  }


  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentDetail attachmentDetail = (AttachmentDetail) o;
    return Objects.equals(this.code, attachmentDetail.code) &&
        Objects.equals(this.fileName, attachmentDetail.fileName) &&
        Objects.equals(this.fileUrl, attachmentDetail.fileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, fileName, fileUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentDetail {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("file_name");
    openapiFields.add("file_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AttachmentDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AttachmentDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachmentDetail is not found in the empty JSON string", AttachmentDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AttachmentDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttachmentDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("file_name") != null && !jsonObj.get("file_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_name").toString()));
      }
      if (jsonObj.get("file_url") != null && !jsonObj.get("file_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachmentDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachmentDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachmentDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachmentDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachmentDetail>() {
           @Override
           public void write(JsonWriter out, AttachmentDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttachmentDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AttachmentDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttachmentDetail
  * @throws IOException if the JSON string is invalid with respect to AttachmentDetail
  */
  public static AttachmentDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachmentDetail.class);
  }

 /**
  * Convert an instance of AttachmentDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

