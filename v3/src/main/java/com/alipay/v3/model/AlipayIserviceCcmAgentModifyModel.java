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
import com.alipay.v3.model.AgentChatInfo;
import com.alipay.v3.model.AgentHotlineInfo;
import com.alipay.v3.model.RoleId;
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
 * AlipayIserviceCcmAgentModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmAgentModifyModel {
  public static final String SERIALIZED_NAME_ANSWERING_MODE = "answering_mode";
  @SerializedName(SERIALIZED_NAME_ANSWERING_MODE)
  private String answeringMode;

  public static final String SERIALIZED_NAME_CCS_INSTANCE_IDS = "ccs_instance_ids";
  @SerializedName(SERIALIZED_NAME_CCS_INSTANCE_IDS)
  private List<String> ccsInstanceIds = null;

  public static final String SERIALIZED_NAME_CHAT_CONFIGS = "chat_configs";
  @SerializedName(SERIALIZED_NAME_CHAT_CONFIGS)
  private List<AgentChatInfo> chatConfigs = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_HOTLINE_CONFIGS = "hotline_configs";
  @SerializedName(SERIALIZED_NAME_HOTLINE_CONFIGS)
  private List<AgentHotlineInfo> hotlineConfigs = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_NICK_NAME = "nick_name";
  @SerializedName(SERIALIZED_NAME_NICK_NAME)
  private String nickName;

  public static final String SERIALIZED_NAME_REAL_NAME = "real_name";
  @SerializedName(SERIALIZED_NAME_REAL_NAME)
  private String realName;

  public static final String SERIALIZED_NAME_ROLE_IDS = "role_ids";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS)
  private List<RoleId> roleIds = null;

  public static final String SERIALIZED_NAME_UPDATER_ID = "updater_id";
  @SerializedName(SERIALIZED_NAME_UPDATER_ID)
  private String updaterId;

  public AlipayIserviceCcmAgentModifyModel() { 
  }

  public AlipayIserviceCcmAgentModifyModel answeringMode(String answeringMode) {
    
    this.answeringMode = answeringMode;
    return this;
  }

   /**
   * 热线接入方式，取值0，1，2
   * @return answeringMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "热线接入方式，取值0，1，2")

  public String getAnsweringMode() {
    return answeringMode;
  }


  public void setAnsweringMode(String answeringMode) {
    this.answeringMode = answeringMode;
  }


  public AlipayIserviceCcmAgentModifyModel ccsInstanceIds(List<String> ccsInstanceIds) {
    
    this.ccsInstanceIds = ccsInstanceIds;
    return this;
  }

  public AlipayIserviceCcmAgentModifyModel addCcsInstanceIdsItem(String ccsInstanceIdsItem) {
    if (this.ccsInstanceIds == null) {
      this.ccsInstanceIds = new ArrayList<>();
    }
    this.ccsInstanceIds.add(ccsInstanceIdsItem);
    return this;
  }

   /**
   * 部门id列表
   * @return ccsInstanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"XAHSNRBS\"]", value = "部门id列表")

  public List<String> getCcsInstanceIds() {
    return ccsInstanceIds;
  }


  public void setCcsInstanceIds(List<String> ccsInstanceIds) {
    this.ccsInstanceIds = ccsInstanceIds;
  }


  public AlipayIserviceCcmAgentModifyModel chatConfigs(List<AgentChatInfo> chatConfigs) {
    
    this.chatConfigs = chatConfigs;
    return this;
  }

  public AlipayIserviceCcmAgentModifyModel addChatConfigsItem(AgentChatInfo chatConfigsItem) {
    if (this.chatConfigs == null) {
      this.chatConfigs = new ArrayList<>();
    }
    this.chatConfigs.add(chatConfigsItem);
    return this;
  }

   /**
   * 在线技能组设置，技能组部门间隔离，此设置应与ccs_instance_ids对应
   * @return chatConfigs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "在线技能组设置，技能组部门间隔离，此设置应与ccs_instance_ids对应")

  public List<AgentChatInfo> getChatConfigs() {
    return chatConfigs;
  }


  public void setChatConfigs(List<AgentChatInfo> chatConfigs) {
    this.chatConfigs = chatConfigs;
  }


  public AlipayIserviceCcmAgentModifyModel email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 客服邮箱
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test@163.com", value = "客服邮箱")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AlipayIserviceCcmAgentModifyModel hotlineConfigs(List<AgentHotlineInfo> hotlineConfigs) {
    
    this.hotlineConfigs = hotlineConfigs;
    return this;
  }

  public AlipayIserviceCcmAgentModifyModel addHotlineConfigsItem(AgentHotlineInfo hotlineConfigsItem) {
    if (this.hotlineConfigs == null) {
      this.hotlineConfigs = new ArrayList<>();
    }
    this.hotlineConfigs.add(hotlineConfigsItem);
    return this;
  }

   /**
   * 热线技能组设置，技能组部门间隔离，此设置应与ccs_instance_ids对应
   * @return hotlineConfigs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "热线技能组设置，技能组部门间隔离，此设置应与ccs_instance_ids对应")

  public List<AgentHotlineInfo> getHotlineConfigs() {
    return hotlineConfigs;
  }


  public void setHotlineConfigs(List<AgentHotlineInfo> hotlineConfigs) {
    this.hotlineConfigs = hotlineConfigs;
  }


  public AlipayIserviceCcmAgentModifyModel id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 客服id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019032101896769", value = "客服id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AlipayIserviceCcmAgentModifyModel mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * 客服手机号
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13812345678", value = "客服手机号")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public AlipayIserviceCcmAgentModifyModel nickName(String nickName) {
    
    this.nickName = nickName;
    return this;
  }

   /**
   * 客服昵称
   * @return nickName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "风清扬", value = "客服昵称")

  public String getNickName() {
    return nickName;
  }


  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public AlipayIserviceCcmAgentModifyModel realName(String realName) {
    
    this.realName = realName;
    return this;
  }

   /**
   * 客服姓名
   * @return realName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "客服姓名")

  public String getRealName() {
    return realName;
  }


  public void setRealName(String realName) {
    this.realName = realName;
  }


  public AlipayIserviceCcmAgentModifyModel roleIds(List<RoleId> roleIds) {
    
    this.roleIds = roleIds;
    return this;
  }

  public AlipayIserviceCcmAgentModifyModel addRoleIdsItem(RoleId roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * 客服角色id列表
   * @return roleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "客服角色id列表")

  public List<RoleId> getRoleIds() {
    return roleIds;
  }


  public void setRoleIds(List<RoleId> roleIds) {
    this.roleIds = roleIds;
  }


  public AlipayIserviceCcmAgentModifyModel updaterId(String updaterId) {
    
    this.updaterId = updaterId;
    return this;
  }

   /**
   * 操作人客服id
   * @return updaterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019032101896769", value = "操作人客服id")

  public String getUpdaterId() {
    return updaterId;
  }


  public void setUpdaterId(String updaterId) {
    this.updaterId = updaterId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmAgentModifyModel alipayIserviceCcmAgentModifyModel = (AlipayIserviceCcmAgentModifyModel) o;
    return Objects.equals(this.answeringMode, alipayIserviceCcmAgentModifyModel.answeringMode) &&
        Objects.equals(this.ccsInstanceIds, alipayIserviceCcmAgentModifyModel.ccsInstanceIds) &&
        Objects.equals(this.chatConfigs, alipayIserviceCcmAgentModifyModel.chatConfigs) &&
        Objects.equals(this.email, alipayIserviceCcmAgentModifyModel.email) &&
        Objects.equals(this.hotlineConfigs, alipayIserviceCcmAgentModifyModel.hotlineConfigs) &&
        Objects.equals(this.id, alipayIserviceCcmAgentModifyModel.id) &&
        Objects.equals(this.mobile, alipayIserviceCcmAgentModifyModel.mobile) &&
        Objects.equals(this.nickName, alipayIserviceCcmAgentModifyModel.nickName) &&
        Objects.equals(this.realName, alipayIserviceCcmAgentModifyModel.realName) &&
        Objects.equals(this.roleIds, alipayIserviceCcmAgentModifyModel.roleIds) &&
        Objects.equals(this.updaterId, alipayIserviceCcmAgentModifyModel.updaterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answeringMode, ccsInstanceIds, chatConfigs, email, hotlineConfigs, id, mobile, nickName, realName, roleIds, updaterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmAgentModifyModel {\n");
    sb.append("    answeringMode: ").append(toIndentedString(answeringMode)).append("\n");
    sb.append("    ccsInstanceIds: ").append(toIndentedString(ccsInstanceIds)).append("\n");
    sb.append("    chatConfigs: ").append(toIndentedString(chatConfigs)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    hotlineConfigs: ").append(toIndentedString(hotlineConfigs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
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
    openapiFields.add("answering_mode");
    openapiFields.add("ccs_instance_ids");
    openapiFields.add("chat_configs");
    openapiFields.add("email");
    openapiFields.add("hotline_configs");
    openapiFields.add("id");
    openapiFields.add("mobile");
    openapiFields.add("nick_name");
    openapiFields.add("real_name");
    openapiFields.add("role_ids");
    openapiFields.add("updater_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmAgentModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmAgentModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmAgentModifyModel is not found in the empty JSON string", AlipayIserviceCcmAgentModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmAgentModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmAgentModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("answering_mode") != null && !jsonObj.get("answering_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answering_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answering_mode").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("ccs_instance_ids") != null && !jsonObj.get("ccs_instance_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccs_instance_ids` to be an array in the JSON string but got `%s`", jsonObj.get("ccs_instance_ids").toString()));
      }
      JsonArray jsonArraychatConfigs = jsonObj.getAsJsonArray("chat_configs");
      if (jsonArraychatConfigs != null) {
        // ensure the json data is an array
        if (!jsonObj.get("chat_configs").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `chat_configs` to be an array in the JSON string but got `%s`", jsonObj.get("chat_configs").toString()));
        }

        // validate the optional field `chat_configs` (array)
        for (int i = 0; i < jsonArraychatConfigs.size(); i++) {
          AgentChatInfo.validateJsonObject(jsonArraychatConfigs.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      JsonArray jsonArrayhotlineConfigs = jsonObj.getAsJsonArray("hotline_configs");
      if (jsonArrayhotlineConfigs != null) {
        // ensure the json data is an array
        if (!jsonObj.get("hotline_configs").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `hotline_configs` to be an array in the JSON string but got `%s`", jsonObj.get("hotline_configs").toString()));
        }

        // validate the optional field `hotline_configs` (array)
        for (int i = 0; i < jsonArrayhotlineConfigs.size(); i++) {
          AgentHotlineInfo.validateJsonObject(jsonArrayhotlineConfigs.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if (jsonObj.get("nick_name") != null && !jsonObj.get("nick_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nick_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nick_name").toString()));
      }
      if (jsonObj.get("real_name") != null && !jsonObj.get("real_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("real_name").toString()));
      }
      JsonArray jsonArrayroleIds = jsonObj.getAsJsonArray("role_ids");
      if (jsonArrayroleIds != null) {
        // ensure the json data is an array
        if (!jsonObj.get("role_ids").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `role_ids` to be an array in the JSON string but got `%s`", jsonObj.get("role_ids").toString()));
        }

        // validate the optional field `role_ids` (array)
        for (int i = 0; i < jsonArrayroleIds.size(); i++) {
          RoleId.validateJsonObject(jsonArrayroleIds.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("updater_id") != null && !jsonObj.get("updater_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updater_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updater_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmAgentModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmAgentModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmAgentModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmAgentModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmAgentModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmAgentModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmAgentModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmAgentModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmAgentModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmAgentModifyModel
  */
  public static AlipayIserviceCcmAgentModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmAgentModifyModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmAgentModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

