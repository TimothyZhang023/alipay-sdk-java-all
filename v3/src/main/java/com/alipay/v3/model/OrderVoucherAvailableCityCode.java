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
 * OrderVoucherAvailableCityCode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderVoucherAvailableCityCode {
  public static final String SERIALIZED_NAME_ALL_CITY = "all_city";
  @SerializedName(SERIALIZED_NAME_ALL_CITY)
  private Boolean allCity;

  public static final String SERIALIZED_NAME_CITY_CODES = "city_codes";
  @SerializedName(SERIALIZED_NAME_CITY_CODES)
  private List<String> cityCodes = null;

  public OrderVoucherAvailableCityCode() { 
  }

  public OrderVoucherAvailableCityCode allCity(Boolean allCity) {
    
    this.allCity = allCity;
    return this;
  }

   /**
   * 是否全国。选择全国后，无须填写city_codes字段。系统默认填充全国全部城市信息。
   * @return allCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否全国。选择全国后，无须填写city_codes字段。系统默认填充全国全部城市信息。")

  public Boolean getAllCity() {
    return allCity;
  }


  public void setAllCity(Boolean allCity) {
    this.allCity = allCity;
  }


  public OrderVoucherAvailableCityCode cityCodes(List<String> cityCodes) {
    
    this.cityCodes = cityCodes;
    return this;
  }

  public OrderVoucherAvailableCityCode addCityCodesItem(String cityCodesItem) {
    if (this.cityCodes == null) {
      this.cityCodes = new ArrayList<>();
    }
    this.cityCodes.add(cityCodesItem);
    return this;
  }

   /**
   * 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx  表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
   * @return cityCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx  表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）")

  public List<String> getCityCodes() {
    return cityCodes;
  }


  public void setCityCodes(List<String> cityCodes) {
    this.cityCodes = cityCodes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderVoucherAvailableCityCode orderVoucherAvailableCityCode = (OrderVoucherAvailableCityCode) o;
    return Objects.equals(this.allCity, orderVoucherAvailableCityCode.allCity) &&
        Objects.equals(this.cityCodes, orderVoucherAvailableCityCode.cityCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allCity, cityCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderVoucherAvailableCityCode {\n");
    sb.append("    allCity: ").append(toIndentedString(allCity)).append("\n");
    sb.append("    cityCodes: ").append(toIndentedString(cityCodes)).append("\n");
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
    openapiFields.add("all_city");
    openapiFields.add("city_codes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderVoucherAvailableCityCode
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderVoucherAvailableCityCode.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderVoucherAvailableCityCode is not found in the empty JSON string", OrderVoucherAvailableCityCode.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderVoucherAvailableCityCode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderVoucherAvailableCityCode` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("city_codes") != null && !jsonObj.get("city_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_codes` to be an array in the JSON string but got `%s`", jsonObj.get("city_codes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderVoucherAvailableCityCode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderVoucherAvailableCityCode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderVoucherAvailableCityCode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderVoucherAvailableCityCode.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderVoucherAvailableCityCode>() {
           @Override
           public void write(JsonWriter out, OrderVoucherAvailableCityCode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderVoucherAvailableCityCode read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderVoucherAvailableCityCode given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderVoucherAvailableCityCode
  * @throws IOException if the JSON string is invalid with respect to OrderVoucherAvailableCityCode
  */
  public static OrderVoucherAvailableCityCode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderVoucherAvailableCityCode.class);
  }

 /**
  * Convert an instance of OrderVoucherAvailableCityCode to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

