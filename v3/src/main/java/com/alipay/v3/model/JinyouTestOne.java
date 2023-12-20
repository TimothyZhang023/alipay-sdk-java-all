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
 * JinyouTestOne
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JinyouTestOne {
  public static final String SERIALIZED_NAME_O1_N = "o_1_n";
  @SerializedName(SERIALIZED_NAME_O1_N)
  private String o1N;

  public static final String SERIALIZED_NAME_O2_OPENID = "o_2_openid";
  @SerializedName(SERIALIZED_NAME_O2_OPENID)
  private String o2Openid;

  public static final String SERIALIZED_NAME_O2_Y = "o_2_y";
  @SerializedName(SERIALIZED_NAME_O2_Y)
  private String o2Y;

  public static final String SERIALIZED_NAME_O3_OPENID = "o_3_openid";
  @SerializedName(SERIALIZED_NAME_O3_OPENID)
  private String o3Openid;

  public static final String SERIALIZED_NAME_O3_Y = "o_3_y";
  @SerializedName(SERIALIZED_NAME_O3_Y)
  private Integer o3Y;

  public JinyouTestOne() { 
  }

  public JinyouTestOne o1N(String o1N) {
    
    this.o1N = o1N;
    return this;
  }

   /**
   * 1
   * @return o1N
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "1")

  public String getO1N() {
    return o1N;
  }


  public void setO1N(String o1N) {
    this.o1N = o1N;
  }


  public JinyouTestOne o2Openid(String o2Openid) {
    
    this.o2Openid = o2Openid;
    return this;
  }

   /**
   * o_2_y
   * @return o2Openid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "o_2_y")

  public String getO2Openid() {
    return o2Openid;
  }


  public void setO2Openid(String o2Openid) {
    this.o2Openid = o2Openid;
  }


  public JinyouTestOne o2Y(String o2Y) {
    
    this.o2Y = o2Y;
    return this;
  }

   /**
   * o_2_y
   * @return o2Y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "o_2_y")

  public String getO2Y() {
    return o2Y;
  }


  public void setO2Y(String o2Y) {
    this.o2Y = o2Y;
  }


  public JinyouTestOne o3Openid(String o3Openid) {
    
    this.o3Openid = o3Openid;
    return this;
  }

   /**
   * o_3_y
   * @return o3Openid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "o_3_y")

  public String getO3Openid() {
    return o3Openid;
  }


  public void setO3Openid(String o3Openid) {
    this.o3Openid = o3Openid;
  }


  public JinyouTestOne o3Y(Integer o3Y) {
    
    this.o3Y = o3Y;
    return this;
  }

   /**
   * o_3_y
   * @return o3Y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "o_3_y")

  public Integer getO3Y() {
    return o3Y;
  }


  public void setO3Y(Integer o3Y) {
    this.o3Y = o3Y;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JinyouTestOne jinyouTestOne = (JinyouTestOne) o;
    return Objects.equals(this.o1N, jinyouTestOne.o1N) &&
        Objects.equals(this.o2Openid, jinyouTestOne.o2Openid) &&
        Objects.equals(this.o2Y, jinyouTestOne.o2Y) &&
        Objects.equals(this.o3Openid, jinyouTestOne.o3Openid) &&
        Objects.equals(this.o3Y, jinyouTestOne.o3Y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(o1N, o2Openid, o2Y, o3Openid, o3Y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JinyouTestOne {\n");
    sb.append("    o1N: ").append(toIndentedString(o1N)).append("\n");
    sb.append("    o2Openid: ").append(toIndentedString(o2Openid)).append("\n");
    sb.append("    o2Y: ").append(toIndentedString(o2Y)).append("\n");
    sb.append("    o3Openid: ").append(toIndentedString(o3Openid)).append("\n");
    sb.append("    o3Y: ").append(toIndentedString(o3Y)).append("\n");
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
    openapiFields.add("o_1_n");
    openapiFields.add("o_2_openid");
    openapiFields.add("o_2_y");
    openapiFields.add("o_3_openid");
    openapiFields.add("o_3_y");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JinyouTestOne
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JinyouTestOne.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JinyouTestOne is not found in the empty JSON string", JinyouTestOne.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JinyouTestOne.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JinyouTestOne` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("o_1_n") != null && !jsonObj.get("o_1_n").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `o_1_n` to be a primitive type in the JSON string but got `%s`", jsonObj.get("o_1_n").toString()));
      }
      if (jsonObj.get("o_2_openid") != null && !jsonObj.get("o_2_openid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `o_2_openid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("o_2_openid").toString()));
      }
      if (jsonObj.get("o_2_y") != null && !jsonObj.get("o_2_y").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `o_2_y` to be a primitive type in the JSON string but got `%s`", jsonObj.get("o_2_y").toString()));
      }
      if (jsonObj.get("o_3_openid") != null && !jsonObj.get("o_3_openid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `o_3_openid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("o_3_openid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JinyouTestOne.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JinyouTestOne' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JinyouTestOne> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JinyouTestOne.class));

       return (TypeAdapter<T>) new TypeAdapter<JinyouTestOne>() {
           @Override
           public void write(JsonWriter out, JinyouTestOne value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JinyouTestOne read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JinyouTestOne given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JinyouTestOne
  * @throws IOException if the JSON string is invalid with respect to JinyouTestOne
  */
  public static JinyouTestOne fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JinyouTestOne.class);
  }

 /**
  * Convert an instance of JinyouTestOne to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

