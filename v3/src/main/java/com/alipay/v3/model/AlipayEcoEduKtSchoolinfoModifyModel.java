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
 * AlipayEcoEduKtSchoolinfoModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoEduKtSchoolinfoModifyModel {
  public static final String SERIALIZED_NAME_BANK_NOTIFY_URL = "bank_notify_url";
  @SerializedName(SERIALIZED_NAME_BANK_NOTIFY_URL)
  private String bankNotifyUrl;

  public static final String SERIALIZED_NAME_BANK_PARTNER_ID = "bank_partner_id";
  @SerializedName(SERIALIZED_NAME_BANK_PARTNER_ID)
  private String bankPartnerId;

  public static final String SERIALIZED_NAME_BANK_UID = "bank_uid";
  @SerializedName(SERIALIZED_NAME_BANK_UID)
  private String bankUid;

  public static final String SERIALIZED_NAME_BANKCARD_NO = "bankcard_no";
  @SerializedName(SERIALIZED_NAME_BANKCARD_NO)
  private String bankcardNo;

  public static final String SERIALIZED_NAME_BATCH_NO = "batch_no";
  @SerializedName(SERIALIZED_NAME_BATCH_NO)
  private String batchNo;

  public static final String SERIALIZED_NAME_CARD_ALIAS_NO = "card_alias_no";
  @SerializedName(SERIALIZED_NAME_CARD_ALIAS_NO)
  private String cardAliasNo;

  public static final String SERIALIZED_NAME_CITY_CODE = "city_code";
  @SerializedName(SERIALIZED_NAME_CITY_CODE)
  private String cityCode;

  public static final String SERIALIZED_NAME_CITY_NAME = "city_name";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName;

  public static final String SERIALIZED_NAME_CORPORATE_BRANCH_PID = "corporate_branch_pid";
  @SerializedName(SERIALIZED_NAME_CORPORATE_BRANCH_PID)
  private String corporateBranchPid;

  public static final String SERIALIZED_NAME_DISTRICT_CODE = "district_code";
  @SerializedName(SERIALIZED_NAME_DISTRICT_CODE)
  private String districtCode;

  public static final String SERIALIZED_NAME_DISTRICT_NAME = "district_name";
  @SerializedName(SERIALIZED_NAME_DISTRICT_NAME)
  private String districtName;

  public static final String SERIALIZED_NAME_ISV_NAME = "isv_name";
  @SerializedName(SERIALIZED_NAME_ISV_NAME)
  private String isvName;

  public static final String SERIALIZED_NAME_ISV_NO = "isv_no";
  @SerializedName(SERIALIZED_NAME_ISV_NO)
  private String isvNo;

  public static final String SERIALIZED_NAME_ISV_NOTIFY_URL = "isv_notify_url";
  @SerializedName(SERIALIZED_NAME_ISV_NOTIFY_URL)
  private String isvNotifyUrl;

  public static final String SERIALIZED_NAME_ISV_PHONE = "isv_phone";
  @SerializedName(SERIALIZED_NAME_ISV_PHONE)
  private String isvPhone;

  public static final String SERIALIZED_NAME_ISV_PID = "isv_pid";
  @SerializedName(SERIALIZED_NAME_ISV_PID)
  private String isvPid;

  public static final String SERIALIZED_NAME_PROVINCE_CODE = "province_code";
  @SerializedName(SERIALIZED_NAME_PROVINCE_CODE)
  private String provinceCode;

  public static final String SERIALIZED_NAME_PROVINCE_NAME = "province_name";
  @SerializedName(SERIALIZED_NAME_PROVINCE_NAME)
  private String provinceName;

  public static final String SERIALIZED_NAME_SCHOOL_ICON = "school_icon";
  @SerializedName(SERIALIZED_NAME_SCHOOL_ICON)
  private String schoolIcon;

  public static final String SERIALIZED_NAME_SCHOOL_ICON_TYPE = "school_icon_type";
  @SerializedName(SERIALIZED_NAME_SCHOOL_ICON_TYPE)
  private String schoolIconType;

  public static final String SERIALIZED_NAME_SCHOOL_NAME = "school_name";
  @SerializedName(SERIALIZED_NAME_SCHOOL_NAME)
  private String schoolName;

  public static final String SERIALIZED_NAME_SCHOOL_PID = "school_pid";
  @SerializedName(SERIALIZED_NAME_SCHOOL_PID)
  private String schoolPid;

  public static final String SERIALIZED_NAME_SCHOOL_STDCODE = "school_stdcode";
  @SerializedName(SERIALIZED_NAME_SCHOOL_STDCODE)
  private String schoolStdcode;

  public static final String SERIALIZED_NAME_SCHOOL_TYPE = "school_type";
  @SerializedName(SERIALIZED_NAME_SCHOOL_TYPE)
  private String schoolType;

  public static final String SERIALIZED_NAME_SMID = "smid";
  @SerializedName(SERIALIZED_NAME_SMID)
  private String smid;

  public static final String SERIALIZED_NAME_TRANS_IN = "trans_in";
  @SerializedName(SERIALIZED_NAME_TRANS_IN)
  private String transIn;

  public static final String SERIALIZED_NAME_WHITE_CHANNEL_CODE = "white_channel_code";
  @SerializedName(SERIALIZED_NAME_WHITE_CHANNEL_CODE)
  private String whiteChannelCode;

  public AlipayEcoEduKtSchoolinfoModifyModel() { 
  }

  public AlipayEcoEduKtSchoolinfoModifyModel bankNotifyUrl(String bankNotifyUrl) {
    
    this.bankNotifyUrl = bankNotifyUrl;
    return this;
  }

   /**
   * 与浙江网商交易见证平台有交互ISV输入网商交易异步通知回调URL，教育缴费同步账单信息给网商，网商会回调此url，ISV即可获取网商相关的参数，根据教育缴费平台账单发送接口返回的 order_no和网商返回的outer_trade_no来对应账单信息。
   * @return bankNotifyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.xxx.xxx/xx", value = "与浙江网商交易见证平台有交互ISV输入网商交易异步通知回调URL，教育缴费同步账单信息给网商，网商会回调此url，ISV即可获取网商相关的参数，根据教育缴费平台账单发送接口返回的 order_no和网商返回的outer_trade_no来对应账单信息。")

  public String getBankNotifyUrl() {
    return bankNotifyUrl;
  }


  public void setBankNotifyUrl(String bankNotifyUrl) {
    this.bankNotifyUrl = bankNotifyUrl;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel bankPartnerId(String bankPartnerId) {
    
    this.bankPartnerId = bankPartnerId;
    return this;
  }

   /**
   * 与浙江网商交易见证平台有交互的ISV,由交易见证平台分配给合作方业务平台 签约唯一ID ，由网商分配给ISV的渠道参数
   * @return bankPartnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200002924334", value = "与浙江网商交易见证平台有交互的ISV,由交易见证平台分配给合作方业务平台 签约唯一ID ，由网商分配给ISV的渠道参数")

  public String getBankPartnerId() {
    return bankPartnerId;
  }


  public void setBankPartnerId(String bankPartnerId) {
    this.bankPartnerId = bankPartnerId;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel bankUid(String bankUid) {
    
    this.bankUid = bankUid;
    return this;
  }

   /**
   * 与浙江网商交易见证平台有交互的ISV在创建账户时的uid，也就是ISV平台上的用户ID（字母或数字）
   * @return bankUid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20000293230232", value = "与浙江网商交易见证平台有交互的ISV在创建账户时的uid，也就是ISV平台上的用户ID（字母或数字）")

  public String getBankUid() {
    return bankUid;
  }


  public void setBankUid(String bankUid) {
    this.bankUid = bankUid;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel bankcardNo(String bankcardNo) {
    
    this.bankcardNo = bankcardNo;
    return this;
  }

   /**
   * 对应集团到卡模式的银行编号.学校与支付宝后台签约时，由学校提交给支付宝的编号
   * @return bankcardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "P0004", value = "对应集团到卡模式的银行编号.学校与支付宝后台签约时，由学校提交给支付宝的编号")

  public String getBankcardNo() {
    return bankcardNo;
  }


  public void setBankcardNo(String bankcardNo) {
    this.bankcardNo = bankcardNo;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel batchNo(String batchNo) {
    
    this.batchNo = batchNo;
    return this;
  }

   /**
   * 集团收单模式：分账批次号，支付宝配置后提供的银行卡批次号
   * @return batchNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201812180111030000034567270022", value = "集团收单模式：分账批次号，支付宝配置后提供的银行卡批次号")

  public String getBatchNo() {
    return batchNo;
  }


  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel cardAliasNo(String cardAliasNo) {
    
    this.cardAliasNo = cardAliasNo;
    return this;
  }

   /**
   * 学校开通直付通卡编号，smid与card_alias_no必须同时填写
   * @return cardAliasNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c6c0c7a1b9d54e5db9d49eed39f00e65", value = "学校开通直付通卡编号，smid与card_alias_no必须同时填写")

  public String getCardAliasNo() {
    return cardAliasNo;
  }


  public void setCardAliasNo(String cardAliasNo) {
    this.cardAliasNo = cardAliasNo;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 城市的国家编码。参见 &lt;a href&#x3D;\&quot;http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/\&quot;&gt;国家统计局出版的行政区划代码&lt;/a&gt;。
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330100", value = "城市的国家编码。参见 <a href=\"http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/\">国家统计局出版的行政区划代码</a>。")

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * 城市名称
   * @return cityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州市", value = "城市名称")

  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel corporateBranchPid(String corporateBranchPid) {
    
    this.corporateBranchPid = corporateBranchPid;
    return this;
  }

   /**
   * 集团收单模式：BD批量上传银行卡信息后，支付宝系统分配给ISV的每个卡分配的唯一标识
   * @return corporateBranchPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301031335812", value = "集团收单模式：BD批量上传银行卡信息后，支付宝系统分配给ISV的每个卡分配的唯一标识")

  public String getCorporateBranchPid() {
    return corporateBranchPid;
  }


  public void setCorporateBranchPid(String corporateBranchPid) {
    this.corporateBranchPid = corporateBranchPid;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel districtCode(String districtCode) {
    
    this.districtCode = districtCode;
    return this;
  }

   /**
   * 区县的国家编码。参见 &lt;a href&#x3D;\&quot;http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/\&quot;&gt;国家统计局出版的行政区划代码&lt;/a&gt;。
   * @return districtCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330106", value = "区县的国家编码。参见 <a href=\"http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/\">国家统计局出版的行政区划代码</a>。")

  public String getDistrictCode() {
    return districtCode;
  }


  public void setDistrictCode(String districtCode) {
    this.districtCode = districtCode;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel districtName(String districtName) {
    
    this.districtName = districtName;
    return this;
  }

   /**
   * 区县名称
   * @return districtName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "西湖区", value = "区县名称")

  public String getDistrictName() {
    return districtName;
  }


  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel isvName(String isvName) {
    
    this.isvName = isvName;
    return this;
  }

   /**
   * ISV公司名称 ， 会在账单详情页面展示给用户
   * @return isvName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州少年宫", value = "ISV公司名称 ， 会在账单详情页面展示给用户")

  public String getIsvName() {
    return isvName;
  }


  public void setIsvName(String isvName) {
    this.isvName = isvName;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel isvNo(String isvNo) {
    
    this.isvNo = isvNo;
    return this;
  }

   /**
   * 注意：本参数于2017-08-03开始已经废弃，不再需要传递。 由支付宝提供的给已经签约的isv的编码，业务上一般直接采用isv的支付宝PID。
   * @return isvNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201600129391238873", value = "注意：本参数于2017-08-03开始已经废弃，不再需要传递。 由支付宝提供的给已经签约的isv的编码，业务上一般直接采用isv的支付宝PID。")

  public String getIsvNo() {
    return isvNo;
  }


  public void setIsvNo(String isvNo) {
    this.isvNo = isvNo;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel isvNotifyUrl(String isvNotifyUrl) {
    
    this.isvNotifyUrl = isvNotifyUrl;
    return this;
  }

   /**
   * 此通知地址是为了保持教育缴费平台与ISV商户支付状态一致性。用户支付成功后，支付宝会根据本isv_notify_url(异步通知说明https://docs.open.alipay.com/203/105286/)，通过POST请求的形式将支付结果作为参数通知到商户系统，ISV商户可以根据返回的参数更新账单状态。
   * @return isvNotifyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://isv.com/xxx", value = "此通知地址是为了保持教育缴费平台与ISV商户支付状态一致性。用户支付成功后，支付宝会根据本isv_notify_url(异步通知说明https://docs.open.alipay.com/203/105286/)，通过POST请求的形式将支付结果作为参数通知到商户系统，ISV商户可以根据返回的参数更新账单状态。")

  public String getIsvNotifyUrl() {
    return isvNotifyUrl;
  }


  public void setIsvNotifyUrl(String isvNotifyUrl) {
    this.isvNotifyUrl = isvNotifyUrl;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel isvPhone(String isvPhone) {
    
    this.isvPhone = isvPhone;
    return this;
  }

   /**
   * ISV的联系方式 ， 会在账单详情页面展示给用户，用户有问题可以直接联系此电话获取帮助
   * @return isvPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13300000000", value = "ISV的联系方式 ， 会在账单详情页面展示给用户，用户有问题可以直接联系此电话获取帮助")

  public String getIsvPhone() {
    return isvPhone;
  }


  public void setIsvPhone(String isvPhone) {
    this.isvPhone = isvPhone;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel isvPid(String isvPid) {
    
    this.isvPid = isvPid;
    return this;
  }

   /**
   * 填写已经签约教育缴费的isv的支付宝PID
   * @return isvPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088121212121212", value = "填写已经签约教育缴费的isv的支付宝PID")

  public String getIsvPid() {
    return isvPid;
  }


  public void setIsvPid(String isvPid) {
    this.isvPid = isvPid;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel provinceCode(String provinceCode) {
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * 省份的国家编码，参见 &lt;a href&#x3D;\&quot;http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/\&quot;&gt;国家统计局出版的行政区划代码&lt;/a&gt;。
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330000", value = "省份的国家编码，参见 <a href=\"http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/\">国家统计局出版的行政区划代码</a>。")

  public String getProvinceCode() {
    return provinceCode;
  }


  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel provinceName(String provinceName) {
    
    this.provinceName = provinceName;
    return this;
  }

   /**
   * 省名称
   * @return provinceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江省", value = "省名称")

  public String getProvinceName() {
    return provinceName;
  }


  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel schoolIcon(String schoolIcon) {
    
    this.schoolIcon = schoolIcon;
    return this;
  }

   /**
   * 学校的校徽或logo，在学校展示页面作为学校的标识。该字段为图片的链接地址，只支持png或jpg图片格式，图片高度为108，宽度为108 ，不大于20k。  注意：此链接要求公网可以访问，否则无法正常展示。
   * @return schoolIcon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://ecopublic-dev.oss-cn-hangzhou.aliyuncs.com/eco/edu_alipay/school/school.png", value = "学校的校徽或logo，在学校展示页面作为学校的标识。该字段为图片的链接地址，只支持png或jpg图片格式，图片高度为108，宽度为108 ，不大于20k。  注意：此链接要求公网可以访问，否则无法正常展示。")

  public String getSchoolIcon() {
    return schoolIcon;
  }


  public void setSchoolIcon(String schoolIcon) {
    this.schoolIcon = schoolIcon;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel schoolIconType(String schoolIconType) {
    
    this.schoolIconType = schoolIconType;
    return this;
  }

   /**
   * 如果填写了school_icon参数，则此字段不能为空。目前只支持png和jpg两种格式
   * @return schoolIconType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "png", value = "如果填写了school_icon参数，则此字段不能为空。目前只支持png和jpg两种格式")

  public String getSchoolIconType() {
    return schoolIconType;
  }


  public void setSchoolIconType(String schoolIconType) {
    this.schoolIconType = schoolIconType;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel schoolName(String schoolName) {
    
    this.schoolName = schoolName;
    return this;
  }

   /**
   * 学校名称
   * @return schoolName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州市西湖第一实验学校", value = "学校名称")

  public String getSchoolName() {
    return schoolName;
  }


  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel schoolPid(String schoolPid) {
    
    this.schoolPid = schoolPid;
    return this;
  }

   /**
   * 学校签约支付宝教育缴费支付宝pid,如果是直付通学校，填写直付通返回的smid
   * @return schoolPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20880012939123234423", value = "学校签约支付宝教育缴费支付宝pid,如果是直付通学校，填写直付通返回的smid")

  public String getSchoolPid() {
    return schoolPid;
  }


  public void setSchoolPid(String schoolPid) {
    this.schoolPid = schoolPid;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel schoolStdcode(String schoolStdcode) {
    
    this.schoolStdcode = schoolStdcode;
    return this;
  }

   /**
   * 学校(机构)标识码（由教育部按照国家标准及编码规则编制，可以在教育局官网查询）
   * @return schoolStdcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3133005132", value = "学校(机构)标识码（由教育部按照国家标准及编码规则编制，可以在教育局官网查询）")

  public String getSchoolStdcode() {
    return schoolStdcode;
  }


  public void setSchoolStdcode(String schoolStdcode) {
    this.schoolStdcode = schoolStdcode;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel schoolType(String schoolType) {
    
    this.schoolType = schoolType;
    return this;
  }

   /**
   * 学校的类型。枚举值如下： *1：代表托儿所。 *2：代表幼儿园。 *3：代表小学。 *4：代表初中。 *5：代表高中。 注意：如果学校兼有多种属性，可以连写，比如：45：代表兼有初中部高中部；34：代表兼有小学部初中部。
   * @return schoolType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "学校的类型。枚举值如下： *1：代表托儿所。 *2：代表幼儿园。 *3：代表小学。 *4：代表初中。 *5：代表高中。 注意：如果学校兼有多种属性，可以连写，比如：45：代表兼有初中部高中部；34：代表兼有小学部初中部。")

  public String getSchoolType() {
    return schoolType;
  }


  public void setSchoolType(String schoolType) {
    this.schoolType = schoolType;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel smid(String smid) {
    
    this.smid = smid;
    return this;
  }

   /**
   * 学校开通直付通返回的二级商户id，smid与card_alias_no必须同时填写
   * @return smid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301031335814", value = "学校开通直付通返回的二级商户id，smid与card_alias_no必须同时填写")

  public String getSmid() {
    return smid;
  }


  public void setSmid(String smid) {
    this.smid = smid;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel transIn(String transIn) {
    
    this.transIn = transIn;
    return this;
  }

   /**
   * 集团收单模式：分账批次号，支付宝配置后提供的银行卡批次号
   * @return transIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4325353", value = "集团收单模式：分账批次号，支付宝配置后提供的银行卡批次号")

  public String getTransIn() {
    return transIn;
  }


  public void setTransIn(String transIn) {
    this.transIn = transIn;
  }


  public AlipayEcoEduKtSchoolinfoModifyModel whiteChannelCode(String whiteChannelCode) {
    
    this.whiteChannelCode = whiteChannelCode;
    return this;
  }

   /**
   * 与浙江网商交易见证平台有交互的ISV,由网商分配给ISV的渠道参数
   * @return whiteChannelCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TESTBANK10301", value = "与浙江网商交易见证平台有交互的ISV,由网商分配给ISV的渠道参数")

  public String getWhiteChannelCode() {
    return whiteChannelCode;
  }


  public void setWhiteChannelCode(String whiteChannelCode) {
    this.whiteChannelCode = whiteChannelCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoEduKtSchoolinfoModifyModel alipayEcoEduKtSchoolinfoModifyModel = (AlipayEcoEduKtSchoolinfoModifyModel) o;
    return Objects.equals(this.bankNotifyUrl, alipayEcoEduKtSchoolinfoModifyModel.bankNotifyUrl) &&
        Objects.equals(this.bankPartnerId, alipayEcoEduKtSchoolinfoModifyModel.bankPartnerId) &&
        Objects.equals(this.bankUid, alipayEcoEduKtSchoolinfoModifyModel.bankUid) &&
        Objects.equals(this.bankcardNo, alipayEcoEduKtSchoolinfoModifyModel.bankcardNo) &&
        Objects.equals(this.batchNo, alipayEcoEduKtSchoolinfoModifyModel.batchNo) &&
        Objects.equals(this.cardAliasNo, alipayEcoEduKtSchoolinfoModifyModel.cardAliasNo) &&
        Objects.equals(this.cityCode, alipayEcoEduKtSchoolinfoModifyModel.cityCode) &&
        Objects.equals(this.cityName, alipayEcoEduKtSchoolinfoModifyModel.cityName) &&
        Objects.equals(this.corporateBranchPid, alipayEcoEduKtSchoolinfoModifyModel.corporateBranchPid) &&
        Objects.equals(this.districtCode, alipayEcoEduKtSchoolinfoModifyModel.districtCode) &&
        Objects.equals(this.districtName, alipayEcoEduKtSchoolinfoModifyModel.districtName) &&
        Objects.equals(this.isvName, alipayEcoEduKtSchoolinfoModifyModel.isvName) &&
        Objects.equals(this.isvNo, alipayEcoEduKtSchoolinfoModifyModel.isvNo) &&
        Objects.equals(this.isvNotifyUrl, alipayEcoEduKtSchoolinfoModifyModel.isvNotifyUrl) &&
        Objects.equals(this.isvPhone, alipayEcoEduKtSchoolinfoModifyModel.isvPhone) &&
        Objects.equals(this.isvPid, alipayEcoEduKtSchoolinfoModifyModel.isvPid) &&
        Objects.equals(this.provinceCode, alipayEcoEduKtSchoolinfoModifyModel.provinceCode) &&
        Objects.equals(this.provinceName, alipayEcoEduKtSchoolinfoModifyModel.provinceName) &&
        Objects.equals(this.schoolIcon, alipayEcoEduKtSchoolinfoModifyModel.schoolIcon) &&
        Objects.equals(this.schoolIconType, alipayEcoEduKtSchoolinfoModifyModel.schoolIconType) &&
        Objects.equals(this.schoolName, alipayEcoEduKtSchoolinfoModifyModel.schoolName) &&
        Objects.equals(this.schoolPid, alipayEcoEduKtSchoolinfoModifyModel.schoolPid) &&
        Objects.equals(this.schoolStdcode, alipayEcoEduKtSchoolinfoModifyModel.schoolStdcode) &&
        Objects.equals(this.schoolType, alipayEcoEduKtSchoolinfoModifyModel.schoolType) &&
        Objects.equals(this.smid, alipayEcoEduKtSchoolinfoModifyModel.smid) &&
        Objects.equals(this.transIn, alipayEcoEduKtSchoolinfoModifyModel.transIn) &&
        Objects.equals(this.whiteChannelCode, alipayEcoEduKtSchoolinfoModifyModel.whiteChannelCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankNotifyUrl, bankPartnerId, bankUid, bankcardNo, batchNo, cardAliasNo, cityCode, cityName, corporateBranchPid, districtCode, districtName, isvName, isvNo, isvNotifyUrl, isvPhone, isvPid, provinceCode, provinceName, schoolIcon, schoolIconType, schoolName, schoolPid, schoolStdcode, schoolType, smid, transIn, whiteChannelCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoEduKtSchoolinfoModifyModel {\n");
    sb.append("    bankNotifyUrl: ").append(toIndentedString(bankNotifyUrl)).append("\n");
    sb.append("    bankPartnerId: ").append(toIndentedString(bankPartnerId)).append("\n");
    sb.append("    bankUid: ").append(toIndentedString(bankUid)).append("\n");
    sb.append("    bankcardNo: ").append(toIndentedString(bankcardNo)).append("\n");
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
    sb.append("    cardAliasNo: ").append(toIndentedString(cardAliasNo)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    corporateBranchPid: ").append(toIndentedString(corporateBranchPid)).append("\n");
    sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    isvName: ").append(toIndentedString(isvName)).append("\n");
    sb.append("    isvNo: ").append(toIndentedString(isvNo)).append("\n");
    sb.append("    isvNotifyUrl: ").append(toIndentedString(isvNotifyUrl)).append("\n");
    sb.append("    isvPhone: ").append(toIndentedString(isvPhone)).append("\n");
    sb.append("    isvPid: ").append(toIndentedString(isvPid)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
    sb.append("    provinceName: ").append(toIndentedString(provinceName)).append("\n");
    sb.append("    schoolIcon: ").append(toIndentedString(schoolIcon)).append("\n");
    sb.append("    schoolIconType: ").append(toIndentedString(schoolIconType)).append("\n");
    sb.append("    schoolName: ").append(toIndentedString(schoolName)).append("\n");
    sb.append("    schoolPid: ").append(toIndentedString(schoolPid)).append("\n");
    sb.append("    schoolStdcode: ").append(toIndentedString(schoolStdcode)).append("\n");
    sb.append("    schoolType: ").append(toIndentedString(schoolType)).append("\n");
    sb.append("    smid: ").append(toIndentedString(smid)).append("\n");
    sb.append("    transIn: ").append(toIndentedString(transIn)).append("\n");
    sb.append("    whiteChannelCode: ").append(toIndentedString(whiteChannelCode)).append("\n");
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
    openapiFields.add("bank_notify_url");
    openapiFields.add("bank_partner_id");
    openapiFields.add("bank_uid");
    openapiFields.add("bankcard_no");
    openapiFields.add("batch_no");
    openapiFields.add("card_alias_no");
    openapiFields.add("city_code");
    openapiFields.add("city_name");
    openapiFields.add("corporate_branch_pid");
    openapiFields.add("district_code");
    openapiFields.add("district_name");
    openapiFields.add("isv_name");
    openapiFields.add("isv_no");
    openapiFields.add("isv_notify_url");
    openapiFields.add("isv_phone");
    openapiFields.add("isv_pid");
    openapiFields.add("province_code");
    openapiFields.add("province_name");
    openapiFields.add("school_icon");
    openapiFields.add("school_icon_type");
    openapiFields.add("school_name");
    openapiFields.add("school_pid");
    openapiFields.add("school_stdcode");
    openapiFields.add("school_type");
    openapiFields.add("smid");
    openapiFields.add("trans_in");
    openapiFields.add("white_channel_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoEduKtSchoolinfoModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoEduKtSchoolinfoModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoEduKtSchoolinfoModifyModel is not found in the empty JSON string", AlipayEcoEduKtSchoolinfoModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoEduKtSchoolinfoModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoEduKtSchoolinfoModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("bank_notify_url") != null && !jsonObj.get("bank_notify_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_notify_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_notify_url").toString()));
      }
      if (jsonObj.get("bank_partner_id") != null && !jsonObj.get("bank_partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_partner_id").toString()));
      }
      if (jsonObj.get("bank_uid") != null && !jsonObj.get("bank_uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_uid").toString()));
      }
      if (jsonObj.get("bankcard_no") != null && !jsonObj.get("bankcard_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankcard_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankcard_no").toString()));
      }
      if (jsonObj.get("batch_no") != null && !jsonObj.get("batch_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_no").toString()));
      }
      if (jsonObj.get("card_alias_no") != null && !jsonObj.get("card_alias_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_alias_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_alias_no").toString()));
      }
      if (jsonObj.get("city_code") != null && !jsonObj.get("city_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_code").toString()));
      }
      if (jsonObj.get("city_name") != null && !jsonObj.get("city_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_name").toString()));
      }
      if (jsonObj.get("corporate_branch_pid") != null && !jsonObj.get("corporate_branch_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `corporate_branch_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("corporate_branch_pid").toString()));
      }
      if (jsonObj.get("district_code") != null && !jsonObj.get("district_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district_code").toString()));
      }
      if (jsonObj.get("district_name") != null && !jsonObj.get("district_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district_name").toString()));
      }
      if (jsonObj.get("isv_name") != null && !jsonObj.get("isv_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_name").toString()));
      }
      if (jsonObj.get("isv_no") != null && !jsonObj.get("isv_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_no").toString()));
      }
      if (jsonObj.get("isv_notify_url") != null && !jsonObj.get("isv_notify_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_notify_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_notify_url").toString()));
      }
      if (jsonObj.get("isv_phone") != null && !jsonObj.get("isv_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_phone").toString()));
      }
      if (jsonObj.get("isv_pid") != null && !jsonObj.get("isv_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_pid").toString()));
      }
      if (jsonObj.get("province_code") != null && !jsonObj.get("province_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_code").toString()));
      }
      if (jsonObj.get("province_name") != null && !jsonObj.get("province_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_name").toString()));
      }
      if (jsonObj.get("school_icon") != null && !jsonObj.get("school_icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_icon").toString()));
      }
      if (jsonObj.get("school_icon_type") != null && !jsonObj.get("school_icon_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_icon_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_icon_type").toString()));
      }
      if (jsonObj.get("school_name") != null && !jsonObj.get("school_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_name").toString()));
      }
      if (jsonObj.get("school_pid") != null && !jsonObj.get("school_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_pid").toString()));
      }
      if (jsonObj.get("school_stdcode") != null && !jsonObj.get("school_stdcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_stdcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_stdcode").toString()));
      }
      if (jsonObj.get("school_type") != null && !jsonObj.get("school_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_type").toString()));
      }
      if (jsonObj.get("smid") != null && !jsonObj.get("smid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smid").toString()));
      }
      if (jsonObj.get("trans_in") != null && !jsonObj.get("trans_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in").toString()));
      }
      if (jsonObj.get("white_channel_code") != null && !jsonObj.get("white_channel_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `white_channel_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("white_channel_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoEduKtSchoolinfoModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoEduKtSchoolinfoModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoEduKtSchoolinfoModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoEduKtSchoolinfoModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoEduKtSchoolinfoModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoEduKtSchoolinfoModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoEduKtSchoolinfoModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoEduKtSchoolinfoModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoEduKtSchoolinfoModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoEduKtSchoolinfoModifyModel
  */
  public static AlipayEcoEduKtSchoolinfoModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoEduKtSchoolinfoModifyModel.class);
  }

 /**
  * Convert an instance of AlipayEcoEduKtSchoolinfoModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

