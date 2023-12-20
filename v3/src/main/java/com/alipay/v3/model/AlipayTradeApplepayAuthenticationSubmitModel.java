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
import com.alipay.v3.model.AuthenticationResult;
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
 * AlipayTradeApplepayAuthenticationSubmitModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeApplepayAuthenticationSubmitModel {
  public static final String SERIALIZED_NAME_AUTHENTICATION_RESULTS = "authentication_results";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_RESULTS)
  private List<AuthenticationResult> authenticationResults = null;

  public static final String SERIALIZED_NAME_DEVICE_IDENTIFIER = "device_identifier";
  @SerializedName(SERIALIZED_NAME_DEVICE_IDENTIFIER)
  private String deviceIdentifier;

  public static final String SERIALIZED_NAME_DPAN_IDENTIFIER = "dpan_identifier";
  @SerializedName(SERIALIZED_NAME_DPAN_IDENTIFIER)
  private String dpanIdentifier;

  public static final String SERIALIZED_NAME_TRANSACTION_IDENTIFIER = "transaction_identifier";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_IDENTIFIER)
  private String transactionIdentifier;

  public AlipayTradeApplepayAuthenticationSubmitModel() { 
  }

  public AlipayTradeApplepayAuthenticationSubmitModel authenticationResults(List<AuthenticationResult> authenticationResults) {
    
    this.authenticationResults = authenticationResults;
    return this;
  }

  public AlipayTradeApplepayAuthenticationSubmitModel addAuthenticationResultsItem(AuthenticationResult authenticationResultsItem) {
    if (this.authenticationResults == null) {
      this.authenticationResults = new ArrayList<>();
    }
    this.authenticationResults.add(authenticationResultsItem);
    return this;
  }

   /**
   * ApplePay核身鉴权结果，包括：支付密码、用户确认、数字签名
   * @return authenticationResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ApplePay核身鉴权结果，包括：支付密码、用户确认、数字签名")

  public List<AuthenticationResult> getAuthenticationResults() {
    return authenticationResults;
  }


  public void setAuthenticationResults(List<AuthenticationResult> authenticationResults) {
    this.authenticationResults = authenticationResults;
  }


  public AlipayTradeApplepayAuthenticationSubmitModel deviceIdentifier(String deviceIdentifier) {
    
    this.deviceIdentifier = deviceIdentifier;
    return this;
  }

   /**
   * Apple端的设备ID
   * @return deviceIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mKS9uBWMBT4Vv4+mgVLy7ZbMYer0XMHMfdqnOBVVr+b/iqNagFVjVWSGeSGOhDBi", value = "Apple端的设备ID")

  public String getDeviceIdentifier() {
    return deviceIdentifier;
  }


  public void setDeviceIdentifier(String deviceIdentifier) {
    this.deviceIdentifier = deviceIdentifier;
  }


  public AlipayTradeApplepayAuthenticationSubmitModel dpanIdentifier(String dpanIdentifier) {
    
    this.dpanIdentifier = dpanIdentifier;
    return this;
  }

   /**
   * Apple绑定的BundleId
   * @return dpanIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DAPLSM20191217003050010000320000001002", value = "Apple绑定的BundleId")

  public String getDpanIdentifier() {
    return dpanIdentifier;
  }


  public void setDpanIdentifier(String dpanIdentifier) {
    this.dpanIdentifier = dpanIdentifier;
  }


  public AlipayTradeApplepayAuthenticationSubmitModel transactionIdentifier(String transactionIdentifier) {
    
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

   /**
   * 交易标识
   * @return transactionIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020040422001424181400075556", value = "交易标识")

  public String getTransactionIdentifier() {
    return transactionIdentifier;
  }


  public void setTransactionIdentifier(String transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradeApplepayAuthenticationSubmitModel alipayTradeApplepayAuthenticationSubmitModel = (AlipayTradeApplepayAuthenticationSubmitModel) o;
    return Objects.equals(this.authenticationResults, alipayTradeApplepayAuthenticationSubmitModel.authenticationResults) &&
        Objects.equals(this.deviceIdentifier, alipayTradeApplepayAuthenticationSubmitModel.deviceIdentifier) &&
        Objects.equals(this.dpanIdentifier, alipayTradeApplepayAuthenticationSubmitModel.dpanIdentifier) &&
        Objects.equals(this.transactionIdentifier, alipayTradeApplepayAuthenticationSubmitModel.transactionIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationResults, deviceIdentifier, dpanIdentifier, transactionIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeApplepayAuthenticationSubmitModel {\n");
    sb.append("    authenticationResults: ").append(toIndentedString(authenticationResults)).append("\n");
    sb.append("    deviceIdentifier: ").append(toIndentedString(deviceIdentifier)).append("\n");
    sb.append("    dpanIdentifier: ").append(toIndentedString(dpanIdentifier)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
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
    openapiFields.add("authentication_results");
    openapiFields.add("device_identifier");
    openapiFields.add("dpan_identifier");
    openapiFields.add("transaction_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeApplepayAuthenticationSubmitModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeApplepayAuthenticationSubmitModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeApplepayAuthenticationSubmitModel is not found in the empty JSON string", AlipayTradeApplepayAuthenticationSubmitModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeApplepayAuthenticationSubmitModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeApplepayAuthenticationSubmitModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayauthenticationResults = jsonObj.getAsJsonArray("authentication_results");
      if (jsonArrayauthenticationResults != null) {
        // ensure the json data is an array
        if (!jsonObj.get("authentication_results").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `authentication_results` to be an array in the JSON string but got `%s`", jsonObj.get("authentication_results").toString()));
        }

        // validate the optional field `authentication_results` (array)
        for (int i = 0; i < jsonArrayauthenticationResults.size(); i++) {
          AuthenticationResult.validateJsonObject(jsonArrayauthenticationResults.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("device_identifier") != null && !jsonObj.get("device_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_identifier").toString()));
      }
      if (jsonObj.get("dpan_identifier") != null && !jsonObj.get("dpan_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dpan_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dpan_identifier").toString()));
      }
      if (jsonObj.get("transaction_identifier") != null && !jsonObj.get("transaction_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeApplepayAuthenticationSubmitModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeApplepayAuthenticationSubmitModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeApplepayAuthenticationSubmitModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeApplepayAuthenticationSubmitModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeApplepayAuthenticationSubmitModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeApplepayAuthenticationSubmitModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeApplepayAuthenticationSubmitModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeApplepayAuthenticationSubmitModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeApplepayAuthenticationSubmitModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeApplepayAuthenticationSubmitModel
  */
  public static AlipayTradeApplepayAuthenticationSubmitModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeApplepayAuthenticationSubmitModel.class);
  }

 /**
  * Convert an instance of AlipayTradeApplepayAuthenticationSubmitModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

