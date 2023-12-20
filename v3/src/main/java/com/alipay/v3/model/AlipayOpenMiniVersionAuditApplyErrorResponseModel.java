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
 * AlipayOpenMiniVersionAuditApplyErrorResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniVersionAuditApplyErrorResponseModel {
  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    SYSTEM_ERROR("SYSTEM_ERROR"),
    
    APP_NAME_IS_BLANK("APP_NAME_IS_BLANK"),
    
    INVALID_MINI_APP_NAME_LENGTH("INVALID_MINI_APP_NAME_LENGTH"),
    
    INVALID_MINI_APP_NAME("INVALID_MINI_APP_NAME"),
    
    ENGLISH_NAME_IS_BLANK("ENGLISH_NAME_IS_BLANK"),
    
    INVALID_MINI_APP_EN_NAME("INVALID_MINI_APP_EN_NAME"),
    
    INVALID_MINI_APP_EN_NAME_LENGTH("INVALID_MINI_APP_EN_NAME_LENGTH"),
    
    SLOGAN_IS_BLANK("SLOGAN_IS_BLANK"),
    
    INVALID_MINI_APP_SLOGAN_LENGTH("INVALID_MINI_APP_SLOGAN_LENGTH"),
    
    INVALID_MINI_APP_SLOGAN("INVALID_MINI_APP_SLOGAN"),
    
    SERVICE_TEL_AND_MAIL_BOTH_BLANK("SERVICE_TEL_AND_MAIL_BOTH_BLANK"),
    
    INVALID_MINI_APP_SERVICE_TEL("INVALID_MINI_APP_SERVICE_TEL"),
    
    INVALID_MINI_APP_SERVICE_MAIL("INVALID_MINI_APP_SERVICE_MAIL"),
    
    CATEGORY_IS_BLANK("CATEGORY_IS_BLANK"),
    
    CATEGORY_NUM_IS_INVALID("CATEGORY_NUM_IS_INVALID"),
    
    APP_DESC_IS_BLANK("APP_DESC_IS_BLANK"),
    
    INVALID_MINI_APP_DESC_LENGTH("INVALID_MINI_APP_DESC_LENGTH"),
    
    INVALID_MINI_APP_DESC("INVALID_MINI_APP_DESC"),
    
    REGION_TYPE_IS_BLANK("REGION_TYPE_IS_BLANK"),
    
    REGION_TYPE_IS_INVALID("REGION_TYPE_IS_INVALID"),
    
    REGION_CODE_IS_BLANK("REGION_CODE_IS_BLANK"),
    
    APP_VERSION_IS_BLANK("APP_VERSION_IS_BLANK"),
    
    VERSION_DESC_IS_BLANK("VERSION_DESC_IS_BLANK"),
    
    INVALID_VERSION_DESC_LENGTH("INVALID_VERSION_DESC_LENGTH"),
    
    INVALID_MINI_APP_VERSION_DESC("INVALID_MINI_APP_VERSION_DESC"),
    
    SCREEN_SHOTS_ARE_BLANK("SCREEN_SHOTS_ARE_BLANK"),
    
    SCREEN_SHOT_NUM_IS_INVALID("SCREEN_SHOT_NUM_IS_INVALID"),
    
    INVALID_MINI_APP_MEMO_LENGTH("INVALID_MINI_APP_MEMO_LENGTH"),
    
    APPLICATION_TYPE_NOT_MINIAPP("APPLICATION_TYPE_NOT_MINIAPP"),
    
    INVALID_MINI_APP_SAFE_DOMAIN("INVALID_MINI_APP_SAFE_DOMAIN"),
    
    CAN_NOT_SUBMIT_WITH_ALI_CLOUD("CAN_NOT_SUBMIT_WITH_ALI_CLOUD"),
    
    MINI_APP_NAME_DUPLICATE("MINI_APP_NAME_DUPLICATE"),
    
    MINI_APP_EN_NAME_DUPLICATE("MINI_APP_EN_NAME_DUPLICATE"),
    
    INVALID_CATEGORY("INVALID_CATEGORY"),
    
    INVALID_REGION("INVALID_REGION"),
    
    MINI_APP_NAME_SENSITIVE("MINI_APP_NAME_SENSITIVE"),
    
    MINI_APP_EN_NAME_SENSITIVE("MINI_APP_EN_NAME_SENSITIVE"),
    
    MINI_APP_SLOGAN_SENSITIVE("MINI_APP_SLOGAN_SENSITIVE"),
    
    MINI_APP_MEMO_SENSITIVE("MINI_APP_MEMO_SENSITIVE"),
    
    MINI_APP_DESC_SENSITIVE("MINI_APP_DESC_SENSITIVE"),
    
    MINI_APP_SERVICE_MAIL_SENSITIVE("MINI_APP_SERVICE_MAIL_SENSITIVE"),
    
    MINI_APP_VERSION_DESC_SENSITIVE("MINI_APP_VERSION_DESC_SENSITIVE"),
    
    MINI_APP_PACKAGE_INFO_NOT_EXIST("MINI_APP_PACKAGE_INFO_NOT_EXIST"),
    
    CAN_NOT_MODIFY_NAME_ONCE_ONLINE("CAN_NOT_MODIFY_NAME_ONCE_ONLINE"),
    
    CAN_NOT_MODIFY_EN_ONCE_ONLINE("CAN_NOT_MODIFY_EN_ONCE_ONLINE"),
    
    MODIFY_SLOGAN_EXCEED_COUNT("MODIFY_SLOGAN_EXCEED_COUNT"),
    
    MODIFY_CATEGORY_ID_EXCEED_COUNT("MODIFY_CATEGORY_ID_EXCEED_COUNT"),
    
    MODIFY_DESC_EXCEED_COUNT("MODIFY_DESC_EXCEED_COUNT"),
    
    CAN_NOT_SUBMIT_WITH_AUDIT("CAN_NOT_SUBMIT_WITH_AUDIT"),
    
    CAN_NOT_SUBMIT_WITHOUT_INIT("CAN_NOT_SUBMIT_WITHOUT_INIT"),
    
    CAN_NOT_SUBMIT_WITHOUT_SCAN_PASS("CAN_NOT_SUBMIT_WITHOUT_SCAN_PASS"),
    
    CAN_NOT_SUBMIT_WITH_AUDIT_GRAY("CAN_NOT_SUBMIT_WITH_AUDIT_GRAY"),
    
    EXIST_LARGER_ONLINED_VERSION("EXIST_LARGER_ONLINED_VERSION"),
    
    LICENSE_NO_IS_BLANK("LICENSE_NO_IS_BLANK"),
    
    LICENSE_VALID_DATE_IS_BLANK("LICENSE_VALID_DATE_IS_BLANK"),
    
    LICENSE_VALID_DATE_IS_INVALID("LICENSE_VALID_DATE_IS_INVALID"),
    
    OUT_DOOR_PIC_IS_BLANK("OUT_DOOR_PIC_IS_BLANK"),
    
    LICENSE_PICS_ARE_BLANK("LICENSE_PICS_ARE_BLANK"),
    
    LICENSE_PIC_NUM_IS_INVALID("LICENSE_PIC_NUM_IS_INVALID"),
    
    LICENSE_CHECK_FAIL("LICENSE_CHECK_FAIL"),
    
    LOGO_HEIGHT_NOT_EQUAL_WIDTH("LOGO_HEIGHT_NOT_EQUAL_WIDTH"),
    
    INVALID_SCREEN_SHOT_EXT("INVALID_SCREEN_SHOT_EXT"),
    
    SCREEN_SHOT_EXCEED_MAX_SIZE("SCREEN_SHOT_EXCEED_MAX_SIZE"),
    
    INVALID_PARAMETER("INVALID_PARAMETER"),
    
    LOGO_EXCEED_MAX_SIZE("LOGO_EXCEED_MAX_SIZE"),
    
    INVALID_LOGO_EXT("INVALID_LOGO_EXT"),
    
    INVALID_PARAMS("INVALID_PARAMS"),
    
    INVALID_LOGO("INVALID_LOGO"),
    
    RISK_DECISION_CHECK_FAIL("RISK_DECISION_CHECK_FAIL"),
    
    TINY_APP_AUDIT_NOT_PERMIT("TINY_APP_AUDIT_NOT_PERMIT"),
    
    RISK_DECISION_HIT_BRAND("RISK_DECISION_HIT_BRAND"),
    
    BRAND_TORT_NOT_END("BRAND_TORT_NOT_END"),
    
    SPECIAL_LICENSE_PICS_ARE_BLANK("SPECIAL_LICENSE_PICS_ARE_BLANK"),
    
    FILE_IS_BLANK("FILE_IS_BLANK"),
    
    INVALID_FILE_EXT("INVALID_FILE_EXT"),
    
    FILE_SIZE_EXCEED("FILE_SIZE_EXCEED"),
    
    INVALID_SPECIAL_LICENSE_NUM("INVALID_SPECIAL_LICENSE_NUM"),
    
    BUNDLE_ID_NOT_EXIST("BUNDLE_ID_NOT_EXIST"),
    
    DEFAULT_LOGO("DEFAULT_LOGO"),
    
    SUBMIT_REPEAT("SUBMIT_REPEAT"),
    
    PRIVATE_NOT_ALLOW_CATEGORY("PRIVATE_NOT_ALLOW_CATEGORY"),
    
    MINI_APP_INFO_AUDIT_CONTAINS("MINI_APP_INFO_AUDIT_CONTAINS"),
    
    MINI_VERSION_NAME_DUPLICATE("MINI_VERSION_NAME_DUPLICATE"),
    
    LOGO_SIZE_EXCEED("LOGO_SIZE_EXCEED"),
    
    APP_INFO_NOT_EXIST("APP_INFO_NOT_EXIST"),
    
    USER_NOT_EXIST("USER_NOT_EXIST"),
    
    REGION_CODE_IS_INVALID("REGION_CODE_IS_INVALID"),
    
    SERVICE_TEL_IS_BLANK("SERVICE_TEL_IS_BLANK"),
    
    INVALID_MINI_APP_NAME_PREFIX("INVALID_MINI_APP_NAME_PREFIX"),
    
    SYSTEM_LIMIT("SYSTEM_LIMIT"),
    
    LOGO_IS_BLANK("LOGO_IS_BLANK"),
    
    HAS_NO_MODIFY_CNT("HAS_NO_MODIFY_CNT"),
    
    INVALID_TEST_PWD_LENGTH("INVALID_TEST_PWD_LENGTH"),
    
    SUB_APPLICATION_TYPE_ERROR("SUB_APPLICATION_TYPE_ERROR"),
    
    LICENSE_NAME_IS_BLANK("LICENSE_NAME_IS_BLANK"),
    
    RISK_DECISION_HIT_BROAD("RISK_DECISION_HIT_BROAD");

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

  public AlipayOpenMiniVersionAuditApplyErrorResponseModel() { 
  }

  public AlipayOpenMiniVersionAuditApplyErrorResponseModel code(CodeEnum code) {
    
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


  public AlipayOpenMiniVersionAuditApplyErrorResponseModel links(String links) {
    
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


  public AlipayOpenMiniVersionAuditApplyErrorResponseModel message(String message) {
    
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
    AlipayOpenMiniVersionAuditApplyErrorResponseModel alipayOpenMiniVersionAuditApplyErrorResponseModel = (AlipayOpenMiniVersionAuditApplyErrorResponseModel) o;
    return Objects.equals(this.code, alipayOpenMiniVersionAuditApplyErrorResponseModel.code) &&
        Objects.equals(this.links, alipayOpenMiniVersionAuditApplyErrorResponseModel.links) &&
        Objects.equals(this.message, alipayOpenMiniVersionAuditApplyErrorResponseModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniVersionAuditApplyErrorResponseModel {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniVersionAuditApplyErrorResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniVersionAuditApplyErrorResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniVersionAuditApplyErrorResponseModel is not found in the empty JSON string", AlipayOpenMiniVersionAuditApplyErrorResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniVersionAuditApplyErrorResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniVersionAuditApplyErrorResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlipayOpenMiniVersionAuditApplyErrorResponseModel.openapiRequiredFields) {
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
       if (!AlipayOpenMiniVersionAuditApplyErrorResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniVersionAuditApplyErrorResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniVersionAuditApplyErrorResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniVersionAuditApplyErrorResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniVersionAuditApplyErrorResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniVersionAuditApplyErrorResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniVersionAuditApplyErrorResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniVersionAuditApplyErrorResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniVersionAuditApplyErrorResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniVersionAuditApplyErrorResponseModel
  */
  public static AlipayOpenMiniVersionAuditApplyErrorResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniVersionAuditApplyErrorResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniVersionAuditApplyErrorResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

