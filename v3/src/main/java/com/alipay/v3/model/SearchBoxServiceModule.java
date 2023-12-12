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
import com.alipay.v3.model.SearchBoxServiceInfo;
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
 * SearchBoxServiceModule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchBoxServiceModule {
  public static final String SERIALIZED_NAME_MODULE_ID = "module_id";
  @SerializedName(SERIALIZED_NAME_MODULE_ID)
  private String moduleId;

  public static final String SERIALIZED_NAME_MODULE_TYPE = "module_type";
  @SerializedName(SERIALIZED_NAME_MODULE_TYPE)
  private String moduleType;

  public static final String SERIALIZED_NAME_SERVICE_INFOS = "service_infos";
  @SerializedName(SERIALIZED_NAME_SERVICE_INFOS)
  private List<SearchBoxServiceInfo> serviceInfos = null;

  public SearchBoxServiceModule() { 
  }

  public SearchBoxServiceModule moduleId(String moduleId) {
    
    this.moduleId = moduleId;
    return this;
  }

   /**
   * 模块配置ID
   * @return moduleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20220308000000168465", value = "模块配置ID")

  public String getModuleId() {
    return moduleId;
  }


  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }


  public SearchBoxServiceModule moduleType(String moduleType) {
    
    this.moduleType = moduleType;
    return this;
  }

   /**
   * 搜索直达模块类型
   * @return moduleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BOX_EXCLUSIVE_FUNCTIONS", value = "搜索直达模块类型")

  public String getModuleType() {
    return moduleType;
  }


  public void setModuleType(String moduleType) {
    this.moduleType = moduleType;
  }


  public SearchBoxServiceModule serviceInfos(List<SearchBoxServiceInfo> serviceInfos) {
    
    this.serviceInfos = serviceInfos;
    return this;
  }

  public SearchBoxServiceModule addServiceInfosItem(SearchBoxServiceInfo serviceInfosItem) {
    if (this.serviceInfos == null) {
      this.serviceInfos = new ArrayList<>();
    }
    this.serviceInfos.add(serviceInfosItem);
    return this;
  }

   /**
   * 服务信息列表
   * @return serviceInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "服务信息列表")

  public List<SearchBoxServiceInfo> getServiceInfos() {
    return serviceInfos;
  }


  public void setServiceInfos(List<SearchBoxServiceInfo> serviceInfos) {
    this.serviceInfos = serviceInfos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchBoxServiceModule searchBoxServiceModule = (SearchBoxServiceModule) o;
    return Objects.equals(this.moduleId, searchBoxServiceModule.moduleId) &&
        Objects.equals(this.moduleType, searchBoxServiceModule.moduleType) &&
        Objects.equals(this.serviceInfos, searchBoxServiceModule.serviceInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moduleId, moduleType, serviceInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBoxServiceModule {\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
    sb.append("    serviceInfos: ").append(toIndentedString(serviceInfos)).append("\n");
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
    openapiFields.add("module_id");
    openapiFields.add("module_type");
    openapiFields.add("service_infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchBoxServiceModule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchBoxServiceModule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchBoxServiceModule is not found in the empty JSON string", SearchBoxServiceModule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchBoxServiceModule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchBoxServiceModule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("module_id") != null && !jsonObj.get("module_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_id").toString()));
      }
      if (jsonObj.get("module_type") != null && !jsonObj.get("module_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_type").toString()));
      }
      JsonArray jsonArrayserviceInfos = jsonObj.getAsJsonArray("service_infos");
      if (jsonArrayserviceInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("service_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `service_infos` to be an array in the JSON string but got `%s`", jsonObj.get("service_infos").toString()));
        }

        // validate the optional field `service_infos` (array)
        for (int i = 0; i < jsonArrayserviceInfos.size(); i++) {
          SearchBoxServiceInfo.validateJsonObject(jsonArrayserviceInfos.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchBoxServiceModule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchBoxServiceModule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchBoxServiceModule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchBoxServiceModule.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchBoxServiceModule>() {
           @Override
           public void write(JsonWriter out, SearchBoxServiceModule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchBoxServiceModule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchBoxServiceModule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchBoxServiceModule
  * @throws IOException if the JSON string is invalid with respect to SearchBoxServiceModule
  */
  public static SearchBoxServiceModule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchBoxServiceModule.class);
  }

 /**
  * Convert an instance of SearchBoxServiceModule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

