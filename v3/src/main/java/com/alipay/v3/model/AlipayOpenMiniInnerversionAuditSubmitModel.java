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
import com.alipay.v3.model.AuditLicenseInfo;
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
 * AlipayOpenMiniInnerversionAuditSubmitModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionAuditSubmitModel {
  public static final String SERIALIZED_NAME_APP_CATEGORY_IDS = "app_category_ids";
  @SerializedName(SERIALIZED_NAME_APP_CATEGORY_IDS)
  private String appCategoryIds;

  public static final String SERIALIZED_NAME_APP_DESC = "app_desc";
  @SerializedName(SERIALIZED_NAME_APP_DESC)
  private String appDesc;

  public static final String SERIALIZED_NAME_APP_ENGLISH_NAME = "app_english_name";
  @SerializedName(SERIALIZED_NAME_APP_ENGLISH_NAME)
  private String appEnglishName;

  public static final String SERIALIZED_NAME_APP_LOGO = "app_logo";
  @SerializedName(SERIALIZED_NAME_APP_LOGO)
  private String appLogo;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private String appOrigin;

  public static final String SERIALIZED_NAME_APP_SLOGAN = "app_slogan";
  @SerializedName(SERIALIZED_NAME_APP_SLOGAN)
  private String appSlogan;

  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_LICENSE_INFO = "license_info";
  @SerializedName(SERIALIZED_NAME_LICENSE_INFO)
  private AuditLicenseInfo licenseInfo;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_MINI_CATEGORY_IDS = "mini_category_ids";
  @SerializedName(SERIALIZED_NAME_MINI_CATEGORY_IDS)
  private String miniCategoryIds;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OUT_DOOR_PIC = "out_door_pic";
  @SerializedName(SERIALIZED_NAME_OUT_DOOR_PIC)
  private String outDoorPic;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_SCREEN_SHOT_LIST = "screen_shot_list";
  @SerializedName(SERIALIZED_NAME_SCREEN_SHOT_LIST)
  private List<String> screenShotList = null;

  public static final String SERIALIZED_NAME_SERVICE_EMAIL = "service_email";
  @SerializedName(SERIALIZED_NAME_SERVICE_EMAIL)
  private String serviceEmail;

  public static final String SERIALIZED_NAME_SERVICE_PHONE = "service_phone";
  @SerializedName(SERIALIZED_NAME_SERVICE_PHONE)
  private String servicePhone;

  public static final String SERIALIZED_NAME_SPECIAL_LICENSE_PIC_LIST = "special_license_pic_list";
  @SerializedName(SERIALIZED_NAME_SPECIAL_LICENSE_PIC_LIST)
  private String specialLicensePicList;

  public static final String SERIALIZED_NAME_VERSION_DESC = "version_desc";
  @SerializedName(SERIALIZED_NAME_VERSION_DESC)
  private String versionDesc;

  public AlipayOpenMiniInnerversionAuditSubmitModel() { 
  }

  public AlipayOpenMiniInnerversionAuditSubmitModel appCategoryIds(String appCategoryIds) {
    
    this.appCategoryIds = appCategoryIds;
    return this;
  }

   /**
   * 小程序类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目，详细类目可以参考&lt;a href&#x3D;‘https://opendocs.alipay.com/b/03al2m’&gt;开放服务类目&lt;/a&gt;，如果不填默认采用当前小程序应用类目。使用默认应用类目后不需要再次上传营业执照号、营业执照名、营业执照截图、营业执照有效期。
   * @return appCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "107211_ 107427", value = "小程序类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目，详细类目可以参考<a href=‘https://opendocs.alipay.com/b/03al2m’>开放服务类目</a>，如果不填默认采用当前小程序应用类目。使用默认应用类目后不需要再次上传营业执照号、营业执照名、营业执照截图、营业执照有效期。")

  public String getAppCategoryIds() {
    return appCategoryIds;
  }


  public void setAppCategoryIds(String appCategoryIds) {
    this.appCategoryIds = appCategoryIds;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel appDesc(String appDesc) {
    
    this.appDesc = appDesc;
    return this;
  }

   /**
   * 小程序应用描述，20-200个字，如果不填默认采用当前小程序的应用描述
   * @return appDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是一个小程序的描述这是一个小程序的描述这是一个小程序的描述这是一个小程序的描述", value = "小程序应用描述，20-200个字，如果不填默认采用当前小程序的应用描述")

  public String getAppDesc() {
    return appDesc;
  }


  public void setAppDesc(String appDesc) {
    this.appDesc = appDesc;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel appEnglishName(String appEnglishName) {
    
    this.appEnglishName = appEnglishName;
    return this;
  }

   /**
   * 小程序应用英文名称，如果不填默认采用当前小程序应用英文名称，3～30个字符。插件不填
   * @return appEnglishName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "demoenname", value = "小程序应用英文名称，如果不填默认采用当前小程序应用英文名称，3～30个字符。插件不填")

  public String getAppEnglishName() {
    return appEnglishName;
  }


  public void setAppEnglishName(String appEnglishName) {
    this.appEnglishName = appEnglishName;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel appLogo(String appLogo) {
    
    this.appLogo = appLogo;
    return this;
  }

   /**
   * 小程序logo图标，图片格式必须为：png、jpeg、jpg，比例必须为1:1，建议上传像素为180*180，不超过256kb， 如果不填默认采用当前小程序应用logo图标
   * @return appLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://appstoreisvpic.alipayobjects.com/prod/f9e291ed-0de5-4f5e-97ec-f76b8414a3e0.png", value = "小程序logo图标，图片格式必须为：png、jpeg、jpg，比例必须为1:1，建议上传像素为180*180，不超过256kb， 如果不填默认采用当前小程序应用logo图标")

  public String getAppLogo() {
    return appLogo;
  }


  public void setAppLogo(String appLogo) {
    this.appLogo = appLogo;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 小程序应用名称，如果不填默认采用当前小程序应用名称，名称3-40个字符，一个中文算两个字符
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XXX的应用", value = "小程序应用名称，如果不填默认采用当前小程序应用名称，名称3-40个字符，一个中文算两个字符")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel appOrigin(String appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * 来源类型，新接入方需要向支付宝申请专用来源，否则不予接入，申请方式请参见接入手册。
   * @return appOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AAA", value = "来源类型，新接入方需要向支付宝申请专用来源，否则不予接入，申请方式请参见接入手册。")

  public String getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(String appOrigin) {
    this.appOrigin = appOrigin;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel appSlogan(String appSlogan) {
    
    this.appSlogan = appSlogan;
    return this;
  }

   /**
   * 小程序应用简介，一句话描述小程序功能，如果不填默认采用当前小程序应用简介，10~32个字符
   * @return appSlogan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "示例slogan", value = "小程序应用简介，一句话描述小程序功能，如果不填默认采用当前小程序应用简介，10~32个字符")

  public String getAppSlogan() {
    return appSlogan;
  }


  public void setAppSlogan(String appSlogan) {
    this.appSlogan = appSlogan;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 需要提交审核的小程序版本号，格式为: x.y.z，其中x、y、z均为整型数字，一个应用最多只能有一个审核中、审核通过或者审核驳回的版本。
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.1", value = "需要提交审核的小程序版本号，格式为: x.y.z，其中x、y、z均为整型数字，一个应用最多只能有一个审核中、审核通过或者审核驳回的版本。")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 端ID，多端场景下区分不同端
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "com.alipay.alipaywallet", value = "端ID，多端场景下区分不同端")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel licenseInfo(AuditLicenseInfo licenseInfo) {
    
    this.licenseInfo = licenseInfo;
    return this;
  }

   /**
   * Get licenseInfo
   * @return licenseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuditLicenseInfo getLicenseInfo() {
    return licenseInfo;
  }


  public void setLicenseInfo(AuditLicenseInfo licenseInfo) {
    this.licenseInfo = licenseInfo;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 小程序备注
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序备注示例", value = "小程序备注")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序ID，特殊场景专用，普通业务方无需关注该参数。
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019051464523527", value = "小程序ID，特殊场景专用，普通业务方无需关注该参数。")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel miniCategoryIds(String miniCategoryIds) {
    
    this.miniCategoryIds = miniCategoryIds;
    return this;
  }

   /**
   * 新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 &lt;a href&#x3D;&#39;https://opendocs.alipay.com/mini/03l8c6&#39;&gt;alipay.open.mini.category.query&lt;/a&gt;（小程序类目树查询接口）查询mini_category_list，如果不填默认采用当前小程序应用类目。使用默认应用类目后不需要再次上传营业执照号、营业执照名、营业执照截图、营业执照有效期。使用后不再读取app_category_ids值，老前台类目将废弃
   * @return miniCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XS1001_XS2001_XS3002;XS1011_XS2089;XS1002_XS2008_XS3024", value = "新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 <a href='https://opendocs.alipay.com/mini/03l8c6'>alipay.open.mini.category.query</a>（小程序类目树查询接口）查询mini_category_list，如果不填默认采用当前小程序应用类目。使用默认应用类目后不需要再次上传营业执照号、营业执照名、营业执照截图、营业执照有效期。使用后不再读取app_category_ids值，老前台类目将废弃")

  public String getMiniCategoryIds() {
    return miniCategoryIds;
  }


  public void setMiniCategoryIds(String miniCategoryIds) {
    this.miniCategoryIds = miniCategoryIds;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 小程序所属PID
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "小程序所属PID")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel outDoorPic(String outDoorPic) {
    
    this.outDoorPic = outDoorPic;
    return this;
  }

   /**
   * 门头照图片地址，部分小程序类目需要提交，参照 &lt;a href&#x3D;‘https://opendocs.alipay.com/b/03al2m’&gt;开放服务类目&lt;/a&gt; 中是否需要营业执照信息，如果不填默认采用当前小程序门头照图片
   * @return outDoorPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://appstoreisvpic.alipayobjects.com/prod/c74a6310-4695-48d7-8f1b-4e5cc11c7615.jpg", value = "门头照图片地址，部分小程序类目需要提交，参照 <a href=‘https://opendocs.alipay.com/b/03al2m’>开放服务类目</a> 中是否需要营业执照信息，如果不填默认采用当前小程序门头照图片")

  public String getOutDoorPic() {
    return outDoorPic;
  }


  public void setOutDoorPic(String outDoorPic) {
    this.outDoorPic = outDoorPic;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 小程序所属PID
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088****", value = "小程序所属PID")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel screenShotList(List<String> screenShotList) {
    
    this.screenShotList = screenShotList;
    return this;
  }

  public AlipayOpenMiniInnerversionAuditSubmitModel addScreenShotListItem(String screenShotListItem) {
    if (this.screenShotList == null) {
      this.screenShotList = new ArrayList<>();
    }
    this.screenShotList.add(screenShotListItem);
    return this;
  }

   /**
   * 小程序应用截图列表，逗号分割，需要2-5张图片，单张图片不能超过4MB，图片格式只支持jpg，png；通过模板实例化小程序不需要传递此参数。
   * @return screenShotList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://appstoreisvpic.alipayobjects.com/prod/c74a6310-4695-48d7-8f1b-4e5cc11c7615.jpg,https://app.alipayobjects.com/ss.jpg", value = "小程序应用截图列表，逗号分割，需要2-5张图片，单张图片不能超过4MB，图片格式只支持jpg，png；通过模板实例化小程序不需要传递此参数。")

  public List<String> getScreenShotList() {
    return screenShotList;
  }


  public void setScreenShotList(List<String> screenShotList) {
    this.screenShotList = screenShotList;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel serviceEmail(String serviceEmail) {
    
    this.serviceEmail = serviceEmail;
    return this;
  }

   /**
   * 小程序客服邮箱，如果不填默认采用当前小程序的应用客服邮箱，和客服电话至少填写一个
   * @return serviceEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example@mail.com", value = "小程序客服邮箱，如果不填默认采用当前小程序的应用客服邮箱，和客服电话至少填写一个")

  public String getServiceEmail() {
    return serviceEmail;
  }


  public void setServiceEmail(String serviceEmail) {
    this.serviceEmail = serviceEmail;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel servicePhone(String servicePhone) {
    
    this.servicePhone = servicePhone;
    return this;
  }

   /**
   * 小程序客服电话，如果不填默认采用当前小程序的应用客服电话，和客服邮箱至少填写一个。插件不填
   * @return servicePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13110101010", value = "小程序客服电话，如果不填默认采用当前小程序的应用客服电话，和客服邮箱至少填写一个。插件不填")

  public String getServicePhone() {
    return servicePhone;
  }


  public void setServicePhone(String servicePhone) {
    this.servicePhone = servicePhone;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel specialLicensePicList(String specialLicensePicList) {
    
    this.specialLicensePicList = specialLicensePicList;
    return this;
  }

   /**
   * 特殊资质图片地址列表，逗号分隔；部分类目需要特殊资质，如果需要特殊资质，最少一张，最多三张。模板和插件不需要特殊资质
   * @return specialLicensePicList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://appstoreisvpic.alipayobjects.com/prod/c74a6310-4695-48d7-8f1b-4e5cc11c7615.jpg,https://appstoreisvpic.alipayobjects.com/prod/c74a6310-4695-48d7-8f1b-4e5cc11c7615.jpg", value = "特殊资质图片地址列表，逗号分隔；部分类目需要特殊资质，如果需要特殊资质，最少一张，最多三张。模板和插件不需要特殊资质")

  public String getSpecialLicensePicList() {
    return specialLicensePicList;
  }


  public void setSpecialLicensePicList(String specialLicensePicList) {
    this.specialLicensePicList = specialLicensePicList;
  }


  public AlipayOpenMiniInnerversionAuditSubmitModel versionDesc(String versionDesc) {
    
    this.versionDesc = versionDesc;
    return this;
  }

   /**
   * 小程序版本变更描述，30-500个字符，区分于app_desc
   * @return versionDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "本版本主要新增了XXX功能：1、xxxxxxx； 2、xxxxxx；修复了XXXbug：1、xxxxxx；2、xxxxxx", value = "小程序版本变更描述，30-500个字符，区分于app_desc")

  public String getVersionDesc() {
    return versionDesc;
  }


  public void setVersionDesc(String versionDesc) {
    this.versionDesc = versionDesc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerversionAuditSubmitModel alipayOpenMiniInnerversionAuditSubmitModel = (AlipayOpenMiniInnerversionAuditSubmitModel) o;
    return Objects.equals(this.appCategoryIds, alipayOpenMiniInnerversionAuditSubmitModel.appCategoryIds) &&
        Objects.equals(this.appDesc, alipayOpenMiniInnerversionAuditSubmitModel.appDesc) &&
        Objects.equals(this.appEnglishName, alipayOpenMiniInnerversionAuditSubmitModel.appEnglishName) &&
        Objects.equals(this.appLogo, alipayOpenMiniInnerversionAuditSubmitModel.appLogo) &&
        Objects.equals(this.appName, alipayOpenMiniInnerversionAuditSubmitModel.appName) &&
        Objects.equals(this.appOrigin, alipayOpenMiniInnerversionAuditSubmitModel.appOrigin) &&
        Objects.equals(this.appSlogan, alipayOpenMiniInnerversionAuditSubmitModel.appSlogan) &&
        Objects.equals(this.appVersion, alipayOpenMiniInnerversionAuditSubmitModel.appVersion) &&
        Objects.equals(this.bundleId, alipayOpenMiniInnerversionAuditSubmitModel.bundleId) &&
        Objects.equals(this.licenseInfo, alipayOpenMiniInnerversionAuditSubmitModel.licenseInfo) &&
        Objects.equals(this.memo, alipayOpenMiniInnerversionAuditSubmitModel.memo) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerversionAuditSubmitModel.miniAppId) &&
        Objects.equals(this.miniCategoryIds, alipayOpenMiniInnerversionAuditSubmitModel.miniCategoryIds) &&
        Objects.equals(this.openId, alipayOpenMiniInnerversionAuditSubmitModel.openId) &&
        Objects.equals(this.outDoorPic, alipayOpenMiniInnerversionAuditSubmitModel.outDoorPic) &&
        Objects.equals(this.pid, alipayOpenMiniInnerversionAuditSubmitModel.pid) &&
        Objects.equals(this.screenShotList, alipayOpenMiniInnerversionAuditSubmitModel.screenShotList) &&
        Objects.equals(this.serviceEmail, alipayOpenMiniInnerversionAuditSubmitModel.serviceEmail) &&
        Objects.equals(this.servicePhone, alipayOpenMiniInnerversionAuditSubmitModel.servicePhone) &&
        Objects.equals(this.specialLicensePicList, alipayOpenMiniInnerversionAuditSubmitModel.specialLicensePicList) &&
        Objects.equals(this.versionDesc, alipayOpenMiniInnerversionAuditSubmitModel.versionDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCategoryIds, appDesc, appEnglishName, appLogo, appName, appOrigin, appSlogan, appVersion, bundleId, licenseInfo, memo, miniAppId, miniCategoryIds, openId, outDoorPic, pid, screenShotList, serviceEmail, servicePhone, specialLicensePicList, versionDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionAuditSubmitModel {\n");
    sb.append("    appCategoryIds: ").append(toIndentedString(appCategoryIds)).append("\n");
    sb.append("    appDesc: ").append(toIndentedString(appDesc)).append("\n");
    sb.append("    appEnglishName: ").append(toIndentedString(appEnglishName)).append("\n");
    sb.append("    appLogo: ").append(toIndentedString(appLogo)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    appSlogan: ").append(toIndentedString(appSlogan)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    licenseInfo: ").append(toIndentedString(licenseInfo)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    miniCategoryIds: ").append(toIndentedString(miniCategoryIds)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outDoorPic: ").append(toIndentedString(outDoorPic)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    screenShotList: ").append(toIndentedString(screenShotList)).append("\n");
    sb.append("    serviceEmail: ").append(toIndentedString(serviceEmail)).append("\n");
    sb.append("    servicePhone: ").append(toIndentedString(servicePhone)).append("\n");
    sb.append("    specialLicensePicList: ").append(toIndentedString(specialLicensePicList)).append("\n");
    sb.append("    versionDesc: ").append(toIndentedString(versionDesc)).append("\n");
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
    openapiFields.add("app_category_ids");
    openapiFields.add("app_desc");
    openapiFields.add("app_english_name");
    openapiFields.add("app_logo");
    openapiFields.add("app_name");
    openapiFields.add("app_origin");
    openapiFields.add("app_slogan");
    openapiFields.add("app_version");
    openapiFields.add("bundle_id");
    openapiFields.add("license_info");
    openapiFields.add("memo");
    openapiFields.add("mini_app_id");
    openapiFields.add("mini_category_ids");
    openapiFields.add("open_id");
    openapiFields.add("out_door_pic");
    openapiFields.add("pid");
    openapiFields.add("screen_shot_list");
    openapiFields.add("service_email");
    openapiFields.add("service_phone");
    openapiFields.add("special_license_pic_list");
    openapiFields.add("version_desc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionAuditSubmitModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionAuditSubmitModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionAuditSubmitModel is not found in the empty JSON string", AlipayOpenMiniInnerversionAuditSubmitModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerversionAuditSubmitModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerversionAuditSubmitModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_category_ids") != null && !jsonObj.get("app_category_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_category_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_category_ids").toString()));
      }
      if (jsonObj.get("app_desc") != null && !jsonObj.get("app_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_desc").toString()));
      }
      if (jsonObj.get("app_english_name") != null && !jsonObj.get("app_english_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_english_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_english_name").toString()));
      }
      if (jsonObj.get("app_logo") != null && !jsonObj.get("app_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_logo").toString()));
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("app_origin") != null && !jsonObj.get("app_origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_origin").toString()));
      }
      if (jsonObj.get("app_slogan") != null && !jsonObj.get("app_slogan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_slogan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_slogan").toString()));
      }
      if (jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      // validate the optional field `license_info`
      if (jsonObj.getAsJsonObject("license_info") != null) {
        AuditLicenseInfo.validateJsonObject(jsonObj.getAsJsonObject("license_info"));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("mini_category_ids") != null && !jsonObj.get("mini_category_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_category_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_category_ids").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("out_door_pic") != null && !jsonObj.get("out_door_pic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_door_pic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_door_pic").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("screen_shot_list") != null && !jsonObj.get("screen_shot_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `screen_shot_list` to be an array in the JSON string but got `%s`", jsonObj.get("screen_shot_list").toString()));
      }
      if (jsonObj.get("service_email") != null && !jsonObj.get("service_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_email").toString()));
      }
      if (jsonObj.get("service_phone") != null && !jsonObj.get("service_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_phone").toString()));
      }
      if (jsonObj.get("special_license_pic_list") != null && !jsonObj.get("special_license_pic_list").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `special_license_pic_list` to be a primitive type in the JSON string but got `%s`", jsonObj.get("special_license_pic_list").toString()));
      }
      if (jsonObj.get("version_desc") != null && !jsonObj.get("version_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerversionAuditSubmitModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionAuditSubmitModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionAuditSubmitModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionAuditSubmitModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionAuditSubmitModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionAuditSubmitModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerversionAuditSubmitModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerversionAuditSubmitModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionAuditSubmitModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionAuditSubmitModel
  */
  public static AlipayOpenMiniInnerversionAuditSubmitModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionAuditSubmitModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionAuditSubmitModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

