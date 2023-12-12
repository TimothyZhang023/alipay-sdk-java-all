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
 * AlipayOpenPublicFollowBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicFollowBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private String count;

  public static final String SERIALIZED_NAME_NEXT_USER_ID = "next_user_id";
  @SerializedName(SERIALIZED_NAME_NEXT_USER_ID)
  private String nextUserId;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OPEN_ID_LIST = "open_id_list";
  @SerializedName(SERIALIZED_NAME_OPEN_ID_LIST)
  private List<String> openIdList = null;

  public static final String SERIALIZED_NAME_USER_ID_LIST = "user_id_list";
  @SerializedName(SERIALIZED_NAME_USER_ID_LIST)
  private List<String> userIdList = null;

  public AlipayOpenPublicFollowBatchqueryResponseModel() { 
  }

  public AlipayOpenPublicFollowBatchqueryResponseModel count(String count) {
    
    this.count = count;
    return this;
  }

   /**
   * 本次调用获取的userId个数，最大值为10000
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "本次调用获取的userId个数，最大值为10000")

  public String getCount() {
    return count;
  }


  public void setCount(String count) {
    this.count = count;
  }


  public AlipayOpenPublicFollowBatchqueryResponseModel nextUserId(String nextUserId) {
    
    this.nextUserId = nextUserId;
    return this;
  }

   /**
   * 查询分组的userid
   * @return nextUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102123322367", value = "查询分组的userid")

  public String getNextUserId() {
    return nextUserId;
  }


  public void setNextUserId(String nextUserId) {
    this.nextUserId = nextUserId;
  }


  public AlipayOpenPublicFollowBatchqueryResponseModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝用户的
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝用户的")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayOpenPublicFollowBatchqueryResponseModel openIdList(List<String> openIdList) {
    
    this.openIdList = openIdList;
    return this;
  }

  public AlipayOpenPublicFollowBatchqueryResponseModel addOpenIdListItem(String openIdListItem) {
    if (this.openIdList == null) {
      this.openIdList = new ArrayList<>();
    }
    this.openIdList.add(openIdListItem);
    return this;
  }

   /**
   * 支付宝用户的唯一标识列表
   * @return openIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5\"]", value = "支付宝用户的唯一标识列表")

  public List<String> getOpenIdList() {
    return openIdList;
  }


  public void setOpenIdList(List<String> openIdList) {
    this.openIdList = openIdList;
  }


  public AlipayOpenPublicFollowBatchqueryResponseModel userIdList(List<String> userIdList) {
    
    this.userIdList = userIdList;
    return this;
  }

  public AlipayOpenPublicFollowBatchqueryResponseModel addUserIdListItem(String userIdListItem) {
    if (this.userIdList == null) {
      this.userIdList = new ArrayList<>();
    }
    this.userIdList.add(userIdListItem);
    return this;
  }

   /**
   * 用户的userId列表
   * @return userIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2088102146158132\",\"2088102150429794\",\"2088102150477652\" ]", value = "用户的userId列表")

  public List<String> getUserIdList() {
    return userIdList;
  }


  public void setUserIdList(List<String> userIdList) {
    this.userIdList = userIdList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicFollowBatchqueryResponseModel alipayOpenPublicFollowBatchqueryResponseModel = (AlipayOpenPublicFollowBatchqueryResponseModel) o;
    return Objects.equals(this.count, alipayOpenPublicFollowBatchqueryResponseModel.count) &&
        Objects.equals(this.nextUserId, alipayOpenPublicFollowBatchqueryResponseModel.nextUserId) &&
        Objects.equals(this.openId, alipayOpenPublicFollowBatchqueryResponseModel.openId) &&
        Objects.equals(this.openIdList, alipayOpenPublicFollowBatchqueryResponseModel.openIdList) &&
        Objects.equals(this.userIdList, alipayOpenPublicFollowBatchqueryResponseModel.userIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, nextUserId, openId, openIdList, userIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicFollowBatchqueryResponseModel {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    nextUserId: ").append(toIndentedString(nextUserId)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    openIdList: ").append(toIndentedString(openIdList)).append("\n");
    sb.append("    userIdList: ").append(toIndentedString(userIdList)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("next_user_id");
    openapiFields.add("open_id");
    openapiFields.add("open_id_list");
    openapiFields.add("user_id_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicFollowBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicFollowBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicFollowBatchqueryResponseModel is not found in the empty JSON string", AlipayOpenPublicFollowBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicFollowBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicFollowBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("count") != null && !jsonObj.get("count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("count").toString()));
      }
      if (jsonObj.get("next_user_id") != null && !jsonObj.get("next_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_user_id").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("open_id_list") != null && !jsonObj.get("open_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("open_id_list").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("user_id_list") != null && !jsonObj.get("user_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("user_id_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicFollowBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicFollowBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicFollowBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicFollowBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicFollowBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicFollowBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicFollowBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicFollowBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicFollowBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicFollowBatchqueryResponseModel
  */
  public static AlipayOpenPublicFollowBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicFollowBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicFollowBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

