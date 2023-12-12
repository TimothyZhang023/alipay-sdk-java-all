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
 * AlipayIserviceCcmRobotAvatarbaseQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmRobotAvatarbaseQueryModel {
  public static final String SERIALIZED_NAME_COMMODITY_CODE = "commodity_code";
  @SerializedName(SERIALIZED_NAME_COMMODITY_CODE)
  private String commodityCode;

  public static final String SERIALIZED_NAME_METHOD_PARAMS = "method_params";
  @SerializedName(SERIALIZED_NAME_METHOD_PARAMS)
  private String methodParams;

  public static final String SERIALIZED_NAME_TARGET_METHOD = "target_method";
  @SerializedName(SERIALIZED_NAME_TARGET_METHOD)
  private String targetMethod;

  public static final String SERIALIZED_NAME_TENANT_CODE = "tenant_code";
  @SerializedName(SERIALIZED_NAME_TENANT_CODE)
  private String tenantCode;

  public AlipayIserviceCcmRobotAvatarbaseQueryModel() { 
  }

  public AlipayIserviceCcmRobotAvatarbaseQueryModel commodityCode(String commodityCode) {
    
    this.commodityCode = commodityCode;
    return this;
  }

   /**
   * 开通的数字人的商品码
   * @return commodityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "P_STD_AVATAR_CCM", value = "开通的数字人的商品码")

  public String getCommodityCode() {
    return commodityCode;
  }


  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }


  public AlipayIserviceCcmRobotAvatarbaseQueryModel methodParams(String methodParams) {
    
    this.methodParams = methodParams;
    return this;
  }

   /**
   * method_params:对应target_method请求方法的具体传参值k-v map
   * @return methodParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key1\":\"name\",}", value = "method_params:对应target_method请求方法的具体传参值k-v map")

  public String getMethodParams() {
    return methodParams;
  }


  public void setMethodParams(String methodParams) {
    this.methodParams = methodParams;
  }


  public AlipayIserviceCcmRobotAvatarbaseQueryModel targetMethod(String targetMethod) {
    
    this.targetMethod = targetMethod;
    return this;
  }

   /**
   * targetMethod；数字人目标方法调用
   * @return targetMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "init.json", value = "targetMethod；数字人目标方法调用")

  public String getTargetMethod() {
    return targetMethod;
  }


  public void setTargetMethod(String targetMethod) {
    this.targetMethod = targetMethod;
  }


  public AlipayIserviceCcmRobotAvatarbaseQueryModel tenantCode(String tenantCode) {
    
    this.tenantCode = tenantCode;
    return this;
  }

   /**
   * 租户code&amp;租户id，对于子部门客户需要上传子部门id
   * @return tenantCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bUC_Weh3", value = "租户code&租户id，对于子部门客户需要上传子部门id")

  public String getTenantCode() {
    return tenantCode;
  }


  public void setTenantCode(String tenantCode) {
    this.tenantCode = tenantCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmRobotAvatarbaseQueryModel alipayIserviceCcmRobotAvatarbaseQueryModel = (AlipayIserviceCcmRobotAvatarbaseQueryModel) o;
    return Objects.equals(this.commodityCode, alipayIserviceCcmRobotAvatarbaseQueryModel.commodityCode) &&
        Objects.equals(this.methodParams, alipayIserviceCcmRobotAvatarbaseQueryModel.methodParams) &&
        Objects.equals(this.targetMethod, alipayIserviceCcmRobotAvatarbaseQueryModel.targetMethod) &&
        Objects.equals(this.tenantCode, alipayIserviceCcmRobotAvatarbaseQueryModel.tenantCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commodityCode, methodParams, targetMethod, tenantCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmRobotAvatarbaseQueryModel {\n");
    sb.append("    commodityCode: ").append(toIndentedString(commodityCode)).append("\n");
    sb.append("    methodParams: ").append(toIndentedString(methodParams)).append("\n");
    sb.append("    targetMethod: ").append(toIndentedString(targetMethod)).append("\n");
    sb.append("    tenantCode: ").append(toIndentedString(tenantCode)).append("\n");
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
    openapiFields.add("commodity_code");
    openapiFields.add("method_params");
    openapiFields.add("target_method");
    openapiFields.add("tenant_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmRobotAvatarbaseQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmRobotAvatarbaseQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmRobotAvatarbaseQueryModel is not found in the empty JSON string", AlipayIserviceCcmRobotAvatarbaseQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmRobotAvatarbaseQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmRobotAvatarbaseQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("commodity_code") != null && !jsonObj.get("commodity_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commodity_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commodity_code").toString()));
      }
      if (jsonObj.get("method_params") != null && !jsonObj.get("method_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method_params").toString()));
      }
      if (jsonObj.get("target_method") != null && !jsonObj.get("target_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_method").toString()));
      }
      if (jsonObj.get("tenant_code") != null && !jsonObj.get("tenant_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmRobotAvatarbaseQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmRobotAvatarbaseQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmRobotAvatarbaseQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmRobotAvatarbaseQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmRobotAvatarbaseQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmRobotAvatarbaseQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmRobotAvatarbaseQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmRobotAvatarbaseQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmRobotAvatarbaseQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmRobotAvatarbaseQueryModel
  */
  public static AlipayIserviceCcmRobotAvatarbaseQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmRobotAvatarbaseQueryModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmRobotAvatarbaseQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

