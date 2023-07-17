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
import com.alipay.v3.model.AuthorizedRuleDTO;
import com.alipay.v3.model.InviteResultDTO;
import com.alipay.v3.model.JointAccountMemberInfoRespDTO;
import com.alipay.v3.model.JointAccountQuotaRespDTO;
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
 * AlipayFundJointaccountDetailQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundJointaccountDetailQueryResponseModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_ACCOUNT_QUOTA = "account_quota";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_QUOTA)
  private List<JointAccountQuotaRespDTO> accountQuota = null;

  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "account_status";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private String accountStatus;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_AUTHORIZED_RULE = "authorized_rule";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_RULE)
  private AuthorizedRuleDTO authorizedRule;

  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "available_balance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
  private String availableBalance;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private String creatorId;

  public static final String SERIALIZED_NAME_CREATOR_OPEN_ID = "creator_open_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_OPEN_ID)
  private String creatorOpenId;

  public static final String SERIALIZED_NAME_CREATOR_OUT_ID = "creator_out_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_OUT_ID)
  private String creatorOutId;

  public static final String SERIALIZED_NAME_FREEZE_BALANCE = "freeze_balance";
  @SerializedName(SERIALIZED_NAME_FREEZE_BALANCE)
  private String freezeBalance;

  public static final String SERIALIZED_NAME_INVITE_RESULT_LIST = "invite_result_list";
  @SerializedName(SERIALIZED_NAME_INVITE_RESULT_LIST)
  private List<InviteResultDTO> inviteResultList = null;

  public static final String SERIALIZED_NAME_MEMBER_LIST = "member_list";
  @SerializedName(SERIALIZED_NAME_MEMBER_LIST)
  private List<JointAccountMemberInfoRespDTO> memberList = null;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_PROFIT_STATUS = "profit_status";
  @SerializedName(SERIALIZED_NAME_PROFIT_STATUS)
  private String profitStatus;

  public static final String SERIALIZED_NAME_YESTERDAY_PROFIT = "yesterday_profit";
  @SerializedName(SERIALIZED_NAME_YESTERDAY_PROFIT)
  private String yesterdayProfit;

  public AlipayFundJointaccountDetailQueryResponseModel() { 
  }

  public AlipayFundJointaccountDetailQueryResponseModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 合花群ID（支付宝侧生成）
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxx", value = "合花群ID（支付宝侧生成）")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayFundJointaccountDetailQueryResponseModel accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * 账户名称（支付宝侧生成）
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "企业代付", value = "账户名称（支付宝侧生成）")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public AlipayFundJointaccountDetailQueryResponseModel accountQuota(List<JointAccountQuotaRespDTO> accountQuota) {
    
    this.accountQuota = accountQuota;
    return this;
  }

  public AlipayFundJointaccountDetailQueryResponseModel addAccountQuotaItem(JointAccountQuotaRespDTO accountQuotaItem) {
    if (this.accountQuota == null) {
      this.accountQuota = new ArrayList<>();
    }
    this.accountQuota.add(accountQuotaItem);
    return this;
  }

   /**
   * 额度模型
   * @return accountQuota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "额度模型")

  public List<JointAccountQuotaRespDTO> getAccountQuota() {
    return accountQuota;
  }


  public void setAccountQuota(List<JointAccountQuotaRespDTO> accountQuota) {
    this.accountQuota = accountQuota;
  }


  public AlipayFundJointaccountDetailQueryResponseModel accountStatus(String accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * 账户状态&lt;br&gt; -NORMAL：正常&lt;br&gt; -RELEASING：注销中&lt;br&gt; -RELEASED：已注销&lt;br&gt; - FREEZE：冻结
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NORMAL", value = "账户状态<br> -NORMAL：正常<br> -RELEASING：注销中<br> -RELEASED：已注销<br> - FREEZE：冻结")

  public String getAccountStatus() {
    return accountStatus;
  }


  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }


  public AlipayFundJointaccountDetailQueryResponseModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权协议号（支付宝侧生成）
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxx", value = "授权协议号（支付宝侧生成）")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayFundJointaccountDetailQueryResponseModel authorizedRule(AuthorizedRuleDTO authorizedRule) {
    
    this.authorizedRule = authorizedRule;
    return this;
  }

   /**
   * Get authorizedRule
   * @return authorizedRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthorizedRuleDTO getAuthorizedRule() {
    return authorizedRule;
  }


  public void setAuthorizedRule(AuthorizedRuleDTO authorizedRule) {
    this.authorizedRule = authorizedRule;
  }


  public AlipayFundJointaccountDetailQueryResponseModel availableBalance(String availableBalance) {
    
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * 当前可用金额（单位为元，必须大于0且最多小数点后两位）
   * @return availableBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13.14", value = "当前可用金额（单位为元，必须大于0且最多小数点后两位）")

  public String getAvailableBalance() {
    return availableBalance;
  }


  public void setAvailableBalance(String availableBalance) {
    this.availableBalance = availableBalance;
  }


  public AlipayFundJointaccountDetailQueryResponseModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 业务场景码
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "业务场景码")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayFundJointaccountDetailQueryResponseModel creatorId(String creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * （创建人）支付宝侧用户唯一标识
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088900976740001", value = "（创建人）支付宝侧用户唯一标识")

  public String getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  public AlipayFundJointaccountDetailQueryResponseModel creatorOpenId(String creatorOpenId) {
    
    this.creatorOpenId = creatorOpenId;
    return this;
  }

   /**
   * （创建人）支付宝侧用户唯一标识
   * @return creatorOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "095PJtAPYb2Uk", value = "（创建人）支付宝侧用户唯一标识")

  public String getCreatorOpenId() {
    return creatorOpenId;
  }


  public void setCreatorOpenId(String creatorOpenId) {
    this.creatorOpenId = creatorOpenId;
  }


  public AlipayFundJointaccountDetailQueryResponseModel creatorOutId(String creatorOutId) {
    
    this.creatorOutId = creatorOutId;
    return this;
  }

   /**
   * （创建人）商户侧用户唯一标识&lt;br&gt; 补充说明：&lt;br&gt; -如果签约时，发起人标识传递的是商户侧用户唯一标识，则该字段会返回&lt;br&gt; -如果签约时，发起人标识传递的是支付宝侧用户唯一标识，则该字段为空
   * @return creatorOutId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345678", value = "（创建人）商户侧用户唯一标识<br> 补充说明：<br> -如果签约时，发起人标识传递的是商户侧用户唯一标识，则该字段会返回<br> -如果签约时，发起人标识传递的是支付宝侧用户唯一标识，则该字段为空")

  public String getCreatorOutId() {
    return creatorOutId;
  }


  public void setCreatorOutId(String creatorOutId) {
    this.creatorOutId = creatorOutId;
  }


  public AlipayFundJointaccountDetailQueryResponseModel freezeBalance(String freezeBalance) {
    
    this.freezeBalance = freezeBalance;
    return this;
  }

   /**
   * 当前冻结金额（单位为元，必须大于0且最多小数点后两位）
   * @return freezeBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.20", value = "当前冻结金额（单位为元，必须大于0且最多小数点后两位）")

  public String getFreezeBalance() {
    return freezeBalance;
  }


  public void setFreezeBalance(String freezeBalance) {
    this.freezeBalance = freezeBalance;
  }


  public AlipayFundJointaccountDetailQueryResponseModel inviteResultList(List<InviteResultDTO> inviteResultList) {
    
    this.inviteResultList = inviteResultList;
    return this;
  }

  public AlipayFundJointaccountDetailQueryResponseModel addInviteResultListItem(InviteResultDTO inviteResultListItem) {
    if (this.inviteResultList == null) {
      this.inviteResultList = new ArrayList<>();
    }
    this.inviteResultList.add(inviteResultListItem);
    return this;
  }

   /**
   * 签约时邀请的成员列表（快照）
   * @return inviteResultList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "签约时邀请的成员列表（快照）")

  public List<InviteResultDTO> getInviteResultList() {
    return inviteResultList;
  }


  public void setInviteResultList(List<InviteResultDTO> inviteResultList) {
    this.inviteResultList = inviteResultList;
  }


  public AlipayFundJointaccountDetailQueryResponseModel memberList(List<JointAccountMemberInfoRespDTO> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public AlipayFundJointaccountDetailQueryResponseModel addMemberListItem(JointAccountMemberInfoRespDTO memberListItem) {
    if (this.memberList == null) {
      this.memberList = new ArrayList<>();
    }
    this.memberList.add(memberListItem);
    return this;
  }

   /**
   * 已加入合花群的成员列表
   * @return memberList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "已加入合花群的成员列表")

  public List<JointAccountMemberInfoRespDTO> getMemberList() {
    return memberList;
  }


  public void setMemberList(List<JointAccountMemberInfoRespDTO> memberList) {
    this.memberList = memberList;
  }


  public AlipayFundJointaccountDetailQueryResponseModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 销售产品码
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE_PAY", value = "销售产品码")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public AlipayFundJointaccountDetailQueryResponseModel profitStatus(String profitStatus) {
    
    this.profitStatus = profitStatus;
    return this;
  }

   /**
   * 生息状态：&lt;/br&gt; - MAKING    ：开启中&lt;/br&gt; - MADE.       ：已开启&lt;/br&gt; - CLEARING：关闭中&lt;/br&gt; - NONE.       ：未生息
   * @return profitStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MADE", value = "生息状态：</br> - MAKING    ：开启中</br> - MADE.       ：已开启</br> - CLEARING：关闭中</br> - NONE.       ：未生息")

  public String getProfitStatus() {
    return profitStatus;
  }


  public void setProfitStatus(String profitStatus) {
    this.profitStatus = profitStatus;
  }


  public AlipayFundJointaccountDetailQueryResponseModel yesterdayProfit(String yesterdayProfit) {
    
    this.yesterdayProfit = yesterdayProfit;
    return this;
  }

   /**
   * 昨日收益
   * @return yesterdayProfit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.45", value = "昨日收益")

  public String getYesterdayProfit() {
    return yesterdayProfit;
  }


  public void setYesterdayProfit(String yesterdayProfit) {
    this.yesterdayProfit = yesterdayProfit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundJointaccountDetailQueryResponseModel alipayFundJointaccountDetailQueryResponseModel = (AlipayFundJointaccountDetailQueryResponseModel) o;
    return Objects.equals(this.accountId, alipayFundJointaccountDetailQueryResponseModel.accountId) &&
        Objects.equals(this.accountName, alipayFundJointaccountDetailQueryResponseModel.accountName) &&
        Objects.equals(this.accountQuota, alipayFundJointaccountDetailQueryResponseModel.accountQuota) &&
        Objects.equals(this.accountStatus, alipayFundJointaccountDetailQueryResponseModel.accountStatus) &&
        Objects.equals(this.agreementNo, alipayFundJointaccountDetailQueryResponseModel.agreementNo) &&
        Objects.equals(this.authorizedRule, alipayFundJointaccountDetailQueryResponseModel.authorizedRule) &&
        Objects.equals(this.availableBalance, alipayFundJointaccountDetailQueryResponseModel.availableBalance) &&
        Objects.equals(this.bizScene, alipayFundJointaccountDetailQueryResponseModel.bizScene) &&
        Objects.equals(this.creatorId, alipayFundJointaccountDetailQueryResponseModel.creatorId) &&
        Objects.equals(this.creatorOpenId, alipayFundJointaccountDetailQueryResponseModel.creatorOpenId) &&
        Objects.equals(this.creatorOutId, alipayFundJointaccountDetailQueryResponseModel.creatorOutId) &&
        Objects.equals(this.freezeBalance, alipayFundJointaccountDetailQueryResponseModel.freezeBalance) &&
        Objects.equals(this.inviteResultList, alipayFundJointaccountDetailQueryResponseModel.inviteResultList) &&
        Objects.equals(this.memberList, alipayFundJointaccountDetailQueryResponseModel.memberList) &&
        Objects.equals(this.productCode, alipayFundJointaccountDetailQueryResponseModel.productCode) &&
        Objects.equals(this.profitStatus, alipayFundJointaccountDetailQueryResponseModel.profitStatus) &&
        Objects.equals(this.yesterdayProfit, alipayFundJointaccountDetailQueryResponseModel.yesterdayProfit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountQuota, accountStatus, agreementNo, authorizedRule, availableBalance, bizScene, creatorId, creatorOpenId, creatorOutId, freezeBalance, inviteResultList, memberList, productCode, profitStatus, yesterdayProfit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundJointaccountDetailQueryResponseModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountQuota: ").append(toIndentedString(accountQuota)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    authorizedRule: ").append(toIndentedString(authorizedRule)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    creatorOpenId: ").append(toIndentedString(creatorOpenId)).append("\n");
    sb.append("    creatorOutId: ").append(toIndentedString(creatorOutId)).append("\n");
    sb.append("    freezeBalance: ").append(toIndentedString(freezeBalance)).append("\n");
    sb.append("    inviteResultList: ").append(toIndentedString(inviteResultList)).append("\n");
    sb.append("    memberList: ").append(toIndentedString(memberList)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    profitStatus: ").append(toIndentedString(profitStatus)).append("\n");
    sb.append("    yesterdayProfit: ").append(toIndentedString(yesterdayProfit)).append("\n");
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
    openapiFields.add("account_name");
    openapiFields.add("account_quota");
    openapiFields.add("account_status");
    openapiFields.add("agreement_no");
    openapiFields.add("authorized_rule");
    openapiFields.add("available_balance");
    openapiFields.add("biz_scene");
    openapiFields.add("creator_id");
    openapiFields.add("creator_open_id");
    openapiFields.add("creator_out_id");
    openapiFields.add("freeze_balance");
    openapiFields.add("invite_result_list");
    openapiFields.add("member_list");
    openapiFields.add("product_code");
    openapiFields.add("profit_status");
    openapiFields.add("yesterday_profit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundJointaccountDetailQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundJointaccountDetailQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundJointaccountDetailQueryResponseModel is not found in the empty JSON string", AlipayFundJointaccountDetailQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundJointaccountDetailQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundJointaccountDetailQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("account_name") != null && !jsonObj.get("account_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_name").toString()));
      }
      JsonArray jsonArrayaccountQuota = jsonObj.getAsJsonArray("account_quota");
      if (jsonArrayaccountQuota != null) {
        // ensure the json data is an array
        if (!jsonObj.get("account_quota").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `account_quota` to be an array in the JSON string but got `%s`", jsonObj.get("account_quota").toString()));
        }

        // validate the optional field `account_quota` (array)
        for (int i = 0; i < jsonArrayaccountQuota.size(); i++) {
          JointAccountQuotaRespDTO.validateJsonObject(jsonArrayaccountQuota.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("account_status") != null && !jsonObj.get("account_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_status").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      // validate the optional field `authorized_rule`
      if (jsonObj.getAsJsonObject("authorized_rule") != null) {
        AuthorizedRuleDTO.validateJsonObject(jsonObj.getAsJsonObject("authorized_rule"));
      }
      if (jsonObj.get("available_balance") != null && !jsonObj.get("available_balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_balance").toString()));
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      if (jsonObj.get("creator_id") != null && !jsonObj.get("creator_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_id").toString()));
      }
      if (jsonObj.get("creator_open_id") != null && !jsonObj.get("creator_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_open_id").toString()));
      }
      if (jsonObj.get("creator_out_id") != null && !jsonObj.get("creator_out_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_out_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_out_id").toString()));
      }
      if (jsonObj.get("freeze_balance") != null && !jsonObj.get("freeze_balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freeze_balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freeze_balance").toString()));
      }
      JsonArray jsonArrayinviteResultList = jsonObj.getAsJsonArray("invite_result_list");
      if (jsonArrayinviteResultList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("invite_result_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `invite_result_list` to be an array in the JSON string but got `%s`", jsonObj.get("invite_result_list").toString()));
        }

        // validate the optional field `invite_result_list` (array)
        for (int i = 0; i < jsonArrayinviteResultList.size(); i++) {
          InviteResultDTO.validateJsonObject(jsonArrayinviteResultList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraymemberList = jsonObj.getAsJsonArray("member_list");
      if (jsonArraymemberList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("member_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `member_list` to be an array in the JSON string but got `%s`", jsonObj.get("member_list").toString()));
        }

        // validate the optional field `member_list` (array)
        for (int i = 0; i < jsonArraymemberList.size(); i++) {
          JointAccountMemberInfoRespDTO.validateJsonObject(jsonArraymemberList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
      if (jsonObj.get("profit_status") != null && !jsonObj.get("profit_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profit_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profit_status").toString()));
      }
      if (jsonObj.get("yesterday_profit") != null && !jsonObj.get("yesterday_profit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `yesterday_profit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("yesterday_profit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundJointaccountDetailQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundJointaccountDetailQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundJointaccountDetailQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundJointaccountDetailQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundJointaccountDetailQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundJointaccountDetailQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundJointaccountDetailQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundJointaccountDetailQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundJointaccountDetailQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundJointaccountDetailQueryResponseModel
  */
  public static AlipayFundJointaccountDetailQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundJointaccountDetailQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundJointaccountDetailQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

