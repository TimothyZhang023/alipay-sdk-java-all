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
 * EmployeeTitleDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EmployeeTitleDTO {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CREATE_BY = "create_by";
  @SerializedName(SERIALIZED_NAME_CREATE_BY)
  private String createBy;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_MODIFY_BY = "modify_by";
  @SerializedName(SERIALIZED_NAME_MODIFY_BY)
  private String modifyBy;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_TITLE_ID = "title_id";
  @SerializedName(SERIALIZED_NAME_TITLE_ID)
  private String titleId;

  public static final String SERIALIZED_NAME_TITLE_TAG = "title_tag";
  @SerializedName(SERIALIZED_NAME_TITLE_TAG)
  private String titleTag;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public EmployeeTitleDTO() { 
  }

  public EmployeeTitleDTO accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户id,与enterprise_id两者必填其一
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "共同账户id,与enterprise_id两者必填其一")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public EmployeeTitleDTO createBy(String createBy) {
    
    this.createBy = createBy;
    return this;
  }

   /**
   * 创建人
   * @return createBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "创建人")

  public String getCreateBy() {
    return createBy;
  }


  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }


  public EmployeeTitleDTO employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 企业域定义的员工id，与user_id两者必填其一
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "企业域定义的员工id，与user_id两者必填其一")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public EmployeeTitleDTO enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业域定义的企业id，与account_id两者必填其一
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "企业域定义的企业id，与account_id两者必填其一")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public EmployeeTitleDTO modifyBy(String modifyBy) {
    
    this.modifyBy = modifyBy;
    return this;
  }

   /**
   * 修改人
   * @return modifyBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "修改人")

  public String getModifyBy() {
    return modifyBy;
  }


  public void setModifyBy(String modifyBy) {
    this.modifyBy = modifyBy;
  }


  public EmployeeTitleDTO openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 员工支付宝账号open_id,与employee_id两者必填其一
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "员工支付宝账号open_id,与employee_id两者必填其一")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public EmployeeTitleDTO titleId(String titleId) {
    
    this.titleId = titleId;
    return this;
  }

   /**
   * 抬头id
   * @return titleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "抬头id")

  public String getTitleId() {
    return titleId;
  }


  public void setTitleId(String titleId) {
    this.titleId = titleId;
  }


  public EmployeeTitleDTO titleTag(String titleTag) {
    
    this.titleTag = titleTag;
    return this;
  }

   /**
   * 关系标记
   * @return titleTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关系标记")

  public String getTitleTag() {
    return titleTag;
  }


  public void setTitleTag(String titleTag) {
    this.titleTag = titleTag;
  }


  public EmployeeTitleDTO userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 员工支付宝账号2088,与employee_id两者必填其一
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "员工支付宝账号2088,与employee_id两者必填其一")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeTitleDTO employeeTitleDTO = (EmployeeTitleDTO) o;
    return Objects.equals(this.accountId, employeeTitleDTO.accountId) &&
        Objects.equals(this.createBy, employeeTitleDTO.createBy) &&
        Objects.equals(this.employeeId, employeeTitleDTO.employeeId) &&
        Objects.equals(this.enterpriseId, employeeTitleDTO.enterpriseId) &&
        Objects.equals(this.modifyBy, employeeTitleDTO.modifyBy) &&
        Objects.equals(this.openId, employeeTitleDTO.openId) &&
        Objects.equals(this.titleId, employeeTitleDTO.titleId) &&
        Objects.equals(this.titleTag, employeeTitleDTO.titleTag) &&
        Objects.equals(this.userId, employeeTitleDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, createBy, employeeId, enterpriseId, modifyBy, openId, titleId, titleTag, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTitleDTO {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    modifyBy: ").append(toIndentedString(modifyBy)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    titleId: ").append(toIndentedString(titleId)).append("\n");
    sb.append("    titleTag: ").append(toIndentedString(titleTag)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("create_by");
    openapiFields.add("employee_id");
    openapiFields.add("enterprise_id");
    openapiFields.add("modify_by");
    openapiFields.add("open_id");
    openapiFields.add("title_id");
    openapiFields.add("title_tag");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeTitleDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EmployeeTitleDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeTitleDTO is not found in the empty JSON string", EmployeeTitleDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EmployeeTitleDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmployeeTitleDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("create_by") != null && !jsonObj.get("create_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_by").toString()));
      }
      if (jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("modify_by") != null && !jsonObj.get("modify_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modify_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modify_by").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("title_id") != null && !jsonObj.get("title_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title_id").toString()));
      }
      if (jsonObj.get("title_tag") != null && !jsonObj.get("title_tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title_tag").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeTitleDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeTitleDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeTitleDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeTitleDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeTitleDTO>() {
           @Override
           public void write(JsonWriter out, EmployeeTitleDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmployeeTitleDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmployeeTitleDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeTitleDTO
  * @throws IOException if the JSON string is invalid with respect to EmployeeTitleDTO
  */
  public static EmployeeTitleDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeTitleDTO.class);
  }

 /**
  * Convert an instance of EmployeeTitleDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

