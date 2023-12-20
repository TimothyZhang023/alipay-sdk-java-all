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
 * Invoice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Invoice {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_INVOICE_CONTENT = "invoice_content";
  @SerializedName(SERIALIZED_NAME_INVOICE_CONTENT)
  private String invoiceContent;

  public static final String SERIALIZED_NAME_INVOICE_FEE = "invoice_fee";
  @SerializedName(SERIALIZED_NAME_INVOICE_FEE)
  private String invoiceFee;

  public static final String SERIALIZED_NAME_INVOICE_TITLE = "invoice_title";
  @SerializedName(SERIALIZED_NAME_INVOICE_TITLE)
  private String invoiceTitle;

  public static final String SERIALIZED_NAME_INVOICE_TYPE = "invoice_type";
  @SerializedName(SERIALIZED_NAME_INVOICE_TYPE)
  private Integer invoiceType;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private String receiver;

  public static final String SERIALIZED_NAME_TAX_NUMBER = "tax_number";
  @SerializedName(SERIALIZED_NAME_TAX_NUMBER)
  private String taxNumber;

  public static final String SERIALIZED_NAME_TITLE_TYPE = "title_type";
  @SerializedName(SERIALIZED_NAME_TITLE_TYPE)
  private Integer titleType;

  public Invoice() { 
  }

  public Invoice email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 邮箱地址
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123@123.com", value = "邮箱地址")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public Invoice invoiceContent(String invoiceContent) {
    
    this.invoiceContent = invoiceContent;
    return this;
  }

   /**
   * 发票内容，配送服务费
   * @return invoiceContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "40", value = "发票内容，配送服务费")

  public String getInvoiceContent() {
    return invoiceContent;
  }


  public void setInvoiceContent(String invoiceContent) {
    this.invoiceContent = invoiceContent;
  }


  public Invoice invoiceFee(String invoiceFee) {
    
    this.invoiceFee = invoiceFee;
    return this;
  }

   /**
   * 发票金额
   * @return invoiceFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "发票金额")

  public String getInvoiceFee() {
    return invoiceFee;
  }


  public void setInvoiceFee(String invoiceFee) {
    this.invoiceFee = invoiceFee;
  }


  public Invoice invoiceTitle(String invoiceTitle) {
    
    this.invoiceTitle = invoiceTitle;
    return this;
  }

   /**
   * 发票抬头，如支付宝（杭州）信息技术有限公司
   * @return invoiceTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝（杭州）信息技术有限公司", value = "发票抬头，如支付宝（杭州）信息技术有限公司")

  public String getInvoiceTitle() {
    return invoiceTitle;
  }


  public void setInvoiceTitle(String invoiceTitle) {
    this.invoiceTitle = invoiceTitle;
  }


  public Invoice invoiceType(Integer invoiceType) {
    
    this.invoiceType = invoiceType;
    return this;
  }

   /**
   * 发票类型，0：默认电子发票
   * @return invoiceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "发票类型，0：默认电子发票")

  public Integer getInvoiceType() {
    return invoiceType;
  }


  public void setInvoiceType(Integer invoiceType) {
    this.invoiceType = invoiceType;
  }


  public Invoice phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 手机号码
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15171008605", value = "手机号码")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public Invoice receiver(String receiver) {
    
    this.receiver = receiver;
    return this;
  }

   /**
   * 收件人姓名
   * @return receiver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "语轩", value = "收件人姓名")

  public String getReceiver() {
    return receiver;
  }


  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }


  public Invoice taxNumber(String taxNumber) {
    
    this.taxNumber = taxNumber;
    return this;
  }

   /**
   * 税号
   * @return taxNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9133 0106 MA27 Y4U4 7R", value = "税号")

  public String getTaxNumber() {
    return taxNumber;
  }


  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }


  public Invoice titleType(Integer titleType) {
    
    this.titleType = titleType;
    return this;
  }

   /**
   * 抬头类型，0：企业单位，1：个人/非企业
   * @return titleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "抬头类型，0：企业单位，1：个人/非企业")

  public Integer getTitleType() {
    return titleType;
  }


  public void setTitleType(Integer titleType) {
    this.titleType = titleType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.email, invoice.email) &&
        Objects.equals(this.invoiceContent, invoice.invoiceContent) &&
        Objects.equals(this.invoiceFee, invoice.invoiceFee) &&
        Objects.equals(this.invoiceTitle, invoice.invoiceTitle) &&
        Objects.equals(this.invoiceType, invoice.invoiceType) &&
        Objects.equals(this.phone, invoice.phone) &&
        Objects.equals(this.receiver, invoice.receiver) &&
        Objects.equals(this.taxNumber, invoice.taxNumber) &&
        Objects.equals(this.titleType, invoice.titleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, invoiceContent, invoiceFee, invoiceTitle, invoiceType, phone, receiver, taxNumber, titleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    invoiceContent: ").append(toIndentedString(invoiceContent)).append("\n");
    sb.append("    invoiceFee: ").append(toIndentedString(invoiceFee)).append("\n");
    sb.append("    invoiceTitle: ").append(toIndentedString(invoiceTitle)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    taxNumber: ").append(toIndentedString(taxNumber)).append("\n");
    sb.append("    titleType: ").append(toIndentedString(titleType)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("invoice_content");
    openapiFields.add("invoice_fee");
    openapiFields.add("invoice_title");
    openapiFields.add("invoice_type");
    openapiFields.add("phone");
    openapiFields.add("receiver");
    openapiFields.add("tax_number");
    openapiFields.add("title_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Invoice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Invoice.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Invoice is not found in the empty JSON string", Invoice.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Invoice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Invoice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("invoice_content") != null && !jsonObj.get("invoice_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_content").toString()));
      }
      if (jsonObj.get("invoice_fee") != null && !jsonObj.get("invoice_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_fee").toString()));
      }
      if (jsonObj.get("invoice_title") != null && !jsonObj.get("invoice_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_title").toString()));
      }
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (jsonObj.get("receiver") != null && !jsonObj.get("receiver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiver").toString()));
      }
      if (jsonObj.get("tax_number") != null && !jsonObj.get("tax_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Invoice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Invoice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Invoice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Invoice.class));

       return (TypeAdapter<T>) new TypeAdapter<Invoice>() {
           @Override
           public void write(JsonWriter out, Invoice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Invoice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Invoice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Invoice
  * @throws IOException if the JSON string is invalid with respect to Invoice
  */
  public static Invoice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Invoice.class);
  }

 /**
  * Convert an instance of Invoice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

