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
import com.alipay.v3.model.RecruitEnrollMerchant;
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
 * AlipayMarketingRecruitPlanQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingRecruitPlanQueryModel {
  public static final String SERIALIZED_NAME_ENROLL_MERCHANT = "enroll_merchant";
  @SerializedName(SERIALIZED_NAME_ENROLL_MERCHANT)
  private RecruitEnrollMerchant enrollMerchant;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public AlipayMarketingRecruitPlanQueryModel() { 
  }

  public AlipayMarketingRecruitPlanQueryModel enrollMerchant(RecruitEnrollMerchant enrollMerchant) {
    
    this.enrollMerchant = enrollMerchant;
    return this;
  }

   /**
   * Get enrollMerchant
   * @return enrollMerchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecruitEnrollMerchant getEnrollMerchant() {
    return enrollMerchant;
  }


  public void setEnrollMerchant(RecruitEnrollMerchant enrollMerchant) {
    this.enrollMerchant = enrollMerchant;
  }


  public AlipayMarketingRecruitPlanQueryModel planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * 招商方案ID
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021042001000100000000668277", value = "招商方案ID")

  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingRecruitPlanQueryModel alipayMarketingRecruitPlanQueryModel = (AlipayMarketingRecruitPlanQueryModel) o;
    return Objects.equals(this.enrollMerchant, alipayMarketingRecruitPlanQueryModel.enrollMerchant) &&
        Objects.equals(this.planId, alipayMarketingRecruitPlanQueryModel.planId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollMerchant, planId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingRecruitPlanQueryModel {\n");
    sb.append("    enrollMerchant: ").append(toIndentedString(enrollMerchant)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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
    openapiFields.add("enroll_merchant");
    openapiFields.add("plan_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingRecruitPlanQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingRecruitPlanQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingRecruitPlanQueryModel is not found in the empty JSON string", AlipayMarketingRecruitPlanQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingRecruitPlanQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingRecruitPlanQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `enroll_merchant`
      if (jsonObj.getAsJsonObject("enroll_merchant") != null) {
        RecruitEnrollMerchant.validateJsonObject(jsonObj.getAsJsonObject("enroll_merchant"));
      }
      if (jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingRecruitPlanQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingRecruitPlanQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingRecruitPlanQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingRecruitPlanQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingRecruitPlanQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingRecruitPlanQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingRecruitPlanQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingRecruitPlanQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingRecruitPlanQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingRecruitPlanQueryModel
  */
  public static AlipayMarketingRecruitPlanQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingRecruitPlanQueryModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingRecruitPlanQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

