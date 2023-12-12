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
 * IssueTargetInfoContent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IssueTargetInfoContent {
  public static final String SERIALIZED_NAME_ISSUE_QUOTA = "issue_quota";
  @SerializedName(SERIALIZED_NAME_ISSUE_QUOTA)
  private String issueQuota;

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_OWNER_OPEN_ID = "owner_open_id";
  @SerializedName(SERIALIZED_NAME_OWNER_OPEN_ID)
  private String ownerOpenId;

  public static final String SERIALIZED_NAME_OWNER_TYPE = "owner_type";
  @SerializedName(SERIALIZED_NAME_OWNER_TYPE)
  private String ownerType;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public IssueTargetInfoContent() { 
  }

  public IssueTargetInfoContent issueQuota(String issueQuota) {
    
    this.issueQuota = issueQuota;
    return this;
  }

   /**
   * 发放金额
   * @return issueQuota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "发放金额")

  public String getIssueQuota() {
    return issueQuota;
  }


  public void setIssueQuota(String issueQuota) {
    this.issueQuota = issueQuota;
  }


  public IssueTargetInfoContent ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * 切换open_id前请使用：owner类型为PHONE时该字段表示员工手机号，owner类型为为EMPLOYEE时该字段表示为员工支付宝uid，owner类型为为ENTERPRISE_PAY_UID时该字段表示为员工企业码id
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13055551515", value = "切换open_id前请使用：owner类型为PHONE时该字段表示员工手机号，owner类型为为EMPLOYEE时该字段表示为员工支付宝uid，owner类型为为ENTERPRISE_PAY_UID时该字段表示为员工企业码id")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public IssueTargetInfoContent ownerOpenId(String ownerOpenId) {
    
    this.ownerOpenId = ownerOpenId;
    return this;
  }

   /**
   * 切换open_id后请使用：owner类型，PHONE为员工手机号，EMPLOYEE为员工open_id
   * @return ownerOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcdxxxx", value = "切换open_id后请使用：owner类型，PHONE为员工手机号，EMPLOYEE为员工open_id")

  public String getOwnerOpenId() {
    return ownerOpenId;
  }


  public void setOwnerOpenId(String ownerOpenId) {
    this.ownerOpenId = ownerOpenId;
  }


  public IssueTargetInfoContent ownerType(String ownerType) {
    
    this.ownerType = ownerType;
    return this;
  }

   /**
   * owner类型，用来表示owner_id的类型; enterprise_id支持PHONE、ENTERPRISE_PAY_UID类型；account_id支持EMPLOYEE类型
   * @return ownerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PHONE", value = "owner类型，用来表示owner_id的类型; enterprise_id支持PHONE、ENTERPRISE_PAY_UID类型；account_id支持EMPLOYEE类型")

  public String getOwnerType() {
    return ownerType;
  }


  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
  }


  public IssueTargetInfoContent userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * 员工姓名
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "测试", value = "员工姓名")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTargetInfoContent issueTargetInfoContent = (IssueTargetInfoContent) o;
    return Objects.equals(this.issueQuota, issueTargetInfoContent.issueQuota) &&
        Objects.equals(this.ownerId, issueTargetInfoContent.ownerId) &&
        Objects.equals(this.ownerOpenId, issueTargetInfoContent.ownerOpenId) &&
        Objects.equals(this.ownerType, issueTargetInfoContent.ownerType) &&
        Objects.equals(this.userName, issueTargetInfoContent.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueQuota, ownerId, ownerOpenId, ownerType, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTargetInfoContent {\n");
    sb.append("    issueQuota: ").append(toIndentedString(issueQuota)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerOpenId: ").append(toIndentedString(ownerOpenId)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
    openapiFields.add("issue_quota");
    openapiFields.add("owner_id");
    openapiFields.add("owner_open_id");
    openapiFields.add("owner_type");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueTargetInfoContent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueTargetInfoContent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueTargetInfoContent is not found in the empty JSON string", IssueTargetInfoContent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueTargetInfoContent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueTargetInfoContent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("issue_quota") != null && !jsonObj.get("issue_quota").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_quota` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_quota").toString()));
      }
      if (jsonObj.get("owner_id") != null && !jsonObj.get("owner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_id").toString()));
      }
      if (jsonObj.get("owner_open_id") != null && !jsonObj.get("owner_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_open_id").toString()));
      }
      if (jsonObj.get("owner_type") != null && !jsonObj.get("owner_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_type").toString()));
      }
      if (jsonObj.get("user_name") != null && !jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueTargetInfoContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueTargetInfoContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueTargetInfoContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueTargetInfoContent.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueTargetInfoContent>() {
           @Override
           public void write(JsonWriter out, IssueTargetInfoContent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueTargetInfoContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueTargetInfoContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueTargetInfoContent
  * @throws IOException if the JSON string is invalid with respect to IssueTargetInfoContent
  */
  public static IssueTargetInfoContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueTargetInfoContent.class);
  }

 /**
  * Convert an instance of IssueTargetInfoContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

