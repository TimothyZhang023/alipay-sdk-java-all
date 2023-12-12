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
 * AlipayMarketingRecruitEnrollCloseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingRecruitEnrollCloseModel {
  public static final String SERIALIZED_NAME_ENROLL_ID = "enroll_id";
  @SerializedName(SERIALIZED_NAME_ENROLL_ID)
  private String enrollId;

  public AlipayMarketingRecruitEnrollCloseModel() { 
  }

  public AlipayMarketingRecruitEnrollCloseModel enrollId(String enrollId) {
    
    this.enrollId = enrollId;
    return this;
  }

   /**
   * 活动报名ID
   * @return enrollId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021041201000200000000999999", value = "活动报名ID")

  public String getEnrollId() {
    return enrollId;
  }


  public void setEnrollId(String enrollId) {
    this.enrollId = enrollId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingRecruitEnrollCloseModel alipayMarketingRecruitEnrollCloseModel = (AlipayMarketingRecruitEnrollCloseModel) o;
    return Objects.equals(this.enrollId, alipayMarketingRecruitEnrollCloseModel.enrollId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingRecruitEnrollCloseModel {\n");
    sb.append("    enrollId: ").append(toIndentedString(enrollId)).append("\n");
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
    openapiFields.add("enroll_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingRecruitEnrollCloseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingRecruitEnrollCloseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingRecruitEnrollCloseModel is not found in the empty JSON string", AlipayMarketingRecruitEnrollCloseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingRecruitEnrollCloseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingRecruitEnrollCloseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("enroll_id") != null && !jsonObj.get("enroll_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enroll_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enroll_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingRecruitEnrollCloseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingRecruitEnrollCloseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingRecruitEnrollCloseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingRecruitEnrollCloseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingRecruitEnrollCloseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingRecruitEnrollCloseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingRecruitEnrollCloseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingRecruitEnrollCloseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingRecruitEnrollCloseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingRecruitEnrollCloseModel
  */
  public static AlipayMarketingRecruitEnrollCloseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingRecruitEnrollCloseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingRecruitEnrollCloseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

