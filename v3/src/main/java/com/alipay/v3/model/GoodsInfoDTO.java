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
 * GoodsInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GoodsInfoDTO {
  public static final String SERIALIZED_NAME_GOODS_AMOUNT = "goods_amount";
  @SerializedName(SERIALIZED_NAME_GOODS_AMOUNT)
  private String goodsAmount;

  public static final String SERIALIZED_NAME_GOODS_COUNT = "goods_count";
  @SerializedName(SERIALIZED_NAME_GOODS_COUNT)
  private String goodsCount;

  public static final String SERIALIZED_NAME_GOODS_ID = "goods_id";
  @SerializedName(SERIALIZED_NAME_GOODS_ID)
  private String goodsId;

  public static final String SERIALIZED_NAME_GOODS_NAME = "goods_name";
  @SerializedName(SERIALIZED_NAME_GOODS_NAME)
  private String goodsName;

  public GoodsInfoDTO() { 
  }

  public GoodsInfoDTO goodsAmount(String goodsAmount) {
    
    this.goodsAmount = goodsAmount;
    return this;
  }

   /**
   * 商品金额
   * @return goodsAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52.10", value = "商品金额")

  public String getGoodsAmount() {
    return goodsAmount;
  }


  public void setGoodsAmount(String goodsAmount) {
    this.goodsAmount = goodsAmount;
  }


  public GoodsInfoDTO goodsCount(String goodsCount) {
    
    this.goodsCount = goodsCount;
    return this;
  }

   /**
   * 商品购买数量
   * @return goodsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "商品购买数量")

  public String getGoodsCount() {
    return goodsCount;
  }


  public void setGoodsCount(String goodsCount) {
    this.goodsCount = goodsCount;
  }


  public GoodsInfoDTO goodsId(String goodsId) {
    
    this.goodsId = goodsId;
    return this;
  }

   /**
   * 商品标准69码
   * @return goodsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "69212", value = "商品标准69码")

  public String getGoodsId() {
    return goodsId;
  }


  public void setGoodsId(String goodsId) {
    this.goodsId = goodsId;
  }


  public GoodsInfoDTO goodsName(String goodsName) {
    
    this.goodsName = goodsName;
    return this;
  }

   /**
   * 商品名称
   * @return goodsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "元气森林", value = "商品名称")

  public String getGoodsName() {
    return goodsName;
  }


  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsInfoDTO goodsInfoDTO = (GoodsInfoDTO) o;
    return Objects.equals(this.goodsAmount, goodsInfoDTO.goodsAmount) &&
        Objects.equals(this.goodsCount, goodsInfoDTO.goodsCount) &&
        Objects.equals(this.goodsId, goodsInfoDTO.goodsId) &&
        Objects.equals(this.goodsName, goodsInfoDTO.goodsName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodsAmount, goodsCount, goodsId, goodsName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsInfoDTO {\n");
    sb.append("    goodsAmount: ").append(toIndentedString(goodsAmount)).append("\n");
    sb.append("    goodsCount: ").append(toIndentedString(goodsCount)).append("\n");
    sb.append("    goodsId: ").append(toIndentedString(goodsId)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
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
    openapiFields.add("goods_amount");
    openapiFields.add("goods_count");
    openapiFields.add("goods_id");
    openapiFields.add("goods_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoodsInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GoodsInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoodsInfoDTO is not found in the empty JSON string", GoodsInfoDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GoodsInfoDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoodsInfoDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("goods_amount") != null && !jsonObj.get("goods_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_amount").toString()));
      }
      if (jsonObj.get("goods_count") != null && !jsonObj.get("goods_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_count").toString()));
      }
      if (jsonObj.get("goods_id") != null && !jsonObj.get("goods_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_id").toString()));
      }
      if (jsonObj.get("goods_name") != null && !jsonObj.get("goods_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoodsInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoodsInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoodsInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoodsInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<GoodsInfoDTO>() {
           @Override
           public void write(JsonWriter out, GoodsInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoodsInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GoodsInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoodsInfoDTO
  * @throws IOException if the JSON string is invalid with respect to GoodsInfoDTO
  */
  public static GoodsInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoodsInfoDTO.class);
  }

 /**
  * Convert an instance of GoodsInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

