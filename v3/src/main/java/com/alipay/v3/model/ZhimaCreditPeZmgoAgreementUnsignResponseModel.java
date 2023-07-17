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
 * ZhimaCreditPeZmgoAgreementUnsignResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPeZmgoAgreementUnsignResponseModel {
  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_WITHHOLD_PLAN_NO = "withhold_plan_no";
  @SerializedName(SERIALIZED_NAME_WITHHOLD_PLAN_NO)
  private String withholdPlanNo;

  public ZhimaCreditPeZmgoAgreementUnsignResponseModel() { 
  }

  public ZhimaCreditPeZmgoAgreementUnsignResponseModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 支付宝系统中用以唯一标识用户签约记录的编号。
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMGO_AGR2020122710020604120000000001", value = "支付宝系统中用以唯一标识用户签约记录的编号。")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public ZhimaCreditPeZmgoAgreementUnsignResponseModel withholdPlanNo(String withholdPlanNo) {
    
    this.withholdPlanNo = withholdPlanNo;
    return this;
  }

   /**
   * 调用芝麻GO结算受理接口时，需要传入该值
   * @return withholdPlanNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMGO_WHD2021022210020603120000301613", value = "调用芝麻GO结算受理接口时，需要传入该值")

  public String getWithholdPlanNo() {
    return withholdPlanNo;
  }


  public void setWithholdPlanNo(String withholdPlanNo) {
    this.withholdPlanNo = withholdPlanNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaCreditPeZmgoAgreementUnsignResponseModel zhimaCreditPeZmgoAgreementUnsignResponseModel = (ZhimaCreditPeZmgoAgreementUnsignResponseModel) o;
    return Objects.equals(this.agreementId, zhimaCreditPeZmgoAgreementUnsignResponseModel.agreementId) &&
        Objects.equals(this.withholdPlanNo, zhimaCreditPeZmgoAgreementUnsignResponseModel.withholdPlanNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, withholdPlanNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPeZmgoAgreementUnsignResponseModel {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    withholdPlanNo: ").append(toIndentedString(withholdPlanNo)).append("\n");
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
    openapiFields.add("withhold_plan_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPeZmgoAgreementUnsignResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPeZmgoAgreementUnsignResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPeZmgoAgreementUnsignResponseModel is not found in the empty JSON string", ZhimaCreditPeZmgoAgreementUnsignResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCreditPeZmgoAgreementUnsignResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCreditPeZmgoAgreementUnsignResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("withhold_plan_no") != null && !jsonObj.get("withhold_plan_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withhold_plan_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withhold_plan_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPeZmgoAgreementUnsignResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPeZmgoAgreementUnsignResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPeZmgoAgreementUnsignResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPeZmgoAgreementUnsignResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPeZmgoAgreementUnsignResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPeZmgoAgreementUnsignResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCreditPeZmgoAgreementUnsignResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaCreditPeZmgoAgreementUnsignResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPeZmgoAgreementUnsignResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPeZmgoAgreementUnsignResponseModel
  */
  public static ZhimaCreditPeZmgoAgreementUnsignResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPeZmgoAgreementUnsignResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPeZmgoAgreementUnsignResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

