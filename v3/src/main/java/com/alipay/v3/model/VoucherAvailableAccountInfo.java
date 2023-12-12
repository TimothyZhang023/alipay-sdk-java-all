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
import java.util.ArrayList;
import java.util.List;

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
 * VoucherAvailableAccountInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherAvailableAccountInfo {
  public static final String SERIALIZED_NAME_AVAILABLE_PIDS = "available_pids";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_PIDS)
  private List<String> availablePids = null;

  public static final String SERIALIZED_NAME_AVAILABLE_SMIDS = "available_smids";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_SMIDS)
  private List<String> availableSmids = null;

  public VoucherAvailableAccountInfo() { 
  }

  public VoucherAvailableAccountInfo availablePids(List<String> availablePids) {
    
    this.availablePids = availablePids;
    return this;
  }

  public VoucherAvailableAccountInfo addAvailablePidsItem(String availablePidsItem) {
    if (this.availablePids == null) {
      this.availablePids = new ArrayList<>();
    }
    this.availablePids.add(availablePidsItem);
    return this;
  }

   /**
   * 优惠券可核销的直连商户PID
   * @return availablePids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "优惠券可核销的直连商户PID")

  public List<String> getAvailablePids() {
    return availablePids;
  }


  public void setAvailablePids(List<String> availablePids) {
    this.availablePids = availablePids;
  }


  public VoucherAvailableAccountInfo availableSmids(List<String> availableSmids) {
    
    this.availableSmids = availableSmids;
    return this;
  }

  public VoucherAvailableAccountInfo addAvailableSmidsItem(String availableSmidsItem) {
    if (this.availableSmids == null) {
      this.availableSmids = new ArrayList<>();
    }
    this.availableSmids.add(availableSmidsItem);
    return this;
  }

   /**
   * 优惠券可核销的间连商户SMID
   * @return availableSmids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "优惠券可核销的间连商户SMID")

  public List<String> getAvailableSmids() {
    return availableSmids;
  }


  public void setAvailableSmids(List<String> availableSmids) {
    this.availableSmids = availableSmids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherAvailableAccountInfo voucherAvailableAccountInfo = (VoucherAvailableAccountInfo) o;
    return Objects.equals(this.availablePids, voucherAvailableAccountInfo.availablePids) &&
        Objects.equals(this.availableSmids, voucherAvailableAccountInfo.availableSmids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availablePids, availableSmids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherAvailableAccountInfo {\n");
    sb.append("    availablePids: ").append(toIndentedString(availablePids)).append("\n");
    sb.append("    availableSmids: ").append(toIndentedString(availableSmids)).append("\n");
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
    openapiFields.add("available_pids");
    openapiFields.add("available_smids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherAvailableAccountInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherAvailableAccountInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherAvailableAccountInfo is not found in the empty JSON string", VoucherAvailableAccountInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherAvailableAccountInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherAvailableAccountInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("available_pids") != null && !jsonObj.get("available_pids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_pids` to be an array in the JSON string but got `%s`", jsonObj.get("available_pids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("available_smids") != null && !jsonObj.get("available_smids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_smids` to be an array in the JSON string but got `%s`", jsonObj.get("available_smids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherAvailableAccountInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherAvailableAccountInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherAvailableAccountInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherAvailableAccountInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherAvailableAccountInfo>() {
           @Override
           public void write(JsonWriter out, VoucherAvailableAccountInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherAvailableAccountInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherAvailableAccountInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherAvailableAccountInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherAvailableAccountInfo
  */
  public static VoucherAvailableAccountInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherAvailableAccountInfo.class);
  }

 /**
  * Convert an instance of VoucherAvailableAccountInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

