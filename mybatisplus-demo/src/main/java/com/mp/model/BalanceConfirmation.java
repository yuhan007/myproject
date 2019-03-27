package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 结算确认函
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class BalanceConfirmation extends Model<BalanceConfirmation> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String serialId;
    /**
     * 项目编号
     */
    private String userId;
    /**
     * 客户简称-项目名称
     */
    private String userName;
    /**
     * 年份
     */
    private Double year;
    /**
     * 季度
     */
    private Double quarter;
    /**
     * 月份
     */
    private Double month;
    /**
     * 结算金额
     */
    private Double balanceAmount;
    /**
     * 生成时间
     */
    private Date createTime;
    /**
     * 确认函名称
     */
    private String confirmationName;
    /**
     * PDF路径
     */
    private String filePath;
    /**
     * 备注
     */
    private String remark;
    /**
     * 已结算金额
     */
    private Double balancedAmount;
    /**
     * 待结算金额
     */
    private Double notBalancedAmount;
    /**
     * 结算状态，1：已结算，0：待结算
     */
    private Double balanceStatus;
    /**
     * 最近结算时间
     */
    private Date latestBalanceTime;
    /**
     * 客户编号
     */
    private String branchId;
    /**
     * 客户全称
     */
    private String branchFullName;
    /**
     * 生成人ID
     */
    private String createUserId;
    /**
     * 开票申请人ID
     */
    private String invoiceApplyUserId;
    /**
     * 开票申请状态，0：未申请，1：部分申请，2：全部申请
     */
    private Double invoiceApplyStatus;
    /**
     * 开票申请时间
     */
    private Date invoiceApplyTime;
    /**
     * 开票人ID
     */
    private String invoiceUserId;
    /**
     * 开票时间
     */
    private Date invoiceTime;
    /**
     * 开票备注
     */
    private String invoiceRemark;
    /**
     * 同步金额
     */
    private Double syncMoney;
    /**
     * 财务审核金额
     */
    private Double financeCheckMoney;
    /**
     * 开票状态  0:未开票   1部分开票   2全部开票
     */
    private Double invoiceStatus;


    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getConfirmationName() {
        return confirmationName;
    }

    public void setConfirmationName(String confirmationName) {
        this.confirmationName = confirmationName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getBalancedAmount() {
        return balancedAmount;
    }

    public void setBalancedAmount(Double balancedAmount) {
        this.balancedAmount = balancedAmount;
    }

    public Double getNotBalancedAmount() {
        return notBalancedAmount;
    }

    public void setNotBalancedAmount(Double notBalancedAmount) {
        this.notBalancedAmount = notBalancedAmount;
    }

    public Double getBalanceStatus() {
        return balanceStatus;
    }

    public void setBalanceStatus(Double balanceStatus) {
        this.balanceStatus = balanceStatus;
    }

    public Date getLatestBalanceTime() {
        return latestBalanceTime;
    }

    public void setLatestBalanceTime(Date latestBalanceTime) {
        this.latestBalanceTime = latestBalanceTime;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchFullName() {
        return branchFullName;
    }

    public void setBranchFullName(String branchFullName) {
        this.branchFullName = branchFullName;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getInvoiceApplyUserId() {
        return invoiceApplyUserId;
    }

    public void setInvoiceApplyUserId(String invoiceApplyUserId) {
        this.invoiceApplyUserId = invoiceApplyUserId;
    }

    public Double getInvoiceApplyStatus() {
        return invoiceApplyStatus;
    }

    public void setInvoiceApplyStatus(Double invoiceApplyStatus) {
        this.invoiceApplyStatus = invoiceApplyStatus;
    }

    public Date getInvoiceApplyTime() {
        return invoiceApplyTime;
    }

    public void setInvoiceApplyTime(Date invoiceApplyTime) {
        this.invoiceApplyTime = invoiceApplyTime;
    }

    public String getInvoiceUserId() {
        return invoiceUserId;
    }

    public void setInvoiceUserId(String invoiceUserId) {
        this.invoiceUserId = invoiceUserId;
    }

    public Date getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(Date invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public String getInvoiceRemark() {
        return invoiceRemark;
    }

    public void setInvoiceRemark(String invoiceRemark) {
        this.invoiceRemark = invoiceRemark;
    }

    public Double getSyncMoney() {
        return syncMoney;
    }

    public void setSyncMoney(Double syncMoney) {
        this.syncMoney = syncMoney;
    }

    public Double getFinanceCheckMoney() {
        return financeCheckMoney;
    }

    public void setFinanceCheckMoney(Double financeCheckMoney) {
        this.financeCheckMoney = financeCheckMoney;
    }

    public Double getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(Double invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    @Override
    protected Serializable pkVal() {
        return this.serialId;
    }

    @Override
    public String toString() {
        return "BalanceConfirmation{" +
        ", serialId=" + serialId +
        ", userId=" + userId +
        ", userName=" + userName +
        ", year=" + year +
        ", quarter=" + quarter +
        ", month=" + month +
        ", balanceAmount=" + balanceAmount +
        ", createTime=" + createTime +
        ", confirmationName=" + confirmationName +
        ", filePath=" + filePath +
        ", remark=" + remark +
        ", balancedAmount=" + balancedAmount +
        ", notBalancedAmount=" + notBalancedAmount +
        ", balanceStatus=" + balanceStatus +
        ", latestBalanceTime=" + latestBalanceTime +
        ", branchId=" + branchId +
        ", branchFullName=" + branchFullName +
        ", createUserId=" + createUserId +
        ", invoiceApplyUserId=" + invoiceApplyUserId +
        ", invoiceApplyStatus=" + invoiceApplyStatus +
        ", invoiceApplyTime=" + invoiceApplyTime +
        ", invoiceUserId=" + invoiceUserId +
        ", invoiceTime=" + invoiceTime +
        ", invoiceRemark=" + invoiceRemark +
        ", syncMoney=" + syncMoney +
        ", financeCheckMoney=" + financeCheckMoney +
        ", invoiceStatus=" + invoiceStatus +
        "}";
    }
}
