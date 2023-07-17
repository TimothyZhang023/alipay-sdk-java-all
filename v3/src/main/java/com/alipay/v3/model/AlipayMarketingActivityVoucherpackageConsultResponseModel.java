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
import com.alipay.v3.model.VoucherPackageConsultResult;
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
 * AlipayMarketingActivityVoucherpackageConsultResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityVoucherpackageConsultResponseModel {
  public static final String SERIALIZED_NAME_VOUCHER_PACKAGE_CONSULT_RESULT = "voucher_package_consult_result";
  @SerializedName(SERIALIZED_NAME_VOUCHER_PACKAGE_CONSULT_RESULT)
  private List<VoucherPackageConsultResult> voucherPackageConsultResult = null;

  public AlipayMarketingActivityVoucherpackageConsultResponseModel() { 
  }

  public AlipayMarketingActivityVoucherpackageConsultResponseModel voucherPackageConsultResult(List<VoucherPackageConsultResult> voucherPackageConsultResult) {
    
    this.voucherPackageConsultResult = voucherPackageConsultResult;
    return this;
  }

  public AlipayMarketingActivityVoucherpackageConsultResponseModel addVoucherPackageConsultResultItem(VoucherPackageConsultResult voucherPackageConsultResultItem) {
    if (this.voucherPackageConsultResult == null) {
      this.voucherPackageConsultResult = new ArrayList<>();
    }
    this.voucherPackageConsultResult.add(voucherPackageConsultResultItem);
    return this;
  }

   /**
   * 券包购买咨询结果
   * @return voucherPackageConsultResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券包购买咨询结果")

  public List<VoucherPackageConsultResult> getVoucherPackageConsultResult() {
    return voucherPackageConsultResult;
  }


  public void setVoucherPackageConsultResult(List<VoucherPackageConsultResult> voucherPackageConsultResult) {
    this.voucherPackageConsultResult = voucherPackageConsultResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityVoucherpackageConsultResponseModel alipayMarketingActivityVoucherpackageConsultResponseModel = (AlipayMarketingActivityVoucherpackageConsultResponseModel) o;
    return Objects.equals(this.voucherPackageConsultResult, alipayMarketingActivityVoucherpackageConsultResponseModel.voucherPackageConsultResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherPackageConsultResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityVoucherpackageConsultResponseModel {\n");
    sb.append("    voucherPackageConsultResult: ").append(toIndentedString(voucherPackageConsultResult)).append("\n");
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
    openapiFields.add("voucher_package_consult_result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityVoucherpackageConsultResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityVoucherpackageConsultResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityVoucherpackageConsultResponseModel is not found in the empty JSON string", AlipayMarketingActivityVoucherpackageConsultResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityVoucherpackageConsultResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityVoucherpackageConsultResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayvoucherPackageConsultResult = jsonObj.getAsJsonArray("voucher_package_consult_result");
      if (jsonArrayvoucherPackageConsultResult != null) {
        // ensure the json data is an array
        if (!jsonObj.get("voucher_package_consult_result").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `voucher_package_consult_result` to be an array in the JSON string but got `%s`", jsonObj.get("voucher_package_consult_result").toString()));
        }

        // validate the optional field `voucher_package_consult_result` (array)
        for (int i = 0; i < jsonArrayvoucherPackageConsultResult.size(); i++) {
          VoucherPackageConsultResult.validateJsonObject(jsonArrayvoucherPackageConsultResult.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityVoucherpackageConsultResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityVoucherpackageConsultResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityVoucherpackageConsultResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityVoucherpackageConsultResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityVoucherpackageConsultResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityVoucherpackageConsultResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityVoucherpackageConsultResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityVoucherpackageConsultResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityVoucherpackageConsultResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityVoucherpackageConsultResponseModel
  */
  public static AlipayMarketingActivityVoucherpackageConsultResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityVoucherpackageConsultResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityVoucherpackageConsultResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

