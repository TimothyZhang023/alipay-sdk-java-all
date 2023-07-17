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
import com.alipay.v3.model.ItemSkuPropertyInfo;
import com.alipay.v3.model.MaterialCreateInfo;
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
 * SkuCreateInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SkuCreateInfo {
  public static final String SERIALIZED_NAME_INVENTORY = "inventory";
  @SerializedName(SERIALIZED_NAME_INVENTORY)
  private Integer inventory;

  public static final String SERIALIZED_NAME_MATERIAL_LIST = "material_list";
  @SerializedName(SERIALIZED_NAME_MATERIAL_LIST)
  private List<MaterialCreateInfo> materialList = null;

  public static final String SERIALIZED_NAME_ORIGINAL_PRICE = "original_price";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_PRICE)
  private Integer originalPrice;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_PROPERTY_LIST = "property_list";
  @SerializedName(SERIALIZED_NAME_PROPERTY_LIST)
  private List<ItemSkuPropertyInfo> propertyList = null;

  public SkuCreateInfo() { 
  }

  public SkuCreateInfo inventory(Integer inventory) {
    
    this.inventory = inventory;
    return this;
  }

   /**
   * 库存
   * @return inventory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "库存")

  public Integer getInventory() {
    return inventory;
  }


  public void setInventory(Integer inventory) {
    this.inventory = inventory;
  }


  public SkuCreateInfo materialList(List<MaterialCreateInfo> materialList) {
    
    this.materialList = materialList;
    return this;
  }

  public SkuCreateInfo addMaterialListItem(MaterialCreateInfo materialListItem) {
    if (this.materialList == null) {
      this.materialList = new ArrayList<>();
    }
    this.materialList.add(materialListItem);
    return this;
  }

   /**
   * SKU素材列表（最多3个）
   * @return materialList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SKU素材列表（最多3个）")

  public List<MaterialCreateInfo> getMaterialList() {
    return materialList;
  }


  public void setMaterialList(List<MaterialCreateInfo> materialList) {
    this.materialList = materialList;
  }


  public SkuCreateInfo originalPrice(Integer originalPrice) {
    
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * 标价，单位分
   * @return originalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "标价，单位分")

  public Integer getOriginalPrice() {
    return originalPrice;
  }


  public void setOriginalPrice(Integer originalPrice) {
    this.originalPrice = originalPrice;
  }


  public SkuCreateInfo price(Integer price) {
    
    this.price = price;
    return this;
  }

   /**
   * 售价，单位分
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "售价，单位分")

  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    this.price = price;
  }


  public SkuCreateInfo propertyList(List<ItemSkuPropertyInfo> propertyList) {
    
    this.propertyList = propertyList;
    return this;
  }

  public SkuCreateInfo addPropertyListItem(ItemSkuPropertyInfo propertyListItem) {
    if (this.propertyList == null) {
      this.propertyList = new ArrayList<>();
    }
    this.propertyList.add(propertyListItem);
    return this;
  }

   /**
   * SKU属性列表
   * @return propertyList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SKU属性列表")

  public List<ItemSkuPropertyInfo> getPropertyList() {
    return propertyList;
  }


  public void setPropertyList(List<ItemSkuPropertyInfo> propertyList) {
    this.propertyList = propertyList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkuCreateInfo skuCreateInfo = (SkuCreateInfo) o;
    return Objects.equals(this.inventory, skuCreateInfo.inventory) &&
        Objects.equals(this.materialList, skuCreateInfo.materialList) &&
        Objects.equals(this.originalPrice, skuCreateInfo.originalPrice) &&
        Objects.equals(this.price, skuCreateInfo.price) &&
        Objects.equals(this.propertyList, skuCreateInfo.propertyList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventory, materialList, originalPrice, price, propertyList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuCreateInfo {\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    materialList: ").append(toIndentedString(materialList)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    propertyList: ").append(toIndentedString(propertyList)).append("\n");
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
    openapiFields.add("inventory");
    openapiFields.add("material_list");
    openapiFields.add("original_price");
    openapiFields.add("price");
    openapiFields.add("property_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkuCreateInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SkuCreateInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkuCreateInfo is not found in the empty JSON string", SkuCreateInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SkuCreateInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SkuCreateInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraymaterialList = jsonObj.getAsJsonArray("material_list");
      if (jsonArraymaterialList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("material_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `material_list` to be an array in the JSON string but got `%s`", jsonObj.get("material_list").toString()));
        }

        // validate the optional field `material_list` (array)
        for (int i = 0; i < jsonArraymaterialList.size(); i++) {
          MaterialCreateInfo.validateJsonObject(jsonArraymaterialList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraypropertyList = jsonObj.getAsJsonArray("property_list");
      if (jsonArraypropertyList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("property_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `property_list` to be an array in the JSON string but got `%s`", jsonObj.get("property_list").toString()));
        }

        // validate the optional field `property_list` (array)
        for (int i = 0; i < jsonArraypropertyList.size(); i++) {
          ItemSkuPropertyInfo.validateJsonObject(jsonArraypropertyList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkuCreateInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkuCreateInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkuCreateInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkuCreateInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SkuCreateInfo>() {
           @Override
           public void write(JsonWriter out, SkuCreateInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SkuCreateInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SkuCreateInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkuCreateInfo
  * @throws IOException if the JSON string is invalid with respect to SkuCreateInfo
  */
  public static SkuCreateInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkuCreateInfo.class);
  }

 /**
  * Convert an instance of SkuCreateInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

