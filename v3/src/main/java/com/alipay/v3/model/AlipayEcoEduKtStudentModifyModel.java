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
import com.alipay.v3.model.UserDetails;
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
 * AlipayEcoEduKtStudentModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoEduKtStudentModifyModel {
  public static final String SERIALIZED_NAME_CHILD_NAME = "child_name";
  @SerializedName(SERIALIZED_NAME_CHILD_NAME)
  private String childName;

  public static final String SERIALIZED_NAME_ISV_PID = "isv_pid";
  @SerializedName(SERIALIZED_NAME_ISV_PID)
  private String isvPid;

  public static final String SERIALIZED_NAME_SCHOOL_NO = "school_no";
  @SerializedName(SERIALIZED_NAME_SCHOOL_NO)
  private String schoolNo;

  public static final String SERIALIZED_NAME_SCHOOL_PID = "school_pid";
  @SerializedName(SERIALIZED_NAME_SCHOOL_PID)
  private String schoolPid;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STUDENT_CODE = "student_code";
  @SerializedName(SERIALIZED_NAME_STUDENT_CODE)
  private String studentCode;

  public static final String SERIALIZED_NAME_STUDENT_IDENTIFY = "student_identify";
  @SerializedName(SERIALIZED_NAME_STUDENT_IDENTIFY)
  private String studentIdentify;

  public static final String SERIALIZED_NAME_STUDENT_NO = "student_no";
  @SerializedName(SERIALIZED_NAME_STUDENT_NO)
  private String studentNo;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<UserDetails> users = null;

  public AlipayEcoEduKtStudentModifyModel() { 
  }

  public AlipayEcoEduKtStudentModifyModel childName(String childName) {
    
    this.childName = childName;
    return this;
  }

   /**
   * 修改后的学生姓名  本接口调用时，child_name、student_code、student_identify、users这几个参数至少需要填写其中一个，不能同时为空
   * @return childName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "修改后的学生姓名  本接口调用时，child_name、student_code、student_identify、users这几个参数至少需要填写其中一个，不能同时为空")

  public String getChildName() {
    return childName;
  }


  public void setChildName(String childName) {
    this.childName = childName;
  }


  public AlipayEcoEduKtStudentModifyModel isvPid(String isvPid) {
    
    this.isvPid = isvPid;
    return this;
  }

   /**
   * 已经签约教育缴费的isv的支付宝PID
   * @return isvPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088121212121212", value = "已经签约教育缴费的isv的支付宝PID")

  public String getIsvPid() {
    return isvPid;
  }


  public void setIsvPid(String isvPid) {
    this.isvPid = isvPid;
  }


  public AlipayEcoEduKtStudentModifyModel schoolNo(String schoolNo) {
    
    this.schoolNo = schoolNo;
    return this;
  }

   /**
   * 学校编号，调用alipay.eco.edu.kt.schoolinfo.modify接口录入学校信息时，接口返回的编号
   * @return schoolNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11010100000001", value = "学校编号，调用alipay.eco.edu.kt.schoolinfo.modify接口录入学校信息时，接口返回的编号")

  public String getSchoolNo() {
    return schoolNo;
  }


  public void setSchoolNo(String schoolNo) {
    this.schoolNo = schoolNo;
  }


  public AlipayEcoEduKtStudentModifyModel schoolPid(String schoolPid) {
    
    this.schoolPid = schoolPid;
    return this;
  }

   /**
   * 学校用来签约支付宝教育缴费的支付宝PID
   * @return schoolPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117955611", value = "学校用来签约支付宝教育缴费的支付宝PID")

  public String getSchoolPid() {
    return schoolPid;
  }


  public void setSchoolPid(String schoolPid) {
    this.schoolPid = schoolPid;
  }


  public AlipayEcoEduKtStudentModifyModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 区分ISV操作，“D”表示删除，“U”表示更新，区分大小写。  如果为U，则学生名字，学号，身份证至少填写一项
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "U", value = "区分ISV操作，“D”表示删除，“U”表示更新，区分大小写。  如果为U，则学生名字，学号，身份证至少填写一项")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayEcoEduKtStudentModifyModel studentCode(String studentCode) {
    
    this.studentCode = studentCode;
    return this;
  }

   /**
   * 修改后的学号  本接口调用时，child_name、student_code、student_identify、users这几个参数至少需要填写其中一个，不能同时为空
   * @return studentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6589154", value = "修改后的学号  本接口调用时，child_name、student_code、student_identify、users这几个参数至少需要填写其中一个，不能同时为空")

  public String getStudentCode() {
    return studentCode;
  }


  public void setStudentCode(String studentCode) {
    this.studentCode = studentCode;
  }


  public AlipayEcoEduKtStudentModifyModel studentIdentify(String studentIdentify) {
    
    this.studentIdentify = studentIdentify;
    return this;
  }

   /**
   * 修改后的身份证号码  本接口调用时，child_name、student_code、student_identify、users这几个参数至少需要填写其中一个，不能同时为空
   * @return studentIdentify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "610824197812044680", value = "修改后的身份证号码  本接口调用时，child_name、student_code、student_identify、users这几个参数至少需要填写其中一个，不能同时为空")

  public String getStudentIdentify() {
    return studentIdentify;
  }


  public void setStudentIdentify(String studentIdentify) {
    this.studentIdentify = studentIdentify;
  }


  public AlipayEcoEduKtStudentModifyModel studentNo(String studentNo) {
    
    this.studentNo = studentNo;
    return this;
  }

   /**
   * 支付宝-中小学-教育缴费生成的学生唯一编号
   * @return studentNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "57de63cb1ef157595c005467", value = "支付宝-中小学-教育缴费生成的学生唯一编号")

  public String getStudentNo() {
    return studentNo;
  }


  public void setStudentNo(String studentNo) {
    this.studentNo = studentNo;
  }


  public AlipayEcoEduKtStudentModifyModel users(List<UserDetails> users) {
    
    this.users = users;
    return this;
  }

  public AlipayEcoEduKtStudentModifyModel addUsersItem(UserDetails usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * 孩子的家长信息，最多一次输入20个家长。如果输入的家长信息不存在，则该改学生增加家长信息  本接口调用时，child_name、student_code、student_identify、users这几个参数至少需要填写其中一个，不能同时为空
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "孩子的家长信息，最多一次输入20个家长。如果输入的家长信息不存在，则该改学生增加家长信息  本接口调用时，child_name、student_code、student_identify、users这几个参数至少需要填写其中一个，不能同时为空")

  public List<UserDetails> getUsers() {
    return users;
  }


  public void setUsers(List<UserDetails> users) {
    this.users = users;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoEduKtStudentModifyModel alipayEcoEduKtStudentModifyModel = (AlipayEcoEduKtStudentModifyModel) o;
    return Objects.equals(this.childName, alipayEcoEduKtStudentModifyModel.childName) &&
        Objects.equals(this.isvPid, alipayEcoEduKtStudentModifyModel.isvPid) &&
        Objects.equals(this.schoolNo, alipayEcoEduKtStudentModifyModel.schoolNo) &&
        Objects.equals(this.schoolPid, alipayEcoEduKtStudentModifyModel.schoolPid) &&
        Objects.equals(this.status, alipayEcoEduKtStudentModifyModel.status) &&
        Objects.equals(this.studentCode, alipayEcoEduKtStudentModifyModel.studentCode) &&
        Objects.equals(this.studentIdentify, alipayEcoEduKtStudentModifyModel.studentIdentify) &&
        Objects.equals(this.studentNo, alipayEcoEduKtStudentModifyModel.studentNo) &&
        Objects.equals(this.users, alipayEcoEduKtStudentModifyModel.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childName, isvPid, schoolNo, schoolPid, status, studentCode, studentIdentify, studentNo, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoEduKtStudentModifyModel {\n");
    sb.append("    childName: ").append(toIndentedString(childName)).append("\n");
    sb.append("    isvPid: ").append(toIndentedString(isvPid)).append("\n");
    sb.append("    schoolNo: ").append(toIndentedString(schoolNo)).append("\n");
    sb.append("    schoolPid: ").append(toIndentedString(schoolPid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    studentCode: ").append(toIndentedString(studentCode)).append("\n");
    sb.append("    studentIdentify: ").append(toIndentedString(studentIdentify)).append("\n");
    sb.append("    studentNo: ").append(toIndentedString(studentNo)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
    openapiFields.add("child_name");
    openapiFields.add("isv_pid");
    openapiFields.add("school_no");
    openapiFields.add("school_pid");
    openapiFields.add("status");
    openapiFields.add("student_code");
    openapiFields.add("student_identify");
    openapiFields.add("student_no");
    openapiFields.add("users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoEduKtStudentModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoEduKtStudentModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoEduKtStudentModifyModel is not found in the empty JSON string", AlipayEcoEduKtStudentModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoEduKtStudentModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoEduKtStudentModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("child_name") != null && !jsonObj.get("child_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `child_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("child_name").toString()));
      }
      if (jsonObj.get("isv_pid") != null && !jsonObj.get("isv_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_pid").toString()));
      }
      if (jsonObj.get("school_no") != null && !jsonObj.get("school_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_no").toString()));
      }
      if (jsonObj.get("school_pid") != null && !jsonObj.get("school_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_pid").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("student_code") != null && !jsonObj.get("student_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `student_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("student_code").toString()));
      }
      if (jsonObj.get("student_identify") != null && !jsonObj.get("student_identify").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `student_identify` to be a primitive type in the JSON string but got `%s`", jsonObj.get("student_identify").toString()));
      }
      if (jsonObj.get("student_no") != null && !jsonObj.get("student_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `student_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("student_no").toString()));
      }
      JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
      if (jsonArrayusers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("users").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
        }

        // validate the optional field `users` (array)
        for (int i = 0; i < jsonArrayusers.size(); i++) {
          UserDetails.validateJsonObject(jsonArrayusers.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoEduKtStudentModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoEduKtStudentModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoEduKtStudentModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoEduKtStudentModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoEduKtStudentModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoEduKtStudentModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoEduKtStudentModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoEduKtStudentModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoEduKtStudentModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoEduKtStudentModifyModel
  */
  public static AlipayEcoEduKtStudentModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoEduKtStudentModifyModel.class);
  }

 /**
  * Convert an instance of AlipayEcoEduKtStudentModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

