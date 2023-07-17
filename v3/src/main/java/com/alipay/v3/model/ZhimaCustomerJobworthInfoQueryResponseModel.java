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
 * ZhimaCustomerJobworthInfoQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCustomerJobworthInfoQueryResponseModel {
  public static final String SERIALIZED_NAME_ACCEPTANCE_ID = "acceptance_id";
  @SerializedName(SERIALIZED_NAME_ACCEPTANCE_ID)
  private String acceptanceId;

  public static final String SERIALIZED_NAME_AUTH_TOKEN = "auth_token";
  @SerializedName(SERIALIZED_NAME_AUTH_TOKEN)
  private String authToken;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private String htmlUrl;

  public static final String SERIALIZED_NAME_PICTURE_URL = "picture_url";
  @SerializedName(SERIALIZED_NAME_PICTURE_URL)
  private String pictureUrl;

  public static final String SERIALIZED_NAME_SCENE_RESULT = "scene_result";
  @SerializedName(SERIALIZED_NAME_SCENE_RESULT)
  private Boolean sceneResult;

  public static final String SERIALIZED_NAME_SUB_CODE = "sub_code";
  @SerializedName(SERIALIZED_NAME_SUB_CODE)
  private String subCode;

  public static final String SERIALIZED_NAME_SUB_MSG = "sub_msg";
  @SerializedName(SERIALIZED_NAME_SUB_MSG)
  private String subMsg;

  public static final String SERIALIZED_NAME_UPDATE_URL = "update_url";
  @SerializedName(SERIALIZED_NAME_UPDATE_URL)
  private String updateUrl;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public ZhimaCustomerJobworthInfoQueryResponseModel() { 
  }

  public ZhimaCustomerJobworthInfoQueryResponseModel acceptanceId(String acceptanceId) {
    
    this.acceptanceId = acceptanceId;
    return this;
  }

   /**
   * 受理台单号作为jsapi的一个参数。如果不使用jsapi可以忽略
   * @return acceptanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMEV99202108230100080001977388", value = "受理台单号作为jsapi的一个参数。如果不使用jsapi可以忽略")

  public String getAcceptanceId() {
    return acceptanceId;
  }


  public void setAcceptanceId(String acceptanceId) {
    this.acceptanceId = acceptanceId;
  }


  public ZhimaCustomerJobworthInfoQueryResponseModel authToken(String authToken) {
    
    this.authToken = authToken;
    return this;
  }

   /**
   * 用于授权校验,授权之前需要通过token校验
   * @return authToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "124780137240912384128394", value = "用于授权校验,授权之前需要通过token校验")

  public String getAuthToken() {
    return authToken;
  }


  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }


  public ZhimaCustomerJobworthInfoQueryResponseModel htmlUrl(String htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * h5url
   * @return htmlUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://ssss", value = "h5url")

  public String getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public ZhimaCustomerJobworthInfoQueryResponseModel pictureUrl(String pictureUrl) {
    
    this.pictureUrl = pictureUrl;
    return this;
  }

   /**
   * 职得工作证图片url,可以直接用于展示
   * @return pictureUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://www.123.com", value = "职得工作证图片url,可以直接用于展示")

  public String getPictureUrl() {
    return pictureUrl;
  }


  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }


  public ZhimaCustomerJobworthInfoQueryResponseModel sceneResult(Boolean sceneResult) {
    
    this.sceneResult = sceneResult;
    return this;
  }

   /**
   * 场景授权结果
   * @return sceneResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "场景授权结果")

  public Boolean getSceneResult() {
    return sceneResult;
  }


  public void setSceneResult(Boolean sceneResult) {
    this.sceneResult = sceneResult;
  }


  public ZhimaCustomerJobworthInfoQueryResponseModel subCode(String subCode) {
    
    this.subCode = subCode;
    return this;
  }

   /**
   * 业务编码
   * @return subCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USER_NOT_OPEN_ZHIMA", value = "业务编码")

  public String getSubCode() {
    return subCode;
  }


  public void setSubCode(String subCode) {
    this.subCode = subCode;
  }


  public ZhimaCustomerJobworthInfoQueryResponseModel subMsg(String subMsg) {
    
    this.subMsg = subMsg;
    return this;
  }

   /**
   * 业务中文结果信息
   * @return subMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "用户没有开通芝麻", value = "业务中文结果信息")

  public String getSubMsg() {
    return subMsg;
  }


  public void setSubMsg(String subMsg) {
    this.subMsg = subMsg;
  }


  public ZhimaCustomerJobworthInfoQueryResponseModel updateUrl(String updateUrl) {
    
    this.updateUrl = updateUrl;
    return this;
  }

   /**
   * 工作证图片更新的url,需要跳转到工作证小程序中进行更新
   * @return updateUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://www.123123.com", value = "工作证图片更新的url,需要跳转到工作证小程序中进行更新")

  public String getUpdateUrl() {
    return updateUrl;
  }


  public void setUpdateUrl(String updateUrl) {
    this.updateUrl = updateUrl;
  }


  public ZhimaCustomerJobworthInfoQueryResponseModel url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 职得工作证跳转小程序链接
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://www.123.com?XXX", value = "职得工作证跳转小程序链接")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaCustomerJobworthInfoQueryResponseModel zhimaCustomerJobworthInfoQueryResponseModel = (ZhimaCustomerJobworthInfoQueryResponseModel) o;
    return Objects.equals(this.acceptanceId, zhimaCustomerJobworthInfoQueryResponseModel.acceptanceId) &&
        Objects.equals(this.authToken, zhimaCustomerJobworthInfoQueryResponseModel.authToken) &&
        Objects.equals(this.htmlUrl, zhimaCustomerJobworthInfoQueryResponseModel.htmlUrl) &&
        Objects.equals(this.pictureUrl, zhimaCustomerJobworthInfoQueryResponseModel.pictureUrl) &&
        Objects.equals(this.sceneResult, zhimaCustomerJobworthInfoQueryResponseModel.sceneResult) &&
        Objects.equals(this.subCode, zhimaCustomerJobworthInfoQueryResponseModel.subCode) &&
        Objects.equals(this.subMsg, zhimaCustomerJobworthInfoQueryResponseModel.subMsg) &&
        Objects.equals(this.updateUrl, zhimaCustomerJobworthInfoQueryResponseModel.updateUrl) &&
        Objects.equals(this.url, zhimaCustomerJobworthInfoQueryResponseModel.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptanceId, authToken, htmlUrl, pictureUrl, sceneResult, subCode, subMsg, updateUrl, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCustomerJobworthInfoQueryResponseModel {\n");
    sb.append("    acceptanceId: ").append(toIndentedString(acceptanceId)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    pictureUrl: ").append(toIndentedString(pictureUrl)).append("\n");
    sb.append("    sceneResult: ").append(toIndentedString(sceneResult)).append("\n");
    sb.append("    subCode: ").append(toIndentedString(subCode)).append("\n");
    sb.append("    subMsg: ").append(toIndentedString(subMsg)).append("\n");
    sb.append("    updateUrl: ").append(toIndentedString(updateUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("acceptance_id");
    openapiFields.add("auth_token");
    openapiFields.add("html_url");
    openapiFields.add("picture_url");
    openapiFields.add("scene_result");
    openapiFields.add("sub_code");
    openapiFields.add("sub_msg");
    openapiFields.add("update_url");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCustomerJobworthInfoQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCustomerJobworthInfoQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCustomerJobworthInfoQueryResponseModel is not found in the empty JSON string", ZhimaCustomerJobworthInfoQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCustomerJobworthInfoQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCustomerJobworthInfoQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("acceptance_id") != null && !jsonObj.get("acceptance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acceptance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acceptance_id").toString()));
      }
      if (jsonObj.get("auth_token") != null && !jsonObj.get("auth_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_token").toString()));
      }
      if (jsonObj.get("html_url") != null && !jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if (jsonObj.get("picture_url") != null && !jsonObj.get("picture_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `picture_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("picture_url").toString()));
      }
      if (jsonObj.get("sub_code") != null && !jsonObj.get("sub_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_code").toString()));
      }
      if (jsonObj.get("sub_msg") != null && !jsonObj.get("sub_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_msg").toString()));
      }
      if (jsonObj.get("update_url") != null && !jsonObj.get("update_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `update_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("update_url").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCustomerJobworthInfoQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCustomerJobworthInfoQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCustomerJobworthInfoQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCustomerJobworthInfoQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCustomerJobworthInfoQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCustomerJobworthInfoQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCustomerJobworthInfoQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaCustomerJobworthInfoQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCustomerJobworthInfoQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCustomerJobworthInfoQueryResponseModel
  */
  public static ZhimaCustomerJobworthInfoQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCustomerJobworthInfoQueryResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaCustomerJobworthInfoQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

