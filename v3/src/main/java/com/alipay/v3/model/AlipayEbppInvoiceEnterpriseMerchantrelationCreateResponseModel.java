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
 * AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel {
  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_ROLE_TYPE = "role_type";
  @SerializedName(SERIALIZED_NAME_ROLE_TYPE)
  private String roleType;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel() { 
  }

  public AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 门店收单pid
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxx", value = "门店收单pid")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel roleType(String roleType) {
    
    this.roleType = roleType;
    return this;
  }

   /**
   * 门店直间连类型
   * @return roleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "门店直间连类型")

  public String getRoleType() {
    return roleType;
  }


  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }


  public AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 门店ID
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxx", value = "门店ID")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }


  public AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * 是否成功
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否成功")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel alipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel = (AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel) o;
    return Objects.equals(this.pid, alipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel.pid) &&
        Objects.equals(this.roleType, alipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel.roleType) &&
        Objects.equals(this.shopId, alipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel.shopId) &&
        Objects.equals(this.success, alipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, roleType, shopId, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel {\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("pid");
    openapiFields.add("role_type");
    openapiFields.add("shop_id");
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel is not found in the empty JSON string", AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if (jsonObj.get("role_type") != null && !jsonObj.get("role_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role_type").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel
  */
  public static AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

