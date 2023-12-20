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
 * QueryLabelRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryLabelRule {
  public static final String SERIALIZED_NAME_LABEL_ID = "label_id";
  @SerializedName(SERIALIZED_NAME_LABEL_ID)
  private String labelId;

  public static final String SERIALIZED_NAME_LABEL_NAME = "label_name";
  @SerializedName(SERIALIZED_NAME_LABEL_NAME)
  private String labelName;

  public static final String SERIALIZED_NAME_LABEL_VALUE = "label_value";
  @SerializedName(SERIALIZED_NAME_LABEL_VALUE)
  private String labelValue;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public QueryLabelRule() { 
  }

  public QueryLabelRule labelId(String labelId) {
    
    this.labelId = labelId;
    return this;
  }

   /**
   * 标签id
   * @return labelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签id")

  public String getLabelId() {
    return labelId;
  }


  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }


  public QueryLabelRule labelName(String labelName) {
    
    this.labelName = labelName;
    return this;
  }

   /**
   * 标签名
   * @return labelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签名")

  public String getLabelName() {
    return labelName;
  }


  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }


  public QueryLabelRule labelValue(String labelValue) {
    
    this.labelValue = labelValue;
    return this;
  }

   /**
   * 标签值，多值会用英文逗号分隔
   * @return labelValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签值，多值会用英文逗号分隔")

  public String getLabelValue() {
    return labelValue;
  }


  public void setLabelValue(String labelValue) {
    this.labelValue = labelValue;
  }


  public QueryLabelRule operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * 运算符
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "运算符")

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryLabelRule queryLabelRule = (QueryLabelRule) o;
    return Objects.equals(this.labelId, queryLabelRule.labelId) &&
        Objects.equals(this.labelName, queryLabelRule.labelName) &&
        Objects.equals(this.labelValue, queryLabelRule.labelValue) &&
        Objects.equals(this.operator, queryLabelRule.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelId, labelName, labelValue, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryLabelRule {\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
    sb.append("    labelValue: ").append(toIndentedString(labelValue)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
    openapiFields.add("label_id");
    openapiFields.add("label_name");
    openapiFields.add("label_value");
    openapiFields.add("operator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QueryLabelRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QueryLabelRule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryLabelRule is not found in the empty JSON string", QueryLabelRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!QueryLabelRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryLabelRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("label_id") != null && !jsonObj.get("label_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_id").toString()));
      }
      if (jsonObj.get("label_name") != null && !jsonObj.get("label_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_name").toString()));
      }
      if (jsonObj.get("label_value") != null && !jsonObj.get("label_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_value").toString()));
      }
      if (jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryLabelRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryLabelRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryLabelRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryLabelRule.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryLabelRule>() {
           @Override
           public void write(JsonWriter out, QueryLabelRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryLabelRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryLabelRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryLabelRule
  * @throws IOException if the JSON string is invalid with respect to QueryLabelRule
  */
  public static QueryLabelRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryLabelRule.class);
  }

 /**
  * Convert an instance of QueryLabelRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

