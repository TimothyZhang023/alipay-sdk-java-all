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
 * DiscountDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DiscountDetail {
  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private String discountAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_DESC = "discount_desc";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_DESC)
  private List<String> discountDesc = null;

  public static final String SERIALIZED_NAME_DISCOUNT_TYPE = "discount_type";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_TYPE)
  private String discountType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_HIT = "is_hit";
  @SerializedName(SERIALIZED_NAME_IS_HIT)
  private String isHit;

  public static final String SERIALIZED_NAME_IS_PURCHASED = "is_purchased";
  @SerializedName(SERIALIZED_NAME_IS_PURCHASED)
  private String isPurchased;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public DiscountDetail() { 
  }

  public DiscountDetail discountAmount(String discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * 优惠金额
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "优惠金额")

  public String getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }


  public DiscountDetail discountDesc(List<String> discountDesc) {
    
    this.discountDesc = discountDesc;
    return this;
  }

  public DiscountDetail addDiscountDescItem(String discountDescItem) {
    if (this.discountDesc == null) {
      this.discountDesc = new ArrayList<>();
    }
    this.discountDesc.add(discountDescItem);
    return this;
  }

   /**
   * 优惠描述，比如至多优惠XX元，满XX减XX
   * @return discountDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "最高优惠10元；储值卡专属", value = "优惠描述，比如至多优惠XX元，满XX减XX")

  public List<String> getDiscountDesc() {
    return discountDesc;
  }


  public void setDiscountDesc(List<String> discountDesc) {
    this.discountDesc = discountDesc;
  }


  public DiscountDetail discountType(String discountType) {
    
    this.discountType = discountType;
    return this;
  }

   /**
   * 优惠类型,商家优惠（M_DISCOUNT），平台优惠（RT_DISCOUNT）
   * @return discountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RT_DISCOUNT", value = "优惠类型,商家优惠（M_DISCOUNT），平台优惠（RT_DISCOUNT）")

  public String getDiscountType() {
    return discountType;
  }


  public void setDiscountType(String discountType) {
    this.discountType = discountType;
  }


  public DiscountDetail id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 优惠ID或活动ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017CVCJD788E889EC", value = "优惠ID或活动ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DiscountDetail isHit(String isHit) {
    
    this.isHit = isHit;
    return this;
  }

   /**
   * 优惠是否命中, true代表命中了优惠；false代表未命中优惠
   * @return isHit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "优惠是否命中, true代表命中了优惠；false代表未命中优惠")

  public String getIsHit() {
    return isHit;
  }


  public void setIsHit(String isHit) {
    this.isHit = isHit;
  }


  public DiscountDetail isPurchased(String isPurchased) {
    
    this.isPurchased = isPurchased;
    return this;
  }

   /**
   * 是否是购买券, true代表是购买的券，false调表不是购买的券
   * @return isPurchased
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否是购买券, true代表是购买的券，false调表不是购买的券")

  public String getIsPurchased() {
    return isPurchased;
  }


  public void setIsPurchased(String isPurchased) {
    this.isPurchased = isPurchased;
  }


  public DiscountDetail name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 优惠名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5折优惠", value = "优惠名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountDetail discountDetail = (DiscountDetail) o;
    return Objects.equals(this.discountAmount, discountDetail.discountAmount) &&
        Objects.equals(this.discountDesc, discountDetail.discountDesc) &&
        Objects.equals(this.discountType, discountDetail.discountType) &&
        Objects.equals(this.id, discountDetail.id) &&
        Objects.equals(this.isHit, discountDetail.isHit) &&
        Objects.equals(this.isPurchased, discountDetail.isPurchased) &&
        Objects.equals(this.name, discountDetail.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountAmount, discountDesc, discountType, id, isHit, isPurchased, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountDetail {\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountDesc: ").append(toIndentedString(discountDesc)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isHit: ").append(toIndentedString(isHit)).append("\n");
    sb.append("    isPurchased: ").append(toIndentedString(isPurchased)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("discount_amount");
    openapiFields.add("discount_desc");
    openapiFields.add("discount_type");
    openapiFields.add("id");
    openapiFields.add("is_hit");
    openapiFields.add("is_purchased");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DiscountDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DiscountDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiscountDetail is not found in the empty JSON string", DiscountDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DiscountDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiscountDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("discount_amount") != null && !jsonObj.get("discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_amount").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("discount_desc") != null && !jsonObj.get("discount_desc").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_desc` to be an array in the JSON string but got `%s`", jsonObj.get("discount_desc").toString()));
      }
      if (jsonObj.get("discount_type") != null && !jsonObj.get("discount_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_type").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("is_hit") != null && !jsonObj.get("is_hit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_hit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_hit").toString()));
      }
      if (jsonObj.get("is_purchased") != null && !jsonObj.get("is_purchased").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_purchased` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_purchased").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiscountDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscountDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscountDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscountDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscountDetail>() {
           @Override
           public void write(JsonWriter out, DiscountDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiscountDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiscountDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiscountDetail
  * @throws IOException if the JSON string is invalid with respect to DiscountDetail
  */
  public static DiscountDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscountDetail.class);
  }

 /**
  * Convert an instance of DiscountDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

