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
 * AlipayOpenAgentMobilepaySignModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAgentMobilepaySignModel {
  public static final String SERIALIZED_NAME_APP_MARKET = "app_market";
  @SerializedName(SERIALIZED_NAME_APP_MARKET)
  private List<String> appMarket = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APP_STATUS = "app_status";
  @SerializedName(SERIALIZED_NAME_APP_STATUS)
  private String appStatus;

  public static final String SERIALIZED_NAME_APP_TEST_ACCOUNT = "app_test_account";
  @SerializedName(SERIALIZED_NAME_APP_TEST_ACCOUNT)
  private String appTestAccount;

  public static final String SERIALIZED_NAME_APP_TEST_ACCOUNT_PASSWORD = "app_test_account_password";
  @SerializedName(SERIALIZED_NAME_APP_TEST_ACCOUNT_PASSWORD)
  private String appTestAccountPassword;

  public static final String SERIALIZED_NAME_APP_TYPE = "app_type";
  @SerializedName(SERIALIZED_NAME_APP_TYPE)
  private List<String> appType = null;

  public static final String SERIALIZED_NAME_BATCH_NO = "batch_no";
  @SerializedName(SERIALIZED_NAME_BATCH_NO)
  private String batchNo;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_MOBILE = "business_license_mobile";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_MOBILE)
  private String businessLicenseMobile;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_NO = "business_license_no";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_NO)
  private String businessLicenseNo;

  public static final String SERIALIZED_NAME_DATE_LIMITATION = "date_limitation";
  @SerializedName(SERIALIZED_NAME_DATE_LIMITATION)
  private String dateLimitation;

  public static final String SERIALIZED_NAME_DOWNLOAD_LINK = "download_link";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_LINK)
  private String downloadLink;

  public static final String SERIALIZED_NAME_LONG_TERM = "long_term";
  @SerializedName(SERIALIZED_NAME_LONG_TERM)
  private Boolean longTerm;

  public static final String SERIALIZED_NAME_MCC_CODE = "mcc_code";
  @SerializedName(SERIALIZED_NAME_MCC_CODE)
  private String mccCode;

  public AlipayOpenAgentMobilepaySignModel() { 
  }

  public AlipayOpenAgentMobilepaySignModel appMarket(List<String> appMarket) {
    
    this.appMarket = appMarket;
    return this;
  }

  public AlipayOpenAgentMobilepaySignModel addAppMarketItem(String appMarketItem) {
    if (this.appMarket == null) {
      this.appMarket = new ArrayList<>();
    }
    this.appMarket.add(appMarketItem);
    return this;
  }

   /**
   * 应用在哪些市场上架，枚举值为：苹果,应用宝,豌豆荚,其他
   * @return appMarket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "应用宝", value = "应用在哪些市场上架，枚举值为：苹果,应用宝,豌豆荚,其他")

  public List<String> getAppMarket() {
    return appMarket;
  }


  public void setAppMarket(List<String> appMarket) {
    this.appMarket = appMarket;
  }


  public AlipayOpenAgentMobilepaySignModel appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 商户的APP应用名称
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "应用名称", value = "商户的APP应用名称")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AlipayOpenAgentMobilepaySignModel appStatus(String appStatus) {
    
    this.appStatus = appStatus;
    return this;
  }

   /**
   * 应用上架状态，枚举值为 已上架，未上架
   * @return appStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "已上架", value = "应用上架状态，枚举值为 已上架，未上架")

  public String getAppStatus() {
    return appStatus;
  }


  public void setAppStatus(String appStatus) {
    this.appStatus = appStatus;
  }


  public AlipayOpenAgentMobilepaySignModel appTestAccount(String appTestAccount) {
    
    this.appTestAccount = appTestAccount;
    return this;
  }

   /**
   * 可以登录该应用的测试账户
   * @return appTestAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "testAccount", value = "可以登录该应用的测试账户")

  public String getAppTestAccount() {
    return appTestAccount;
  }


  public void setAppTestAccount(String appTestAccount) {
    this.appTestAccount = appTestAccount;
  }


  public AlipayOpenAgentMobilepaySignModel appTestAccountPassword(String appTestAccountPassword) {
    
    this.appTestAccountPassword = appTestAccountPassword;
    return this;
  }

   /**
   * 可以登录此应用的账户的密码。对应app_test_account的登录密码
   * @return appTestAccountPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "testPassword", value = "可以登录此应用的账户的密码。对应app_test_account的登录密码")

  public String getAppTestAccountPassword() {
    return appTestAccountPassword;
  }


  public void setAppTestAccountPassword(String appTestAccountPassword) {
    this.appTestAccountPassword = appTestAccountPassword;
  }


  public AlipayOpenAgentMobilepaySignModel appType(List<String> appType) {
    
    this.appType = appType;
    return this;
  }

  public AlipayOpenAgentMobilepaySignModel addAppTypeItem(String appTypeItem) {
    if (this.appType == null) {
      this.appType = new ArrayList<>();
    }
    this.appType.add(appTypeItem);
    return this;
  }

   /**
   * 应用类型，枚举值为：IOS，安卓
   * @return appType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "安卓", value = "应用类型，枚举值为：IOS，安卓")

  public List<String> getAppType() {
    return appType;
  }


  public void setAppType(List<String> appType) {
    this.appType = appType;
  }


  public AlipayOpenAgentMobilepaySignModel batchNo(String batchNo) {
    
    this.batchNo = batchNo;
    return this;
  }

   /**
   * 代商户操作事务编号，通过alipay.open.isv.agent.create接口进行创建。
   * @return batchNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017110616474516400082883", value = "代商户操作事务编号，通过alipay.open.isv.agent.create接口进行创建。")

  public String getBatchNo() {
    return batchNo;
  }


  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }


  public AlipayOpenAgentMobilepaySignModel businessLicenseMobile(String businessLicenseMobile) {
    
    this.businessLicenseMobile = businessLicenseMobile;
    return this;
  }

   /**
   * 营业执照法人手机号码
   * @return businessLicenseMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13189652239", value = "营业执照法人手机号码")

  public String getBusinessLicenseMobile() {
    return businessLicenseMobile;
  }


  public void setBusinessLicenseMobile(String businessLicenseMobile) {
    this.businessLicenseMobile = businessLicenseMobile;
  }


  public AlipayOpenAgentMobilepaySignModel businessLicenseNo(String businessLicenseNo) {
    
    this.businessLicenseNo = businessLicenseNo;
    return this;
  }

   /**
   * 营业执照号码。
   * @return businessLicenseNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1532501100006302", value = "营业执照号码。")

  public String getBusinessLicenseNo() {
    return businessLicenseNo;
  }


  public void setBusinessLicenseNo(String businessLicenseNo) {
    this.businessLicenseNo = businessLicenseNo;
  }


  public AlipayOpenAgentMobilepaySignModel dateLimitation(String dateLimitation) {
    
    this.dateLimitation = dateLimitation;
    return this;
  }

   /**
   * 营业期限
   * @return dateLimitation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-11-11", value = "营业期限")

  public String getDateLimitation() {
    return dateLimitation;
  }


  public void setDateLimitation(String dateLimitation) {
    this.dateLimitation = dateLimitation;
  }


  public AlipayOpenAgentMobilepaySignModel downloadLink(String downloadLink) {
    
    this.downloadLink = downloadLink;
    return this;
  }

   /**
   * 应用下载链接
   * @return downloadLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://demo.com/demo.apk", value = "应用下载链接")

  public String getDownloadLink() {
    return downloadLink;
  }


  public void setDownloadLink(String downloadLink) {
    this.downloadLink = downloadLink;
  }


  public AlipayOpenAgentMobilepaySignModel longTerm(Boolean longTerm) {
    
    this.longTerm = longTerm;
    return this;
  }

   /**
   * 营业期限是否长期有效
   * @return longTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "营业期限是否长期有效")

  public Boolean getLongTerm() {
    return longTerm;
  }


  public void setLongTerm(Boolean longTerm) {
    this.longTerm = longTerm;
  }


  public AlipayOpenAgentMobilepaySignModel mccCode(String mccCode) {
    
    this.mccCode = mccCode;
    return this;
  }

   /**
   * 所属MCCCode，详情可参考 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01n22g#%E5%95%86%E5%AE%B6%E7%BB%8F%E8%90%A5%E7%B1%BB%E7%9B%AE\&quot;&gt;商家经营类目&lt;/a&gt; 中的“经营类目编码”
   * @return mccCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A_A03_4582", value = "所属MCCCode，详情可参考 <a href=\"https://opendocs.alipay.com/open/01n22g#%E5%95%86%E5%AE%B6%E7%BB%8F%E8%90%A5%E7%B1%BB%E7%9B%AE\">商家经营类目</a> 中的“经营类目编码”")

  public String getMccCode() {
    return mccCode;
  }


  public void setMccCode(String mccCode) {
    this.mccCode = mccCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAgentMobilepaySignModel alipayOpenAgentMobilepaySignModel = (AlipayOpenAgentMobilepaySignModel) o;
    return Objects.equals(this.appMarket, alipayOpenAgentMobilepaySignModel.appMarket) &&
        Objects.equals(this.appName, alipayOpenAgentMobilepaySignModel.appName) &&
        Objects.equals(this.appStatus, alipayOpenAgentMobilepaySignModel.appStatus) &&
        Objects.equals(this.appTestAccount, alipayOpenAgentMobilepaySignModel.appTestAccount) &&
        Objects.equals(this.appTestAccountPassword, alipayOpenAgentMobilepaySignModel.appTestAccountPassword) &&
        Objects.equals(this.appType, alipayOpenAgentMobilepaySignModel.appType) &&
        Objects.equals(this.batchNo, alipayOpenAgentMobilepaySignModel.batchNo) &&
        Objects.equals(this.businessLicenseMobile, alipayOpenAgentMobilepaySignModel.businessLicenseMobile) &&
        Objects.equals(this.businessLicenseNo, alipayOpenAgentMobilepaySignModel.businessLicenseNo) &&
        Objects.equals(this.dateLimitation, alipayOpenAgentMobilepaySignModel.dateLimitation) &&
        Objects.equals(this.downloadLink, alipayOpenAgentMobilepaySignModel.downloadLink) &&
        Objects.equals(this.longTerm, alipayOpenAgentMobilepaySignModel.longTerm) &&
        Objects.equals(this.mccCode, alipayOpenAgentMobilepaySignModel.mccCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appMarket, appName, appStatus, appTestAccount, appTestAccountPassword, appType, batchNo, businessLicenseMobile, businessLicenseNo, dateLimitation, downloadLink, longTerm, mccCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAgentMobilepaySignModel {\n");
    sb.append("    appMarket: ").append(toIndentedString(appMarket)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appStatus: ").append(toIndentedString(appStatus)).append("\n");
    sb.append("    appTestAccount: ").append(toIndentedString(appTestAccount)).append("\n");
    sb.append("    appTestAccountPassword: ").append(toIndentedString(appTestAccountPassword)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
    sb.append("    businessLicenseMobile: ").append(toIndentedString(businessLicenseMobile)).append("\n");
    sb.append("    businessLicenseNo: ").append(toIndentedString(businessLicenseNo)).append("\n");
    sb.append("    dateLimitation: ").append(toIndentedString(dateLimitation)).append("\n");
    sb.append("    downloadLink: ").append(toIndentedString(downloadLink)).append("\n");
    sb.append("    longTerm: ").append(toIndentedString(longTerm)).append("\n");
    sb.append("    mccCode: ").append(toIndentedString(mccCode)).append("\n");
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
    openapiFields.add("app_market");
    openapiFields.add("app_name");
    openapiFields.add("app_status");
    openapiFields.add("app_test_account");
    openapiFields.add("app_test_account_password");
    openapiFields.add("app_type");
    openapiFields.add("batch_no");
    openapiFields.add("business_license_mobile");
    openapiFields.add("business_license_no");
    openapiFields.add("date_limitation");
    openapiFields.add("download_link");
    openapiFields.add("long_term");
    openapiFields.add("mcc_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAgentMobilepaySignModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAgentMobilepaySignModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAgentMobilepaySignModel is not found in the empty JSON string", AlipayOpenAgentMobilepaySignModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAgentMobilepaySignModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAgentMobilepaySignModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("app_market") != null && !jsonObj.get("app_market").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_market` to be an array in the JSON string but got `%s`", jsonObj.get("app_market").toString()));
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("app_status") != null && !jsonObj.get("app_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_status").toString()));
      }
      if (jsonObj.get("app_test_account") != null && !jsonObj.get("app_test_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_test_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_test_account").toString()));
      }
      if (jsonObj.get("app_test_account_password") != null && !jsonObj.get("app_test_account_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_test_account_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_test_account_password").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("app_type") != null && !jsonObj.get("app_type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_type` to be an array in the JSON string but got `%s`", jsonObj.get("app_type").toString()));
      }
      if (jsonObj.get("batch_no") != null && !jsonObj.get("batch_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_no").toString()));
      }
      if (jsonObj.get("business_license_mobile") != null && !jsonObj.get("business_license_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_license_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_license_mobile").toString()));
      }
      if (jsonObj.get("business_license_no") != null && !jsonObj.get("business_license_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_license_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_license_no").toString()));
      }
      if (jsonObj.get("date_limitation") != null && !jsonObj.get("date_limitation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_limitation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_limitation").toString()));
      }
      if (jsonObj.get("download_link") != null && !jsonObj.get("download_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `download_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("download_link").toString()));
      }
      if (jsonObj.get("mcc_code") != null && !jsonObj.get("mcc_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAgentMobilepaySignModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAgentMobilepaySignModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAgentMobilepaySignModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAgentMobilepaySignModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAgentMobilepaySignModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAgentMobilepaySignModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAgentMobilepaySignModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAgentMobilepaySignModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAgentMobilepaySignModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAgentMobilepaySignModel
  */
  public static AlipayOpenAgentMobilepaySignModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAgentMobilepaySignModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAgentMobilepaySignModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

