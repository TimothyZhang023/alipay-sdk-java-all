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
import com.alipay.v3.model.VoucherPackageBaseInfo;
import com.alipay.v3.model.VoucherPackageSalesLiteInfo;
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
 * VoucherPackageInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherPackageInfo {
  public static final String SERIALIZED_NAME_VOUCHER_PACKAGE_BASE_INFO = "voucher_package_base_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_PACKAGE_BASE_INFO)
  private VoucherPackageBaseInfo voucherPackageBaseInfo;

  public static final String SERIALIZED_NAME_VOUCHER_PACKAGE_SALES_LITE_INFO = "voucher_package_sales_lite_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_PACKAGE_SALES_LITE_INFO)
  private VoucherPackageSalesLiteInfo voucherPackageSalesLiteInfo;

  public VoucherPackageInfo() { 
  }

  public VoucherPackageInfo voucherPackageBaseInfo(VoucherPackageBaseInfo voucherPackageBaseInfo) {
    
    this.voucherPackageBaseInfo = voucherPackageBaseInfo;
    return this;
  }

   /**
   * Get voucherPackageBaseInfo
   * @return voucherPackageBaseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherPackageBaseInfo getVoucherPackageBaseInfo() {
    return voucherPackageBaseInfo;
  }


  public void setVoucherPackageBaseInfo(VoucherPackageBaseInfo voucherPackageBaseInfo) {
    this.voucherPackageBaseInfo = voucherPackageBaseInfo;
  }


  public VoucherPackageInfo voucherPackageSalesLiteInfo(VoucherPackageSalesLiteInfo voucherPackageSalesLiteInfo) {
    
    this.voucherPackageSalesLiteInfo = voucherPackageSalesLiteInfo;
    return this;
  }

   /**
   * Get voucherPackageSalesLiteInfo
   * @return voucherPackageSalesLiteInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherPackageSalesLiteInfo getVoucherPackageSalesLiteInfo() {
    return voucherPackageSalesLiteInfo;
  }


  public void setVoucherPackageSalesLiteInfo(VoucherPackageSalesLiteInfo voucherPackageSalesLiteInfo) {
    this.voucherPackageSalesLiteInfo = voucherPackageSalesLiteInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherPackageInfo voucherPackageInfo = (VoucherPackageInfo) o;
    return Objects.equals(this.voucherPackageBaseInfo, voucherPackageInfo.voucherPackageBaseInfo) &&
        Objects.equals(this.voucherPackageSalesLiteInfo, voucherPackageInfo.voucherPackageSalesLiteInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherPackageBaseInfo, voucherPackageSalesLiteInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherPackageInfo {\n");
    sb.append("    voucherPackageBaseInfo: ").append(toIndentedString(voucherPackageBaseInfo)).append("\n");
    sb.append("    voucherPackageSalesLiteInfo: ").append(toIndentedString(voucherPackageSalesLiteInfo)).append("\n");
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
    openapiFields.add("voucher_package_base_info");
    openapiFields.add("voucher_package_sales_lite_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherPackageInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherPackageInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherPackageInfo is not found in the empty JSON string", VoucherPackageInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherPackageInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherPackageInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `voucher_package_base_info`
      if (jsonObj.getAsJsonObject("voucher_package_base_info") != null) {
        VoucherPackageBaseInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_package_base_info"));
      }
      // validate the optional field `voucher_package_sales_lite_info`
      if (jsonObj.getAsJsonObject("voucher_package_sales_lite_info") != null) {
        VoucherPackageSalesLiteInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_package_sales_lite_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherPackageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherPackageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherPackageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherPackageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherPackageInfo>() {
           @Override
           public void write(JsonWriter out, VoucherPackageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherPackageInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherPackageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherPackageInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherPackageInfo
  */
  public static VoucherPackageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherPackageInfo.class);
  }

 /**
  * Convert an instance of VoucherPackageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

