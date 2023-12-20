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
 * AuditLicenseInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditLicenseInfo {
  public static final String SERIALIZED_NAME_LICENSE_NAME = "license_name";
  @SerializedName(SERIALIZED_NAME_LICENSE_NAME)
  private String licenseName;

  public static final String SERIALIZED_NAME_LICENSE_NO = "license_no";
  @SerializedName(SERIALIZED_NAME_LICENSE_NO)
  private String licenseNo;

  public static final String SERIALIZED_NAME_LICENSE_PIC_LIST = "license_pic_list";
  @SerializedName(SERIALIZED_NAME_LICENSE_PIC_LIST)
  private List<String> licensePicList = null;

  public static final String SERIALIZED_NAME_LICENSE_VALID_DATE = "license_valid_date";
  @SerializedName(SERIALIZED_NAME_LICENSE_VALID_DATE)
  private String licenseValidDate;

  public static final String SERIALIZED_NAME_OUT_DOOR_PIC = "out_door_pic";
  @SerializedName(SERIALIZED_NAME_OUT_DOOR_PIC)
  private String outDoorPic;

  public AuditLicenseInfo() { 
  }

  public AuditLicenseInfo licenseName(String licenseName) {
    
    this.licenseName = licenseName;
    return this;
  }

   /**
   * 营业执照名称，需要与营业执照保持一致
   * @return licenseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "营业执照名称，需要与营业执照保持一致")

  public String getLicenseName() {
    return licenseName;
  }


  public void setLicenseName(String licenseName) {
    this.licenseName = licenseName;
  }


  public AuditLicenseInfo licenseNo(String licenseNo) {
    
    this.licenseNo = licenseNo;
    return this;
  }

   /**
   * 营业执照号，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息，如果不填默认采用当前小程序应用营业执照号。
   * @return licenseNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "营业执照号，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息，如果不填默认采用当前小程序应用营业执照号。")

  public String getLicenseNo() {
    return licenseNo;
  }


  public void setLicenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
  }


  public AuditLicenseInfo licensePicList(List<String> licensePicList) {
    
    this.licensePicList = licensePicList;
    return this;
  }

  public AuditLicenseInfo addLicensePicListItem(String licensePicListItem) {
    if (this.licensePicList == null) {
      this.licensePicList = new ArrayList<>();
    }
    this.licensePicList.add(licensePicListItem);
    return this;
  }

   /**
   * 营业执照照片地址列表
   * @return licensePicList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "营业执照照片地址列表")

  public List<String> getLicensePicList() {
    return licensePicList;
  }


  public void setLicensePicList(List<String> licensePicList) {
    this.licensePicList = licensePicList;
  }


  public AuditLicenseInfo licenseValidDate(String licenseValidDate) {
    
    this.licenseValidDate = licenseValidDate;
    return this;
  }

   /**
   * 营业执有效期，格式为yyyy-MM-dd，9999-12-31表示长期
   * @return licenseValidDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "营业执有效期，格式为yyyy-MM-dd，9999-12-31表示长期")

  public String getLicenseValidDate() {
    return licenseValidDate;
  }


  public void setLicenseValidDate(String licenseValidDate) {
    this.licenseValidDate = licenseValidDate;
  }


  public AuditLicenseInfo outDoorPic(String outDoorPic) {
    
    this.outDoorPic = outDoorPic;
    return this;
  }

   /**
   * 门头照图片地址，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息，如果不填默认采用当前小程序门头照图片
   * @return outDoorPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门头照图片地址，部分小程序类目需要提交，参照https://docs.alipay.com/isv/10325中是否需要营业执照信息，如果不填默认采用当前小程序门头照图片")

  public String getOutDoorPic() {
    return outDoorPic;
  }


  public void setOutDoorPic(String outDoorPic) {
    this.outDoorPic = outDoorPic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLicenseInfo auditLicenseInfo = (AuditLicenseInfo) o;
    return Objects.equals(this.licenseName, auditLicenseInfo.licenseName) &&
        Objects.equals(this.licenseNo, auditLicenseInfo.licenseNo) &&
        Objects.equals(this.licensePicList, auditLicenseInfo.licensePicList) &&
        Objects.equals(this.licenseValidDate, auditLicenseInfo.licenseValidDate) &&
        Objects.equals(this.outDoorPic, auditLicenseInfo.outDoorPic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseName, licenseNo, licensePicList, licenseValidDate, outDoorPic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLicenseInfo {\n");
    sb.append("    licenseName: ").append(toIndentedString(licenseName)).append("\n");
    sb.append("    licenseNo: ").append(toIndentedString(licenseNo)).append("\n");
    sb.append("    licensePicList: ").append(toIndentedString(licensePicList)).append("\n");
    sb.append("    licenseValidDate: ").append(toIndentedString(licenseValidDate)).append("\n");
    sb.append("    outDoorPic: ").append(toIndentedString(outDoorPic)).append("\n");
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
    openapiFields.add("license_name");
    openapiFields.add("license_no");
    openapiFields.add("license_pic_list");
    openapiFields.add("license_valid_date");
    openapiFields.add("out_door_pic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuditLicenseInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuditLicenseInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditLicenseInfo is not found in the empty JSON string", AuditLicenseInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuditLicenseInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuditLicenseInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("license_name") != null && !jsonObj.get("license_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_name").toString()));
      }
      if (jsonObj.get("license_no") != null && !jsonObj.get("license_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_no").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("license_pic_list") != null && !jsonObj.get("license_pic_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_pic_list` to be an array in the JSON string but got `%s`", jsonObj.get("license_pic_list").toString()));
      }
      if (jsonObj.get("license_valid_date") != null && !jsonObj.get("license_valid_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_valid_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_valid_date").toString()));
      }
      if (jsonObj.get("out_door_pic") != null && !jsonObj.get("out_door_pic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_door_pic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_door_pic").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditLicenseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditLicenseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditLicenseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditLicenseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditLicenseInfo>() {
           @Override
           public void write(JsonWriter out, AuditLicenseInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuditLicenseInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuditLicenseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuditLicenseInfo
  * @throws IOException if the JSON string is invalid with respect to AuditLicenseInfo
  */
  public static AuditLicenseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditLicenseInfo.class);
  }

 /**
  * Convert an instance of AuditLicenseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

