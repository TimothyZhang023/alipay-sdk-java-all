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
import com.alipay.v3.model.InteligentClauseTerm;
import com.alipay.v3.model.InteligentDelayInfo;
import com.alipay.v3.model.InteligentDisplayConfig;
import com.alipay.v3.model.InteligentItemInfo;
import com.alipay.v3.model.InteligentUseRule;
import com.alipay.v3.model.InteligentVoucherDescDetail;
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
 * InteligentVoucher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteligentVoucher {
  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_DONATE_FLAG = "donate_flag";
  @SerializedName(SERIALIZED_NAME_DONATE_FLAG)
  private String donateFlag;

  public static final String SERIALIZED_NAME_EFFECT_TYPE = "effect_type";
  @SerializedName(SERIALIZED_NAME_EFFECT_TYPE)
  private String effectType;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_INTELIGENT_CLAUSE_TERMS = "inteligent_clause_terms";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_CLAUSE_TERMS)
  private List<InteligentClauseTerm> inteligentClauseTerms = null;

  public static final String SERIALIZED_NAME_INTELIGENT_DELAY_INFO = "inteligent_delay_info";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_DELAY_INFO)
  private InteligentDelayInfo inteligentDelayInfo;

  public static final String SERIALIZED_NAME_INTELIGENT_DESC_DETAIL_LIST = "inteligent_desc_detail_list";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_DESC_DETAIL_LIST)
  private List<InteligentVoucherDescDetail> inteligentDescDetailList = null;

  public static final String SERIALIZED_NAME_INTELIGENT_DISPLAY_CONFIG = "inteligent_display_config";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_DISPLAY_CONFIG)
  private InteligentDisplayConfig inteligentDisplayConfig;

  public static final String SERIALIZED_NAME_INTELIGENT_ITEM_INFO = "inteligent_item_info";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_ITEM_INFO)
  private InteligentItemInfo inteligentItemInfo;

  public static final String SERIALIZED_NAME_INTELIGENT_USE_RULE = "inteligent_use_rule";
  @SerializedName(SERIALIZED_NAME_INTELIGENT_USE_RULE)
  private InteligentUseRule inteligentUseRule;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_MAX_AMOUNT = "max_amount";
  @SerializedName(SERIALIZED_NAME_MAX_AMOUNT)
  private String maxAmount;

  public static final String SERIALIZED_NAME_MULTI_USE_MODE = "multi_use_mode";
  @SerializedName(SERIALIZED_NAME_MULTI_USE_MODE)
  private String multiUseMode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  public static final String SERIALIZED_NAME_RELATIVE_TIME = "relative_time";
  @SerializedName(SERIALIZED_NAME_RELATIVE_TIME)
  private String relativeTime;

  public static final String SERIALIZED_NAME_ROUNDING_RULE = "rounding_rule";
  @SerializedName(SERIALIZED_NAME_ROUNDING_RULE)
  private String roundingRule;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USE_INSTRUCTIONS = "use_instructions";
  @SerializedName(SERIALIZED_NAME_USE_INSTRUCTIONS)
  private List<String> useInstructions = null;

  public static final String SERIALIZED_NAME_VALIDATE_TYPE = "validate_type";
  @SerializedName(SERIALIZED_NAME_VALIDATE_TYPE)
  private String validateType;

  public static final String SERIALIZED_NAME_VERIFY_MODE = "verify_mode";
  @SerializedName(SERIALIZED_NAME_VERIFY_MODE)
  private String verifyMode;

  public static final String SERIALIZED_NAME_VOUCHER_IMG = "voucher_img";
  @SerializedName(SERIALIZED_NAME_VOUCHER_IMG)
  private String voucherImg;

  public static final String SERIALIZED_NAME_VOUCHER_NOTE = "voucher_note";
  @SerializedName(SERIALIZED_NAME_VOUCHER_NOTE)
  private String voucherNote;

  public static final String SERIALIZED_NAME_WORTH_VALUE = "worth_value";
  @SerializedName(SERIALIZED_NAME_WORTH_VALUE)
  private String worthValue;

  public InteligentVoucher() { 
  }

  public InteligentVoucher brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 品牌名称
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "品牌名称", value = "品牌名称")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public InteligentVoucher desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 券详细说明  最多包含500个字符
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "券的详细说明", value = "券详细说明  最多包含500个字符")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public InteligentVoucher donateFlag(String donateFlag) {
    
    this.donateFlag = donateFlag;
    return this;
  }

   /**
   * 券是否可转赠，默认为可转赠
   * @return donateFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "券是否可转赠，默认为可转赠")

  public String getDonateFlag() {
    return donateFlag;
  }


  public void setDonateFlag(String donateFlag) {
    this.donateFlag = donateFlag;
  }


  public InteligentVoucher effectType(String effectType) {
    
    this.effectType = effectType;
    return this;
  }

   /**
   * 券生效的方式，目前支持以下方式  立即生效：IMMEDIATELY  延迟生效：DELAY  仅在券有效期类型为相对有效期时生效
   * @return effectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IMMEDIATELY", value = "券生效的方式，目前支持以下方式  立即生效：IMMEDIATELY  延迟生效：DELAY  仅在券有效期类型为相对有效期时生效")

  public String getEffectType() {
    return effectType;
  }


  public void setEffectType(String effectType) {
    this.effectType = effectType;
  }


  public InteligentVoucher endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 券有效期的结束时间  仅在券有效期类型为绝对有效期时生效  必须晚于活动结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-11-01 00:00:00", value = "券有效期的结束时间  仅在券有效期类型为绝对有效期时生效  必须晚于活动结束时间")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public InteligentVoucher extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 券的扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"key\":\"value\"", value = "券的扩展信息")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public InteligentVoucher inteligentClauseTerms(List<InteligentClauseTerm> inteligentClauseTerms) {
    
    this.inteligentClauseTerms = inteligentClauseTerms;
    return this;
  }

  public InteligentVoucher addInteligentClauseTermsItem(InteligentClauseTerm inteligentClauseTermsItem) {
    if (this.inteligentClauseTerms == null) {
      this.inteligentClauseTerms = new ArrayList<>();
    }
    this.inteligentClauseTerms.add(inteligentClauseTermsItem);
    return this;
  }

   /**
   * 券的说明条款
   * @return inteligentClauseTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券的说明条款")

  public List<InteligentClauseTerm> getInteligentClauseTerms() {
    return inteligentClauseTerms;
  }


  public void setInteligentClauseTerms(List<InteligentClauseTerm> inteligentClauseTerms) {
    this.inteligentClauseTerms = inteligentClauseTerms;
  }


  public InteligentVoucher inteligentDelayInfo(InteligentDelayInfo inteligentDelayInfo) {
    
    this.inteligentDelayInfo = inteligentDelayInfo;
    return this;
  }

   /**
   * Get inteligentDelayInfo
   * @return inteligentDelayInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InteligentDelayInfo getInteligentDelayInfo() {
    return inteligentDelayInfo;
  }


  public void setInteligentDelayInfo(InteligentDelayInfo inteligentDelayInfo) {
    this.inteligentDelayInfo = inteligentDelayInfo;
  }


  public InteligentVoucher inteligentDescDetailList(List<InteligentVoucherDescDetail> inteligentDescDetailList) {
    
    this.inteligentDescDetailList = inteligentDescDetailList;
    return this;
  }

  public InteligentVoucher addInteligentDescDetailListItem(InteligentVoucherDescDetail inteligentDescDetailListItem) {
    if (this.inteligentDescDetailList == null) {
      this.inteligentDescDetailList = new ArrayList<>();
    }
    this.inteligentDescDetailList.add(inteligentDescDetailListItem);
    return this;
  }

   /**
   * 券使用说明描述列表
   * @return inteligentDescDetailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券使用说明描述列表")

  public List<InteligentVoucherDescDetail> getInteligentDescDetailList() {
    return inteligentDescDetailList;
  }


  public void setInteligentDescDetailList(List<InteligentVoucherDescDetail> inteligentDescDetailList) {
    this.inteligentDescDetailList = inteligentDescDetailList;
  }


  public InteligentVoucher inteligentDisplayConfig(InteligentDisplayConfig inteligentDisplayConfig) {
    
    this.inteligentDisplayConfig = inteligentDisplayConfig;
    return this;
  }

   /**
   * Get inteligentDisplayConfig
   * @return inteligentDisplayConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InteligentDisplayConfig getInteligentDisplayConfig() {
    return inteligentDisplayConfig;
  }


  public void setInteligentDisplayConfig(InteligentDisplayConfig inteligentDisplayConfig) {
    this.inteligentDisplayConfig = inteligentDisplayConfig;
  }


  public InteligentVoucher inteligentItemInfo(InteligentItemInfo inteligentItemInfo) {
    
    this.inteligentItemInfo = inteligentItemInfo;
    return this;
  }

   /**
   * Get inteligentItemInfo
   * @return inteligentItemInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InteligentItemInfo getInteligentItemInfo() {
    return inteligentItemInfo;
  }


  public void setInteligentItemInfo(InteligentItemInfo inteligentItemInfo) {
    this.inteligentItemInfo = inteligentItemInfo;
  }


  public InteligentVoucher inteligentUseRule(InteligentUseRule inteligentUseRule) {
    
    this.inteligentUseRule = inteligentUseRule;
    return this;
  }

   /**
   * Get inteligentUseRule
   * @return inteligentUseRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InteligentUseRule getInteligentUseRule() {
    return inteligentUseRule;
  }


  public void setInteligentUseRule(InteligentUseRule inteligentUseRule) {
    this.inteligentUseRule = inteligentUseRule;
  }


  public InteligentVoucher logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * 券LOGO文件ID，调用图片上传接口alipay.offline.material.image.upload获得
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC", value = "券LOGO文件ID，调用图片上传接口alipay.offline.material.image.upload获得")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public InteligentVoucher maxAmount(String maxAmount) {
    
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * 最高优惠金额，单位元  指用券最高可以优惠的金额  必须为合法金额类型字符串仅当券类型为折扣券（RATE），每满减券（PER_FULL_CUT）有效
   * @return maxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "最高优惠金额，单位元  指用券最高可以优惠的金额  必须为合法金额类型字符串仅当券类型为折扣券（RATE），每满减券（PER_FULL_CUT）有效")

  public String getMaxAmount() {
    return maxAmount;
  }


  public void setMaxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
  }


  public InteligentVoucher multiUseMode(String multiUseMode) {
    
    this.multiUseMode = multiUseMode;
    return this;
  }

   /**
   * 券叠加的属性，  仅全场券可设置该选项；  NO_MULTI:不可与其他全场券和单品券叠加;  MULTI_USE_WITH_SINGLE:  该全场优惠和单品优惠的叠加  ；MULTI_USE_WITH_OTHE  RS:该全场优惠和其他所有优惠都可以叠加
   * @return multiUseMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NO_MULTI", value = "券叠加的属性，  仅全场券可设置该选项；  NO_MULTI:不可与其他全场券和单品券叠加;  MULTI_USE_WITH_SINGLE:  该全场优惠和单品优惠的叠加  ；MULTI_USE_WITH_OTHE  RS:该全场优惠和其他所有优惠都可以叠加")

  public String getMultiUseMode() {
    return multiUseMode;
  }


  public void setMultiUseMode(String multiUseMode) {
    this.multiUseMode = multiUseMode;
  }


  public InteligentVoucher name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 券名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5元代金券", value = "券名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InteligentVoucher rate(String rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * 折扣率  仅当券类型为折扣券时有效  有效折扣率取值范围0.11-0.99  仅允许保留小数点后两位
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.8", value = "折扣率  仅当券类型为折扣券时有效  有效折扣率取值范围0.11-0.99  仅允许保留小数点后两位")

  public String getRate() {
    return rate;
  }


  public void setRate(String rate) {
    this.rate = rate;
  }


  public InteligentVoucher relativeTime(String relativeTime) {
    
    this.relativeTime = relativeTime;
    return this;
  }

   /**
   * 券相对有效期，单位天  仅在券有效期类型为相对有效期时生效  如，设5表示领券领取后5日内有效
   * @return relativeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "券相对有效期，单位天  仅在券有效期类型为相对有效期时生效  如，设5表示领券领取后5日内有效")

  public String getRelativeTime() {
    return relativeTime;
  }


  public void setRelativeTime(String relativeTime) {
    this.relativeTime = relativeTime;
  }


  public InteligentVoucher roundingRule(String roundingRule) {
    
    this.roundingRule = roundingRule;
    return this;
  }

   /**
   * 券核销时，抹零方式，目前支持：  NOT_AUTO_ROUNDING:不自动抹零  AUTO_ROUNDING_YUAN:自动抹零到元  AUTO_ROUNDING_JIAO:自动抹零到角  ROUNDING_UP_YUAN:四舍五入到元  ROUNDING_UP_JIAO:四舍五入到角
   * @return roundingRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NOT_AUTO_ROUNDING", value = "券核销时，抹零方式，目前支持：  NOT_AUTO_ROUNDING:不自动抹零  AUTO_ROUNDING_YUAN:自动抹零到元  AUTO_ROUNDING_JIAO:自动抹零到角  ROUNDING_UP_YUAN:四舍五入到元  ROUNDING_UP_JIAO:四舍五入到角")

  public String getRoundingRule() {
    return roundingRule;
  }


  public void setRoundingRule(String roundingRule) {
    this.roundingRule = roundingRule;
  }


  public InteligentVoucher startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 券有效期的开始时间  仅在券有效期类型为绝对有效期时生效
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-05-01 00:00:00", value = "券有效期的开始时间  仅在券有效期类型为绝对有效期时生效")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public InteligentVoucher type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 券类型，目前支持以下类型：  MONEY：代金券；  PER_FULL_CUT：每满减券
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MONEY", value = "券类型，目前支持以下类型：  MONEY：代金券；  PER_FULL_CUT：每满减券")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public InteligentVoucher useInstructions(List<String> useInstructions) {
    
    this.useInstructions = useInstructions;
    return this;
  }

  public InteligentVoucher addUseInstructionsItem(String useInstructionsItem) {
    if (this.useInstructions == null) {
      this.useInstructions = new ArrayList<>();
    }
    this.useInstructions.add(useInstructionsItem);
    return this;
  }

   /**
   * 券的使用说明  使用须知最多6条，且每条最多100字
   * @return useInstructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "券的使用说明", value = "券的使用说明  使用须知最多6条，且每条最多100字")

  public List<String> getUseInstructions() {
    return useInstructions;
  }


  public void setUseInstructions(List<String> useInstructions) {
    this.useInstructions = useInstructions;
  }


  public InteligentVoucher validateType(String validateType) {
    
    this.validateType = validateType;
    return this;
  }

   /**
   * 券有效期类型，目前支持以下类型：  RELATIVE：相对有效期  FIXED：绝对有效期
   * @return validateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FIXED", value = "券有效期类型，目前支持以下类型：  RELATIVE：相对有效期  FIXED：绝对有效期")

  public String getValidateType() {
    return validateType;
  }


  public void setValidateType(String validateType) {
    this.validateType = validateType;
  }


  public InteligentVoucher verifyMode(String verifyMode) {
    
    this.verifyMode = verifyMode;
    return this;
  }

   /**
   * 该字段仅在兑换券条件下(即券类型为EXCHANGE)，用于设置兑换券的核销方式  USER_CLICK:用户自己点击券上的按钮核销  MERCHANT_SCAN：商户通过APP扫码核销  其他情况下此字段为空
   * @return verifyMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MERCHANT_SCAN", value = "该字段仅在兑换券条件下(即券类型为EXCHANGE)，用于设置兑换券的核销方式  USER_CLICK:用户自己点击券上的按钮核销  MERCHANT_SCAN：商户通过APP扫码核销  其他情况下此字段为空")

  public String getVerifyMode() {
    return verifyMode;
  }


  public void setVerifyMode(String verifyMode) {
    this.verifyMode = verifyMode;
  }


  public InteligentVoucher voucherImg(String voucherImg) {
    
    this.voucherImg = voucherImg;
    return this;
  }

   /**
   * 券图片文件ID,调用上传图片接口alipay.offline.material.image.upload获得
   * @return voucherImg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC", value = "券图片文件ID,调用上传图片接口alipay.offline.material.image.upload获得")

  public String getVoucherImg() {
    return voucherImg;
  }


  public void setVoucherImg(String voucherImg) {
    this.voucherImg = voucherImg;
  }


  public InteligentVoucher voucherNote(String voucherNote) {
    
    this.voucherNote = voucherNote;
    return this;
  }

   /**
   * 券的备注    用于收银系统识别指定券使用；如备注中传入“123”，券发出后核销时将在当面付接口将该值传回，供收银系统识别
   * @return voucherNote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "券的备注", value = "券的备注    用于收银系统识别指定券使用；如备注中传入“123”，券发出后核销时将在当面付接口将该值传回，供收银系统识别")

  public String getVoucherNote() {
    return voucherNote;
  }


  public void setVoucherNote(String voucherNote) {
    this.voucherNote = voucherNote;
  }


  public InteligentVoucher worthValue(String worthValue) {
    
    this.worthValue = worthValue;
    return this;
  }

   /**
   * 券面额，单位元必须为合法金额类型字符串券类型为代金券（MONEY）、减至券（REDUCETO）、每满减券（PER_FULL_CUT）时必填  如：  代金券：10元代金券中的10为券面额；  每满减券：毎满100减10元，其中的10为券面额；  减至券：单品原价100，现价10元，其中10为券面额，单品减至券的券面额必须低于单品原价
   * @return worthValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "券面额，单位元必须为合法金额类型字符串券类型为代金券（MONEY）、减至券（REDUCETO）、每满减券（PER_FULL_CUT）时必填  如：  代金券：10元代金券中的10为券面额；  每满减券：毎满100减10元，其中的10为券面额；  减至券：单品原价100，现价10元，其中10为券面额，单品减至券的券面额必须低于单品原价")

  public String getWorthValue() {
    return worthValue;
  }


  public void setWorthValue(String worthValue) {
    this.worthValue = worthValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteligentVoucher inteligentVoucher = (InteligentVoucher) o;
    return Objects.equals(this.brandName, inteligentVoucher.brandName) &&
        Objects.equals(this.desc, inteligentVoucher.desc) &&
        Objects.equals(this.donateFlag, inteligentVoucher.donateFlag) &&
        Objects.equals(this.effectType, inteligentVoucher.effectType) &&
        Objects.equals(this.endTime, inteligentVoucher.endTime) &&
        Objects.equals(this.extInfo, inteligentVoucher.extInfo) &&
        Objects.equals(this.inteligentClauseTerms, inteligentVoucher.inteligentClauseTerms) &&
        Objects.equals(this.inteligentDelayInfo, inteligentVoucher.inteligentDelayInfo) &&
        Objects.equals(this.inteligentDescDetailList, inteligentVoucher.inteligentDescDetailList) &&
        Objects.equals(this.inteligentDisplayConfig, inteligentVoucher.inteligentDisplayConfig) &&
        Objects.equals(this.inteligentItemInfo, inteligentVoucher.inteligentItemInfo) &&
        Objects.equals(this.inteligentUseRule, inteligentVoucher.inteligentUseRule) &&
        Objects.equals(this.logo, inteligentVoucher.logo) &&
        Objects.equals(this.maxAmount, inteligentVoucher.maxAmount) &&
        Objects.equals(this.multiUseMode, inteligentVoucher.multiUseMode) &&
        Objects.equals(this.name, inteligentVoucher.name) &&
        Objects.equals(this.rate, inteligentVoucher.rate) &&
        Objects.equals(this.relativeTime, inteligentVoucher.relativeTime) &&
        Objects.equals(this.roundingRule, inteligentVoucher.roundingRule) &&
        Objects.equals(this.startTime, inteligentVoucher.startTime) &&
        Objects.equals(this.type, inteligentVoucher.type) &&
        Objects.equals(this.useInstructions, inteligentVoucher.useInstructions) &&
        Objects.equals(this.validateType, inteligentVoucher.validateType) &&
        Objects.equals(this.verifyMode, inteligentVoucher.verifyMode) &&
        Objects.equals(this.voucherImg, inteligentVoucher.voucherImg) &&
        Objects.equals(this.voucherNote, inteligentVoucher.voucherNote) &&
        Objects.equals(this.worthValue, inteligentVoucher.worthValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, desc, donateFlag, effectType, endTime, extInfo, inteligentClauseTerms, inteligentDelayInfo, inteligentDescDetailList, inteligentDisplayConfig, inteligentItemInfo, inteligentUseRule, logo, maxAmount, multiUseMode, name, rate, relativeTime, roundingRule, startTime, type, useInstructions, validateType, verifyMode, voucherImg, voucherNote, worthValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteligentVoucher {\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    donateFlag: ").append(toIndentedString(donateFlag)).append("\n");
    sb.append("    effectType: ").append(toIndentedString(effectType)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    inteligentClauseTerms: ").append(toIndentedString(inteligentClauseTerms)).append("\n");
    sb.append("    inteligentDelayInfo: ").append(toIndentedString(inteligentDelayInfo)).append("\n");
    sb.append("    inteligentDescDetailList: ").append(toIndentedString(inteligentDescDetailList)).append("\n");
    sb.append("    inteligentDisplayConfig: ").append(toIndentedString(inteligentDisplayConfig)).append("\n");
    sb.append("    inteligentItemInfo: ").append(toIndentedString(inteligentItemInfo)).append("\n");
    sb.append("    inteligentUseRule: ").append(toIndentedString(inteligentUseRule)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    multiUseMode: ").append(toIndentedString(multiUseMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    relativeTime: ").append(toIndentedString(relativeTime)).append("\n");
    sb.append("    roundingRule: ").append(toIndentedString(roundingRule)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    useInstructions: ").append(toIndentedString(useInstructions)).append("\n");
    sb.append("    validateType: ").append(toIndentedString(validateType)).append("\n");
    sb.append("    verifyMode: ").append(toIndentedString(verifyMode)).append("\n");
    sb.append("    voucherImg: ").append(toIndentedString(voucherImg)).append("\n");
    sb.append("    voucherNote: ").append(toIndentedString(voucherNote)).append("\n");
    sb.append("    worthValue: ").append(toIndentedString(worthValue)).append("\n");
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
    openapiFields.add("brand_name");
    openapiFields.add("desc");
    openapiFields.add("donate_flag");
    openapiFields.add("effect_type");
    openapiFields.add("end_time");
    openapiFields.add("ext_info");
    openapiFields.add("inteligent_clause_terms");
    openapiFields.add("inteligent_delay_info");
    openapiFields.add("inteligent_desc_detail_list");
    openapiFields.add("inteligent_display_config");
    openapiFields.add("inteligent_item_info");
    openapiFields.add("inteligent_use_rule");
    openapiFields.add("logo");
    openapiFields.add("max_amount");
    openapiFields.add("multi_use_mode");
    openapiFields.add("name");
    openapiFields.add("rate");
    openapiFields.add("relative_time");
    openapiFields.add("rounding_rule");
    openapiFields.add("start_time");
    openapiFields.add("type");
    openapiFields.add("use_instructions");
    openapiFields.add("validate_type");
    openapiFields.add("verify_mode");
    openapiFields.add("voucher_img");
    openapiFields.add("voucher_note");
    openapiFields.add("worth_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteligentVoucher
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InteligentVoucher.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteligentVoucher is not found in the empty JSON string", InteligentVoucher.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteligentVoucher.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteligentVoucher` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("brand_name") != null && !jsonObj.get("brand_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_name").toString()));
      }
      if (jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      if (jsonObj.get("donate_flag") != null && !jsonObj.get("donate_flag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `donate_flag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("donate_flag").toString()));
      }
      if (jsonObj.get("effect_type") != null && !jsonObj.get("effect_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effect_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effect_type").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      JsonArray jsonArrayinteligentClauseTerms = jsonObj.getAsJsonArray("inteligent_clause_terms");
      if (jsonArrayinteligentClauseTerms != null) {
        // ensure the json data is an array
        if (!jsonObj.get("inteligent_clause_terms").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `inteligent_clause_terms` to be an array in the JSON string but got `%s`", jsonObj.get("inteligent_clause_terms").toString()));
        }

        // validate the optional field `inteligent_clause_terms` (array)
        for (int i = 0; i < jsonArrayinteligentClauseTerms.size(); i++) {
          InteligentClauseTerm.validateJsonObject(jsonArrayinteligentClauseTerms.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `inteligent_delay_info`
      if (jsonObj.getAsJsonObject("inteligent_delay_info") != null) {
        InteligentDelayInfo.validateJsonObject(jsonObj.getAsJsonObject("inteligent_delay_info"));
      }
      JsonArray jsonArrayinteligentDescDetailList = jsonObj.getAsJsonArray("inteligent_desc_detail_list");
      if (jsonArrayinteligentDescDetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("inteligent_desc_detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `inteligent_desc_detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("inteligent_desc_detail_list").toString()));
        }

        // validate the optional field `inteligent_desc_detail_list` (array)
        for (int i = 0; i < jsonArrayinteligentDescDetailList.size(); i++) {
          InteligentVoucherDescDetail.validateJsonObject(jsonArrayinteligentDescDetailList.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `inteligent_display_config`
      if (jsonObj.getAsJsonObject("inteligent_display_config") != null) {
        InteligentDisplayConfig.validateJsonObject(jsonObj.getAsJsonObject("inteligent_display_config"));
      }
      // validate the optional field `inteligent_item_info`
      if (jsonObj.getAsJsonObject("inteligent_item_info") != null) {
        InteligentItemInfo.validateJsonObject(jsonObj.getAsJsonObject("inteligent_item_info"));
      }
      // validate the optional field `inteligent_use_rule`
      if (jsonObj.getAsJsonObject("inteligent_use_rule") != null) {
        InteligentUseRule.validateJsonObject(jsonObj.getAsJsonObject("inteligent_use_rule"));
      }
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if (jsonObj.get("max_amount") != null && !jsonObj.get("max_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_amount").toString()));
      }
      if (jsonObj.get("multi_use_mode") != null && !jsonObj.get("multi_use_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `multi_use_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("multi_use_mode").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("rate") != null && !jsonObj.get("rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rate").toString()));
      }
      if (jsonObj.get("relative_time") != null && !jsonObj.get("relative_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relative_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relative_time").toString()));
      }
      if (jsonObj.get("rounding_rule") != null && !jsonObj.get("rounding_rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rounding_rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rounding_rule").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("use_instructions") != null && !jsonObj.get("use_instructions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `use_instructions` to be an array in the JSON string but got `%s`", jsonObj.get("use_instructions").toString()));
      }
      if (jsonObj.get("validate_type") != null && !jsonObj.get("validate_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validate_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validate_type").toString()));
      }
      if (jsonObj.get("verify_mode") != null && !jsonObj.get("verify_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verify_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verify_mode").toString()));
      }
      if (jsonObj.get("voucher_img") != null && !jsonObj.get("voucher_img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_img").toString()));
      }
      if (jsonObj.get("voucher_note") != null && !jsonObj.get("voucher_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_note").toString()));
      }
      if (jsonObj.get("worth_value") != null && !jsonObj.get("worth_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worth_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worth_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteligentVoucher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteligentVoucher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteligentVoucher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteligentVoucher.class));

       return (TypeAdapter<T>) new TypeAdapter<InteligentVoucher>() {
           @Override
           public void write(JsonWriter out, InteligentVoucher value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteligentVoucher read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteligentVoucher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteligentVoucher
  * @throws IOException if the JSON string is invalid with respect to InteligentVoucher
  */
  public static InteligentVoucher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteligentVoucher.class);
  }

 /**
  * Convert an instance of InteligentVoucher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

