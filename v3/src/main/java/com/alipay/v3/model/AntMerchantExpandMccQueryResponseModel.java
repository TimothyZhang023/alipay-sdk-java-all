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
import com.alipay.v3.model.MccQueryInfo;
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
 * AntMerchantExpandMccQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandMccQueryResponseModel {
  public static final String SERIALIZED_NAME_MCC_INFO_LIST = "mcc_info_list";
  @SerializedName(SERIALIZED_NAME_MCC_INFO_LIST)
  private List<MccQueryInfo> mccInfoList = null;

  public AntMerchantExpandMccQueryResponseModel() { 
  }

  public AntMerchantExpandMccQueryResponseModel mccInfoList(List<MccQueryInfo> mccInfoList) {
    
    this.mccInfoList = mccInfoList;
    return this;
  }

  public AntMerchantExpandMccQueryResponseModel addMccInfoListItem(MccQueryInfo mccInfoListItem) {
    if (this.mccInfoList == null) {
      this.mccInfoList = new ArrayList<>();
    }
    this.mccInfoList.add(mccInfoListItem);
    return this;
  }

   /**
   * mcc查询信息结果列表
   * @return mccInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "mcc查询信息结果列表")

  public List<MccQueryInfo> getMccInfoList() {
    return mccInfoList;
  }


  public void setMccInfoList(List<MccQueryInfo> mccInfoList) {
    this.mccInfoList = mccInfoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntMerchantExpandMccQueryResponseModel antMerchantExpandMccQueryResponseModel = (AntMerchantExpandMccQueryResponseModel) o;
    return Objects.equals(this.mccInfoList, antMerchantExpandMccQueryResponseModel.mccInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mccInfoList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandMccQueryResponseModel {\n");
    sb.append("    mccInfoList: ").append(toIndentedString(mccInfoList)).append("\n");
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
    openapiFields.add("mcc_info_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandMccQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandMccQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandMccQueryResponseModel is not found in the empty JSON string", AntMerchantExpandMccQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AntMerchantExpandMccQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AntMerchantExpandMccQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraymccInfoList = jsonObj.getAsJsonArray("mcc_info_list");
      if (jsonArraymccInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("mcc_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `mcc_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("mcc_info_list").toString()));
        }

        // validate the optional field `mcc_info_list` (array)
        for (int i = 0; i < jsonArraymccInfoList.size(); i++) {
          MccQueryInfo.validateJsonObject(jsonArraymccInfoList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AntMerchantExpandMccQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandMccQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandMccQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandMccQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandMccQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandMccQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AntMerchantExpandMccQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AntMerchantExpandMccQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandMccQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandMccQueryResponseModel
  */
  public static AntMerchantExpandMccQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandMccQueryResponseModel.class);
  }

 /**
  * Convert an instance of AntMerchantExpandMccQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

