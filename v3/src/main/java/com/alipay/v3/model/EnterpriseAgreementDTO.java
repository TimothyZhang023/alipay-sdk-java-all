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
 * EnterpriseAgreementDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnterpriseAgreementDTO {
  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_ENTERPRISE_NAME = "enterprise_name";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_NAME)
  private String enterpriseName;

  public static final String SERIALIZED_NAME_SIGN_DATE = "sign_date";
  @SerializedName(SERIALIZED_NAME_SIGN_DATE)
  private String signDate;

  public static final String SERIALIZED_NAME_SIGN_STATUS = "sign_status";
  @SerializedName(SERIALIZED_NAME_SIGN_STATUS)
  private String signStatus;

  public EnterpriseAgreementDTO() { 
  }

  public EnterpriseAgreementDTO agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 协议id
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AG00000171", value = "协议id")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public EnterpriseAgreementDTO enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088441399627416", value = "企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public EnterpriseAgreementDTO enterpriseName(String enterpriseName) {
    
    this.enterpriseName = enterpriseName;
    return this;
  }

   /**
   * 企业名称
   * @return enterpriseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "企业码测试企业", value = "企业名称")

  public String getEnterpriseName() {
    return enterpriseName;
  }


  public void setEnterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
  }


  public EnterpriseAgreementDTO signDate(String signDate) {
    
    this.signDate = signDate;
    return this;
  }

   /**
   * 签约时间
   * @return signDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-04-20 17:13:51", value = "签约时间")

  public String getSignDate() {
    return signDate;
  }


  public void setSignDate(String signDate) {
    this.signDate = signDate;
  }


  public EnterpriseAgreementDTO signStatus(String signStatus) {
    
    this.signStatus = signStatus;
    return this;
  }

   /**
   * 签约状态
   * @return signStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SIGNED", value = "签约状态")

  public String getSignStatus() {
    return signStatus;
  }


  public void setSignStatus(String signStatus) {
    this.signStatus = signStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseAgreementDTO enterpriseAgreementDTO = (EnterpriseAgreementDTO) o;
    return Objects.equals(this.agreementId, enterpriseAgreementDTO.agreementId) &&
        Objects.equals(this.enterpriseId, enterpriseAgreementDTO.enterpriseId) &&
        Objects.equals(this.enterpriseName, enterpriseAgreementDTO.enterpriseName) &&
        Objects.equals(this.signDate, enterpriseAgreementDTO.signDate) &&
        Objects.equals(this.signStatus, enterpriseAgreementDTO.signStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, enterpriseId, enterpriseName, signDate, signStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseAgreementDTO {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    enterpriseName: ").append(toIndentedString(enterpriseName)).append("\n");
    sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
    sb.append("    signStatus: ").append(toIndentedString(signStatus)).append("\n");
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
    openapiFields.add("agreement_id");
    openapiFields.add("enterprise_id");
    openapiFields.add("enterprise_name");
    openapiFields.add("sign_date");
    openapiFields.add("sign_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EnterpriseAgreementDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EnterpriseAgreementDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnterpriseAgreementDTO is not found in the empty JSON string", EnterpriseAgreementDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EnterpriseAgreementDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnterpriseAgreementDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("enterprise_name") != null && !jsonObj.get("enterprise_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_name").toString()));
      }
      if (jsonObj.get("sign_date") != null && !jsonObj.get("sign_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_date").toString()));
      }
      if (jsonObj.get("sign_status") != null && !jsonObj.get("sign_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseAgreementDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseAgreementDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseAgreementDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseAgreementDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseAgreementDTO>() {
           @Override
           public void write(JsonWriter out, EnterpriseAgreementDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseAgreementDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseAgreementDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseAgreementDTO
  * @throws IOException if the JSON string is invalid with respect to EnterpriseAgreementDTO
  */
  public static EnterpriseAgreementDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseAgreementDTO.class);
  }

 /**
  * Convert an instance of EnterpriseAgreementDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

