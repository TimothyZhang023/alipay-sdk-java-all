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
 * AlipayDataBillBalancehisQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayDataBillBalancehisQueryResponseModel {
  public static final String SERIALIZED_NAME_BEGINNING_BALANCE = "beginning_balance";
  @SerializedName(SERIALIZED_NAME_BEGINNING_BALANCE)
  private String beginningBalance;

  public static final String SERIALIZED_NAME_ENDING_BALANCE = "ending_balance";
  @SerializedName(SERIALIZED_NAME_ENDING_BALANCE)
  private String endingBalance;

  public AlipayDataBillBalancehisQueryResponseModel() { 
  }

  public AlipayDataBillBalancehisQueryResponseModel beginningBalance(String beginningBalance) {
    
    this.beginningBalance = beginningBalance;
    return this;
  }

   /**
   * 期初余额
   * @return beginningBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000.00", value = "期初余额")

  public String getBeginningBalance() {
    return beginningBalance;
  }


  public void setBeginningBalance(String beginningBalance) {
    this.beginningBalance = beginningBalance;
  }


  public AlipayDataBillBalancehisQueryResponseModel endingBalance(String endingBalance) {
    
    this.endingBalance = endingBalance;
    return this;
  }

   /**
   * 期末余额
   * @return endingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11000.00", value = "期末余额")

  public String getEndingBalance() {
    return endingBalance;
  }


  public void setEndingBalance(String endingBalance) {
    this.endingBalance = endingBalance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayDataBillBalancehisQueryResponseModel alipayDataBillBalancehisQueryResponseModel = (AlipayDataBillBalancehisQueryResponseModel) o;
    return Objects.equals(this.beginningBalance, alipayDataBillBalancehisQueryResponseModel.beginningBalance) &&
        Objects.equals(this.endingBalance, alipayDataBillBalancehisQueryResponseModel.endingBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginningBalance, endingBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayDataBillBalancehisQueryResponseModel {\n");
    sb.append("    beginningBalance: ").append(toIndentedString(beginningBalance)).append("\n");
    sb.append("    endingBalance: ").append(toIndentedString(endingBalance)).append("\n");
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
    openapiFields.add("beginning_balance");
    openapiFields.add("ending_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayDataBillBalancehisQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayDataBillBalancehisQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayDataBillBalancehisQueryResponseModel is not found in the empty JSON string", AlipayDataBillBalancehisQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayDataBillBalancehisQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayDataBillBalancehisQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("beginning_balance") != null && !jsonObj.get("beginning_balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beginning_balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beginning_balance").toString()));
      }
      if (jsonObj.get("ending_balance") != null && !jsonObj.get("ending_balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ending_balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ending_balance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayDataBillBalancehisQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayDataBillBalancehisQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayDataBillBalancehisQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayDataBillBalancehisQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayDataBillBalancehisQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayDataBillBalancehisQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayDataBillBalancehisQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayDataBillBalancehisQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayDataBillBalancehisQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayDataBillBalancehisQueryResponseModel
  */
  public static AlipayDataBillBalancehisQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayDataBillBalancehisQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayDataBillBalancehisQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

