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
 * VoucherDisplayPatternInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherDisplayPatternInfo {
  public static final String SERIALIZED_NAME_BRAND_LOGO = "brand_logo";
  @SerializedName(SERIALIZED_NAME_BRAND_LOGO)
  private String brandLogo;

  public static final String SERIALIZED_NAME_BRAND_LOGO_URL = "brand_logo_url";
  @SerializedName(SERIALIZED_NAME_BRAND_LOGO_URL)
  private String brandLogoUrl;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_CUSTOMER_SERVICE_MOBILE = "customer_service_mobile";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SERVICE_MOBILE)
  private String customerServiceMobile;

  public static final String SERIALIZED_NAME_CUSTOMER_SERVICE_URL = "customer_service_url";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SERVICE_URL)
  private String customerServiceUrl;

  public static final String SERIALIZED_NAME_VOUCHER_DESCRIPTION = "voucher_description";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DESCRIPTION)
  private String voucherDescription;

  public static final String SERIALIZED_NAME_VOUCHER_DETAIL_IMAGE_URLS = "voucher_detail_image_urls";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DETAIL_IMAGE_URLS)
  private List<String> voucherDetailImageUrls = null;

  public static final String SERIALIZED_NAME_VOUCHER_DETAIL_IMAGES = "voucher_detail_images";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DETAIL_IMAGES)
  private List<String> voucherDetailImages = null;

  public static final String SERIALIZED_NAME_VOUCHER_IMAGE = "voucher_image";
  @SerializedName(SERIALIZED_NAME_VOUCHER_IMAGE)
  private String voucherImage;

  public static final String SERIALIZED_NAME_VOUCHER_IMAGE_URL = "voucher_image_url";
  @SerializedName(SERIALIZED_NAME_VOUCHER_IMAGE_URL)
  private String voucherImageUrl;

  public static final String SERIALIZED_NAME_VOUCHER_NAME = "voucher_name";
  @SerializedName(SERIALIZED_NAME_VOUCHER_NAME)
  private String voucherName;

  public VoucherDisplayPatternInfo() { 
  }

  public VoucherDisplayPatternInfo brandLogo(String brandLogo) {
    
    this.brandLogo = brandLogo;
    return this;
  }

   /**
   * 商家logo 需要通过  alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_BRAND_LOGO，返回的resource_id即为该参数的值。
   * @return brandLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家logo 需要通过  alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_BRAND_LOGO，返回的resource_id即为该参数的值。")

  public String getBrandLogo() {
    return brandLogo;
  }


  public void setBrandLogo(String brandLogo) {
    this.brandLogo = brandLogo;
  }


  public VoucherDisplayPatternInfo brandLogoUrl(String brandLogoUrl) {
    
    this.brandLogoUrl = brandLogoUrl;
    return this;
  }

   /**
   * 商家品牌logo链接
   * @return brandLogoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家品牌logo链接")

  public String getBrandLogoUrl() {
    return brandLogoUrl;
  }


  public void setBrandLogoUrl(String brandLogoUrl) {
    this.brandLogoUrl = brandLogoUrl;
  }


  public VoucherDisplayPatternInfo brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 商户品牌名称。
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户品牌名称。")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public VoucherDisplayPatternInfo customerServiceMobile(String customerServiceMobile) {
    
    this.customerServiceMobile = customerServiceMobile;
    return this;
  }

   /**
   * 客服电话。
   * @return customerServiceMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "客服电话。")

  public String getCustomerServiceMobile() {
    return customerServiceMobile;
  }


  public void setCustomerServiceMobile(String customerServiceMobile) {
    this.customerServiceMobile = customerServiceMobile;
  }


  public VoucherDisplayPatternInfo customerServiceUrl(String customerServiceUrl) {
    
    this.customerServiceUrl = customerServiceUrl;
    return this;
  }

   /**
   * 客服链接。
   * @return customerServiceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "客服链接。")

  public String getCustomerServiceUrl() {
    return customerServiceUrl;
  }


  public void setCustomerServiceUrl(String customerServiceUrl) {
    this.customerServiceUrl = customerServiceUrl;
  }


  public VoucherDisplayPatternInfo voucherDescription(String voucherDescription) {
    
    this.voucherDescription = voucherDescription;
    return this;
  }

   /**
   * 券详细使用说明。
   * @return voucherDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券详细使用说明。")

  public String getVoucherDescription() {
    return voucherDescription;
  }


  public void setVoucherDescription(String voucherDescription) {
    this.voucherDescription = voucherDescription;
  }


  public VoucherDisplayPatternInfo voucherDetailImageUrls(List<String> voucherDetailImageUrls) {
    
    this.voucherDetailImageUrls = voucherDetailImageUrls;
    return this;
  }

  public VoucherDisplayPatternInfo addVoucherDetailImageUrlsItem(String voucherDetailImageUrlsItem) {
    if (this.voucherDetailImageUrls == null) {
      this.voucherDetailImageUrls = new ArrayList<>();
    }
    this.voucherDetailImageUrls.add(voucherDetailImageUrlsItem);
    return this;
  }

   /**
   * 券详情链接
   * @return voucherDetailImageUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券详情链接")

  public List<String> getVoucherDetailImageUrls() {
    return voucherDetailImageUrls;
  }


  public void setVoucherDetailImageUrls(List<String> voucherDetailImageUrls) {
    this.voucherDetailImageUrls = voucherDetailImageUrls;
  }


  public VoucherDisplayPatternInfo voucherDetailImages(List<String> voucherDetailImages) {
    
    this.voucherDetailImages = voucherDetailImages;
    return this;
  }

  public VoucherDisplayPatternInfo addVoucherDetailImagesItem(String voucherDetailImagesItem) {
    if (this.voucherDetailImages == null) {
      this.voucherDetailImages = new ArrayList<>();
    }
    this.voucherDetailImages.add(voucherDetailImagesItem);
    return this;
  }

   /**
   * 券详细图列表，会展示在用户支付宝卡包券详情页 需要通过  alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_DETAIL_IMAGE  ,接口返回的resource_id即为该参数的值 上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过2MB。
   * @return voucherDetailImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券详细图列表，会展示在用户支付宝卡包券详情页 需要通过  alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_DETAIL_IMAGE  ,接口返回的resource_id即为该参数的值 上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过2MB。")

  public List<String> getVoucherDetailImages() {
    return voucherDetailImages;
  }


  public void setVoucherDetailImages(List<String> voucherDetailImages) {
    this.voucherDetailImages = voucherDetailImages;
  }


  public VoucherDisplayPatternInfo voucherImage(String voucherImage) {
    
    this.voucherImage = voucherImage;
    return this;
  }

   /**
   * 券详情页封面图，会展示在用户支付宝卡包券详情页。 需要通过  alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_IMAGE，接口返回的resource_id即为该参数的值。
   * @return voucherImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券详情页封面图，会展示在用户支付宝卡包券详情页。 需要通过  alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_IMAGE，接口返回的resource_id即为该参数的值。")

  public String getVoucherImage() {
    return voucherImage;
  }


  public void setVoucherImage(String voucherImage) {
    this.voucherImage = voucherImage;
  }


  public VoucherDisplayPatternInfo voucherImageUrl(String voucherImageUrl) {
    
    this.voucherImageUrl = voucherImageUrl;
    return this;
  }

   /**
   * 券封面链接
   * @return voucherImageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券封面链接")

  public String getVoucherImageUrl() {
    return voucherImageUrl;
  }


  public void setVoucherImageUrl(String voucherImageUrl) {
    this.voucherImageUrl = voucherImageUrl;
  }


  public VoucherDisplayPatternInfo voucherName(String voucherName) {
    
    this.voucherName = voucherName;
    return this;
  }

   /**
   * 券名称。
   * @return voucherName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券名称。")

  public String getVoucherName() {
    return voucherName;
  }


  public void setVoucherName(String voucherName) {
    this.voucherName = voucherName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherDisplayPatternInfo voucherDisplayPatternInfo = (VoucherDisplayPatternInfo) o;
    return Objects.equals(this.brandLogo, voucherDisplayPatternInfo.brandLogo) &&
        Objects.equals(this.brandLogoUrl, voucherDisplayPatternInfo.brandLogoUrl) &&
        Objects.equals(this.brandName, voucherDisplayPatternInfo.brandName) &&
        Objects.equals(this.customerServiceMobile, voucherDisplayPatternInfo.customerServiceMobile) &&
        Objects.equals(this.customerServiceUrl, voucherDisplayPatternInfo.customerServiceUrl) &&
        Objects.equals(this.voucherDescription, voucherDisplayPatternInfo.voucherDescription) &&
        Objects.equals(this.voucherDetailImageUrls, voucherDisplayPatternInfo.voucherDetailImageUrls) &&
        Objects.equals(this.voucherDetailImages, voucherDisplayPatternInfo.voucherDetailImages) &&
        Objects.equals(this.voucherImage, voucherDisplayPatternInfo.voucherImage) &&
        Objects.equals(this.voucherImageUrl, voucherDisplayPatternInfo.voucherImageUrl) &&
        Objects.equals(this.voucherName, voucherDisplayPatternInfo.voucherName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandLogo, brandLogoUrl, brandName, customerServiceMobile, customerServiceUrl, voucherDescription, voucherDetailImageUrls, voucherDetailImages, voucherImage, voucherImageUrl, voucherName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherDisplayPatternInfo {\n");
    sb.append("    brandLogo: ").append(toIndentedString(brandLogo)).append("\n");
    sb.append("    brandLogoUrl: ").append(toIndentedString(brandLogoUrl)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    customerServiceMobile: ").append(toIndentedString(customerServiceMobile)).append("\n");
    sb.append("    customerServiceUrl: ").append(toIndentedString(customerServiceUrl)).append("\n");
    sb.append("    voucherDescription: ").append(toIndentedString(voucherDescription)).append("\n");
    sb.append("    voucherDetailImageUrls: ").append(toIndentedString(voucherDetailImageUrls)).append("\n");
    sb.append("    voucherDetailImages: ").append(toIndentedString(voucherDetailImages)).append("\n");
    sb.append("    voucherImage: ").append(toIndentedString(voucherImage)).append("\n");
    sb.append("    voucherImageUrl: ").append(toIndentedString(voucherImageUrl)).append("\n");
    sb.append("    voucherName: ").append(toIndentedString(voucherName)).append("\n");
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
    openapiFields.add("brand_logo");
    openapiFields.add("brand_logo_url");
    openapiFields.add("brand_name");
    openapiFields.add("customer_service_mobile");
    openapiFields.add("customer_service_url");
    openapiFields.add("voucher_description");
    openapiFields.add("voucher_detail_image_urls");
    openapiFields.add("voucher_detail_images");
    openapiFields.add("voucher_image");
    openapiFields.add("voucher_image_url");
    openapiFields.add("voucher_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherDisplayPatternInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherDisplayPatternInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherDisplayPatternInfo is not found in the empty JSON string", VoucherDisplayPatternInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherDisplayPatternInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherDisplayPatternInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("brand_logo") != null && !jsonObj.get("brand_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_logo").toString()));
      }
      if (jsonObj.get("brand_logo_url") != null && !jsonObj.get("brand_logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_logo_url").toString()));
      }
      if (jsonObj.get("brand_name") != null && !jsonObj.get("brand_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_name").toString()));
      }
      if (jsonObj.get("customer_service_mobile") != null && !jsonObj.get("customer_service_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_service_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_service_mobile").toString()));
      }
      if (jsonObj.get("customer_service_url") != null && !jsonObj.get("customer_service_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_service_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_service_url").toString()));
      }
      if (jsonObj.get("voucher_description") != null && !jsonObj.get("voucher_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_description").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("voucher_detail_image_urls") != null && !jsonObj.get("voucher_detail_image_urls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_detail_image_urls` to be an array in the JSON string but got `%s`", jsonObj.get("voucher_detail_image_urls").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("voucher_detail_images") != null && !jsonObj.get("voucher_detail_images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_detail_images` to be an array in the JSON string but got `%s`", jsonObj.get("voucher_detail_images").toString()));
      }
      if (jsonObj.get("voucher_image") != null && !jsonObj.get("voucher_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_image").toString()));
      }
      if (jsonObj.get("voucher_image_url") != null && !jsonObj.get("voucher_image_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_image_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_image_url").toString()));
      }
      if (jsonObj.get("voucher_name") != null && !jsonObj.get("voucher_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherDisplayPatternInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherDisplayPatternInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherDisplayPatternInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherDisplayPatternInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherDisplayPatternInfo>() {
           @Override
           public void write(JsonWriter out, VoucherDisplayPatternInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherDisplayPatternInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherDisplayPatternInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherDisplayPatternInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherDisplayPatternInfo
  */
  public static VoucherDisplayPatternInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherDisplayPatternInfo.class);
  }

 /**
  * Convert an instance of VoucherDisplayPatternInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

