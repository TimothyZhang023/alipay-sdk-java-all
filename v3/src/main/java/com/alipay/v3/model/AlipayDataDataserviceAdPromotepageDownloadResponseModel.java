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
import com.alipay.v3.model.PromotePageData;
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
 * AlipayDataDataserviceAdPromotepageDownloadResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayDataDataserviceAdPromotepageDownloadResponseModel {
  public static final String SERIALIZED_NAME_CONVERSION_ID = "conversion_id";
  @SerializedName(SERIALIZED_NAME_CONVERSION_ID)
  private String conversionId;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<PromotePageData> _list = null;

  public static final String SERIALIZED_NAME_PAGE_NO = "page_no";
  @SerializedName(SERIALIZED_NAME_PAGE_NO)
  private Integer pageNo;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public AlipayDataDataserviceAdPromotepageDownloadResponseModel() { 
  }

  public AlipayDataDataserviceAdPromotepageDownloadResponseModel conversionId(String conversionId) {
    
    this.conversionId = conversionId;
    return this;
  }

   /**
   * 转化事件ID
   * @return conversionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "167390987332", value = "转化事件ID")

  public String getConversionId() {
    return conversionId;
  }


  public void setConversionId(String conversionId) {
    this.conversionId = conversionId;
  }


  public AlipayDataDataserviceAdPromotepageDownloadResponseModel _list(List<PromotePageData> _list) {
    
    this._list = _list;
    return this;
  }

  public AlipayDataDataserviceAdPromotepageDownloadResponseModel addListItem(PromotePageData _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }

   /**
   * 留资属性实例数据列表
   * @return _list
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "留资属性实例数据列表")

  public List<PromotePageData> getList() {
    return _list;
  }


  public void setList(List<PromotePageData> _list) {
    this._list = _list;
  }


  public AlipayDataDataserviceAdPromotepageDownloadResponseModel pageNo(Integer pageNo) {
    
    this.pageNo = pageNo;
    return this;
  }

   /**
   * 分页参数之页数，从1开始
   * @return pageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "分页参数之页数，从1开始")

  public Integer getPageNo() {
    return pageNo;
  }


  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }


  public AlipayDataDataserviceAdPromotepageDownloadResponseModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页参数之每页大小，最大1000
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "分页参数之每页大小，最大1000")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayDataDataserviceAdPromotepageDownloadResponseModel total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * 分页参数之总数据量
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "分页参数之总数据量")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayDataDataserviceAdPromotepageDownloadResponseModel alipayDataDataserviceAdPromotepageDownloadResponseModel = (AlipayDataDataserviceAdPromotepageDownloadResponseModel) o;
    return Objects.equals(this.conversionId, alipayDataDataserviceAdPromotepageDownloadResponseModel.conversionId) &&
        Objects.equals(this._list, alipayDataDataserviceAdPromotepageDownloadResponseModel._list) &&
        Objects.equals(this.pageNo, alipayDataDataserviceAdPromotepageDownloadResponseModel.pageNo) &&
        Objects.equals(this.pageSize, alipayDataDataserviceAdPromotepageDownloadResponseModel.pageSize) &&
        Objects.equals(this.total, alipayDataDataserviceAdPromotepageDownloadResponseModel.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionId, _list, pageNo, pageSize, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayDataDataserviceAdPromotepageDownloadResponseModel {\n");
    sb.append("    conversionId: ").append(toIndentedString(conversionId)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("conversion_id");
    openapiFields.add("list");
    openapiFields.add("page_no");
    openapiFields.add("page_size");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayDataDataserviceAdPromotepageDownloadResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayDataDataserviceAdPromotepageDownloadResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayDataDataserviceAdPromotepageDownloadResponseModel is not found in the empty JSON string", AlipayDataDataserviceAdPromotepageDownloadResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayDataDataserviceAdPromotepageDownloadResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayDataDataserviceAdPromotepageDownloadResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("conversion_id") != null && !jsonObj.get("conversion_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversion_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversion_id").toString()));
      }
      JsonArray jsonArray_list = jsonObj.getAsJsonArray("list");
      if (jsonArray_list != null) {
        // ensure the json data is an array
        if (!jsonObj.get("list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `list` to be an array in the JSON string but got `%s`", jsonObj.get("list").toString()));
        }

        // validate the optional field `list` (array)
        for (int i = 0; i < jsonArray_list.size(); i++) {
          PromotePageData.validateJsonObject(jsonArray_list.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayDataDataserviceAdPromotepageDownloadResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayDataDataserviceAdPromotepageDownloadResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayDataDataserviceAdPromotepageDownloadResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayDataDataserviceAdPromotepageDownloadResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayDataDataserviceAdPromotepageDownloadResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayDataDataserviceAdPromotepageDownloadResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayDataDataserviceAdPromotepageDownloadResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayDataDataserviceAdPromotepageDownloadResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayDataDataserviceAdPromotepageDownloadResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayDataDataserviceAdPromotepageDownloadResponseModel
  */
  public static AlipayDataDataserviceAdPromotepageDownloadResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayDataDataserviceAdPromotepageDownloadResponseModel.class);
  }

 /**
  * Convert an instance of AlipayDataDataserviceAdPromotepageDownloadResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

