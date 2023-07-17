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
import com.alipay.v3.model.CmItemInfo;
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
 * AntMerchantExpandItemOpenQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandItemOpenQueryResponseModel {
  public static final String SERIALIZED_NAME_ITEM_LIST = "item_list";
  @SerializedName(SERIALIZED_NAME_ITEM_LIST)
  private List<CmItemInfo> itemList = null;

  public AntMerchantExpandItemOpenQueryResponseModel() { 
  }

  public AntMerchantExpandItemOpenQueryResponseModel itemList(List<CmItemInfo> itemList) {
    
    this.itemList = itemList;
    return this;
  }

  public AntMerchantExpandItemOpenQueryResponseModel addItemListItem(CmItemInfo itemListItem) {
    if (this.itemList == null) {
      this.itemList = new ArrayList<>();
    }
    this.itemList.add(itemListItem);
    return this;
  }

   /**
   * 商品列表
   * @return itemList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品列表")

  public List<CmItemInfo> getItemList() {
    return itemList;
  }


  public void setItemList(List<CmItemInfo> itemList) {
    this.itemList = itemList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntMerchantExpandItemOpenQueryResponseModel antMerchantExpandItemOpenQueryResponseModel = (AntMerchantExpandItemOpenQueryResponseModel) o;
    return Objects.equals(this.itemList, antMerchantExpandItemOpenQueryResponseModel.itemList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandItemOpenQueryResponseModel {\n");
    sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
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
    openapiFields.add("item_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandItemOpenQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandItemOpenQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandItemOpenQueryResponseModel is not found in the empty JSON string", AntMerchantExpandItemOpenQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AntMerchantExpandItemOpenQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AntMerchantExpandItemOpenQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayitemList = jsonObj.getAsJsonArray("item_list");
      if (jsonArrayitemList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("item_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `item_list` to be an array in the JSON string but got `%s`", jsonObj.get("item_list").toString()));
        }

        // validate the optional field `item_list` (array)
        for (int i = 0; i < jsonArrayitemList.size(); i++) {
          CmItemInfo.validateJsonObject(jsonArrayitemList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AntMerchantExpandItemOpenQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandItemOpenQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandItemOpenQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandItemOpenQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandItemOpenQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandItemOpenQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AntMerchantExpandItemOpenQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AntMerchantExpandItemOpenQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandItemOpenQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandItemOpenQueryResponseModel
  */
  public static AntMerchantExpandItemOpenQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandItemOpenQueryResponseModel.class);
  }

 /**
  * Convert an instance of AntMerchantExpandItemOpenQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

