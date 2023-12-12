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
import com.alipay.v3.model.ActivityBaseInfo;
import com.alipay.v3.model.CustomerGuideModify;
import com.alipay.v3.model.VoucherAvailableScopeInfo;
import com.alipay.v3.model.VoucherCustomerGuideInfo;
import com.alipay.v3.model.VoucherDisplayInfoModify;
import com.alipay.v3.model.VoucherDisplayPatternInfo;
import com.alipay.v3.model.VoucherSendModeInfo;
import com.alipay.v3.model.VoucherSendRuleDetailModify;
import com.alipay.v3.model.VoucherUseRuleInfo;
import com.alipay.v3.model.VoucherUseRuleModify;
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
 * AlipayMarketingActivityOrdervoucherModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityOrdervoucherModifyModel {
  public static final String SERIALIZED_NAME_ACTIVITY_BASE_INFO = "activity_base_info";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_BASE_INFO)
  private ActivityBaseInfo activityBaseInfo;

  public static final String SERIALIZED_NAME_ACTIVITY_NAME = "activity_name";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_NAME)
  private String activityName;

  public static final String SERIALIZED_NAME_CUSTOMER_GUIDE = "customer_guide";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_GUIDE)
  private CustomerGuideModify customerGuide;

  public static final String SERIALIZED_NAME_MERCHANT_ACCESS_MODE = "merchant_access_mode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCESS_MODE)
  private String merchantAccessMode;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PUBLISH_END_TIME = "publish_end_time";
  @SerializedName(SERIALIZED_NAME_PUBLISH_END_TIME)
  private String publishEndTime;

  public static final String SERIALIZED_NAME_PUBLISH_START_TIME = "publish_start_time";
  @SerializedName(SERIALIZED_NAME_PUBLISH_START_TIME)
  private String publishStartTime;

  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_INFO = "voucher_available_scope_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_INFO)
  private VoucherAvailableScopeInfo voucherAvailableScopeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_MODIFY_TYPE = "voucher_available_scope_modify_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_MODIFY_TYPE)
  private String voucherAvailableScopeModifyType;

  public static final String SERIALIZED_NAME_VOUCHER_CUSTOMER_GUIDE_INFO = "voucher_customer_guide_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CUSTOMER_GUIDE_INFO)
  private VoucherCustomerGuideInfo voucherCustomerGuideInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DISPLAY_INFO = "voucher_display_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DISPLAY_INFO)
  private VoucherDisplayInfoModify voucherDisplayInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO = "voucher_display_pattern_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO)
  private VoucherDisplayPatternInfo voucherDisplayPatternInfo;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO = "voucher_send_mode_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO)
  private VoucherSendModeInfo voucherSendModeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_RULE = "voucher_send_rule";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_RULE)
  private VoucherSendRuleDetailModify voucherSendRule;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE = "voucher_use_rule";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE)
  private VoucherUseRuleModify voucherUseRule;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE_INFO = "voucher_use_rule_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE_INFO)
  private VoucherUseRuleInfo voucherUseRuleInfo;

  public AlipayMarketingActivityOrdervoucherModifyModel() { 
  }

  public AlipayMarketingActivityOrdervoucherModifyModel activityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    
    this.activityBaseInfo = activityBaseInfo;
    return this;
  }

   /**
   * Get activityBaseInfo
   * @return activityBaseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ActivityBaseInfo getActivityBaseInfo() {
    return activityBaseInfo;
  }


  public void setActivityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    this.activityBaseInfo = activityBaseInfo;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel activityName(String activityName) {
    
    this.activityName = activityName;
    return this;
  }

   /**
   * 活动名称。
   * @return activityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "满10减1活动", value = "活动名称。")

  public String getActivityName() {
    return activityName;
  }


  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel customerGuide(CustomerGuideModify customerGuide) {
    
    this.customerGuide = customerGuide;
    return this;
  }

   /**
   * Get customerGuide
   * @return customerGuide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomerGuideModify getCustomerGuide() {
    return customerGuide;
  }


  public void setCustomerGuide(CustomerGuideModify customerGuide) {
    this.customerGuide = customerGuide;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel merchantAccessMode(String merchantAccessMode) {
    
    this.merchantAccessMode = merchantAccessMode;
    return this;
  }

   /**
   * 商户接入模式
   * @return merchantAccessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SELF_MODE", value = "商户接入模式")

  public String getMerchantAccessMode() {
    return merchantAccessMode;
  }


  public void setMerchantAccessMode(String merchantAccessMode) {
    this.merchantAccessMode = merchantAccessMode;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务单号，用作幂等控制。 幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170101000001654bb46ba", value = "外部业务单号，用作幂等控制。 幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel publishEndTime(String publishEndTime) {
    
    this.publishEndTime = publishEndTime;
    return this;
  }

   /**
   * 券发放结束时间。该值为空表示不修改 格式为：yyyy-MM-dd HH:mm:ss
   * @return publishEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-29 23:59:59", value = "券发放结束时间。该值为空表示不修改 格式为：yyyy-MM-dd HH:mm:ss")

  public String getPublishEndTime() {
    return publishEndTime;
  }


  public void setPublishEndTime(String publishEndTime) {
    this.publishEndTime = publishEndTime;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel publishStartTime(String publishStartTime) {
    
    this.publishStartTime = publishStartTime;
    return this;
  }

   /**
   * 券发放开始时间。 格式为：yyyy-MM-dd HH:mm:ss
   * @return publishStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01 00:00:01", value = "券发放开始时间。 格式为：yyyy-MM-dd HH:mm:ss")

  public String getPublishStartTime() {
    return publishStartTime;
  }


  public void setPublishStartTime(String publishStartTime) {
    this.publishStartTime = publishStartTime;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel voucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
    
    this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
    return this;
  }

   /**
   * Get voucherAvailableScopeInfo
   * @return voucherAvailableScopeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableScopeInfo getVoucherAvailableScopeInfo() {
    return voucherAvailableScopeInfo;
  }


  public void setVoucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
    this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel voucherAvailableScopeModifyType(String voucherAvailableScopeModifyType) {
    
    this.voucherAvailableScopeModifyType = voucherAvailableScopeModifyType;
    return this;
  }

   /**
   * 可用范围修改类型。
   * @return voucherAvailableScopeModifyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ADD", value = "可用范围修改类型。")

  public String getVoucherAvailableScopeModifyType() {
    return voucherAvailableScopeModifyType;
  }


  public void setVoucherAvailableScopeModifyType(String voucherAvailableScopeModifyType) {
    this.voucherAvailableScopeModifyType = voucherAvailableScopeModifyType;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel voucherCustomerGuideInfo(VoucherCustomerGuideInfo voucherCustomerGuideInfo) {
    
    this.voucherCustomerGuideInfo = voucherCustomerGuideInfo;
    return this;
  }

   /**
   * Get voucherCustomerGuideInfo
   * @return voucherCustomerGuideInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherCustomerGuideInfo getVoucherCustomerGuideInfo() {
    return voucherCustomerGuideInfo;
  }


  public void setVoucherCustomerGuideInfo(VoucherCustomerGuideInfo voucherCustomerGuideInfo) {
    this.voucherCustomerGuideInfo = voucherCustomerGuideInfo;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel voucherDisplayInfo(VoucherDisplayInfoModify voucherDisplayInfo) {
    
    this.voucherDisplayInfo = voucherDisplayInfo;
    return this;
  }

   /**
   * Get voucherDisplayInfo
   * @return voucherDisplayInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherDisplayInfoModify getVoucherDisplayInfo() {
    return voucherDisplayInfo;
  }


  public void setVoucherDisplayInfo(VoucherDisplayInfoModify voucherDisplayInfo) {
    this.voucherDisplayInfo = voucherDisplayInfo;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel voucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
    
    this.voucherDisplayPatternInfo = voucherDisplayPatternInfo;
    return this;
  }

   /**
   * Get voucherDisplayPatternInfo
   * @return voucherDisplayPatternInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherDisplayPatternInfo getVoucherDisplayPatternInfo() {
    return voucherDisplayPatternInfo;
  }


  public void setVoucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
    this.voucherDisplayPatternInfo = voucherDisplayPatternInfo;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel voucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    
    this.voucherSendModeInfo = voucherSendModeInfo;
    return this;
  }

   /**
   * Get voucherSendModeInfo
   * @return voucherSendModeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherSendModeInfo getVoucherSendModeInfo() {
    return voucherSendModeInfo;
  }


  public void setVoucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    this.voucherSendModeInfo = voucherSendModeInfo;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel voucherSendRule(VoucherSendRuleDetailModify voucherSendRule) {
    
    this.voucherSendRule = voucherSendRule;
    return this;
  }

   /**
   * Get voucherSendRule
   * @return voucherSendRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherSendRuleDetailModify getVoucherSendRule() {
    return voucherSendRule;
  }


  public void setVoucherSendRule(VoucherSendRuleDetailModify voucherSendRule) {
    this.voucherSendRule = voucherSendRule;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel voucherUseRule(VoucherUseRuleModify voucherUseRule) {
    
    this.voucherUseRule = voucherUseRule;
    return this;
  }

   /**
   * Get voucherUseRule
   * @return voucherUseRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherUseRuleModify getVoucherUseRule() {
    return voucherUseRule;
  }


  public void setVoucherUseRule(VoucherUseRuleModify voucherUseRule) {
    this.voucherUseRule = voucherUseRule;
  }


  public AlipayMarketingActivityOrdervoucherModifyModel voucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    
    this.voucherUseRuleInfo = voucherUseRuleInfo;
    return this;
  }

   /**
   * Get voucherUseRuleInfo
   * @return voucherUseRuleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherUseRuleInfo getVoucherUseRuleInfo() {
    return voucherUseRuleInfo;
  }


  public void setVoucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    this.voucherUseRuleInfo = voucherUseRuleInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityOrdervoucherModifyModel alipayMarketingActivityOrdervoucherModifyModel = (AlipayMarketingActivityOrdervoucherModifyModel) o;
    return Objects.equals(this.activityBaseInfo, alipayMarketingActivityOrdervoucherModifyModel.activityBaseInfo) &&
        Objects.equals(this.activityName, alipayMarketingActivityOrdervoucherModifyModel.activityName) &&
        Objects.equals(this.customerGuide, alipayMarketingActivityOrdervoucherModifyModel.customerGuide) &&
        Objects.equals(this.merchantAccessMode, alipayMarketingActivityOrdervoucherModifyModel.merchantAccessMode) &&
        Objects.equals(this.outBizNo, alipayMarketingActivityOrdervoucherModifyModel.outBizNo) &&
        Objects.equals(this.publishEndTime, alipayMarketingActivityOrdervoucherModifyModel.publishEndTime) &&
        Objects.equals(this.publishStartTime, alipayMarketingActivityOrdervoucherModifyModel.publishStartTime) &&
        Objects.equals(this.voucherAvailableScopeInfo, alipayMarketingActivityOrdervoucherModifyModel.voucherAvailableScopeInfo) &&
        Objects.equals(this.voucherAvailableScopeModifyType, alipayMarketingActivityOrdervoucherModifyModel.voucherAvailableScopeModifyType) &&
        Objects.equals(this.voucherCustomerGuideInfo, alipayMarketingActivityOrdervoucherModifyModel.voucherCustomerGuideInfo) &&
        Objects.equals(this.voucherDisplayInfo, alipayMarketingActivityOrdervoucherModifyModel.voucherDisplayInfo) &&
        Objects.equals(this.voucherDisplayPatternInfo, alipayMarketingActivityOrdervoucherModifyModel.voucherDisplayPatternInfo) &&
        Objects.equals(this.voucherSendModeInfo, alipayMarketingActivityOrdervoucherModifyModel.voucherSendModeInfo) &&
        Objects.equals(this.voucherSendRule, alipayMarketingActivityOrdervoucherModifyModel.voucherSendRule) &&
        Objects.equals(this.voucherUseRule, alipayMarketingActivityOrdervoucherModifyModel.voucherUseRule) &&
        Objects.equals(this.voucherUseRuleInfo, alipayMarketingActivityOrdervoucherModifyModel.voucherUseRuleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityBaseInfo, activityName, customerGuide, merchantAccessMode, outBizNo, publishEndTime, publishStartTime, voucherAvailableScopeInfo, voucherAvailableScopeModifyType, voucherCustomerGuideInfo, voucherDisplayInfo, voucherDisplayPatternInfo, voucherSendModeInfo, voucherSendRule, voucherUseRule, voucherUseRuleInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityOrdervoucherModifyModel {\n");
    sb.append("    activityBaseInfo: ").append(toIndentedString(activityBaseInfo)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    customerGuide: ").append(toIndentedString(customerGuide)).append("\n");
    sb.append("    merchantAccessMode: ").append(toIndentedString(merchantAccessMode)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    publishEndTime: ").append(toIndentedString(publishEndTime)).append("\n");
    sb.append("    publishStartTime: ").append(toIndentedString(publishStartTime)).append("\n");
    sb.append("    voucherAvailableScopeInfo: ").append(toIndentedString(voucherAvailableScopeInfo)).append("\n");
    sb.append("    voucherAvailableScopeModifyType: ").append(toIndentedString(voucherAvailableScopeModifyType)).append("\n");
    sb.append("    voucherCustomerGuideInfo: ").append(toIndentedString(voucherCustomerGuideInfo)).append("\n");
    sb.append("    voucherDisplayInfo: ").append(toIndentedString(voucherDisplayInfo)).append("\n");
    sb.append("    voucherDisplayPatternInfo: ").append(toIndentedString(voucherDisplayPatternInfo)).append("\n");
    sb.append("    voucherSendModeInfo: ").append(toIndentedString(voucherSendModeInfo)).append("\n");
    sb.append("    voucherSendRule: ").append(toIndentedString(voucherSendRule)).append("\n");
    sb.append("    voucherUseRule: ").append(toIndentedString(voucherUseRule)).append("\n");
    sb.append("    voucherUseRuleInfo: ").append(toIndentedString(voucherUseRuleInfo)).append("\n");
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
    openapiFields.add("activity_base_info");
    openapiFields.add("activity_name");
    openapiFields.add("customer_guide");
    openapiFields.add("merchant_access_mode");
    openapiFields.add("out_biz_no");
    openapiFields.add("publish_end_time");
    openapiFields.add("publish_start_time");
    openapiFields.add("voucher_available_scope_info");
    openapiFields.add("voucher_available_scope_modify_type");
    openapiFields.add("voucher_customer_guide_info");
    openapiFields.add("voucher_display_info");
    openapiFields.add("voucher_display_pattern_info");
    openapiFields.add("voucher_send_mode_info");
    openapiFields.add("voucher_send_rule");
    openapiFields.add("voucher_use_rule");
    openapiFields.add("voucher_use_rule_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityOrdervoucherModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityOrdervoucherModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityOrdervoucherModifyModel is not found in the empty JSON string", AlipayMarketingActivityOrdervoucherModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityOrdervoucherModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityOrdervoucherModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `activity_base_info`
      if (jsonObj.getAsJsonObject("activity_base_info") != null) {
        ActivityBaseInfo.validateJsonObject(jsonObj.getAsJsonObject("activity_base_info"));
      }
      if (jsonObj.get("activity_name") != null && !jsonObj.get("activity_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_name").toString()));
      }
      // validate the optional field `customer_guide`
      if (jsonObj.getAsJsonObject("customer_guide") != null) {
        CustomerGuideModify.validateJsonObject(jsonObj.getAsJsonObject("customer_guide"));
      }
      if (jsonObj.get("merchant_access_mode") != null && !jsonObj.get("merchant_access_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_access_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_access_mode").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("publish_end_time") != null && !jsonObj.get("publish_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_end_time").toString()));
      }
      if (jsonObj.get("publish_start_time") != null && !jsonObj.get("publish_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_start_time").toString()));
      }
      // validate the optional field `voucher_available_scope_info`
      if (jsonObj.getAsJsonObject("voucher_available_scope_info") != null) {
        VoucherAvailableScopeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_available_scope_info"));
      }
      if (jsonObj.get("voucher_available_scope_modify_type") != null && !jsonObj.get("voucher_available_scope_modify_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_available_scope_modify_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_available_scope_modify_type").toString()));
      }
      // validate the optional field `voucher_customer_guide_info`
      if (jsonObj.getAsJsonObject("voucher_customer_guide_info") != null) {
        VoucherCustomerGuideInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_customer_guide_info"));
      }
      // validate the optional field `voucher_display_info`
      if (jsonObj.getAsJsonObject("voucher_display_info") != null) {
        VoucherDisplayInfoModify.validateJsonObject(jsonObj.getAsJsonObject("voucher_display_info"));
      }
      // validate the optional field `voucher_display_pattern_info`
      if (jsonObj.getAsJsonObject("voucher_display_pattern_info") != null) {
        VoucherDisplayPatternInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_display_pattern_info"));
      }
      // validate the optional field `voucher_send_mode_info`
      if (jsonObj.getAsJsonObject("voucher_send_mode_info") != null) {
        VoucherSendModeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_send_mode_info"));
      }
      // validate the optional field `voucher_send_rule`
      if (jsonObj.getAsJsonObject("voucher_send_rule") != null) {
        VoucherSendRuleDetailModify.validateJsonObject(jsonObj.getAsJsonObject("voucher_send_rule"));
      }
      // validate the optional field `voucher_use_rule`
      if (jsonObj.getAsJsonObject("voucher_use_rule") != null) {
        VoucherUseRuleModify.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule"));
      }
      // validate the optional field `voucher_use_rule_info`
      if (jsonObj.getAsJsonObject("voucher_use_rule_info") != null) {
        VoucherUseRuleInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityOrdervoucherModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityOrdervoucherModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityOrdervoucherModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityOrdervoucherModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityOrdervoucherModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityOrdervoucherModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityOrdervoucherModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityOrdervoucherModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityOrdervoucherModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityOrdervoucherModifyModel
  */
  public static AlipayMarketingActivityOrdervoucherModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityOrdervoucherModifyModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityOrdervoucherModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

