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
import com.alipay.v3.model.RecruitEnrollRule;
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
 * AlipayMarketingRecruitPlanQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingRecruitPlanQueryResponseModel {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENROLL_END_TIME = "enroll_end_time";
  @SerializedName(SERIALIZED_NAME_ENROLL_END_TIME)
  private String enrollEndTime;

  public static final String SERIALIZED_NAME_ENROLL_RULES = "enroll_rules";
  @SerializedName(SERIALIZED_NAME_ENROLL_RULES)
  private List<RecruitEnrollRule> enrollRules = null;

  public static final String SERIALIZED_NAME_ENROLL_SCENE_TYPE = "enroll_scene_type";
  @SerializedName(SERIALIZED_NAME_ENROLL_SCENE_TYPE)
  private String enrollSceneType;

  public static final String SERIALIZED_NAME_ENROLL_START_TIME = "enroll_start_time";
  @SerializedName(SERIALIZED_NAME_ENROLL_START_TIME)
  private String enrollStartTime;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_PLAN_NAME = "plan_name";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private String planName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayMarketingRecruitPlanQueryResponseModel() { 
  }

  public AlipayMarketingRecruitPlanQueryResponseModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 招商方案描述：富文本内容，可能包含html标签
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<p><span style=\\\"color:#000000\\\"><span style=\\\"font-size:14px\\\"><span style=\\\"background-color:#ffffff\\\">招商规则说明</span></span></span></p>", value = "招商方案描述：富文本内容，可能包含html标签")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AlipayMarketingRecruitPlanQueryResponseModel enrollEndTime(String enrollEndTime) {
    
    this.enrollEndTime = enrollEndTime;
    return this;
  }

   /**
   * 报名结束时间
   * @return enrollEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 01:01:01", value = "报名结束时间")

  public String getEnrollEndTime() {
    return enrollEndTime;
  }


  public void setEnrollEndTime(String enrollEndTime) {
    this.enrollEndTime = enrollEndTime;
  }


  public AlipayMarketingRecruitPlanQueryResponseModel enrollRules(List<RecruitEnrollRule> enrollRules) {
    
    this.enrollRules = enrollRules;
    return this;
  }

  public AlipayMarketingRecruitPlanQueryResponseModel addEnrollRulesItem(RecruitEnrollRule enrollRulesItem) {
    if (this.enrollRules == null) {
      this.enrollRules = new ArrayList<>();
    }
    this.enrollRules.add(enrollRulesItem);
    return this;
  }

   /**
   * \&quot;招商报名规则。 说明： 1. 查询到的规则将用于 alipay.marketing.recruit.enroll.create(招商报名提交)接口。 2. enroll_rules.required 为 true 时，enroll_rules.type 对应的内容类型在报名提交时必填。\&quot;
   * @return enrollRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "\"招商报名规则。 说明： 1. 查询到的规则将用于 alipay.marketing.recruit.enroll.create(招商报名提交)接口。 2. enroll_rules.required 为 true 时，enroll_rules.type 对应的内容类型在报名提交时必填。\"")

  public List<RecruitEnrollRule> getEnrollRules() {
    return enrollRules;
  }


  public void setEnrollRules(List<RecruitEnrollRule> enrollRules) {
    this.enrollRules = enrollRules;
  }


  public AlipayMarketingRecruitPlanQueryResponseModel enrollSceneType(String enrollSceneType) {
    
    this.enrollSceneType = enrollSceneType;
    return this;
  }

   /**
   * 招商方案所属报名场景 枚举值： VOUCHER：券报名场景； MINI_APP：小程序报名场景；
   * @return enrollSceneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VOUCHER", value = "招商方案所属报名场景 枚举值： VOUCHER：券报名场景； MINI_APP：小程序报名场景；")

  public String getEnrollSceneType() {
    return enrollSceneType;
  }


  public void setEnrollSceneType(String enrollSceneType) {
    this.enrollSceneType = enrollSceneType;
  }


  public AlipayMarketingRecruitPlanQueryResponseModel enrollStartTime(String enrollStartTime) {
    
    this.enrollStartTime = enrollStartTime;
    return this;
  }

   /**
   * 报名开始时间
   * @return enrollStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 01:01:01", value = "报名开始时间")

  public String getEnrollStartTime() {
    return enrollStartTime;
  }


  public void setEnrollStartTime(String enrollStartTime) {
    this.enrollStartTime = enrollStartTime;
  }


  public AlipayMarketingRecruitPlanQueryResponseModel logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * 方案头图链接，150x150 以上尺寸的方形图片
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://xxxx", value = "方案头图链接，150x150 以上尺寸的方形图片")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public AlipayMarketingRecruitPlanQueryResponseModel planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * 招商方案ID
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021042001000100000000668277", value = "招商方案ID")

  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public AlipayMarketingRecruitPlanQueryResponseModel planName(String planName) {
    
    this.planName = planName;
    return this;
  }

   /**
   * 招商方案名称
   * @return planName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "招商方案名称", value = "招商方案名称")

  public String getPlanName() {
    return planName;
  }


  public void setPlanName(String planName) {
    this.planName = planName;
  }


  public AlipayMarketingRecruitPlanQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 方案状态: 不可用:DISABLED;可用:ENABLED
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENABLED", value = "方案状态: 不可用:DISABLED;可用:ENABLED")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingRecruitPlanQueryResponseModel alipayMarketingRecruitPlanQueryResponseModel = (AlipayMarketingRecruitPlanQueryResponseModel) o;
    return Objects.equals(this.description, alipayMarketingRecruitPlanQueryResponseModel.description) &&
        Objects.equals(this.enrollEndTime, alipayMarketingRecruitPlanQueryResponseModel.enrollEndTime) &&
        Objects.equals(this.enrollRules, alipayMarketingRecruitPlanQueryResponseModel.enrollRules) &&
        Objects.equals(this.enrollSceneType, alipayMarketingRecruitPlanQueryResponseModel.enrollSceneType) &&
        Objects.equals(this.enrollStartTime, alipayMarketingRecruitPlanQueryResponseModel.enrollStartTime) &&
        Objects.equals(this.logo, alipayMarketingRecruitPlanQueryResponseModel.logo) &&
        Objects.equals(this.planId, alipayMarketingRecruitPlanQueryResponseModel.planId) &&
        Objects.equals(this.planName, alipayMarketingRecruitPlanQueryResponseModel.planName) &&
        Objects.equals(this.status, alipayMarketingRecruitPlanQueryResponseModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enrollEndTime, enrollRules, enrollSceneType, enrollStartTime, logo, planId, planName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingRecruitPlanQueryResponseModel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enrollEndTime: ").append(toIndentedString(enrollEndTime)).append("\n");
    sb.append("    enrollRules: ").append(toIndentedString(enrollRules)).append("\n");
    sb.append("    enrollSceneType: ").append(toIndentedString(enrollSceneType)).append("\n");
    sb.append("    enrollStartTime: ").append(toIndentedString(enrollStartTime)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("enroll_end_time");
    openapiFields.add("enroll_rules");
    openapiFields.add("enroll_scene_type");
    openapiFields.add("enroll_start_time");
    openapiFields.add("logo");
    openapiFields.add("plan_id");
    openapiFields.add("plan_name");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingRecruitPlanQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingRecruitPlanQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingRecruitPlanQueryResponseModel is not found in the empty JSON string", AlipayMarketingRecruitPlanQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingRecruitPlanQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingRecruitPlanQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("enroll_end_time") != null && !jsonObj.get("enroll_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enroll_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enroll_end_time").toString()));
      }
      JsonArray jsonArrayenrollRules = jsonObj.getAsJsonArray("enroll_rules");
      if (jsonArrayenrollRules != null) {
        // ensure the json data is an array
        if (!jsonObj.get("enroll_rules").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `enroll_rules` to be an array in the JSON string but got `%s`", jsonObj.get("enroll_rules").toString()));
        }

        // validate the optional field `enroll_rules` (array)
        for (int i = 0; i < jsonArrayenrollRules.size(); i++) {
          RecruitEnrollRule.validateJsonObject(jsonArrayenrollRules.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("enroll_scene_type") != null && !jsonObj.get("enroll_scene_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enroll_scene_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enroll_scene_type").toString()));
      }
      if (jsonObj.get("enroll_start_time") != null && !jsonObj.get("enroll_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enroll_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enroll_start_time").toString()));
      }
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if (jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if (jsonObj.get("plan_name") != null && !jsonObj.get("plan_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_name").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingRecruitPlanQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingRecruitPlanQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingRecruitPlanQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingRecruitPlanQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingRecruitPlanQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingRecruitPlanQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingRecruitPlanQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingRecruitPlanQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingRecruitPlanQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingRecruitPlanQueryResponseModel
  */
  public static AlipayMarketingRecruitPlanQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingRecruitPlanQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingRecruitPlanQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

