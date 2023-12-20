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
 * EnterpriseTitleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnterpriseTitleInfo {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private String bankAccount;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_TAX_REGISTER_NO = "tax_register_no";
  @SerializedName(SERIALIZED_NAME_TAX_REGISTER_NO)
  private String taxRegisterNo;

  public static final String SERIALIZED_NAME_TELEPHONE = "telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public static final String SERIALIZED_NAME_TITLE_ID = "title_id";
  @SerializedName(SERIALIZED_NAME_TITLE_ID)
  private String titleId;

  public static final String SERIALIZED_NAME_TITLE_NAME = "title_name";
  @SerializedName(SERIALIZED_NAME_TITLE_NAME)
  private String titleName;

  public EnterpriseTitleInfo() { 
  }

  public EnterpriseTitleInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 详细地址
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "详细地址")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public EnterpriseTitleInfo bankAccount(String bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * 开户行账号
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开户行账号")

  public String getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }


  public EnterpriseTitleInfo bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * 开户行地址
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开户行地址")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public EnterpriseTitleInfo taxRegisterNo(String taxRegisterNo) {
    
    this.taxRegisterNo = taxRegisterNo;
    return this;
  }

   /**
   * 税号
   * @return taxRegisterNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "税号")

  public String getTaxRegisterNo() {
    return taxRegisterNo;
  }


  public void setTaxRegisterNo(String taxRegisterNo) {
    this.taxRegisterNo = taxRegisterNo;
  }


  public EnterpriseTitleInfo telephone(String telephone) {
    
    this.telephone = telephone;
    return this;
  }

   /**
   * 电话
   * @return telephone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "电话")

  public String getTelephone() {
    return telephone;
  }


  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public EnterpriseTitleInfo titleId(String titleId) {
    
    this.titleId = titleId;
    return this;
  }

   /**
   * 抬头ID
   * @return titleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "抬头ID")

  public String getTitleId() {
    return titleId;
  }


  public void setTitleId(String titleId) {
    this.titleId = titleId;
  }


  public EnterpriseTitleInfo titleName(String titleName) {
    
    this.titleName = titleName;
    return this;
  }

   /**
   * 企业抬头名称
   * @return titleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "企业抬头名称")

  public String getTitleName() {
    return titleName;
  }


  public void setTitleName(String titleName) {
    this.titleName = titleName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseTitleInfo enterpriseTitleInfo = (EnterpriseTitleInfo) o;
    return Objects.equals(this.address, enterpriseTitleInfo.address) &&
        Objects.equals(this.bankAccount, enterpriseTitleInfo.bankAccount) &&
        Objects.equals(this.bankName, enterpriseTitleInfo.bankName) &&
        Objects.equals(this.taxRegisterNo, enterpriseTitleInfo.taxRegisterNo) &&
        Objects.equals(this.telephone, enterpriseTitleInfo.telephone) &&
        Objects.equals(this.titleId, enterpriseTitleInfo.titleId) &&
        Objects.equals(this.titleName, enterpriseTitleInfo.titleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, bankAccount, bankName, taxRegisterNo, telephone, titleId, titleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseTitleInfo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    taxRegisterNo: ").append(toIndentedString(taxRegisterNo)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    titleId: ").append(toIndentedString(titleId)).append("\n");
    sb.append("    titleName: ").append(toIndentedString(titleName)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("bank_account");
    openapiFields.add("bank_name");
    openapiFields.add("tax_register_no");
    openapiFields.add("telephone");
    openapiFields.add("title_id");
    openapiFields.add("title_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EnterpriseTitleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EnterpriseTitleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnterpriseTitleInfo is not found in the empty JSON string", EnterpriseTitleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EnterpriseTitleInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnterpriseTitleInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("bank_account") != null && !jsonObj.get("bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_account").toString()));
      }
      if (jsonObj.get("bank_name") != null && !jsonObj.get("bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_name").toString()));
      }
      if (jsonObj.get("tax_register_no") != null && !jsonObj.get("tax_register_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_register_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_register_no").toString()));
      }
      if (jsonObj.get("telephone") != null && !jsonObj.get("telephone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telephone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephone").toString()));
      }
      if (jsonObj.get("title_id") != null && !jsonObj.get("title_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title_id").toString()));
      }
      if (jsonObj.get("title_name") != null && !jsonObj.get("title_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseTitleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseTitleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseTitleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseTitleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseTitleInfo>() {
           @Override
           public void write(JsonWriter out, EnterpriseTitleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseTitleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseTitleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseTitleInfo
  * @throws IOException if the JSON string is invalid with respect to EnterpriseTitleInfo
  */
  public static EnterpriseTitleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseTitleInfo.class);
  }

 /**
  * Convert an instance of EnterpriseTitleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

