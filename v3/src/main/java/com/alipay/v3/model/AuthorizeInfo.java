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
import java.util.ArrayList;
import java.util.List;

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
 * AuthorizeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthorizeInfo {
  public static final String SERIALIZED_NAME_AUTH_IDS = "auth_ids";
  @SerializedName(SERIALIZED_NAME_AUTH_IDS)
  private List<String> authIds = null;

  public static final String SERIALIZED_NAME_AUTH_MATERIALS = "auth_materials";
  @SerializedName(SERIALIZED_NAME_AUTH_MATERIALS)
  private List<String> authMaterials = null;

  public static final String SERIALIZED_NAME_AUTH_NAME = "auth_name";
  @SerializedName(SERIALIZED_NAME_AUTH_NAME)
  private String authName;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public AuthorizeInfo() { 
  }

  public AuthorizeInfo authIds(List<String> authIds) {
    
    this.authIds = authIds;
    return this;
  }

  public AuthorizeInfo addAuthIdsItem(String authIdsItem) {
    if (this.authIds == null) {
      this.authIds = new ArrayList<>();
    }
    this.authIds.add(authIdsItem);
    return this;
  }

   /**
   * 授权方身份证明(当前只支持图片类型，请调用alipay.open.mini.miniapp.brand.upload接口上传图片,可以上传多个授权方身份证明)
   * @return authIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"ua2qD53TRpyfX-UYYin6sQAAACMAAQED\",\"ua2qD53TRpyfX-UYYin6sQAAACMAAQED\"]", value = "授权方身份证明(当前只支持图片类型，请调用alipay.open.mini.miniapp.brand.upload接口上传图片,可以上传多个授权方身份证明)")

  public List<String> getAuthIds() {
    return authIds;
  }


  public void setAuthIds(List<String> authIds) {
    this.authIds = authIds;
  }


  public AuthorizeInfo authMaterials(List<String> authMaterials) {
    
    this.authMaterials = authMaterials;
    return this;
  }

  public AuthorizeInfo addAuthMaterialsItem(String authMaterialsItem) {
    if (this.authMaterials == null) {
      this.authMaterials = new ArrayList<>();
    }
    this.authMaterials.add(authMaterialsItem);
    return this;
  }

   /**
   * 授权有效资质(当前只支持图片类型，请调用alipay.open.mini.miniapp.brand.upload接口上传图片，可以上传多个授权有效资质)
   * @return authMaterials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"ua2qD53TRpyfX-UYYin6sQAAACMAAQED\",\"ua2qD53TRpyfX-UYYin6sQAAACMAAQED\"]", value = "授权有效资质(当前只支持图片类型，请调用alipay.open.mini.miniapp.brand.upload接口上传图片，可以上传多个授权有效资质)")

  public List<String> getAuthMaterials() {
    return authMaterials;
  }


  public void setAuthMaterials(List<String> authMaterials) {
    this.authMaterials = authMaterials;
  }


  public AuthorizeInfo authName(String authName) {
    
    this.authName = authName;
    return this;
  }

   /**
   * 被授权人名称
   * @return authName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "被授权人名称")

  public String getAuthName() {
    return authName;
  }


  public void setAuthName(String authName) {
    this.authName = authName;
  }


  public AuthorizeInfo endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * 授权有效期(结束日期)
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-16", value = "授权有效期(结束日期)")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public AuthorizeInfo startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * 授权有效期(开始日期)
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-16", value = "授权有效期(开始日期)")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizeInfo authorizeInfo = (AuthorizeInfo) o;
    return Objects.equals(this.authIds, authorizeInfo.authIds) &&
        Objects.equals(this.authMaterials, authorizeInfo.authMaterials) &&
        Objects.equals(this.authName, authorizeInfo.authName) &&
        Objects.equals(this.endDate, authorizeInfo.endDate) &&
        Objects.equals(this.startDate, authorizeInfo.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authIds, authMaterials, authName, endDate, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizeInfo {\n");
    sb.append("    authIds: ").append(toIndentedString(authIds)).append("\n");
    sb.append("    authMaterials: ").append(toIndentedString(authMaterials)).append("\n");
    sb.append("    authName: ").append(toIndentedString(authName)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("auth_ids");
    openapiFields.add("auth_materials");
    openapiFields.add("auth_name");
    openapiFields.add("end_date");
    openapiFields.add("start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthorizeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizeInfo is not found in the empty JSON string", AuthorizeInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthorizeInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthorizeInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("auth_ids") != null && !jsonObj.get("auth_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_ids` to be an array in the JSON string but got `%s`", jsonObj.get("auth_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("auth_materials") != null && !jsonObj.get("auth_materials").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_materials` to be an array in the JSON string but got `%s`", jsonObj.get("auth_materials").toString()));
      }
      if (jsonObj.get("auth_name") != null && !jsonObj.get("auth_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_name").toString()));
      }
      if (jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if (jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizeInfo>() {
           @Override
           public void write(JsonWriter out, AuthorizeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthorizeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthorizeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizeInfo
  * @throws IOException if the JSON string is invalid with respect to AuthorizeInfo
  */
  public static AuthorizeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizeInfo.class);
  }

 /**
  * Convert an instance of AuthorizeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

