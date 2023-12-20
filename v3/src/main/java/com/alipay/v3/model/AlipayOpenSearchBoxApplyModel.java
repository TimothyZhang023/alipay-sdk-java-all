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
import com.alipay.v3.model.SearchBoxAppInfo;
import com.alipay.v3.model.SearchBoxServiceInfo;
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
 * AlipayOpenSearchBoxApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchBoxApplyModel {
  public static final String SERIALIZED_NAME_AREA_KEYWORDS = "area_keywords";
  @SerializedName(SERIALIZED_NAME_AREA_KEYWORDS)
  private List<String> areaKeywords = null;

  public static final String SERIALIZED_NAME_BOX_DESC = "box_desc";
  @SerializedName(SERIALIZED_NAME_BOX_DESC)
  private String boxDesc;

  public static final String SERIALIZED_NAME_BRAND_ID = "brand_id";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public static final String SERIALIZED_NAME_BUSINESS_BENEFIT_SWITCH = "business_benefit_switch";
  @SerializedName(SERIALIZED_NAME_BUSINESS_BENEFIT_SWITCH)
  private Boolean businessBenefitSwitch;

  public static final String SERIALIZED_NAME_BUSINESS_DISTRICT_IDS = "business_district_ids";
  @SerializedName(SERIALIZED_NAME_BUSINESS_DISTRICT_IDS)
  private List<String> businessDistrictIds = null;

  public static final String SERIALIZED_NAME_CUSTOM_KEYWORDS = "custom_keywords";
  @SerializedName(SERIALIZED_NAME_CUSTOM_KEYWORDS)
  private List<String> customKeywords = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId;

  public static final String SERIALIZED_NAME_IMAGE_NAME = "image_name";
  @SerializedName(SERIALIZED_NAME_IMAGE_NAME)
  private String imageName;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_RELATED_ACCOUNTS = "related_accounts";
  @SerializedName(SERIALIZED_NAME_RELATED_ACCOUNTS)
  private List<SearchBoxAppInfo> relatedAccounts = null;

  public static final String SERIALIZED_NAME_SERVICE_INFOS = "service_infos";
  @SerializedName(SERIALIZED_NAME_SERVICE_INFOS)
  private List<SearchBoxServiceInfo> serviceInfos = null;

  public static final String SERIALIZED_NAME_TARGET_APPID = "target_appid";
  @SerializedName(SERIALIZED_NAME_TARGET_APPID)
  private String targetAppid;

  public AlipayOpenSearchBoxApplyModel() { 
  }

  public AlipayOpenSearchBoxApplyModel areaKeywords(List<String> areaKeywords) {
    
    this.areaKeywords = areaKeywords;
    return this;
  }

  public AlipayOpenSearchBoxApplyModel addAreaKeywordsItem(String areaKeywordsItem) {
    if (this.areaKeywords == null) {
      this.areaKeywords = new ArrayList<>();
    }
    this.areaKeywords.add(areaKeywordsItem);
    return this;
  }

   /**
   * 小程序直达配置的常用服务中带有门店信息时，可添加简称触发词
   * @return areaKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"简称触发词\"]", value = "小程序直达配置的常用服务中带有门店信息时，可添加简称触发词")

  public List<String> getAreaKeywords() {
    return areaKeywords;
  }


  public void setAreaKeywords(List<String> areaKeywords) {
    this.areaKeywords = areaKeywords;
  }


  public AlipayOpenSearchBoxApplyModel boxDesc(String boxDesc) {
    
    this.boxDesc = boxDesc;
    return this;
  }

   /**
   * 品牌介绍，5-15个中文字符。 小程序直达不支持设置此项
   * @return boxDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "品牌介绍", value = "品牌介绍，5-15个中文字符。 小程序直达不支持设置此项")

  public String getBoxDesc() {
    return boxDesc;
  }


  public void setBoxDesc(String boxDesc) {
    this.boxDesc = boxDesc;
  }


  public AlipayOpenSearchBoxApplyModel brandId(String brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * 品牌id，参考&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/rules/029uy4\&quot;&gt; 品牌认证说明 &lt;/a&gt;
   * @return brandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000467882", value = "品牌id，参考<a href=\"https://opendocs.alipay.com/rules/029uy4\"> 品牌认证说明 </a>")

  public String getBrandId() {
    return brandId;
  }


  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public AlipayOpenSearchBoxApplyModel businessBenefitSwitch(Boolean businessBenefitSwitch) {
    
    this.businessBenefitSwitch = businessBenefitSwitch;
    return this;
  }

   /**
   * 可通过配置来开启商圈权益模块，关闭后搜索直达不展示商圈权益模块
   * @return businessBenefitSwitch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "可通过配置来开启商圈权益模块，关闭后搜索直达不展示商圈权益模块")

  public Boolean getBusinessBenefitSwitch() {
    return businessBenefitSwitch;
  }


  public void setBusinessBenefitSwitch(Boolean businessBenefitSwitch) {
    this.businessBenefitSwitch = businessBenefitSwitch;
  }


  public AlipayOpenSearchBoxApplyModel businessDistrictIds(List<String> businessDistrictIds) {
    
    this.businessDistrictIds = businessDistrictIds;
    return this;
  }

  public AlipayOpenSearchBoxApplyModel addBusinessDistrictIdsItem(String businessDistrictIdsItem) {
    if (this.businessDistrictIds == null) {
      this.businessDistrictIds = new ArrayList<>();
    }
    this.businessDistrictIds.add(businessDistrictIdsItem);
    return this;
  }

   /**
   * 小程序已关联商圈时，可添加商圈id（目前仅对品牌直达开放，小程序直达暂未开放）
   * @return businessDistrictIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"商圈id\"]", value = "小程序已关联商圈时，可添加商圈id（目前仅对品牌直达开放，小程序直达暂未开放）")

  public List<String> getBusinessDistrictIds() {
    return businessDistrictIds;
  }


  public void setBusinessDistrictIds(List<String> businessDistrictIds) {
    this.businessDistrictIds = businessDistrictIds;
  }


  public AlipayOpenSearchBoxApplyModel customKeywords(List<String> customKeywords) {
    
    this.customKeywords = customKeywords;
    return this;
  }

  public AlipayOpenSearchBoxApplyModel addCustomKeywordsItem(String customKeywordsItem) {
    if (this.customKeywords == null) {
      this.customKeywords = new ArrayList<>();
    }
    this.customKeywords.add(customKeywordsItem);
    return this;
  }

   /**
   * 自定义触发词，最多可配置6个，限1-8个中文字符。 小程序直达不支持设置此项
   * @return customKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"自定义触发词\"]", value = "自定义触发词，最多可配置6个，限1-8个中文字符。 小程序直达不支持设置此项")

  public List<String> getCustomKeywords() {
    return customKeywords;
  }


  public void setCustomKeywords(List<String> customKeywords) {
    this.customKeywords = customKeywords;
  }


  public AlipayOpenSearchBoxApplyModel imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 氛围图片id，调用 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03hvl1?ref&#x3D;api\&quot;&gt;支付宝文件上传接口&lt;/a&gt; 上传图片获取图片id(bizCode：search_box_atmosphere)。 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/b/03al6f\&quot;&gt;图片规范&lt;/a&gt;  小程序直达不支持设置此项。
   * @return imageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*oZQmT4xTBPUAAAAAAAAAAAAAAQAAAQ", value = "氛围图片id，调用 <a href=\"https://opendocs.alipay.com/mini/03hvl1?ref=api\">支付宝文件上传接口</a> 上传图片获取图片id(bizCode：search_box_atmosphere)。 <a href=\"https://opendocs.alipay.com/b/03al6f\">图片规范</a>  小程序直达不支持设置此项。")

  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public AlipayOpenSearchBoxApplyModel imageName(String imageName) {
    
    this.imageName = imageName;
    return this;
  }

   /**
   * 氛围图片名。 小程序直达不支持设置此项
   * @return imageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "氛围图1", value = "氛围图片名。 小程序直达不支持设置此项")

  public String getImageName() {
    return imageName;
  }


  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  public AlipayOpenSearchBoxApplyModel merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\&quot;运营支付宝小程序\&quot;授权。
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxxxxx", value = "商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\"运营支付宝小程序\"授权。")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public AlipayOpenSearchBoxApplyModel relatedAccounts(List<SearchBoxAppInfo> relatedAccounts) {
    
    this.relatedAccounts = relatedAccounts;
    return this;
  }

  public AlipayOpenSearchBoxApplyModel addRelatedAccountsItem(SearchBoxAppInfo relatedAccountsItem) {
    if (this.relatedAccounts == null) {
      this.relatedAccounts = new ArrayList<>();
    }
    this.relatedAccounts.add(relatedAccountsItem);
    return this;
  }

   /**
   * 关联账号信息，1-3个。 内部字段均需设置。当为品牌直达时，数组中的第1个账号会被设置为\&quot;账号1\&quot;，也就是将作为搜索直达专区头部的跳转地址
   * @return relatedAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关联账号信息，1-3个。 内部字段均需设置。当为品牌直达时，数组中的第1个账号会被设置为\"账号1\"，也就是将作为搜索直达专区头部的跳转地址")

  public List<SearchBoxAppInfo> getRelatedAccounts() {
    return relatedAccounts;
  }


  public void setRelatedAccounts(List<SearchBoxAppInfo> relatedAccounts) {
    this.relatedAccounts = relatedAccounts;
  }


  public AlipayOpenSearchBoxApplyModel serviceInfos(List<SearchBoxServiceInfo> serviceInfos) {
    
    this.serviceInfos = serviceInfos;
    return this;
  }

  public AlipayOpenSearchBoxApplyModel addServiceInfosItem(SearchBoxServiceInfo serviceInfosItem) {
    if (this.serviceInfos == null) {
      this.serviceInfos = new ArrayList<>();
    }
    this.serviceInfos.add(serviceInfosItem);
    return this;
  }

   /**
   * \&quot;服务信息，服务必须审核通过才能申请搜索直达。品牌直达最多可配置同一品牌认证下的小程序4个，小程序直达最多可配置2个。 内部字段均需设置。\&quot;
   * @return serviceInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "\"服务信息，服务必须审核通过才能申请搜索直达。品牌直达最多可配置同一品牌认证下的小程序4个，小程序直达最多可配置2个。 内部字段均需设置。\"")

  public List<SearchBoxServiceInfo> getServiceInfos() {
    return serviceInfos;
  }


  public void setServiceInfos(List<SearchBoxServiceInfo> serviceInfos) {
    this.serviceInfos = serviceInfos;
  }


  public AlipayOpenSearchBoxApplyModel targetAppid(String targetAppid) {
    
    this.targetAppid = targetAppid;
    return this;
  }

   /**
   * 小程序id，小程序直达时必传，需要和申请的商户主体保持一致，且符合&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/b/03al6e\&quot;&gt; 准入类目 &lt;/a&gt;
   * @return targetAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018092561507369", value = "小程序id，小程序直达时必传，需要和申请的商户主体保持一致，且符合<a href=\"https://opendocs.alipay.com/b/03al6e\"> 准入类目 </a>")

  public String getTargetAppid() {
    return targetAppid;
  }


  public void setTargetAppid(String targetAppid) {
    this.targetAppid = targetAppid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSearchBoxApplyModel alipayOpenSearchBoxApplyModel = (AlipayOpenSearchBoxApplyModel) o;
    return Objects.equals(this.areaKeywords, alipayOpenSearchBoxApplyModel.areaKeywords) &&
        Objects.equals(this.boxDesc, alipayOpenSearchBoxApplyModel.boxDesc) &&
        Objects.equals(this.brandId, alipayOpenSearchBoxApplyModel.brandId) &&
        Objects.equals(this.businessBenefitSwitch, alipayOpenSearchBoxApplyModel.businessBenefitSwitch) &&
        Objects.equals(this.businessDistrictIds, alipayOpenSearchBoxApplyModel.businessDistrictIds) &&
        Objects.equals(this.customKeywords, alipayOpenSearchBoxApplyModel.customKeywords) &&
        Objects.equals(this.imageId, alipayOpenSearchBoxApplyModel.imageId) &&
        Objects.equals(this.imageName, alipayOpenSearchBoxApplyModel.imageName) &&
        Objects.equals(this.merchantId, alipayOpenSearchBoxApplyModel.merchantId) &&
        Objects.equals(this.relatedAccounts, alipayOpenSearchBoxApplyModel.relatedAccounts) &&
        Objects.equals(this.serviceInfos, alipayOpenSearchBoxApplyModel.serviceInfos) &&
        Objects.equals(this.targetAppid, alipayOpenSearchBoxApplyModel.targetAppid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaKeywords, boxDesc, brandId, businessBenefitSwitch, businessDistrictIds, customKeywords, imageId, imageName, merchantId, relatedAccounts, serviceInfos, targetAppid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchBoxApplyModel {\n");
    sb.append("    areaKeywords: ").append(toIndentedString(areaKeywords)).append("\n");
    sb.append("    boxDesc: ").append(toIndentedString(boxDesc)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    businessBenefitSwitch: ").append(toIndentedString(businessBenefitSwitch)).append("\n");
    sb.append("    businessDistrictIds: ").append(toIndentedString(businessDistrictIds)).append("\n");
    sb.append("    customKeywords: ").append(toIndentedString(customKeywords)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    relatedAccounts: ").append(toIndentedString(relatedAccounts)).append("\n");
    sb.append("    serviceInfos: ").append(toIndentedString(serviceInfos)).append("\n");
    sb.append("    targetAppid: ").append(toIndentedString(targetAppid)).append("\n");
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
    openapiFields.add("area_keywords");
    openapiFields.add("box_desc");
    openapiFields.add("brand_id");
    openapiFields.add("business_benefit_switch");
    openapiFields.add("business_district_ids");
    openapiFields.add("custom_keywords");
    openapiFields.add("image_id");
    openapiFields.add("image_name");
    openapiFields.add("merchant_id");
    openapiFields.add("related_accounts");
    openapiFields.add("service_infos");
    openapiFields.add("target_appid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchBoxApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchBoxApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchBoxApplyModel is not found in the empty JSON string", AlipayOpenSearchBoxApplyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSearchBoxApplyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSearchBoxApplyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("area_keywords") != null && !jsonObj.get("area_keywords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `area_keywords` to be an array in the JSON string but got `%s`", jsonObj.get("area_keywords").toString()));
      }
      if (jsonObj.get("box_desc") != null && !jsonObj.get("box_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_desc").toString()));
      }
      if (jsonObj.get("brand_id") != null && !jsonObj.get("brand_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("business_district_ids") != null && !jsonObj.get("business_district_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_district_ids` to be an array in the JSON string but got `%s`", jsonObj.get("business_district_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("custom_keywords") != null && !jsonObj.get("custom_keywords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_keywords` to be an array in the JSON string but got `%s`", jsonObj.get("custom_keywords").toString()));
      }
      if (jsonObj.get("image_id") != null && !jsonObj.get("image_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_id").toString()));
      }
      if (jsonObj.get("image_name") != null && !jsonObj.get("image_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_name").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      JsonArray jsonArrayrelatedAccounts = jsonObj.getAsJsonArray("related_accounts");
      if (jsonArrayrelatedAccounts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("related_accounts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `related_accounts` to be an array in the JSON string but got `%s`", jsonObj.get("related_accounts").toString()));
        }

        // validate the optional field `related_accounts` (array)
        for (int i = 0; i < jsonArrayrelatedAccounts.size(); i++) {
          SearchBoxAppInfo.validateJsonObject(jsonArrayrelatedAccounts.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayserviceInfos = jsonObj.getAsJsonArray("service_infos");
      if (jsonArrayserviceInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("service_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `service_infos` to be an array in the JSON string but got `%s`", jsonObj.get("service_infos").toString()));
        }

        // validate the optional field `service_infos` (array)
        for (int i = 0; i < jsonArrayserviceInfos.size(); i++) {
          SearchBoxServiceInfo.validateJsonObject(jsonArrayserviceInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("target_appid") != null && !jsonObj.get("target_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_appid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchBoxApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchBoxApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchBoxApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchBoxApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchBoxApplyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchBoxApplyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSearchBoxApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSearchBoxApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchBoxApplyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchBoxApplyModel
  */
  public static AlipayOpenSearchBoxApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchBoxApplyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchBoxApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

