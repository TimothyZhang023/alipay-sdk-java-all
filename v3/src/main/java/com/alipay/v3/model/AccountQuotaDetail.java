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
 * AccountQuotaDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountQuotaDetail {
  public static final String SERIALIZED_NAME_QUOTA_AMOUNT = "quota_amount";
  @SerializedName(SERIALIZED_NAME_QUOTA_AMOUNT)
  private Integer quotaAmount;

  public static final String SERIALIZED_NAME_QUOTA_DIMENSION = "quota_dimension";
  @SerializedName(SERIALIZED_NAME_QUOTA_DIMENSION)
  private String quotaDimension;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public AccountQuotaDetail() { 
  }

  public AccountQuotaDetail quotaAmount(Integer quotaAmount) {
    
    this.quotaAmount = quotaAmount;
    return this;
  }

   /**
   * 周期内的额度上限
   * @return quotaAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50000", value = "周期内的额度上限")

  public Integer getQuotaAmount() {
    return quotaAmount;
  }


  public void setQuotaAmount(Integer quotaAmount) {
    this.quotaAmount = quotaAmount;
  }


  public AccountQuotaDetail quotaDimension(String quotaDimension) {
    
    this.quotaDimension = quotaDimension;
    return this;
  }

   /**
   * 额度周期，有限枚举
   * @return quotaDimension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DAY", value = "额度周期，有限枚举")

  public String getQuotaDimension() {
    return quotaDimension;
  }


  public void setQuotaDimension(String quotaDimension) {
    this.quotaDimension = quotaDimension;
  }


  public AccountQuotaDetail role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * 角色
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PAYER", value = "角色")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountQuotaDetail accountQuotaDetail = (AccountQuotaDetail) o;
    return Objects.equals(this.quotaAmount, accountQuotaDetail.quotaAmount) &&
        Objects.equals(this.quotaDimension, accountQuotaDetail.quotaDimension) &&
        Objects.equals(this.role, accountQuotaDetail.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotaAmount, quotaDimension, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountQuotaDetail {\n");
    sb.append("    quotaAmount: ").append(toIndentedString(quotaAmount)).append("\n");
    sb.append("    quotaDimension: ").append(toIndentedString(quotaDimension)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
    openapiFields.add("quota_amount");
    openapiFields.add("quota_dimension");
    openapiFields.add("role");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountQuotaDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccountQuotaDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountQuotaDetail is not found in the empty JSON string", AccountQuotaDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccountQuotaDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountQuotaDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("quota_dimension") != null && !jsonObj.get("quota_dimension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_dimension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_dimension").toString()));
      }
      if (jsonObj.get("role") != null && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountQuotaDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountQuotaDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountQuotaDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountQuotaDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountQuotaDetail>() {
           @Override
           public void write(JsonWriter out, AccountQuotaDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountQuotaDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountQuotaDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountQuotaDetail
  * @throws IOException if the JSON string is invalid with respect to AccountQuotaDetail
  */
  public static AccountQuotaDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountQuotaDetail.class);
  }

 /**
  * Convert an instance of AccountQuotaDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

