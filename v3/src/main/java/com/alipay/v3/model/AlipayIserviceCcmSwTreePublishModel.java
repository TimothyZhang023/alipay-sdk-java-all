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
 * AlipayIserviceCcmSwTreePublishModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmSwTreePublishModel {
  public static final String SERIALIZED_NAME_CCS_INSTANCE_ID = "ccs_instance_id";
  @SerializedName(SERIALIZED_NAME_CCS_INSTANCE_ID)
  private String ccsInstanceId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public AlipayIserviceCcmSwTreePublishModel() { 
  }

  public AlipayIserviceCcmSwTreePublishModel ccsInstanceId(String ccsInstanceId) {
    
    this.ccsInstanceId = ccsInstanceId;
    return this;
  }

   /**
   * 子部门ID，不传为默认部门
   * @return ccsInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZPNASDK", value = "子部门ID，不传为默认部门")

  public String getCcsInstanceId() {
    return ccsInstanceId;
  }


  public void setCcsInstanceId(String ccsInstanceId) {
    this.ccsInstanceId = ccsInstanceId;
  }


  public AlipayIserviceCcmSwTreePublishModel id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 类目ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "类目ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmSwTreePublishModel alipayIserviceCcmSwTreePublishModel = (AlipayIserviceCcmSwTreePublishModel) o;
    return Objects.equals(this.ccsInstanceId, alipayIserviceCcmSwTreePublishModel.ccsInstanceId) &&
        Objects.equals(this.id, alipayIserviceCcmSwTreePublishModel.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccsInstanceId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmSwTreePublishModel {\n");
    sb.append("    ccsInstanceId: ").append(toIndentedString(ccsInstanceId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("ccs_instance_id");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmSwTreePublishModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmSwTreePublishModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmSwTreePublishModel is not found in the empty JSON string", AlipayIserviceCcmSwTreePublishModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmSwTreePublishModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmSwTreePublishModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ccs_instance_id") != null && !jsonObj.get("ccs_instance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccs_instance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ccs_instance_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmSwTreePublishModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmSwTreePublishModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmSwTreePublishModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmSwTreePublishModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmSwTreePublishModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmSwTreePublishModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmSwTreePublishModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmSwTreePublishModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmSwTreePublishModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmSwTreePublishModel
  */
  public static AlipayIserviceCcmSwTreePublishModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmSwTreePublishModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmSwTreePublishModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

