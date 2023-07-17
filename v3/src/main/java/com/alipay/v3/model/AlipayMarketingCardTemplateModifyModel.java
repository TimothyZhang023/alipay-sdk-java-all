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
import com.alipay.v3.model.PaidOuterCardTemplateConfDTO;
import com.alipay.v3.model.PubChannelDTO;
import com.alipay.v3.model.TemplateActionInfoDTO;
import com.alipay.v3.model.TemplateBenefitInfoDTO;
import com.alipay.v3.model.TemplateCardLevelConfDTO;
import com.alipay.v3.model.TemplateColumnInfoDTO;
import com.alipay.v3.model.TemplateFieldRuleDTO;
import com.alipay.v3.model.TemplateMdcodeNotifyConfDTO;
import com.alipay.v3.model.TemplateOpenCardConfDTO;
import com.alipay.v3.model.TemplateStyleInfoDTO;
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
 * AlipayMarketingCardTemplateModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCardTemplateModifyModel {
  public static final String SERIALIZED_NAME_BIZ_NO_PREFIX = "biz_no_prefix";
  @SerializedName(SERIALIZED_NAME_BIZ_NO_PREFIX)
  private String bizNoPrefix;

  public static final String SERIALIZED_NAME_BIZ_NO_SUFFIX_LEN = "biz_no_suffix_len";
  @SerializedName(SERIALIZED_NAME_BIZ_NO_SUFFIX_LEN)
  private String bizNoSuffixLen;

  public static final String SERIALIZED_NAME_CARD_ACTION_LIST = "card_action_list";
  @SerializedName(SERIALIZED_NAME_CARD_ACTION_LIST)
  private List<TemplateActionInfoDTO> cardActionList = null;

  public static final String SERIALIZED_NAME_CARD_LEVEL_CONF = "card_level_conf";
  @SerializedName(SERIALIZED_NAME_CARD_LEVEL_CONF)
  private List<TemplateCardLevelConfDTO> cardLevelConf = null;

  public static final String SERIALIZED_NAME_CARD_SPEC_TAG = "card_spec_tag";
  @SerializedName(SERIALIZED_NAME_CARD_SPEC_TAG)
  private String cardSpecTag;

  public static final String SERIALIZED_NAME_COLUMN_INFO_LIST = "column_info_list";
  @SerializedName(SERIALIZED_NAME_COLUMN_INFO_LIST)
  private List<TemplateColumnInfoDTO> columnInfoList = null;

  public static final String SERIALIZED_NAME_FIELD_RULE_LIST = "field_rule_list";
  @SerializedName(SERIALIZED_NAME_FIELD_RULE_LIST)
  private List<TemplateFieldRuleDTO> fieldRuleList = null;

  public static final String SERIALIZED_NAME_MDCODE_NOTIFY_CONF = "mdcode_notify_conf";
  @SerializedName(SERIALIZED_NAME_MDCODE_NOTIFY_CONF)
  private TemplateMdcodeNotifyConfDTO mdcodeNotifyConf;

  public static final String SERIALIZED_NAME_OPEN_CARD_CONF = "open_card_conf";
  @SerializedName(SERIALIZED_NAME_OPEN_CARD_CONF)
  private TemplateOpenCardConfDTO openCardConf;

  public static final String SERIALIZED_NAME_PAID_OUTER_CARD_CONF = "paid_outer_card_conf";
  @SerializedName(SERIALIZED_NAME_PAID_OUTER_CARD_CONF)
  private PaidOuterCardTemplateConfDTO paidOuterCardConf;

  public static final String SERIALIZED_NAME_PUB_CHANNELS = "pub_channels";
  @SerializedName(SERIALIZED_NAME_PUB_CHANNELS)
  private List<PubChannelDTO> pubChannels = null;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_SHOP_IDS = "shop_ids";
  @SerializedName(SERIALIZED_NAME_SHOP_IDS)
  private List<String> shopIds = null;

  public static final String SERIALIZED_NAME_SPI_APP_ID = "spi_app_id";
  @SerializedName(SERIALIZED_NAME_SPI_APP_ID)
  private String spiAppId;

  public static final String SERIALIZED_NAME_TEMPLATE_BENEFIT_INFO = "template_benefit_info";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_BENEFIT_INFO)
  private List<TemplateBenefitInfoDTO> templateBenefitInfo = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_STYLE_INFO = "template_style_info";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_STYLE_INFO)
  private TemplateStyleInfoDTO templateStyleInfo;

  public static final String SERIALIZED_NAME_WRITE_OFF_TYPE = "write_off_type";
  @SerializedName(SERIALIZED_NAME_WRITE_OFF_TYPE)
  private String writeOffType;

  public AlipayMarketingCardTemplateModifyModel() { 
  }

  public AlipayMarketingCardTemplateModifyModel bizNoPrefix(String bizNoPrefix) {
    
    this.bizNoPrefix = bizNoPrefix;
    return this;
  }

   /**
   * 业务卡号前缀，由商户指定  支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀
   * @return bizNoPrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "prex", value = "业务卡号前缀，由商户指定  支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀")

  public String getBizNoPrefix() {
    return bizNoPrefix;
  }


  public void setBizNoPrefix(String bizNoPrefix) {
    this.bizNoPrefix = bizNoPrefix;
  }


  public AlipayMarketingCardTemplateModifyModel bizNoSuffixLen(String bizNoSuffixLen) {
    
    this.bizNoSuffixLen = bizNoSuffixLen;
    return this;
  }

   /**
   * 业务卡号后缀长度，与biz_no_prefix配合，扣除系统预留2位，剩下对应seq长度。在生成卡号时，若seq位数不足前置补0，若seq位数超出则以实际为准。举例：设为10，其中8位用于生成seq，可覆盖1亿用户，即使seq超过1亿，生成卡号也不报错，但总长度不得超过32位。建议按需设置合适的值，以获得长度一致的业务卡号，建议长度20，性能更好。
   * @return bizNoSuffixLen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "业务卡号后缀长度，与biz_no_prefix配合，扣除系统预留2位，剩下对应seq长度。在生成卡号时，若seq位数不足前置补0，若seq位数超出则以实际为准。举例：设为10，其中8位用于生成seq，可覆盖1亿用户，即使seq超过1亿，生成卡号也不报错，但总长度不得超过32位。建议按需设置合适的值，以获得长度一致的业务卡号，建议长度20，性能更好。")

  public String getBizNoSuffixLen() {
    return bizNoSuffixLen;
  }


  public void setBizNoSuffixLen(String bizNoSuffixLen) {
    this.bizNoSuffixLen = bizNoSuffixLen;
  }


  public AlipayMarketingCardTemplateModifyModel cardActionList(List<TemplateActionInfoDTO> cardActionList) {
    
    this.cardActionList = cardActionList;
    return this;
  }

  public AlipayMarketingCardTemplateModifyModel addCardActionListItem(TemplateActionInfoDTO cardActionListItem) {
    if (this.cardActionList == null) {
      this.cardActionList = new ArrayList<>();
    }
    this.cardActionList.add(cardActionListItem);
    return this;
  }

   /**
   * 卡行动点配置；  行动点，即用户可点击跳转的区块，类似按钮控件的交互；  单张卡最多定制4个行动点。
   * @return cardActionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "卡行动点配置；  行动点，即用户可点击跳转的区块，类似按钮控件的交互；  单张卡最多定制4个行动点。")

  public List<TemplateActionInfoDTO> getCardActionList() {
    return cardActionList;
  }


  public void setCardActionList(List<TemplateActionInfoDTO> cardActionList) {
    this.cardActionList = cardActionList;
  }


  public AlipayMarketingCardTemplateModifyModel cardLevelConf(List<TemplateCardLevelConfDTO> cardLevelConf) {
    
    this.cardLevelConf = cardLevelConf;
    return this;
  }

  public AlipayMarketingCardTemplateModifyModel addCardLevelConfItem(TemplateCardLevelConfDTO cardLevelConfItem) {
    if (this.cardLevelConf == null) {
      this.cardLevelConf = new ArrayList<>();
    }
    this.cardLevelConf.add(cardLevelConfItem);
    return this;
  }

   /**
   * 卡级别配置
   * @return cardLevelConf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "卡级别配置")

  public List<TemplateCardLevelConfDTO> getCardLevelConf() {
    return cardLevelConf;
  }


  public void setCardLevelConf(List<TemplateCardLevelConfDTO> cardLevelConf) {
    this.cardLevelConf = cardLevelConf;
  }


  public AlipayMarketingCardTemplateModifyModel cardSpecTag(String cardSpecTag) {
    
    this.cardSpecTag = cardSpecTag;
    return this;
  }

   /**
   * 卡特定标签，只供特定业务使用，通常接入无需关注
   * @return cardSpecTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NONE", value = "卡特定标签，只供特定业务使用，通常接入无需关注")

  public String getCardSpecTag() {
    return cardSpecTag;
  }


  public void setCardSpecTag(String cardSpecTag) {
    this.cardSpecTag = cardSpecTag;
  }


  public AlipayMarketingCardTemplateModifyModel columnInfoList(List<TemplateColumnInfoDTO> columnInfoList) {
    
    this.columnInfoList = columnInfoList;
    return this;
  }

  public AlipayMarketingCardTemplateModifyModel addColumnInfoListItem(TemplateColumnInfoDTO columnInfoListItem) {
    if (this.columnInfoList == null) {
      this.columnInfoList = new ArrayList<>();
    }
    this.columnInfoList.add(columnInfoListItem);
    return this;
  }

   /**
   * 栏位信息（卡包详情页面展现的栏位）
   * @return columnInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "栏位信息（卡包详情页面展现的栏位）")

  public List<TemplateColumnInfoDTO> getColumnInfoList() {
    return columnInfoList;
  }


  public void setColumnInfoList(List<TemplateColumnInfoDTO> columnInfoList) {
    this.columnInfoList = columnInfoList;
  }


  public AlipayMarketingCardTemplateModifyModel fieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList) {
    
    this.fieldRuleList = fieldRuleList;
    return this;
  }

  public AlipayMarketingCardTemplateModifyModel addFieldRuleListItem(TemplateFieldRuleDTO fieldRuleListItem) {
    if (this.fieldRuleList == null) {
      this.fieldRuleList = new ArrayList<>();
    }
    this.fieldRuleList.add(fieldRuleListItem);
    return this;
  }

   /**
   * 字段规则列表，会员卡开卡过程中，会员卡信息的生成规则， 例如：卡有效期为开卡后两年内有效，则设置为：DATE_IN_FUTURE 注意：商家会员卡场景不支持修改该内容。 
   * @return fieldRuleList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "字段规则列表，会员卡开卡过程中，会员卡信息的生成规则， 例如：卡有效期为开卡后两年内有效，则设置为：DATE_IN_FUTURE 注意：商家会员卡场景不支持修改该内容。 ")

  public List<TemplateFieldRuleDTO> getFieldRuleList() {
    return fieldRuleList;
  }


  public void setFieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList) {
    this.fieldRuleList = fieldRuleList;
  }


  public AlipayMarketingCardTemplateModifyModel mdcodeNotifyConf(TemplateMdcodeNotifyConfDTO mdcodeNotifyConf) {
    
    this.mdcodeNotifyConf = mdcodeNotifyConf;
    return this;
  }

   /**
   * Get mdcodeNotifyConf
   * @return mdcodeNotifyConf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateMdcodeNotifyConfDTO getMdcodeNotifyConf() {
    return mdcodeNotifyConf;
  }


  public void setMdcodeNotifyConf(TemplateMdcodeNotifyConfDTO mdcodeNotifyConf) {
    this.mdcodeNotifyConf = mdcodeNotifyConf;
  }


  public AlipayMarketingCardTemplateModifyModel openCardConf(TemplateOpenCardConfDTO openCardConf) {
    
    this.openCardConf = openCardConf;
    return this;
  }

   /**
   * Get openCardConf
   * @return openCardConf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateOpenCardConfDTO getOpenCardConf() {
    return openCardConf;
  }


  public void setOpenCardConf(TemplateOpenCardConfDTO openCardConf) {
    this.openCardConf = openCardConf;
  }


  public AlipayMarketingCardTemplateModifyModel paidOuterCardConf(PaidOuterCardTemplateConfDTO paidOuterCardConf) {
    
    this.paidOuterCardConf = paidOuterCardConf;
    return this;
  }

   /**
   * Get paidOuterCardConf
   * @return paidOuterCardConf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaidOuterCardTemplateConfDTO getPaidOuterCardConf() {
    return paidOuterCardConf;
  }


  public void setPaidOuterCardConf(PaidOuterCardTemplateConfDTO paidOuterCardConf) {
    this.paidOuterCardConf = paidOuterCardConf;
  }


  public AlipayMarketingCardTemplateModifyModel pubChannels(List<PubChannelDTO> pubChannels) {
    
    this.pubChannels = pubChannels;
    return this;
  }

  public AlipayMarketingCardTemplateModifyModel addPubChannelsItem(PubChannelDTO pubChannelsItem) {
    if (this.pubChannels == null) {
      this.pubChannels = new ArrayList<>();
    }
    this.pubChannels.add(pubChannelsItem);
    return this;
  }

   /**
   * 卡模板投放渠道
   * @return pubChannels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "卡模板投放渠道")

  public List<PubChannelDTO> getPubChannels() {
    return pubChannels;
  }


  public void setPubChannels(List<PubChannelDTO> pubChannels) {
    this.pubChannels = pubChannels;
  }


  public AlipayMarketingCardTemplateModifyModel requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * 请求 ID，商户自定义且需确保每次请求唯一。
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016072100000000001", value = "请求 ID，商户自定义且需确保每次请求唯一。")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public AlipayMarketingCardTemplateModifyModel shopIds(List<String> shopIds) {
    
    this.shopIds = shopIds;
    return this;
  }

  public AlipayMarketingCardTemplateModifyModel addShopIdsItem(String shopIdsItem) {
    if (this.shopIds == null) {
      this.shopIds = new ArrayList<>();
    }
    this.shopIds.add(shopIdsItem);
    return this;
  }

   /**
   * 会员卡上架门店 id（支付宝门店id），即发放会员卡的商家门店id。不传则保持创建模板时信息。 注意：不支持删除已有shop_id，仅支持新增。
   * @return shopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015122900077000000002409504", value = "会员卡上架门店 id（支付宝门店id），即发放会员卡的商家门店id。不传则保持创建模板时信息。 注意：不支持删除已有shop_id，仅支持新增。")

  public List<String> getShopIds() {
    return shopIds;
  }


  public void setShopIds(List<String> shopIds) {
    this.shopIds = shopIds;
  }


  public AlipayMarketingCardTemplateModifyModel spiAppId(String spiAppId) {
    
    this.spiAppId = spiAppId;
    return this;
  }

   /**
   * spi_app_id：若使用openspi模式开卡，该字段必填，为实现spi.alipay.user.opencard.get接口的app_id
   * @return spiAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014072300007148", value = "spi_app_id：若使用openspi模式开卡，该字段必填，为实现spi.alipay.user.opencard.get接口的app_id")

  public String getSpiAppId() {
    return spiAppId;
  }


  public void setSpiAppId(String spiAppId) {
    this.spiAppId = spiAppId;
  }


  public AlipayMarketingCardTemplateModifyModel templateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo) {
    
    this.templateBenefitInfo = templateBenefitInfo;
    return this;
  }

  public AlipayMarketingCardTemplateModifyModel addTemplateBenefitInfoItem(TemplateBenefitInfoDTO templateBenefitInfoItem) {
    if (this.templateBenefitInfo == null) {
      this.templateBenefitInfo = new ArrayList<>();
    }
    this.templateBenefitInfo.add(templateBenefitInfoItem);
    return this;
  }

   /**
   * 权益信息，  1、在卡包的卡详情页面会自动添加权益栏位，展现会员卡特权，  2、如果添加门店渠道，则可在门店页展现会员卡的权益
   * @return templateBenefitInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益信息，  1、在卡包的卡详情页面会自动添加权益栏位，展现会员卡特权，  2、如果添加门店渠道，则可在门店页展现会员卡的权益")

  public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo() {
    return templateBenefitInfo;
  }


  public void setTemplateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo) {
    this.templateBenefitInfo = templateBenefitInfo;
  }


  public AlipayMarketingCardTemplateModifyModel templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 会员卡模板id。调用alipay.marketing.card.template.create（会员卡模板创建接口）创建模板后同步返回。
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201607180000001", value = "会员卡模板id。调用alipay.marketing.card.template.create（会员卡模板创建接口）创建模板后同步返回。")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public AlipayMarketingCardTemplateModifyModel templateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
    
    this.templateStyleInfo = templateStyleInfo;
    return this;
  }

   /**
   * Get templateStyleInfo
   * @return templateStyleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateStyleInfoDTO getTemplateStyleInfo() {
    return templateStyleInfo;
  }


  public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
    this.templateStyleInfo = templateStyleInfo;
  }


  public AlipayMarketingCardTemplateModifyModel writeOffType(String writeOffType) {
    
    this.writeOffType = writeOffType;
    return this;
  }

   /**
   * 卡包详情页面中展现出的卡码（可用于扫码核销）  (1) 静态码 qrcode: 二维码，扫码得商户开卡传入的external_card_no barcode: 条形码，扫码得商户开卡传入的external_card_no  (2) 动态码-支付宝生成码值(动态码会在2分钟左右后过期) dqrcode: 动态二维码，扫码得到的码值可配合会员卡查询接口使用 dbarcode: 动态条形码，扫码得到的码值可配合会员卡查询接口使用  (3) 动态码-商家自主生成码值（码值、时效性都由商户控制） mdqrcode: 商户动态二维码，扫码得商户自主传入的码值 mdbarcode: 商户动态条码，扫码得商户自主传入的码值。 如需使用商户动态码，请联系支付宝技术支持获取相关文档。
   * @return writeOffType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "qrcode", value = "卡包详情页面中展现出的卡码（可用于扫码核销）  (1) 静态码 qrcode: 二维码，扫码得商户开卡传入的external_card_no barcode: 条形码，扫码得商户开卡传入的external_card_no  (2) 动态码-支付宝生成码值(动态码会在2分钟左右后过期) dqrcode: 动态二维码，扫码得到的码值可配合会员卡查询接口使用 dbarcode: 动态条形码，扫码得到的码值可配合会员卡查询接口使用  (3) 动态码-商家自主生成码值（码值、时效性都由商户控制） mdqrcode: 商户动态二维码，扫码得商户自主传入的码值 mdbarcode: 商户动态条码，扫码得商户自主传入的码值。 如需使用商户动态码，请联系支付宝技术支持获取相关文档。")

  public String getWriteOffType() {
    return writeOffType;
  }


  public void setWriteOffType(String writeOffType) {
    this.writeOffType = writeOffType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCardTemplateModifyModel alipayMarketingCardTemplateModifyModel = (AlipayMarketingCardTemplateModifyModel) o;
    return Objects.equals(this.bizNoPrefix, alipayMarketingCardTemplateModifyModel.bizNoPrefix) &&
        Objects.equals(this.bizNoSuffixLen, alipayMarketingCardTemplateModifyModel.bizNoSuffixLen) &&
        Objects.equals(this.cardActionList, alipayMarketingCardTemplateModifyModel.cardActionList) &&
        Objects.equals(this.cardLevelConf, alipayMarketingCardTemplateModifyModel.cardLevelConf) &&
        Objects.equals(this.cardSpecTag, alipayMarketingCardTemplateModifyModel.cardSpecTag) &&
        Objects.equals(this.columnInfoList, alipayMarketingCardTemplateModifyModel.columnInfoList) &&
        Objects.equals(this.fieldRuleList, alipayMarketingCardTemplateModifyModel.fieldRuleList) &&
        Objects.equals(this.mdcodeNotifyConf, alipayMarketingCardTemplateModifyModel.mdcodeNotifyConf) &&
        Objects.equals(this.openCardConf, alipayMarketingCardTemplateModifyModel.openCardConf) &&
        Objects.equals(this.paidOuterCardConf, alipayMarketingCardTemplateModifyModel.paidOuterCardConf) &&
        Objects.equals(this.pubChannels, alipayMarketingCardTemplateModifyModel.pubChannels) &&
        Objects.equals(this.requestId, alipayMarketingCardTemplateModifyModel.requestId) &&
        Objects.equals(this.shopIds, alipayMarketingCardTemplateModifyModel.shopIds) &&
        Objects.equals(this.spiAppId, alipayMarketingCardTemplateModifyModel.spiAppId) &&
        Objects.equals(this.templateBenefitInfo, alipayMarketingCardTemplateModifyModel.templateBenefitInfo) &&
        Objects.equals(this.templateId, alipayMarketingCardTemplateModifyModel.templateId) &&
        Objects.equals(this.templateStyleInfo, alipayMarketingCardTemplateModifyModel.templateStyleInfo) &&
        Objects.equals(this.writeOffType, alipayMarketingCardTemplateModifyModel.writeOffType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizNoPrefix, bizNoSuffixLen, cardActionList, cardLevelConf, cardSpecTag, columnInfoList, fieldRuleList, mdcodeNotifyConf, openCardConf, paidOuterCardConf, pubChannels, requestId, shopIds, spiAppId, templateBenefitInfo, templateId, templateStyleInfo, writeOffType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCardTemplateModifyModel {\n");
    sb.append("    bizNoPrefix: ").append(toIndentedString(bizNoPrefix)).append("\n");
    sb.append("    bizNoSuffixLen: ").append(toIndentedString(bizNoSuffixLen)).append("\n");
    sb.append("    cardActionList: ").append(toIndentedString(cardActionList)).append("\n");
    sb.append("    cardLevelConf: ").append(toIndentedString(cardLevelConf)).append("\n");
    sb.append("    cardSpecTag: ").append(toIndentedString(cardSpecTag)).append("\n");
    sb.append("    columnInfoList: ").append(toIndentedString(columnInfoList)).append("\n");
    sb.append("    fieldRuleList: ").append(toIndentedString(fieldRuleList)).append("\n");
    sb.append("    mdcodeNotifyConf: ").append(toIndentedString(mdcodeNotifyConf)).append("\n");
    sb.append("    openCardConf: ").append(toIndentedString(openCardConf)).append("\n");
    sb.append("    paidOuterCardConf: ").append(toIndentedString(paidOuterCardConf)).append("\n");
    sb.append("    pubChannels: ").append(toIndentedString(pubChannels)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    shopIds: ").append(toIndentedString(shopIds)).append("\n");
    sb.append("    spiAppId: ").append(toIndentedString(spiAppId)).append("\n");
    sb.append("    templateBenefitInfo: ").append(toIndentedString(templateBenefitInfo)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateStyleInfo: ").append(toIndentedString(templateStyleInfo)).append("\n");
    sb.append("    writeOffType: ").append(toIndentedString(writeOffType)).append("\n");
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
    openapiFields.add("biz_no_prefix");
    openapiFields.add("biz_no_suffix_len");
    openapiFields.add("card_action_list");
    openapiFields.add("card_level_conf");
    openapiFields.add("card_spec_tag");
    openapiFields.add("column_info_list");
    openapiFields.add("field_rule_list");
    openapiFields.add("mdcode_notify_conf");
    openapiFields.add("open_card_conf");
    openapiFields.add("paid_outer_card_conf");
    openapiFields.add("pub_channels");
    openapiFields.add("request_id");
    openapiFields.add("shop_ids");
    openapiFields.add("spi_app_id");
    openapiFields.add("template_benefit_info");
    openapiFields.add("template_id");
    openapiFields.add("template_style_info");
    openapiFields.add("write_off_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCardTemplateModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCardTemplateModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCardTemplateModifyModel is not found in the empty JSON string", AlipayMarketingCardTemplateModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCardTemplateModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCardTemplateModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_no_prefix") != null && !jsonObj.get("biz_no_prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_no_prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_no_prefix").toString()));
      }
      if (jsonObj.get("biz_no_suffix_len") != null && !jsonObj.get("biz_no_suffix_len").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_no_suffix_len` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_no_suffix_len").toString()));
      }
      JsonArray jsonArraycardActionList = jsonObj.getAsJsonArray("card_action_list");
      if (jsonArraycardActionList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("card_action_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `card_action_list` to be an array in the JSON string but got `%s`", jsonObj.get("card_action_list").toString()));
        }

        // validate the optional field `card_action_list` (array)
        for (int i = 0; i < jsonArraycardActionList.size(); i++) {
          TemplateActionInfoDTO.validateJsonObject(jsonArraycardActionList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraycardLevelConf = jsonObj.getAsJsonArray("card_level_conf");
      if (jsonArraycardLevelConf != null) {
        // ensure the json data is an array
        if (!jsonObj.get("card_level_conf").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `card_level_conf` to be an array in the JSON string but got `%s`", jsonObj.get("card_level_conf").toString()));
        }

        // validate the optional field `card_level_conf` (array)
        for (int i = 0; i < jsonArraycardLevelConf.size(); i++) {
          TemplateCardLevelConfDTO.validateJsonObject(jsonArraycardLevelConf.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("card_spec_tag") != null && !jsonObj.get("card_spec_tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_spec_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_spec_tag").toString()));
      }
      JsonArray jsonArraycolumnInfoList = jsonObj.getAsJsonArray("column_info_list");
      if (jsonArraycolumnInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("column_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `column_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("column_info_list").toString()));
        }

        // validate the optional field `column_info_list` (array)
        for (int i = 0; i < jsonArraycolumnInfoList.size(); i++) {
          TemplateColumnInfoDTO.validateJsonObject(jsonArraycolumnInfoList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayfieldRuleList = jsonObj.getAsJsonArray("field_rule_list");
      if (jsonArrayfieldRuleList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("field_rule_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `field_rule_list` to be an array in the JSON string but got `%s`", jsonObj.get("field_rule_list").toString()));
        }

        // validate the optional field `field_rule_list` (array)
        for (int i = 0; i < jsonArrayfieldRuleList.size(); i++) {
          TemplateFieldRuleDTO.validateJsonObject(jsonArrayfieldRuleList.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `mdcode_notify_conf`
      if (jsonObj.getAsJsonObject("mdcode_notify_conf") != null) {
        TemplateMdcodeNotifyConfDTO.validateJsonObject(jsonObj.getAsJsonObject("mdcode_notify_conf"));
      }
      // validate the optional field `open_card_conf`
      if (jsonObj.getAsJsonObject("open_card_conf") != null) {
        TemplateOpenCardConfDTO.validateJsonObject(jsonObj.getAsJsonObject("open_card_conf"));
      }
      // validate the optional field `paid_outer_card_conf`
      if (jsonObj.getAsJsonObject("paid_outer_card_conf") != null) {
        PaidOuterCardTemplateConfDTO.validateJsonObject(jsonObj.getAsJsonObject("paid_outer_card_conf"));
      }
      JsonArray jsonArraypubChannels = jsonObj.getAsJsonArray("pub_channels");
      if (jsonArraypubChannels != null) {
        // ensure the json data is an array
        if (!jsonObj.get("pub_channels").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `pub_channels` to be an array in the JSON string but got `%s`", jsonObj.get("pub_channels").toString()));
        }

        // validate the optional field `pub_channels` (array)
        for (int i = 0; i < jsonArraypubChannels.size(); i++) {
          PubChannelDTO.validateJsonObject(jsonArraypubChannels.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("request_id") != null && !jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("shop_ids") != null && !jsonObj.get("shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("shop_ids").toString()));
      }
      if (jsonObj.get("spi_app_id") != null && !jsonObj.get("spi_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spi_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spi_app_id").toString()));
      }
      JsonArray jsonArraytemplateBenefitInfo = jsonObj.getAsJsonArray("template_benefit_info");
      if (jsonArraytemplateBenefitInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("template_benefit_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `template_benefit_info` to be an array in the JSON string but got `%s`", jsonObj.get("template_benefit_info").toString()));
        }

        // validate the optional field `template_benefit_info` (array)
        for (int i = 0; i < jsonArraytemplateBenefitInfo.size(); i++) {
          TemplateBenefitInfoDTO.validateJsonObject(jsonArraytemplateBenefitInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      // validate the optional field `template_style_info`
      if (jsonObj.getAsJsonObject("template_style_info") != null) {
        TemplateStyleInfoDTO.validateJsonObject(jsonObj.getAsJsonObject("template_style_info"));
      }
      if (jsonObj.get("write_off_type") != null && !jsonObj.get("write_off_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `write_off_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("write_off_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCardTemplateModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCardTemplateModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCardTemplateModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCardTemplateModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCardTemplateModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCardTemplateModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCardTemplateModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCardTemplateModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCardTemplateModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCardTemplateModifyModel
  */
  public static AlipayMarketingCardTemplateModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCardTemplateModifyModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCardTemplateModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

