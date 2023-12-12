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
import com.alipay.v3.model.DeliveryTargetRegion;
import com.alipay.v3.model.SearchBoxActivityVideoInfo;
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
 * AlipayOpenSearchBoxactivityApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchBoxactivityApplyModel {
  public static final String SERIALIZED_NAME_ACTION_URL = "action_url";
  @SerializedName(SERIALIZED_NAME_ACTION_URL)
  private String actionUrl;

  public static final String SERIALIZED_NAME_BACKGROUND_WORD = "background_word";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_WORD)
  private String backgroundWord;

  public static final String SERIALIZED_NAME_BOX_ID = "box_id";
  @SerializedName(SERIALIZED_NAME_BOX_ID)
  private String boxId;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private String materialId;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private String materialType;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_TARGET_APPID = "target_appid";
  @SerializedName(SERIALIZED_NAME_TARGET_APPID)
  private String targetAppid;

  public static final String SERIALIZED_NAME_TARGET_APPNAME = "target_appname";
  @SerializedName(SERIALIZED_NAME_TARGET_APPNAME)
  private String targetAppname;

  public static final String SERIALIZED_NAME_TARGET_REGIONS = "target_regions";
  @SerializedName(SERIALIZED_NAME_TARGET_REGIONS)
  private List<DeliveryTargetRegion> targetRegions = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private SearchBoxActivityVideoInfo videoInfo;

  public AlipayOpenSearchBoxactivityApplyModel() { 
  }

  public AlipayOpenSearchBoxactivityApplyModel actionUrl(String actionUrl) {
    
    this.actionUrl = actionUrl;
    return this;
  }

   /**
   * 活动链接，必须为关联的小程序的页面链接（链接以 alipays 开头），可参考&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/support/01rb18\&quot;&gt; 小程序scheme链接介绍 &lt;/a&gt;
   * @return actionUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?appId=2021001198637195&pages/kaq_maid/kaq_maid", value = "活动链接，必须为关联的小程序的页面链接（链接以 alipays 开头），可参考<a href=\"https://opendocs.alipay.com/support/01rb18\"> 小程序scheme链接介绍 </a>")

  public String getActionUrl() {
    return actionUrl;
  }


  public void setActionUrl(String actionUrl) {
    this.actionUrl = actionUrl;
  }


  public AlipayOpenSearchBoxactivityApplyModel backgroundWord(String backgroundWord) {
    
    this.backgroundWord = backgroundWord;
    return this;
  }

   /**
   * 创建banner活动时，可添加底纹推广词，有机会在首页搜索框内展示，提升banner活动曝光机会
   * @return backgroundWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "搜索底纹推广词", value = "创建banner活动时，可添加底纹推广词，有机会在首页搜索框内展示，提升banner活动曝光机会")

  public String getBackgroundWord() {
    return backgroundWord;
  }


  public void setBackgroundWord(String backgroundWord) {
    this.backgroundWord = backgroundWord;
  }


  public AlipayOpenSearchBoxactivityApplyModel boxId(String boxId) {
    
    this.boxId = boxId;
    return this;
  }

   /**
   * 搜索直达配置id
   * @return boxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20211130000000100415", value = "搜索直达配置id")

  public String getBoxId() {
    return boxId;
  }


  public void setBoxId(String boxId) {
    this.boxId = boxId;
  }


  public AlipayOpenSearchBoxactivityApplyModel endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 活动结束时间，开始和结束时间之间不得超过90天
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-09-30 23:59:59", value = "活动结束时间，开始和结束时间之间不得超过90天")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AlipayOpenSearchBoxactivityApplyModel materialId(String materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 当material_type&#x3D;\&quot;IMAGE\&quot;时，为图片id；当material_type&#x3D;\&quot;VIDEO\&quot;时，为视频id。小程序直达仅支持图片类型。图片id可以通过调用&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03hvl1?ref&#x3D;api\&quot;&gt; 支付宝文件上传接口 &lt;/a&gt;上传图片，获取图片id(bizCode：search_box_banner)。&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/b/03al6f\&quot;&gt; 图片规范 &lt;/a&gt;
   * @return materialId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*oZQmT4xTBPUAAAAAAAAAAAAAAQAAAQ", value = "当material_type=\"IMAGE\"时，为图片id；当material_type=\"VIDEO\"时，为视频id。小程序直达仅支持图片类型。图片id可以通过调用<a href=\"https://opendocs.alipay.com/mini/03hvl1?ref=api\"> 支付宝文件上传接口 </a>上传图片，获取图片id(bizCode：search_box_banner)。<a href=\"https://opendocs.alipay.com/b/03al6f\"> 图片规范 </a>")

  public String getMaterialId() {
    return materialId;
  }


  public void setMaterialId(String materialId) {
    this.materialId = materialId;
  }


  public AlipayOpenSearchBoxactivityApplyModel materialType(String materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * IMAGE-图片/VIDEO-视频
   * @return materialType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IMAGE", value = "IMAGE-图片/VIDEO-视频")

  public String getMaterialType() {
    return materialType;
  }


  public void setMaterialType(String materialType) {
    this.materialType = materialType;
  }


  public AlipayOpenSearchBoxactivityApplyModel merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\&quot;运营支付宝小程序\&quot;授权。
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxxxxx", value = "商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\"运营支付宝小程序\"授权。")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public AlipayOpenSearchBoxactivityApplyModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 活动开始时间，开始和结束时间之间不得超过90天
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-10 08:00:00", value = "活动开始时间，开始和结束时间之间不得超过90天")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AlipayOpenSearchBoxactivityApplyModel targetAppid(String targetAppid) {
    
    this.targetAppid = targetAppid;
    return this;
  }

   /**
   * 跳转应用ID
   * @return targetAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001191699651", value = "跳转应用ID")

  public String getTargetAppid() {
    return targetAppid;
  }


  public void setTargetAppid(String targetAppid) {
    this.targetAppid = targetAppid;
  }


  public AlipayOpenSearchBoxactivityApplyModel targetAppname(String targetAppname) {
    
    this.targetAppname = targetAppname;
    return this;
  }

   /**
   * 跳转小程序名称
   * @return targetAppname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "目标小程序名", value = "跳转小程序名称")

  public String getTargetAppname() {
    return targetAppname;
  }


  public void setTargetAppname(String targetAppname) {
    this.targetAppname = targetAppname;
  }


  public AlipayOpenSearchBoxactivityApplyModel targetRegions(List<DeliveryTargetRegion> targetRegions) {
    
    this.targetRegions = targetRegions;
    return this;
  }

  public AlipayOpenSearchBoxactivityApplyModel addTargetRegionsItem(DeliveryTargetRegion targetRegionsItem) {
    if (this.targetRegions == null) {
      this.targetRegions = new ArrayList<>();
    }
    this.targetRegions.add(targetRegionsItem);
    return this;
  }

   /**
   * 投放目标区域列表
   * @return targetRegions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "投放目标区域列表")

  public List<DeliveryTargetRegion> getTargetRegions() {
    return targetRegions;
  }


  public void setTargetRegions(List<DeliveryTargetRegion> targetRegions) {
    this.targetRegions = targetRegions;
  }


  public AlipayOpenSearchBoxactivityApplyModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 活动标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "活动标题", value = "活动标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public AlipayOpenSearchBoxactivityApplyModel videoInfo(SearchBoxActivityVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchBoxActivityVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(SearchBoxActivityVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSearchBoxactivityApplyModel alipayOpenSearchBoxactivityApplyModel = (AlipayOpenSearchBoxactivityApplyModel) o;
    return Objects.equals(this.actionUrl, alipayOpenSearchBoxactivityApplyModel.actionUrl) &&
        Objects.equals(this.backgroundWord, alipayOpenSearchBoxactivityApplyModel.backgroundWord) &&
        Objects.equals(this.boxId, alipayOpenSearchBoxactivityApplyModel.boxId) &&
        Objects.equals(this.endTime, alipayOpenSearchBoxactivityApplyModel.endTime) &&
        Objects.equals(this.materialId, alipayOpenSearchBoxactivityApplyModel.materialId) &&
        Objects.equals(this.materialType, alipayOpenSearchBoxactivityApplyModel.materialType) &&
        Objects.equals(this.merchantId, alipayOpenSearchBoxactivityApplyModel.merchantId) &&
        Objects.equals(this.startTime, alipayOpenSearchBoxactivityApplyModel.startTime) &&
        Objects.equals(this.targetAppid, alipayOpenSearchBoxactivityApplyModel.targetAppid) &&
        Objects.equals(this.targetAppname, alipayOpenSearchBoxactivityApplyModel.targetAppname) &&
        Objects.equals(this.targetRegions, alipayOpenSearchBoxactivityApplyModel.targetRegions) &&
        Objects.equals(this.title, alipayOpenSearchBoxactivityApplyModel.title) &&
        Objects.equals(this.videoInfo, alipayOpenSearchBoxactivityApplyModel.videoInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionUrl, backgroundWord, boxId, endTime, materialId, materialType, merchantId, startTime, targetAppid, targetAppname, targetRegions, title, videoInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchBoxactivityApplyModel {\n");
    sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
    sb.append("    backgroundWord: ").append(toIndentedString(backgroundWord)).append("\n");
    sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    targetAppid: ").append(toIndentedString(targetAppid)).append("\n");
    sb.append("    targetAppname: ").append(toIndentedString(targetAppname)).append("\n");
    sb.append("    targetRegions: ").append(toIndentedString(targetRegions)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
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
    openapiFields.add("action_url");
    openapiFields.add("background_word");
    openapiFields.add("box_id");
    openapiFields.add("end_time");
    openapiFields.add("material_id");
    openapiFields.add("material_type");
    openapiFields.add("merchant_id");
    openapiFields.add("start_time");
    openapiFields.add("target_appid");
    openapiFields.add("target_appname");
    openapiFields.add("target_regions");
    openapiFields.add("title");
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchBoxactivityApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchBoxactivityApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchBoxactivityApplyModel is not found in the empty JSON string", AlipayOpenSearchBoxactivityApplyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSearchBoxactivityApplyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSearchBoxactivityApplyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("action_url") != null && !jsonObj.get("action_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_url").toString()));
      }
      if (jsonObj.get("background_word") != null && !jsonObj.get("background_word").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `background_word` to be a primitive type in the JSON string but got `%s`", jsonObj.get("background_word").toString()));
      }
      if (jsonObj.get("box_id") != null && !jsonObj.get("box_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_id").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("material_id") != null && !jsonObj.get("material_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("material_id").toString()));
      }
      if (jsonObj.get("material_type") != null && !jsonObj.get("material_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("material_type").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("target_appid") != null && !jsonObj.get("target_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_appid").toString()));
      }
      if (jsonObj.get("target_appname") != null && !jsonObj.get("target_appname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_appname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_appname").toString()));
      }
      JsonArray jsonArraytargetRegions = jsonObj.getAsJsonArray("target_regions");
      if (jsonArraytargetRegions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("target_regions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `target_regions` to be an array in the JSON string but got `%s`", jsonObj.get("target_regions").toString()));
        }

        // validate the optional field `target_regions` (array)
        for (int i = 0; i < jsonArraytargetRegions.size(); i++) {
          DeliveryTargetRegion.validateJsonObject(jsonArraytargetRegions.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the optional field `video_info`
      if (jsonObj.getAsJsonObject("video_info") != null) {
        SearchBoxActivityVideoInfo.validateJsonObject(jsonObj.getAsJsonObject("video_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchBoxactivityApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchBoxactivityApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchBoxactivityApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchBoxactivityApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchBoxactivityApplyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchBoxactivityApplyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSearchBoxactivityApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSearchBoxactivityApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchBoxactivityApplyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchBoxactivityApplyModel
  */
  public static AlipayOpenSearchBoxactivityApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchBoxactivityApplyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchBoxactivityApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

