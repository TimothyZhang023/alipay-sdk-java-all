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
 * AlipayMarketingCampaignCashStatusModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCampaignCashStatusModifyModel {
  public static final String SERIALIZED_NAME_CAMP_STATUS = "camp_status";
  @SerializedName(SERIALIZED_NAME_CAMP_STATUS)
  private String campStatus;

  public static final String SERIALIZED_NAME_CROWD_NO = "crowd_no";
  @SerializedName(SERIALIZED_NAME_CROWD_NO)
  private String crowdNo;

  public AlipayMarketingCampaignCashStatusModifyModel() { 
  }

  public AlipayMarketingCampaignCashStatusModifyModel campStatus(String campStatus) {
    
    this.campStatus = campStatus;
    return this;
  }

   /**
   * 金活动修改后的状态。支持修改为： *PAUSE：活动暂停。 *READY：活动开始。 *CLOSED：活动结束。
   * @return campStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PAUSE", value = "金活动修改后的状态。支持修改为： *PAUSE：活动暂停。 *READY：活动开始。 *CLOSED：活动结束。")

  public String getCampStatus() {
    return campStatus;
  }


  public void setCampStatus(String campStatus) {
    this.campStatus = campStatus;
  }


  public AlipayMarketingCampaignCashStatusModifyModel crowdNo(String crowdNo) {
    
    this.crowdNo = crowdNo;
    return this;
  }

   /**
   * 现金活动号，通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_5/alipay.marketing.campaign.cash.create\&quot;&gt;alipay.marketing.campaign.cash.create&lt;/a&gt;(创建现金活动)接口创建现金活动获取。
   * @return crowdNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HHV-vl7IKtHddoWgpHTOdL_KQRIpfQbl47xfRmmPBlDMnSZ96O-zxUfKlHp5cxmx", value = "现金活动号，通过<a href=\"https://opendocs.alipay.com/apis/api_5/alipay.marketing.campaign.cash.create\">alipay.marketing.campaign.cash.create</a>(创建现金活动)接口创建现金活动获取。")

  public String getCrowdNo() {
    return crowdNo;
  }


  public void setCrowdNo(String crowdNo) {
    this.crowdNo = crowdNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCampaignCashStatusModifyModel alipayMarketingCampaignCashStatusModifyModel = (AlipayMarketingCampaignCashStatusModifyModel) o;
    return Objects.equals(this.campStatus, alipayMarketingCampaignCashStatusModifyModel.campStatus) &&
        Objects.equals(this.crowdNo, alipayMarketingCampaignCashStatusModifyModel.crowdNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campStatus, crowdNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCampaignCashStatusModifyModel {\n");
    sb.append("    campStatus: ").append(toIndentedString(campStatus)).append("\n");
    sb.append("    crowdNo: ").append(toIndentedString(crowdNo)).append("\n");
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
    openapiFields.add("camp_status");
    openapiFields.add("crowd_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCampaignCashStatusModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCampaignCashStatusModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCampaignCashStatusModifyModel is not found in the empty JSON string", AlipayMarketingCampaignCashStatusModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCampaignCashStatusModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCampaignCashStatusModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("camp_status") != null && !jsonObj.get("camp_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `camp_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("camp_status").toString()));
      }
      if (jsonObj.get("crowd_no") != null && !jsonObj.get("crowd_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crowd_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crowd_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCampaignCashStatusModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCampaignCashStatusModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCampaignCashStatusModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCampaignCashStatusModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCampaignCashStatusModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCampaignCashStatusModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCampaignCashStatusModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCampaignCashStatusModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCampaignCashStatusModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCampaignCashStatusModifyModel
  */
  public static AlipayMarketingCampaignCashStatusModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCampaignCashStatusModifyModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCampaignCashStatusModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

