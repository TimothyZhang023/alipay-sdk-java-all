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
 * ItemInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ItemInfo {
  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<String> itemIds = null;

  public static final String SERIALIZED_NAME_ITEM_IMGS = "item_imgs";
  @SerializedName(SERIALIZED_NAME_ITEM_IMGS)
  private List<String> itemImgs = null;

  public static final String SERIALIZED_NAME_ITEM_LINK = "item_link";
  @SerializedName(SERIALIZED_NAME_ITEM_LINK)
  private String itemLink;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private String itemName;

  public static final String SERIALIZED_NAME_ITEM_TEXT = "item_text";
  @SerializedName(SERIALIZED_NAME_ITEM_TEXT)
  private String itemText;

  public static final String SERIALIZED_NAME_MAX_DISCOUNT_NUM = "max_discount_num";
  @SerializedName(SERIALIZED_NAME_MAX_DISCOUNT_NUM)
  private String maxDiscountNum;

  public static final String SERIALIZED_NAME_MIN_CONSUME_NUM = "min_consume_num";
  @SerializedName(SERIALIZED_NAME_MIN_CONSUME_NUM)
  private String minConsumeNum;

  public static final String SERIALIZED_NAME_ORIGINAL_PRICE = "original_price";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_PRICE)
  private String originalPrice;

  public static final String SERIALIZED_NAME_SKU_MIN_CONSUME = "sku_min_consume";
  @SerializedName(SERIALIZED_NAME_SKU_MIN_CONSUME)
  private String skuMinConsume;

  public static final String SERIALIZED_NAME_TOTAL_MAX_DISCOUNT_NUM = "total_max_discount_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_MAX_DISCOUNT_NUM)
  private String totalMaxDiscountNum;

  public ItemInfo() { 
  }

  public ItemInfo itemIds(List<String> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public ItemInfo addItemIdsItem(String itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * 券适用的单品码列表  最少配置1个单品码  最多配置500个单品码
   * @return itemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0000123,0000124", value = "券适用的单品码列表  最少配置1个单品码  最多配置500个单品码")

  public List<String> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }


  public ItemInfo itemImgs(List<String> itemImgs) {
    
    this.itemImgs = itemImgs;
    return this;
  }

  public ItemInfo addItemImgsItem(String itemImgsItem) {
    if (this.itemImgs == null) {
      this.itemImgs = new ArrayList<>();
    }
    this.itemImgs.add(itemImgsItem);
    return this;
  }

   /**
   * 单品图片列表  单品图片不能超过3张
   * @return itemImgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC", value = "单品图片列表  单品图片不能超过3张")

  public List<String> getItemImgs() {
    return itemImgs;
  }


  public void setItemImgs(List<String> itemImgs) {
    this.itemImgs = itemImgs;
  }


  public ItemInfo itemLink(String itemLink) {
    
    this.itemLink = itemLink;
    return this;
  }

   /**
   * 单品券详细介绍跳转链接
   * @return itemLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "www.taobao.com", value = "单品券详细介绍跳转链接")

  public String getItemLink() {
    return itemLink;
  }


  public void setItemLink(String itemLink) {
    this.itemLink = itemLink;
  }


  public ItemInfo itemName(String itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * 单品名称
   * @return itemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "单品名称", value = "单品名称")

  public String getItemName() {
    return itemName;
  }


  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public ItemInfo itemText(String itemText) {
    
    this.itemText = itemText;
    return this;
  }

   /**
   * 单品券说明
   * @return itemText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "单品券说明", value = "单品券说明")

  public String getItemText() {
    return itemText;
  }


  public void setItemText(String itemText) {
    this.itemText = itemText;
  }


  public ItemInfo maxDiscountNum(String maxDiscountNum) {
    
    this.maxDiscountNum = maxDiscountNum;
    return this;
  }

   /**
   * 单品券适用的商品列表中，每一个商品最高可享受优惠的件数；    如：券适用于A,B两种商品，该字段设置为1，则用券A,B两种商品每种最多只有一件可享受优惠；
   * @return maxDiscountNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "单品券适用的商品列表中，每一个商品最高可享受优惠的件数；    如：券适用于A,B两种商品，该字段设置为1，则用券A,B两种商品每种最多只有一件可享受优惠；")

  public String getMaxDiscountNum() {
    return maxDiscountNum;
  }


  public void setMaxDiscountNum(String maxDiscountNum) {
    this.maxDiscountNum = maxDiscountNum;
  }


  public ItemInfo minConsumeNum(String minConsumeNum) {
    
    this.minConsumeNum = minConsumeNum;
    return this;
  }

   /**
   * 单品券适用商品列表中，每种商品享受优惠最低购买件数的门槛；  如：券适用于A,B两种商品，该字段设置为3，则A,B两种商品每种最少需要购买3件才可享受优惠；
   * @return minConsumeNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "单品券适用商品列表中，每种商品享受优惠最低购买件数的门槛；  如：券适用于A,B两种商品，该字段设置为3，则A,B两种商品每种最少需要购买3件才可享受优惠；")

  public String getMinConsumeNum() {
    return minConsumeNum;
  }


  public void setMinConsumeNum(String minConsumeNum) {
    this.minConsumeNum = minConsumeNum;
  }


  public ItemInfo originalPrice(String originalPrice) {
    
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * 单品的原价，单位元  必须为合法金额类型字符串，如9.99
   * @return originalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "28.88", value = "单品的原价，单位元  必须为合法金额类型字符串，如9.99")

  public String getOriginalPrice() {
    return originalPrice;
  }


  public void setOriginalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
  }


  public ItemInfo skuMinConsume(String skuMinConsume) {
    
    this.skuMinConsume = skuMinConsume;
    return this;
  }

   /**
   * 券适用SKU的最低消费金额门槛  如券适用A,B两个SKU，该字段设置的值为100，则订单中购买A,B两个SKU的合计金额需大于100元才可用券
   * @return skuMinConsume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "券适用SKU的最低消费金额门槛  如券适用A,B两个SKU，该字段设置的值为100，则订单中购买A,B两个SKU的合计金额需大于100元才可用券")

  public String getSkuMinConsume() {
    return skuMinConsume;
  }


  public void setSkuMinConsume(String skuMinConsume) {
    this.skuMinConsume = skuMinConsume;
  }


  public ItemInfo totalMaxDiscountNum(String totalMaxDiscountNum) {
    
    this.totalMaxDiscountNum = totalMaxDiscountNum;
    return this;
  }

   /**
   * 如果一个单品券适用A，B，C三个单品，若设置了该字段为2，则在一笔交易中，A，B，C三个单品加起来最多只有俩件能够享受优惠
   * @return totalMaxDiscountNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "如果一个单品券适用A，B，C三个单品，若设置了该字段为2，则在一笔交易中，A，B，C三个单品加起来最多只有俩件能够享受优惠")

  public String getTotalMaxDiscountNum() {
    return totalMaxDiscountNum;
  }


  public void setTotalMaxDiscountNum(String totalMaxDiscountNum) {
    this.totalMaxDiscountNum = totalMaxDiscountNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemInfo itemInfo = (ItemInfo) o;
    return Objects.equals(this.itemIds, itemInfo.itemIds) &&
        Objects.equals(this.itemImgs, itemInfo.itemImgs) &&
        Objects.equals(this.itemLink, itemInfo.itemLink) &&
        Objects.equals(this.itemName, itemInfo.itemName) &&
        Objects.equals(this.itemText, itemInfo.itemText) &&
        Objects.equals(this.maxDiscountNum, itemInfo.maxDiscountNum) &&
        Objects.equals(this.minConsumeNum, itemInfo.minConsumeNum) &&
        Objects.equals(this.originalPrice, itemInfo.originalPrice) &&
        Objects.equals(this.skuMinConsume, itemInfo.skuMinConsume) &&
        Objects.equals(this.totalMaxDiscountNum, itemInfo.totalMaxDiscountNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIds, itemImgs, itemLink, itemName, itemText, maxDiscountNum, minConsumeNum, originalPrice, skuMinConsume, totalMaxDiscountNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemInfo {\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    itemImgs: ").append(toIndentedString(itemImgs)).append("\n");
    sb.append("    itemLink: ").append(toIndentedString(itemLink)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemText: ").append(toIndentedString(itemText)).append("\n");
    sb.append("    maxDiscountNum: ").append(toIndentedString(maxDiscountNum)).append("\n");
    sb.append("    minConsumeNum: ").append(toIndentedString(minConsumeNum)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    skuMinConsume: ").append(toIndentedString(skuMinConsume)).append("\n");
    sb.append("    totalMaxDiscountNum: ").append(toIndentedString(totalMaxDiscountNum)).append("\n");
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
    openapiFields.add("item_ids");
    openapiFields.add("item_imgs");
    openapiFields.add("item_link");
    openapiFields.add("item_name");
    openapiFields.add("item_text");
    openapiFields.add("max_discount_num");
    openapiFields.add("min_consume_num");
    openapiFields.add("original_price");
    openapiFields.add("sku_min_consume");
    openapiFields.add("total_max_discount_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ItemInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemInfo is not found in the empty JSON string", ItemInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ItemInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("item_ids") != null && !jsonObj.get("item_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_ids` to be an array in the JSON string but got `%s`", jsonObj.get("item_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("item_imgs") != null && !jsonObj.get("item_imgs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_imgs` to be an array in the JSON string but got `%s`", jsonObj.get("item_imgs").toString()));
      }
      if (jsonObj.get("item_link") != null && !jsonObj.get("item_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_link").toString()));
      }
      if (jsonObj.get("item_name") != null && !jsonObj.get("item_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_name").toString()));
      }
      if (jsonObj.get("item_text") != null && !jsonObj.get("item_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_text").toString()));
      }
      if (jsonObj.get("max_discount_num") != null && !jsonObj.get("max_discount_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_discount_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_discount_num").toString()));
      }
      if (jsonObj.get("min_consume_num") != null && !jsonObj.get("min_consume_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min_consume_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min_consume_num").toString()));
      }
      if (jsonObj.get("original_price") != null && !jsonObj.get("original_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_price").toString()));
      }
      if (jsonObj.get("sku_min_consume") != null && !jsonObj.get("sku_min_consume").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku_min_consume` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku_min_consume").toString()));
      }
      if (jsonObj.get("total_max_discount_num") != null && !jsonObj.get("total_max_discount_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_max_discount_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_max_discount_num").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemInfo>() {
           @Override
           public void write(JsonWriter out, ItemInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ItemInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemInfo
  * @throws IOException if the JSON string is invalid with respect to ItemInfo
  */
  public static ItemInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemInfo.class);
  }

 /**
  * Convert an instance of ItemInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

