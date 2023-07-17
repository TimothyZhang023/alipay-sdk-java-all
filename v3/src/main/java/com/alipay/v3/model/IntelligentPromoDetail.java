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
import com.alipay.v3.model.BudgetInfo;
import com.alipay.v3.model.ConstraintInfo;
import com.alipay.v3.model.CrowdConstraintInfo;
import com.alipay.v3.model.IntelligentPromoEffect;
import com.alipay.v3.model.PromoTool;
import com.alipay.v3.model.PublishChannel;
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
 * IntelligentPromoDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IntelligentPromoDetail {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private BudgetInfo budget;

  public static final String SERIALIZED_NAME_CAMP_ID = "camp_id";
  @SerializedName(SERIALIZED_NAME_CAMP_ID)
  private String campId;

  public static final String SERIALIZED_NAME_CONSTRAINT = "constraint";
  @SerializedName(SERIALIZED_NAME_CONSTRAINT)
  private ConstraintInfo constraint;

  public static final String SERIALIZED_NAME_CROWD_CONSTRAINT = "crowd_constraint";
  @SerializedName(SERIALIZED_NAME_CROWD_CONSTRAINT)
  private CrowdConstraintInfo crowdConstraint;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_FORECAST_EFFECT = "forecast_effect";
  @SerializedName(SERIALIZED_NAME_FORECAST_EFFECT)
  private IntelligentPromoEffect forecastEffect;

  public static final String SERIALIZED_NAME_MERCHANT_PROMO_TYPE = "merchant_promo_type";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PROMO_TYPE)
  private String merchantPromoType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROMO_TOOLS = "promo_tools";
  @SerializedName(SERIALIZED_NAME_PROMO_TOOLS)
  private List<PromoTool> promoTools = null;

  public static final String SERIALIZED_NAME_PUBLISH_CHANNELS = "publish_channels";
  @SerializedName(SERIALIZED_NAME_PUBLISH_CHANNELS)
  private List<PublishChannel> publishChannels = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public IntelligentPromoDetail() { 
  }

  public IntelligentPromoDetail budget(BudgetInfo budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BudgetInfo getBudget() {
    return budget;
  }


  public void setBudget(BudgetInfo budget) {
    this.budget = budget;
  }


  public IntelligentPromoDetail campId(String campId) {
    
    this.campId = campId;
    return this;
  }

   /**
   * 营销活动的id，也就是消费送的活动id
   * @return campId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170901000000000006913911002170", value = "营销活动的id，也就是消费送的活动id")

  public String getCampId() {
    return campId;
  }


  public void setCampId(String campId) {
    this.campId = campId;
  }


  public IntelligentPromoDetail constraint(ConstraintInfo constraint) {
    
    this.constraint = constraint;
    return this;
  }

   /**
   * Get constraint
   * @return constraint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConstraintInfo getConstraint() {
    return constraint;
  }


  public void setConstraint(ConstraintInfo constraint) {
    this.constraint = constraint;
  }


  public IntelligentPromoDetail crowdConstraint(CrowdConstraintInfo crowdConstraint) {
    
    this.crowdConstraint = crowdConstraint;
    return this;
  }

   /**
   * Get crowdConstraint
   * @return crowdConstraint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CrowdConstraintInfo getCrowdConstraint() {
    return crowdConstraint;
  }


  public void setCrowdConstraint(CrowdConstraintInfo crowdConstraint) {
    this.crowdConstraint = crowdConstraint;
  }


  public IntelligentPromoDetail desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 智能营销活动的子活动
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是一个全场消费送的活动", value = "智能营销活动的子活动")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public IntelligentPromoDetail extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 活动扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\\\"key\\\":\\\"value\\\"}", value = "活动扩展信息")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public IntelligentPromoDetail forecastEffect(IntelligentPromoEffect forecastEffect) {
    
    this.forecastEffect = forecastEffect;
    return this;
  }

   /**
   * Get forecastEffect
   * @return forecastEffect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IntelligentPromoEffect getForecastEffect() {
    return forecastEffect;
  }


  public void setForecastEffect(IntelligentPromoEffect forecastEffect) {
    this.forecastEffect = forecastEffect;
  }


  public IntelligentPromoDetail merchantPromoType(String merchantPromoType) {
    
    this.merchantPromoType = merchantPromoType;
    return this;
  }

   /**
   * 自运营活动类型。DIRECT_SEND：直发奖；CONSUME_SEND：消费送
   * @return merchantPromoType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DIRECT_SEND", value = "自运营活动类型。DIRECT_SEND：直发奖；CONSUME_SEND：消费送")

  public String getMerchantPromoType() {
    return merchantPromoType;
  }


  public void setMerchantPromoType(String merchantPromoType) {
    this.merchantPromoType = merchantPromoType;
  }


  public IntelligentPromoDetail name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 子营销活动名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "全场消费送活动", value = "子营销活动名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IntelligentPromoDetail promoTools(List<PromoTool> promoTools) {
    
    this.promoTools = promoTools;
    return this;
  }

  public IntelligentPromoDetail addPromoToolsItem(PromoTool promoToolsItem) {
    if (this.promoTools == null) {
      this.promoTools = new ArrayList<>();
    }
    this.promoTools.add(promoToolsItem);
    return this;
  }

   /**
   * 营销工具集合。主要是活动涉及到的奖品信息
   * @return promoTools
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "营销工具集合。主要是活动涉及到的奖品信息")

  public List<PromoTool> getPromoTools() {
    return promoTools;
  }


  public void setPromoTools(List<PromoTool> promoTools) {
    this.promoTools = promoTools;
  }


  public IntelligentPromoDetail publishChannels(List<PublishChannel> publishChannels) {
    
    this.publishChannels = publishChannels;
    return this;
  }

  public IntelligentPromoDetail addPublishChannelsItem(PublishChannel publishChannelsItem) {
    if (this.publishChannels == null) {
      this.publishChannels = new ArrayList<>();
    }
    this.publishChannels.add(publishChannelsItem);
    return this;
  }

   /**
   * 投放渠道信息
   * @return publishChannels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "投放渠道信息")

  public List<PublishChannel> getPublishChannels() {
    return publishChannels;
  }


  public void setPublishChannels(List<PublishChannel> publishChannels) {
    this.publishChannels = publishChannels;
  }


  public IntelligentPromoDetail templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 子营销活动对应的模板id
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170901000000000006912911002170", value = "子营销活动对应的模板id")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntelligentPromoDetail intelligentPromoDetail = (IntelligentPromoDetail) o;
    return Objects.equals(this.budget, intelligentPromoDetail.budget) &&
        Objects.equals(this.campId, intelligentPromoDetail.campId) &&
        Objects.equals(this.constraint, intelligentPromoDetail.constraint) &&
        Objects.equals(this.crowdConstraint, intelligentPromoDetail.crowdConstraint) &&
        Objects.equals(this.desc, intelligentPromoDetail.desc) &&
        Objects.equals(this.extInfo, intelligentPromoDetail.extInfo) &&
        Objects.equals(this.forecastEffect, intelligentPromoDetail.forecastEffect) &&
        Objects.equals(this.merchantPromoType, intelligentPromoDetail.merchantPromoType) &&
        Objects.equals(this.name, intelligentPromoDetail.name) &&
        Objects.equals(this.promoTools, intelligentPromoDetail.promoTools) &&
        Objects.equals(this.publishChannels, intelligentPromoDetail.publishChannels) &&
        Objects.equals(this.templateId, intelligentPromoDetail.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, campId, constraint, crowdConstraint, desc, extInfo, forecastEffect, merchantPromoType, name, promoTools, publishChannels, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntelligentPromoDetail {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    campId: ").append(toIndentedString(campId)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    crowdConstraint: ").append(toIndentedString(crowdConstraint)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    forecastEffect: ").append(toIndentedString(forecastEffect)).append("\n");
    sb.append("    merchantPromoType: ").append(toIndentedString(merchantPromoType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    promoTools: ").append(toIndentedString(promoTools)).append("\n");
    sb.append("    publishChannels: ").append(toIndentedString(publishChannels)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("camp_id");
    openapiFields.add("constraint");
    openapiFields.add("crowd_constraint");
    openapiFields.add("desc");
    openapiFields.add("ext_info");
    openapiFields.add("forecast_effect");
    openapiFields.add("merchant_promo_type");
    openapiFields.add("name");
    openapiFields.add("promo_tools");
    openapiFields.add("publish_channels");
    openapiFields.add("template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IntelligentPromoDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IntelligentPromoDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntelligentPromoDetail is not found in the empty JSON string", IntelligentPromoDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IntelligentPromoDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntelligentPromoDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `budget`
      if (jsonObj.getAsJsonObject("budget") != null) {
        BudgetInfo.validateJsonObject(jsonObj.getAsJsonObject("budget"));
      }
      if (jsonObj.get("camp_id") != null && !jsonObj.get("camp_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `camp_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("camp_id").toString()));
      }
      // validate the optional field `constraint`
      if (jsonObj.getAsJsonObject("constraint") != null) {
        ConstraintInfo.validateJsonObject(jsonObj.getAsJsonObject("constraint"));
      }
      // validate the optional field `crowd_constraint`
      if (jsonObj.getAsJsonObject("crowd_constraint") != null) {
        CrowdConstraintInfo.validateJsonObject(jsonObj.getAsJsonObject("crowd_constraint"));
      }
      if (jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      // validate the optional field `forecast_effect`
      if (jsonObj.getAsJsonObject("forecast_effect") != null) {
        IntelligentPromoEffect.validateJsonObject(jsonObj.getAsJsonObject("forecast_effect"));
      }
      if (jsonObj.get("merchant_promo_type") != null && !jsonObj.get("merchant_promo_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_promo_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_promo_type").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      JsonArray jsonArraypromoTools = jsonObj.getAsJsonArray("promo_tools");
      if (jsonArraypromoTools != null) {
        // ensure the json data is an array
        if (!jsonObj.get("promo_tools").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `promo_tools` to be an array in the JSON string but got `%s`", jsonObj.get("promo_tools").toString()));
        }

        // validate the optional field `promo_tools` (array)
        for (int i = 0; i < jsonArraypromoTools.size(); i++) {
          PromoTool.validateJsonObject(jsonArraypromoTools.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraypublishChannels = jsonObj.getAsJsonArray("publish_channels");
      if (jsonArraypublishChannels != null) {
        // ensure the json data is an array
        if (!jsonObj.get("publish_channels").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `publish_channels` to be an array in the JSON string but got `%s`", jsonObj.get("publish_channels").toString()));
        }

        // validate the optional field `publish_channels` (array)
        for (int i = 0; i < jsonArraypublishChannels.size(); i++) {
          PublishChannel.validateJsonObject(jsonArraypublishChannels.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntelligentPromoDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntelligentPromoDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntelligentPromoDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntelligentPromoDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<IntelligentPromoDetail>() {
           @Override
           public void write(JsonWriter out, IntelligentPromoDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntelligentPromoDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntelligentPromoDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntelligentPromoDetail
  * @throws IOException if the JSON string is invalid with respect to IntelligentPromoDetail
  */
  public static IntelligentPromoDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntelligentPromoDetail.class);
  }

 /**
  * Convert an instance of IntelligentPromoDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

