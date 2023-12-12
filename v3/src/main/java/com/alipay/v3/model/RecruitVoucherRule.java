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
 * RecruitVoucherRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecruitVoucherRule {
  public static final String SERIALIZED_NAME_AMOUNT_MAX = "amount_max";
  @SerializedName(SERIALIZED_NAME_AMOUNT_MAX)
  private String amountMax;

  public static final String SERIALIZED_NAME_AMOUNT_MIN = "amount_min";
  @SerializedName(SERIALIZED_NAME_AMOUNT_MIN)
  private String amountMin;

  public static final String SERIALIZED_NAME_DENOMINATION_PERCENT_MAX = "denomination_percent_max";
  @SerializedName(SERIALIZED_NAME_DENOMINATION_PERCENT_MAX)
  private String denominationPercentMax;

  public static final String SERIALIZED_NAME_DENOMINATION_PERCENT_MIN = "denomination_percent_min";
  @SerializedName(SERIALIZED_NAME_DENOMINATION_PERCENT_MIN)
  private String denominationPercentMin;

  public static final String SERIALIZED_NAME_FLOOR_AMOUNT_MAX = "floor_amount_max";
  @SerializedName(SERIALIZED_NAME_FLOOR_AMOUNT_MAX)
  private String floorAmountMax;

  public static final String SERIALIZED_NAME_FLOOR_AMOUNT_MIN = "floor_amount_min";
  @SerializedName(SERIALIZED_NAME_FLOOR_AMOUNT_MIN)
  private String floorAmountMin;

  public static final String SERIALIZED_NAME_ORIGIN_AMOUNT_MAX = "origin_amount_max";
  @SerializedName(SERIALIZED_NAME_ORIGIN_AMOUNT_MAX)
  private String originAmountMax;

  public static final String SERIALIZED_NAME_ORIGIN_AMOUNT_MIN = "origin_amount_min";
  @SerializedName(SERIALIZED_NAME_ORIGIN_AMOUNT_MIN)
  private String originAmountMin;

  public static final String SERIALIZED_NAME_PUBLISH_END_TIME_MAX = "publish_end_time_max";
  @SerializedName(SERIALIZED_NAME_PUBLISH_END_TIME_MAX)
  private String publishEndTimeMax;

  public static final String SERIALIZED_NAME_PUBLISH_END_TIME_MIN = "publish_end_time_min";
  @SerializedName(SERIALIZED_NAME_PUBLISH_END_TIME_MIN)
  private String publishEndTimeMin;

  public static final String SERIALIZED_NAME_PUBLISH_START_TIME_MAX = "publish_start_time_max";
  @SerializedName(SERIALIZED_NAME_PUBLISH_START_TIME_MAX)
  private String publishStartTimeMax;

  public static final String SERIALIZED_NAME_PUBLISH_START_TIME_MIN = "publish_start_time_min";
  @SerializedName(SERIALIZED_NAME_PUBLISH_START_TIME_MIN)
  private String publishStartTimeMin;

  public static final String SERIALIZED_NAME_REFUND_TYPE = "refund_type";
  @SerializedName(SERIALIZED_NAME_REFUND_TYPE)
  private List<String> refundType = null;

  public static final String SERIALIZED_NAME_SALE_AMOUNT_MAX = "sale_amount_max";
  @SerializedName(SERIALIZED_NAME_SALE_AMOUNT_MAX)
  private String saleAmountMax;

  public static final String SERIALIZED_NAME_SALE_AMOUNT_MIN = "sale_amount_min";
  @SerializedName(SERIALIZED_NAME_SALE_AMOUNT_MIN)
  private String saleAmountMin;

  public static final String SERIALIZED_NAME_USE_CHANNEL = "use_channel";
  @SerializedName(SERIALIZED_NAME_USE_CHANNEL)
  private List<String> useChannel = null;

  public static final String SERIALIZED_NAME_VALID_DAYS_AFTER_RECEIVE_MIN = "valid_days_after_receive_min";
  @SerializedName(SERIALIZED_NAME_VALID_DAYS_AFTER_RECEIVE_MIN)
  private Integer validDaysAfterReceiveMin;

  public static final String SERIALIZED_NAME_VOUCHER_ACTIVITY_TYPE = "voucher_activity_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_ACTIVITY_TYPE)
  private String voucherActivityType;

  public static final String SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER_MAX = "voucher_quantity_limit_per_user_max";
  @SerializedName(SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER_MAX)
  private Integer voucherQuantityLimitPerUserMax;

  public static final String SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER_MIN = "voucher_quantity_limit_per_user_min";
  @SerializedName(SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER_MIN)
  private Integer voucherQuantityLimitPerUserMin;

  public static final String SERIALIZED_NAME_VOUCHER_QUANTITY_MAX = "voucher_quantity_max";
  @SerializedName(SERIALIZED_NAME_VOUCHER_QUANTITY_MAX)
  private Integer voucherQuantityMax;

  public static final String SERIALIZED_NAME_VOUCHER_QUANTITY_MIN = "voucher_quantity_min";
  @SerializedName(SERIALIZED_NAME_VOUCHER_QUANTITY_MIN)
  private Integer voucherQuantityMin;

  public static final String SERIALIZED_NAME_VOUCHER_VALID_BEGIN_TIME_MIN = "voucher_valid_begin_time_min";
  @SerializedName(SERIALIZED_NAME_VOUCHER_VALID_BEGIN_TIME_MIN)
  private String voucherValidBeginTimeMin;

  public static final String SERIALIZED_NAME_VOUCHER_VALID_END_TIME_MAX = "voucher_valid_end_time_max";
  @SerializedName(SERIALIZED_NAME_VOUCHER_VALID_END_TIME_MAX)
  private String voucherValidEndTimeMax;

  public RecruitVoucherRule() { 
  }

  public RecruitVoucherRule amountMax(String amountMax) {
    
    this.amountMax = amountMax;
    return this;
  }

   /**
   * 券面额（每张代金券可以抵扣的金额）的最大值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。
   * @return amountMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15.00", value = "券面额（每张代金券可以抵扣的金额）的最大值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。")

  public String getAmountMax() {
    return amountMax;
  }


  public void setAmountMax(String amountMax) {
    this.amountMax = amountMax;
  }


  public RecruitVoucherRule amountMin(String amountMin) {
    
    this.amountMin = amountMin;
    return this;
  }

   /**
   * 券面额（每张代金券可以抵扣的金额）的最小值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。
   * @return amountMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12.00", value = "券面额（每张代金券可以抵扣的金额）的最小值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。")

  public String getAmountMin() {
    return amountMin;
  }


  public void setAmountMin(String amountMin) {
    this.amountMin = amountMin;
  }


  public RecruitVoucherRule denominationPercentMax(String denominationPercentMax) {
    
    this.denominationPercentMax = denominationPercentMax;
    return this;
  }

   /**
   * 券优惠比例的最大值。20代表优惠比例最多是20%。券优惠券比例&#x3D;券优惠面额/门槛金额。 浮点类型，取值范围为[1,100]，左右均是闭区间，小数点以后最多保留两位。 该字段为空时表示不限制。
   * @return denominationPercentMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "券优惠比例的最大值。20代表优惠比例最多是20%。券优惠券比例=券优惠面额/门槛金额。 浮点类型，取值范围为[1,100]，左右均是闭区间，小数点以后最多保留两位。 该字段为空时表示不限制。")

  public String getDenominationPercentMax() {
    return denominationPercentMax;
  }


  public void setDenominationPercentMax(String denominationPercentMax) {
    this.denominationPercentMax = denominationPercentMax;
  }


  public RecruitVoucherRule denominationPercentMin(String denominationPercentMin) {
    
    this.denominationPercentMin = denominationPercentMin;
    return this;
  }

   /**
   * 券优惠比例的最小值。10代表优惠比例最少是10%。券优惠券比例&#x3D;券优惠面额/门槛金额。 浮点类型，取值范围为[1,100]，左右均是闭区间，小数点以后最多保留两位。 该字段为空时表示不限制。
   * @return denominationPercentMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "券优惠比例的最小值。10代表优惠比例最少是10%。券优惠券比例=券优惠面额/门槛金额。 浮点类型，取值范围为[1,100]，左右均是闭区间，小数点以后最多保留两位。 该字段为空时表示不限制。")

  public String getDenominationPercentMin() {
    return denominationPercentMin;
  }


  public void setDenominationPercentMin(String denominationPercentMin) {
    this.denominationPercentMin = denominationPercentMin;
  }


  public RecruitVoucherRule floorAmountMax(String floorAmountMax) {
    
    this.floorAmountMax = floorAmountMax;
    return this;
  }

   /**
   * 券门槛金额的最大值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。
   * @return floorAmountMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20.00", value = "券门槛金额的最大值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。")

  public String getFloorAmountMax() {
    return floorAmountMax;
  }


  public void setFloorAmountMax(String floorAmountMax) {
    this.floorAmountMax = floorAmountMax;
  }


  public RecruitVoucherRule floorAmountMin(String floorAmountMin) {
    
    this.floorAmountMin = floorAmountMin;
    return this;
  }

   /**
   * 券门槛金额的最小值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。
   * @return floorAmountMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "券门槛金额的最小值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。")

  public String getFloorAmountMin() {
    return floorAmountMin;
  }


  public void setFloorAmountMin(String floorAmountMin) {
    this.floorAmountMin = floorAmountMin;
  }


  public RecruitVoucherRule originAmountMax(String originAmountMax) {
    
    this.originAmountMax = originAmountMax;
    return this;
  }

   /**
   * 券原价的最大值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。
   * @return originAmountMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20.00", value = "券原价的最大值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。")

  public String getOriginAmountMax() {
    return originAmountMax;
  }


  public void setOriginAmountMax(String originAmountMax) {
    this.originAmountMax = originAmountMax;
  }


  public RecruitVoucherRule originAmountMin(String originAmountMin) {
    
    this.originAmountMin = originAmountMin;
    return this;
  }

   /**
   * 券原价的最小值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。
   * @return originAmountMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "券原价的最小值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。")

  public String getOriginAmountMin() {
    return originAmountMin;
  }


  public void setOriginAmountMin(String originAmountMin) {
    this.originAmountMin = originAmountMin;
  }


  public RecruitVoucherRule publishEndTimeMax(String publishEndTimeMax) {
    
    this.publishEndTimeMax = publishEndTimeMax;
    return this;
  }

   /**
   * 券发放结束时间的最大值。 格式为：yyyy-MM-dd HH:mm:ss 该字段为空时表示不限制。
   * @return publishEndTimeMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-13 23:59:59", value = "券发放结束时间的最大值。 格式为：yyyy-MM-dd HH:mm:ss 该字段为空时表示不限制。")

  public String getPublishEndTimeMax() {
    return publishEndTimeMax;
  }


  public void setPublishEndTimeMax(String publishEndTimeMax) {
    this.publishEndTimeMax = publishEndTimeMax;
  }


  public RecruitVoucherRule publishEndTimeMin(String publishEndTimeMin) {
    
    this.publishEndTimeMin = publishEndTimeMin;
    return this;
  }

   /**
   * 券发放结束时间的最小值。 格式为：yyyy-MM-dd HH:mm:ss 该字段为空时表示不限制。
   * @return publishEndTimeMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-10 00:00:00", value = "券发放结束时间的最小值。 格式为：yyyy-MM-dd HH:mm:ss 该字段为空时表示不限制。")

  public String getPublishEndTimeMin() {
    return publishEndTimeMin;
  }


  public void setPublishEndTimeMin(String publishEndTimeMin) {
    this.publishEndTimeMin = publishEndTimeMin;
  }


  public RecruitVoucherRule publishStartTimeMax(String publishStartTimeMax) {
    
    this.publishStartTimeMax = publishStartTimeMax;
    return this;
  }

   /**
   * 券发放开始时间的最大值。 格式为：yyyy-MM-dd HH:mm:ss 该字段为空时表示不限制。
   * @return publishStartTimeMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-13 23:59:59", value = "券发放开始时间的最大值。 格式为：yyyy-MM-dd HH:mm:ss 该字段为空时表示不限制。")

  public String getPublishStartTimeMax() {
    return publishStartTimeMax;
  }


  public void setPublishStartTimeMax(String publishStartTimeMax) {
    this.publishStartTimeMax = publishStartTimeMax;
  }


  public RecruitVoucherRule publishStartTimeMin(String publishStartTimeMin) {
    
    this.publishStartTimeMin = publishStartTimeMin;
    return this;
  }

   /**
   * 券发放开始时间的最小值。 格式为：yyyy-MM-dd HH:mm:ss 该字段为空时表示不限制。
   * @return publishStartTimeMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-10 00:00:00", value = "券发放开始时间的最小值。 格式为：yyyy-MM-dd HH:mm:ss 该字段为空时表示不限制。")

  public String getPublishStartTimeMin() {
    return publishStartTimeMin;
  }


  public void setPublishStartTimeMin(String publishStartTimeMin) {
    this.publishStartTimeMin = publishStartTimeMin;
  }


  public RecruitVoucherRule refundType(List<String> refundType) {
    
    this.refundType = refundType;
    return this;
  }

  public RecruitVoucherRule addRefundTypeItem(String refundTypeItem) {
    if (this.refundType == null) {
      this.refundType = new ArrayList<>();
    }
    this.refundType.add(refundTypeItem);
    return this;
  }

   /**
   * 退券类型要求，列表，总共有两种类型： 过期退OVERDUE_REFUND 随时退CAN_REFUND 该字段为空时表示不限制。
   * @return refundType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"CAN_REFUND\",\"OVERDUE_REFUND\"]", value = "退券类型要求，列表，总共有两种类型： 过期退OVERDUE_REFUND 随时退CAN_REFUND 该字段为空时表示不限制。")

  public List<String> getRefundType() {
    return refundType;
  }


  public void setRefundType(List<String> refundType) {
    this.refundType = refundType;
  }


  public RecruitVoucherRule saleAmountMax(String saleAmountMax) {
    
    this.saleAmountMax = saleAmountMax;
    return this;
  }

   /**
   * 用户购买优惠券需要支付的金额的最大值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。
   * @return saleAmountMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20.00", value = "用户购买优惠券需要支付的金额的最大值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。")

  public String getSaleAmountMax() {
    return saleAmountMax;
  }


  public void setSaleAmountMax(String saleAmountMax) {
    this.saleAmountMax = saleAmountMax;
  }


  public RecruitVoucherRule saleAmountMin(String saleAmountMin) {
    
    this.saleAmountMin = saleAmountMin;
    return this;
  }

   /**
   * 用户购买优惠券需要支付的金额的最小值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。
   * @return saleAmountMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "用户购买优惠券需要支付的金额的最小值。 币种为人民币，单位为元。小数点以后最多保留两位。 该字段为空时表示不限制。")

  public String getSaleAmountMin() {
    return saleAmountMin;
  }


  public void setSaleAmountMin(String saleAmountMin) {
    this.saleAmountMin = saleAmountMin;
  }


  public RecruitVoucherRule useChannel(List<String> useChannel) {
    
    this.useChannel = useChannel;
    return this;
  }

  public RecruitVoucherRule addUseChannelItem(String useChannelItem) {
    if (this.useChannel == null) {
      this.useChannel = new ArrayList<>();
    }
    this.useChannel.add(useChannelItem);
    return this;
  }

   /**
   * 券核销渠道要求，列表，总共有两个渠道： 门店SHOP 小程序MINI_APP 该字段为空时表示不限制。
   * @return useChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[ \"SHOP\", \"MINI_APP\" ]", value = "券核销渠道要求，列表，总共有两个渠道： 门店SHOP 小程序MINI_APP 该字段为空时表示不限制。")

  public List<String> getUseChannel() {
    return useChannel;
  }


  public void setUseChannel(List<String> useChannel) {
    this.useChannel = useChannel;
  }


  public RecruitVoucherRule validDaysAfterReceiveMin(Integer validDaysAfterReceiveMin) {
    
    this.validDaysAfterReceiveMin = validDaysAfterReceiveMin;
    return this;
  }

   /**
   * 券生效后至少N天内可以使用。比如：valid_days_after_receive_min&#x3D;20代表 券生效后至少20天内可以使用。 该字段为空时表示不限制。
   * @return validDaysAfterReceiveMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "券生效后至少N天内可以使用。比如：valid_days_after_receive_min=20代表 券生效后至少20天内可以使用。 该字段为空时表示不限制。")

  public Integer getValidDaysAfterReceiveMin() {
    return validDaysAfterReceiveMin;
  }


  public void setValidDaysAfterReceiveMin(Integer validDaysAfterReceiveMin) {
    this.validDaysAfterReceiveMin = validDaysAfterReceiveMin;
  }


  public RecruitVoucherRule voucherActivityType(String voucherActivityType) {
    
    this.voucherActivityType = voucherActivityType;
    return this;
  }

   /**
   * 券活动类型。支持七种商家券类型和两种支付券类型。  枚举值： 商家券类型： ALL_FIX_ORDER_VOUCHER 全场满减券； ITEM_FIX_ORDER_VOUCHER 单品满减券； ALL_DISCOUNT_ORDER_VOUCHER 全场折扣券； ITEM_DISCOUNT_ORDER_VOUCHER 单品折扣券； ITEM_SPE_ORDER_VOUCHER 单品特价券； EXCHANGE_GROUP_BUY_ORDER_VOUCHER 兑换团购券； EXCHANGE_FIX_ORDER_VOUCHER 兑换代金券；  支付券类型： ALL_FIX_VOUCHER 全场满减券； ITEM_FIX_VOUCHER 单品满减券；  创建商家券参考https://opendocs.alipay.com/apis/01xm17 创建支付券参考https://opendocs.alipay.com/pre-apis/027185（仅供受邀用户使用） 不同的创建券的参数创建出不同类型的券：  1. 根据voucher_type区分满减券、折扣券、特价券、兑换券  2. 根据goods_name是否为空区分单品券、全场券（当voucher_type为满减券、折扣券、特价券）  3. 根据voucher_use_rule.exchange_voucher.biz_type区分团购券、代金券（当voucher_type为兑换券）
   * @return voucherActivityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ITEM_FIX_ORDER_VOUCHER", value = "券活动类型。支持七种商家券类型和两种支付券类型。  枚举值： 商家券类型： ALL_FIX_ORDER_VOUCHER 全场满减券； ITEM_FIX_ORDER_VOUCHER 单品满减券； ALL_DISCOUNT_ORDER_VOUCHER 全场折扣券； ITEM_DISCOUNT_ORDER_VOUCHER 单品折扣券； ITEM_SPE_ORDER_VOUCHER 单品特价券； EXCHANGE_GROUP_BUY_ORDER_VOUCHER 兑换团购券； EXCHANGE_FIX_ORDER_VOUCHER 兑换代金券；  支付券类型： ALL_FIX_VOUCHER 全场满减券； ITEM_FIX_VOUCHER 单品满减券；  创建商家券参考https://opendocs.alipay.com/apis/01xm17 创建支付券参考https://opendocs.alipay.com/pre-apis/027185（仅供受邀用户使用） 不同的创建券的参数创建出不同类型的券：  1. 根据voucher_type区分满减券、折扣券、特价券、兑换券  2. 根据goods_name是否为空区分单品券、全场券（当voucher_type为满减券、折扣券、特价券）  3. 根据voucher_use_rule.exchange_voucher.biz_type区分团购券、代金券（当voucher_type为兑换券）")

  public String getVoucherActivityType() {
    return voucherActivityType;
  }


  public void setVoucherActivityType(String voucherActivityType) {
    this.voucherActivityType = voucherActivityType;
  }


  public RecruitVoucherRule voucherQuantityLimitPerUserMax(Integer voucherQuantityLimitPerUserMax) {
    
    this.voucherQuantityLimitPerUserMax = voucherQuantityLimitPerUserMax;
    return this;
  }

   /**
   * 每人领取限制的最大值。 默认按照支付宝uid进行领取限制。 该字段为空时表示不限制。
   * @return voucherQuantityLimitPerUserMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "每人领取限制的最大值。 默认按照支付宝uid进行领取限制。 该字段为空时表示不限制。")

  public Integer getVoucherQuantityLimitPerUserMax() {
    return voucherQuantityLimitPerUserMax;
  }


  public void setVoucherQuantityLimitPerUserMax(Integer voucherQuantityLimitPerUserMax) {
    this.voucherQuantityLimitPerUserMax = voucherQuantityLimitPerUserMax;
  }


  public RecruitVoucherRule voucherQuantityLimitPerUserMin(Integer voucherQuantityLimitPerUserMin) {
    
    this.voucherQuantityLimitPerUserMin = voucherQuantityLimitPerUserMin;
    return this;
  }

   /**
   * 每人领取限制的最小值。 默认按照支付宝uid进行领取限制。 该字段为空时表示不限制。
   * @return voucherQuantityLimitPerUserMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "每人领取限制的最小值。 默认按照支付宝uid进行领取限制。 该字段为空时表示不限制。")

  public Integer getVoucherQuantityLimitPerUserMin() {
    return voucherQuantityLimitPerUserMin;
  }


  public void setVoucherQuantityLimitPerUserMin(Integer voucherQuantityLimitPerUserMin) {
    this.voucherQuantityLimitPerUserMin = voucherQuantityLimitPerUserMin;
  }


  public RecruitVoucherRule voucherQuantityMax(Integer voucherQuantityMax) {
    
    this.voucherQuantityMax = voucherQuantityMax;
    return this;
  }

   /**
   * 券库存数量的最大值。 该字段为空时表示不限制。
   * @return voucherQuantityMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "券库存数量的最大值。 该字段为空时表示不限制。")

  public Integer getVoucherQuantityMax() {
    return voucherQuantityMax;
  }


  public void setVoucherQuantityMax(Integer voucherQuantityMax) {
    this.voucherQuantityMax = voucherQuantityMax;
  }


  public RecruitVoucherRule voucherQuantityMin(Integer voucherQuantityMin) {
    
    this.voucherQuantityMin = voucherQuantityMin;
    return this;
  }

   /**
   * 券库存数量的最小值。 该字段为空时表示不限制。
   * @return voucherQuantityMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "券库存数量的最小值。 该字段为空时表示不限制。")

  public Integer getVoucherQuantityMin() {
    return voucherQuantityMin;
  }


  public void setVoucherQuantityMin(Integer voucherQuantityMin) {
    this.voucherQuantityMin = voucherQuantityMin;
  }


  public RecruitVoucherRule voucherValidBeginTimeMin(String voucherValidBeginTimeMin) {
    
    this.voucherValidBeginTimeMin = voucherValidBeginTimeMin;
    return this;
  }

   /**
   * 券可使用的开始时间的最小值。 格式为：yyyy-MM-dd HH:mm:ss 该字段为空时表示不限制。
   * @return voucherValidBeginTimeMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-13 23:59:59", value = "券可使用的开始时间的最小值。 格式为：yyyy-MM-dd HH:mm:ss 该字段为空时表示不限制。")

  public String getVoucherValidBeginTimeMin() {
    return voucherValidBeginTimeMin;
  }


  public void setVoucherValidBeginTimeMin(String voucherValidBeginTimeMin) {
    this.voucherValidBeginTimeMin = voucherValidBeginTimeMin;
  }


  public RecruitVoucherRule voucherValidEndTimeMax(String voucherValidEndTimeMax) {
    
    this.voucherValidEndTimeMax = voucherValidEndTimeMax;
    return this;
  }

   /**
   * 券可使用的结束时间的最大值。 格式为：yyyy-MM-dd HH:mm:ss 该字段为空时表示不限制。
   * @return voucherValidEndTimeMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-13 23:59:59", value = "券可使用的结束时间的最大值。 格式为：yyyy-MM-dd HH:mm:ss 该字段为空时表示不限制。")

  public String getVoucherValidEndTimeMax() {
    return voucherValidEndTimeMax;
  }


  public void setVoucherValidEndTimeMax(String voucherValidEndTimeMax) {
    this.voucherValidEndTimeMax = voucherValidEndTimeMax;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecruitVoucherRule recruitVoucherRule = (RecruitVoucherRule) o;
    return Objects.equals(this.amountMax, recruitVoucherRule.amountMax) &&
        Objects.equals(this.amountMin, recruitVoucherRule.amountMin) &&
        Objects.equals(this.denominationPercentMax, recruitVoucherRule.denominationPercentMax) &&
        Objects.equals(this.denominationPercentMin, recruitVoucherRule.denominationPercentMin) &&
        Objects.equals(this.floorAmountMax, recruitVoucherRule.floorAmountMax) &&
        Objects.equals(this.floorAmountMin, recruitVoucherRule.floorAmountMin) &&
        Objects.equals(this.originAmountMax, recruitVoucherRule.originAmountMax) &&
        Objects.equals(this.originAmountMin, recruitVoucherRule.originAmountMin) &&
        Objects.equals(this.publishEndTimeMax, recruitVoucherRule.publishEndTimeMax) &&
        Objects.equals(this.publishEndTimeMin, recruitVoucherRule.publishEndTimeMin) &&
        Objects.equals(this.publishStartTimeMax, recruitVoucherRule.publishStartTimeMax) &&
        Objects.equals(this.publishStartTimeMin, recruitVoucherRule.publishStartTimeMin) &&
        Objects.equals(this.refundType, recruitVoucherRule.refundType) &&
        Objects.equals(this.saleAmountMax, recruitVoucherRule.saleAmountMax) &&
        Objects.equals(this.saleAmountMin, recruitVoucherRule.saleAmountMin) &&
        Objects.equals(this.useChannel, recruitVoucherRule.useChannel) &&
        Objects.equals(this.validDaysAfterReceiveMin, recruitVoucherRule.validDaysAfterReceiveMin) &&
        Objects.equals(this.voucherActivityType, recruitVoucherRule.voucherActivityType) &&
        Objects.equals(this.voucherQuantityLimitPerUserMax, recruitVoucherRule.voucherQuantityLimitPerUserMax) &&
        Objects.equals(this.voucherQuantityLimitPerUserMin, recruitVoucherRule.voucherQuantityLimitPerUserMin) &&
        Objects.equals(this.voucherQuantityMax, recruitVoucherRule.voucherQuantityMax) &&
        Objects.equals(this.voucherQuantityMin, recruitVoucherRule.voucherQuantityMin) &&
        Objects.equals(this.voucherValidBeginTimeMin, recruitVoucherRule.voucherValidBeginTimeMin) &&
        Objects.equals(this.voucherValidEndTimeMax, recruitVoucherRule.voucherValidEndTimeMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountMax, amountMin, denominationPercentMax, denominationPercentMin, floorAmountMax, floorAmountMin, originAmountMax, originAmountMin, publishEndTimeMax, publishEndTimeMin, publishStartTimeMax, publishStartTimeMin, refundType, saleAmountMax, saleAmountMin, useChannel, validDaysAfterReceiveMin, voucherActivityType, voucherQuantityLimitPerUserMax, voucherQuantityLimitPerUserMin, voucherQuantityMax, voucherQuantityMin, voucherValidBeginTimeMin, voucherValidEndTimeMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitVoucherRule {\n");
    sb.append("    amountMax: ").append(toIndentedString(amountMax)).append("\n");
    sb.append("    amountMin: ").append(toIndentedString(amountMin)).append("\n");
    sb.append("    denominationPercentMax: ").append(toIndentedString(denominationPercentMax)).append("\n");
    sb.append("    denominationPercentMin: ").append(toIndentedString(denominationPercentMin)).append("\n");
    sb.append("    floorAmountMax: ").append(toIndentedString(floorAmountMax)).append("\n");
    sb.append("    floorAmountMin: ").append(toIndentedString(floorAmountMin)).append("\n");
    sb.append("    originAmountMax: ").append(toIndentedString(originAmountMax)).append("\n");
    sb.append("    originAmountMin: ").append(toIndentedString(originAmountMin)).append("\n");
    sb.append("    publishEndTimeMax: ").append(toIndentedString(publishEndTimeMax)).append("\n");
    sb.append("    publishEndTimeMin: ").append(toIndentedString(publishEndTimeMin)).append("\n");
    sb.append("    publishStartTimeMax: ").append(toIndentedString(publishStartTimeMax)).append("\n");
    sb.append("    publishStartTimeMin: ").append(toIndentedString(publishStartTimeMin)).append("\n");
    sb.append("    refundType: ").append(toIndentedString(refundType)).append("\n");
    sb.append("    saleAmountMax: ").append(toIndentedString(saleAmountMax)).append("\n");
    sb.append("    saleAmountMin: ").append(toIndentedString(saleAmountMin)).append("\n");
    sb.append("    useChannel: ").append(toIndentedString(useChannel)).append("\n");
    sb.append("    validDaysAfterReceiveMin: ").append(toIndentedString(validDaysAfterReceiveMin)).append("\n");
    sb.append("    voucherActivityType: ").append(toIndentedString(voucherActivityType)).append("\n");
    sb.append("    voucherQuantityLimitPerUserMax: ").append(toIndentedString(voucherQuantityLimitPerUserMax)).append("\n");
    sb.append("    voucherQuantityLimitPerUserMin: ").append(toIndentedString(voucherQuantityLimitPerUserMin)).append("\n");
    sb.append("    voucherQuantityMax: ").append(toIndentedString(voucherQuantityMax)).append("\n");
    sb.append("    voucherQuantityMin: ").append(toIndentedString(voucherQuantityMin)).append("\n");
    sb.append("    voucherValidBeginTimeMin: ").append(toIndentedString(voucherValidBeginTimeMin)).append("\n");
    sb.append("    voucherValidEndTimeMax: ").append(toIndentedString(voucherValidEndTimeMax)).append("\n");
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
    openapiFields.add("amount_max");
    openapiFields.add("amount_min");
    openapiFields.add("denomination_percent_max");
    openapiFields.add("denomination_percent_min");
    openapiFields.add("floor_amount_max");
    openapiFields.add("floor_amount_min");
    openapiFields.add("origin_amount_max");
    openapiFields.add("origin_amount_min");
    openapiFields.add("publish_end_time_max");
    openapiFields.add("publish_end_time_min");
    openapiFields.add("publish_start_time_max");
    openapiFields.add("publish_start_time_min");
    openapiFields.add("refund_type");
    openapiFields.add("sale_amount_max");
    openapiFields.add("sale_amount_min");
    openapiFields.add("use_channel");
    openapiFields.add("valid_days_after_receive_min");
    openapiFields.add("voucher_activity_type");
    openapiFields.add("voucher_quantity_limit_per_user_max");
    openapiFields.add("voucher_quantity_limit_per_user_min");
    openapiFields.add("voucher_quantity_max");
    openapiFields.add("voucher_quantity_min");
    openapiFields.add("voucher_valid_begin_time_min");
    openapiFields.add("voucher_valid_end_time_max");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecruitVoucherRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RecruitVoucherRule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecruitVoucherRule is not found in the empty JSON string", RecruitVoucherRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RecruitVoucherRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecruitVoucherRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount_max") != null && !jsonObj.get("amount_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_max").toString()));
      }
      if (jsonObj.get("amount_min") != null && !jsonObj.get("amount_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_min").toString()));
      }
      if (jsonObj.get("denomination_percent_max") != null && !jsonObj.get("denomination_percent_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `denomination_percent_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("denomination_percent_max").toString()));
      }
      if (jsonObj.get("denomination_percent_min") != null && !jsonObj.get("denomination_percent_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `denomination_percent_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("denomination_percent_min").toString()));
      }
      if (jsonObj.get("floor_amount_max") != null && !jsonObj.get("floor_amount_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `floor_amount_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("floor_amount_max").toString()));
      }
      if (jsonObj.get("floor_amount_min") != null && !jsonObj.get("floor_amount_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `floor_amount_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("floor_amount_min").toString()));
      }
      if (jsonObj.get("origin_amount_max") != null && !jsonObj.get("origin_amount_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_amount_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_amount_max").toString()));
      }
      if (jsonObj.get("origin_amount_min") != null && !jsonObj.get("origin_amount_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_amount_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_amount_min").toString()));
      }
      if (jsonObj.get("publish_end_time_max") != null && !jsonObj.get("publish_end_time_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_end_time_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_end_time_max").toString()));
      }
      if (jsonObj.get("publish_end_time_min") != null && !jsonObj.get("publish_end_time_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_end_time_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_end_time_min").toString()));
      }
      if (jsonObj.get("publish_start_time_max") != null && !jsonObj.get("publish_start_time_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_start_time_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_start_time_max").toString()));
      }
      if (jsonObj.get("publish_start_time_min") != null && !jsonObj.get("publish_start_time_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_start_time_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_start_time_min").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("refund_type") != null && !jsonObj.get("refund_type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_type` to be an array in the JSON string but got `%s`", jsonObj.get("refund_type").toString()));
      }
      if (jsonObj.get("sale_amount_max") != null && !jsonObj.get("sale_amount_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sale_amount_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sale_amount_max").toString()));
      }
      if (jsonObj.get("sale_amount_min") != null && !jsonObj.get("sale_amount_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sale_amount_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sale_amount_min").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("use_channel") != null && !jsonObj.get("use_channel").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `use_channel` to be an array in the JSON string but got `%s`", jsonObj.get("use_channel").toString()));
      }
      if (jsonObj.get("voucher_activity_type") != null && !jsonObj.get("voucher_activity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_activity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_activity_type").toString()));
      }
      if (jsonObj.get("voucher_valid_begin_time_min") != null && !jsonObj.get("voucher_valid_begin_time_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_valid_begin_time_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_valid_begin_time_min").toString()));
      }
      if (jsonObj.get("voucher_valid_end_time_max") != null && !jsonObj.get("voucher_valid_end_time_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_valid_end_time_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_valid_end_time_max").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecruitVoucherRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecruitVoucherRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecruitVoucherRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecruitVoucherRule.class));

       return (TypeAdapter<T>) new TypeAdapter<RecruitVoucherRule>() {
           @Override
           public void write(JsonWriter out, RecruitVoucherRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecruitVoucherRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecruitVoucherRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecruitVoucherRule
  * @throws IOException if the JSON string is invalid with respect to RecruitVoucherRule
  */
  public static RecruitVoucherRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecruitVoucherRule.class);
  }

 /**
  * Convert an instance of RecruitVoucherRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

