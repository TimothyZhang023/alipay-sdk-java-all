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
import com.alipay.v3.model.InvoiceUkDTO;
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
 * AlipayEbppInvoiceApplyStatusNotifyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceApplyStatusNotifyResponseModel {
  public static final String SERIALIZED_NAME_MISSING_INVOICES = "missing_invoices";
  @SerializedName(SERIALIZED_NAME_MISSING_INVOICES)
  private List<InvoiceUkDTO> missingInvoices = null;

  public static final String SERIALIZED_NAME_UPDATE_SUCCESS = "update_success";
  @SerializedName(SERIALIZED_NAME_UPDATE_SUCCESS)
  private Boolean updateSuccess;

  public AlipayEbppInvoiceApplyStatusNotifyResponseModel() { 
  }

  public AlipayEbppInvoiceApplyStatusNotifyResponseModel missingInvoices(List<InvoiceUkDTO> missingInvoices) {
    
    this.missingInvoices = missingInvoices;
    return this;
  }

  public AlipayEbppInvoiceApplyStatusNotifyResponseModel addMissingInvoicesItem(InvoiceUkDTO missingInvoicesItem) {
    if (this.missingInvoices == null) {
      this.missingInvoices = new ArrayList<>();
    }
    this.missingInvoices.add(missingInvoicesItem);
    return this;
  }

   /**
   * update_success&#x3D;false时返回。 该申请下存在未归集成功的发票。即：attach_invoices 中携带的发票存在未回传成功的发票。 此时调用方，需先调用发票回传接口，完成发票回传。然后再重试此接口。
   * @return missingInvoices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "update_success=false时返回。 该申请下存在未归集成功的发票。即：attach_invoices 中携带的发票存在未回传成功的发票。 此时调用方，需先调用发票回传接口，完成发票回传。然后再重试此接口。")

  public List<InvoiceUkDTO> getMissingInvoices() {
    return missingInvoices;
  }


  public void setMissingInvoices(List<InvoiceUkDTO> missingInvoices) {
    this.missingInvoices = missingInvoices;
  }


  public AlipayEbppInvoiceApplyStatusNotifyResponseModel updateSuccess(Boolean updateSuccess) {
    
    this.updateSuccess = updateSuccess;
    return this;
  }

   /**
   * 事务执行结果，true成功，false失败
   * @return updateSuccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "事务执行结果，true成功，false失败")

  public Boolean getUpdateSuccess() {
    return updateSuccess;
  }


  public void setUpdateSuccess(Boolean updateSuccess) {
    this.updateSuccess = updateSuccess;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceApplyStatusNotifyResponseModel alipayEbppInvoiceApplyStatusNotifyResponseModel = (AlipayEbppInvoiceApplyStatusNotifyResponseModel) o;
    return Objects.equals(this.missingInvoices, alipayEbppInvoiceApplyStatusNotifyResponseModel.missingInvoices) &&
        Objects.equals(this.updateSuccess, alipayEbppInvoiceApplyStatusNotifyResponseModel.updateSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(missingInvoices, updateSuccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceApplyStatusNotifyResponseModel {\n");
    sb.append("    missingInvoices: ").append(toIndentedString(missingInvoices)).append("\n");
    sb.append("    updateSuccess: ").append(toIndentedString(updateSuccess)).append("\n");
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
    openapiFields.add("missing_invoices");
    openapiFields.add("update_success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceApplyStatusNotifyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceApplyStatusNotifyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceApplyStatusNotifyResponseModel is not found in the empty JSON string", AlipayEbppInvoiceApplyStatusNotifyResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceApplyStatusNotifyResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceApplyStatusNotifyResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraymissingInvoices = jsonObj.getAsJsonArray("missing_invoices");
      if (jsonArraymissingInvoices != null) {
        // ensure the json data is an array
        if (!jsonObj.get("missing_invoices").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `missing_invoices` to be an array in the JSON string but got `%s`", jsonObj.get("missing_invoices").toString()));
        }

        // validate the optional field `missing_invoices` (array)
        for (int i = 0; i < jsonArraymissingInvoices.size(); i++) {
          InvoiceUkDTO.validateJsonObject(jsonArraymissingInvoices.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceApplyStatusNotifyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceApplyStatusNotifyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceApplyStatusNotifyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceApplyStatusNotifyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceApplyStatusNotifyResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceApplyStatusNotifyResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceApplyStatusNotifyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceApplyStatusNotifyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceApplyStatusNotifyResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceApplyStatusNotifyResponseModel
  */
  public static AlipayEbppInvoiceApplyStatusNotifyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceApplyStatusNotifyResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceApplyStatusNotifyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

