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
 * SearchBoxActivityVideoInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchBoxActivityVideoInfo {
  public static final String SERIALIZED_NAME_VIDEO_BTN_TEXT = "video_btn_text";
  @SerializedName(SERIALIZED_NAME_VIDEO_BTN_TEXT)
  private String videoBtnText;

  public static final String SERIALIZED_NAME_VIDEO_COVERIMG_ID = "video_coverimg_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVERIMG_ID)
  private String videoCoverimgId;

  public static final String SERIALIZED_NAME_VIDEO_SUB_TITLE = "video_sub_title";
  @SerializedName(SERIALIZED_NAME_VIDEO_SUB_TITLE)
  private String videoSubTitle;

  public static final String SERIALIZED_NAME_VIDEO_TITLE = "video_title";
  @SerializedName(SERIALIZED_NAME_VIDEO_TITLE)
  private String videoTitle;

  public SearchBoxActivityVideoInfo() { 
  }

  public SearchBoxActivityVideoInfo videoBtnText(String videoBtnText) {
    
    this.videoBtnText = videoBtnText;
    return this;
  }

   /**
   * 视频按钮文案，2-4个汉字
   * @return videoBtnText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "视频按钮文案，2-4个汉字")

  public String getVideoBtnText() {
    return videoBtnText;
  }


  public void setVideoBtnText(String videoBtnText) {
    this.videoBtnText = videoBtnText;
  }


  public SearchBoxActivityVideoInfo videoCoverimgId(String videoCoverimgId) {
    
    this.videoCoverimgId = videoCoverimgId;
    return this;
  }

   /**
   * 视频封面图片id，图片id可以通过调用接口alipay.open.file.upload上传图片，获取图片id(bizCode：search_box_videocover)。&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/b/03al6f\&quot;&gt; 图片规范 &lt;/a&gt;
   * @return videoCoverimgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "视频封面图片id，图片id可以通过调用接口alipay.open.file.upload上传图片，获取图片id(bizCode：search_box_videocover)。<a href=\"https://opendocs.alipay.com/b/03al6f\"> 图片规范 </a>")

  public String getVideoCoverimgId() {
    return videoCoverimgId;
  }


  public void setVideoCoverimgId(String videoCoverimgId) {
    this.videoCoverimgId = videoCoverimgId;
  }


  public SearchBoxActivityVideoInfo videoSubTitle(String videoSubTitle) {
    
    this.videoSubTitle = videoSubTitle;
    return this;
  }

   /**
   * 视频副标题，2-16个汉字
   * @return videoSubTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "视频副标题，2-16个汉字")

  public String getVideoSubTitle() {
    return videoSubTitle;
  }


  public void setVideoSubTitle(String videoSubTitle) {
    this.videoSubTitle = videoSubTitle;
  }


  public SearchBoxActivityVideoInfo videoTitle(String videoTitle) {
    
    this.videoTitle = videoTitle;
    return this;
  }

   /**
   * 视频主标题，2-10个汉字
   * @return videoTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "视频主标题，2-10个汉字")

  public String getVideoTitle() {
    return videoTitle;
  }


  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchBoxActivityVideoInfo searchBoxActivityVideoInfo = (SearchBoxActivityVideoInfo) o;
    return Objects.equals(this.videoBtnText, searchBoxActivityVideoInfo.videoBtnText) &&
        Objects.equals(this.videoCoverimgId, searchBoxActivityVideoInfo.videoCoverimgId) &&
        Objects.equals(this.videoSubTitle, searchBoxActivityVideoInfo.videoSubTitle) &&
        Objects.equals(this.videoTitle, searchBoxActivityVideoInfo.videoTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoBtnText, videoCoverimgId, videoSubTitle, videoTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBoxActivityVideoInfo {\n");
    sb.append("    videoBtnText: ").append(toIndentedString(videoBtnText)).append("\n");
    sb.append("    videoCoverimgId: ").append(toIndentedString(videoCoverimgId)).append("\n");
    sb.append("    videoSubTitle: ").append(toIndentedString(videoSubTitle)).append("\n");
    sb.append("    videoTitle: ").append(toIndentedString(videoTitle)).append("\n");
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
    openapiFields.add("video_btn_text");
    openapiFields.add("video_coverimg_id");
    openapiFields.add("video_sub_title");
    openapiFields.add("video_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchBoxActivityVideoInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchBoxActivityVideoInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchBoxActivityVideoInfo is not found in the empty JSON string", SearchBoxActivityVideoInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchBoxActivityVideoInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchBoxActivityVideoInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("video_btn_text") != null && !jsonObj.get("video_btn_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_btn_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_btn_text").toString()));
      }
      if (jsonObj.get("video_coverimg_id") != null && !jsonObj.get("video_coverimg_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_coverimg_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_coverimg_id").toString()));
      }
      if (jsonObj.get("video_sub_title") != null && !jsonObj.get("video_sub_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_sub_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_sub_title").toString()));
      }
      if (jsonObj.get("video_title") != null && !jsonObj.get("video_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchBoxActivityVideoInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchBoxActivityVideoInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchBoxActivityVideoInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchBoxActivityVideoInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchBoxActivityVideoInfo>() {
           @Override
           public void write(JsonWriter out, SearchBoxActivityVideoInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchBoxActivityVideoInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchBoxActivityVideoInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchBoxActivityVideoInfo
  * @throws IOException if the JSON string is invalid with respect to SearchBoxActivityVideoInfo
  */
  public static SearchBoxActivityVideoInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchBoxActivityVideoInfo.class);
  }

 /**
  * Convert an instance of SearchBoxActivityVideoInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

