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
import com.alipay.v3.model.CmItemSkuInfo;
import com.alipay.v3.model.ItemExtInfo;
import com.alipay.v3.model.ItemPropertyInfo;
import com.alipay.v3.model.MaterialInfo;
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
 * CmItemInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CmItemInfo {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<ItemExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_FRONT_CATEGORY_ID_LIST = "front_category_id_list";
  @SerializedName(SERIALIZED_NAME_FRONT_CATEGORY_ID_LIST)
  private List<String> frontCategoryIdList = null;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_MATERIAL_LIST = "material_list";
  @SerializedName(SERIALIZED_NAME_MATERIAL_LIST)
  private List<MaterialInfo> materialList = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROPERTY_LIST = "property_list";
  @SerializedName(SERIALIZED_NAME_PROPERTY_LIST)
  private List<ItemPropertyInfo> propertyList = null;

  public static final String SERIALIZED_NAME_SKU_LIST = "sku_list";
  @SerializedName(SERIALIZED_NAME_SKU_LIST)
  private List<CmItemSkuInfo> skuList = null;

  public static final String SERIALIZED_NAME_STANDARD_CATEGORY_ID = "standard_category_id";
  @SerializedName(SERIALIZED_NAME_STANDARD_CATEGORY_ID)
  private String standardCategoryId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public CmItemInfo() { 
  }

  public CmItemInfo description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 商品描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品描述")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CmItemInfo extInfo(List<ItemExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public CmItemInfo addExtInfoItem(ItemExtInfo extInfoItem) {
    if (this.extInfo == null) {
      this.extInfo = new ArrayList<>();
    }
    this.extInfo.add(extInfoItem);
    return this;
  }

   /**
   * 商品扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品扩展信息")

  public List<ItemExtInfo> getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(List<ItemExtInfo> extInfo) {
    this.extInfo = extInfo;
  }


  public CmItemInfo frontCategoryIdList(List<String> frontCategoryIdList) {
    
    this.frontCategoryIdList = frontCategoryIdList;
    return this;
  }

  public CmItemInfo addFrontCategoryIdListItem(String frontCategoryIdListItem) {
    if (this.frontCategoryIdList == null) {
      this.frontCategoryIdList = new ArrayList<>();
    }
    this.frontCategoryIdList.add(frontCategoryIdListItem);
    return this;
  }

   /**
   * 商品所属前台类目ID列表
   * @return frontCategoryIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品所属前台类目ID列表")

  public List<String> getFrontCategoryIdList() {
    return frontCategoryIdList;
  }


  public void setFrontCategoryIdList(List<String> frontCategoryIdList) {
    this.frontCategoryIdList = frontCategoryIdList;
  }


  public CmItemInfo gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 商品创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public CmItemInfo gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 商品更新时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品更新时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public CmItemInfo itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 商品ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品ID")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public CmItemInfo materialList(List<MaterialInfo> materialList) {
    
    this.materialList = materialList;
    return this;
  }

  public CmItemInfo addMaterialListItem(MaterialInfo materialListItem) {
    if (this.materialList == null) {
      this.materialList = new ArrayList<>();
    }
    this.materialList.add(materialListItem);
    return this;
  }

   /**
   * 商品素材列表
   * @return materialList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品素材列表")

  public List<MaterialInfo> getMaterialList() {
    return materialList;
  }


  public void setMaterialList(List<MaterialInfo> materialList) {
    this.materialList = materialList;
  }


  public CmItemInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 商品名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CmItemInfo propertyList(List<ItemPropertyInfo> propertyList) {
    
    this.propertyList = propertyList;
    return this;
  }

  public CmItemInfo addPropertyListItem(ItemPropertyInfo propertyListItem) {
    if (this.propertyList == null) {
      this.propertyList = new ArrayList<>();
    }
    this.propertyList.add(propertyListItem);
    return this;
  }

   /**
   * 商品属性列表
   * @return propertyList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品属性列表")

  public List<ItemPropertyInfo> getPropertyList() {
    return propertyList;
  }


  public void setPropertyList(List<ItemPropertyInfo> propertyList) {
    this.propertyList = propertyList;
  }


  public CmItemInfo skuList(List<CmItemSkuInfo> skuList) {
    
    this.skuList = skuList;
    return this;
  }

  public CmItemInfo addSkuListItem(CmItemSkuInfo skuListItem) {
    if (this.skuList == null) {
      this.skuList = new ArrayList<>();
    }
    this.skuList.add(skuListItem);
    return this;
  }

   /**
   * 商品SKU列表
   * @return skuList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品SKU列表")

  public List<CmItemSkuInfo> getSkuList() {
    return skuList;
  }


  public void setSkuList(List<CmItemSkuInfo> skuList) {
    this.skuList = skuList;
  }


  public CmItemInfo standardCategoryId(String standardCategoryId) {
    
    this.standardCategoryId = standardCategoryId;
    return this;
  }

   /**
   * 商品所属标准类目ID（具体值请参见产品文档）
   * @return standardCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品所属标准类目ID（具体值请参见产品文档）")

  public String getStandardCategoryId() {
    return standardCategoryId;
  }


  public void setStandardCategoryId(String standardCategoryId) {
    this.standardCategoryId = standardCategoryId;
  }


  public CmItemInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 商品状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CmItemInfo targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 商品归属主体ID  例：商品归属主体类型为店铺，则商品归属主体ID为店铺ID；归属主体为小程序，则归属主体ID为小程序ID
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品归属主体ID  例：商品归属主体类型为店铺，则商品归属主体ID为店铺ID；归属主体为小程序，则归属主体ID为小程序ID")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public CmItemInfo targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * 商品归属主体类型:  5（店铺）  8（小程序）
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品归属主体类型:  5（店铺）  8（小程序）")

  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }


  public CmItemInfo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 商品类型：  STANDARD_GOODS（标品）、NON_STANDARD_GOODS（非标品）
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品类型：  STANDARD_GOODS（标品）、NON_STANDARD_GOODS（非标品）")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CmItemInfo cmItemInfo = (CmItemInfo) o;
    return Objects.equals(this.description, cmItemInfo.description) &&
        Objects.equals(this.extInfo, cmItemInfo.extInfo) &&
        Objects.equals(this.frontCategoryIdList, cmItemInfo.frontCategoryIdList) &&
        Objects.equals(this.gmtCreate, cmItemInfo.gmtCreate) &&
        Objects.equals(this.gmtModified, cmItemInfo.gmtModified) &&
        Objects.equals(this.itemId, cmItemInfo.itemId) &&
        Objects.equals(this.materialList, cmItemInfo.materialList) &&
        Objects.equals(this.name, cmItemInfo.name) &&
        Objects.equals(this.propertyList, cmItemInfo.propertyList) &&
        Objects.equals(this.skuList, cmItemInfo.skuList) &&
        Objects.equals(this.standardCategoryId, cmItemInfo.standardCategoryId) &&
        Objects.equals(this.status, cmItemInfo.status) &&
        Objects.equals(this.targetId, cmItemInfo.targetId) &&
        Objects.equals(this.targetType, cmItemInfo.targetType) &&
        Objects.equals(this.type, cmItemInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, extInfo, frontCategoryIdList, gmtCreate, gmtModified, itemId, materialList, name, propertyList, skuList, standardCategoryId, status, targetId, targetType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CmItemInfo {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    frontCategoryIdList: ").append(toIndentedString(frontCategoryIdList)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    materialList: ").append(toIndentedString(materialList)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyList: ").append(toIndentedString(propertyList)).append("\n");
    sb.append("    skuList: ").append(toIndentedString(skuList)).append("\n");
    sb.append("    standardCategoryId: ").append(toIndentedString(standardCategoryId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("ext_info");
    openapiFields.add("front_category_id_list");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("item_id");
    openapiFields.add("material_list");
    openapiFields.add("name");
    openapiFields.add("property_list");
    openapiFields.add("sku_list");
    openapiFields.add("standard_category_id");
    openapiFields.add("status");
    openapiFields.add("target_id");
    openapiFields.add("target_type");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CmItemInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CmItemInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CmItemInfo is not found in the empty JSON string", CmItemInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CmItemInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CmItemInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      JsonArray jsonArrayextInfo = jsonObj.getAsJsonArray("ext_info");
      if (jsonArrayextInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ext_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be an array in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
        }

        // validate the optional field `ext_info` (array)
        for (int i = 0; i < jsonArrayextInfo.size(); i++) {
          ItemExtInfo.validateJsonObject(jsonArrayextInfo.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("front_category_id_list") != null && !jsonObj.get("front_category_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `front_category_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("front_category_id_list").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
      JsonArray jsonArraymaterialList = jsonObj.getAsJsonArray("material_list");
      if (jsonArraymaterialList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("material_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `material_list` to be an array in the JSON string but got `%s`", jsonObj.get("material_list").toString()));
        }

        // validate the optional field `material_list` (array)
        for (int i = 0; i < jsonArraymaterialList.size(); i++) {
          MaterialInfo.validateJsonObject(jsonArraymaterialList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      JsonArray jsonArraypropertyList = jsonObj.getAsJsonArray("property_list");
      if (jsonArraypropertyList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("property_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `property_list` to be an array in the JSON string but got `%s`", jsonObj.get("property_list").toString()));
        }

        // validate the optional field `property_list` (array)
        for (int i = 0; i < jsonArraypropertyList.size(); i++) {
          ItemPropertyInfo.validateJsonObject(jsonArraypropertyList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayskuList = jsonObj.getAsJsonArray("sku_list");
      if (jsonArrayskuList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sku_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sku_list` to be an array in the JSON string but got `%s`", jsonObj.get("sku_list").toString()));
        }

        // validate the optional field `sku_list` (array)
        for (int i = 0; i < jsonArrayskuList.size(); i++) {
          CmItemSkuInfo.validateJsonObject(jsonArrayskuList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("standard_category_id") != null && !jsonObj.get("standard_category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_category_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("target_id") != null && !jsonObj.get("target_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_id").toString()));
      }
      if (jsonObj.get("target_type") != null && !jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CmItemInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CmItemInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CmItemInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CmItemInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CmItemInfo>() {
           @Override
           public void write(JsonWriter out, CmItemInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CmItemInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CmItemInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CmItemInfo
  * @throws IOException if the JSON string is invalid with respect to CmItemInfo
  */
  public static CmItemInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CmItemInfo.class);
  }

 /**
  * Convert an instance of CmItemInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

