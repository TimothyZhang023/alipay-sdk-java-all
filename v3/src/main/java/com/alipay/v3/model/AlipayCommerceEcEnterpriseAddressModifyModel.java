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
 * AlipayCommerceEcEnterpriseAddressModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcEnterpriseAddressModifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ADDRESS_ID = "address_id";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ID)
  private String addressId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

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

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayCommerceEcEnterpriseAddressModifyModel() { 
  }

  public AlipayCommerceEcEnterpriseAddressModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayCommerceEcEnterpriseAddressModifyModel address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 详细地址最长50个字符
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "西溪路569号蚂蚁A空间6楼601", value = "详细地址最长50个字符")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AlipayCommerceEcEnterpriseAddressModifyModel addressId(String addressId) {
    
    this.addressId = addressId;
    return this;
  }

   /**
   * 地址id
   * @return addressId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19393030303", value = "地址id")

  public String getAddressId() {
    return addressId;
  }


  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }


  public AlipayCommerceEcEnterpriseAddressModifyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001181407500", value = "可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayCommerceEcEnterpriseAddressModifyModel cityCode(String cityCode) {
    
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


  public AlipayCommerceEcEnterpriseAddressModifyModel cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * 城市名称
   * @return cityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州市", value = "城市名称")

  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public AlipayCommerceEcEnterpriseAddressModifyModel community(String community) {
    
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


  public AlipayCommerceEcEnterpriseAddressModifyModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123412341234", value = "通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayCommerceEcEnterpriseAddressModifyModel latitude(String latitude) {
    
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


  public AlipayCommerceEcEnterpriseAddressModifyModel longitude(String longitude) {
    
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


  public AlipayCommerceEcEnterpriseAddressModifyModel mark(String mark) {
    
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


  public AlipayCommerceEcEnterpriseAddressModifyModel poiId(String poiId) {
    
    this.poiId = poiId;
    return this;
  }

   /**
   * 高德地图poi
   * @return poiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B0GKN4522Z", value = "高德地图poi")

  public String getPoiId() {
    return poiId;
  }


  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }


  public AlipayCommerceEcEnterpriseAddressModifyModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 状态(生效/失效)
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NORMAL", value = "状态(生效/失效)")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceEcEnterpriseAddressModifyModel alipayCommerceEcEnterpriseAddressModifyModel = (AlipayCommerceEcEnterpriseAddressModifyModel) o;
    return Objects.equals(this.accountId, alipayCommerceEcEnterpriseAddressModifyModel.accountId) &&
        Objects.equals(this.address, alipayCommerceEcEnterpriseAddressModifyModel.address) &&
        Objects.equals(this.addressId, alipayCommerceEcEnterpriseAddressModifyModel.addressId) &&
        Objects.equals(this.agreementNo, alipayCommerceEcEnterpriseAddressModifyModel.agreementNo) &&
        Objects.equals(this.cityCode, alipayCommerceEcEnterpriseAddressModifyModel.cityCode) &&
        Objects.equals(this.cityName, alipayCommerceEcEnterpriseAddressModifyModel.cityName) &&
        Objects.equals(this.community, alipayCommerceEcEnterpriseAddressModifyModel.community) &&
        Objects.equals(this.enterpriseId, alipayCommerceEcEnterpriseAddressModifyModel.enterpriseId) &&
        Objects.equals(this.latitude, alipayCommerceEcEnterpriseAddressModifyModel.latitude) &&
        Objects.equals(this.longitude, alipayCommerceEcEnterpriseAddressModifyModel.longitude) &&
        Objects.equals(this.mark, alipayCommerceEcEnterpriseAddressModifyModel.mark) &&
        Objects.equals(this.poiId, alipayCommerceEcEnterpriseAddressModifyModel.poiId) &&
        Objects.equals(this.status, alipayCommerceEcEnterpriseAddressModifyModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, address, addressId, agreementNo, cityCode, cityName, community, enterpriseId, latitude, longitude, mark, poiId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcEnterpriseAddressModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("agreement_no");
    openapiFields.add("city_code");
    openapiFields.add("city_name");
    openapiFields.add("community");
    openapiFields.add("enterprise_id");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("mark");
    openapiFields.add("poi_id");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcEnterpriseAddressModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcEnterpriseAddressModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcEnterpriseAddressModifyModel is not found in the empty JSON string", AlipayCommerceEcEnterpriseAddressModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceEcEnterpriseAddressModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceEcEnterpriseAddressModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
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
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcEnterpriseAddressModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcEnterpriseAddressModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcEnterpriseAddressModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcEnterpriseAddressModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcEnterpriseAddressModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcEnterpriseAddressModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceEcEnterpriseAddressModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceEcEnterpriseAddressModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcEnterpriseAddressModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcEnterpriseAddressModifyModel
  */
  public static AlipayCommerceEcEnterpriseAddressModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcEnterpriseAddressModifyModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcEnterpriseAddressModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

