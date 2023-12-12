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
import com.alipay.v3.model.MiniAppPluginReference;
import com.alipay.v3.model.SubPackageInfo;
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
 * AlipayOpenMiniInnerversionNobuildUploadModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionNobuildUploadModel {
  public static final String SERIALIZED_NAME_BUILD_EXTRA_INFO = "build_extra_info";
  @SerializedName(SERIALIZED_NAME_BUILD_EXTRA_INFO)
  private String buildExtraInfo;

  public static final String SERIALIZED_NAME_BUILD_JS_PERMISSION = "build_js_permission";
  @SerializedName(SERIALIZED_NAME_BUILD_JS_PERMISSION)
  private String buildJsPermission;

  public static final String SERIALIZED_NAME_BUILD_MAIN_URL = "build_main_url";
  @SerializedName(SERIALIZED_NAME_BUILD_MAIN_URL)
  private String buildMainUrl;

  public static final String SERIALIZED_NAME_BUILD_QCLOUD_INFO = "build_qcloud_info";
  @SerializedName(SERIALIZED_NAME_BUILD_QCLOUD_INFO)
  private String buildQcloudInfo;

  public static final String SERIALIZED_NAME_BUILD_VERSION = "build_version";
  @SerializedName(SERIALIZED_NAME_BUILD_VERSION)
  private String buildVersion;

  public static final String SERIALIZED_NAME_BUILDED_PACKAGE_SIZE = "builded_package_size";
  @SerializedName(SERIALIZED_NAME_BUILDED_PACKAGE_SIZE)
  private String buildedPackageSize;

  public static final String SERIALIZED_NAME_BUILDED_PACKAGE_URL = "builded_package_url";
  @SerializedName(SERIALIZED_NAME_BUILDED_PACKAGE_URL)
  private String buildedPackageUrl;

  public static final String SERIALIZED_NAME_BUILDED_PLUGIN_SIZE = "builded_plugin_size";
  @SerializedName(SERIALIZED_NAME_BUILDED_PLUGIN_SIZE)
  private String buildedPluginSize;

  public static final String SERIALIZED_NAME_BUILDED_PLUGIN_URL = "builded_plugin_url";
  @SerializedName(SERIALIZED_NAME_BUILDED_PLUGIN_URL)
  private String buildedPluginUrl;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private String components;

  public static final String SERIALIZED_NAME_INST_CODE = "inst_code";
  @SerializedName(SERIALIZED_NAME_INST_CODE)
  private String instCode;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_NEW_BUILDED_PACKAGE_SIZE = "new_builded_package_size";
  @SerializedName(SERIALIZED_NAME_NEW_BUILDED_PACKAGE_SIZE)
  private String newBuildedPackageSize;

  public static final String SERIALIZED_NAME_NEW_BUILDED_PACKAGE_URL = "new_builded_package_url";
  @SerializedName(SERIALIZED_NAME_NEW_BUILDED_PACKAGE_URL)
  private String newBuildedPackageUrl;

  public static final String SERIALIZED_NAME_NEW_BUILDED_PLUGIN_SIZE = "new_builded_plugin_size";
  @SerializedName(SERIALIZED_NAME_NEW_BUILDED_PLUGIN_SIZE)
  private String newBuildedPluginSize;

  public static final String SERIALIZED_NAME_NEW_BUILDED_PLUGIN_URL = "new_builded_plugin_url";
  @SerializedName(SERIALIZED_NAME_NEW_BUILDED_PLUGIN_URL)
  private String newBuildedPluginUrl;

  public static final String SERIALIZED_NAME_NO_SIGN = "no_sign";
  @SerializedName(SERIALIZED_NAME_NO_SIGN)
  private Boolean noSign;

  public static final String SERIALIZED_NAME_PLUGIN_REFS = "plugin_refs";
  @SerializedName(SERIALIZED_NAME_PLUGIN_REFS)
  private List<MiniAppPluginReference> pluginRefs = null;

  public static final String SERIALIZED_NAME_SUB_PACKAGES = "sub_packages";
  @SerializedName(SERIALIZED_NAME_SUB_PACKAGES)
  private List<SubPackageInfo> subPackages = null;

  public AlipayOpenMiniInnerversionNobuildUploadModel() { 
  }

  public AlipayOpenMiniInnerversionNobuildUploadModel buildExtraInfo(String buildExtraInfo) {
    
    this.buildExtraInfo = buildExtraInfo;
    return this;
  }

   /**
   * 扩展信息，比如adaptorName、tinycliVersion、tinycliName、import-module、allowPrecompile、extJson、allowInstallDependency、aggregationMainAppId，如果没有特殊要求，tinycliVersion版本请用最新的： https://registry.npm.alibaba-inc.com/@alipay/tiny-cli/huoban-prod
   * @return buildExtraInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"tinycliVersion\":\"1.5.20200213201649\"}", value = "扩展信息，比如adaptorName、tinycliVersion、tinycliName、import-module、allowPrecompile、extJson、allowInstallDependency、aggregationMainAppId，如果没有特殊要求，tinycliVersion版本请用最新的： https://registry.npm.alibaba-inc.com/@alipay/tiny-cli/huoban-prod")

  public String getBuildExtraInfo() {
    return buildExtraInfo;
  }


  public void setBuildExtraInfo(String buildExtraInfo) {
    this.buildExtraInfo = buildExtraInfo;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel buildJsPermission(String buildJsPermission) {
    
    this.buildJsPermission = buildJsPermission;
    return this;
  }

   /**
   * jsapi权限文件
   * @return buildJsPermission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"permissionJSON\":[1, 2, 3, 4, 5]}", value = "jsapi权限文件")

  public String getBuildJsPermission() {
    return buildJsPermission;
  }


  public void setBuildJsPermission(String buildJsPermission) {
    this.buildJsPermission = buildJsPermission;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel buildMainUrl(String buildMainUrl) {
    
    this.buildMainUrl = buildMainUrl;
    return this;
  }

   /**
   * 小程序页面主入口。/index.html#page/component/index，该值需要和extendInfo中的page参数保持一致
   * @return buildMainUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/index.html#page/component/index", value = "小程序页面主入口。/index.html#page/component/index，该值需要和extendInfo中的page参数保持一致")

  public String getBuildMainUrl() {
    return buildMainUrl;
  }


  public void setBuildMainUrl(String buildMainUrl) {
    this.buildMainUrl = buildMainUrl;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel buildQcloudInfo(String buildQcloudInfo) {
    
    this.buildQcloudInfo = buildQcloudInfo;
    return this;
  }

   /**
   * 打包平台扩展信息
   * @return buildQcloudInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"launchParams\":{\"enableTabBar\":\"YES\",\"enableJSC\":\"YES\",\"page\":\"page/component/index\",\"enableKeepAlive\":\"YES\",\"enableWK\":\"YES\"}}", value = "打包平台扩展信息")

  public String getBuildQcloudInfo() {
    return buildQcloudInfo;
  }


  public void setBuildQcloudInfo(String buildQcloudInfo) {
    this.buildQcloudInfo = buildQcloudInfo;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel buildVersion(String buildVersion) {
    
    this.buildVersion = buildVersion;
    return this;
  }

   /**
   * 小程序版本
   * @return buildVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.1", value = "小程序版本")

  public String getBuildVersion() {
    return buildVersion;
  }


  public void setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel buildedPackageSize(String buildedPackageSize) {
    
    this.buildedPackageSize = buildedPackageSize;
    return this;
  }

   /**
   * 已经构建过的amr包大小，单位是字节，建议如实填写
   * @return buildedPackageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "已经构建过的amr包大小，单位是字节，建议如实填写")

  public String getBuildedPackageSize() {
    return buildedPackageSize;
  }


  public void setBuildedPackageSize(String buildedPackageSize) {
    this.buildedPackageSize = buildedPackageSize;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel buildedPackageUrl(String buildedPackageUrl) {
    
    this.buildedPackageUrl = buildedPackageUrl;
    return this;
  }

   /**
   * 已经构建的包地址，目前主要自行构建的场景使用
   * @return buildedPackageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "产物包地址", value = "已经构建的包地址，目前主要自行构建的场景使用")

  public String getBuildedPackageUrl() {
    return buildedPackageUrl;
  }


  public void setBuildedPackageUrl(String buildedPackageUrl) {
    this.buildedPackageUrl = buildedPackageUrl;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel buildedPluginSize(String buildedPluginSize) {
    
    this.buildedPluginSize = buildedPluginSize;
    return this;
  }

   /**
   * 构建好的插件包amr大小
   * @return buildedPluginSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "构建好的插件包amr大小")

  public String getBuildedPluginSize() {
    return buildedPluginSize;
  }


  public void setBuildedPluginSize(String buildedPluginSize) {
    this.buildedPluginSize = buildedPluginSize;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel buildedPluginUrl(String buildedPluginUrl) {
    
    this.buildedPluginUrl = buildedPluginUrl;
    return this;
  }

   /**
   * 构建好的插件包地址
   * @return buildedPluginUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "构建好的插件包地址", value = "构建好的插件包地址")

  public String getBuildedPluginUrl() {
    return buildedPluginUrl;
  }


  public void setBuildedPluginUrl(String buildedPluginUrl) {
    this.buildedPluginUrl = buildedPluginUrl;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundleId入驻
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "com.alipay.alipaywallet", value = "一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundleId入驻")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel components(String components) {
    
    this.components = components;
    return this;
  }

   /**
   * 组件参数
   * @return components
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "组件参数")

  public String getComponents() {
    return components;
  }


  public void setComponents(String components) {
    this.components = components;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel instCode(String instCode) {
    
    this.instCode = instCode;
    return this;
  }

   /**
   * 上传调试版的接入租户类型
   * @return instCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "taobao", value = "上传调试版的接入租户类型")

  public String getInstCode() {
    return instCode;
  }


  public void setInstCode(String instCode) {
    this.instCode = instCode;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序id
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017122101357757", value = "小程序id")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel newBuildedPackageSize(String newBuildedPackageSize) {
    
    this.newBuildedPackageSize = newBuildedPackageSize;
    return this;
  }

   /**
   * 2.0已经构建过的amr包大小，单位是字节，主要是给自行构建的场景使用
   * @return newBuildedPackageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "2.0已经构建过的amr包大小，单位是字节，主要是给自行构建的场景使用")

  public String getNewBuildedPackageSize() {
    return newBuildedPackageSize;
  }


  public void setNewBuildedPackageSize(String newBuildedPackageSize) {
    this.newBuildedPackageSize = newBuildedPackageSize;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel newBuildedPackageUrl(String newBuildedPackageUrl) {
    
    this.newBuildedPackageUrl = newBuildedPackageUrl;
    return this;
  }

   /**
   * 2.0产物包地址
   * @return newBuildedPackageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.0产物包地址", value = "2.0产物包地址")

  public String getNewBuildedPackageUrl() {
    return newBuildedPackageUrl;
  }


  public void setNewBuildedPackageUrl(String newBuildedPackageUrl) {
    this.newBuildedPackageUrl = newBuildedPackageUrl;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel newBuildedPluginSize(String newBuildedPluginSize) {
    
    this.newBuildedPluginSize = newBuildedPluginSize;
    return this;
  }

   /**
   * 构建好的插件包amr大小
   * @return newBuildedPluginSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "构建好的插件包amr大小")

  public String getNewBuildedPluginSize() {
    return newBuildedPluginSize;
  }


  public void setNewBuildedPluginSize(String newBuildedPluginSize) {
    this.newBuildedPluginSize = newBuildedPluginSize;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel newBuildedPluginUrl(String newBuildedPluginUrl) {
    
    this.newBuildedPluginUrl = newBuildedPluginUrl;
    return this;
  }

   /**
   * 构建好的插件包地址
   * @return newBuildedPluginUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "构建好的插件包地址", value = "构建好的插件包地址")

  public String getNewBuildedPluginUrl() {
    return newBuildedPluginUrl;
  }


  public void setNewBuildedPluginUrl(String newBuildedPluginUrl) {
    this.newBuildedPluginUrl = newBuildedPluginUrl;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel noSign(Boolean noSign) {
    
    this.noSign = noSign;
    return this;
  }

   /**
   * 否免加签, true的时候代表传过来的是加签后的包地址
   * @return noSign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "否免加签, true的时候代表传过来的是加签后的包地址")

  public Boolean getNoSign() {
    return noSign;
  }


  public void setNoSign(Boolean noSign) {
    this.noSign = noSign;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel pluginRefs(List<MiniAppPluginReference> pluginRefs) {
    
    this.pluginRefs = pluginRefs;
    return this;
  }

  public AlipayOpenMiniInnerversionNobuildUploadModel addPluginRefsItem(MiniAppPluginReference pluginRefsItem) {
    if (this.pluginRefs == null) {
      this.pluginRefs = new ArrayList<>();
    }
    this.pluginRefs.add(pluginRefsItem);
    return this;
  }

   /**
   * 小程序代码中引用的插件列表，包含插件id和插件版本信息，业务方需要自行解析源码包的app.json里面的plugins信息
   * @return pluginRefs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序代码中引用的插件列表，包含插件id和插件版本信息，业务方需要自行解析源码包的app.json里面的plugins信息")

  public List<MiniAppPluginReference> getPluginRefs() {
    return pluginRefs;
  }


  public void setPluginRefs(List<MiniAppPluginReference> pluginRefs) {
    this.pluginRefs = pluginRefs;
  }


  public AlipayOpenMiniInnerversionNobuildUploadModel subPackages(List<SubPackageInfo> subPackages) {
    
    this.subPackages = subPackages;
    return this;
  }

  public AlipayOpenMiniInnerversionNobuildUploadModel addSubPackagesItem(SubPackageInfo subPackagesItem) {
    if (this.subPackages == null) {
      this.subPackages = new ArrayList<>();
    }
    this.subPackages.add(subPackagesItem);
    return this;
  }

   /**
   * 构建好的分包信息
   * @return subPackages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "构建好的分包信息")

  public List<SubPackageInfo> getSubPackages() {
    return subPackages;
  }


  public void setSubPackages(List<SubPackageInfo> subPackages) {
    this.subPackages = subPackages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerversionNobuildUploadModel alipayOpenMiniInnerversionNobuildUploadModel = (AlipayOpenMiniInnerversionNobuildUploadModel) o;
    return Objects.equals(this.buildExtraInfo, alipayOpenMiniInnerversionNobuildUploadModel.buildExtraInfo) &&
        Objects.equals(this.buildJsPermission, alipayOpenMiniInnerversionNobuildUploadModel.buildJsPermission) &&
        Objects.equals(this.buildMainUrl, alipayOpenMiniInnerversionNobuildUploadModel.buildMainUrl) &&
        Objects.equals(this.buildQcloudInfo, alipayOpenMiniInnerversionNobuildUploadModel.buildQcloudInfo) &&
        Objects.equals(this.buildVersion, alipayOpenMiniInnerversionNobuildUploadModel.buildVersion) &&
        Objects.equals(this.buildedPackageSize, alipayOpenMiniInnerversionNobuildUploadModel.buildedPackageSize) &&
        Objects.equals(this.buildedPackageUrl, alipayOpenMiniInnerversionNobuildUploadModel.buildedPackageUrl) &&
        Objects.equals(this.buildedPluginSize, alipayOpenMiniInnerversionNobuildUploadModel.buildedPluginSize) &&
        Objects.equals(this.buildedPluginUrl, alipayOpenMiniInnerversionNobuildUploadModel.buildedPluginUrl) &&
        Objects.equals(this.bundleId, alipayOpenMiniInnerversionNobuildUploadModel.bundleId) &&
        Objects.equals(this.components, alipayOpenMiniInnerversionNobuildUploadModel.components) &&
        Objects.equals(this.instCode, alipayOpenMiniInnerversionNobuildUploadModel.instCode) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerversionNobuildUploadModel.miniAppId) &&
        Objects.equals(this.newBuildedPackageSize, alipayOpenMiniInnerversionNobuildUploadModel.newBuildedPackageSize) &&
        Objects.equals(this.newBuildedPackageUrl, alipayOpenMiniInnerversionNobuildUploadModel.newBuildedPackageUrl) &&
        Objects.equals(this.newBuildedPluginSize, alipayOpenMiniInnerversionNobuildUploadModel.newBuildedPluginSize) &&
        Objects.equals(this.newBuildedPluginUrl, alipayOpenMiniInnerversionNobuildUploadModel.newBuildedPluginUrl) &&
        Objects.equals(this.noSign, alipayOpenMiniInnerversionNobuildUploadModel.noSign) &&
        Objects.equals(this.pluginRefs, alipayOpenMiniInnerversionNobuildUploadModel.pluginRefs) &&
        Objects.equals(this.subPackages, alipayOpenMiniInnerversionNobuildUploadModel.subPackages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildExtraInfo, buildJsPermission, buildMainUrl, buildQcloudInfo, buildVersion, buildedPackageSize, buildedPackageUrl, buildedPluginSize, buildedPluginUrl, bundleId, components, instCode, miniAppId, newBuildedPackageSize, newBuildedPackageUrl, newBuildedPluginSize, newBuildedPluginUrl, noSign, pluginRefs, subPackages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionNobuildUploadModel {\n");
    sb.append("    buildExtraInfo: ").append(toIndentedString(buildExtraInfo)).append("\n");
    sb.append("    buildJsPermission: ").append(toIndentedString(buildJsPermission)).append("\n");
    sb.append("    buildMainUrl: ").append(toIndentedString(buildMainUrl)).append("\n");
    sb.append("    buildQcloudInfo: ").append(toIndentedString(buildQcloudInfo)).append("\n");
    sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
    sb.append("    buildedPackageSize: ").append(toIndentedString(buildedPackageSize)).append("\n");
    sb.append("    buildedPackageUrl: ").append(toIndentedString(buildedPackageUrl)).append("\n");
    sb.append("    buildedPluginSize: ").append(toIndentedString(buildedPluginSize)).append("\n");
    sb.append("    buildedPluginUrl: ").append(toIndentedString(buildedPluginUrl)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    instCode: ").append(toIndentedString(instCode)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    newBuildedPackageSize: ").append(toIndentedString(newBuildedPackageSize)).append("\n");
    sb.append("    newBuildedPackageUrl: ").append(toIndentedString(newBuildedPackageUrl)).append("\n");
    sb.append("    newBuildedPluginSize: ").append(toIndentedString(newBuildedPluginSize)).append("\n");
    sb.append("    newBuildedPluginUrl: ").append(toIndentedString(newBuildedPluginUrl)).append("\n");
    sb.append("    noSign: ").append(toIndentedString(noSign)).append("\n");
    sb.append("    pluginRefs: ").append(toIndentedString(pluginRefs)).append("\n");
    sb.append("    subPackages: ").append(toIndentedString(subPackages)).append("\n");
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
    openapiFields.add("build_extra_info");
    openapiFields.add("build_js_permission");
    openapiFields.add("build_main_url");
    openapiFields.add("build_qcloud_info");
    openapiFields.add("build_version");
    openapiFields.add("builded_package_size");
    openapiFields.add("builded_package_url");
    openapiFields.add("builded_plugin_size");
    openapiFields.add("builded_plugin_url");
    openapiFields.add("bundle_id");
    openapiFields.add("components");
    openapiFields.add("inst_code");
    openapiFields.add("mini_app_id");
    openapiFields.add("new_builded_package_size");
    openapiFields.add("new_builded_package_url");
    openapiFields.add("new_builded_plugin_size");
    openapiFields.add("new_builded_plugin_url");
    openapiFields.add("no_sign");
    openapiFields.add("plugin_refs");
    openapiFields.add("sub_packages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionNobuildUploadModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionNobuildUploadModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionNobuildUploadModel is not found in the empty JSON string", AlipayOpenMiniInnerversionNobuildUploadModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerversionNobuildUploadModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerversionNobuildUploadModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("build_extra_info") != null && !jsonObj.get("build_extra_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_extra_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_extra_info").toString()));
      }
      if (jsonObj.get("build_js_permission") != null && !jsonObj.get("build_js_permission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_js_permission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_js_permission").toString()));
      }
      if (jsonObj.get("build_main_url") != null && !jsonObj.get("build_main_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_main_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_main_url").toString()));
      }
      if (jsonObj.get("build_qcloud_info") != null && !jsonObj.get("build_qcloud_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_qcloud_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_qcloud_info").toString()));
      }
      if (jsonObj.get("build_version") != null && !jsonObj.get("build_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_version").toString()));
      }
      if (jsonObj.get("builded_package_size") != null && !jsonObj.get("builded_package_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `builded_package_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("builded_package_size").toString()));
      }
      if (jsonObj.get("builded_package_url") != null && !jsonObj.get("builded_package_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `builded_package_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("builded_package_url").toString()));
      }
      if (jsonObj.get("builded_plugin_size") != null && !jsonObj.get("builded_plugin_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `builded_plugin_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("builded_plugin_size").toString()));
      }
      if (jsonObj.get("builded_plugin_url") != null && !jsonObj.get("builded_plugin_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `builded_plugin_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("builded_plugin_url").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("components") != null && !jsonObj.get("components").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `components` to be a primitive type in the JSON string but got `%s`", jsonObj.get("components").toString()));
      }
      if (jsonObj.get("inst_code") != null && !jsonObj.get("inst_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inst_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inst_code").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("new_builded_package_size") != null && !jsonObj.get("new_builded_package_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_builded_package_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_builded_package_size").toString()));
      }
      if (jsonObj.get("new_builded_package_url") != null && !jsonObj.get("new_builded_package_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_builded_package_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_builded_package_url").toString()));
      }
      if (jsonObj.get("new_builded_plugin_size") != null && !jsonObj.get("new_builded_plugin_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_builded_plugin_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_builded_plugin_size").toString()));
      }
      if (jsonObj.get("new_builded_plugin_url") != null && !jsonObj.get("new_builded_plugin_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_builded_plugin_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_builded_plugin_url").toString()));
      }
      JsonArray jsonArraypluginRefs = jsonObj.getAsJsonArray("plugin_refs");
      if (jsonArraypluginRefs != null) {
        // ensure the json data is an array
        if (!jsonObj.get("plugin_refs").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `plugin_refs` to be an array in the JSON string but got `%s`", jsonObj.get("plugin_refs").toString()));
        }

        // validate the optional field `plugin_refs` (array)
        for (int i = 0; i < jsonArraypluginRefs.size(); i++) {
          MiniAppPluginReference.validateJsonObject(jsonArraypluginRefs.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraysubPackages = jsonObj.getAsJsonArray("sub_packages");
      if (jsonArraysubPackages != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sub_packages").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sub_packages` to be an array in the JSON string but got `%s`", jsonObj.get("sub_packages").toString()));
        }

        // validate the optional field `sub_packages` (array)
        for (int i = 0; i < jsonArraysubPackages.size(); i++) {
          SubPackageInfo.validateJsonObject(jsonArraysubPackages.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerversionNobuildUploadModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionNobuildUploadModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionNobuildUploadModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionNobuildUploadModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionNobuildUploadModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionNobuildUploadModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerversionNobuildUploadModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerversionNobuildUploadModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionNobuildUploadModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionNobuildUploadModel
  */
  public static AlipayOpenMiniInnerversionNobuildUploadModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionNobuildUploadModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionNobuildUploadModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

