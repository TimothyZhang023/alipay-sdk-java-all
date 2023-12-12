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
import com.alipay.v3.model.JinyouTestThree;
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
 * JinyouTestFour
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JinyouTestFour {
  public static final String SERIALIZED_NAME_F1_OPENID = "f_1_openid";
  @SerializedName(SERIALIZED_NAME_F1_OPENID)
  private String f1Openid;

  public static final String SERIALIZED_NAME_F1_Y = "f_1_y";
  @SerializedName(SERIALIZED_NAME_F1_Y)
  private String f1Y;

  public static final String SERIALIZED_NAME_F2_F = "f_2_f";
  @SerializedName(SERIALIZED_NAME_F2_F)
  private JinyouTestThree f2F;

  public static final String SERIALIZED_NAME_F3_OPENID = "f_3_openid";
  @SerializedName(SERIALIZED_NAME_F3_OPENID)
  private String f3Openid;

  public static final String SERIALIZED_NAME_F3_Y = "f_3_y";
  @SerializedName(SERIALIZED_NAME_F3_Y)
  private Integer f3Y;

  public JinyouTestFour() { 
  }

  public JinyouTestFour f1Openid(String f1Openid) {
    
    this.f1Openid = f1Openid;
    return this;
  }

   /**
   * 1
   * @return f1Openid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxxxxscddcd", value = "1")

  public String getF1Openid() {
    return f1Openid;
  }


  public void setF1Openid(String f1Openid) {
    this.f1Openid = f1Openid;
  }


  public JinyouTestFour f1Y(String f1Y) {
    
    this.f1Y = f1Y;
    return this;
  }

   /**
   * 1
   * @return f1Y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "1")

  public String getF1Y() {
    return f1Y;
  }


  public void setF1Y(String f1Y) {
    this.f1Y = f1Y;
  }


  public JinyouTestFour f2F(JinyouTestThree f2F) {
    
    this.f2F = f2F;
    return this;
  }

   /**
   * Get f2F
   * @return f2F
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JinyouTestThree getF2F() {
    return f2F;
  }


  public void setF2F(JinyouTestThree f2F) {
    this.f2F = f2F;
  }


  public JinyouTestFour f3Openid(String f3Openid) {
    
    this.f3Openid = f3Openid;
    return this;
  }

   /**
   * 1
   * @return f3Openid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxxxxscddcd", value = "1")

  public String getF3Openid() {
    return f3Openid;
  }


  public void setF3Openid(String f3Openid) {
    this.f3Openid = f3Openid;
  }


  public JinyouTestFour f3Y(Integer f3Y) {
    
    this.f3Y = f3Y;
    return this;
  }

   /**
   * 1
   * @return f3Y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "1")

  public Integer getF3Y() {
    return f3Y;
  }


  public void setF3Y(Integer f3Y) {
    this.f3Y = f3Y;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JinyouTestFour jinyouTestFour = (JinyouTestFour) o;
    return Objects.equals(this.f1Openid, jinyouTestFour.f1Openid) &&
        Objects.equals(this.f1Y, jinyouTestFour.f1Y) &&
        Objects.equals(this.f2F, jinyouTestFour.f2F) &&
        Objects.equals(this.f3Openid, jinyouTestFour.f3Openid) &&
        Objects.equals(this.f3Y, jinyouTestFour.f3Y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(f1Openid, f1Y, f2F, f3Openid, f3Y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JinyouTestFour {\n");
    sb.append("    f1Openid: ").append(toIndentedString(f1Openid)).append("\n");
    sb.append("    f1Y: ").append(toIndentedString(f1Y)).append("\n");
    sb.append("    f2F: ").append(toIndentedString(f2F)).append("\n");
    sb.append("    f3Openid: ").append(toIndentedString(f3Openid)).append("\n");
    sb.append("    f3Y: ").append(toIndentedString(f3Y)).append("\n");
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
    openapiFields.add("f_1_openid");
    openapiFields.add("f_1_y");
    openapiFields.add("f_2_f");
    openapiFields.add("f_3_openid");
    openapiFields.add("f_3_y");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JinyouTestFour
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JinyouTestFour.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JinyouTestFour is not found in the empty JSON string", JinyouTestFour.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JinyouTestFour.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JinyouTestFour` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("f_1_openid") != null && !jsonObj.get("f_1_openid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `f_1_openid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("f_1_openid").toString()));
      }
      if (jsonObj.get("f_1_y") != null && !jsonObj.get("f_1_y").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `f_1_y` to be a primitive type in the JSON string but got `%s`", jsonObj.get("f_1_y").toString()));
      }
      // validate the optional field `f_2_f`
      if (jsonObj.getAsJsonObject("f_2_f") != null) {
        JinyouTestThree.validateJsonObject(jsonObj.getAsJsonObject("f_2_f"));
      }
      if (jsonObj.get("f_3_openid") != null && !jsonObj.get("f_3_openid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `f_3_openid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("f_3_openid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JinyouTestFour.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JinyouTestFour' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JinyouTestFour> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JinyouTestFour.class));

       return (TypeAdapter<T>) new TypeAdapter<JinyouTestFour>() {
           @Override
           public void write(JsonWriter out, JinyouTestFour value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JinyouTestFour read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JinyouTestFour given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JinyouTestFour
  * @throws IOException if the JSON string is invalid with respect to JinyouTestFour
  */
  public static JinyouTestFour fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JinyouTestFour.class);
  }

 /**
  * Convert an instance of JinyouTestFour to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

