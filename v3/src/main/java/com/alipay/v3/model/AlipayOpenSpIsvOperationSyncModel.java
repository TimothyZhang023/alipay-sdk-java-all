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
import com.alipay.v3.model.OperationResultExtInfo;
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
 * AlipayOpenSpIsvOperationSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpIsvOperationSyncModel {
  public static final String SERIALIZED_NAME_CUSTOMER_TYPE = "customer_type";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_TYPE)
  private String customerType;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private OperationResultExtInfo extInfo;

  public static final String SERIALIZED_NAME_IMPLEMENT_END_TIME = "implement_end_time";
  @SerializedName(SERIALIZED_NAME_IMPLEMENT_END_TIME)
  private String implementEndTime;

  public static final String SERIALIZED_NAME_IMPLEMENT_OBJECT_NAME = "implement_object_name";
  @SerializedName(SERIALIZED_NAME_IMPLEMENT_OBJECT_NAME)
  private String implementObjectName;

  public static final String SERIALIZED_NAME_IMPLEMENT_PLACE = "implement_place";
  @SerializedName(SERIALIZED_NAME_IMPLEMENT_PLACE)
  private String implementPlace;

  public static final String SERIALIZED_NAME_IMPLEMENT_RESULT = "implement_result";
  @SerializedName(SERIALIZED_NAME_IMPLEMENT_RESULT)
  private String implementResult;

  public static final String SERIALIZED_NAME_IMPLEMENT_RESULT_IMAGE = "implement_result_image";
  @SerializedName(SERIALIZED_NAME_IMPLEMENT_RESULT_IMAGE)
  private String implementResultImage;

  public static final String SERIALIZED_NAME_IMPLEMENT_RESULT_REMARK = "implement_result_remark";
  @SerializedName(SERIALIZED_NAME_IMPLEMENT_RESULT_REMARK)
  private String implementResultRemark;

  public static final String SERIALIZED_NAME_IMPLEMENT_START_TIME = "implement_start_time";
  @SerializedName(SERIALIZED_NAME_IMPLEMENT_START_TIME)
  private String implementStartTime;

  public static final String SERIALIZED_NAME_ITEM_CODE = "item_code";
  @SerializedName(SERIALIZED_NAME_ITEM_CODE)
  private String itemCode;

  public static final String SERIALIZED_NAME_ITEM_PRICE = "item_price";
  @SerializedName(SERIALIZED_NAME_ITEM_PRICE)
  private String itemPrice;

  public static final String SERIALIZED_NAME_MERCHANT_PID = "merchant_pid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PID)
  private String merchantPid;

  public static final String SERIALIZED_NAME_MINI_APPID = "mini_appid";
  @SerializedName(SERIALIZED_NAME_MINI_APPID)
  private String miniAppid;

  public static final String SERIALIZED_NAME_OPPOR_ID = "oppor_id";
  @SerializedName(SERIALIZED_NAME_OPPOR_ID)
  private String opporId;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PROMOTOR_PID = "promotor_pid";
  @SerializedName(SERIALIZED_NAME_PROMOTOR_PID)
  private String promotorPid;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public static final String SERIALIZED_NAME_SUB_PROMOTOR_PID = "sub_promotor_pid";
  @SerializedName(SERIALIZED_NAME_SUB_PROMOTOR_PID)
  private String subPromotorPid;

  public AlipayOpenSpIsvOperationSyncModel() { 
  }

  public AlipayOpenSpIsvOperationSyncModel customerType(String customerType) {
    
    this.customerType = customerType;
    return this;
  }

   /**
   * 客户类型，PERSONAL表示个人，ALIPAY_RECOMMEND表示支付宝推荐
   * @return customerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PERSONAL", value = "客户类型，PERSONAL表示个人，ALIPAY_RECOMMEND表示支付宝推荐")

  public String getCustomerType() {
    return customerType;
  }


  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }


  public AlipayOpenSpIsvOperationSyncModel extInfo(OperationResultExtInfo extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * Get extInfo
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OperationResultExtInfo getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(OperationResultExtInfo extInfo) {
    this.extInfo = extInfo;
  }


  public AlipayOpenSpIsvOperationSyncModel implementEndTime(String implementEndTime) {
    
    this.implementEndTime = implementEndTime;
    return this;
  }

   /**
   * 实施结束时间
   * @return implementEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-11 00:00:00", value = "实施结束时间")

  public String getImplementEndTime() {
    return implementEndTime;
  }


  public void setImplementEndTime(String implementEndTime) {
    this.implementEndTime = implementEndTime;
  }


  public AlipayOpenSpIsvOperationSyncModel implementObjectName(String implementObjectName) {
    
    this.implementObjectName = implementObjectName;
    return this;
  }

   /**
   * 实施对象名称
   * @return implementObjectName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江省杭州市西湖区西溪路黄焖鸡米饭", value = "实施对象名称")

  public String getImplementObjectName() {
    return implementObjectName;
  }


  public void setImplementObjectName(String implementObjectName) {
    this.implementObjectName = implementObjectName;
  }


  public AlipayOpenSpIsvOperationSyncModel implementPlace(String implementPlace) {
    
    this.implementPlace = implementPlace;
    return this;
  }

   /**
   * 实施地点
   * @return implementPlace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江省杭州市西湖区蚂蚁A空间", value = "实施地点")

  public String getImplementPlace() {
    return implementPlace;
  }


  public void setImplementPlace(String implementPlace) {
    this.implementPlace = implementPlace;
  }


  public AlipayOpenSpIsvOperationSyncModel implementResult(String implementResult) {
    
    this.implementResult = implementResult;
    return this;
  }

   /**
   * 实施结果，SUCCESS表示实施成功，FAIL表示实施失败
   * @return implementResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "实施结果，SUCCESS表示实施成功，FAIL表示实施失败")

  public String getImplementResult() {
    return implementResult;
  }


  public void setImplementResult(String implementResult) {
    this.implementResult = implementResult;
  }


  public AlipayOpenSpIsvOperationSyncModel implementResultImage(String implementResultImage) {
    
    this.implementResultImage = implementResultImage;
    return this;
  }

   /**
   * 实施结果的照片
   * @return implementResultImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://os.alipayobjects.com/rmsportal/JxAjrvPKriKOpjf.png", value = "实施结果的照片")

  public String getImplementResultImage() {
    return implementResultImage;
  }


  public void setImplementResultImage(String implementResultImage) {
    this.implementResultImage = implementResultImage;
  }


  public AlipayOpenSpIsvOperationSyncModel implementResultRemark(String implementResultRemark) {
    
    this.implementResultRemark = implementResultRemark;
    return this;
  }

   /**
   * 实施结果的备注
   * @return implementResultRemark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "失败原因：商户取消购买", value = "实施结果的备注")

  public String getImplementResultRemark() {
    return implementResultRemark;
  }


  public void setImplementResultRemark(String implementResultRemark) {
    this.implementResultRemark = implementResultRemark;
  }


  public AlipayOpenSpIsvOperationSyncModel implementStartTime(String implementStartTime) {
    
    this.implementStartTime = implementStartTime;
    return this;
  }

   /**
   * 实施开始时间
   * @return implementStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-10 00:00:00", value = "实施开始时间")

  public String getImplementStartTime() {
    return implementStartTime;
  }


  public void setImplementStartTime(String implementStartTime) {
    this.implementStartTime = implementStartTime;
  }


  public AlipayOpenSpIsvOperationSyncModel itemCode(String itemCode) {
    
    this.itemCode = itemCode;
    return this;
  }

   /**
   * 服务优选商品编码
   * @return itemCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SS010301000000001234", value = "服务优选商品编码")

  public String getItemCode() {
    return itemCode;
  }


  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }


  public AlipayOpenSpIsvOperationSyncModel itemPrice(String itemPrice) {
    
    this.itemPrice = itemPrice;
    return this;
  }

   /**
   * 商品价格，这里填写的是整数，单位为分，比如1元，那么输入100
   * @return itemPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "商品价格，这里填写的是整数，单位为分，比如1元，那么输入100")

  public String getItemPrice() {
    return itemPrice;
  }


  public void setItemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
  }


  public AlipayOpenSpIsvOperationSyncModel merchantPid(String merchantPid) {
    
    this.merchantPid = merchantPid;
    return this;
  }

   /**
   * 商户pid
   * @return merchantPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301912341234", value = "商户pid")

  public String getMerchantPid() {
    return merchantPid;
  }


  public void setMerchantPid(String merchantPid) {
    this.merchantPid = merchantPid;
  }


  public AlipayOpenSpIsvOperationSyncModel miniAppid(String miniAppid) {
    
    this.miniAppid = miniAppid;
    return this;
  }

   /**
   * 商品小程序appid，若推广的商品不为小程序，则不传此参数
   * @return miniAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018082861168647", value = "商品小程序appid，若推广的商品不为小程序，则不传此参数")

  public String getMiniAppid() {
    return miniAppid;
  }


  public void setMiniAppid(String miniAppid) {
    this.miniAppid = miniAppid;
  }


  public AlipayOpenSpIsvOperationSyncModel opporId(String opporId) {
    
    this.opporId = opporId;
    return this;
  }

   /**
   * 拓展助手中的商机id
   * @return opporId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021101809775931", value = "拓展助手中的商机id")

  public String getOpporId() {
    return opporId;
  }


  public void setOpporId(String opporId) {
    this.opporId = opporId;
  }


  public AlipayOpenSpIsvOperationSyncModel orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 下单订单号
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201811190000000000001100", value = "下单订单号")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public AlipayOpenSpIsvOperationSyncModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务号，传isv系统生成的账单号，需要保证唯一
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021000000000", value = "外部业务号，传isv系统生成的账单号，需要保证唯一")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayOpenSpIsvOperationSyncModel promotorPid(String promotorPid) {
    
    this.promotorPid = promotorPid;
    return this;
  }

   /**
   * 推广服务商(S2)pid
   * @return promotorPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301912341234", value = "推广服务商(S2)pid")

  public String getPromotorPid() {
    return promotorPid;
  }


  public void setPromotorPid(String promotorPid) {
    this.promotorPid = promotorPid;
  }


  public AlipayOpenSpIsvOperationSyncModel shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 店铺id
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019081500502000000025130577", value = "店铺id")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }


  public AlipayOpenSpIsvOperationSyncModel subPromotorPid(String subPromotorPid) {
    
    this.subPromotorPid = subPromotorPid;
    return this;
  }

   /**
   * 推广服务商(S2)子账号pid
   * @return subPromotorPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301912341234", value = "推广服务商(S2)子账号pid")

  public String getSubPromotorPid() {
    return subPromotorPid;
  }


  public void setSubPromotorPid(String subPromotorPid) {
    this.subPromotorPid = subPromotorPid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSpIsvOperationSyncModel alipayOpenSpIsvOperationSyncModel = (AlipayOpenSpIsvOperationSyncModel) o;
    return Objects.equals(this.customerType, alipayOpenSpIsvOperationSyncModel.customerType) &&
        Objects.equals(this.extInfo, alipayOpenSpIsvOperationSyncModel.extInfo) &&
        Objects.equals(this.implementEndTime, alipayOpenSpIsvOperationSyncModel.implementEndTime) &&
        Objects.equals(this.implementObjectName, alipayOpenSpIsvOperationSyncModel.implementObjectName) &&
        Objects.equals(this.implementPlace, alipayOpenSpIsvOperationSyncModel.implementPlace) &&
        Objects.equals(this.implementResult, alipayOpenSpIsvOperationSyncModel.implementResult) &&
        Objects.equals(this.implementResultImage, alipayOpenSpIsvOperationSyncModel.implementResultImage) &&
        Objects.equals(this.implementResultRemark, alipayOpenSpIsvOperationSyncModel.implementResultRemark) &&
        Objects.equals(this.implementStartTime, alipayOpenSpIsvOperationSyncModel.implementStartTime) &&
        Objects.equals(this.itemCode, alipayOpenSpIsvOperationSyncModel.itemCode) &&
        Objects.equals(this.itemPrice, alipayOpenSpIsvOperationSyncModel.itemPrice) &&
        Objects.equals(this.merchantPid, alipayOpenSpIsvOperationSyncModel.merchantPid) &&
        Objects.equals(this.miniAppid, alipayOpenSpIsvOperationSyncModel.miniAppid) &&
        Objects.equals(this.opporId, alipayOpenSpIsvOperationSyncModel.opporId) &&
        Objects.equals(this.orderId, alipayOpenSpIsvOperationSyncModel.orderId) &&
        Objects.equals(this.outBizNo, alipayOpenSpIsvOperationSyncModel.outBizNo) &&
        Objects.equals(this.promotorPid, alipayOpenSpIsvOperationSyncModel.promotorPid) &&
        Objects.equals(this.shopId, alipayOpenSpIsvOperationSyncModel.shopId) &&
        Objects.equals(this.subPromotorPid, alipayOpenSpIsvOperationSyncModel.subPromotorPid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerType, extInfo, implementEndTime, implementObjectName, implementPlace, implementResult, implementResultImage, implementResultRemark, implementStartTime, itemCode, itemPrice, merchantPid, miniAppid, opporId, orderId, outBizNo, promotorPid, shopId, subPromotorPid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpIsvOperationSyncModel {\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    implementEndTime: ").append(toIndentedString(implementEndTime)).append("\n");
    sb.append("    implementObjectName: ").append(toIndentedString(implementObjectName)).append("\n");
    sb.append("    implementPlace: ").append(toIndentedString(implementPlace)).append("\n");
    sb.append("    implementResult: ").append(toIndentedString(implementResult)).append("\n");
    sb.append("    implementResultImage: ").append(toIndentedString(implementResultImage)).append("\n");
    sb.append("    implementResultRemark: ").append(toIndentedString(implementResultRemark)).append("\n");
    sb.append("    implementStartTime: ").append(toIndentedString(implementStartTime)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    merchantPid: ").append(toIndentedString(merchantPid)).append("\n");
    sb.append("    miniAppid: ").append(toIndentedString(miniAppid)).append("\n");
    sb.append("    opporId: ").append(toIndentedString(opporId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    promotorPid: ").append(toIndentedString(promotorPid)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    subPromotorPid: ").append(toIndentedString(subPromotorPid)).append("\n");
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
    openapiFields.add("customer_type");
    openapiFields.add("ext_info");
    openapiFields.add("implement_end_time");
    openapiFields.add("implement_object_name");
    openapiFields.add("implement_place");
    openapiFields.add("implement_result");
    openapiFields.add("implement_result_image");
    openapiFields.add("implement_result_remark");
    openapiFields.add("implement_start_time");
    openapiFields.add("item_code");
    openapiFields.add("item_price");
    openapiFields.add("merchant_pid");
    openapiFields.add("mini_appid");
    openapiFields.add("oppor_id");
    openapiFields.add("order_id");
    openapiFields.add("out_biz_no");
    openapiFields.add("promotor_pid");
    openapiFields.add("shop_id");
    openapiFields.add("sub_promotor_pid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpIsvOperationSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpIsvOperationSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpIsvOperationSyncModel is not found in the empty JSON string", AlipayOpenSpIsvOperationSyncModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSpIsvOperationSyncModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSpIsvOperationSyncModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("customer_type") != null && !jsonObj.get("customer_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_type").toString()));
      }
      // validate the optional field `ext_info`
      if (jsonObj.getAsJsonObject("ext_info") != null) {
        OperationResultExtInfo.validateJsonObject(jsonObj.getAsJsonObject("ext_info"));
      }
      if (jsonObj.get("implement_end_time") != null && !jsonObj.get("implement_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `implement_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("implement_end_time").toString()));
      }
      if (jsonObj.get("implement_object_name") != null && !jsonObj.get("implement_object_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `implement_object_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("implement_object_name").toString()));
      }
      if (jsonObj.get("implement_place") != null && !jsonObj.get("implement_place").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `implement_place` to be a primitive type in the JSON string but got `%s`", jsonObj.get("implement_place").toString()));
      }
      if (jsonObj.get("implement_result") != null && !jsonObj.get("implement_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `implement_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("implement_result").toString()));
      }
      if (jsonObj.get("implement_result_image") != null && !jsonObj.get("implement_result_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `implement_result_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("implement_result_image").toString()));
      }
      if (jsonObj.get("implement_result_remark") != null && !jsonObj.get("implement_result_remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `implement_result_remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("implement_result_remark").toString()));
      }
      if (jsonObj.get("implement_start_time") != null && !jsonObj.get("implement_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `implement_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("implement_start_time").toString()));
      }
      if (jsonObj.get("item_code") != null && !jsonObj.get("item_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_code").toString()));
      }
      if (jsonObj.get("item_price") != null && !jsonObj.get("item_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_price").toString()));
      }
      if (jsonObj.get("merchant_pid") != null && !jsonObj.get("merchant_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_pid").toString()));
      }
      if (jsonObj.get("mini_appid") != null && !jsonObj.get("mini_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_appid").toString()));
      }
      if (jsonObj.get("oppor_id") != null && !jsonObj.get("oppor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oppor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oppor_id").toString()));
      }
      if (jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("promotor_pid") != null && !jsonObj.get("promotor_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotor_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promotor_pid").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
      if (jsonObj.get("sub_promotor_pid") != null && !jsonObj.get("sub_promotor_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_promotor_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_promotor_pid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpIsvOperationSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpIsvOperationSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpIsvOperationSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpIsvOperationSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpIsvOperationSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpIsvOperationSyncModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSpIsvOperationSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSpIsvOperationSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpIsvOperationSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpIsvOperationSyncModel
  */
  public static AlipayOpenSpIsvOperationSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpIsvOperationSyncModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpIsvOperationSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

