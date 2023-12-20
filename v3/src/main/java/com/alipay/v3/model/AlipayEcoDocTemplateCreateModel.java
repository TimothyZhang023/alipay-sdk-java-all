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
 * AlipayEcoDocTemplateCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoDocTemplateCreateModel {
  public static final String SERIALIZED_NAME_CONTENT_MD5 = "content_md_5";
  @SerializedName(SERIALIZED_NAME_CONTENT_MD5)
  private String contentMd5;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_CONVERT_TO_PDF = "convert_to_pdf";
  @SerializedName(SERIALIZED_NAME_CONVERT_TO_PDF)
  private String convertToPdf;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public AlipayEcoDocTemplateCreateModel() { 
  }

  public AlipayEcoDocTemplateCreateModel contentMd5(String contentMd5) {
    
    this.contentMd5 = contentMd5;
    return this;
  }

   /**
   * 模版文件的md5值。示例代码参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/00arl2#%E5%88%9B%E5%BB%BA%E5%90%88%E5%90%8C%E6%A8%A1%E6%9D%BF\&quot;&gt;创建合同模板&lt;/a&gt;
   * @return contentMd5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "L+K1FXfqwcY6LJ0LFXb7gQ==", value = "模版文件的md5值。示例代码参见 <a href=\"https://opendocs.alipay.com/mini/00arl2#%E5%88%9B%E5%BB%BA%E5%90%88%E5%90%8C%E6%A8%A1%E6%9D%BF\">创建合同模板</a>")

  public String getContentMd5() {
    return contentMd5;
  }


  public void setContentMd5(String contentMd5) {
    this.contentMd5 = contentMd5;
  }


  public AlipayEcoDocTemplateCreateModel contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * 目标文件的MIME类型。示例代码参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/00arl2#%E5%88%9B%E5%BB%BA%E5%90%88%E5%90%8C%E6%A8%A1%E6%9D%BF\&quot;&gt;创建合同模板&lt;/a&gt;
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "application/octet-stream", value = "目标文件的MIME类型。示例代码参见 <a href=\"https://opendocs.alipay.com/mini/00arl2#%E5%88%9B%E5%BB%BA%E5%90%88%E5%90%8C%E6%A8%A1%E6%9D%BF\">创建合同模板</a>")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public AlipayEcoDocTemplateCreateModel convertToPdf(String convertToPdf) {
    
    this.convertToPdf = convertToPdf;
    return this;
  }

   /**
   * 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
   * @return convertToPdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false")

  public String getConvertToPdf() {
    return convertToPdf;
  }


  public void setConvertToPdf(String convertToPdf) {
    this.convertToPdf = convertToPdf;
  }


  public AlipayEcoDocTemplateCreateModel fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * 文件名称，必须带上文件扩展名如 .pdf、.doc、.docx，否则会导致后续发起流程校验异常。
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "劳动合同.PDF", value = "文件名称，必须带上文件扩展名如 .pdf、.doc、.docx，否则会导致后续发起流程校验异常。")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoDocTemplateCreateModel alipayEcoDocTemplateCreateModel = (AlipayEcoDocTemplateCreateModel) o;
    return Objects.equals(this.contentMd5, alipayEcoDocTemplateCreateModel.contentMd5) &&
        Objects.equals(this.contentType, alipayEcoDocTemplateCreateModel.contentType) &&
        Objects.equals(this.convertToPdf, alipayEcoDocTemplateCreateModel.convertToPdf) &&
        Objects.equals(this.fileName, alipayEcoDocTemplateCreateModel.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentMd5, contentType, convertToPdf, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoDocTemplateCreateModel {\n");
    sb.append("    contentMd5: ").append(toIndentedString(contentMd5)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    convertToPdf: ").append(toIndentedString(convertToPdf)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
    openapiFields.add("content_md_5");
    openapiFields.add("content_type");
    openapiFields.add("convert_to_pdf");
    openapiFields.add("file_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoDocTemplateCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoDocTemplateCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoDocTemplateCreateModel is not found in the empty JSON string", AlipayEcoDocTemplateCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoDocTemplateCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoDocTemplateCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("content_md_5") != null && !jsonObj.get("content_md_5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_md_5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_md_5").toString()));
      }
      if (jsonObj.get("content_type") != null && !jsonObj.get("content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_type").toString()));
      }
      if (jsonObj.get("convert_to_pdf") != null && !jsonObj.get("convert_to_pdf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `convert_to_pdf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("convert_to_pdf").toString()));
      }
      if (jsonObj.get("file_name") != null && !jsonObj.get("file_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoDocTemplateCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoDocTemplateCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoDocTemplateCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoDocTemplateCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoDocTemplateCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoDocTemplateCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoDocTemplateCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoDocTemplateCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoDocTemplateCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoDocTemplateCreateModel
  */
  public static AlipayEcoDocTemplateCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoDocTemplateCreateModel.class);
  }

 /**
  * Convert an instance of AlipayEcoDocTemplateCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

