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
 * ContributeDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContributeDetail {
  public static final String SERIALIZED_NAME_CONTRIBUTE_AMOUNT = "contribute_amount";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTE_AMOUNT)
  private String contributeAmount;

  public static final String SERIALIZED_NAME_CONTRIBUTE_TYPE = "contribute_type";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTE_TYPE)
  private String contributeType;

  public ContributeDetail() { 
  }

  public ContributeDetail contributeAmount(String contributeAmount) {
    
    this.contributeAmount = contributeAmount;
    return this;
  }

   /**
   * 出资方金额
   * @return contributeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "出资方金额")

  public String getContributeAmount() {
    return contributeAmount;
  }


  public void setContributeAmount(String contributeAmount) {
    this.contributeAmount = contributeAmount;
  }


  public ContributeDetail contributeType(String contributeType) {
    
    this.contributeType = contributeType;
    return this;
  }

   /**
   * 出资方类型
   * @return contributeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "出资方类型")

  public String getContributeType() {
    return contributeType;
  }


  public void setContributeType(String contributeType) {
    this.contributeType = contributeType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContributeDetail contributeDetail = (ContributeDetail) o;
    return Objects.equals(this.contributeAmount, contributeDetail.contributeAmount) &&
        Objects.equals(this.contributeType, contributeDetail.contributeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contributeAmount, contributeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContributeDetail {\n");
    sb.append("    contributeAmount: ").append(toIndentedString(contributeAmount)).append("\n");
    sb.append("    contributeType: ").append(toIndentedString(contributeType)).append("\n");
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
    openapiFields.add("contribute_amount");
    openapiFields.add("contribute_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContributeDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ContributeDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContributeDetail is not found in the empty JSON string", ContributeDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContributeDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContributeDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("contribute_amount") != null && !jsonObj.get("contribute_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contribute_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contribute_amount").toString()));
      }
      if (jsonObj.get("contribute_type") != null && !jsonObj.get("contribute_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contribute_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contribute_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContributeDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContributeDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContributeDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContributeDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<ContributeDetail>() {
           @Override
           public void write(JsonWriter out, ContributeDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContributeDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContributeDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContributeDetail
  * @throws IOException if the JSON string is invalid with respect to ContributeDetail
  */
  public static ContributeDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContributeDetail.class);
  }

 /**
  * Convert an instance of ContributeDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

