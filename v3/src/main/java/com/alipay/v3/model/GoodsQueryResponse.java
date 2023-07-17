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
 * GoodsQueryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GoodsQueryResponse {
  public static final String SERIALIZED_NAME_ALIPAY_GOODS_ID = "alipay_goods_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_GOODS_ID)
  private String alipayGoodsId;

  public static final String SERIALIZED_NAME_BUYING_URL = "buying_url";
  @SerializedName(SERIALIZED_NAME_BUYING_URL)
  private String buyingUrl;

  public static final String SERIALIZED_NAME_GOODS_COMMENT = "goods_comment";
  @SerializedName(SERIALIZED_NAME_GOODS_COMMENT)
  private String goodsComment;

  public static final String SERIALIZED_NAME_GOODS_DESCRIPTION_LABEL = "goods_description_label";
  @SerializedName(SERIALIZED_NAME_GOODS_DESCRIPTION_LABEL)
  private String goodsDescriptionLabel;

  public static final String SERIALIZED_NAME_GOODS_ID = "goods_id";
  @SerializedName(SERIALIZED_NAME_GOODS_ID)
  private String goodsId;

  public static final String SERIALIZED_NAME_GOODS_LABEL = "goods_label";
  @SerializedName(SERIALIZED_NAME_GOODS_LABEL)
  private String goodsLabel;

  public static final String SERIALIZED_NAME_GOODS_NAME = "goods_name";
  @SerializedName(SERIALIZED_NAME_GOODS_NAME)
  private String goodsName;

  public static final String SERIALIZED_NAME_GOODS_TYPE = "goods_type";
  @SerializedName(SERIALIZED_NAME_GOODS_TYPE)
  private String goodsType;

  public static final String SERIALIZED_NAME_MAIN_PIC_URL = "main_pic_url";
  @SerializedName(SERIALIZED_NAME_MAIN_PIC_URL)
  private String mainPicUrl;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "order_number";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_ORIGINAL_PRICE = "original_price";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_PRICE)
  private String originalPrice;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_PUBLISH_CITIES = "publish_cities";
  @SerializedName(SERIALIZED_NAME_PUBLISH_CITIES)
  private String publishCities;

  public static final String SERIALIZED_NAME_REMAINING_QUANTITY = "remaining_quantity";
  @SerializedName(SERIALIZED_NAME_REMAINING_QUANTITY)
  private Integer remainingQuantity;

  public static final String SERIALIZED_NAME_SELL_PRICE = "sell_price";
  @SerializedName(SERIALIZED_NAME_SELL_PRICE)
  private String sellPrice;

  public static final String SERIALIZED_NAME_SOLD_QUANTITY = "sold_quantity";
  @SerializedName(SERIALIZED_NAME_SOLD_QUANTITY)
  private Integer soldQuantity;

  public static final String SERIALIZED_NAME_TOTAL_QUANTITY = "total_quantity";
  @SerializedName(SERIALIZED_NAME_TOTAL_QUANTITY)
  private String totalQuantity;

  public GoodsQueryResponse() { 
  }

  public GoodsQueryResponse alipayGoodsId(String alipayGoodsId) {
    
    this.alipayGoodsId = alipayGoodsId;
    return this;
  }

   /**
   * 支付宝内部商品唯一标识
   * @return alipayGoodsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022090400014220", value = "支付宝内部商品唯一标识")

  public String getAlipayGoodsId() {
    return alipayGoodsId;
  }


  public void setAlipayGoodsId(String alipayGoodsId) {
    this.alipayGoodsId = alipayGoodsId;
  }


  public GoodsQueryResponse buyingUrl(String buyingUrl) {
    
    this.buyingUrl = buyingUrl;
    return this;
  }

   /**
   * 该商品的小程序购买链接
   * @return buyingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?appId= 2017072607907880&page=pages/index/index?param=xxxx", value = "该商品的小程序购买链接")

  public String getBuyingUrl() {
    return buyingUrl;
  }


  public void setBuyingUrl(String buyingUrl) {
    this.buyingUrl = buyingUrl;
  }


  public GoodsQueryResponse goodsComment(String goodsComment) {
    
    this.goodsComment = goodsComment;
    return this;
  }

   /**
   * 商品辅助说明文案
   * @return goodsComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是一个商品辅助说明文案", value = "商品辅助说明文案")

  public String getGoodsComment() {
    return goodsComment;
  }


  public void setGoodsComment(String goodsComment) {
    this.goodsComment = goodsComment;
  }


  public GoodsQueryResponse goodsDescriptionLabel(String goodsDescriptionLabel) {
    
    this.goodsDescriptionLabel = goodsDescriptionLabel;
    return this;
  }

   /**
   * 商品说明标签（如-随心退）
   * @return goodsDescriptionLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "随心退", value = "商品说明标签（如-随心退）")

  public String getGoodsDescriptionLabel() {
    return goodsDescriptionLabel;
  }


  public void setGoodsDescriptionLabel(String goodsDescriptionLabel) {
    this.goodsDescriptionLabel = goodsDescriptionLabel;
  }


  public GoodsQueryResponse goodsId(String goodsId) {
    
    this.goodsId = goodsId;
    return this;
  }

   /**
   * 商品的唯一标识，同一个小部件下，该标识唯一，请开发者自行保证
   * @return goodsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8948968498", value = "商品的唯一标识，同一个小部件下，该标识唯一，请开发者自行保证")

  public String getGoodsId() {
    return goodsId;
  }


  public void setGoodsId(String goodsId) {
    this.goodsId = goodsId;
  }


  public GoodsQueryResponse goodsLabel(String goodsLabel) {
    
    this.goodsLabel = goodsLabel;
    return this;
  }

   /**
   * 营销标签（如-限量特价），每个商品仅支持一个营销标签
   * @return goodsLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "限量特价", value = "营销标签（如-限量特价），每个商品仅支持一个营销标签")

  public String getGoodsLabel() {
    return goodsLabel;
  }


  public void setGoodsLabel(String goodsLabel) {
    this.goodsLabel = goodsLabel;
  }


  public GoodsQueryResponse goodsName(String goodsName) {
    
    this.goodsName = goodsName;
    return this;
  }

   /**
   * 商品名称
   * @return goodsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是一个商品名称", value = "商品名称")

  public String getGoodsName() {
    return goodsName;
  }


  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public GoodsQueryResponse goodsType(String goodsType) {
    
    this.goodsType = goodsType;
    return this;
  }

   /**
   * 商品所属品类
   * @return goodsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "服装", value = "商品所属品类")

  public String getGoodsType() {
    return goodsType;
  }


  public void setGoodsType(String goodsType) {
    this.goodsType = goodsType;
  }


  public GoodsQueryResponse mainPicUrl(String mainPicUrl) {
    
    this.mainPicUrl = mainPicUrl;
    return this;
  }

   /**
   * 商品主图片地址
   * @return mainPicUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://xxx.xxx.com/xxx.jpg", value = "商品主图片地址")

  public String getMainPicUrl() {
    return mainPicUrl;
  }


  public void setMainPicUrl(String mainPicUrl) {
    this.mainPicUrl = mainPicUrl;
  }


  public GoodsQueryResponse miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序ID
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017072607907880", value = "小程序ID")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public GoodsQueryResponse orderNumber(String orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * 商品排序，自然整数, 数字越小越靠前
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "商品排序，自然整数, 数字越小越靠前")

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public GoodsQueryResponse originalPrice(String originalPrice) {
    
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * 单位\&quot;元\&quot;的商品原价，传入数字，不需要传入\&quot;元\&quot;
   * @return originalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "88.88", value = "单位\"元\"的商品原价，传入数字，不需要传入\"元\"")

  public String getOriginalPrice() {
    return originalPrice;
  }


  public void setOriginalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
  }


  public GoodsQueryResponse pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 品的售卖商家，即承接该品的小程序背后的商家。和mini_app_id要求对应
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxx", value = "品的售卖商家，即承接该品的小程序背后的商家。和mini_app_id要求对应")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public GoodsQueryResponse publishCities(String publishCities) {
    
    this.publishCities = publishCities;
    return this;
  }

   /**
   * 投放城市的列表，详见https://www.mca.gov.cn/article/sj/xzqh/2020/2020/202007170301.html，有多个用英文,分隔。如果没有限制则不传入
   * @return publishCities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "110000", value = "投放城市的列表，详见https://www.mca.gov.cn/article/sj/xzqh/2020/2020/202007170301.html，有多个用英文,分隔。如果没有限制则不传入")

  public String getPublishCities() {
    return publishCities;
  }


  public void setPublishCities(String publishCities) {
    this.publishCities = publishCities;
  }


  public GoodsQueryResponse remainingQuantity(Integer remainingQuantity) {
    
    this.remainingQuantity = remainingQuantity;
    return this;
  }

   /**
   * 剩余库存
   * @return remainingQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "999", value = "剩余库存")

  public Integer getRemainingQuantity() {
    return remainingQuantity;
  }


  public void setRemainingQuantity(Integer remainingQuantity) {
    this.remainingQuantity = remainingQuantity;
  }


  public GoodsQueryResponse sellPrice(String sellPrice) {
    
    this.sellPrice = sellPrice;
    return this;
  }

   /**
   * 单位\&quot;元\&quot;的售价，传入数字，不需要传入\&quot;元\&quot;
   * @return sellPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "66.66", value = "单位\"元\"的售价，传入数字，不需要传入\"元\"")

  public String getSellPrice() {
    return sellPrice;
  }


  public void setSellPrice(String sellPrice) {
    this.sellPrice = sellPrice;
  }


  public GoodsQueryResponse soldQuantity(Integer soldQuantity) {
    
    this.soldQuantity = soldQuantity;
    return this;
  }

   /**
   * 已售数量
   * @return soldQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "已售数量")

  public Integer getSoldQuantity() {
    return soldQuantity;
  }


  public void setSoldQuantity(Integer soldQuantity) {
    this.soldQuantity = soldQuantity;
  }


  public GoodsQueryResponse totalQuantity(String totalQuantity) {
    
    this.totalQuantity = totalQuantity;
    return this;
  }

   /**
   * 总库存量
   * @return totalQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "总库存量")

  public String getTotalQuantity() {
    return totalQuantity;
  }


  public void setTotalQuantity(String totalQuantity) {
    this.totalQuantity = totalQuantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsQueryResponse goodsQueryResponse = (GoodsQueryResponse) o;
    return Objects.equals(this.alipayGoodsId, goodsQueryResponse.alipayGoodsId) &&
        Objects.equals(this.buyingUrl, goodsQueryResponse.buyingUrl) &&
        Objects.equals(this.goodsComment, goodsQueryResponse.goodsComment) &&
        Objects.equals(this.goodsDescriptionLabel, goodsQueryResponse.goodsDescriptionLabel) &&
        Objects.equals(this.goodsId, goodsQueryResponse.goodsId) &&
        Objects.equals(this.goodsLabel, goodsQueryResponse.goodsLabel) &&
        Objects.equals(this.goodsName, goodsQueryResponse.goodsName) &&
        Objects.equals(this.goodsType, goodsQueryResponse.goodsType) &&
        Objects.equals(this.mainPicUrl, goodsQueryResponse.mainPicUrl) &&
        Objects.equals(this.miniAppId, goodsQueryResponse.miniAppId) &&
        Objects.equals(this.orderNumber, goodsQueryResponse.orderNumber) &&
        Objects.equals(this.originalPrice, goodsQueryResponse.originalPrice) &&
        Objects.equals(this.pid, goodsQueryResponse.pid) &&
        Objects.equals(this.publishCities, goodsQueryResponse.publishCities) &&
        Objects.equals(this.remainingQuantity, goodsQueryResponse.remainingQuantity) &&
        Objects.equals(this.sellPrice, goodsQueryResponse.sellPrice) &&
        Objects.equals(this.soldQuantity, goodsQueryResponse.soldQuantity) &&
        Objects.equals(this.totalQuantity, goodsQueryResponse.totalQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayGoodsId, buyingUrl, goodsComment, goodsDescriptionLabel, goodsId, goodsLabel, goodsName, goodsType, mainPicUrl, miniAppId, orderNumber, originalPrice, pid, publishCities, remainingQuantity, sellPrice, soldQuantity, totalQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsQueryResponse {\n");
    sb.append("    alipayGoodsId: ").append(toIndentedString(alipayGoodsId)).append("\n");
    sb.append("    buyingUrl: ").append(toIndentedString(buyingUrl)).append("\n");
    sb.append("    goodsComment: ").append(toIndentedString(goodsComment)).append("\n");
    sb.append("    goodsDescriptionLabel: ").append(toIndentedString(goodsDescriptionLabel)).append("\n");
    sb.append("    goodsId: ").append(toIndentedString(goodsId)).append("\n");
    sb.append("    goodsLabel: ").append(toIndentedString(goodsLabel)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
    sb.append("    goodsType: ").append(toIndentedString(goodsType)).append("\n");
    sb.append("    mainPicUrl: ").append(toIndentedString(mainPicUrl)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    publishCities: ").append(toIndentedString(publishCities)).append("\n");
    sb.append("    remainingQuantity: ").append(toIndentedString(remainingQuantity)).append("\n");
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
    sb.append("    soldQuantity: ").append(toIndentedString(soldQuantity)).append("\n");
    sb.append("    totalQuantity: ").append(toIndentedString(totalQuantity)).append("\n");
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
    openapiFields.add("alipay_goods_id");
    openapiFields.add("buying_url");
    openapiFields.add("goods_comment");
    openapiFields.add("goods_description_label");
    openapiFields.add("goods_id");
    openapiFields.add("goods_label");
    openapiFields.add("goods_name");
    openapiFields.add("goods_type");
    openapiFields.add("main_pic_url");
    openapiFields.add("mini_app_id");
    openapiFields.add("order_number");
    openapiFields.add("original_price");
    openapiFields.add("pid");
    openapiFields.add("publish_cities");
    openapiFields.add("remaining_quantity");
    openapiFields.add("sell_price");
    openapiFields.add("sold_quantity");
    openapiFields.add("total_quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoodsQueryResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GoodsQueryResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoodsQueryResponse is not found in the empty JSON string", GoodsQueryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GoodsQueryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoodsQueryResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("alipay_goods_id") != null && !jsonObj.get("alipay_goods_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_goods_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_goods_id").toString()));
      }
      if (jsonObj.get("buying_url") != null && !jsonObj.get("buying_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buying_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buying_url").toString()));
      }
      if (jsonObj.get("goods_comment") != null && !jsonObj.get("goods_comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_comment").toString()));
      }
      if (jsonObj.get("goods_description_label") != null && !jsonObj.get("goods_description_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_description_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_description_label").toString()));
      }
      if (jsonObj.get("goods_id") != null && !jsonObj.get("goods_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_id").toString()));
      }
      if (jsonObj.get("goods_label") != null && !jsonObj.get("goods_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_label").toString()));
      }
      if (jsonObj.get("goods_name") != null && !jsonObj.get("goods_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_name").toString()));
      }
      if (jsonObj.get("goods_type") != null && !jsonObj.get("goods_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_type").toString()));
      }
      if (jsonObj.get("main_pic_url") != null && !jsonObj.get("main_pic_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `main_pic_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("main_pic_url").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("order_number") != null && !jsonObj.get("order_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_number").toString()));
      }
      if (jsonObj.get("original_price") != null && !jsonObj.get("original_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_price").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if (jsonObj.get("publish_cities") != null && !jsonObj.get("publish_cities").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_cities` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_cities").toString()));
      }
      if (jsonObj.get("sell_price") != null && !jsonObj.get("sell_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sell_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sell_price").toString()));
      }
      if (jsonObj.get("total_quantity") != null && !jsonObj.get("total_quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_quantity").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoodsQueryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoodsQueryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoodsQueryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoodsQueryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoodsQueryResponse>() {
           @Override
           public void write(JsonWriter out, GoodsQueryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoodsQueryResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GoodsQueryResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoodsQueryResponse
  * @throws IOException if the JSON string is invalid with respect to GoodsQueryResponse
  */
  public static GoodsQueryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoodsQueryResponse.class);
  }

 /**
  * Convert an instance of GoodsQueryResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

