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
import com.alipay.v3.model.SubscribeRelation;
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
 * AlipayOpenAppMessagetemplateSubscribeQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAppMessagetemplateSubscribeQueryResponseModel {
  public static final String SERIALIZED_NAME_SHOW_COMPONENT = "show_component";
  @SerializedName(SERIALIZED_NAME_SHOW_COMPONENT)
  private Boolean showComponent;

  public static final String SERIALIZED_NAME_SUBSCRIBE_RELATIONS = "subscribe_relations";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBE_RELATIONS)
  private List<SubscribeRelation> subscribeRelations = null;

  public AlipayOpenAppMessagetemplateSubscribeQueryResponseModel() { 
  }

  public AlipayOpenAppMessagetemplateSubscribeQueryResponseModel showComponent(Boolean showComponent) {
    
    this.showComponent = showComponent;
    return this;
  }

   /**
   * 是否显示订阅组件。枚举值： true：显示订阅组件。 false：不显示订阅组件
   * @return showComponent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否显示订阅组件。枚举值： true：显示订阅组件。 false：不显示订阅组件")

  public Boolean getShowComponent() {
    return showComponent;
  }


  public void setShowComponent(Boolean showComponent) {
    this.showComponent = showComponent;
  }


  public AlipayOpenAppMessagetemplateSubscribeQueryResponseModel subscribeRelations(List<SubscribeRelation> subscribeRelations) {
    
    this.subscribeRelations = subscribeRelations;
    return this;
  }

  public AlipayOpenAppMessagetemplateSubscribeQueryResponseModel addSubscribeRelationsItem(SubscribeRelation subscribeRelationsItem) {
    if (this.subscribeRelations == null) {
      this.subscribeRelations = new ArrayList<>();
    }
    this.subscribeRelations.add(subscribeRelationsItem);
    return this;
  }

   /**
   * 用户对消息模板的订阅关系列表，为入参中的用户id对消息模板id的订阅关系。 限制：用户未订阅消息，该参数不返回。
   * @return subscribeRelations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户对消息模板的订阅关系列表，为入参中的用户id对消息模板id的订阅关系。 限制：用户未订阅消息，该参数不返回。")

  public List<SubscribeRelation> getSubscribeRelations() {
    return subscribeRelations;
  }


  public void setSubscribeRelations(List<SubscribeRelation> subscribeRelations) {
    this.subscribeRelations = subscribeRelations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAppMessagetemplateSubscribeQueryResponseModel alipayOpenAppMessagetemplateSubscribeQueryResponseModel = (AlipayOpenAppMessagetemplateSubscribeQueryResponseModel) o;
    return Objects.equals(this.showComponent, alipayOpenAppMessagetemplateSubscribeQueryResponseModel.showComponent) &&
        Objects.equals(this.subscribeRelations, alipayOpenAppMessagetemplateSubscribeQueryResponseModel.subscribeRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showComponent, subscribeRelations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAppMessagetemplateSubscribeQueryResponseModel {\n");
    sb.append("    showComponent: ").append(toIndentedString(showComponent)).append("\n");
    sb.append("    subscribeRelations: ").append(toIndentedString(subscribeRelations)).append("\n");
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
    openapiFields.add("show_component");
    openapiFields.add("subscribe_relations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAppMessagetemplateSubscribeQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAppMessagetemplateSubscribeQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAppMessagetemplateSubscribeQueryResponseModel is not found in the empty JSON string", AlipayOpenAppMessagetemplateSubscribeQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAppMessagetemplateSubscribeQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAppMessagetemplateSubscribeQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraysubscribeRelations = jsonObj.getAsJsonArray("subscribe_relations");
      if (jsonArraysubscribeRelations != null) {
        // ensure the json data is an array
        if (!jsonObj.get("subscribe_relations").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `subscribe_relations` to be an array in the JSON string but got `%s`", jsonObj.get("subscribe_relations").toString()));
        }

        // validate the optional field `subscribe_relations` (array)
        for (int i = 0; i < jsonArraysubscribeRelations.size(); i++) {
          SubscribeRelation.validateJsonObject(jsonArraysubscribeRelations.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAppMessagetemplateSubscribeQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAppMessagetemplateSubscribeQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAppMessagetemplateSubscribeQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAppMessagetemplateSubscribeQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAppMessagetemplateSubscribeQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAppMessagetemplateSubscribeQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAppMessagetemplateSubscribeQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAppMessagetemplateSubscribeQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAppMessagetemplateSubscribeQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAppMessagetemplateSubscribeQueryResponseModel
  */
  public static AlipayOpenAppMessagetemplateSubscribeQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAppMessagetemplateSubscribeQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAppMessagetemplateSubscribeQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

