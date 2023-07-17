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
 * VoucherInventoryInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherInventoryInfo {
  public static final String SERIALIZED_NAME_SEND_COUNT = "send_count";
  @SerializedName(SERIALIZED_NAME_SEND_COUNT)
  private Integer sendCount;

  public static final String SERIALIZED_NAME_USE_COUNT = "use_count";
  @SerializedName(SERIALIZED_NAME_USE_COUNT)
  private Integer useCount;

  public VoucherInventoryInfo() { 
  }

  public VoucherInventoryInfo sendCount(Integer sendCount) {
    
    this.sendCount = sendCount;
    return this;
  }

   /**
   * 已发放数量。
   * @return sendCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "已发放数量。")

  public Integer getSendCount() {
    return sendCount;
  }


  public void setSendCount(Integer sendCount) {
    this.sendCount = sendCount;
  }


  public VoucherInventoryInfo useCount(Integer useCount) {
    
    this.useCount = useCount;
    return this;
  }

   /**
   * 已核销数量。
   * @return useCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "已核销数量。")

  public Integer getUseCount() {
    return useCount;
  }


  public void setUseCount(Integer useCount) {
    this.useCount = useCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherInventoryInfo voucherInventoryInfo = (VoucherInventoryInfo) o;
    return Objects.equals(this.sendCount, voucherInventoryInfo.sendCount) &&
        Objects.equals(this.useCount, voucherInventoryInfo.useCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sendCount, useCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherInventoryInfo {\n");
    sb.append("    sendCount: ").append(toIndentedString(sendCount)).append("\n");
    sb.append("    useCount: ").append(toIndentedString(useCount)).append("\n");
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
    openapiFields.add("send_count");
    openapiFields.add("use_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherInventoryInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherInventoryInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherInventoryInfo is not found in the empty JSON string", VoucherInventoryInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherInventoryInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherInventoryInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherInventoryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherInventoryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherInventoryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherInventoryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherInventoryInfo>() {
           @Override
           public void write(JsonWriter out, VoucherInventoryInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherInventoryInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherInventoryInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherInventoryInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherInventoryInfo
  */
  public static VoucherInventoryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherInventoryInfo.class);
  }

 /**
  * Convert an instance of VoucherInventoryInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

