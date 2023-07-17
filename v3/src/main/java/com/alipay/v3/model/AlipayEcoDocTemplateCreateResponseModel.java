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
 * AlipayEcoDocTemplateCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoDocTemplateCreateResponseModel {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_UPLOAD_URL = "upload_url";
  @SerializedName(SERIALIZED_NAME_UPLOAD_URL)
  private String uploadUrl;

  public AlipayEcoDocTemplateCreateResponseModel() { 
  }

  public AlipayEcoDocTemplateCreateResponseModel templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 模板id（请记录模板ID（templateId），后续发起合同签署需要使用到）
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "049d33945cde46b7953bf377fe2a7608", value = "模板id（请记录模板ID（templateId），后续发起合同签署需要使用到）")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public AlipayEcoDocTemplateCreateResponseModel uploadUrl(String uploadUrl) {
    
    this.uploadUrl = uploadUrl;
    return this;
  }

   /**
   * 文件直传地址，需要用此上传地址使用PUT方式上传文件，只有文件上传后模板才可用
   * @return uploadUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://esignoss.oss-cn-hangzhou.aliyuncs.com/1111563786/d8d35867-744b-47f3-890f-e3650efd99e1/%E9%99%84%E4%BB%B6.zip?Expires=1561472338&OSSAccess...", value = "文件直传地址，需要用此上传地址使用PUT方式上传文件，只有文件上传后模板才可用")

  public String getUploadUrl() {
    return uploadUrl;
  }


  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoDocTemplateCreateResponseModel alipayEcoDocTemplateCreateResponseModel = (AlipayEcoDocTemplateCreateResponseModel) o;
    return Objects.equals(this.templateId, alipayEcoDocTemplateCreateResponseModel.templateId) &&
        Objects.equals(this.uploadUrl, alipayEcoDocTemplateCreateResponseModel.uploadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, uploadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoDocTemplateCreateResponseModel {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
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
    openapiFields.add("template_id");
    openapiFields.add("upload_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoDocTemplateCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoDocTemplateCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoDocTemplateCreateResponseModel is not found in the empty JSON string", AlipayEcoDocTemplateCreateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoDocTemplateCreateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoDocTemplateCreateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if (jsonObj.get("upload_url") != null && !jsonObj.get("upload_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upload_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upload_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoDocTemplateCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoDocTemplateCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoDocTemplateCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoDocTemplateCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoDocTemplateCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoDocTemplateCreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoDocTemplateCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoDocTemplateCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoDocTemplateCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoDocTemplateCreateResponseModel
  */
  public static AlipayEcoDocTemplateCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoDocTemplateCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEcoDocTemplateCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

