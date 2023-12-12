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
 * BuyerPayDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BuyerPayDetail {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_PAY_CHANNEL = "pay_channel";
  @SerializedName(SERIALIZED_NAME_PAY_CHANNEL)
  private String payChannel;

  public BuyerPayDetail() { 
  }

  public BuyerPayDetail amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 买家支付金额，单位：元。
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "77.77", value = "买家支付金额，单位：元。")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public BuyerPayDetail payChannel(String payChannel) {
    
    this.payChannel = payChannel;
    return this;
  }

   /**
   * 支付渠道
   * @return payChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "offline_pos", value = "支付渠道")

  public String getPayChannel() {
    return payChannel;
  }


  public void setPayChannel(String payChannel) {
    this.payChannel = payChannel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerPayDetail buyerPayDetail = (BuyerPayDetail) o;
    return Objects.equals(this.amount, buyerPayDetail.amount) &&
        Objects.equals(this.payChannel, buyerPayDetail.payChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, payChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerPayDetail {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    payChannel: ").append(toIndentedString(payChannel)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("pay_channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BuyerPayDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BuyerPayDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BuyerPayDetail is not found in the empty JSON string", BuyerPayDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BuyerPayDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BuyerPayDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("pay_channel") != null && !jsonObj.get("pay_channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_channel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BuyerPayDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BuyerPayDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BuyerPayDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BuyerPayDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<BuyerPayDetail>() {
           @Override
           public void write(JsonWriter out, BuyerPayDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BuyerPayDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BuyerPayDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BuyerPayDetail
  * @throws IOException if the JSON string is invalid with respect to BuyerPayDetail
  */
  public static BuyerPayDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BuyerPayDetail.class);
  }

 /**
  * Convert an instance of BuyerPayDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

