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
 * AlipayOpenMiniInnerappPluginservicePublishModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerappPluginservicePublishModel {
  public static final String SERIALIZED_NAME_ABILITY_TYPE_LIST = "ability_type_list";
  @SerializedName(SERIALIZED_NAME_ABILITY_TYPE_LIST)
  private List<String> abilityTypeList = null;

  public static final String SERIALIZED_NAME_APP_LOGO = "app_logo";
  @SerializedName(SERIALIZED_NAME_APP_LOGO)
  private String appLogo;

  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private String appOrigin;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DETAIL_FOR_CLIENT = "detail_for_client";
  @SerializedName(SERIALIZED_NAME_DETAIL_FOR_CLIENT)
  private String detailForClient;

  public static final String SERIALIZED_NAME_DETAIL_FOR_PC = "detail_for_pc";
  @SerializedName(SERIALIZED_NAME_DETAIL_FOR_PC)
  private String detailForPc;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_SELL_CROWD = "sell_crowd";
  @SerializedName(SERIALIZED_NAME_SELL_CROWD)
  private String sellCrowd;

  public static final String SERIALIZED_NAME_SHOW_TYPE = "show_type";
  @SerializedName(SERIALIZED_NAME_SHOW_TYPE)
  private String showType;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VISIT_URL_FOR_PC = "visit_url_for_pc";
  @SerializedName(SERIALIZED_NAME_VISIT_URL_FOR_PC)
  private String visitUrlForPc;

  public AlipayOpenMiniInnerappPluginservicePublishModel() { 
  }

  public AlipayOpenMiniInnerappPluginservicePublishModel abilityTypeList(List<String> abilityTypeList) {
    
    this.abilityTypeList = abilityTypeList;
    return this;
  }

  public AlipayOpenMiniInnerappPluginservicePublishModel addAbilityTypeListItem(String abilityTypeListItem) {
    if (this.abilityTypeList == null) {
      this.abilityTypeList = new ArrayList<>();
    }
    this.abilityTypeList.add(abilityTypeListItem);
    return this;
  }

   /**
   * 功能类型，目前支持的有：1039支付, 1040会员, 1041基础, 1056资金, 1058信用, 1111口碑, 330120安全, 360101营销
   * @return abilityTypeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1040", value = "功能类型，目前支持的有：1039支付, 1040会员, 1041基础, 1056资金, 1058信用, 1111口碑, 330120安全, 360101营销")

  public List<String> getAbilityTypeList() {
    return abilityTypeList;
  }


  public void setAbilityTypeList(List<String> abilityTypeList) {
    this.abilityTypeList = abilityTypeList;
  }


  public AlipayOpenMiniInnerappPluginservicePublishModel appLogo(String appLogo) {
    
    this.appLogo = appLogo;
    return this;
  }

   /**
   * 服务发布logo
   * @return appLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://appstoreisvpic.alipayobjects.com/prod/f9e291ed-0de5-4f5e-97ec-f76b8414a3e0.png", value = "服务发布logo")

  public String getAppLogo() {
    return appLogo;
  }


  public void setAppLogo(String appLogo) {
    this.appLogo = appLogo;
  }


  public AlipayOpenMiniInnerappPluginservicePublishModel appOrigin(String appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * 业务来源
   * @return appOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TAOBAO", value = "业务来源")

  public String getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(String appOrigin) {
    this.appOrigin = appOrigin;
  }


  public AlipayOpenMiniInnerappPluginservicePublishModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 服务描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是一段关于插件的描述", value = "服务描述")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AlipayOpenMiniInnerappPluginservicePublishModel detailForClient(String detailForClient) {
    
    this.detailForClient = detailForClient;
    return this;
  }

   /**
   * 移动端详情，用于能力中心展示
   * @return detailForClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<p>client detail</p>", value = "移动端详情，用于能力中心展示")

  public String getDetailForClient() {
    return detailForClient;
  }


  public void setDetailForClient(String detailForClient) {
    this.detailForClient = detailForClient;
  }


  public AlipayOpenMiniInnerappPluginservicePublishModel detailForPc(String detailForPc) {
    
    this.detailForPc = detailForPc;
    return this;
  }

   /**
   * pc端详情，用于能力中心展示
   * @return detailForPc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<p>pc detail</p>", value = "pc端详情，用于能力中心展示")

  public String getDetailForPc() {
    return detailForPc;
  }


  public void setDetailForPc(String detailForPc) {
    this.detailForPc = detailForPc;
  }


  public AlipayOpenMiniInnerappPluginservicePublishModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 插件id
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012211102012056", value = "插件id")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniInnerappPluginservicePublishModel sellCrowd(String sellCrowd) {
    
    this.sellCrowd = sellCrowd;
    return this;
  }

   /**
   * 可订购人群，1003个人, 1004企业，-1无限制
   * @return sellCrowd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-1", value = "可订购人群，1003个人, 1004企业，-1无限制")

  public String getSellCrowd() {
    return sellCrowd;
  }


  public void setSellCrowd(String sellCrowd) {
    this.sellCrowd = sellCrowd;
  }


  public AlipayOpenMiniInnerappPluginservicePublishModel showType(String showType) {
    
    this.showType = showType;
    return this;
  }

   /**
   * 发布后是否展示，01展示（默认）、02隐藏
   * @return showType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "发布后是否展示，01展示（默认）、02隐藏")

  public String getShowType() {
    return showType;
  }


  public void setShowType(String showType) {
    this.showType = showType;
  }


  public AlipayOpenMiniInnerappPluginservicePublishModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 服务标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "互投插件", value = "服务标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public AlipayOpenMiniInnerappPluginservicePublishModel visitUrlForPc(String visitUrlForPc) {
    
    this.visitUrlForPc = visitUrlForPc;
    return this;
  }

   /**
   * pc端url地址，不需要则为空
   * @return visitUrlForPc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://nengli.alipay.com/abilityprod/detail?abilityCode=SM010000000000001100", value = "pc端url地址，不需要则为空")

  public String getVisitUrlForPc() {
    return visitUrlForPc;
  }


  public void setVisitUrlForPc(String visitUrlForPc) {
    this.visitUrlForPc = visitUrlForPc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerappPluginservicePublishModel alipayOpenMiniInnerappPluginservicePublishModel = (AlipayOpenMiniInnerappPluginservicePublishModel) o;
    return Objects.equals(this.abilityTypeList, alipayOpenMiniInnerappPluginservicePublishModel.abilityTypeList) &&
        Objects.equals(this.appLogo, alipayOpenMiniInnerappPluginservicePublishModel.appLogo) &&
        Objects.equals(this.appOrigin, alipayOpenMiniInnerappPluginservicePublishModel.appOrigin) &&
        Objects.equals(this.description, alipayOpenMiniInnerappPluginservicePublishModel.description) &&
        Objects.equals(this.detailForClient, alipayOpenMiniInnerappPluginservicePublishModel.detailForClient) &&
        Objects.equals(this.detailForPc, alipayOpenMiniInnerappPluginservicePublishModel.detailForPc) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerappPluginservicePublishModel.miniAppId) &&
        Objects.equals(this.sellCrowd, alipayOpenMiniInnerappPluginservicePublishModel.sellCrowd) &&
        Objects.equals(this.showType, alipayOpenMiniInnerappPluginservicePublishModel.showType) &&
        Objects.equals(this.title, alipayOpenMiniInnerappPluginservicePublishModel.title) &&
        Objects.equals(this.visitUrlForPc, alipayOpenMiniInnerappPluginservicePublishModel.visitUrlForPc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abilityTypeList, appLogo, appOrigin, description, detailForClient, detailForPc, miniAppId, sellCrowd, showType, title, visitUrlForPc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerappPluginservicePublishModel {\n");
    sb.append("    abilityTypeList: ").append(toIndentedString(abilityTypeList)).append("\n");
    sb.append("    appLogo: ").append(toIndentedString(appLogo)).append("\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    detailForClient: ").append(toIndentedString(detailForClient)).append("\n");
    sb.append("    detailForPc: ").append(toIndentedString(detailForPc)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    sellCrowd: ").append(toIndentedString(sellCrowd)).append("\n");
    sb.append("    showType: ").append(toIndentedString(showType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visitUrlForPc: ").append(toIndentedString(visitUrlForPc)).append("\n");
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
    openapiFields.add("ability_type_list");
    openapiFields.add("app_logo");
    openapiFields.add("app_origin");
    openapiFields.add("description");
    openapiFields.add("detail_for_client");
    openapiFields.add("detail_for_pc");
    openapiFields.add("mini_app_id");
    openapiFields.add("sell_crowd");
    openapiFields.add("show_type");
    openapiFields.add("title");
    openapiFields.add("visit_url_for_pc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerappPluginservicePublishModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerappPluginservicePublishModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerappPluginservicePublishModel is not found in the empty JSON string", AlipayOpenMiniInnerappPluginservicePublishModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerappPluginservicePublishModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerappPluginservicePublishModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("ability_type_list") != null && !jsonObj.get("ability_type_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ability_type_list` to be an array in the JSON string but got `%s`", jsonObj.get("ability_type_list").toString()));
      }
      if (jsonObj.get("app_logo") != null && !jsonObj.get("app_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_logo").toString()));
      }
      if (jsonObj.get("app_origin") != null && !jsonObj.get("app_origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_origin").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("detail_for_client") != null && !jsonObj.get("detail_for_client").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail_for_client` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail_for_client").toString()));
      }
      if (jsonObj.get("detail_for_pc") != null && !jsonObj.get("detail_for_pc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail_for_pc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail_for_pc").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("sell_crowd") != null && !jsonObj.get("sell_crowd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sell_crowd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sell_crowd").toString()));
      }
      if (jsonObj.get("show_type") != null && !jsonObj.get("show_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `show_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("show_type").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("visit_url_for_pc") != null && !jsonObj.get("visit_url_for_pc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visit_url_for_pc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visit_url_for_pc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerappPluginservicePublishModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerappPluginservicePublishModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerappPluginservicePublishModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerappPluginservicePublishModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerappPluginservicePublishModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerappPluginservicePublishModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerappPluginservicePublishModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerappPluginservicePublishModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerappPluginservicePublishModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerappPluginservicePublishModel
  */
  public static AlipayOpenMiniInnerappPluginservicePublishModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerappPluginservicePublishModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerappPluginservicePublishModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

