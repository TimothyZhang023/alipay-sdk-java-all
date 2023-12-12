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
import com.alipay.v3.model.VoucherExpressInfo;
import com.alipay.v3.model.VoucherGoodsQuantitySpecificationInfo;
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
 * VoucherDeductThresholdInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherDeductThresholdInfo {
  public static final String SERIALIZED_NAME_CUSTOMER_DEFINE_VOUCHER_THRESHOLD_DESC = "customer_define_voucher_threshold_desc";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DEFINE_VOUCHER_THRESHOLD_DESC)
  private String customerDefineVoucherThresholdDesc;

  public static final String SERIALIZED_NAME_VOUCHER_EXPRESS_INFO = "voucher_express_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_EXPRESS_INFO)
  private VoucherExpressInfo voucherExpressInfo;

  public static final String SERIALIZED_NAME_VOUCHER_GOODS_QUANTITY_SPECIFICATION_INFO = "voucher_goods_quantity_specification_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_GOODS_QUANTITY_SPECIFICATION_INFO)
  private VoucherGoodsQuantitySpecificationInfo voucherGoodsQuantitySpecificationInfo;

  public VoucherDeductThresholdInfo() { 
  }

  public VoucherDeductThresholdInfo customerDefineVoucherThresholdDesc(String customerDefineVoucherThresholdDesc) {
    
    this.customerDefineVoucherThresholdDesc = customerDefineVoucherThresholdDesc;
    return this;
  }

   /**
   * 自定义门槛描述
   * @return customerDefineVoucherThresholdDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自定义门槛描述")

  public String getCustomerDefineVoucherThresholdDesc() {
    return customerDefineVoucherThresholdDesc;
  }


  public void setCustomerDefineVoucherThresholdDesc(String customerDefineVoucherThresholdDesc) {
    this.customerDefineVoucherThresholdDesc = customerDefineVoucherThresholdDesc;
  }


  public VoucherDeductThresholdInfo voucherExpressInfo(VoucherExpressInfo voucherExpressInfo) {
    
    this.voucherExpressInfo = voucherExpressInfo;
    return this;
  }

   /**
   * Get voucherExpressInfo
   * @return voucherExpressInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherExpressInfo getVoucherExpressInfo() {
    return voucherExpressInfo;
  }


  public void setVoucherExpressInfo(VoucherExpressInfo voucherExpressInfo) {
    this.voucherExpressInfo = voucherExpressInfo;
  }


  public VoucherDeductThresholdInfo voucherGoodsQuantitySpecificationInfo(VoucherGoodsQuantitySpecificationInfo voucherGoodsQuantitySpecificationInfo) {
    
    this.voucherGoodsQuantitySpecificationInfo = voucherGoodsQuantitySpecificationInfo;
    return this;
  }

   /**
   * Get voucherGoodsQuantitySpecificationInfo
   * @return voucherGoodsQuantitySpecificationInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherGoodsQuantitySpecificationInfo getVoucherGoodsQuantitySpecificationInfo() {
    return voucherGoodsQuantitySpecificationInfo;
  }


  public void setVoucherGoodsQuantitySpecificationInfo(VoucherGoodsQuantitySpecificationInfo voucherGoodsQuantitySpecificationInfo) {
    this.voucherGoodsQuantitySpecificationInfo = voucherGoodsQuantitySpecificationInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherDeductThresholdInfo voucherDeductThresholdInfo = (VoucherDeductThresholdInfo) o;
    return Objects.equals(this.customerDefineVoucherThresholdDesc, voucherDeductThresholdInfo.customerDefineVoucherThresholdDesc) &&
        Objects.equals(this.voucherExpressInfo, voucherDeductThresholdInfo.voucherExpressInfo) &&
        Objects.equals(this.voucherGoodsQuantitySpecificationInfo, voucherDeductThresholdInfo.voucherGoodsQuantitySpecificationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerDefineVoucherThresholdDesc, voucherExpressInfo, voucherGoodsQuantitySpecificationInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherDeductThresholdInfo {\n");
    sb.append("    customerDefineVoucherThresholdDesc: ").append(toIndentedString(customerDefineVoucherThresholdDesc)).append("\n");
    sb.append("    voucherExpressInfo: ").append(toIndentedString(voucherExpressInfo)).append("\n");
    sb.append("    voucherGoodsQuantitySpecificationInfo: ").append(toIndentedString(voucherGoodsQuantitySpecificationInfo)).append("\n");
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
    openapiFields.add("customer_define_voucher_threshold_desc");
    openapiFields.add("voucher_express_info");
    openapiFields.add("voucher_goods_quantity_specification_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherDeductThresholdInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherDeductThresholdInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherDeductThresholdInfo is not found in the empty JSON string", VoucherDeductThresholdInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherDeductThresholdInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherDeductThresholdInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("customer_define_voucher_threshold_desc") != null && !jsonObj.get("customer_define_voucher_threshold_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_define_voucher_threshold_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_define_voucher_threshold_desc").toString()));
      }
      // validate the optional field `voucher_express_info`
      if (jsonObj.getAsJsonObject("voucher_express_info") != null) {
        VoucherExpressInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_express_info"));
      }
      // validate the optional field `voucher_goods_quantity_specification_info`
      if (jsonObj.getAsJsonObject("voucher_goods_quantity_specification_info") != null) {
        VoucherGoodsQuantitySpecificationInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_goods_quantity_specification_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherDeductThresholdInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherDeductThresholdInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherDeductThresholdInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherDeductThresholdInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherDeductThresholdInfo>() {
           @Override
           public void write(JsonWriter out, VoucherDeductThresholdInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherDeductThresholdInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherDeductThresholdInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherDeductThresholdInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherDeductThresholdInfo
  */
  public static VoucherDeductThresholdInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherDeductThresholdInfo.class);
  }

 /**
  * Convert an instance of VoucherDeductThresholdInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

