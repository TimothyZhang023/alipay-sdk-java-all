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
import com.alipay.v3.model.JinyouTestTwo;
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
 * JinyouTestThree
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JinyouTestThree {
  public static final String SERIALIZED_NAME_TH1_F = "th_1_f";
  @SerializedName(SERIALIZED_NAME_TH1_F)
  private JinyouTestTwo th1F;

  public static final String SERIALIZED_NAME_TH2_N = "th_2_n";
  @SerializedName(SERIALIZED_NAME_TH2_N)
  private String th2N;

  public static final String SERIALIZED_NAME_TH3_N = "th_3_n";
  @SerializedName(SERIALIZED_NAME_TH3_N)
  private Boolean th3N;

  public JinyouTestThree() { 
  }

  public JinyouTestThree th1F(JinyouTestTwo th1F) {
    
    this.th1F = th1F;
    return this;
  }

   /**
   * Get th1F
   * @return th1F
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JinyouTestTwo getTh1F() {
    return th1F;
  }


  public void setTh1F(JinyouTestTwo th1F) {
    this.th1F = th1F;
  }


  public JinyouTestThree th2N(String th2N) {
    
    this.th2N = th2N;
    return this;
  }

   /**
   * 无枚举值
   * @return th2N
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "无枚举值")

  public String getTh2N() {
    return th2N;
  }


  public void setTh2N(String th2N) {
    this.th2N = th2N;
  }


  public JinyouTestThree th3N(Boolean th3N) {
    
    this.th3N = th3N;
    return this;
  }

   /**
   * 1
   * @return th3N
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "1")

  public Boolean getTh3N() {
    return th3N;
  }


  public void setTh3N(Boolean th3N) {
    this.th3N = th3N;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JinyouTestThree jinyouTestThree = (JinyouTestThree) o;
    return Objects.equals(this.th1F, jinyouTestThree.th1F) &&
        Objects.equals(this.th2N, jinyouTestThree.th2N) &&
        Objects.equals(this.th3N, jinyouTestThree.th3N);
  }

  @Override
  public int hashCode() {
    return Objects.hash(th1F, th2N, th3N);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JinyouTestThree {\n");
    sb.append("    th1F: ").append(toIndentedString(th1F)).append("\n");
    sb.append("    th2N: ").append(toIndentedString(th2N)).append("\n");
    sb.append("    th3N: ").append(toIndentedString(th3N)).append("\n");
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
    openapiFields.add("th_1_f");
    openapiFields.add("th_2_n");
    openapiFields.add("th_3_n");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JinyouTestThree
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JinyouTestThree.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JinyouTestThree is not found in the empty JSON string", JinyouTestThree.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JinyouTestThree.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JinyouTestThree` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `th_1_f`
      if (jsonObj.getAsJsonObject("th_1_f") != null) {
        JinyouTestTwo.validateJsonObject(jsonObj.getAsJsonObject("th_1_f"));
      }
      if (jsonObj.get("th_2_n") != null && !jsonObj.get("th_2_n").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `th_2_n` to be a primitive type in the JSON string but got `%s`", jsonObj.get("th_2_n").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JinyouTestThree.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JinyouTestThree' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JinyouTestThree> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JinyouTestThree.class));

       return (TypeAdapter<T>) new TypeAdapter<JinyouTestThree>() {
           @Override
           public void write(JsonWriter out, JinyouTestThree value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JinyouTestThree read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JinyouTestThree given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JinyouTestThree
  * @throws IOException if the JSON string is invalid with respect to JinyouTestThree
  */
  public static JinyouTestThree fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JinyouTestThree.class);
  }

 /**
  * Convert an instance of JinyouTestThree to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

