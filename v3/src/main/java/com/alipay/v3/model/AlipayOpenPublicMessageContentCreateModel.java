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
 * AlipayOpenPublicMessageContentCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicMessageContentCreateModel {
  public static final String SERIALIZED_NAME_BENEFIT = "benefit";
  @SerializedName(SERIALIZED_NAME_BENEFIT)
  private String benefit;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_COULD_COMMENT = "could_comment";
  @SerializedName(SERIALIZED_NAME_COULD_COMMENT)
  private String couldComment;

  public static final String SERIALIZED_NAME_COVER = "cover";
  @SerializedName(SERIALIZED_NAME_COVER)
  private String cover;

  public static final String SERIALIZED_NAME_CTYPE = "ctype";
  @SerializedName(SERIALIZED_NAME_CTYPE)
  private String ctype;

  public static final String SERIALIZED_NAME_EXT_TAGS = "ext_tags";
  @SerializedName(SERIALIZED_NAME_EXT_TAGS)
  private String extTags;

  public static final String SERIALIZED_NAME_LOGIN_IDS = "login_ids";
  @SerializedName(SERIALIZED_NAME_LOGIN_IDS)
  private String loginIds;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AlipayOpenPublicMessageContentCreateModel() { 
  }

  public AlipayOpenPublicMessageContentCreateModel benefit(String benefit) {
    
    this.benefit = benefit;
    return this;
  }

   /**
   * 活动利益点，最多10个字符。仅 ctype 为 activity 类型时才需传入。
   * @return benefit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "满**减**", value = "活动利益点，最多10个字符。仅 ctype 为 activity 类型时才需传入。")

  public String getBenefit() {
    return benefit;
  }


  public void setBenefit(String benefit) {
    this.benefit = benefit;
  }


  public AlipayOpenPublicMessageContentCreateModel content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 消息正文（支持富文本）
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<html>示例</html>", value = "消息正文（支持富文本）")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public AlipayOpenPublicMessageContentCreateModel couldComment(String couldComment) {
    
    this.couldComment = couldComment;
    return this;
  }

   /**
   * 是否允许评论。枚举支持： *T：允许。 *F：不允许，默认不允许。
   * @return couldComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T", value = "是否允许评论。枚举支持： *T：允许。 *F：不允许，默认不允许。")

  public String getCouldComment() {
    return couldComment;
  }


  public void setCouldComment(String couldComment) {
    this.couldComment = couldComment;
  }


  public AlipayOpenPublicMessageContentCreateModel cover(String cover) {
    
    this.cover = cover;
    return this;
  }

   /**
   * 封面图url，需传入 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload\&quot;&gt;图片上传接口&lt;/a&gt;上传图片获取的 image_url。 注意：尺寸为 996*450，最大不超过3M，支持格式：jpg、.png 。
   * @return cover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://oalipay-dl-django.alicdn.com/rest/1.0/image?fileIds=xxx&zoom=xxx", value = "封面图url，需传入 <a href=\"https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload\">图片上传接口</a>上传图片获取的 image_url。 注意：尺寸为 996*450，最大不超过3M，支持格式：jpg、.png 。")

  public String getCover() {
    return cover;
  }


  public void setCover(String cover) {
    this.cover = cover;
  }


  public AlipayOpenPublicMessageContentCreateModel ctype(String ctype) {
    
    this.ctype = ctype;
    return this;
  }

   /**
   * 图文类型，不填默认普通图文。还支持 activity（活动图文）。
   * @return ctype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "activity", value = "图文类型，不填默认普通图文。还支持 activity（活动图文）。")

  public String getCtype() {
    return ctype;
  }


  public void setCtype(String ctype) {
    this.ctype = ctype;
  }


  public AlipayOpenPublicMessageContentCreateModel extTags(String extTags) {
    
    this.extTags = extTags;
    return this;
  }

   /**
   * 关键词列表，英文逗号分隔，最多不超过5个
   * @return extTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "关键,热度", value = "关键词列表，英文逗号分隔，最多不超过5个")

  public String getExtTags() {
    return extTags;
  }


  public void setExtTags(String extTags) {
    this.extTags = extTags;
  }


  public AlipayOpenPublicMessageContentCreateModel loginIds(String loginIds) {
    
    this.loginIds = loginIds;
    return this;
  }

   /**
   * 可预览支付宝账号列表，需要预览时才填写， 英文逗号分隔，最多不超过10个
   * @return loginIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13434343432,xxx@163.com", value = "可预览支付宝账号列表，需要预览时才填写， 英文逗号分隔，最多不超过10个")

  public String getLoginIds() {
    return loginIds;
  }


  public void setLoginIds(String loginIds) {
    this.loginIds = loginIds;
  }


  public AlipayOpenPublicMessageContentCreateModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "标题", value = "标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicMessageContentCreateModel alipayOpenPublicMessageContentCreateModel = (AlipayOpenPublicMessageContentCreateModel) o;
    return Objects.equals(this.benefit, alipayOpenPublicMessageContentCreateModel.benefit) &&
        Objects.equals(this.content, alipayOpenPublicMessageContentCreateModel.content) &&
        Objects.equals(this.couldComment, alipayOpenPublicMessageContentCreateModel.couldComment) &&
        Objects.equals(this.cover, alipayOpenPublicMessageContentCreateModel.cover) &&
        Objects.equals(this.ctype, alipayOpenPublicMessageContentCreateModel.ctype) &&
        Objects.equals(this.extTags, alipayOpenPublicMessageContentCreateModel.extTags) &&
        Objects.equals(this.loginIds, alipayOpenPublicMessageContentCreateModel.loginIds) &&
        Objects.equals(this.title, alipayOpenPublicMessageContentCreateModel.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefit, content, couldComment, cover, ctype, extTags, loginIds, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicMessageContentCreateModel {\n");
    sb.append("    benefit: ").append(toIndentedString(benefit)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    couldComment: ").append(toIndentedString(couldComment)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    ctype: ").append(toIndentedString(ctype)).append("\n");
    sb.append("    extTags: ").append(toIndentedString(extTags)).append("\n");
    sb.append("    loginIds: ").append(toIndentedString(loginIds)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("benefit");
    openapiFields.add("content");
    openapiFields.add("could_comment");
    openapiFields.add("cover");
    openapiFields.add("ctype");
    openapiFields.add("ext_tags");
    openapiFields.add("login_ids");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicMessageContentCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicMessageContentCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicMessageContentCreateModel is not found in the empty JSON string", AlipayOpenPublicMessageContentCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicMessageContentCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicMessageContentCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("benefit") != null && !jsonObj.get("benefit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefit").toString()));
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (jsonObj.get("could_comment") != null && !jsonObj.get("could_comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `could_comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("could_comment").toString()));
      }
      if (jsonObj.get("cover") != null && !jsonObj.get("cover").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cover` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cover").toString()));
      }
      if (jsonObj.get("ctype") != null && !jsonObj.get("ctype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ctype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ctype").toString()));
      }
      if (jsonObj.get("ext_tags") != null && !jsonObj.get("ext_tags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_tags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_tags").toString()));
      }
      if (jsonObj.get("login_ids") != null && !jsonObj.get("login_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login_ids").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicMessageContentCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicMessageContentCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicMessageContentCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicMessageContentCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicMessageContentCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicMessageContentCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicMessageContentCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicMessageContentCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicMessageContentCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicMessageContentCreateModel
  */
  public static AlipayOpenPublicMessageContentCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicMessageContentCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicMessageContentCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

