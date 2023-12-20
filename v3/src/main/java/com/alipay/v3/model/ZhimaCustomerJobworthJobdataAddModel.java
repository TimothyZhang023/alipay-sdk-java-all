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
import com.alipay.v3.model.JobWorthJobdata;
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
 * ZhimaCustomerJobworthJobdataAddModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCustomerJobworthJobdataAddModel {
  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_CERT_TYPE = "cert_type";
  @SerializedName(SERIALIZED_NAME_CERT_TYPE)
  private String certType;

  public static final String SERIALIZED_NAME_CONN_KEY = "conn_key";
  @SerializedName(SERIALIZED_NAME_CONN_KEY)
  private String connKey;

  public static final String SERIALIZED_NAME_JOB_DATA_LIST = "job_data_list";
  @SerializedName(SERIALIZED_NAME_JOB_DATA_LIST)
  private List<JobWorthJobdata> jobDataList = null;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public ZhimaCustomerJobworthJobdataAddModel() { 
  }

  public ZhimaCustomerJobworthJobdataAddModel certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * 身份证证件号
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1101121983010****5", value = "身份证证件号")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public ZhimaCustomerJobworthJobdataAddModel certType(String certType) {
    
    this.certType = certType;
    return this;
  }

   /**
   * 0:身份证1:护照2:台湾同胞回乡证3:港澳居民往来内地通行证4:台湾居民通行证5:港澳居民通行证
   * @return certType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "0:身份证1:护照2:台湾同胞回乡证3:港澳居民往来内地通行证4:台湾居民通行证5:港澳居民通行证")

  public String getCertType() {
    return certType;
  }


  public void setCertType(String certType) {
    this.certType = certType;
  }


  public ZhimaCustomerJobworthJobdataAddModel connKey(String connKey) {
    
    this.connKey = connKey;
    return this;
  }

   /**
   * 关联key，受理台返回
   * @return connKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd12345678", value = "关联key，受理台返回")

  public String getConnKey() {
    return connKey;
  }


  public void setConnKey(String connKey) {
    this.connKey = connKey;
  }


  public ZhimaCustomerJobworthJobdataAddModel jobDataList(List<JobWorthJobdata> jobDataList) {
    
    this.jobDataList = jobDataList;
    return this;
  }

  public ZhimaCustomerJobworthJobdataAddModel addJobDataListItem(JobWorthJobdata jobDataListItem) {
    if (this.jobDataList == null) {
      this.jobDataList = new ArrayList<>();
    }
    this.jobDataList.add(jobDataListItem);
    return this;
  }

   /**
   * 回传信息
   * @return jobDataList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "回传信息")

  public List<JobWorthJobdata> getJobDataList() {
    return jobDataList;
  }


  public void setJobDataList(List<JobWorthJobdata> jobDataList) {
    this.jobDataList = jobDataList;
  }


  public ZhimaCustomerJobworthJobdataAddModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝uid
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝uid")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public ZhimaCustomerJobworthJobdataAddModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 支付宝uid
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088302586280165", value = "支付宝uid")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ZhimaCustomerJobworthJobdataAddModel userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * 用户中文名
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "用户中文名")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaCustomerJobworthJobdataAddModel zhimaCustomerJobworthJobdataAddModel = (ZhimaCustomerJobworthJobdataAddModel) o;
    return Objects.equals(this.certNo, zhimaCustomerJobworthJobdataAddModel.certNo) &&
        Objects.equals(this.certType, zhimaCustomerJobworthJobdataAddModel.certType) &&
        Objects.equals(this.connKey, zhimaCustomerJobworthJobdataAddModel.connKey) &&
        Objects.equals(this.jobDataList, zhimaCustomerJobworthJobdataAddModel.jobDataList) &&
        Objects.equals(this.openId, zhimaCustomerJobworthJobdataAddModel.openId) &&
        Objects.equals(this.userId, zhimaCustomerJobworthJobdataAddModel.userId) &&
        Objects.equals(this.userName, zhimaCustomerJobworthJobdataAddModel.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certNo, certType, connKey, jobDataList, openId, userId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCustomerJobworthJobdataAddModel {\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
    sb.append("    connKey: ").append(toIndentedString(connKey)).append("\n");
    sb.append("    jobDataList: ").append(toIndentedString(jobDataList)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
    openapiFields.add("cert_no");
    openapiFields.add("cert_type");
    openapiFields.add("conn_key");
    openapiFields.add("job_data_list");
    openapiFields.add("open_id");
    openapiFields.add("user_id");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCustomerJobworthJobdataAddModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCustomerJobworthJobdataAddModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCustomerJobworthJobdataAddModel is not found in the empty JSON string", ZhimaCustomerJobworthJobdataAddModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCustomerJobworthJobdataAddModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCustomerJobworthJobdataAddModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("cert_type") != null && !jsonObj.get("cert_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_type").toString()));
      }
      if (jsonObj.get("conn_key") != null && !jsonObj.get("conn_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conn_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conn_key").toString()));
      }
      JsonArray jsonArrayjobDataList = jsonObj.getAsJsonArray("job_data_list");
      if (jsonArrayjobDataList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("job_data_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `job_data_list` to be an array in the JSON string but got `%s`", jsonObj.get("job_data_list").toString()));
        }

        // validate the optional field `job_data_list` (array)
        for (int i = 0; i < jsonArrayjobDataList.size(); i++) {
          JobWorthJobdata.validateJsonObject(jsonArrayjobDataList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (jsonObj.get("user_name") != null && !jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCustomerJobworthJobdataAddModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCustomerJobworthJobdataAddModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCustomerJobworthJobdataAddModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCustomerJobworthJobdataAddModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCustomerJobworthJobdataAddModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCustomerJobworthJobdataAddModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCustomerJobworthJobdataAddModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaCustomerJobworthJobdataAddModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCustomerJobworthJobdataAddModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCustomerJobworthJobdataAddModel
  */
  public static ZhimaCustomerJobworthJobdataAddModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCustomerJobworthJobdataAddModel.class);
  }

 /**
  * Convert an instance of ZhimaCustomerJobworthJobdataAddModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

