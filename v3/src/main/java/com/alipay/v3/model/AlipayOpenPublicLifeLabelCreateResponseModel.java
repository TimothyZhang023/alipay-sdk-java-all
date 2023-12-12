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
 * AlipayOpenPublicLifeLabelCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicLifeLabelCreateResponseModel {
  public static final String SERIALIZED_NAME_LABEL_ID = "label_id";
  @SerializedName(SERIALIZED_NAME_LABEL_ID)
  private String labelId;

  public AlipayOpenPublicLifeLabelCreateResponseModel() { 
  }

  public AlipayOpenPublicLifeLabelCreateResponseModel labelId(String labelId) {
    
    this.labelId = labelId;
    return this;
  }

   /**
   * 标签id
   * @return labelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "标签id")

  public String getLabelId() {
    return labelId;
  }


  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicLifeLabelCreateResponseModel alipayOpenPublicLifeLabelCreateResponseModel = (AlipayOpenPublicLifeLabelCreateResponseModel) o;
    return Objects.equals(this.labelId, alipayOpenPublicLifeLabelCreateResponseModel.labelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicLifeLabelCreateResponseModel {\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicLifeLabelCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicLifeLabelCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicLifeLabelCreateResponseModel is not found in the empty JSON string", AlipayOpenPublicLifeLabelCreateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicLifeLabelCreateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicLifeLabelCreateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("label_id") != null && !jsonObj.get("label_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicLifeLabelCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicLifeLabelCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicLifeLabelCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicLifeLabelCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicLifeLabelCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicLifeLabelCreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicLifeLabelCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicLifeLabelCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicLifeLabelCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicLifeLabelCreateResponseModel
  */
  public static AlipayOpenPublicLifeLabelCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicLifeLabelCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicLifeLabelCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

