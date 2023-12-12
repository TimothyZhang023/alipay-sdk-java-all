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
import com.alipay.v3.model.PaymentVoucherBelongMerchantInfo;
import com.alipay.v3.model.PaymentVoucherBudgetInfo;
import com.alipay.v3.model.PaymentVoucherDisplayInfo;
import com.alipay.v3.model.PaymentVoucherSendRule;
import com.alipay.v3.model.PaymentVoucherUseRule;
import com.alipay.v3.model.VoucherAvailableScopeInfo;
import com.alipay.v3.model.VoucherBudgetSupplyInfo;
import com.alipay.v3.model.VoucherCustomerGuideInfo;
import com.alipay.v3.model.VoucherDeductInfo;
import com.alipay.v3.model.VoucherDisplayPatternInfo;
import com.alipay.v3.model.VoucherSendModeInfo;
import com.alipay.v3.model.VoucherUseRuleInfo;
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
 * AlipayMarketingActivityVoucherCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityVoucherCreateModel {
  public static final String SERIALIZED_NAME_ACTIVITY_BASE_INFO = "activity_base_info";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_BASE_INFO)
  private ActivityBaseInfo activityBaseInfo;

  public static final String SERIALIZED_NAME_ACTIVITY_NAME = "activity_name";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_NAME)
  private String activityName;

  public static final String SERIALIZED_NAME_BELONG_MERCHANT_INFO = "belong_merchant_info";
  @SerializedName(SERIALIZED_NAME_BELONG_MERCHANT_INFO)
  private PaymentVoucherBelongMerchantInfo belongMerchantInfo;

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

  public static final String SERIALIZED_NAME_VOUCHER_BUDGET_INFO = "voucher_budget_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_BUDGET_INFO)
  private PaymentVoucherBudgetInfo voucherBudgetInfo;

  public static final String SERIALIZED_NAME_VOUCHER_BUDGET_SUPPLY_INFO = "voucher_budget_supply_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_BUDGET_SUPPLY_INFO)
  private VoucherBudgetSupplyInfo voucherBudgetSupplyInfo;

  public static final String SERIALIZED_NAME_VOUCHER_CUSTOMER_GUIDE_INFO = "voucher_customer_guide_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CUSTOMER_GUIDE_INFO)
  private VoucherCustomerGuideInfo voucherCustomerGuideInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DEDUCT_INFO = "voucher_deduct_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DEDUCT_INFO)
  private VoucherDeductInfo voucherDeductInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DISPLAY_INFO = "voucher_display_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DISPLAY_INFO)
  private PaymentVoucherDisplayInfo voucherDisplayInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO = "voucher_display_pattern_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO)
  private VoucherDisplayPatternInfo voucherDisplayPatternInfo;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO = "voucher_send_mode_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO)
  private VoucherSendModeInfo voucherSendModeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_RULE = "voucher_send_rule";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_RULE)
  private PaymentVoucherSendRule voucherSendRule;

  public static final String SERIALIZED_NAME_VOUCHER_TYPE = "voucher_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_TYPE)
  private String voucherType;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE = "voucher_use_rule";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE)
  private PaymentVoucherUseRule voucherUseRule;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE_INFO = "voucher_use_rule_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE_INFO)
  private VoucherUseRuleInfo voucherUseRuleInfo;

  public AlipayMarketingActivityVoucherCreateModel() { 
  }

  public AlipayMarketingActivityVoucherCreateModel activityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    
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


  public AlipayMarketingActivityVoucherCreateModel activityName(String activityName) {
    
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


  public AlipayMarketingActivityVoucherCreateModel belongMerchantInfo(PaymentVoucherBelongMerchantInfo belongMerchantInfo) {
    
    this.belongMerchantInfo = belongMerchantInfo;
    return this;
  }

   /**
   * Get belongMerchantInfo
   * @return belongMerchantInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentVoucherBelongMerchantInfo getBelongMerchantInfo() {
    return belongMerchantInfo;
  }


  public void setBelongMerchantInfo(PaymentVoucherBelongMerchantInfo belongMerchantInfo) {
    this.belongMerchantInfo = belongMerchantInfo;
  }


  public AlipayMarketingActivityVoucherCreateModel merchantAccessMode(String merchantAccessMode) {
    
    this.merchantAccessMode = merchantAccessMode;
    return this;
  }

   /**
   * 商户接入模式
   * @return merchantAccessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AGENCY_MODE", value = "商户接入模式")

  public String getMerchantAccessMode() {
    return merchantAccessMode;
  }


  public void setMerchantAccessMode(String merchantAccessMode) {
    this.merchantAccessMode = merchantAccessMode;
  }


  public AlipayMarketingActivityVoucherCreateModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 用作幂等控制。  幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。  外部接入方需保证业务单号唯一。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170101000001654bb46ba", value = "用作幂等控制。  幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。  外部接入方需保证业务单号唯一。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayMarketingActivityVoucherCreateModel publishEndTime(String publishEndTime) {
    
    this.publishEndTime = publishEndTime;
    return this;
  }

   /**
   * 券发放结束时间。 格式为：yyyy-MM-dd HH:mm:ss 限制： 券发放结束时间 publish_end_time 与 券发放开始时间  publish_start_time 间隔必须小于等于180天
   * @return publishEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-29 23:59:59", value = "券发放结束时间。 格式为：yyyy-MM-dd HH:mm:ss 限制： 券发放结束时间 publish_end_time 与 券发放开始时间  publish_start_time 间隔必须小于等于180天")

  public String getPublishEndTime() {
    return publishEndTime;
  }


  public void setPublishEndTime(String publishEndTime) {
    this.publishEndTime = publishEndTime;
  }


  public AlipayMarketingActivityVoucherCreateModel publishStartTime(String publishStartTime) {
    
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


  public AlipayMarketingActivityVoucherCreateModel voucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
    
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


  public AlipayMarketingActivityVoucherCreateModel voucherBudgetInfo(PaymentVoucherBudgetInfo voucherBudgetInfo) {
    
    this.voucherBudgetInfo = voucherBudgetInfo;
    return this;
  }

   /**
   * Get voucherBudgetInfo
   * @return voucherBudgetInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentVoucherBudgetInfo getVoucherBudgetInfo() {
    return voucherBudgetInfo;
  }


  public void setVoucherBudgetInfo(PaymentVoucherBudgetInfo voucherBudgetInfo) {
    this.voucherBudgetInfo = voucherBudgetInfo;
  }


  public AlipayMarketingActivityVoucherCreateModel voucherBudgetSupplyInfo(VoucherBudgetSupplyInfo voucherBudgetSupplyInfo) {
    
    this.voucherBudgetSupplyInfo = voucherBudgetSupplyInfo;
    return this;
  }

   /**
   * Get voucherBudgetSupplyInfo
   * @return voucherBudgetSupplyInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherBudgetSupplyInfo getVoucherBudgetSupplyInfo() {
    return voucherBudgetSupplyInfo;
  }


  public void setVoucherBudgetSupplyInfo(VoucherBudgetSupplyInfo voucherBudgetSupplyInfo) {
    this.voucherBudgetSupplyInfo = voucherBudgetSupplyInfo;
  }


  public AlipayMarketingActivityVoucherCreateModel voucherCustomerGuideInfo(VoucherCustomerGuideInfo voucherCustomerGuideInfo) {
    
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


  public AlipayMarketingActivityVoucherCreateModel voucherDeductInfo(VoucherDeductInfo voucherDeductInfo) {
    
    this.voucherDeductInfo = voucherDeductInfo;
    return this;
  }

   /**
   * Get voucherDeductInfo
   * @return voucherDeductInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherDeductInfo getVoucherDeductInfo() {
    return voucherDeductInfo;
  }


  public void setVoucherDeductInfo(VoucherDeductInfo voucherDeductInfo) {
    this.voucherDeductInfo = voucherDeductInfo;
  }


  public AlipayMarketingActivityVoucherCreateModel voucherDisplayInfo(PaymentVoucherDisplayInfo voucherDisplayInfo) {
    
    this.voucherDisplayInfo = voucherDisplayInfo;
    return this;
  }

   /**
   * Get voucherDisplayInfo
   * @return voucherDisplayInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentVoucherDisplayInfo getVoucherDisplayInfo() {
    return voucherDisplayInfo;
  }


  public void setVoucherDisplayInfo(PaymentVoucherDisplayInfo voucherDisplayInfo) {
    this.voucherDisplayInfo = voucherDisplayInfo;
  }


  public AlipayMarketingActivityVoucherCreateModel voucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
    
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


  public AlipayMarketingActivityVoucherCreateModel voucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    
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


  public AlipayMarketingActivityVoucherCreateModel voucherSendRule(PaymentVoucherSendRule voucherSendRule) {
    
    this.voucherSendRule = voucherSendRule;
    return this;
  }

   /**
   * Get voucherSendRule
   * @return voucherSendRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentVoucherSendRule getVoucherSendRule() {
    return voucherSendRule;
  }


  public void setVoucherSendRule(PaymentVoucherSendRule voucherSendRule) {
    this.voucherSendRule = voucherSendRule;
  }


  public AlipayMarketingActivityVoucherCreateModel voucherType(String voucherType) {
    
    this.voucherType = voucherType;
    return this;
  }

   /**
   * 券类型
   * @return voucherType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FIX_VOUCHER", value = "券类型")

  public String getVoucherType() {
    return voucherType;
  }


  public void setVoucherType(String voucherType) {
    this.voucherType = voucherType;
  }


  public AlipayMarketingActivityVoucherCreateModel voucherUseRule(PaymentVoucherUseRule voucherUseRule) {
    
    this.voucherUseRule = voucherUseRule;
    return this;
  }

   /**
   * Get voucherUseRule
   * @return voucherUseRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentVoucherUseRule getVoucherUseRule() {
    return voucherUseRule;
  }


  public void setVoucherUseRule(PaymentVoucherUseRule voucherUseRule) {
    this.voucherUseRule = voucherUseRule;
  }


  public AlipayMarketingActivityVoucherCreateModel voucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    
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
    AlipayMarketingActivityVoucherCreateModel alipayMarketingActivityVoucherCreateModel = (AlipayMarketingActivityVoucherCreateModel) o;
    return Objects.equals(this.activityBaseInfo, alipayMarketingActivityVoucherCreateModel.activityBaseInfo) &&
        Objects.equals(this.activityName, alipayMarketingActivityVoucherCreateModel.activityName) &&
        Objects.equals(this.belongMerchantInfo, alipayMarketingActivityVoucherCreateModel.belongMerchantInfo) &&
        Objects.equals(this.merchantAccessMode, alipayMarketingActivityVoucherCreateModel.merchantAccessMode) &&
        Objects.equals(this.outBizNo, alipayMarketingActivityVoucherCreateModel.outBizNo) &&
        Objects.equals(this.publishEndTime, alipayMarketingActivityVoucherCreateModel.publishEndTime) &&
        Objects.equals(this.publishStartTime, alipayMarketingActivityVoucherCreateModel.publishStartTime) &&
        Objects.equals(this.voucherAvailableScopeInfo, alipayMarketingActivityVoucherCreateModel.voucherAvailableScopeInfo) &&
        Objects.equals(this.voucherBudgetInfo, alipayMarketingActivityVoucherCreateModel.voucherBudgetInfo) &&
        Objects.equals(this.voucherBudgetSupplyInfo, alipayMarketingActivityVoucherCreateModel.voucherBudgetSupplyInfo) &&
        Objects.equals(this.voucherCustomerGuideInfo, alipayMarketingActivityVoucherCreateModel.voucherCustomerGuideInfo) &&
        Objects.equals(this.voucherDeductInfo, alipayMarketingActivityVoucherCreateModel.voucherDeductInfo) &&
        Objects.equals(this.voucherDisplayInfo, alipayMarketingActivityVoucherCreateModel.voucherDisplayInfo) &&
        Objects.equals(this.voucherDisplayPatternInfo, alipayMarketingActivityVoucherCreateModel.voucherDisplayPatternInfo) &&
        Objects.equals(this.voucherSendModeInfo, alipayMarketingActivityVoucherCreateModel.voucherSendModeInfo) &&
        Objects.equals(this.voucherSendRule, alipayMarketingActivityVoucherCreateModel.voucherSendRule) &&
        Objects.equals(this.voucherType, alipayMarketingActivityVoucherCreateModel.voucherType) &&
        Objects.equals(this.voucherUseRule, alipayMarketingActivityVoucherCreateModel.voucherUseRule) &&
        Objects.equals(this.voucherUseRuleInfo, alipayMarketingActivityVoucherCreateModel.voucherUseRuleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityBaseInfo, activityName, belongMerchantInfo, merchantAccessMode, outBizNo, publishEndTime, publishStartTime, voucherAvailableScopeInfo, voucherBudgetInfo, voucherBudgetSupplyInfo, voucherCustomerGuideInfo, voucherDeductInfo, voucherDisplayInfo, voucherDisplayPatternInfo, voucherSendModeInfo, voucherSendRule, voucherType, voucherUseRule, voucherUseRuleInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityVoucherCreateModel {\n");
    sb.append("    activityBaseInfo: ").append(toIndentedString(activityBaseInfo)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    belongMerchantInfo: ").append(toIndentedString(belongMerchantInfo)).append("\n");
    sb.append("    merchantAccessMode: ").append(toIndentedString(merchantAccessMode)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    publishEndTime: ").append(toIndentedString(publishEndTime)).append("\n");
    sb.append("    publishStartTime: ").append(toIndentedString(publishStartTime)).append("\n");
    sb.append("    voucherAvailableScopeInfo: ").append(toIndentedString(voucherAvailableScopeInfo)).append("\n");
    sb.append("    voucherBudgetInfo: ").append(toIndentedString(voucherBudgetInfo)).append("\n");
    sb.append("    voucherBudgetSupplyInfo: ").append(toIndentedString(voucherBudgetSupplyInfo)).append("\n");
    sb.append("    voucherCustomerGuideInfo: ").append(toIndentedString(voucherCustomerGuideInfo)).append("\n");
    sb.append("    voucherDeductInfo: ").append(toIndentedString(voucherDeductInfo)).append("\n");
    sb.append("    voucherDisplayInfo: ").append(toIndentedString(voucherDisplayInfo)).append("\n");
    sb.append("    voucherDisplayPatternInfo: ").append(toIndentedString(voucherDisplayPatternInfo)).append("\n");
    sb.append("    voucherSendModeInfo: ").append(toIndentedString(voucherSendModeInfo)).append("\n");
    sb.append("    voucherSendRule: ").append(toIndentedString(voucherSendRule)).append("\n");
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
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
    openapiFields.add("belong_merchant_info");
    openapiFields.add("merchant_access_mode");
    openapiFields.add("out_biz_no");
    openapiFields.add("publish_end_time");
    openapiFields.add("publish_start_time");
    openapiFields.add("voucher_available_scope_info");
    openapiFields.add("voucher_budget_info");
    openapiFields.add("voucher_budget_supply_info");
    openapiFields.add("voucher_customer_guide_info");
    openapiFields.add("voucher_deduct_info");
    openapiFields.add("voucher_display_info");
    openapiFields.add("voucher_display_pattern_info");
    openapiFields.add("voucher_send_mode_info");
    openapiFields.add("voucher_send_rule");
    openapiFields.add("voucher_type");
    openapiFields.add("voucher_use_rule");
    openapiFields.add("voucher_use_rule_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityVoucherCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityVoucherCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityVoucherCreateModel is not found in the empty JSON string", AlipayMarketingActivityVoucherCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityVoucherCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityVoucherCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `activity_base_info`
      if (jsonObj.getAsJsonObject("activity_base_info") != null) {
        ActivityBaseInfo.validateJsonObject(jsonObj.getAsJsonObject("activity_base_info"));
      }
      if (jsonObj.get("activity_name") != null && !jsonObj.get("activity_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_name").toString()));
      }
      // validate the optional field `belong_merchant_info`
      if (jsonObj.getAsJsonObject("belong_merchant_info") != null) {
        PaymentVoucherBelongMerchantInfo.validateJsonObject(jsonObj.getAsJsonObject("belong_merchant_info"));
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
      // validate the optional field `voucher_budget_info`
      if (jsonObj.getAsJsonObject("voucher_budget_info") != null) {
        PaymentVoucherBudgetInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_budget_info"));
      }
      // validate the optional field `voucher_budget_supply_info`
      if (jsonObj.getAsJsonObject("voucher_budget_supply_info") != null) {
        VoucherBudgetSupplyInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_budget_supply_info"));
      }
      // validate the optional field `voucher_customer_guide_info`
      if (jsonObj.getAsJsonObject("voucher_customer_guide_info") != null) {
        VoucherCustomerGuideInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_customer_guide_info"));
      }
      // validate the optional field `voucher_deduct_info`
      if (jsonObj.getAsJsonObject("voucher_deduct_info") != null) {
        VoucherDeductInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_deduct_info"));
      }
      // validate the optional field `voucher_display_info`
      if (jsonObj.getAsJsonObject("voucher_display_info") != null) {
        PaymentVoucherDisplayInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_display_info"));
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
        PaymentVoucherSendRule.validateJsonObject(jsonObj.getAsJsonObject("voucher_send_rule"));
      }
      if (jsonObj.get("voucher_type") != null && !jsonObj.get("voucher_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_type").toString()));
      }
      // validate the optional field `voucher_use_rule`
      if (jsonObj.getAsJsonObject("voucher_use_rule") != null) {
        PaymentVoucherUseRule.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule"));
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
       if (!AlipayMarketingActivityVoucherCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityVoucherCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityVoucherCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityVoucherCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityVoucherCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityVoucherCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityVoucherCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityVoucherCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityVoucherCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityVoucherCreateModel
  */
  public static AlipayMarketingActivityVoucherCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityVoucherCreateModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityVoucherCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

