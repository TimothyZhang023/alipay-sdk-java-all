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
 * AlipayOpenMiniVersionUploadResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniVersionUploadResponseModel {
  public static final String SERIALIZED_NAME_BUILD_STATUS = "build_status";
  @SerializedName(SERIALIZED_NAME_BUILD_STATUS)
  private String buildStatus;

  public static final String SERIALIZED_NAME_CREATE_STATUS = "create_status";
  @SerializedName(SERIALIZED_NAME_CREATE_STATUS)
  private String createStatus;

  public static final String SERIALIZED_NAME_NEED_ROTATION = "need_rotation";
  @SerializedName(SERIALIZED_NAME_NEED_ROTATION)
  private String needRotation;

  public static final String SERIALIZED_NAME_VERSION_CREATED = "version_created";
  @SerializedName(SERIALIZED_NAME_VERSION_CREATED)
  private String versionCreated;

  public AlipayOpenMiniVersionUploadResponseModel() { 
  }

  public AlipayOpenMiniVersionUploadResponseModel buildStatus(String buildStatus) {
    
    this.buildStatus = buildStatus;
    return this;
  }

   /**
   * 构建的状态，0-构建排队中；1-正在构建；2-构建成功；3-构建失败；5-构建超时
   * @return buildStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "构建的状态，0-构建排队中；1-正在构建；2-构建成功；3-构建失败；5-构建超时")

  public String getBuildStatus() {
    return buildStatus;
  }


  public void setBuildStatus(String buildStatus) {
    this.buildStatus = buildStatus;
  }


  public AlipayOpenMiniVersionUploadResponseModel createStatus(String createStatus) {
    
    this.createStatus = createStatus;
    return this;
  }

   /**
   * 创建版本的状态，0-构建排队中；1-正在构建；2-构建成功；3-构建失败；5-构建超时；6-版本创建成功
   * @return createStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "创建版本的状态，0-构建排队中；1-正在构建；2-构建成功；3-构建失败；5-构建超时；6-版本创建成功")

  public String getCreateStatus() {
    return createStatus;
  }


  public void setCreateStatus(String createStatus) {
    this.createStatus = createStatus;
  }


  public AlipayOpenMiniVersionUploadResponseModel needRotation(String needRotation) {
    
    this.needRotation = needRotation;
    return this;
  }

   /**
   * 是否需要轮询
   * @return needRotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"true\"", value = "是否需要轮询")

  public String getNeedRotation() {
    return needRotation;
  }


  public void setNeedRotation(String needRotation) {
    this.needRotation = needRotation;
  }


  public AlipayOpenMiniVersionUploadResponseModel versionCreated(String versionCreated) {
    
    this.versionCreated = versionCreated;
    return this;
  }

   /**
   * 是否创建了版本
   * @return versionCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否创建了版本")

  public String getVersionCreated() {
    return versionCreated;
  }


  public void setVersionCreated(String versionCreated) {
    this.versionCreated = versionCreated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniVersionUploadResponseModel alipayOpenMiniVersionUploadResponseModel = (AlipayOpenMiniVersionUploadResponseModel) o;
    return Objects.equals(this.buildStatus, alipayOpenMiniVersionUploadResponseModel.buildStatus) &&
        Objects.equals(this.createStatus, alipayOpenMiniVersionUploadResponseModel.createStatus) &&
        Objects.equals(this.needRotation, alipayOpenMiniVersionUploadResponseModel.needRotation) &&
        Objects.equals(this.versionCreated, alipayOpenMiniVersionUploadResponseModel.versionCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildStatus, createStatus, needRotation, versionCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniVersionUploadResponseModel {\n");
    sb.append("    buildStatus: ").append(toIndentedString(buildStatus)).append("\n");
    sb.append("    createStatus: ").append(toIndentedString(createStatus)).append("\n");
    sb.append("    needRotation: ").append(toIndentedString(needRotation)).append("\n");
    sb.append("    versionCreated: ").append(toIndentedString(versionCreated)).append("\n");
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
    openapiFields.add("build_status");
    openapiFields.add("create_status");
    openapiFields.add("need_rotation");
    openapiFields.add("version_created");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniVersionUploadResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniVersionUploadResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniVersionUploadResponseModel is not found in the empty JSON string", AlipayOpenMiniVersionUploadResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniVersionUploadResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniVersionUploadResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("build_status") != null && !jsonObj.get("build_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_status").toString()));
      }
      if (jsonObj.get("create_status") != null && !jsonObj.get("create_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_status").toString()));
      }
      if (jsonObj.get("need_rotation") != null && !jsonObj.get("need_rotation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `need_rotation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("need_rotation").toString()));
      }
      if (jsonObj.get("version_created") != null && !jsonObj.get("version_created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_created").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniVersionUploadResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniVersionUploadResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniVersionUploadResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniVersionUploadResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniVersionUploadResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniVersionUploadResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniVersionUploadResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniVersionUploadResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniVersionUploadResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniVersionUploadResponseModel
  */
  public static AlipayOpenMiniVersionUploadResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniVersionUploadResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniVersionUploadResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

