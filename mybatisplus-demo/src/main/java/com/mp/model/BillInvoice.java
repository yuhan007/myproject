package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 开票信息表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class BillInvoice extends Model<BillInvoice> {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一id
     */
    private String serialId;
    /**
     * 开票标题

     */
    private String invoiceTitle;
    /**
     * 用户id总行
     */
    private String userId;
    /**
     * 用户id支行
     */
    private String bankId;
    /**
     * 确认函id
     */
    private String balanceId;
    /**
     * 年
     */
    private Double year;
    /**
     * 季
     */
    private Double quarter;
    /**
     * 月
     */
    private Double month;
    /**
     * 开票申请状态，1 未开票 2已开票
     */
    private String applyStatus;
    /**
     * 开票申请人id
     */
    private String applyUserId;
    /**
     * 开票申请时间
     */
    private Date applyTime;
    /**
     * 开票时间
     */
    private Date invoiceTime;
    /**
     * 发票输出单位编号

     */
    private String accountId;
    /**
     * 发票类型		
     */
    private String invoiceType;
    /**
     * 发票金额
     */
    private Double invoiceAmount;
    /**
     * 附件1的name

     */
    private String filename1;
    /**
     * 附件1的url
     */
    private String fileurl1;
    /**
     * 附件2的name
     */
    private String filename2;
    /**
     * 附件2的url
     */
    private String fileurl2;
    /**
     * 账户名称
     */
    private String accountName;
    /**
     * 机构名称

     */
    private String mechanismName;
    /**
     * 申请开票操作状态（1新增2修改）
     */
    private String ext3;
    /**
     * 确认函路径
     */
    private String confirmationUrl;
    /**
     * 确认函生成时间
     */
    private Date confirmationCreateTime;
    /**
     * 申请开票备注
     */
    private String applyRemark;
    /**
     * 开票备注
     */
    private String invoiceRemark;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 开票人id
     */
    private String invoiceUserId;


    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
    }

    public Double getYear() {
        return year;
    }

    public void setYear(Double year) {
        this.year = year;
    }

    public Double getQuarter() {
        return quarter;
    }

    public void setQuarter(Double quarter) {
        this.quarter = quarter;
    }

    public Double getMonth() {
        return month;
    }

    public void setMonth(Double month) {
        this.month = month;
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(Date invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getFilename1() {
        return filename1;
    }

    public void setFilename1(String filename1) {
        this.filename1 = filename1;
    }

    public String getFileurl1() {
        return fileurl1;
    }

    public void setFileurl1(String fileurl1) {
        this.fileurl1 = fileurl1;
    }

    public String getFilename2() {
        return filename2;
    }

    public void setFilename2(String filename2) {
        this.filename2 = filename2;
    }

    public String getFileurl2() {
        return fileurl2;
    }

    public void setFileurl2(String fileurl2) {
        this.fileurl2 = fileurl2;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getMechanismName() {
        return mechanismName;
    }

    public void setMechanismName(String mechanismName) {
        this.mechanismName = mechanismName;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getConfirmationUrl() {
        return confirmationUrl;
    }

    public void setConfirmationUrl(String confirmationUrl) {
        this.confirmationUrl = confirmationUrl;
    }

    public Date getConfirmationCreateTime() {
        return confirmationCreateTime;
    }

    public void setConfirmationCreateTime(Date confirmationCreateTime) {
        this.confirmationCreateTime = confirmationCreateTime;
    }

    public String getApplyRemark() {
        return applyRemark;
    }

    public void setApplyRemark(String applyRemark) {
        this.applyRemark = applyRemark;
    }

    public String getInvoiceRemark() {
        return invoiceRemark;
    }

    public void setInvoiceRemark(String invoiceRemark) {
        this.invoiceRemark = invoiceRemark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getInvoiceUserId() {
        return invoiceUserId;
    }

    public void setInvoiceUserId(String invoiceUserId) {
        this.invoiceUserId = invoiceUserId;
    }

    @Override
    protected Serializable pkVal() {
        return this.serialId;
    }

    @Override
    public String toString() {
        return "BillInvoice{" +
        ", serialId=" + serialId +
        ", invoiceTitle=" + invoiceTitle +
        ", userId=" + userId +
        ", bankId=" + bankId +
        ", balanceId=" + balanceId +
        ", year=" + year +
        ", quarter=" + quarter +
        ", month=" + month +
        ", applyStatus=" + applyStatus +
        ", applyUserId=" + applyUserId +
        ", applyTime=" + applyTime +
        ", invoiceTime=" + invoiceTime +
        ", accountId=" + accountId +
        ", invoiceType=" + invoiceType +
        ", invoiceAmount=" + invoiceAmount +
        ", filename1=" + filename1 +
        ", fileurl1=" + fileurl1 +
        ", filename2=" + filename2 +
        ", fileurl2=" + fileurl2 +
        ", accountName=" + accountName +
        ", mechanismName=" + mechanismName +
        ", ext3=" + ext3 +
        ", confirmationUrl=" + confirmationUrl +
        ", confirmationCreateTime=" + confirmationCreateTime +
        ", applyRemark=" + applyRemark +
        ", invoiceRemark=" + invoiceRemark +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", invoiceUserId=" + invoiceUserId +
        "}";
    }
}
