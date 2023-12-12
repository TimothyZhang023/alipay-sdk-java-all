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
import com.alipay.v3.model.JinyouTestFour;
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
 * JinyouTestFive
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JinyouTestFive {
  public static final String SERIALIZED_NAME_F1_F = "f_1_f";
  @SerializedName(SERIALIZED_NAME_F1_F)
  private JinyouTestFour f1F;

  public static final String SERIALIZED_NAME_F2_F = "f_2_f";
  @SerializedName(SERIALIZED_NAME_F2_F)
  private JinyouTestThree f2F;

  public static final String SERIALIZED_NAME_F3_OPENID = "f_3_openid";
  @SerializedName(SERIALIZED_NAME_F3_OPENID)
  private String f3Openid;

  public static final String SERIALIZED_NAME_F3_Y = "f_3_y";
  @SerializedName(SERIALIZED_NAME_F3_Y)
  private String f3Y;

  public static final String SERIALIZED_NAME_F4_N = "f_4_n";
  @SerializedName(SERIALIZED_NAME_F4_N)
  private String f4N;

  public JinyouTestFive() { 
  }

  public JinyouTestFive f1F(JinyouTestFour f1F) {
    
    this.f1F = f1F;
    return this;
  }

   /**
   * Get f1F
   * @return f1F
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JinyouTestFour getF1F() {
    return f1F;
  }


  public void setF1F(JinyouTestFour f1F) {
    this.f1F = f1F;
  }


  public JinyouTestFive f2F(JinyouTestThree f2F) {
    
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


  public JinyouTestFive f3Openid(String f3Openid) {
    
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


  public JinyouTestFive f3Y(String f3Y) {
    
    this.f3Y = f3Y;
    return this;
  }

   /**
   * 1
   * @return f3Y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "1")

  public String getF3Y() {
    return f3Y;
  }


  public void setF3Y(String f3Y) {
    this.f3Y = f3Y;
  }


  public JinyouTestFive f4N(String f4N) {
    
    this.f4N = f4N;
    return this;
  }

   /**
   * 3
   * @return f4N
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "3")

  public String getF4N() {
    return f4N;
  }


  public void setF4N(String f4N) {
    this.f4N = f4N;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JinyouTestFive jinyouTestFive = (JinyouTestFive) o;
    return Objects.equals(this.f1F, jinyouTestFive.f1F) &&
        Objects.equals(this.f2F, jinyouTestFive.f2F) &&
        Objects.equals(this.f3Openid, jinyouTestFive.f3Openid) &&
        Objects.equals(this.f3Y, jinyouTestFive.f3Y) &&
        Objects.equals(this.f4N, jinyouTestFive.f4N);
  }

  @Override
  public int hashCode() {
    return Objects.hash(f1F, f2F, f3Openid, f3Y, f4N);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JinyouTestFive {\n");
    sb.append("    f1F: ").append(toIndentedString(f1F)).append("\n");
    sb.append("    f2F: ").append(toIndentedString(f2F)).append("\n");
    sb.append("    f3Openid: ").append(toIndentedString(f3Openid)).append("\n");
    sb.append("    f3Y: ").append(toIndentedString(f3Y)).append("\n");
    sb.append("    f4N: ").append(toIndentedString(f4N)).append("\n");
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
    openapiFields.add("f_1_f");
    openapiFields.add("f_2_f");
    openapiFields.add("f_3_openid");
    openapiFields.add("f_3_y");
    openapiFields.add("f_4_n");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JinyouTestFive
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JinyouTestFive.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JinyouTestFive is not found in the empty JSON string", JinyouTestFive.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JinyouTestFive.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JinyouTestFive` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `f_1_f`
      if (jsonObj.getAsJsonObject("f_1_f") != null) {
        JinyouTestFour.validateJsonObject(jsonObj.getAsJsonObject("f_1_f"));
      }
      // validate the optional field `f_2_f`
      if (jsonObj.getAsJsonObject("f_2_f") != null) {
        JinyouTestThree.validateJsonObject(jsonObj.getAsJsonObject("f_2_f"));
      }
      if (jsonObj.get("f_3_openid") != null && !jsonObj.get("f_3_openid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `f_3_openid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("f_3_openid").toString()));
      }
      if (jsonObj.get("f_3_y") != null && !jsonObj.get("f_3_y").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `f_3_y` to be a primitive type in the JSON string but got `%s`", jsonObj.get("f_3_y").toString()));
      }
      if (jsonObj.get("f_4_n") != null && !jsonObj.get("f_4_n").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `f_4_n` to be a primitive type in the JSON string but got `%s`", jsonObj.get("f_4_n").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JinyouTestFive.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JinyouTestFive' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JinyouTestFive> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JinyouTestFive.class));

       return (TypeAdapter<T>) new TypeAdapter<JinyouTestFive>() {
           @Override
           public void write(JsonWriter out, JinyouTestFive value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JinyouTestFive read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JinyouTestFive given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JinyouTestFive
  * @throws IOException if the JSON string is invalid with respect to JinyouTestFive
  */
  public static JinyouTestFive fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JinyouTestFive.class);
  }

 /**
  * Convert an instance of JinyouTestFive to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

