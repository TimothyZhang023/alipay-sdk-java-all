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
 * MiniappBrandAuditResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MiniappBrandAuditResult {
  public static final String SERIALIZED_NAME_BRAND_ID = "brand_id";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_BRAND_STATUS = "brand_status";
  @SerializedName(SERIALIZED_NAME_BRAND_STATUS)
  private String brandStatus;

  public static final String SERIALIZED_NAME_HAS_BRAND = "has_brand";
  @SerializedName(SERIALIZED_NAME_HAS_BRAND)
  private String hasBrand;

  public static final String SERIALIZED_NAME_INVALID_REASON = "invalid_reason";
  @SerializedName(SERIALIZED_NAME_INVALID_REASON)
  private String invalidReason;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason;

  public MiniappBrandAuditResult() { 
  }

  public MiniappBrandAuditResult brandId(String brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * 小程序提交品牌认证时的品牌id
   * @return brandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "brand_id2020091684564595", value = "小程序提交品牌认证时的品牌id")

  public String getBrandId() {
    return brandId;
  }


  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public MiniappBrandAuditResult brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 小程序提交品牌认证时的品牌名称
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "brand_namecr7officials", value = "小程序提交品牌认证时的品牌名称")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public MiniappBrandAuditResult brandStatus(String brandStatus) {
    
    this.brandStatus = brandStatus;
    return this;
  }

   /**
   * 小程序提交品牌认证后的认证状态
   * @return brandStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUDITING", value = "小程序提交品牌认证后的认证状态")

  public String getBrandStatus() {
    return brandStatus;
  }


  public void setBrandStatus(String brandStatus) {
    this.brandStatus = brandStatus;
  }


  public MiniappBrandAuditResult hasBrand(String hasBrand) {
    
    this.hasBrand = hasBrand;
    return this;
  }

   /**
   * 小程序提交品牌认证是否认证成功
   * @return hasBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "小程序提交品牌认证是否认证成功")

  public String getHasBrand() {
    return hasBrand;
  }


  public void setHasBrand(String hasBrand) {
    this.hasBrand = hasBrand;
  }


  public MiniappBrandAuditResult invalidReason(String invalidReason) {
    
    this.invalidReason = invalidReason;
    return this;
  }

   /**
   * 失效原因
   * @return invalidReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "品牌授权日期已到", value = "失效原因")

  public String getInvalidReason() {
    return invalidReason;
  }


  public void setInvalidReason(String invalidReason) {
    this.invalidReason = invalidReason;
  }


  public MiniappBrandAuditResult rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 驳回原因
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "申请人身份认证不通过", value = "驳回原因")

  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiniappBrandAuditResult miniappBrandAuditResult = (MiniappBrandAuditResult) o;
    return Objects.equals(this.brandId, miniappBrandAuditResult.brandId) &&
        Objects.equals(this.brandName, miniappBrandAuditResult.brandName) &&
        Objects.equals(this.brandStatus, miniappBrandAuditResult.brandStatus) &&
        Objects.equals(this.hasBrand, miniappBrandAuditResult.hasBrand) &&
        Objects.equals(this.invalidReason, miniappBrandAuditResult.invalidReason) &&
        Objects.equals(this.rejectReason, miniappBrandAuditResult.rejectReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, brandName, brandStatus, hasBrand, invalidReason, rejectReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiniappBrandAuditResult {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    brandStatus: ").append(toIndentedString(brandStatus)).append("\n");
    sb.append("    hasBrand: ").append(toIndentedString(hasBrand)).append("\n");
    sb.append("    invalidReason: ").append(toIndentedString(invalidReason)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
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
    openapiFields.add("brand_id");
    openapiFields.add("brand_name");
    openapiFields.add("brand_status");
    openapiFields.add("has_brand");
    openapiFields.add("invalid_reason");
    openapiFields.add("reject_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MiniappBrandAuditResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MiniappBrandAuditResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MiniappBrandAuditResult is not found in the empty JSON string", MiniappBrandAuditResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MiniappBrandAuditResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MiniappBrandAuditResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("brand_id") != null && !jsonObj.get("brand_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_id").toString()));
      }
      if (jsonObj.get("brand_name") != null && !jsonObj.get("brand_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_name").toString()));
      }
      if (jsonObj.get("brand_status") != null && !jsonObj.get("brand_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_status").toString()));
      }
      if (jsonObj.get("has_brand") != null && !jsonObj.get("has_brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `has_brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("has_brand").toString()));
      }
      if (jsonObj.get("invalid_reason") != null && !jsonObj.get("invalid_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invalid_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invalid_reason").toString()));
      }
      if (jsonObj.get("reject_reason") != null && !jsonObj.get("reject_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reject_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reject_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MiniappBrandAuditResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MiniappBrandAuditResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MiniappBrandAuditResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MiniappBrandAuditResult.class));

       return (TypeAdapter<T>) new TypeAdapter<MiniappBrandAuditResult>() {
           @Override
           public void write(JsonWriter out, MiniappBrandAuditResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MiniappBrandAuditResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MiniappBrandAuditResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MiniappBrandAuditResult
  * @throws IOException if the JSON string is invalid with respect to MiniappBrandAuditResult
  */
  public static MiniappBrandAuditResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MiniappBrandAuditResult.class);
  }

 /**
  * Convert an instance of MiniappBrandAuditResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

