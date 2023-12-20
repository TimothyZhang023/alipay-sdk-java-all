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
 * AlipayOpenMiniInnerbaseinfoQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerbaseinfoQueryResponseModel {
  public static final String SERIALIZED_NAME_APP_ALIAS_NAME = "app_alias_name";
  @SerializedName(SERIALIZED_NAME_APP_ALIAS_NAME)
  private String appAliasName;

  public static final String SERIALIZED_NAME_APP_CATEGORY_IDS = "app_category_ids";
  @SerializedName(SERIALIZED_NAME_APP_CATEGORY_IDS)
  private String appCategoryIds;

  public static final String SERIALIZED_NAME_APP_DESC = "app_desc";
  @SerializedName(SERIALIZED_NAME_APP_DESC)
  private String appDesc;

  public static final String SERIALIZED_NAME_APP_ENGLISH_NAME = "app_english_name";
  @SerializedName(SERIALIZED_NAME_APP_ENGLISH_NAME)
  private String appEnglishName;

  public static final String SERIALIZED_NAME_APP_KEY = "app_key";
  @SerializedName(SERIALIZED_NAME_APP_KEY)
  private String appKey;

  public static final String SERIALIZED_NAME_APP_LOGO = "app_logo";
  @SerializedName(SERIALIZED_NAME_APP_LOGO)
  private String appLogo;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APP_SLOGAN = "app_slogan";
  @SerializedName(SERIALIZED_NAME_APP_SLOGAN)
  private String appSlogan;

  public static final String SERIALIZED_NAME_APP_SUB_TYPE = "app_sub_type";
  @SerializedName(SERIALIZED_NAME_APP_SUB_TYPE)
  private String appSubType;

  public static final String SERIALIZED_NAME_DEV_ID = "dev_id";
  @SerializedName(SERIALIZED_NAME_DEV_ID)
  private String devId;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_MINI_CATEGORY_IDS = "mini_category_ids";
  @SerializedName(SERIALIZED_NAME_MINI_CATEGORY_IDS)
  private String miniCategoryIds;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_OWNER_ENTITY = "owner_entity";
  @SerializedName(SERIALIZED_NAME_OWNER_ENTITY)
  private String ownerEntity;

  public static final String SERIALIZED_NAME_OWNER_PORTRAIT = "owner_portrait";
  @SerializedName(SERIALIZED_NAME_OWNER_PORTRAIT)
  private String ownerPortrait;

  public static final String SERIALIZED_NAME_PLUGIN_REFRESH_TYPE = "plugin_refresh_type";
  @SerializedName(SERIALIZED_NAME_PLUGIN_REFRESH_TYPE)
  private String pluginRefreshType;

  public static final String SERIALIZED_NAME_SERVICE_EMAIL = "service_email";
  @SerializedName(SERIALIZED_NAME_SERVICE_EMAIL)
  private String serviceEmail;

  public static final String SERIALIZED_NAME_SERVICE_PHONE = "service_phone";
  @SerializedName(SERIALIZED_NAME_SERVICE_PHONE)
  private String servicePhone;

  public AlipayOpenMiniInnerbaseinfoQueryResponseModel() { 
  }

  public AlipayOpenMiniInnerbaseinfoQueryResponseModel appAliasName(String appAliasName) {
    
    this.appAliasName = appAliasName;
    return this;
  }

   /**
   * 小程序别名，简称
   * @return appAliasName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序别名，简称", value = "小程序别名，简称")

  public String getAppAliasName() {
    return appAliasName;
  }


  public void setAppAliasName(String appAliasName) {
    this.appAliasName = appAliasName;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel appCategoryIds(String appCategoryIds) {
    
    this.appCategoryIds = appCategoryIds;
    return this;
  }

   /**
   * 类目Id列表
   * @return appCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "107209_107226;107209_107227", value = "类目Id列表")

  public String getAppCategoryIds() {
    return appCategoryIds;
  }


  public void setAppCategoryIds(String appCategoryIds) {
    this.appCategoryIds = appCategoryIds;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel appDesc(String appDesc) {
    
    this.appDesc = appDesc;
    return this;
  }

   /**
   * 小程序应用描述
   * @return appDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序官方示例Demo，展示已支持的接口能力及组件。", value = "小程序应用描述")

  public String getAppDesc() {
    return appDesc;
  }


  public void setAppDesc(String appDesc) {
    this.appDesc = appDesc;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel appEnglishName(String appEnglishName) {
    
    this.appEnglishName = appEnglishName;
    return this;
  }

   /**
   * 小程序英文名称
   * @return appEnglishName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tinyapp", value = "小程序英文名称")

  public String getAppEnglishName() {
    return appEnglishName;
  }


  public void setAppEnglishName(String appEnglishName) {
    this.appEnglishName = appEnglishName;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel appKey(String appKey) {
    
    this.appKey = appKey;
    return this;
  }

   /**
   * 手淘开放平台鉴权key，支付宝不需要
   * @return appKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test", value = "手淘开放平台鉴权key，支付宝不需要")

  public String getAppKey() {
    return appKey;
  }


  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel appLogo(String appLogo) {
    
    this.appLogo = appLogo;
    return this;
  }

   /**
   * 小程序应用logo图标
   * @return appLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://appstoreisvpic.alipayobjects.com/prod/04843e84-f1fd-4717-a230-1c72de99aa5d.png", value = "小程序应用logo图标")

  public String getAppLogo() {
    return appLogo;
  }


  public void setAppLogo(String appLogo) {
    this.appLogo = appLogo;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 小程序名称
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序名称", value = "小程序名称")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel appSlogan(String appSlogan) {
    
    this.appSlogan = appSlogan;
    return this;
  }

   /**
   * 小程序简介
   * @return appSlogan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序简介", value = "小程序简介")

  public String getAppSlogan() {
    return appSlogan;
  }


  public void setAppSlogan(String appSlogan) {
    this.appSlogan = appSlogan;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel appSubType(String appSubType) {
    
    this.appSubType = appSubType;
    return this;
  }

   /**
   * 小程序类型，TINYAPP_TEMPLATE，TINYAPP_NORMAL，TINYAPP_PLUGIN
   * @return appSubType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TINYAPP_TEMPLATE", value = "小程序类型，TINYAPP_TEMPLATE，TINYAPP_NORMAL，TINYAPP_PLUGIN")

  public String getAppSubType() {
    return appSubType;
  }


  public void setAppSubType(String appSubType) {
    this.appSubType = appSubType;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel devId(String devId) {
    
    this.devId = devId;
    return this;
  }

   /**
   * 小程序所属主体信息
   * @return devId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301139347331", value = "小程序所属主体信息")

  public String getDevId() {
    return devId;
  }


  public void setDevId(String devId) {
    this.devId = devId;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 小程序主体创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-12-12 12:00:00", value = "小程序主体创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 小程序主体更新时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-12-12 12:00:00", value = "小程序主体更新时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序Id
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3000000000001501", value = "小程序Id")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel miniCategoryIds(String miniCategoryIds) {
    
    this.miniCategoryIds = miniCategoryIds;
    return this;
  }

   /**
   * 新小程序前台类目，一级与二级、三级用下划线隔开，最多可以选四个类目，类目之间;隔开。使用后不再读取app_category_ids值，老前台类目将废弃
   * @return miniCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XS1001_XS2001_XS3002;XS1011_XS2089;XS1002_XS2008_XS3024", value = "新小程序前台类目，一级与二级、三级用下划线隔开，最多可以选四个类目，类目之间;隔开。使用后不再读取app_category_ids值，老前台类目将废弃")

  public String getMiniCategoryIds() {
    return miniCategoryIds;
  }


  public void setMiniCategoryIds(String miniCategoryIds) {
    this.miniCategoryIds = miniCategoryIds;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel origin(String origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * 应用创建来源，alipay &#x3D; 支付宝，taobao &#x3D; 淘宝
   * @return origin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipay", value = "应用创建来源，alipay = 支付宝，taobao = 淘宝")

  public String getOrigin() {
    return origin;
  }


  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel ownerEntity(String ownerEntity) {
    
    this.ownerEntity = ownerEntity;
    return this;
  }

   /**
   * 小程序主体信息
   * @return ownerEntity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0001", value = "小程序主体信息")

  public String getOwnerEntity() {
    return ownerEntity;
  }


  public void setOwnerEntity(String ownerEntity) {
    this.ownerEntity = ownerEntity;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel ownerPortrait(String ownerPortrait) {
    
    this.ownerPortrait = ownerPortrait;
    return this;
  }

   /**
   * 小程序主体头像信息
   * @return ownerPortrait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://www.alipay.icon.com", value = "小程序主体头像信息")

  public String getOwnerPortrait() {
    return ownerPortrait;
  }


  public void setOwnerPortrait(String ownerPortrait) {
    this.ownerPortrait = ownerPortrait;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel pluginRefreshType(String pluginRefreshType) {
    
    this.pluginRefreshType = pluginRefreshType;
    return this;
  }

   /**
   * AUTO/自动更新、MANUAL/手动更新
   * @return pluginRefreshType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MANUAL", value = "AUTO/自动更新、MANUAL/手动更新")

  public String getPluginRefreshType() {
    return pluginRefreshType;
  }


  public void setPluginRefreshType(String pluginRefreshType) {
    this.pluginRefreshType = pluginRefreshType;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel serviceEmail(String serviceEmail) {
    
    this.serviceEmail = serviceEmail;
    return this;
  }

   /**
   * 小程序客服邮箱
   * @return serviceEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example@mail.com", value = "小程序客服邮箱")

  public String getServiceEmail() {
    return serviceEmail;
  }


  public void setServiceEmail(String serviceEmail) {
    this.serviceEmail = serviceEmail;
  }


  public AlipayOpenMiniInnerbaseinfoQueryResponseModel servicePhone(String servicePhone) {
    
    this.servicePhone = servicePhone;
    return this;
  }

   /**
   * 小程序客服电话
   * @return servicePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13110101010", value = "小程序客服电话")

  public String getServicePhone() {
    return servicePhone;
  }


  public void setServicePhone(String servicePhone) {
    this.servicePhone = servicePhone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerbaseinfoQueryResponseModel alipayOpenMiniInnerbaseinfoQueryResponseModel = (AlipayOpenMiniInnerbaseinfoQueryResponseModel) o;
    return Objects.equals(this.appAliasName, alipayOpenMiniInnerbaseinfoQueryResponseModel.appAliasName) &&
        Objects.equals(this.appCategoryIds, alipayOpenMiniInnerbaseinfoQueryResponseModel.appCategoryIds) &&
        Objects.equals(this.appDesc, alipayOpenMiniInnerbaseinfoQueryResponseModel.appDesc) &&
        Objects.equals(this.appEnglishName, alipayOpenMiniInnerbaseinfoQueryResponseModel.appEnglishName) &&
        Objects.equals(this.appKey, alipayOpenMiniInnerbaseinfoQueryResponseModel.appKey) &&
        Objects.equals(this.appLogo, alipayOpenMiniInnerbaseinfoQueryResponseModel.appLogo) &&
        Objects.equals(this.appName, alipayOpenMiniInnerbaseinfoQueryResponseModel.appName) &&
        Objects.equals(this.appSlogan, alipayOpenMiniInnerbaseinfoQueryResponseModel.appSlogan) &&
        Objects.equals(this.appSubType, alipayOpenMiniInnerbaseinfoQueryResponseModel.appSubType) &&
        Objects.equals(this.devId, alipayOpenMiniInnerbaseinfoQueryResponseModel.devId) &&
        Objects.equals(this.gmtCreate, alipayOpenMiniInnerbaseinfoQueryResponseModel.gmtCreate) &&
        Objects.equals(this.gmtModified, alipayOpenMiniInnerbaseinfoQueryResponseModel.gmtModified) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerbaseinfoQueryResponseModel.miniAppId) &&
        Objects.equals(this.miniCategoryIds, alipayOpenMiniInnerbaseinfoQueryResponseModel.miniCategoryIds) &&
        Objects.equals(this.origin, alipayOpenMiniInnerbaseinfoQueryResponseModel.origin) &&
        Objects.equals(this.ownerEntity, alipayOpenMiniInnerbaseinfoQueryResponseModel.ownerEntity) &&
        Objects.equals(this.ownerPortrait, alipayOpenMiniInnerbaseinfoQueryResponseModel.ownerPortrait) &&
        Objects.equals(this.pluginRefreshType, alipayOpenMiniInnerbaseinfoQueryResponseModel.pluginRefreshType) &&
        Objects.equals(this.serviceEmail, alipayOpenMiniInnerbaseinfoQueryResponseModel.serviceEmail) &&
        Objects.equals(this.servicePhone, alipayOpenMiniInnerbaseinfoQueryResponseModel.servicePhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appAliasName, appCategoryIds, appDesc, appEnglishName, appKey, appLogo, appName, appSlogan, appSubType, devId, gmtCreate, gmtModified, miniAppId, miniCategoryIds, origin, ownerEntity, ownerPortrait, pluginRefreshType, serviceEmail, servicePhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerbaseinfoQueryResponseModel {\n");
    sb.append("    appAliasName: ").append(toIndentedString(appAliasName)).append("\n");
    sb.append("    appCategoryIds: ").append(toIndentedString(appCategoryIds)).append("\n");
    sb.append("    appDesc: ").append(toIndentedString(appDesc)).append("\n");
    sb.append("    appEnglishName: ").append(toIndentedString(appEnglishName)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    appLogo: ").append(toIndentedString(appLogo)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appSlogan: ").append(toIndentedString(appSlogan)).append("\n");
    sb.append("    appSubType: ").append(toIndentedString(appSubType)).append("\n");
    sb.append("    devId: ").append(toIndentedString(devId)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    miniCategoryIds: ").append(toIndentedString(miniCategoryIds)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    ownerEntity: ").append(toIndentedString(ownerEntity)).append("\n");
    sb.append("    ownerPortrait: ").append(toIndentedString(ownerPortrait)).append("\n");
    sb.append("    pluginRefreshType: ").append(toIndentedString(pluginRefreshType)).append("\n");
    sb.append("    serviceEmail: ").append(toIndentedString(serviceEmail)).append("\n");
    sb.append("    servicePhone: ").append(toIndentedString(servicePhone)).append("\n");
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
    openapiFields.add("app_alias_name");
    openapiFields.add("app_category_ids");
    openapiFields.add("app_desc");
    openapiFields.add("app_english_name");
    openapiFields.add("app_key");
    openapiFields.add("app_logo");
    openapiFields.add("app_name");
    openapiFields.add("app_slogan");
    openapiFields.add("app_sub_type");
    openapiFields.add("dev_id");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("mini_app_id");
    openapiFields.add("mini_category_ids");
    openapiFields.add("origin");
    openapiFields.add("owner_entity");
    openapiFields.add("owner_portrait");
    openapiFields.add("plugin_refresh_type");
    openapiFields.add("service_email");
    openapiFields.add("service_phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerbaseinfoQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerbaseinfoQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerbaseinfoQueryResponseModel is not found in the empty JSON string", AlipayOpenMiniInnerbaseinfoQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerbaseinfoQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerbaseinfoQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_alias_name") != null && !jsonObj.get("app_alias_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_alias_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_alias_name").toString()));
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
      if (jsonObj.get("app_key") != null && !jsonObj.get("app_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_key").toString()));
      }
      if (jsonObj.get("app_logo") != null && !jsonObj.get("app_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_logo").toString()));
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("app_slogan") != null && !jsonObj.get("app_slogan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_slogan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_slogan").toString()));
      }
      if (jsonObj.get("app_sub_type") != null && !jsonObj.get("app_sub_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_sub_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_sub_type").toString()));
      }
      if (jsonObj.get("dev_id") != null && !jsonObj.get("dev_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dev_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dev_id").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("mini_category_ids") != null && !jsonObj.get("mini_category_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_category_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_category_ids").toString()));
      }
      if (jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      if (jsonObj.get("owner_entity") != null && !jsonObj.get("owner_entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_entity").toString()));
      }
      if (jsonObj.get("owner_portrait") != null && !jsonObj.get("owner_portrait").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_portrait` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_portrait").toString()));
      }
      if (jsonObj.get("plugin_refresh_type") != null && !jsonObj.get("plugin_refresh_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_refresh_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_refresh_type").toString()));
      }
      if (jsonObj.get("service_email") != null && !jsonObj.get("service_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_email").toString()));
      }
      if (jsonObj.get("service_phone") != null && !jsonObj.get("service_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerbaseinfoQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerbaseinfoQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerbaseinfoQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerbaseinfoQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerbaseinfoQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerbaseinfoQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerbaseinfoQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerbaseinfoQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerbaseinfoQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerbaseinfoQueryResponseModel
  */
  public static AlipayOpenMiniInnerbaseinfoQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerbaseinfoQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerbaseinfoQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

