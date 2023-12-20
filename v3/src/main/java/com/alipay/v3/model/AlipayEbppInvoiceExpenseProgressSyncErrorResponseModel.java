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
 * AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel {
  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    INVOICE_NOT_EXIST("INVOICE_NOT_EXIST"),
    
    INVOICE_EXPENSE_STATUS_REPEAT("INVOICE_EXPENSE_STATUS_REPEAT"),
    
    PERMISSION_DENIED("PERMISSION_DENIED"),
    
    EXPENSE_INVOICE_DETAIL_URL_CHECK("EXPENSE_INVOICE_DETAIL_URL_CHECK"),
    
    INVOICE_HAVE_PROCESSING_EXPENSE("INVOICE_HAVE_PROCESSING_EXPENSE"),
    
    INVOICE_HAVE_EXPENSE("INVOICE_HAVE_EXPENSE"),
    
    EXPENSE_ORDER_NO_DISAGREE("EXPENSE_ORDER_NO_DISAGREE"),
    
    EXPENSE_INVOICE_DISABLE("EXPENSE_INVOICE_DISABLE"),
    
    EXPENSE_NOT_REACH_PROCESSING("EXPENSE_NOT_REACH_PROCESSING"),
    
    EXPENSE_APPLY_ID_REPEAT("EXPENSE_APPLY_ID_REPEAT"),
    
    PARAMETER_ILLEGAL("PARAMETER_ILLEGAL"),
    
    EXPENSE_BUSINESS_TIME_ERROR("EXPENSE_BUSINESS_TIME_ERROR"),
    
    SYSTEM_ERROR("SYSTEM_ERROR"),
    
    QUERY_TAX_NO_NOT_EQUAL_CERTIFY_NO("QUERY_TAX_NO_NOT_EQUAL_CERTIFY_NO"),
    
    PRODUCT_IS_EMPTY("PRODUCT_IS_EMPTY");

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

  public AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel() { 
  }

  public AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel code(CodeEnum code) {
    
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


  public AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel links(String links) {
    
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


  public AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel message(String message) {
    
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
    AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel alipayEbppInvoiceExpenseProgressSyncErrorResponseModel = (AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel) o;
    return Objects.equals(this.code, alipayEbppInvoiceExpenseProgressSyncErrorResponseModel.code) &&
        Objects.equals(this.links, alipayEbppInvoiceExpenseProgressSyncErrorResponseModel.links) &&
        Objects.equals(this.message, alipayEbppInvoiceExpenseProgressSyncErrorResponseModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel is not found in the empty JSON string", AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel.openapiRequiredFields) {
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
       if (!AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel
  */
  public static AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpenseProgressSyncErrorResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

