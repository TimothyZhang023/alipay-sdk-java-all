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
import com.alipay.v3.model.ErrorMatcher;
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
 * AlipayOpenPublicMatchuserLabelDeleteResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicMatchuserLabelDeleteResponseModel {
  public static final String SERIALIZED_NAME_ERROR_COUNT = "error_count";
  @SerializedName(SERIALIZED_NAME_ERROR_COUNT)
  private Integer errorCount;

  public static final String SERIALIZED_NAME_ERROR_MATCHERS = "error_matchers";
  @SerializedName(SERIALIZED_NAME_ERROR_MATCHERS)
  private List<ErrorMatcher> errorMatchers = null;

  public AlipayOpenPublicMatchuserLabelDeleteResponseModel() { 
  }

  public AlipayOpenPublicMatchuserLabelDeleteResponseModel errorCount(Integer errorCount) {
    
    this.errorCount = errorCount;
    return this;
  }

   /**
   * 用户打标失败数量
   * @return errorCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "用户打标失败数量")

  public Integer getErrorCount() {
    return errorCount;
  }


  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }


  public AlipayOpenPublicMatchuserLabelDeleteResponseModel errorMatchers(List<ErrorMatcher> errorMatchers) {
    
    this.errorMatchers = errorMatchers;
    return this;
  }

  public AlipayOpenPublicMatchuserLabelDeleteResponseModel addErrorMatchersItem(ErrorMatcher errorMatchersItem) {
    if (this.errorMatchers == null) {
      this.errorMatchers = new ArrayList<>();
    }
    this.errorMatchers.add(errorMatchersItem);
    return this;
  }

   /**
   * 出错的匹配器列表
   * @return errorMatchers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "出错的匹配器列表")

  public List<ErrorMatcher> getErrorMatchers() {
    return errorMatchers;
  }


  public void setErrorMatchers(List<ErrorMatcher> errorMatchers) {
    this.errorMatchers = errorMatchers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicMatchuserLabelDeleteResponseModel alipayOpenPublicMatchuserLabelDeleteResponseModel = (AlipayOpenPublicMatchuserLabelDeleteResponseModel) o;
    return Objects.equals(this.errorCount, alipayOpenPublicMatchuserLabelDeleteResponseModel.errorCount) &&
        Objects.equals(this.errorMatchers, alipayOpenPublicMatchuserLabelDeleteResponseModel.errorMatchers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCount, errorMatchers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicMatchuserLabelDeleteResponseModel {\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    errorMatchers: ").append(toIndentedString(errorMatchers)).append("\n");
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
    openapiFields.add("error_count");
    openapiFields.add("error_matchers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicMatchuserLabelDeleteResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicMatchuserLabelDeleteResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicMatchuserLabelDeleteResponseModel is not found in the empty JSON string", AlipayOpenPublicMatchuserLabelDeleteResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicMatchuserLabelDeleteResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicMatchuserLabelDeleteResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayerrorMatchers = jsonObj.getAsJsonArray("error_matchers");
      if (jsonArrayerrorMatchers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("error_matchers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `error_matchers` to be an array in the JSON string but got `%s`", jsonObj.get("error_matchers").toString()));
        }

        // validate the optional field `error_matchers` (array)
        for (int i = 0; i < jsonArrayerrorMatchers.size(); i++) {
          ErrorMatcher.validateJsonObject(jsonArrayerrorMatchers.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicMatchuserLabelDeleteResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicMatchuserLabelDeleteResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicMatchuserLabelDeleteResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicMatchuserLabelDeleteResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicMatchuserLabelDeleteResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicMatchuserLabelDeleteResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicMatchuserLabelDeleteResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicMatchuserLabelDeleteResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicMatchuserLabelDeleteResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicMatchuserLabelDeleteResponseModel
  */
  public static AlipayOpenPublicMatchuserLabelDeleteResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicMatchuserLabelDeleteResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicMatchuserLabelDeleteResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

