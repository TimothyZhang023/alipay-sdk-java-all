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
 * Instance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Instance {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private String creatorId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public static final String SERIALIZED_NAME_UPDATER_ID = "updater_id";
  @SerializedName(SERIALIZED_NAME_UPDATER_ID)
  private String updaterId;

  public Instance() { 
  }

  public Instance createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * ?创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-10 21:07:00", value = "?创建时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public Instance creatorId(String creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * 创建人id
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018051101015016", value = "创建人id")

  public String getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  public Instance description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 部门描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "我是描述信息", value = "部门描述")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Instance externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * 外部id
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "939459821", value = "外部id")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public Instance id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 部门id（即租户实例ID、数据权限ID）
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pYv_gs0m", value = "部门id（即租户实例ID、数据权限ID）")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Instance name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 租户实例（数据权限）名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XXX租户实例", value = "租户实例（数据权限）名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Instance status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 租户实例（数据权限）状态，所有可能的状态如下：INIT（初始化）、STARTED（准备完成）、START_FAILED（准备失败）、STOPPING（停用中）、STOPPED（已停用）、RELEASING（释放中）、RELEASED（已释放）、RESUMING（重新启动）、MODIFING（修改规格中）、DELETED（已删除）。
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STARTED", value = "租户实例（数据权限）状态，所有可能的状态如下：INIT（初始化）、STARTED（准备完成）、START_FAILED（准备失败）、STOPPING（停用中）、STOPPED（已停用）、RELEASING（释放中）、RELEASED（已释放）、RESUMING（重新启动）、MODIFING（修改规格中）、DELETED（已删除）。")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Instance updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 最后修改时间
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-10 21:11:00", value = "最后修改时间")

  public String getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public Instance updaterId(String updaterId) {
    
    this.updaterId = updaterId;
    return this;
  }

   /**
   * 最后修改人id
   * @return updaterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018051101015016", value = "最后修改人id")

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
    Instance instance = (Instance) o;
    return Objects.equals(this.createTime, instance.createTime) &&
        Objects.equals(this.creatorId, instance.creatorId) &&
        Objects.equals(this.description, instance.description) &&
        Objects.equals(this.externalId, instance.externalId) &&
        Objects.equals(this.id, instance.id) &&
        Objects.equals(this.name, instance.name) &&
        Objects.equals(this.status, instance.status) &&
        Objects.equals(this.updateTime, instance.updateTime) &&
        Objects.equals(this.updaterId, instance.updaterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, creatorId, description, externalId, id, name, status, updateTime, updaterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instance {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("creator_id");
    openapiFields.add("description");
    openapiFields.add("external_id");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("update_time");
    openapiFields.add("updater_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Instance
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Instance.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Instance is not found in the empty JSON string", Instance.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Instance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Instance` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("creator_id") != null && !jsonObj.get("creator_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_id").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("update_time") != null && !jsonObj.get("update_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `update_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("update_time").toString()));
      }
      if (jsonObj.get("updater_id") != null && !jsonObj.get("updater_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updater_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updater_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Instance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Instance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Instance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Instance.class));

       return (TypeAdapter<T>) new TypeAdapter<Instance>() {
           @Override
           public void write(JsonWriter out, Instance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Instance read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Instance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Instance
  * @throws IOException if the JSON string is invalid with respect to Instance
  */
  public static Instance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Instance.class);
  }

 /**
  * Convert an instance of Instance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

