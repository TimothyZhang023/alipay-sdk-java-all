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
 * PaymentVoucherAvailableMerchant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentVoucherAvailableMerchant {
  public static final String SERIALIZED_NAME_AVAILABLE_PIDS = "available_pids";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_PIDS)
  private List<String> availablePids = null;

  public static final String SERIALIZED_NAME_AVAILABLE_SMIDS = "available_smids";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_SMIDS)
  private List<String> availableSmids = null;

  public PaymentVoucherAvailableMerchant() { 
  }

  public PaymentVoucherAvailableMerchant availablePids(List<String> availablePids) {
    
    this.availablePids = availablePids;
    return this;
  }

  public PaymentVoucherAvailableMerchant addAvailablePidsItem(String availablePidsItem) {
    if (this.availablePids == null) {
      this.availablePids = new ArrayList<>();
    }
    this.availablePids.add(availablePidsItem);
    return this;
  }

   /**
   * 优惠券可核销的直连商户PID  限制： 1、available_pids和available_smids至少二选一。
   * @return availablePids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2088102111111111\"]", value = "优惠券可核销的直连商户PID  限制： 1、available_pids和available_smids至少二选一。")

  public List<String> getAvailablePids() {
    return availablePids;
  }


  public void setAvailablePids(List<String> availablePids) {
    this.availablePids = availablePids;
  }


  public PaymentVoucherAvailableMerchant availableSmids(List<String> availableSmids) {
    
    this.availableSmids = availableSmids;
    return this;
  }

  public PaymentVoucherAvailableMerchant addAvailableSmidsItem(String availableSmidsItem) {
    if (this.availableSmids == null) {
      this.availableSmids = new ArrayList<>();
    }
    this.availableSmids.add(availableSmidsItem);
    return this;
  }

   /**
   * 优惠券可核销的间连商户SMID  限制：  1、available_pids和available_smids至少二选一。
   * @return availableSmids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2088102111111111\"]", value = "优惠券可核销的间连商户SMID  限制：  1、available_pids和available_smids至少二选一。")

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
    PaymentVoucherAvailableMerchant paymentVoucherAvailableMerchant = (PaymentVoucherAvailableMerchant) o;
    return Objects.equals(this.availablePids, paymentVoucherAvailableMerchant.availablePids) &&
        Objects.equals(this.availableSmids, paymentVoucherAvailableMerchant.availableSmids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availablePids, availableSmids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentVoucherAvailableMerchant {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to PaymentVoucherAvailableMerchant
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentVoucherAvailableMerchant.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentVoucherAvailableMerchant is not found in the empty JSON string", PaymentVoucherAvailableMerchant.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentVoucherAvailableMerchant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentVoucherAvailableMerchant` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!PaymentVoucherAvailableMerchant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentVoucherAvailableMerchant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentVoucherAvailableMerchant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentVoucherAvailableMerchant.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentVoucherAvailableMerchant>() {
           @Override
           public void write(JsonWriter out, PaymentVoucherAvailableMerchant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentVoucherAvailableMerchant read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentVoucherAvailableMerchant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentVoucherAvailableMerchant
  * @throws IOException if the JSON string is invalid with respect to PaymentVoucherAvailableMerchant
  */
  public static PaymentVoucherAvailableMerchant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentVoucherAvailableMerchant.class);
  }

 /**
  * Convert an instance of PaymentVoucherAvailableMerchant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

