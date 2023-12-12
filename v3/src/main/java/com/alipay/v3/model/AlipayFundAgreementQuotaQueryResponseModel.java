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
import com.alipay.v3.model.QuotaQueryResponse;
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
 * AlipayFundAgreementQuotaQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundAgreementQuotaQueryResponseModel {
  public static final String SERIALIZED_NAME_QUOTA_QUERY_RESPONSE_LIST = "quota_query_response_list";
  @SerializedName(SERIALIZED_NAME_QUOTA_QUERY_RESPONSE_LIST)
  private List<QuotaQueryResponse> quotaQueryResponseList = null;

  public AlipayFundAgreementQuotaQueryResponseModel() { 
  }

  public AlipayFundAgreementQuotaQueryResponseModel quotaQueryResponseList(List<QuotaQueryResponse> quotaQueryResponseList) {
    
    this.quotaQueryResponseList = quotaQueryResponseList;
    return this;
  }

  public AlipayFundAgreementQuotaQueryResponseModel addQuotaQueryResponseListItem(QuotaQueryResponse quotaQueryResponseListItem) {
    if (this.quotaQueryResponseList == null) {
      this.quotaQueryResponseList = new ArrayList<>();
    }
    this.quotaQueryResponseList.add(quotaQueryResponseListItem);
    return this;
  }

   /**
   * 单个协议的额度查询结果
   * @return quotaQueryResponseList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单个协议的额度查询结果")

  public List<QuotaQueryResponse> getQuotaQueryResponseList() {
    return quotaQueryResponseList;
  }


  public void setQuotaQueryResponseList(List<QuotaQueryResponse> quotaQueryResponseList) {
    this.quotaQueryResponseList = quotaQueryResponseList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundAgreementQuotaQueryResponseModel alipayFundAgreementQuotaQueryResponseModel = (AlipayFundAgreementQuotaQueryResponseModel) o;
    return Objects.equals(this.quotaQueryResponseList, alipayFundAgreementQuotaQueryResponseModel.quotaQueryResponseList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotaQueryResponseList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundAgreementQuotaQueryResponseModel {\n");
    sb.append("    quotaQueryResponseList: ").append(toIndentedString(quotaQueryResponseList)).append("\n");
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
    openapiFields.add("quota_query_response_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundAgreementQuotaQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundAgreementQuotaQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundAgreementQuotaQueryResponseModel is not found in the empty JSON string", AlipayFundAgreementQuotaQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundAgreementQuotaQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundAgreementQuotaQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayquotaQueryResponseList = jsonObj.getAsJsonArray("quota_query_response_list");
      if (jsonArrayquotaQueryResponseList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("quota_query_response_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `quota_query_response_list` to be an array in the JSON string but got `%s`", jsonObj.get("quota_query_response_list").toString()));
        }

        // validate the optional field `quota_query_response_list` (array)
        for (int i = 0; i < jsonArrayquotaQueryResponseList.size(); i++) {
          QuotaQueryResponse.validateJsonObject(jsonArrayquotaQueryResponseList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundAgreementQuotaQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundAgreementQuotaQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundAgreementQuotaQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundAgreementQuotaQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundAgreementQuotaQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundAgreementQuotaQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundAgreementQuotaQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundAgreementQuotaQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundAgreementQuotaQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundAgreementQuotaQueryResponseModel
  */
  public static AlipayFundAgreementQuotaQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundAgreementQuotaQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundAgreementQuotaQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

