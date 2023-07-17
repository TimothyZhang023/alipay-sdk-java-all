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
 * AlipayMerchantItemFileUploadResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantItemFileUploadResponseModel {
  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private String materialId;

  public static final String SERIALIZED_NAME_MATERIAL_KEY = "material_key";
  @SerializedName(SERIALIZED_NAME_MATERIAL_KEY)
  private String materialKey;

  public AlipayMerchantItemFileUploadResponseModel() { 
  }

  public AlipayMerchantItemFileUploadResponseModel materialId(String materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 文件在商品中心的素材标识（素材ID长期有效）
   * @return materialId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019010100502200000000000001", value = "文件在商品中心的素材标识（素材ID长期有效）")

  public String getMaterialId() {
    return materialId;
  }


  public void setMaterialId(String materialId) {
    this.materialId = materialId;
  }


  public AlipayMerchantItemFileUploadResponseModel materialKey(String materialKey) {
    
    this.materialKey = materialKey;
    return this;
  }

   /**
   * 文件在商品中心的素材标示，创建/更新商品时使用
   * @return materialKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*bJXMRYFoBcIAAAGGGGAAAABjAQWWWW", value = "文件在商品中心的素材标示，创建/更新商品时使用")

  public String getMaterialKey() {
    return materialKey;
  }


  public void setMaterialKey(String materialKey) {
    this.materialKey = materialKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMerchantItemFileUploadResponseModel alipayMerchantItemFileUploadResponseModel = (AlipayMerchantItemFileUploadResponseModel) o;
    return Objects.equals(this.materialId, alipayMerchantItemFileUploadResponseModel.materialId) &&
        Objects.equals(this.materialKey, alipayMerchantItemFileUploadResponseModel.materialKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialId, materialKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantItemFileUploadResponseModel {\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialKey: ").append(toIndentedString(materialKey)).append("\n");
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
    openapiFields.add("material_id");
    openapiFields.add("material_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantItemFileUploadResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantItemFileUploadResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantItemFileUploadResponseModel is not found in the empty JSON string", AlipayMerchantItemFileUploadResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMerchantItemFileUploadResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMerchantItemFileUploadResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("material_id") != null && !jsonObj.get("material_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("material_id").toString()));
      }
      if (jsonObj.get("material_key") != null && !jsonObj.get("material_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("material_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantItemFileUploadResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantItemFileUploadResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantItemFileUploadResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantItemFileUploadResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantItemFileUploadResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantItemFileUploadResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMerchantItemFileUploadResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMerchantItemFileUploadResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantItemFileUploadResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantItemFileUploadResponseModel
  */
  public static AlipayMerchantItemFileUploadResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantItemFileUploadResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantItemFileUploadResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

