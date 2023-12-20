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
import com.alipay.v3.model.MiniAppPluginInfo;
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
 * AlipayOpenMiniInnerversionInfoQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionInfoQueryResponseModel {
  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_BUILD_SOURCE = "build_source";
  @SerializedName(SERIALIZED_NAME_BUILD_SOURCE)
  private String buildSource;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXT_JSON = "ext_json";
  @SerializedName(SERIALIZED_NAME_EXT_JSON)
  private String extJson;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_GRAY_START_TIME = "gray_start_time";
  @SerializedName(SERIALIZED_NAME_GRAY_START_TIME)
  private String grayStartTime;

  public static final String SERIALIZED_NAME_GRAY_STRATEGY = "gray_strategy";
  @SerializedName(SERIALIZED_NAME_GRAY_STRATEGY)
  private String grayStrategy;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_OFFLINE_TIME = "offline_time";
  @SerializedName(SERIALIZED_NAME_OFFLINE_TIME)
  private String offlineTime;

  public static final String SERIALIZED_NAME_PACKAGE_URL = "package_url";
  @SerializedName(SERIALIZED_NAME_PACKAGE_URL)
  private String packageUrl;

  public static final String SERIALIZED_NAME_PLUGIN_REFS = "plugin_refs";
  @SerializedName(SERIALIZED_NAME_PLUGIN_REFS)
  private List<MiniAppPluginInfo> pluginRefs = null;

  public static final String SERIALIZED_NAME_PROCESS_TASK_ID = "process_task_id";
  @SerializedName(SERIALIZED_NAME_PROCESS_TASK_ID)
  private String processTaskId;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason;

  public static final String SERIALIZED_NAME_ROLLBACK_TIME = "rollback_time";
  @SerializedName(SERIALIZED_NAME_ROLLBACK_TIME)
  private String rollbackTime;

  public static final String SERIALIZED_NAME_SCAN_RESULT = "scan_result";
  @SerializedName(SERIALIZED_NAME_SCAN_RESULT)
  private String scanResult;

  public static final String SERIALIZED_NAME_SCREEN_SHOT_LIST = "screen_shot_list";
  @SerializedName(SERIALIZED_NAME_SCREEN_SHOT_LIST)
  private String screenShotList;

  public static final String SERIALIZED_NAME_SHELF_TIME = "shelf_time";
  @SerializedName(SERIALIZED_NAME_SHELF_TIME)
  private String shelfTime;

  public static final String SERIALIZED_NAME_SOURCE_URL = "source_url";
  @SerializedName(SERIALIZED_NAME_SOURCE_URL)
  private String sourceUrl;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TEMPLATE_EXTRA = "template_extra";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_EXTRA)
  private String templateExtra;

  public static final String SERIALIZED_NAME_TEMPLATE_VERSION = "template_version";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VERSION)
  private String templateVersion;

  public AlipayOpenMiniInnerversionInfoQueryResponseModel() { 
  }

  public AlipayOpenMiniInnerversionInfoQueryResponseModel appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 版本号
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.1", value = "版本号")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel buildSource(String buildSource) {
    
    this.buildSource = buildSource;
    return this;
  }

   /**
   * 版本构建类型
   * @return buildSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01 自创建 02 模板构建", value = "版本构建类型")

  public String getBuildSource() {
    return buildSource;
  }


  public void setBuildSource(String buildSource) {
    this.buildSource = buildSource;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 端信息
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝：com.alipay.alipaywallet 高德：com.amap.app", value = "端信息")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 版本创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01 12:00:22", value = "版本创建时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 版本描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "我是小程序版本描述", value = "版本描述")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel extJson(String extJson) {
    
    this.extJson = extJson;
    return this;
  }

   /**
   * 实例化模板参数
   * @return extJson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "实例化模板参数")

  public String getExtJson() {
    return extJson;
  }


  public void setExtJson(String extJson) {
    this.extJson = extJson;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 版本更新时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01 12:12:12", value = "版本更新时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel grayStartTime(String grayStartTime) {
    
    this.grayStartTime = grayStartTime;
    return this;
  }

   /**
   * 版本灰度时间
   * @return grayStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01 12:00:22", value = "版本灰度时间")

  public String getGrayStartTime() {
    return grayStartTime;
  }


  public void setGrayStartTime(String grayStartTime) {
    this.grayStartTime = grayStartTime;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel grayStrategy(String grayStrategy) {
    
    this.grayStrategy = grayStrategy;
    return this;
  }

   /**
   * 小程序灰度比例值
   * @return grayStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "p10-10%的用户，p30-30%的用户，p50-50%的用户", value = "小程序灰度比例值")

  public String getGrayStrategy() {
    return grayStrategy;
  }


  public void setGrayStrategy(String grayStrategy) {
    this.grayStrategy = grayStrategy;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序ID
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019****", value = "小程序ID")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel offlineTime(String offlineTime) {
    
    this.offlineTime = offlineTime;
    return this;
  }

   /**
   * 版本下架时间
   * @return offlineTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01 12:00:22", value = "版本下架时间")

  public String getOfflineTime() {
    return offlineTime;
  }


  public void setOfflineTime(String offlineTime) {
    this.offlineTime = offlineTime;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel packageUrl(String packageUrl) {
    
    this.packageUrl = packageUrl;
    return this;
  }

   /**
   * 包地址
   * @return packageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alipay-offline.cn-hangzhou.alipay.aliyun-inc.com/pkgcore/pMugqXnuGsXecwEvlsuQ.amr", value = "包地址")

  public String getPackageUrl() {
    return packageUrl;
  }


  public void setPackageUrl(String packageUrl) {
    this.packageUrl = packageUrl;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel pluginRefs(List<MiniAppPluginInfo> pluginRefs) {
    
    this.pluginRefs = pluginRefs;
    return this;
  }

  public AlipayOpenMiniInnerversionInfoQueryResponseModel addPluginRefsItem(MiniAppPluginInfo pluginRefsItem) {
    if (this.pluginRefs == null) {
      this.pluginRefs = new ArrayList<>();
    }
    this.pluginRefs.add(pluginRefsItem);
    return this;
  }

   /**
   * 引用插件信息
   * @return pluginRefs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "引用插件信息")

  public List<MiniAppPluginInfo> getPluginRefs() {
    return pluginRefs;
  }


  public void setPluginRefs(List<MiniAppPluginInfo> pluginRefs) {
    this.pluginRefs = pluginRefs;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel processTaskId(String processTaskId) {
    
    this.processTaskId = processTaskId;
    return this;
  }

   /**
   * 流程id
   * @return processTaskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "流程id")

  public String getProcessTaskId() {
    return processTaskId;
  }


  public void setProcessTaskId(String processTaskId) {
    this.processTaskId = processTaskId;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 审核失败原因
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "名称过于宽泛", value = "审核失败原因")

  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel rollbackTime(String rollbackTime) {
    
    this.rollbackTime = rollbackTime;
    return this;
  }

   /**
   * 版本回滚时间
   * @return rollbackTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01 12:00:22", value = "版本回滚时间")

  public String getRollbackTime() {
    return rollbackTime;
  }


  public void setRollbackTime(String rollbackTime) {
    this.rollbackTime = rollbackTime;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel scanResult(String scanResult) {
    
    this.scanResult = scanResult;
    return this;
  }

   /**
   * 安全扫描结果
   * @return scanResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "True", value = "安全扫描结果")

  public String getScanResult() {
    return scanResult;
  }


  public void setScanResult(String scanResult) {
    this.scanResult = scanResult;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel screenShotList(String screenShotList) {
    
    this.screenShotList = screenShotList;
    return this;
  }

   /**
   * 小程序版本截图，多个截图以逗号隔开
   * @return screenShotList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://image.aaa.alipay.com", value = "小程序版本截图，多个截图以逗号隔开")

  public String getScreenShotList() {
    return screenShotList;
  }


  public void setScreenShotList(String screenShotList) {
    this.screenShotList = screenShotList;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel shelfTime(String shelfTime) {
    
    this.shelfTime = shelfTime;
    return this;
  }

   /**
   * 版本上架时间
   * @return shelfTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01 12:00:22", value = "版本上架时间")

  public String getShelfTime() {
    return shelfTime;
  }


  public void setShelfTime(String shelfTime) {
    this.shelfTime = shelfTime;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel sourceUrl(String sourceUrl) {
    
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * 源码包地址
   * @return sourceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alipay-offline.cn-hangzhou.alipay.aliyun-inc.com/pkgcore/pMugqXnuGsXecwEvlsuQ.amr", value = "源码包地址")

  public String getSourceUrl() {
    return sourceUrl;
  }


  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 版本状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序版本状态，INIT-开发中，AUDITING-审核中，WAIT_RELEASE-审核通过，AUDIT_REJECT-审核驳回，RELEASE-已上架，GRAY-灰度中，OFFLINE-下架", value = "版本状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel templateExtra(String templateExtra) {
    
    this.templateExtra = templateExtra;
    return this;
  }

   /**
   * 模板构建参数
   * @return templateExtra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"tinycliversion\":\"1.1.1\"}", value = "模板构建参数")

  public String getTemplateExtra() {
    return templateExtra;
  }


  public void setTemplateExtra(String templateExtra) {
    this.templateExtra = templateExtra;
  }


  public AlipayOpenMiniInnerversionInfoQueryResponseModel templateVersion(String templateVersion) {
    
    this.templateVersion = templateVersion;
    return this;
  }

   /**
   * 模板版本号
   * @return templateVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.1", value = "模板版本号")

  public String getTemplateVersion() {
    return templateVersion;
  }


  public void setTemplateVersion(String templateVersion) {
    this.templateVersion = templateVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerversionInfoQueryResponseModel alipayOpenMiniInnerversionInfoQueryResponseModel = (AlipayOpenMiniInnerversionInfoQueryResponseModel) o;
    return Objects.equals(this.appVersion, alipayOpenMiniInnerversionInfoQueryResponseModel.appVersion) &&
        Objects.equals(this.buildSource, alipayOpenMiniInnerversionInfoQueryResponseModel.buildSource) &&
        Objects.equals(this.bundleId, alipayOpenMiniInnerversionInfoQueryResponseModel.bundleId) &&
        Objects.equals(this.createTime, alipayOpenMiniInnerversionInfoQueryResponseModel.createTime) &&
        Objects.equals(this.description, alipayOpenMiniInnerversionInfoQueryResponseModel.description) &&
        Objects.equals(this.extJson, alipayOpenMiniInnerversionInfoQueryResponseModel.extJson) &&
        Objects.equals(this.gmtModified, alipayOpenMiniInnerversionInfoQueryResponseModel.gmtModified) &&
        Objects.equals(this.grayStartTime, alipayOpenMiniInnerversionInfoQueryResponseModel.grayStartTime) &&
        Objects.equals(this.grayStrategy, alipayOpenMiniInnerversionInfoQueryResponseModel.grayStrategy) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerversionInfoQueryResponseModel.miniAppId) &&
        Objects.equals(this.offlineTime, alipayOpenMiniInnerversionInfoQueryResponseModel.offlineTime) &&
        Objects.equals(this.packageUrl, alipayOpenMiniInnerversionInfoQueryResponseModel.packageUrl) &&
        Objects.equals(this.pluginRefs, alipayOpenMiniInnerversionInfoQueryResponseModel.pluginRefs) &&
        Objects.equals(this.processTaskId, alipayOpenMiniInnerversionInfoQueryResponseModel.processTaskId) &&
        Objects.equals(this.rejectReason, alipayOpenMiniInnerversionInfoQueryResponseModel.rejectReason) &&
        Objects.equals(this.rollbackTime, alipayOpenMiniInnerversionInfoQueryResponseModel.rollbackTime) &&
        Objects.equals(this.scanResult, alipayOpenMiniInnerversionInfoQueryResponseModel.scanResult) &&
        Objects.equals(this.screenShotList, alipayOpenMiniInnerversionInfoQueryResponseModel.screenShotList) &&
        Objects.equals(this.shelfTime, alipayOpenMiniInnerversionInfoQueryResponseModel.shelfTime) &&
        Objects.equals(this.sourceUrl, alipayOpenMiniInnerversionInfoQueryResponseModel.sourceUrl) &&
        Objects.equals(this.status, alipayOpenMiniInnerversionInfoQueryResponseModel.status) &&
        Objects.equals(this.templateExtra, alipayOpenMiniInnerversionInfoQueryResponseModel.templateExtra) &&
        Objects.equals(this.templateVersion, alipayOpenMiniInnerversionInfoQueryResponseModel.templateVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appVersion, buildSource, bundleId, createTime, description, extJson, gmtModified, grayStartTime, grayStrategy, miniAppId, offlineTime, packageUrl, pluginRefs, processTaskId, rejectReason, rollbackTime, scanResult, screenShotList, shelfTime, sourceUrl, status, templateExtra, templateVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionInfoQueryResponseModel {\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    buildSource: ").append(toIndentedString(buildSource)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extJson: ").append(toIndentedString(extJson)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    grayStartTime: ").append(toIndentedString(grayStartTime)).append("\n");
    sb.append("    grayStrategy: ").append(toIndentedString(grayStrategy)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    offlineTime: ").append(toIndentedString(offlineTime)).append("\n");
    sb.append("    packageUrl: ").append(toIndentedString(packageUrl)).append("\n");
    sb.append("    pluginRefs: ").append(toIndentedString(pluginRefs)).append("\n");
    sb.append("    processTaskId: ").append(toIndentedString(processTaskId)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    rollbackTime: ").append(toIndentedString(rollbackTime)).append("\n");
    sb.append("    scanResult: ").append(toIndentedString(scanResult)).append("\n");
    sb.append("    screenShotList: ").append(toIndentedString(screenShotList)).append("\n");
    sb.append("    shelfTime: ").append(toIndentedString(shelfTime)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    templateExtra: ").append(toIndentedString(templateExtra)).append("\n");
    sb.append("    templateVersion: ").append(toIndentedString(templateVersion)).append("\n");
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
    openapiFields.add("app_version");
    openapiFields.add("build_source");
    openapiFields.add("bundle_id");
    openapiFields.add("create_time");
    openapiFields.add("description");
    openapiFields.add("ext_json");
    openapiFields.add("gmt_modified");
    openapiFields.add("gray_start_time");
    openapiFields.add("gray_strategy");
    openapiFields.add("mini_app_id");
    openapiFields.add("offline_time");
    openapiFields.add("package_url");
    openapiFields.add("plugin_refs");
    openapiFields.add("process_task_id");
    openapiFields.add("reject_reason");
    openapiFields.add("rollback_time");
    openapiFields.add("scan_result");
    openapiFields.add("screen_shot_list");
    openapiFields.add("shelf_time");
    openapiFields.add("source_url");
    openapiFields.add("status");
    openapiFields.add("template_extra");
    openapiFields.add("template_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionInfoQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionInfoQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionInfoQueryResponseModel is not found in the empty JSON string", AlipayOpenMiniInnerversionInfoQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerversionInfoQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerversionInfoQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      if (jsonObj.get("build_source") != null && !jsonObj.get("build_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_source").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("ext_json") != null && !jsonObj.get("ext_json").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_json` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_json").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("gray_start_time") != null && !jsonObj.get("gray_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gray_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gray_start_time").toString()));
      }
      if (jsonObj.get("gray_strategy") != null && !jsonObj.get("gray_strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gray_strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gray_strategy").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("offline_time") != null && !jsonObj.get("offline_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offline_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offline_time").toString()));
      }
      if (jsonObj.get("package_url") != null && !jsonObj.get("package_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_url").toString()));
      }
      JsonArray jsonArraypluginRefs = jsonObj.getAsJsonArray("plugin_refs");
      if (jsonArraypluginRefs != null) {
        // ensure the json data is an array
        if (!jsonObj.get("plugin_refs").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `plugin_refs` to be an array in the JSON string but got `%s`", jsonObj.get("plugin_refs").toString()));
        }

        // validate the optional field `plugin_refs` (array)
        for (int i = 0; i < jsonArraypluginRefs.size(); i++) {
          MiniAppPluginInfo.validateJsonObject(jsonArraypluginRefs.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("process_task_id") != null && !jsonObj.get("process_task_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `process_task_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("process_task_id").toString()));
      }
      if (jsonObj.get("reject_reason") != null && !jsonObj.get("reject_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reject_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reject_reason").toString()));
      }
      if (jsonObj.get("rollback_time") != null && !jsonObj.get("rollback_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rollback_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rollback_time").toString()));
      }
      if (jsonObj.get("scan_result") != null && !jsonObj.get("scan_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scan_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scan_result").toString()));
      }
      if (jsonObj.get("screen_shot_list") != null && !jsonObj.get("screen_shot_list").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `screen_shot_list` to be a primitive type in the JSON string but got `%s`", jsonObj.get("screen_shot_list").toString()));
      }
      if (jsonObj.get("shelf_time") != null && !jsonObj.get("shelf_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shelf_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shelf_time").toString()));
      }
      if (jsonObj.get("source_url") != null && !jsonObj.get("source_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_url").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("template_extra") != null && !jsonObj.get("template_extra").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_extra` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_extra").toString()));
      }
      if (jsonObj.get("template_version") != null && !jsonObj.get("template_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerversionInfoQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionInfoQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionInfoQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionInfoQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionInfoQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionInfoQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerversionInfoQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerversionInfoQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionInfoQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionInfoQueryResponseModel
  */
  public static AlipayOpenMiniInnerversionInfoQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionInfoQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionInfoQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

