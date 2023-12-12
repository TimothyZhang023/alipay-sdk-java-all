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
 * BrandRegistrationInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BrandRegistrationInfo {
  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_REG_MATERIALS = "reg_materials";
  @SerializedName(SERIALIZED_NAME_REG_MATERIALS)
  private List<String> regMaterials = null;

  public static final String SERIALIZED_NAME_REG_NUMBER = "reg_number";
  @SerializedName(SERIALIZED_NAME_REG_NUMBER)
  private String regNumber;

  public static final String SERIALIZED_NAME_REGISTRANT = "registrant";
  @SerializedName(SERIALIZED_NAME_REGISTRANT)
  private String registrant;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public BrandRegistrationInfo() { 
  }

  public BrandRegistrationInfo endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * 商标有效期(结束日期)
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-16", value = "商标有效期(结束日期)")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public BrandRegistrationInfo regMaterials(List<String> regMaterials) {
    
    this.regMaterials = regMaterials;
    return this;
  }

  public BrandRegistrationInfo addRegMaterialsItem(String regMaterialsItem) {
    if (this.regMaterials == null) {
      this.regMaterials = new ArrayList<>();
    }
    this.regMaterials.add(regMaterialsItem);
    return this;
  }

   /**
   * 商标注册证书信息(当前只支持图片类型，请调用alipay.open.mini.miniapp.brand.upload接口上传图片,可以上传多个商标注册证书信息)
   * @return regMaterials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"ua2qD53TRpyfX-UYYin6sQAAACMAAQED\",\"ua2qD53TRpyfX-UYYin6sQAAACMAAQED\"]", value = "商标注册证书信息(当前只支持图片类型，请调用alipay.open.mini.miniapp.brand.upload接口上传图片,可以上传多个商标注册证书信息)")

  public List<String> getRegMaterials() {
    return regMaterials;
  }


  public void setRegMaterials(List<String> regMaterials) {
    this.regMaterials = regMaterials;
  }


  public BrandRegistrationInfo regNumber(String regNumber) {
    
    this.regNumber = regNumber;
    return this;
  }

   /**
   * 商标注册号
   * @return regNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "654893218979520200916249621", value = "商标注册号")

  public String getRegNumber() {
    return regNumber;
  }


  public void setRegNumber(String regNumber) {
    this.regNumber = regNumber;
  }


  public BrandRegistrationInfo registrant(String registrant) {
    
    this.registrant = registrant;
    return this;
  }

   /**
   * 商标注册人
   * @return registrant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "商标注册人")

  public String getRegistrant() {
    return registrant;
  }


  public void setRegistrant(String registrant) {
    this.registrant = registrant;
  }


  public BrandRegistrationInfo startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * 商标有效期(开始日期)
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-10 08:00:00", value = "商标有效期(开始日期)")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandRegistrationInfo brandRegistrationInfo = (BrandRegistrationInfo) o;
    return Objects.equals(this.endDate, brandRegistrationInfo.endDate) &&
        Objects.equals(this.regMaterials, brandRegistrationInfo.regMaterials) &&
        Objects.equals(this.regNumber, brandRegistrationInfo.regNumber) &&
        Objects.equals(this.registrant, brandRegistrationInfo.registrant) &&
        Objects.equals(this.startDate, brandRegistrationInfo.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, regMaterials, regNumber, registrant, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandRegistrationInfo {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    regMaterials: ").append(toIndentedString(regMaterials)).append("\n");
    sb.append("    regNumber: ").append(toIndentedString(regNumber)).append("\n");
    sb.append("    registrant: ").append(toIndentedString(registrant)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("end_date");
    openapiFields.add("reg_materials");
    openapiFields.add("reg_number");
    openapiFields.add("registrant");
    openapiFields.add("start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BrandRegistrationInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BrandRegistrationInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrandRegistrationInfo is not found in the empty JSON string", BrandRegistrationInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BrandRegistrationInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BrandRegistrationInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("reg_materials") != null && !jsonObj.get("reg_materials").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reg_materials` to be an array in the JSON string but got `%s`", jsonObj.get("reg_materials").toString()));
      }
      if (jsonObj.get("reg_number") != null && !jsonObj.get("reg_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reg_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reg_number").toString()));
      }
      if (jsonObj.get("registrant") != null && !jsonObj.get("registrant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrant").toString()));
      }
      if (jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandRegistrationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandRegistrationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandRegistrationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandRegistrationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandRegistrationInfo>() {
           @Override
           public void write(JsonWriter out, BrandRegistrationInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandRegistrationInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandRegistrationInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandRegistrationInfo
  * @throws IOException if the JSON string is invalid with respect to BrandRegistrationInfo
  */
  public static BrandRegistrationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandRegistrationInfo.class);
  }

 /**
  * Convert an instance of BrandRegistrationInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

