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
 * AlipaySocialBaseContentlibStandardcontentBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipaySocialBaseContentlibStandardcontentBatchqueryModel {
  public static final String SERIALIZED_NAME_NEED_DETAIL = "need_detail";
  @SerializedName(SERIALIZED_NAME_NEED_DETAIL)
  private Boolean needDetail;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PUBLIC_ID = "public_id";
  @SerializedName(SERIALIZED_NAME_PUBLIC_ID)
  private String publicId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipaySocialBaseContentlibStandardcontentBatchqueryModel() { 
  }

  public AlipaySocialBaseContentlibStandardcontentBatchqueryModel needDetail(Boolean needDetail) {
    
    this.needDetail = needDetail;
    return this;
  }

   /**
   * 指示是否返回内容详情,  默认为false false: 仅返回内容ID列表 true:返回 content_details
   * @return needDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "指示是否返回内容详情,  默认为false false: 仅返回内容ID列表 true:返回 content_details")

  public Boolean getNeedDetail() {
    return needDetail;
  }


  public void setNeedDetail(Boolean needDetail) {
    this.needDetail = needDetail;
  }


  public AlipaySocialBaseContentlibStandardcontentBatchqueryModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 当页分页,默认为1
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当页分页,默认为1")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipaySocialBaseContentlibStandardcontentBatchqueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页记录数，最大20,默认20
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "分页记录数，最大20,默认20")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipaySocialBaseContentlibStandardcontentBatchqueryModel publicId(String publicId) {
    
    this.publicId = publicId;
    return this;
  }

   /**
   * 生活号+号ID，只有MCN机构为达人号ID查询内容才需要传入
   * @return publicId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2030000013518xxx", value = "生活号+号ID，只有MCN机构为达人号ID查询内容才需要传入")

  public String getPublicId() {
    return publicId;
  }


  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }


  public AlipaySocialBaseContentlibStandardcontentBatchqueryModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 内容状态，默认查询所有状态 0-审核中  1-发布成功  2-审核不通过  3-己删除
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "内容状态，默认查询所有状态 0-审核中  1-发布成功  2-审核不通过  3-己删除")

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
    AlipaySocialBaseContentlibStandardcontentBatchqueryModel alipaySocialBaseContentlibStandardcontentBatchqueryModel = (AlipaySocialBaseContentlibStandardcontentBatchqueryModel) o;
    return Objects.equals(this.needDetail, alipaySocialBaseContentlibStandardcontentBatchqueryModel.needDetail) &&
        Objects.equals(this.pageNum, alipaySocialBaseContentlibStandardcontentBatchqueryModel.pageNum) &&
        Objects.equals(this.pageSize, alipaySocialBaseContentlibStandardcontentBatchqueryModel.pageSize) &&
        Objects.equals(this.publicId, alipaySocialBaseContentlibStandardcontentBatchqueryModel.publicId) &&
        Objects.equals(this.status, alipaySocialBaseContentlibStandardcontentBatchqueryModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(needDetail, pageNum, pageSize, publicId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipaySocialBaseContentlibStandardcontentBatchqueryModel {\n");
    sb.append("    needDetail: ").append(toIndentedString(needDetail)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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
    openapiFields.add("need_detail");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("public_id");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipaySocialBaseContentlibStandardcontentBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipaySocialBaseContentlibStandardcontentBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipaySocialBaseContentlibStandardcontentBatchqueryModel is not found in the empty JSON string", AlipaySocialBaseContentlibStandardcontentBatchqueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipaySocialBaseContentlibStandardcontentBatchqueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipaySocialBaseContentlibStandardcontentBatchqueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("public_id") != null && !jsonObj.get("public_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipaySocialBaseContentlibStandardcontentBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipaySocialBaseContentlibStandardcontentBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipaySocialBaseContentlibStandardcontentBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipaySocialBaseContentlibStandardcontentBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipaySocialBaseContentlibStandardcontentBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipaySocialBaseContentlibStandardcontentBatchqueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipaySocialBaseContentlibStandardcontentBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipaySocialBaseContentlibStandardcontentBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipaySocialBaseContentlibStandardcontentBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipaySocialBaseContentlibStandardcontentBatchqueryModel
  */
  public static AlipaySocialBaseContentlibStandardcontentBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipaySocialBaseContentlibStandardcontentBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipaySocialBaseContentlibStandardcontentBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

