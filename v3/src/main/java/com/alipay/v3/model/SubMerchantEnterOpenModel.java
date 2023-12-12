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
 * SubMerchantEnterOpenModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubMerchantEnterOpenModel {
  public static final String SERIALIZED_NAME_EXTEND_FIELDS = "extend_fields";
  @SerializedName(SERIALIZED_NAME_EXTEND_FIELDS)
  private String extendFields;

  public static final String SERIALIZED_NAME_INDUSTRY = "industry";
  @SerializedName(SERIALIZED_NAME_INDUSTRY)
  private String industry;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_REGISTER_NO = "register_no";
  @SerializedName(SERIALIZED_NAME_REGISTER_NO)
  private String registerNo;

  public static final String SERIALIZED_NAME_SUB_M_NAME = "sub_m_name";
  @SerializedName(SERIALIZED_NAME_SUB_M_NAME)
  private String subMName;

  public static final String SERIALIZED_NAME_SUB_M_SHORT_NAME = "sub_m_short_name";
  @SerializedName(SERIALIZED_NAME_SUB_M_SHORT_NAME)
  private String subMShortName;

  public SubMerchantEnterOpenModel() { 
  }

  public SubMerchantEnterOpenModel extendFields(String extendFields) {
    
    this.extendFields = extendFields;
    return this;
  }

   /**
   * 扩展字段，为json字符串格式；入驻缴费后开票的产品如果需要传入自定义开票链接，由此字段传入。
   * @return extendFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"{\\\\\"MERCHANT_OPEN_URL\\\\\":\\\\\"http://xxx\\\\\"}\"", value = "扩展字段，为json字符串格式；入驻缴费后开票的产品如果需要传入自定义开票链接，由此字段传入。")

  public String getExtendFields() {
    return extendFields;
  }


  public void setExtendFields(String extendFields) {
    this.extendFields = extendFields;
  }


  public SubMerchantEnterOpenModel industry(String industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * 商户行业，枚举值如下：subway：地铁，etc：ETC，online_car_hailing：网约车，catering：餐饮，hotel：酒店，convenience_store：便利店，oil：加油，insurance：保险，service_provider：运营商，life_payment：生活缴费，political：政务，other：其他
   * @return industry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hotel", value = "商户行业，枚举值如下：subway：地铁，etc：ETC，online_car_hailing：网约车，catering：餐饮，hotel：酒店，convenience_store：便利店，oil：加油，insurance：保险，service_provider：运营商，life_payment：生活缴费，political：政务，other：其他")

  public String getIndustry() {
    return industry;
  }


  public void setIndustry(String industry) {
    this.industry = industry;
  }


  public SubMerchantEnterOpenModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 开票商户pid，入驻支付即开票场景的时候，非登录账号入驻模式，则该字段必传
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102143353534", value = "开票商户pid，入驻支付即开票场景的时候，非登录账号入驻模式，则该字段必传")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public SubMerchantEnterOpenModel registerNo(String registerNo) {
    
    this.registerNo = registerNo;
    return this;
  }

   /**
   * 商户门店税号。
   * @return registerNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "91500000747150346A", value = "商户门店税号。")

  public String getRegisterNo() {
    return registerNo;
  }


  public void setRegisterNo(String registerNo) {
    this.registerNo = registerNo;
  }


  public SubMerchantEnterOpenModel subMName(String subMName) {
    
    this.subMName = subMName;
    return this;
  }

   /**
   * 商户门店全称。
   * @return subMName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州蚂蚁金服信息技术有限公司", value = "商户门店全称。")

  public String getSubMName() {
    return subMName;
  }


  public void setSubMName(String subMName) {
    this.subMName = subMName;
  }


  public SubMerchantEnterOpenModel subMShortName(String subMShortName) {
    
    this.subMShortName = subMShortName;
    return this;
  }

   /**
   * 商户门店简称
   * @return subMShortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MYJF_HZ", value = "商户门店简称")

  public String getSubMShortName() {
    return subMShortName;
  }


  public void setSubMShortName(String subMShortName) {
    this.subMShortName = subMShortName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubMerchantEnterOpenModel subMerchantEnterOpenModel = (SubMerchantEnterOpenModel) o;
    return Objects.equals(this.extendFields, subMerchantEnterOpenModel.extendFields) &&
        Objects.equals(this.industry, subMerchantEnterOpenModel.industry) &&
        Objects.equals(this.pid, subMerchantEnterOpenModel.pid) &&
        Objects.equals(this.registerNo, subMerchantEnterOpenModel.registerNo) &&
        Objects.equals(this.subMName, subMerchantEnterOpenModel.subMName) &&
        Objects.equals(this.subMShortName, subMerchantEnterOpenModel.subMShortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendFields, industry, pid, registerNo, subMName, subMShortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubMerchantEnterOpenModel {\n");
    sb.append("    extendFields: ").append(toIndentedString(extendFields)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    registerNo: ").append(toIndentedString(registerNo)).append("\n");
    sb.append("    subMName: ").append(toIndentedString(subMName)).append("\n");
    sb.append("    subMShortName: ").append(toIndentedString(subMShortName)).append("\n");
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
    openapiFields.add("extend_fields");
    openapiFields.add("industry");
    openapiFields.add("pid");
    openapiFields.add("register_no");
    openapiFields.add("sub_m_name");
    openapiFields.add("sub_m_short_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubMerchantEnterOpenModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubMerchantEnterOpenModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubMerchantEnterOpenModel is not found in the empty JSON string", SubMerchantEnterOpenModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubMerchantEnterOpenModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubMerchantEnterOpenModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("extend_fields") != null && !jsonObj.get("extend_fields").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_fields` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_fields").toString()));
      }
      if (jsonObj.get("industry") != null && !jsonObj.get("industry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `industry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("industry").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if (jsonObj.get("register_no") != null && !jsonObj.get("register_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `register_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("register_no").toString()));
      }
      if (jsonObj.get("sub_m_name") != null && !jsonObj.get("sub_m_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_m_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_m_name").toString()));
      }
      if (jsonObj.get("sub_m_short_name") != null && !jsonObj.get("sub_m_short_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_m_short_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_m_short_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubMerchantEnterOpenModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubMerchantEnterOpenModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubMerchantEnterOpenModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubMerchantEnterOpenModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SubMerchantEnterOpenModel>() {
           @Override
           public void write(JsonWriter out, SubMerchantEnterOpenModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubMerchantEnterOpenModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubMerchantEnterOpenModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubMerchantEnterOpenModel
  * @throws IOException if the JSON string is invalid with respect to SubMerchantEnterOpenModel
  */
  public static SubMerchantEnterOpenModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubMerchantEnterOpenModel.class);
  }

 /**
  * Convert an instance of SubMerchantEnterOpenModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

