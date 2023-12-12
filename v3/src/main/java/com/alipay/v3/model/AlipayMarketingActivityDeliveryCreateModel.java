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
import com.alipay.v3.model.DeliveryAgencyMerchantInfo;
import com.alipay.v3.model.DeliveryBaseInfo;
import com.alipay.v3.model.DeliveryConfig;
import com.alipay.v3.model.DeliveryPlayConfig;
import com.alipay.v3.model.DeliveryTargetRule;
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
 * AlipayMarketingActivityDeliveryCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityDeliveryCreateModel {
  public static final String SERIALIZED_NAME_BELONG_MERCHANT_INFO = "belong_merchant_info";
  @SerializedName(SERIALIZED_NAME_BELONG_MERCHANT_INFO)
  private DeliveryAgencyMerchantInfo belongMerchantInfo;

  public static final String SERIALIZED_NAME_DELIVERY_BASE_INFO = "delivery_base_info";
  @SerializedName(SERIALIZED_NAME_DELIVERY_BASE_INFO)
  private DeliveryBaseInfo deliveryBaseInfo;

  public static final String SERIALIZED_NAME_DELIVERY_BOOTH_CODE = "delivery_booth_code";
  @SerializedName(SERIALIZED_NAME_DELIVERY_BOOTH_CODE)
  private String deliveryBoothCode;

  public static final String SERIALIZED_NAME_DELIVERY_CONFIG_LIST = "delivery_config_list";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CONFIG_LIST)
  private List<DeliveryConfig> deliveryConfigList = null;

  public static final String SERIALIZED_NAME_DELIVERY_PLAY_CONFIG = "delivery_play_config";
  @SerializedName(SERIALIZED_NAME_DELIVERY_PLAY_CONFIG)
  private DeliveryPlayConfig deliveryPlayConfig;

  public static final String SERIALIZED_NAME_DELIVERY_TARGET_RULE = "delivery_target_rule";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TARGET_RULE)
  private DeliveryTargetRule deliveryTargetRule;

  public static final String SERIALIZED_NAME_MERCHANT_ACCESS_MODE = "merchant_access_mode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCESS_MODE)
  private String merchantAccessMode;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public AlipayMarketingActivityDeliveryCreateModel() { 
  }

  public AlipayMarketingActivityDeliveryCreateModel belongMerchantInfo(DeliveryAgencyMerchantInfo belongMerchantInfo) {
    
    this.belongMerchantInfo = belongMerchantInfo;
    return this;
  }

   /**
   * Get belongMerchantInfo
   * @return belongMerchantInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryAgencyMerchantInfo getBelongMerchantInfo() {
    return belongMerchantInfo;
  }


  public void setBelongMerchantInfo(DeliveryAgencyMerchantInfo belongMerchantInfo) {
    this.belongMerchantInfo = belongMerchantInfo;
  }


  public AlipayMarketingActivityDeliveryCreateModel deliveryBaseInfo(DeliveryBaseInfo deliveryBaseInfo) {
    
    this.deliveryBaseInfo = deliveryBaseInfo;
    return this;
  }

   /**
   * Get deliveryBaseInfo
   * @return deliveryBaseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryBaseInfo getDeliveryBaseInfo() {
    return deliveryBaseInfo;
  }


  public void setDeliveryBaseInfo(DeliveryBaseInfo deliveryBaseInfo) {
    this.deliveryBaseInfo = deliveryBaseInfo;
  }


  public AlipayMarketingActivityDeliveryCreateModel deliveryBoothCode(String deliveryBoothCode) {
    
    this.deliveryBoothCode = deliveryBoothCode;
    return this;
  }

   /**
   * 投放的展位编码。
   * @return deliveryBoothCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PUBLIC_UNION", value = "投放的展位编码。")

  public String getDeliveryBoothCode() {
    return deliveryBoothCode;
  }


  public void setDeliveryBoothCode(String deliveryBoothCode) {
    this.deliveryBoothCode = deliveryBoothCode;
  }


  public AlipayMarketingActivityDeliveryCreateModel deliveryConfigList(List<DeliveryConfig> deliveryConfigList) {
    
    this.deliveryConfigList = deliveryConfigList;
    return this;
  }

  public AlipayMarketingActivityDeliveryCreateModel addDeliveryConfigListItem(DeliveryConfig deliveryConfigListItem) {
    if (this.deliveryConfigList == null) {
      this.deliveryConfigList = new ArrayList<>();
    }
    this.deliveryConfigList.add(deliveryConfigListItem);
    return this;
  }

   /**
   * [已废弃] 待创建的投放配置列表。 最大数量限制20个。
   * @return deliveryConfigList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[已废弃] 待创建的投放配置列表。 最大数量限制20个。")

  public List<DeliveryConfig> getDeliveryConfigList() {
    return deliveryConfigList;
  }


  public void setDeliveryConfigList(List<DeliveryConfig> deliveryConfigList) {
    this.deliveryConfigList = deliveryConfigList;
  }


  public AlipayMarketingActivityDeliveryCreateModel deliveryPlayConfig(DeliveryPlayConfig deliveryPlayConfig) {
    
    this.deliveryPlayConfig = deliveryPlayConfig;
    return this;
  }

   /**
   * Get deliveryPlayConfig
   * @return deliveryPlayConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryPlayConfig getDeliveryPlayConfig() {
    return deliveryPlayConfig;
  }


  public void setDeliveryPlayConfig(DeliveryPlayConfig deliveryPlayConfig) {
    this.deliveryPlayConfig = deliveryPlayConfig;
  }


  public AlipayMarketingActivityDeliveryCreateModel deliveryTargetRule(DeliveryTargetRule deliveryTargetRule) {
    
    this.deliveryTargetRule = deliveryTargetRule;
    return this;
  }

   /**
   * Get deliveryTargetRule
   * @return deliveryTargetRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryTargetRule getDeliveryTargetRule() {
    return deliveryTargetRule;
  }


  public void setDeliveryTargetRule(DeliveryTargetRule deliveryTargetRule) {
    this.deliveryTargetRule = deliveryTargetRule;
  }


  public AlipayMarketingActivityDeliveryCreateModel merchantAccessMode(String merchantAccessMode) {
    
    this.merchantAccessMode = merchantAccessMode;
    return this;
  }

   /**
   * 商户接入模式
   * @return merchantAccessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SELF_MODE", value = "商户接入模式")

  public String getMerchantAccessMode() {
    return merchantAccessMode;
  }


  public void setMerchantAccessMode(String merchantAccessMode) {
    this.merchantAccessMode = merchantAccessMode;
  }


  public AlipayMarketingActivityDeliveryCreateModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务单号，用作幂等控制。 幂等作用：请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170101000001654bb46ba", value = "外部业务单号，用作幂等控制。 幂等作用：请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityDeliveryCreateModel alipayMarketingActivityDeliveryCreateModel = (AlipayMarketingActivityDeliveryCreateModel) o;
    return Objects.equals(this.belongMerchantInfo, alipayMarketingActivityDeliveryCreateModel.belongMerchantInfo) &&
        Objects.equals(this.deliveryBaseInfo, alipayMarketingActivityDeliveryCreateModel.deliveryBaseInfo) &&
        Objects.equals(this.deliveryBoothCode, alipayMarketingActivityDeliveryCreateModel.deliveryBoothCode) &&
        Objects.equals(this.deliveryConfigList, alipayMarketingActivityDeliveryCreateModel.deliveryConfigList) &&
        Objects.equals(this.deliveryPlayConfig, alipayMarketingActivityDeliveryCreateModel.deliveryPlayConfig) &&
        Objects.equals(this.deliveryTargetRule, alipayMarketingActivityDeliveryCreateModel.deliveryTargetRule) &&
        Objects.equals(this.merchantAccessMode, alipayMarketingActivityDeliveryCreateModel.merchantAccessMode) &&
        Objects.equals(this.outBizNo, alipayMarketingActivityDeliveryCreateModel.outBizNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(belongMerchantInfo, deliveryBaseInfo, deliveryBoothCode, deliveryConfigList, deliveryPlayConfig, deliveryTargetRule, merchantAccessMode, outBizNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityDeliveryCreateModel {\n");
    sb.append("    belongMerchantInfo: ").append(toIndentedString(belongMerchantInfo)).append("\n");
    sb.append("    deliveryBaseInfo: ").append(toIndentedString(deliveryBaseInfo)).append("\n");
    sb.append("    deliveryBoothCode: ").append(toIndentedString(deliveryBoothCode)).append("\n");
    sb.append("    deliveryConfigList: ").append(toIndentedString(deliveryConfigList)).append("\n");
    sb.append("    deliveryPlayConfig: ").append(toIndentedString(deliveryPlayConfig)).append("\n");
    sb.append("    deliveryTargetRule: ").append(toIndentedString(deliveryTargetRule)).append("\n");
    sb.append("    merchantAccessMode: ").append(toIndentedString(merchantAccessMode)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
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
    openapiFields.add("belong_merchant_info");
    openapiFields.add("delivery_base_info");
    openapiFields.add("delivery_booth_code");
    openapiFields.add("delivery_config_list");
    openapiFields.add("delivery_play_config");
    openapiFields.add("delivery_target_rule");
    openapiFields.add("merchant_access_mode");
    openapiFields.add("out_biz_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityDeliveryCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityDeliveryCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityDeliveryCreateModel is not found in the empty JSON string", AlipayMarketingActivityDeliveryCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityDeliveryCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityDeliveryCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `belong_merchant_info`
      if (jsonObj.getAsJsonObject("belong_merchant_info") != null) {
        DeliveryAgencyMerchantInfo.validateJsonObject(jsonObj.getAsJsonObject("belong_merchant_info"));
      }
      // validate the optional field `delivery_base_info`
      if (jsonObj.getAsJsonObject("delivery_base_info") != null) {
        DeliveryBaseInfo.validateJsonObject(jsonObj.getAsJsonObject("delivery_base_info"));
      }
      if (jsonObj.get("delivery_booth_code") != null && !jsonObj.get("delivery_booth_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_booth_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_booth_code").toString()));
      }
      JsonArray jsonArraydeliveryConfigList = jsonObj.getAsJsonArray("delivery_config_list");
      if (jsonArraydeliveryConfigList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("delivery_config_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `delivery_config_list` to be an array in the JSON string but got `%s`", jsonObj.get("delivery_config_list").toString()));
        }

        // validate the optional field `delivery_config_list` (array)
        for (int i = 0; i < jsonArraydeliveryConfigList.size(); i++) {
          DeliveryConfig.validateJsonObject(jsonArraydeliveryConfigList.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `delivery_play_config`
      if (jsonObj.getAsJsonObject("delivery_play_config") != null) {
        DeliveryPlayConfig.validateJsonObject(jsonObj.getAsJsonObject("delivery_play_config"));
      }
      // validate the optional field `delivery_target_rule`
      if (jsonObj.getAsJsonObject("delivery_target_rule") != null) {
        DeliveryTargetRule.validateJsonObject(jsonObj.getAsJsonObject("delivery_target_rule"));
      }
      if (jsonObj.get("merchant_access_mode") != null && !jsonObj.get("merchant_access_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_access_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_access_mode").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityDeliveryCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityDeliveryCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityDeliveryCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityDeliveryCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityDeliveryCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityDeliveryCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityDeliveryCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityDeliveryCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityDeliveryCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityDeliveryCreateModel
  */
  public static AlipayMarketingActivityDeliveryCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityDeliveryCreateModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityDeliveryCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

