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
 * AlipayCommerceEcEmployeeAddErrorResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcEmployeeAddErrorResponseModel {
  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    PARAMETER_ERROR("PARAMETER_ERROR"),
    
    SYSTEM_ERROR("SYSTEM_ERROR"),
    
    ENTERPRISE_NOT_EXIST("ENTERPRISE_NOT_EXIST"),
    
    USER_NOT_EXIST("USER_NOT_EXIST"),
    
    USER_UNREAL_NAME("USER_UNREAL_NAME"),
    
    INVITE_MEMBER_FAIL("INVITE_MEMBER_FAIL"),
    
    ENTERPRISE_MEMBER_NUM_EXCEED_MAX("ENTERPRISE_MEMBER_NUM_EXCEED_MAX"),
    
    JOINED_ACCOUNT_NUM_EXCEED_MAX("JOINED_ACCOUNT_NUM_EXCEED_MAX"),
    
    NO_AGREEMENT("NO_AGREEMENT"),
    
    EMPLOYEE_HAS_ACTIVATED("EMPLOYEE_HAS_ACTIVATED"),
    
    ENTERPRISE_NOT_SIGNED("ENTERPRISE_NOT_SIGNED"),
    
    EMPLOYEE_NO_EXIST("EMPLOYEE_NO_EXIST"),
    
    EMPLOYEE_ALIPAY_OCCUPIED("EMPLOYEE_ALIPAY_OCCUPIED"),
    
    EMPLOYEE_MOBILE_EXIST("EMPLOYEE_MOBILE_EXIST"),
    
    EMPLOYEE_FREQUENCY_OVER_LIMIT("EMPLOYEE_FREQUENCY_OVER_LIMIT"),
    
    EMPLOYEE_IS_SUPER_ADMIN("EMPLOYEE_IS_SUPER_ADMIN"),
    
    EMPLOYEE_OVER_LIMIT("EMPLOYEE_OVER_LIMIT"),
    
    NODE_NOT_EXIST("NODE_NOT_EXIST"),
    
    NEED_TO_SET_PPW("NEED_TO_SET_PPW"),
    
    ISV_USER_ID_NOT_SUPPORT("ISV_USER_ID_NOT_SUPPORT"),
    
    ACCOUNT_NOT_PERSONAL("ACCOUNT_NOT_PERSONAL"),
    
    EMPLOYEE_EMAIL_EXIST("EMPLOYEE_EMAIL_EXIST"),
    
    ENTERPRISE_STATUS_ERROR("ENTERPRISE_STATUS_ERROR"),
    
    EMPLOYEE_ALIPAY_BIND_FAIL("EMPLOYEE_ALIPAY_BIND_FAIL"),
    
    EMPLOYEE_EXIST("EMPLOYEE_EXIST"),
    
    IOT_USER_CREATE_ERROR("IOT_USER_CREATE_ERROR"),
    
    MSG_SEND_ERROR("MSG_SEND_ERROR"),
    
    PARAM_ERROR("PARAM_ERROR"),
    
    REMOTE_SERVICE_ERROR("REMOTE_SERVICE_ERROR");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private String links;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public AlipayCommerceEcEmployeeAddErrorResponseModel() { 
  }

  public AlipayCommerceEcEmployeeAddErrorResponseModel code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * 错误码
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误码")

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public AlipayCommerceEcEmployeeAddErrorResponseModel links(String links) {
    
    this.links = links;
    return this;
  }

   /**
   * 解决方案链接
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "解决方案链接")

  public String getLinks() {
    return links;
  }


  public void setLinks(String links) {
    this.links = links;
  }


  public AlipayCommerceEcEmployeeAddErrorResponseModel message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 错误描述
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误描述")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceEcEmployeeAddErrorResponseModel alipayCommerceEcEmployeeAddErrorResponseModel = (AlipayCommerceEcEmployeeAddErrorResponseModel) o;
    return Objects.equals(this.code, alipayCommerceEcEmployeeAddErrorResponseModel.code) &&
        Objects.equals(this.links, alipayCommerceEcEmployeeAddErrorResponseModel.links) &&
        Objects.equals(this.message, alipayCommerceEcEmployeeAddErrorResponseModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcEmployeeAddErrorResponseModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("links");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcEmployeeAddErrorResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcEmployeeAddErrorResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcEmployeeAddErrorResponseModel is not found in the empty JSON string", AlipayCommerceEcEmployeeAddErrorResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceEcEmployeeAddErrorResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceEcEmployeeAddErrorResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlipayCommerceEcEmployeeAddErrorResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be a primitive type in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcEmployeeAddErrorResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcEmployeeAddErrorResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcEmployeeAddErrorResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcEmployeeAddErrorResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcEmployeeAddErrorResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcEmployeeAddErrorResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceEcEmployeeAddErrorResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceEcEmployeeAddErrorResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcEmployeeAddErrorResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcEmployeeAddErrorResponseModel
  */
  public static AlipayCommerceEcEmployeeAddErrorResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcEmployeeAddErrorResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcEmployeeAddErrorResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

