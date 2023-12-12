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
import com.alipay.v3.model.FillContent;
import com.alipay.v3.model.SignField;
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
 * TemplateInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateInfo {
  public static final String SERIALIZED_NAME_FILL_CONTENTS = "fill_contents";
  @SerializedName(SERIALIZED_NAME_FILL_CONTENTS)
  private List<FillContent> fillContents = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SIGNFIELDS = "signfields";
  @SerializedName(SERIALIZED_NAME_SIGNFIELDS)
  private SignField signfields;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public TemplateInfo() { 
  }

  public TemplateInfo fillContents(List<FillContent> fillContents) {
    
    this.fillContents = fillContents;
    return this;
  }

  public TemplateInfo addFillContentsItem(FillContent fillContentsItem) {
    if (this.fillContents == null) {
      this.fillContents = new ArrayList<>();
    }
    this.fillContents.add(fillContentsItem);
    return this;
  }

   /**
   * 模板填充项
   * @return fillContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "模板填充项")

  public List<FillContent> getFillContents() {
    return fillContents;
  }


  public void setFillContents(List<FillContent> fillContents) {
    this.fillContents = fillContents;
  }


  public TemplateInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 文件名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "iphone手机签收单", value = "文件名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TemplateInfo signfields(SignField signfields) {
    
    this.signfields = signfields;
    return this;
  }

   /**
   * Get signfields
   * @return signfields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignField getSignfields() {
    return signfields;
  }


  public void setSignfields(SignField signfields) {
    this.signfields = signfields;
  }


  public TemplateInfo templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 模板id
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6b95e887c4b342a8b6501bd334b286df", value = "模板id")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateInfo templateInfo = (TemplateInfo) o;
    return Objects.equals(this.fillContents, templateInfo.fillContents) &&
        Objects.equals(this.name, templateInfo.name) &&
        Objects.equals(this.signfields, templateInfo.signfields) &&
        Objects.equals(this.templateId, templateInfo.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fillContents, name, signfields, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateInfo {\n");
    sb.append("    fillContents: ").append(toIndentedString(fillContents)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signfields: ").append(toIndentedString(signfields)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("fill_contents");
    openapiFields.add("name");
    openapiFields.add("signfields");
    openapiFields.add("template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TemplateInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateInfo is not found in the empty JSON string", TemplateInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TemplateInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayfillContents = jsonObj.getAsJsonArray("fill_contents");
      if (jsonArrayfillContents != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fill_contents").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fill_contents` to be an array in the JSON string but got `%s`", jsonObj.get("fill_contents").toString()));
        }

        // validate the optional field `fill_contents` (array)
        for (int i = 0; i < jsonArrayfillContents.size(); i++) {
          FillContent.validateJsonObject(jsonArrayfillContents.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `signfields`
      if (jsonObj.getAsJsonObject("signfields") != null) {
        SignField.validateJsonObject(jsonObj.getAsJsonObject("signfields"));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateInfo>() {
           @Override
           public void write(JsonWriter out, TemplateInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateInfo
  * @throws IOException if the JSON string is invalid with respect to TemplateInfo
  */
  public static TemplateInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateInfo.class);
  }

 /**
  * Convert an instance of TemplateInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

