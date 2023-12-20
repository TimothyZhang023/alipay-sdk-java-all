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
 * ProductInviteStatusInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductInviteStatusInfo {
  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ProductInviteStatusInfo() { 
  }

  public ProductInviteStatusInfo productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 产品编码
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FACE_TO_FACE_PAYMENT", value = "产品编码")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public ProductInviteStatusInfo productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 产品名称
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "当面付收单", value = "产品名称")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public ProductInviteStatusInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * NONE：未签约，表示还没有签约该产品 MERCHANT_AUDITING：审核中，已经有合约在审核中，请等待审核完成 MERCHANT_CONFIRM_SUCCESS：已生效，表示合约已经生效，不需要再签约了 MERCHANT_APPLY_ORDER_CANCELED：审核未通过
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NONE|MERCHANT_AUDITING|MERCHANT_CONFIRM_SUCCESS|MERCHANT_APPLY_ORDER_CANCELED", value = "NONE：未签约，表示还没有签约该产品 MERCHANT_AUDITING：审核中，已经有合约在审核中，请等待审核完成 MERCHANT_CONFIRM_SUCCESS：已生效，表示合约已经生效，不需要再签约了 MERCHANT_APPLY_ORDER_CANCELED：审核未通过")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductInviteStatusInfo productInviteStatusInfo = (ProductInviteStatusInfo) o;
    return Objects.equals(this.productCode, productInviteStatusInfo.productCode) &&
        Objects.equals(this.productName, productInviteStatusInfo.productName) &&
        Objects.equals(this.status, productInviteStatusInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, productName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductInviteStatusInfo {\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("product_code");
    openapiFields.add("product_name");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductInviteStatusInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProductInviteStatusInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductInviteStatusInfo is not found in the empty JSON string", ProductInviteStatusInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProductInviteStatusInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductInviteStatusInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
      if (jsonObj.get("product_name") != null && !jsonObj.get("product_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_name").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductInviteStatusInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductInviteStatusInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductInviteStatusInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductInviteStatusInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductInviteStatusInfo>() {
           @Override
           public void write(JsonWriter out, ProductInviteStatusInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductInviteStatusInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductInviteStatusInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductInviteStatusInfo
  * @throws IOException if the JSON string is invalid with respect to ProductInviteStatusInfo
  */
  public static ProductInviteStatusInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductInviteStatusInfo.class);
  }

 /**
  * Convert an instance of ProductInviteStatusInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

