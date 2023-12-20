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
import com.alipay.v3.model.FileUploadExtraParam;
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
 * AlipayOpenFileUploadModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenFileUploadModel {
  public static final String SERIALIZED_NAME_BIZ_CODE = "biz_code";
  @SerializedName(SERIALIZED_NAME_BIZ_CODE)
  private String bizCode;

  public static final String SERIALIZED_NAME_EXTRA_PARAMETERS = "extra_parameters";
  @SerializedName(SERIALIZED_NAME_EXTRA_PARAMETERS)
  private FileUploadExtraParam extraParameters;

  public static final String SERIALIZED_NAME_MD5 = "md5";
  @SerializedName(SERIALIZED_NAME_MD5)
  private String md5;

  public AlipayOpenFileUploadModel() { 
  }

  public AlipayOpenFileUploadModel bizCode(String bizCode) {
    
    this.bizCode = bizCode;
    return this;
  }

   /**
   * 素材使用场景，请关联其他开放平台接口联合使用。如果素材用于内容发布，请必传入content_creation
   * @return bizCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "content_creation", value = "素材使用场景，请关联其他开放平台接口联合使用。如果素材用于内容发布，请必传入content_creation")

  public String getBizCode() {
    return bizCode;
  }


  public void setBizCode(String bizCode) {
    this.bizCode = bizCode;
  }


  public AlipayOpenFileUploadModel extraParameters(FileUploadExtraParam extraParameters) {
    
    this.extraParameters = extraParameters;
    return this;
  }

   /**
   * Get extraParameters
   * @return extraParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileUploadExtraParam getExtraParameters() {
    return extraParameters;
  }


  public void setExtraParameters(FileUploadExtraParam extraParameters) {
    this.extraParameters = extraParameters;
  }


  public AlipayOpenFileUploadModel md5(String md5) {
    
    this.md5 = md5;
    return this;
  }

   /**
   * 文件的md5值，如果不传则不校验md5
   * @return md5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9cff2d79bc81acf12abbaca7328a4dc5", value = "文件的md5值，如果不传则不校验md5")

  public String getMd5() {
    return md5;
  }


  public void setMd5(String md5) {
    this.md5 = md5;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenFileUploadModel alipayOpenFileUploadModel = (AlipayOpenFileUploadModel) o;
    return Objects.equals(this.bizCode, alipayOpenFileUploadModel.bizCode) &&
        Objects.equals(this.extraParameters, alipayOpenFileUploadModel.extraParameters) &&
        Objects.equals(this.md5, alipayOpenFileUploadModel.md5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizCode, extraParameters, md5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenFileUploadModel {\n");
    sb.append("    bizCode: ").append(toIndentedString(bizCode)).append("\n");
    sb.append("    extraParameters: ").append(toIndentedString(extraParameters)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
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
    openapiFields.add("biz_code");
    openapiFields.add("extra_parameters");
    openapiFields.add("md5");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenFileUploadModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenFileUploadModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenFileUploadModel is not found in the empty JSON string", AlipayOpenFileUploadModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenFileUploadModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenFileUploadModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_code") != null && !jsonObj.get("biz_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_code").toString()));
      }
      // validate the optional field `extra_parameters`
      if (jsonObj.getAsJsonObject("extra_parameters") != null) {
        FileUploadExtraParam.validateJsonObject(jsonObj.getAsJsonObject("extra_parameters"));
      }
      if (jsonObj.get("md5") != null && !jsonObj.get("md5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `md5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("md5").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenFileUploadModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenFileUploadModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenFileUploadModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenFileUploadModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenFileUploadModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenFileUploadModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenFileUploadModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenFileUploadModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenFileUploadModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenFileUploadModel
  */
  public static AlipayOpenFileUploadModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenFileUploadModel.class);
  }

 /**
  * Convert an instance of AlipayOpenFileUploadModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

