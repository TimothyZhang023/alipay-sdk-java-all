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
import com.alipay.v3.model.RoyaltyDetailInfos;
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
 * RoyaltyInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoyaltyInfo {
  public static final String SERIALIZED_NAME_ROYALTY_DETAIL_INFOS = "royalty_detail_infos";
  @SerializedName(SERIALIZED_NAME_ROYALTY_DETAIL_INFOS)
  private List<RoyaltyDetailInfos> royaltyDetailInfos = null;

  public static final String SERIALIZED_NAME_ROYALTY_TYPE = "royalty_type";
  @SerializedName(SERIALIZED_NAME_ROYALTY_TYPE)
  private String royaltyType;

  public RoyaltyInfo() { 
  }

  public RoyaltyInfo royaltyDetailInfos(List<RoyaltyDetailInfos> royaltyDetailInfos) {
    
    this.royaltyDetailInfos = royaltyDetailInfos;
    return this;
  }

  public RoyaltyInfo addRoyaltyDetailInfosItem(RoyaltyDetailInfos royaltyDetailInfosItem) {
    if (this.royaltyDetailInfos == null) {
      this.royaltyDetailInfos = new ArrayList<>();
    }
    this.royaltyDetailInfos.add(royaltyDetailInfosItem);
    return this;
  }

   /**
   * 分账明细的信息，可以描述多条分账指令，json数组。
   * @return royaltyDetailInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账明细的信息，可以描述多条分账指令，json数组。")

  public List<RoyaltyDetailInfos> getRoyaltyDetailInfos() {
    return royaltyDetailInfos;
  }


  public void setRoyaltyDetailInfos(List<RoyaltyDetailInfos> royaltyDetailInfos) {
    this.royaltyDetailInfos = royaltyDetailInfos;
  }


  public RoyaltyInfo royaltyType(String royaltyType) {
    
    this.royaltyType = royaltyType;
    return this;
  }

   /**
   * 分账类型  卖家的分账类型，目前只支持传入ROYALTY（普通分账类型）。
   * @return royaltyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账类型  卖家的分账类型，目前只支持传入ROYALTY（普通分账类型）。")

  public String getRoyaltyType() {
    return royaltyType;
  }


  public void setRoyaltyType(String royaltyType) {
    this.royaltyType = royaltyType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoyaltyInfo royaltyInfo = (RoyaltyInfo) o;
    return Objects.equals(this.royaltyDetailInfos, royaltyInfo.royaltyDetailInfos) &&
        Objects.equals(this.royaltyType, royaltyInfo.royaltyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(royaltyDetailInfos, royaltyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoyaltyInfo {\n");
    sb.append("    royaltyDetailInfos: ").append(toIndentedString(royaltyDetailInfos)).append("\n");
    sb.append("    royaltyType: ").append(toIndentedString(royaltyType)).append("\n");
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
    openapiFields.add("royalty_detail_infos");
    openapiFields.add("royalty_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RoyaltyInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RoyaltyInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RoyaltyInfo is not found in the empty JSON string", RoyaltyInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RoyaltyInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RoyaltyInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayroyaltyDetailInfos = jsonObj.getAsJsonArray("royalty_detail_infos");
      if (jsonArrayroyaltyDetailInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("royalty_detail_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `royalty_detail_infos` to be an array in the JSON string but got `%s`", jsonObj.get("royalty_detail_infos").toString()));
        }

        // validate the optional field `royalty_detail_infos` (array)
        for (int i = 0; i < jsonArrayroyaltyDetailInfos.size(); i++) {
          RoyaltyDetailInfos.validateJsonObject(jsonArrayroyaltyDetailInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("royalty_type") != null && !jsonObj.get("royalty_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `royalty_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("royalty_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RoyaltyInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RoyaltyInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RoyaltyInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RoyaltyInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RoyaltyInfo>() {
           @Override
           public void write(JsonWriter out, RoyaltyInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RoyaltyInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RoyaltyInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RoyaltyInfo
  * @throws IOException if the JSON string is invalid with respect to RoyaltyInfo
  */
  public static RoyaltyInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RoyaltyInfo.class);
  }

 /**
  * Convert an instance of RoyaltyInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

