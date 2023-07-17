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
 * PaidOuterCardManageUrlConfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaidOuterCardManageUrlConfDTO {
  public static final String SERIALIZED_NAME_CYCLE_MANAGE_URL = "cycle_manage_url";
  @SerializedName(SERIALIZED_NAME_CYCLE_MANAGE_URL)
  private String cycleManageUrl;

  public static final String SERIALIZED_NAME_DOWNGRADE_URL = "downgrade_url";
  @SerializedName(SERIALIZED_NAME_DOWNGRADE_URL)
  private String downgradeUrl;

  public static final String SERIALIZED_NAME_REFUND_URL = "refund_url";
  @SerializedName(SERIALIZED_NAME_REFUND_URL)
  private String refundUrl;

  public static final String SERIALIZED_NAME_RENEW_URL = "renew_url";
  @SerializedName(SERIALIZED_NAME_RENEW_URL)
  private String renewUrl;

  public static final String SERIALIZED_NAME_UPGRADE_URL = "upgrade_url";
  @SerializedName(SERIALIZED_NAME_UPGRADE_URL)
  private String upgradeUrl;

  public PaidOuterCardManageUrlConfDTO() { 
  }

  public PaidOuterCardManageUrlConfDTO cycleManageUrl(String cycleManageUrl) {
    
    this.cycleManageUrl = cycleManageUrl;
    return this;
  }

   /**
   * 连续购买管理地址。包括查看当前用户连续购买详情，关闭连续购买等功能
   * @return cycleManageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "连续购买管理地址。包括查看当前用户连续购买详情，关闭连续购买等功能")

  public String getCycleManageUrl() {
    return cycleManageUrl;
  }


  public void setCycleManageUrl(String cycleManageUrl) {
    this.cycleManageUrl = cycleManageUrl;
  }


  public PaidOuterCardManageUrlConfDTO downgradeUrl(String downgradeUrl) {
    
    this.downgradeUrl = downgradeUrl;
    return this;
  }

   /**
   * 付费外卡降级地址
   * @return downgradeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "付费外卡降级地址")

  public String getDowngradeUrl() {
    return downgradeUrl;
  }


  public void setDowngradeUrl(String downgradeUrl) {
    this.downgradeUrl = downgradeUrl;
  }


  public PaidOuterCardManageUrlConfDTO refundUrl(String refundUrl) {
    
    this.refundUrl = refundUrl;
    return this;
  }

   /**
   * 续费外卡退款地址
   * @return refundUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "续费外卡退款地址")

  public String getRefundUrl() {
    return refundUrl;
  }


  public void setRefundUrl(String refundUrl) {
    this.refundUrl = refundUrl;
  }


  public PaidOuterCardManageUrlConfDTO renewUrl(String renewUrl) {
    
    this.renewUrl = renewUrl;
    return this;
  }

   /**
   * 付费外卡续费地址
   * @return renewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "付费外卡续费地址")

  public String getRenewUrl() {
    return renewUrl;
  }


  public void setRenewUrl(String renewUrl) {
    this.renewUrl = renewUrl;
  }


  public PaidOuterCardManageUrlConfDTO upgradeUrl(String upgradeUrl) {
    
    this.upgradeUrl = upgradeUrl;
    return this;
  }

   /**
   * 付费外卡升级地址
   * @return upgradeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "付费外卡升级地址")

  public String getUpgradeUrl() {
    return upgradeUrl;
  }


  public void setUpgradeUrl(String upgradeUrl) {
    this.upgradeUrl = upgradeUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaidOuterCardManageUrlConfDTO paidOuterCardManageUrlConfDTO = (PaidOuterCardManageUrlConfDTO) o;
    return Objects.equals(this.cycleManageUrl, paidOuterCardManageUrlConfDTO.cycleManageUrl) &&
        Objects.equals(this.downgradeUrl, paidOuterCardManageUrlConfDTO.downgradeUrl) &&
        Objects.equals(this.refundUrl, paidOuterCardManageUrlConfDTO.refundUrl) &&
        Objects.equals(this.renewUrl, paidOuterCardManageUrlConfDTO.renewUrl) &&
        Objects.equals(this.upgradeUrl, paidOuterCardManageUrlConfDTO.upgradeUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleManageUrl, downgradeUrl, refundUrl, renewUrl, upgradeUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaidOuterCardManageUrlConfDTO {\n");
    sb.append("    cycleManageUrl: ").append(toIndentedString(cycleManageUrl)).append("\n");
    sb.append("    downgradeUrl: ").append(toIndentedString(downgradeUrl)).append("\n");
    sb.append("    refundUrl: ").append(toIndentedString(refundUrl)).append("\n");
    sb.append("    renewUrl: ").append(toIndentedString(renewUrl)).append("\n");
    sb.append("    upgradeUrl: ").append(toIndentedString(upgradeUrl)).append("\n");
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
    openapiFields.add("cycle_manage_url");
    openapiFields.add("downgrade_url");
    openapiFields.add("refund_url");
    openapiFields.add("renew_url");
    openapiFields.add("upgrade_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaidOuterCardManageUrlConfDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaidOuterCardManageUrlConfDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaidOuterCardManageUrlConfDTO is not found in the empty JSON string", PaidOuterCardManageUrlConfDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaidOuterCardManageUrlConfDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaidOuterCardManageUrlConfDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cycle_manage_url") != null && !jsonObj.get("cycle_manage_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_manage_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cycle_manage_url").toString()));
      }
      if (jsonObj.get("downgrade_url") != null && !jsonObj.get("downgrade_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `downgrade_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("downgrade_url").toString()));
      }
      if (jsonObj.get("refund_url") != null && !jsonObj.get("refund_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_url").toString()));
      }
      if (jsonObj.get("renew_url") != null && !jsonObj.get("renew_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `renew_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("renew_url").toString()));
      }
      if (jsonObj.get("upgrade_url") != null && !jsonObj.get("upgrade_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upgrade_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upgrade_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaidOuterCardManageUrlConfDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaidOuterCardManageUrlConfDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaidOuterCardManageUrlConfDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaidOuterCardManageUrlConfDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<PaidOuterCardManageUrlConfDTO>() {
           @Override
           public void write(JsonWriter out, PaidOuterCardManageUrlConfDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaidOuterCardManageUrlConfDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaidOuterCardManageUrlConfDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaidOuterCardManageUrlConfDTO
  * @throws IOException if the JSON string is invalid with respect to PaidOuterCardManageUrlConfDTO
  */
  public static PaidOuterCardManageUrlConfDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaidOuterCardManageUrlConfDTO.class);
  }

 /**
  * Convert an instance of PaidOuterCardManageUrlConfDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

