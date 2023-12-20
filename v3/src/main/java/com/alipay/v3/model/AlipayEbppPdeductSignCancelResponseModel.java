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
 * AlipayEbppPdeductSignCancelResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppPdeductSignCancelResponseModel {
  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_AGREEMENT_STATUS = "agreement_status";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_STATUS)
  private String agreementStatus;

  public static final String SERIALIZED_NAME_OUT_AGREEMENT_ID = "out_agreement_id";
  @SerializedName(SERIALIZED_NAME_OUT_AGREEMENT_ID)
  private String outAgreementId;

  public AlipayEbppPdeductSignCancelResponseModel() { 
  }

  public AlipayEbppPdeductSignCancelResponseModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 支付宝代扣协议ID
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20441111111", value = "支付宝代扣协议ID")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public AlipayEbppPdeductSignCancelResponseModel agreementStatus(String agreementStatus) {
    
    this.agreementStatus = agreementStatus;
    return this;
  }

   /**
   * 支付宝协议状态。解约成功则返回success
   * @return agreementStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "success", value = "支付宝协议状态。解约成功则返回success")

  public String getAgreementStatus() {
    return agreementStatus;
  }


  public void setAgreementStatus(String agreementStatus) {
    this.agreementStatus = agreementStatus;
  }


  public AlipayEbppPdeductSignCancelResponseModel outAgreementId(String outAgreementId) {
    
    this.outAgreementId = outAgreementId;
    return this;
  }

   /**
   * 商户代扣协议ID
   * @return outAgreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23433333333", value = "商户代扣协议ID")

  public String getOutAgreementId() {
    return outAgreementId;
  }


  public void setOutAgreementId(String outAgreementId) {
    this.outAgreementId = outAgreementId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppPdeductSignCancelResponseModel alipayEbppPdeductSignCancelResponseModel = (AlipayEbppPdeductSignCancelResponseModel) o;
    return Objects.equals(this.agreementId, alipayEbppPdeductSignCancelResponseModel.agreementId) &&
        Objects.equals(this.agreementStatus, alipayEbppPdeductSignCancelResponseModel.agreementStatus) &&
        Objects.equals(this.outAgreementId, alipayEbppPdeductSignCancelResponseModel.outAgreementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, agreementStatus, outAgreementId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppPdeductSignCancelResponseModel {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    agreementStatus: ").append(toIndentedString(agreementStatus)).append("\n");
    sb.append("    outAgreementId: ").append(toIndentedString(outAgreementId)).append("\n");
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
    openapiFields.add("agreement_id");
    openapiFields.add("agreement_status");
    openapiFields.add("out_agreement_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppPdeductSignCancelResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppPdeductSignCancelResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppPdeductSignCancelResponseModel is not found in the empty JSON string", AlipayEbppPdeductSignCancelResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppPdeductSignCancelResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppPdeductSignCancelResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("agreement_status") != null && !jsonObj.get("agreement_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_status").toString()));
      }
      if (jsonObj.get("out_agreement_id") != null && !jsonObj.get("out_agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_agreement_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppPdeductSignCancelResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppPdeductSignCancelResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppPdeductSignCancelResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppPdeductSignCancelResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppPdeductSignCancelResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppPdeductSignCancelResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppPdeductSignCancelResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppPdeductSignCancelResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppPdeductSignCancelResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppPdeductSignCancelResponseModel
  */
  public static AlipayEbppPdeductSignCancelResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppPdeductSignCancelResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppPdeductSignCancelResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

