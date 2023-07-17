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
 * AddressInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddressInfoDTO {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ADDRESS_ID = "address_id";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ID)
  private String addressId;

  public static final String SERIALIZED_NAME_CITY_CODE = "city_code";
  @SerializedName(SERIALIZED_NAME_CITY_CODE)
  private String cityCode;

  public static final String SERIALIZED_NAME_CITY_NAME = "city_name";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName;

  public static final String SERIALIZED_NAME_COMMUNITY = "community";
  @SerializedName(SERIALIZED_NAME_COMMUNITY)
  private String community;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_MARK = "mark";
  @SerializedName(SERIALIZED_NAME_MARK)
  private String mark;

  public static final String SERIALIZED_NAME_POI_ID = "poi_id";
  @SerializedName(SERIALIZED_NAME_POI_ID)
  private String poiId;

  public AddressInfoDTO() { 
  }

  public AddressInfoDTO accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户id，当入参传入共同账户id时返回该值
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088501312695783", value = "共同账户id，当入参传入共同账户id时返回该值")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AddressInfoDTO address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 详细地址
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "西溪路569号蚂蚁A空间6楼601", value = "详细地址")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AddressInfoDTO addressId(String addressId) {
    
    this.addressId = addressId;
    return this;
  }

   /**
   * 地址id
   * @return addressId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "190303094020", value = "地址id")

  public String getAddressId() {
    return addressId;
  }


  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }


  public AddressInfoDTO cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 市(国家统一行政规划编码)
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330100", value = "市(国家统一行政规划编码)")

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public AddressInfoDTO cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * 城市
   * @return cityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州市", value = "城市")

  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public AddressInfoDTO community(String community) {
    
    this.community = community;
    return this;
  }

   /**
   * 小区/楼宇
   * @return community
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "蚂蚁A空间", value = "小区/楼宇")

  public String getCommunity() {
    return community;
  }


  public void setCommunity(String community) {
    this.community = community;
  }


  public AddressInfoDTO enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id，当入参传入企业id时返回该值
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088501312695783", value = "企业id，当入参传入企业id时返回该值")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AddressInfoDTO latitude(String latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * 纬度
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30.261121", value = "纬度")

  public String getLatitude() {
    return latitude;
  }


  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public AddressInfoDTO longitude(String longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * 经度
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120.104735", value = "经度")

  public String getLongitude() {
    return longitude;
  }


  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public AddressInfoDTO mark(String mark) {
    
    this.mark = mark;
    return this;
  }

   /**
   * 备注
   * @return mark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "备注", value = "备注")

  public String getMark() {
    return mark;
  }


  public void setMark(String mark) {
    this.mark = mark;
  }


  public AddressInfoDTO poiId(String poiId) {
    
    this.poiId = poiId;
    return this;
  }

   /**
   * 地图poi
   * @return poiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B0GKN4522Z", value = "地图poi")

  public String getPoiId() {
    return poiId;
  }


  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressInfoDTO addressInfoDTO = (AddressInfoDTO) o;
    return Objects.equals(this.accountId, addressInfoDTO.accountId) &&
        Objects.equals(this.address, addressInfoDTO.address) &&
        Objects.equals(this.addressId, addressInfoDTO.addressId) &&
        Objects.equals(this.cityCode, addressInfoDTO.cityCode) &&
        Objects.equals(this.cityName, addressInfoDTO.cityName) &&
        Objects.equals(this.community, addressInfoDTO.community) &&
        Objects.equals(this.enterpriseId, addressInfoDTO.enterpriseId) &&
        Objects.equals(this.latitude, addressInfoDTO.latitude) &&
        Objects.equals(this.longitude, addressInfoDTO.longitude) &&
        Objects.equals(this.mark, addressInfoDTO.mark) &&
        Objects.equals(this.poiId, addressInfoDTO.poiId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, address, addressId, cityCode, cityName, community, enterpriseId, latitude, longitude, mark, poiId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInfoDTO {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("address");
    openapiFields.add("address_id");
    openapiFields.add("city_code");
    openapiFields.add("city_name");
    openapiFields.add("community");
    openapiFields.add("enterprise_id");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("mark");
    openapiFields.add("poi_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddressInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddressInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressInfoDTO is not found in the empty JSON string", AddressInfoDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddressInfoDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddressInfoDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("address_id") != null && !jsonObj.get("address_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_id").toString()));
      }
      if (jsonObj.get("city_code") != null && !jsonObj.get("city_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_code").toString()));
      }
      if (jsonObj.get("city_name") != null && !jsonObj.get("city_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_name").toString()));
      }
      if (jsonObj.get("community") != null && !jsonObj.get("community").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `community` to be a primitive type in the JSON string but got `%s`", jsonObj.get("community").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("latitude") != null && !jsonObj.get("latitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latitude").toString()));
      }
      if (jsonObj.get("longitude") != null && !jsonObj.get("longitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `longitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("longitude").toString()));
      }
      if (jsonObj.get("mark") != null && !jsonObj.get("mark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mark").toString()));
      }
      if (jsonObj.get("poi_id") != null && !jsonObj.get("poi_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `poi_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poi_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressInfoDTO>() {
           @Override
           public void write(JsonWriter out, AddressInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressInfoDTO
  * @throws IOException if the JSON string is invalid with respect to AddressInfoDTO
  */
  public static AddressInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressInfoDTO.class);
  }

 /**
  * Convert an instance of AddressInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

