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
 * RoyaltyEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoyaltyEntity {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_ACCOUNT_OPEN_ID = "account_open_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_OPEN_ID)
  private String accountOpenId;

  public static final String SERIALIZED_NAME_BIND_LOGIN_NAME = "bind_login_name";
  @SerializedName(SERIALIZED_NAME_BIND_LOGIN_NAME)
  private String bindLoginName;

  public static final String SERIALIZED_NAME_LOGIN_NAME = "login_name";
  @SerializedName(SERIALIZED_NAME_LOGIN_NAME)
  private String loginName;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public RoyaltyEntity() { 
  }

  public RoyaltyEntity account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * 分账接收方账号。 当分账方类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字； 当分账方类型是loginName时，本参数为用户的支付宝登录号；当分账方类型是openId时，本参数传递支付宝openId信息。
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账接收方账号。 当分账方类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字； 当分账方类型是loginName时，本参数为用户的支付宝登录号；当分账方类型是openId时，本参数传递支付宝openId信息。")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public RoyaltyEntity accountOpenId(String accountOpenId) {
    
    this.accountOpenId = accountOpenId;
    return this;
  }

   /**
   * 分账接收方openId，本参数为分账接收方在该应用（AppId）下的唯一用户标识，仅用于分账关系查询接口出参。
   * @return accountOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账接收方openId，本参数为分账接收方在该应用（AppId）下的唯一用户标识，仅用于分账关系查询接口出参。")

  public String getAccountOpenId() {
    return accountOpenId;
  }


  public void setAccountOpenId(String accountOpenId) {
    this.accountOpenId = accountOpenId;
  }


  public RoyaltyEntity bindLoginName(String bindLoginName) {
    
    this.bindLoginName = bindLoginName;
    return this;
  }

   /**
   * 作为查询返回结果：分账收款方绑定时的支付宝登录号。分账关系绑定（alipay.trade.royalty.relation.bind）时，通过type为loginName绑定传入的支付宝登录号，若使用userId绑定则不返回。
   * @return bindLoginName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "作为查询返回结果：分账收款方绑定时的支付宝登录号。分账关系绑定（alipay.trade.royalty.relation.bind）时，通过type为loginName绑定传入的支付宝登录号，若使用userId绑定则不返回。")

  public String getBindLoginName() {
    return bindLoginName;
  }


  public void setBindLoginName(String bindLoginName) {
    this.bindLoginName = bindLoginName;
  }


  public RoyaltyEntity loginName(String loginName) {
    
    this.loginName = loginName;
    return this;
  }

   /**
   * 作为查询返回结果：当前userId对应的支付宝登录号。当login_name与bind_login_name不相等时，表明该支付宝账户发生了登录号变更。
   * @return loginName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "作为查询返回结果：当前userId对应的支付宝登录号。当login_name与bind_login_name不相等时，表明该支付宝账户发生了登录号变更。")

  public String getLoginName() {
    return loginName;
  }


  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }


  public RoyaltyEntity memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 分账关系描述
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账关系描述")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public RoyaltyEntity name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 分账接收方真实姓名。 绑定分账关系时： 当分账方类型是userId时，本参数可以不传，若上传则进行校验不上传不会校验。 当分账方类型是loginName时，本参数必传。 解绑分账关系时：作为请求参数可不填，分账关系查询时不作为返回结果返回
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账接收方真实姓名。 绑定分账关系时： 当分账方类型是userId时，本参数可以不传，若上传则进行校验不上传不会校验。 当分账方类型是loginName时，本参数必传。 解绑分账关系时：作为请求参数可不填，分账关系查询时不作为返回结果返回")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RoyaltyEntity type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 分账接收方方类型。
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账接收方方类型。")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoyaltyEntity royaltyEntity = (RoyaltyEntity) o;
    return Objects.equals(this.account, royaltyEntity.account) &&
        Objects.equals(this.accountOpenId, royaltyEntity.accountOpenId) &&
        Objects.equals(this.bindLoginName, royaltyEntity.bindLoginName) &&
        Objects.equals(this.loginName, royaltyEntity.loginName) &&
        Objects.equals(this.memo, royaltyEntity.memo) &&
        Objects.equals(this.name, royaltyEntity.name) &&
        Objects.equals(this.type, royaltyEntity.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountOpenId, bindLoginName, loginName, memo, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoyaltyEntity {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountOpenId: ").append(toIndentedString(accountOpenId)).append("\n");
    sb.append("    bindLoginName: ").append(toIndentedString(bindLoginName)).append("\n");
    sb.append("    loginName: ").append(toIndentedString(loginName)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("account_open_id");
    openapiFields.add("bind_login_name");
    openapiFields.add("login_name");
    openapiFields.add("memo");
    openapiFields.add("name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RoyaltyEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RoyaltyEntity.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RoyaltyEntity is not found in the empty JSON string", RoyaltyEntity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RoyaltyEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RoyaltyEntity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account").toString()));
      }
      if (jsonObj.get("account_open_id") != null && !jsonObj.get("account_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_open_id").toString()));
      }
      if (jsonObj.get("bind_login_name") != null && !jsonObj.get("bind_login_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bind_login_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bind_login_name").toString()));
      }
      if (jsonObj.get("login_name") != null && !jsonObj.get("login_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login_name").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RoyaltyEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RoyaltyEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RoyaltyEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RoyaltyEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<RoyaltyEntity>() {
           @Override
           public void write(JsonWriter out, RoyaltyEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RoyaltyEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RoyaltyEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RoyaltyEntity
  * @throws IOException if the JSON string is invalid with respect to RoyaltyEntity
  */
  public static RoyaltyEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RoyaltyEntity.class);
  }

 /**
  * Convert an instance of RoyaltyEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

