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
import com.alipay.v3.model.CustomerDefineVoucherInfo;
import com.alipay.v3.model.DiscountVoucherInfo;
import com.alipay.v3.model.ExchangeVoucherInfo;
import com.alipay.v3.model.FixVoucherInfo;
import com.alipay.v3.model.SpecialVoucherInfo;
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
 * VoucherDeductInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherDeductInfo {
  public static final String SERIALIZED_NAME_CUSTOMER_DEFINE_VOUCHER_INFO = "customer_define_voucher_info";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DEFINE_VOUCHER_INFO)
  private CustomerDefineVoucherInfo customerDefineVoucherInfo;

  public static final String SERIALIZED_NAME_DISCOUNT_VOUCHER_INFO = "discount_voucher_info";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_VOUCHER_INFO)
  private DiscountVoucherInfo discountVoucherInfo;

  public static final String SERIALIZED_NAME_EXCHANGE_VOUCHER_INFO = "exchange_voucher_info";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_VOUCHER_INFO)
  private ExchangeVoucherInfo exchangeVoucherInfo;

  public static final String SERIALIZED_NAME_FIX_VOUCHER_INFO = "fix_voucher_info";
  @SerializedName(SERIALIZED_NAME_FIX_VOUCHER_INFO)
  private FixVoucherInfo fixVoucherInfo;

  public static final String SERIALIZED_NAME_SPECIAL_VOUCHER_INFO = "special_voucher_info";
  @SerializedName(SERIALIZED_NAME_SPECIAL_VOUCHER_INFO)
  private SpecialVoucherInfo specialVoucherInfo;

  public static final String SERIALIZED_NAME_VOUCHER_TYPE = "voucher_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_TYPE)
  private String voucherType;

  public VoucherDeductInfo() { 
  }

  public VoucherDeductInfo customerDefineVoucherInfo(CustomerDefineVoucherInfo customerDefineVoucherInfo) {
    
    this.customerDefineVoucherInfo = customerDefineVoucherInfo;
    return this;
  }

   /**
   * Get customerDefineVoucherInfo
   * @return customerDefineVoucherInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomerDefineVoucherInfo getCustomerDefineVoucherInfo() {
    return customerDefineVoucherInfo;
  }


  public void setCustomerDefineVoucherInfo(CustomerDefineVoucherInfo customerDefineVoucherInfo) {
    this.customerDefineVoucherInfo = customerDefineVoucherInfo;
  }


  public VoucherDeductInfo discountVoucherInfo(DiscountVoucherInfo discountVoucherInfo) {
    
    this.discountVoucherInfo = discountVoucherInfo;
    return this;
  }

   /**
   * Get discountVoucherInfo
   * @return discountVoucherInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiscountVoucherInfo getDiscountVoucherInfo() {
    return discountVoucherInfo;
  }


  public void setDiscountVoucherInfo(DiscountVoucherInfo discountVoucherInfo) {
    this.discountVoucherInfo = discountVoucherInfo;
  }


  public VoucherDeductInfo exchangeVoucherInfo(ExchangeVoucherInfo exchangeVoucherInfo) {
    
    this.exchangeVoucherInfo = exchangeVoucherInfo;
    return this;
  }

   /**
   * Get exchangeVoucherInfo
   * @return exchangeVoucherInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExchangeVoucherInfo getExchangeVoucherInfo() {
    return exchangeVoucherInfo;
  }


  public void setExchangeVoucherInfo(ExchangeVoucherInfo exchangeVoucherInfo) {
    this.exchangeVoucherInfo = exchangeVoucherInfo;
  }


  public VoucherDeductInfo fixVoucherInfo(FixVoucherInfo fixVoucherInfo) {
    
    this.fixVoucherInfo = fixVoucherInfo;
    return this;
  }

   /**
   * Get fixVoucherInfo
   * @return fixVoucherInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FixVoucherInfo getFixVoucherInfo() {
    return fixVoucherInfo;
  }


  public void setFixVoucherInfo(FixVoucherInfo fixVoucherInfo) {
    this.fixVoucherInfo = fixVoucherInfo;
  }


  public VoucherDeductInfo specialVoucherInfo(SpecialVoucherInfo specialVoucherInfo) {
    
    this.specialVoucherInfo = specialVoucherInfo;
    return this;
  }

   /**
   * Get specialVoucherInfo
   * @return specialVoucherInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpecialVoucherInfo getSpecialVoucherInfo() {
    return specialVoucherInfo;
  }


  public void setSpecialVoucherInfo(SpecialVoucherInfo specialVoucherInfo) {
    this.specialVoucherInfo = specialVoucherInfo;
  }


  public VoucherDeductInfo voucherType(String voucherType) {
    
    this.voucherType = voucherType;
    return this;
  }

   /**
   * 券类型。
   * @return voucherType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券类型。")

  public String getVoucherType() {
    return voucherType;
  }


  public void setVoucherType(String voucherType) {
    this.voucherType = voucherType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherDeductInfo voucherDeductInfo = (VoucherDeductInfo) o;
    return Objects.equals(this.customerDefineVoucherInfo, voucherDeductInfo.customerDefineVoucherInfo) &&
        Objects.equals(this.discountVoucherInfo, voucherDeductInfo.discountVoucherInfo) &&
        Objects.equals(this.exchangeVoucherInfo, voucherDeductInfo.exchangeVoucherInfo) &&
        Objects.equals(this.fixVoucherInfo, voucherDeductInfo.fixVoucherInfo) &&
        Objects.equals(this.specialVoucherInfo, voucherDeductInfo.specialVoucherInfo) &&
        Objects.equals(this.voucherType, voucherDeductInfo.voucherType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerDefineVoucherInfo, discountVoucherInfo, exchangeVoucherInfo, fixVoucherInfo, specialVoucherInfo, voucherType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherDeductInfo {\n");
    sb.append("    customerDefineVoucherInfo: ").append(toIndentedString(customerDefineVoucherInfo)).append("\n");
    sb.append("    discountVoucherInfo: ").append(toIndentedString(discountVoucherInfo)).append("\n");
    sb.append("    exchangeVoucherInfo: ").append(toIndentedString(exchangeVoucherInfo)).append("\n");
    sb.append("    fixVoucherInfo: ").append(toIndentedString(fixVoucherInfo)).append("\n");
    sb.append("    specialVoucherInfo: ").append(toIndentedString(specialVoucherInfo)).append("\n");
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
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
    openapiFields.add("customer_define_voucher_info");
    openapiFields.add("discount_voucher_info");
    openapiFields.add("exchange_voucher_info");
    openapiFields.add("fix_voucher_info");
    openapiFields.add("special_voucher_info");
    openapiFields.add("voucher_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherDeductInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherDeductInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherDeductInfo is not found in the empty JSON string", VoucherDeductInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherDeductInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherDeductInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `customer_define_voucher_info`
      if (jsonObj.getAsJsonObject("customer_define_voucher_info") != null) {
        CustomerDefineVoucherInfo.validateJsonObject(jsonObj.getAsJsonObject("customer_define_voucher_info"));
      }
      // validate the optional field `discount_voucher_info`
      if (jsonObj.getAsJsonObject("discount_voucher_info") != null) {
        DiscountVoucherInfo.validateJsonObject(jsonObj.getAsJsonObject("discount_voucher_info"));
      }
      // validate the optional field `exchange_voucher_info`
      if (jsonObj.getAsJsonObject("exchange_voucher_info") != null) {
        ExchangeVoucherInfo.validateJsonObject(jsonObj.getAsJsonObject("exchange_voucher_info"));
      }
      // validate the optional field `fix_voucher_info`
      if (jsonObj.getAsJsonObject("fix_voucher_info") != null) {
        FixVoucherInfo.validateJsonObject(jsonObj.getAsJsonObject("fix_voucher_info"));
      }
      // validate the optional field `special_voucher_info`
      if (jsonObj.getAsJsonObject("special_voucher_info") != null) {
        SpecialVoucherInfo.validateJsonObject(jsonObj.getAsJsonObject("special_voucher_info"));
      }
      if (jsonObj.get("voucher_type") != null && !jsonObj.get("voucher_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherDeductInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherDeductInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherDeductInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherDeductInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherDeductInfo>() {
           @Override
           public void write(JsonWriter out, VoucherDeductInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherDeductInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherDeductInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherDeductInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherDeductInfo
  */
  public static VoucherDeductInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherDeductInfo.class);
  }

 /**
  * Convert an instance of VoucherDeductInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

