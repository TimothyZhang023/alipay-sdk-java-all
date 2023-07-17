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
 * ActivityDiscountVoucher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ActivityDiscountVoucher {
  public static final String SERIALIZED_NAME_CEILING_AMOUNT = "ceiling_amount";
  @SerializedName(SERIALIZED_NAME_CEILING_AMOUNT)
  private String ceilingAmount;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private String discount;

  public static final String SERIALIZED_NAME_FLOOR_AMOUNT = "floor_amount";
  @SerializedName(SERIALIZED_NAME_FLOOR_AMOUNT)
  private String floorAmount;

  public static final String SERIALIZED_NAME_GOODS_NAME = "goods_name";
  @SerializedName(SERIALIZED_NAME_GOODS_NAME)
  private String goodsName;

  public static final String SERIALIZED_NAME_ORIGIN_AMOUNT = "origin_amount";
  @SerializedName(SERIALIZED_NAME_ORIGIN_AMOUNT)
  private String originAmount;

  public ActivityDiscountVoucher() { 
  }

  public ActivityDiscountVoucher ceilingAmount(String ceilingAmount) {
    
    this.ceilingAmount = ceilingAmount;
    return this;
  }

   /**
   * 封顶金额。
   * @return ceilingAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "封顶金额。")

  public String getCeilingAmount() {
    return ceilingAmount;
  }


  public void setCeilingAmount(String ceilingAmount) {
    this.ceilingAmount = ceilingAmount;
  }


  public ActivityDiscountVoucher discount(String discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * 折扣率。
   * @return discount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "折扣率。")

  public String getDiscount() {
    return discount;
  }


  public void setDiscount(String discount) {
    this.discount = discount;
  }


  public ActivityDiscountVoucher floorAmount(String floorAmount) {
    
    this.floorAmount = floorAmount;
    return this;
  }

   /**
   * 门槛金额。
   * @return floorAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门槛金额。")

  public String getFloorAmount() {
    return floorAmount;
  }


  public void setFloorAmount(String floorAmount) {
    this.floorAmount = floorAmount;
  }


  public ActivityDiscountVoucher goodsName(String goodsName) {
    
    this.goodsName = goodsName;
    return this;
  }

   /**
   * 商品名称。说明：该字段可不填，填入 origin_amount 则必填。
   * @return goodsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品名称。说明：该字段可不填，填入 origin_amount 则必填。")

  public String getGoodsName() {
    return goodsName;
  }


  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public ActivityDiscountVoucher originAmount(String originAmount) {
    
    this.originAmount = originAmount;
    return this;
  }

   /**
   * 原价。
   * @return originAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "原价。")

  public String getOriginAmount() {
    return originAmount;
  }


  public void setOriginAmount(String originAmount) {
    this.originAmount = originAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityDiscountVoucher activityDiscountVoucher = (ActivityDiscountVoucher) o;
    return Objects.equals(this.ceilingAmount, activityDiscountVoucher.ceilingAmount) &&
        Objects.equals(this.discount, activityDiscountVoucher.discount) &&
        Objects.equals(this.floorAmount, activityDiscountVoucher.floorAmount) &&
        Objects.equals(this.goodsName, activityDiscountVoucher.goodsName) &&
        Objects.equals(this.originAmount, activityDiscountVoucher.originAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ceilingAmount, discount, floorAmount, goodsName, originAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityDiscountVoucher {\n");
    sb.append("    ceilingAmount: ").append(toIndentedString(ceilingAmount)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    floorAmount: ").append(toIndentedString(floorAmount)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
    sb.append("    originAmount: ").append(toIndentedString(originAmount)).append("\n");
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
    openapiFields.add("ceiling_amount");
    openapiFields.add("discount");
    openapiFields.add("floor_amount");
    openapiFields.add("goods_name");
    openapiFields.add("origin_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActivityDiscountVoucher
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ActivityDiscountVoucher.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivityDiscountVoucher is not found in the empty JSON string", ActivityDiscountVoucher.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActivityDiscountVoucher.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActivityDiscountVoucher` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ceiling_amount") != null && !jsonObj.get("ceiling_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ceiling_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ceiling_amount").toString()));
      }
      if (jsonObj.get("discount") != null && !jsonObj.get("discount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount").toString()));
      }
      if (jsonObj.get("floor_amount") != null && !jsonObj.get("floor_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `floor_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("floor_amount").toString()));
      }
      if (jsonObj.get("goods_name") != null && !jsonObj.get("goods_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_name").toString()));
      }
      if (jsonObj.get("origin_amount") != null && !jsonObj.get("origin_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivityDiscountVoucher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivityDiscountVoucher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivityDiscountVoucher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivityDiscountVoucher.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivityDiscountVoucher>() {
           @Override
           public void write(JsonWriter out, ActivityDiscountVoucher value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActivityDiscountVoucher read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActivityDiscountVoucher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivityDiscountVoucher
  * @throws IOException if the JSON string is invalid with respect to ActivityDiscountVoucher
  */
  public static ActivityDiscountVoucher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivityDiscountVoucher.class);
  }

 /**
  * Convert an instance of ActivityDiscountVoucher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

