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
import com.alipay.v3.model.PromoOperatorInfo;
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
 * KoubeiMarketingCampaignIntelligentShopConsultModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KoubeiMarketingCampaignIntelligentShopConsultModel {
  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_OPERATOR_CONTEXT = "operator_context";
  @SerializedName(SERIALIZED_NAME_OPERATOR_CONTEXT)
  private PromoOperatorInfo operatorContext;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_PAGE_INDEX = "page_index";
  @SerializedName(SERIALIZED_NAME_PAGE_INDEX)
  private String pageIndex;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_PROMO_ID = "promo_id";
  @SerializedName(SERIALIZED_NAME_PROMO_ID)
  private String promoId;

  public static final String SERIALIZED_NAME_TEMPLATE_CODE = "template_code";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_CODE)
  private String templateCode;

  public KoubeiMarketingCampaignIntelligentShopConsultModel() { 
  }

  public KoubeiMarketingCampaignIntelligentShopConsultModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 根据不同场景,过滤不同的门店数据,可参考值:CREATE_NORMAL:正常创建;RENEWAL_OLD:原方案续期;RENEWAL_NEW:新方案续期
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CREATE_NORMAL", value = "根据不同场景,过滤不同的门店数据,可参考值:CREATE_NORMAL:正常创建;RENEWAL_OLD:原方案续期;RENEWAL_NEW:新方案续期")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public KoubeiMarketingCampaignIntelligentShopConsultModel operatorContext(PromoOperatorInfo operatorContext) {
    
    this.operatorContext = operatorContext;
    return this;
  }

   /**
   * Get operatorContext
   * @return operatorContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PromoOperatorInfo getOperatorContext() {
    return operatorContext;
  }


  public void setOperatorContext(PromoOperatorInfo operatorContext) {
    this.operatorContext = operatorContext;
  }


  public KoubeiMarketingCampaignIntelligentShopConsultModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 外部业务id，请尽量保持足够的复杂，方便定位数据来源
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "65165813-a51a-44b9-984c-c75022ecbaf7", value = "外部业务id，请尽量保持足够的复杂，方便定位数据来源")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public KoubeiMarketingCampaignIntelligentShopConsultModel pageIndex(String pageIndex) {
    
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * 当前页码，默认：“1”
   * @return pageIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页码，默认：“1”")

  public String getPageIndex() {
    return pageIndex;
  }


  public void setPageIndex(String pageIndex) {
    this.pageIndex = pageIndex;
  }


  public KoubeiMarketingCampaignIntelligentShopConsultModel pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页项数[1, 500]， 默认500
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "每页项数[1, 500]， 默认500")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public KoubeiMarketingCampaignIntelligentShopConsultModel partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 商户和支付宝交互时，用于代表支付宝分配给商户ID
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "208805674367676", value = "商户和支付宝交互时，用于代表支付宝分配给商户ID")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public KoubeiMarketingCampaignIntelligentShopConsultModel planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * 智能营销方案的方案id（template_code替代该值，无需传递）
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170909000000000013690911001490", value = "智能营销方案的方案id（template_code替代该值，无需传递）")

  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public KoubeiMarketingCampaignIntelligentShopConsultModel promoId(String promoId) {
    
    this.promoId = promoId;
    return this;
  }

   /**
   * 结合biz_scene一起使用,值为RENEWAL_OLD:原方案续期、RENEWAL_NEW:新方案续期,要求必传
   * @return promoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180111000000000613692911004200", value = "结合biz_scene一起使用,值为RENEWAL_OLD:原方案续期、RENEWAL_NEW:新方案续期,要求必传")

  public String getPromoId() {
    return promoId;
  }


  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }


  public KoubeiMarketingCampaignIntelligentShopConsultModel templateCode(String templateCode) {
    
    this.templateCode = templateCode;
    return this;
  }

   /**
   * 营销模板的编号，默认GENERAL_EXPERIENCE（不传值）  可选枚举：  GENERAL_EXPERIENCE：全场体验；  GENERAL_NORMAL：全场普通；  GENERAL_20171212：全场2017双12版；  CROWD_EXPERIENCE：千人千券体验；  CROWD_NORMAL：千人千券普通；  CROWD_20171212：千人千券2017双12版；
   * @return templateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GENERAL_EXPERIENCE", value = "营销模板的编号，默认GENERAL_EXPERIENCE（不传值）  可选枚举：  GENERAL_EXPERIENCE：全场体验；  GENERAL_NORMAL：全场普通；  GENERAL_20171212：全场2017双12版；  CROWD_EXPERIENCE：千人千券体验；  CROWD_NORMAL：千人千券普通；  CROWD_20171212：千人千券2017双12版；")

  public String getTemplateCode() {
    return templateCode;
  }


  public void setTemplateCode(String templateCode) {
    this.templateCode = templateCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KoubeiMarketingCampaignIntelligentShopConsultModel koubeiMarketingCampaignIntelligentShopConsultModel = (KoubeiMarketingCampaignIntelligentShopConsultModel) o;
    return Objects.equals(this.bizScene, koubeiMarketingCampaignIntelligentShopConsultModel.bizScene) &&
        Objects.equals(this.operatorContext, koubeiMarketingCampaignIntelligentShopConsultModel.operatorContext) &&
        Objects.equals(this.outRequestNo, koubeiMarketingCampaignIntelligentShopConsultModel.outRequestNo) &&
        Objects.equals(this.pageIndex, koubeiMarketingCampaignIntelligentShopConsultModel.pageIndex) &&
        Objects.equals(this.pageSize, koubeiMarketingCampaignIntelligentShopConsultModel.pageSize) &&
        Objects.equals(this.partnerId, koubeiMarketingCampaignIntelligentShopConsultModel.partnerId) &&
        Objects.equals(this.planId, koubeiMarketingCampaignIntelligentShopConsultModel.planId) &&
        Objects.equals(this.promoId, koubeiMarketingCampaignIntelligentShopConsultModel.promoId) &&
        Objects.equals(this.templateCode, koubeiMarketingCampaignIntelligentShopConsultModel.templateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizScene, operatorContext, outRequestNo, pageIndex, pageSize, partnerId, planId, promoId, templateCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KoubeiMarketingCampaignIntelligentShopConsultModel {\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    operatorContext: ").append(toIndentedString(operatorContext)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
    sb.append("    templateCode: ").append(toIndentedString(templateCode)).append("\n");
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
    openapiFields.add("biz_scene");
    openapiFields.add("operator_context");
    openapiFields.add("out_request_no");
    openapiFields.add("page_index");
    openapiFields.add("page_size");
    openapiFields.add("partner_id");
    openapiFields.add("plan_id");
    openapiFields.add("promo_id");
    openapiFields.add("template_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KoubeiMarketingCampaignIntelligentShopConsultModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (KoubeiMarketingCampaignIntelligentShopConsultModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in KoubeiMarketingCampaignIntelligentShopConsultModel is not found in the empty JSON string", KoubeiMarketingCampaignIntelligentShopConsultModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KoubeiMarketingCampaignIntelligentShopConsultModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KoubeiMarketingCampaignIntelligentShopConsultModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      // validate the optional field `operator_context`
      if (jsonObj.getAsJsonObject("operator_context") != null) {
        PromoOperatorInfo.validateJsonObject(jsonObj.getAsJsonObject("operator_context"));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("page_index") != null && !jsonObj.get("page_index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_index").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
      if (jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if (jsonObj.get("promo_id") != null && !jsonObj.get("promo_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promo_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promo_id").toString()));
      }
      if (jsonObj.get("template_code") != null && !jsonObj.get("template_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KoubeiMarketingCampaignIntelligentShopConsultModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KoubeiMarketingCampaignIntelligentShopConsultModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KoubeiMarketingCampaignIntelligentShopConsultModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KoubeiMarketingCampaignIntelligentShopConsultModel.class));

       return (TypeAdapter<T>) new TypeAdapter<KoubeiMarketingCampaignIntelligentShopConsultModel>() {
           @Override
           public void write(JsonWriter out, KoubeiMarketingCampaignIntelligentShopConsultModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KoubeiMarketingCampaignIntelligentShopConsultModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KoubeiMarketingCampaignIntelligentShopConsultModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KoubeiMarketingCampaignIntelligentShopConsultModel
  * @throws IOException if the JSON string is invalid with respect to KoubeiMarketingCampaignIntelligentShopConsultModel
  */
  public static KoubeiMarketingCampaignIntelligentShopConsultModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KoubeiMarketingCampaignIntelligentShopConsultModel.class);
  }

 /**
  * Convert an instance of KoubeiMarketingCampaignIntelligentShopConsultModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

