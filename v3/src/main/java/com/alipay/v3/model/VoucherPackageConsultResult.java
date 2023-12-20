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
 * VoucherPackageConsultResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherPackageConsultResult {
  public static final String SERIALIZED_NAME_CONSULT_RESULT_CODE = "consult_result_code";
  @SerializedName(SERIALIZED_NAME_CONSULT_RESULT_CODE)
  private String consultResultCode;

  public static final String SERIALIZED_NAME_VOUCHER_PACKAGE_ID = "voucher_package_id";
  @SerializedName(SERIALIZED_NAME_VOUCHER_PACKAGE_ID)
  private String voucherPackageId;

  public VoucherPackageConsultResult() { 
  }

  public VoucherPackageConsultResult consultResultCode(String consultResultCode) {
    
    this.consultResultCode = consultResultCode;
    return this;
  }

   /**
   * 券包购买咨询结果code： SUCCESS：可以领取； PRODUCT_NOT_ENABLE：产品不可用； NOT_IN_SELL_TIME：不在销售时间内； PRODUCT_SOLD_OUT：产品售罄； USER_PURCHASE_LIMIT：用户购买上限； OTHER：不可购买，未知原因
   * @return consultResultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "券包购买咨询结果code： SUCCESS：可以领取； PRODUCT_NOT_ENABLE：产品不可用； NOT_IN_SELL_TIME：不在销售时间内； PRODUCT_SOLD_OUT：产品售罄； USER_PURCHASE_LIMIT：用户购买上限； OTHER：不可购买，未知原因")

  public String getConsultResultCode() {
    return consultResultCode;
  }


  public void setConsultResultCode(String consultResultCode) {
    this.consultResultCode = consultResultCode;
  }


  public VoucherPackageConsultResult voucherPackageId(String voucherPackageId) {
    
    this.voucherPackageId = voucherPackageId;
    return this;
  }

   /**
   * 券包id
   * @return voucherPackageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IP20220628016671405804297103167741", value = "券包id")

  public String getVoucherPackageId() {
    return voucherPackageId;
  }


  public void setVoucherPackageId(String voucherPackageId) {
    this.voucherPackageId = voucherPackageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherPackageConsultResult voucherPackageConsultResult = (VoucherPackageConsultResult) o;
    return Objects.equals(this.consultResultCode, voucherPackageConsultResult.consultResultCode) &&
        Objects.equals(this.voucherPackageId, voucherPackageConsultResult.voucherPackageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultResultCode, voucherPackageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherPackageConsultResult {\n");
    sb.append("    consultResultCode: ").append(toIndentedString(consultResultCode)).append("\n");
    sb.append("    voucherPackageId: ").append(toIndentedString(voucherPackageId)).append("\n");
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
    openapiFields.add("consult_result_code");
    openapiFields.add("voucher_package_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherPackageConsultResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherPackageConsultResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherPackageConsultResult is not found in the empty JSON string", VoucherPackageConsultResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherPackageConsultResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherPackageConsultResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("consult_result_code") != null && !jsonObj.get("consult_result_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consult_result_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consult_result_code").toString()));
      }
      if (jsonObj.get("voucher_package_id") != null && !jsonObj.get("voucher_package_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_package_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_package_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherPackageConsultResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherPackageConsultResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherPackageConsultResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherPackageConsultResult.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherPackageConsultResult>() {
           @Override
           public void write(JsonWriter out, VoucherPackageConsultResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherPackageConsultResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherPackageConsultResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherPackageConsultResult
  * @throws IOException if the JSON string is invalid with respect to VoucherPackageConsultResult
  */
  public static VoucherPackageConsultResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherPackageConsultResult.class);
  }

 /**
  * Convert an instance of VoucherPackageConsultResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

