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
 * AlipayOpenMiniTemplatemsgMaketingstatusModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniTemplatemsgMaketingstatusModifyModel {
  public static final String SERIALIZED_NAME_DETAIL_ID = "detail_id";
  @SerializedName(SERIALIZED_NAME_DETAIL_ID)
  private String detailId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayOpenMiniTemplatemsgMaketingstatusModifyModel() { 
  }

  public AlipayOpenMiniTemplatemsgMaketingstatusModifyModel detailId(String detailId) {
    
    this.detailId = detailId;
    return this;
  }

   /**
   * 营销投放详情id
   * @return detailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MDDadsfeeijdfiedfef32r3jkdeaqee", value = "营销投放详情id")

  public String getDetailId() {
    return detailId;
  }


  public void setDetailId(String detailId) {
    this.detailId = detailId;
  }


  public AlipayOpenMiniTemplatemsgMaketingstatusModifyModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 投放详情状态值，如：INIT:下线状态，ON_LINE:上线状态，DELETED:删除状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DELETED", value = "投放详情状态值，如：INIT:下线状态，ON_LINE:上线状态，DELETED:删除状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniTemplatemsgMaketingstatusModifyModel alipayOpenMiniTemplatemsgMaketingstatusModifyModel = (AlipayOpenMiniTemplatemsgMaketingstatusModifyModel) o;
    return Objects.equals(this.detailId, alipayOpenMiniTemplatemsgMaketingstatusModifyModel.detailId) &&
        Objects.equals(this.status, alipayOpenMiniTemplatemsgMaketingstatusModifyModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniTemplatemsgMaketingstatusModifyModel {\n");
    sb.append("    detailId: ").append(toIndentedString(detailId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("detail_id");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniTemplatemsgMaketingstatusModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniTemplatemsgMaketingstatusModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniTemplatemsgMaketingstatusModifyModel is not found in the empty JSON string", AlipayOpenMiniTemplatemsgMaketingstatusModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniTemplatemsgMaketingstatusModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniTemplatemsgMaketingstatusModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("detail_id") != null && !jsonObj.get("detail_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniTemplatemsgMaketingstatusModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniTemplatemsgMaketingstatusModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniTemplatemsgMaketingstatusModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniTemplatemsgMaketingstatusModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniTemplatemsgMaketingstatusModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniTemplatemsgMaketingstatusModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniTemplatemsgMaketingstatusModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniTemplatemsgMaketingstatusModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniTemplatemsgMaketingstatusModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniTemplatemsgMaketingstatusModifyModel
  */
  public static AlipayOpenMiniTemplatemsgMaketingstatusModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniTemplatemsgMaketingstatusModifyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniTemplatemsgMaketingstatusModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

