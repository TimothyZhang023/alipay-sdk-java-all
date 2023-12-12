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
 * AlipayFundJointaccountMemberBindResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundJointaccountMemberBindResponseModel {
  public static final String SERIALIZED_NAME_REPLY_URL = "reply_url";
  @SerializedName(SERIALIZED_NAME_REPLY_URL)
  private String replyUrl;

  public AlipayFundJointaccountMemberBindResponseModel() { 
  }

  public AlipayFundJointaccountMemberBindResponseModel replyUrl(String replyUrl) {
    
    this.replyUrl = replyUrl;
    return this;
  }

   /**
   * 员工回应邀请链接
   * @return replyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://www.baidu.com", value = "员工回应邀请链接")

  public String getReplyUrl() {
    return replyUrl;
  }


  public void setReplyUrl(String replyUrl) {
    this.replyUrl = replyUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundJointaccountMemberBindResponseModel alipayFundJointaccountMemberBindResponseModel = (AlipayFundJointaccountMemberBindResponseModel) o;
    return Objects.equals(this.replyUrl, alipayFundJointaccountMemberBindResponseModel.replyUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replyUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundJointaccountMemberBindResponseModel {\n");
    sb.append("    replyUrl: ").append(toIndentedString(replyUrl)).append("\n");
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
    openapiFields.add("reply_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundJointaccountMemberBindResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundJointaccountMemberBindResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundJointaccountMemberBindResponseModel is not found in the empty JSON string", AlipayFundJointaccountMemberBindResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundJointaccountMemberBindResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundJointaccountMemberBindResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("reply_url") != null && !jsonObj.get("reply_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reply_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reply_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundJointaccountMemberBindResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundJointaccountMemberBindResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundJointaccountMemberBindResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundJointaccountMemberBindResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundJointaccountMemberBindResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundJointaccountMemberBindResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundJointaccountMemberBindResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundJointaccountMemberBindResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundJointaccountMemberBindResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundJointaccountMemberBindResponseModel
  */
  public static AlipayFundJointaccountMemberBindResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundJointaccountMemberBindResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundJointaccountMemberBindResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

