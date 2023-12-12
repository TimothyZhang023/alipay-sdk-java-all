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
 * IsvAuthSceneInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IsvAuthSceneInfo {
  public static final String SERIALIZED_NAME_SCENE_CODE = "scene_code";
  @SerializedName(SERIALIZED_NAME_SCENE_CODE)
  private String sceneCode;

  public static final String SERIALIZED_NAME_SCENE_PERMISSIONS = "scene_permissions";
  @SerializedName(SERIALIZED_NAME_SCENE_PERMISSIONS)
  private String scenePermissions;

  public IsvAuthSceneInfo() { 
  }

  public IsvAuthSceneInfo sceneCode(String sceneCode) {
    
    this.sceneCode = sceneCode;
    return this;
  }

   /**
   * 运营场景编码 OPERATION_POINTS：管理运营积分 SHOP_MANAGE：管理门店信息 MINI_APP_OPER：运营支付宝小程序 PROMOTION_MANAGE：运营营销活动
   * @return sceneCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PROMOTION_MANAGE", value = "运营场景编码 OPERATION_POINTS：管理运营积分 SHOP_MANAGE：管理门店信息 MINI_APP_OPER：运营支付宝小程序 PROMOTION_MANAGE：运营营销活动")

  public String getSceneCode() {
    return sceneCode;
  }


  public void setSceneCode(String sceneCode) {
    this.sceneCode = sceneCode;
  }


  public IsvAuthSceneInfo scenePermissions(String scenePermissions) {
    
    this.scenePermissions = scenePermissions;
    return this;
  }

   /**
   * 运营场景下的权限编码，多个权限编码以,隔开 1、管理门店信息：SHOP_MANAGE；基础权限（升级）：SHOP_MANAGE_BASE 2、运营营销活动：PROMOTION_MANAGE ；基础权限（升级）：PROMOTION_MANAGE_BASE 3、运营支付宝小程序：MINI_APP_OPER；基础权限（升级）：MINI_APP_OPER_BASE 4、管理运营积分：OPERATION_POINTS；基础权限（升级）：OPERATION_POINTS_BASE
   * @return scenePermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SHOP_MANAGE_BASE", value = "运营场景下的权限编码，多个权限编码以,隔开 1、管理门店信息：SHOP_MANAGE；基础权限（升级）：SHOP_MANAGE_BASE 2、运营营销活动：PROMOTION_MANAGE ；基础权限（升级）：PROMOTION_MANAGE_BASE 3、运营支付宝小程序：MINI_APP_OPER；基础权限（升级）：MINI_APP_OPER_BASE 4、管理运营积分：OPERATION_POINTS；基础权限（升级）：OPERATION_POINTS_BASE")

  public String getScenePermissions() {
    return scenePermissions;
  }


  public void setScenePermissions(String scenePermissions) {
    this.scenePermissions = scenePermissions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsvAuthSceneInfo isvAuthSceneInfo = (IsvAuthSceneInfo) o;
    return Objects.equals(this.sceneCode, isvAuthSceneInfo.sceneCode) &&
        Objects.equals(this.scenePermissions, isvAuthSceneInfo.scenePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sceneCode, scenePermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsvAuthSceneInfo {\n");
    sb.append("    sceneCode: ").append(toIndentedString(sceneCode)).append("\n");
    sb.append("    scenePermissions: ").append(toIndentedString(scenePermissions)).append("\n");
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
    openapiFields.add("scene_code");
    openapiFields.add("scene_permissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IsvAuthSceneInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IsvAuthSceneInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IsvAuthSceneInfo is not found in the empty JSON string", IsvAuthSceneInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IsvAuthSceneInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IsvAuthSceneInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("scene_code") != null && !jsonObj.get("scene_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene_code").toString()));
      }
      if (jsonObj.get("scene_permissions") != null && !jsonObj.get("scene_permissions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_permissions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene_permissions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IsvAuthSceneInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IsvAuthSceneInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IsvAuthSceneInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IsvAuthSceneInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<IsvAuthSceneInfo>() {
           @Override
           public void write(JsonWriter out, IsvAuthSceneInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IsvAuthSceneInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IsvAuthSceneInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IsvAuthSceneInfo
  * @throws IOException if the JSON string is invalid with respect to IsvAuthSceneInfo
  */
  public static IsvAuthSceneInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IsvAuthSceneInfo.class);
  }

 /**
  * Convert an instance of IsvAuthSceneInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

