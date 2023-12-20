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
import com.alipay.v3.model.TemplateStyleInfoDTO;
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
 * McardTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class McardTemplate {
  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_STYLE_INFO = "template_style_info";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_STYLE_INFO)
  private TemplateStyleInfoDTO templateStyleInfo;

  public McardTemplate() { 
  }

  public McardTemplate cardType(String cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * 卡类型
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OUT_MEMBER_CARD", value = "卡类型")

  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public McardTemplate gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 会员卡模板创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-01-11 15:12:23", value = "会员卡模板创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public McardTemplate gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 会员卡模板修改时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-01-11 15:12:23", value = "会员卡模板修改时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public McardTemplate templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 会员卡模板ID
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20160718000000001", value = "会员卡模板ID")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public McardTemplate templateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
    
    this.templateStyleInfo = templateStyleInfo;
    return this;
  }

   /**
   * Get templateStyleInfo
   * @return templateStyleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateStyleInfoDTO getTemplateStyleInfo() {
    return templateStyleInfo;
  }


  public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
    this.templateStyleInfo = templateStyleInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    McardTemplate mcardTemplate = (McardTemplate) o;
    return Objects.equals(this.cardType, mcardTemplate.cardType) &&
        Objects.equals(this.gmtCreate, mcardTemplate.gmtCreate) &&
        Objects.equals(this.gmtModified, mcardTemplate.gmtModified) &&
        Objects.equals(this.templateId, mcardTemplate.templateId) &&
        Objects.equals(this.templateStyleInfo, mcardTemplate.templateStyleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardType, gmtCreate, gmtModified, templateId, templateStyleInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McardTemplate {\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateStyleInfo: ").append(toIndentedString(templateStyleInfo)).append("\n");
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
    openapiFields.add("card_type");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("template_id");
    openapiFields.add("template_style_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to McardTemplate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (McardTemplate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in McardTemplate is not found in the empty JSON string", McardTemplate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!McardTemplate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `McardTemplate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      // validate the optional field `template_style_info`
      if (jsonObj.getAsJsonObject("template_style_info") != null) {
        TemplateStyleInfoDTO.validateJsonObject(jsonObj.getAsJsonObject("template_style_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!McardTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'McardTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<McardTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(McardTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<McardTemplate>() {
           @Override
           public void write(JsonWriter out, McardTemplate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public McardTemplate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of McardTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of McardTemplate
  * @throws IOException if the JSON string is invalid with respect to McardTemplate
  */
  public static McardTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, McardTemplate.class);
  }

 /**
  * Convert an instance of McardTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

