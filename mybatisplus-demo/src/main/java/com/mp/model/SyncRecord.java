package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 同步记录表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class SyncRecord extends Model<SyncRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * 同步编号
     */
    private String sycnId;
    /**
     * 凭证编号
     */
    private String voucherId;
    /**
     * 单据类型
     */
    private String danjuType;
    /**
     * 账簿
     */
    private String accountBook;
    /**
     * 核算组织编号
     */
    private String accountsOrgnId;
    /**
     * 对账周期
     */
    private String billCycle;
    /**
     * 凭证字
     */
    private String voucherWord;
    /**
     * 凭证号
     */
    private String voucherNumber;
    /**
     * 同步时间
     */
    private Date syncTime;
    /**
     * 日期(月末最后一天)
     */
    private Date fDate;
    /**
     * 财务审核状态 -1：审核前不通过，0未审核，1.已审核，-2审核后不通过
     */
    private Double financeCheckStatus;
    /**
     * 财务审核时间
     */
    private Date financeCheckTime;
    /**
     * 同步操作人id
     */
    private String syncUserId;
    /**
     * 同步类型
     */
    private String syncType;
    /**
     * 备注
     */
    private String remark;
    /**
     * 同步状态-2取消同步.-1待同步.0未同步.1.已同步.-3同步失败
     */
    private Double syncStatus;
    /**
     * 同步失败记录原因
     */
    private String syncMessage;
    /**
     * 项目编号
     */
    private String projectIds;
    /**
     * 收款记录的唯一id,同步收款凭证的时候录入
     */
    private String billBalanceRecordId;


    public String getSycnId() {
        return sycnId;
    }

    public void setSycnId(String sycnId) {
        this.sycnId = sycnId;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public String getDanjuType() {
        return danjuType;
    }

    public void setDanjuType(String danjuType) {
        this.danjuType = danjuType;
    }

    public String getAccountBook() {
        return accountBook;
    }

    public void setAccountBook(String accountBook) {
        this.accountBook = accountBook;
    }

    public String getAccountsOrgnId() {
        return accountsOrgnId;
    }

    public void setAccountsOrgnId(String accountsOrgnId) {
        this.accountsOrgnId = accountsOrgnId;
    }

    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public String getVoucherWord() {
        return voucherWord;
    }

    public void setVoucherWord(String voucherWord) {
        this.voucherWord = voucherWord;
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    public Date getfDate() {
        return fDate;
    }

    public void setfDate(Date fDate) {
        this.fDate = fDate;
    }

    public Double getFinanceCheckStatus() {
        return financeCheckStatus;
    }

    public void setFinanceCheckStatus(Double financeCheckStatus) {
        this.financeCheckStatus = financeCheckStatus;
    }

    public Date getFinanceCheckTime() {
        return financeCheckTime;
    }

    public void setFinanceCheckTime(Date financeCheckTime) {
        this.financeCheckTime = financeCheckTime;
    }

    public String getSyncUserId() {
        return syncUserId;
    }

    public void setSyncUserId(String syncUserId) {
        this.syncUserId = syncUserId;
    }

    public String getSyncType() {
        return syncType;
    }

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(Double syncStatus) {
        this.syncStatus = syncStatus;
    }

    public String getSyncMessage() {
        return syncMessage;
    }

    public void setSyncMessage(String syncMessage) {
        this.syncMessage = syncMessage;
    }

    public String getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(String projectIds) {
        this.projectIds = projectIds;
    }

    public String getBillBalanceRecordId() {
        return billBalanceRecordId;
    }

    public void setBillBalanceRecordId(String billBalanceRecordId) {
        this.billBalanceRecordId = billBalanceRecordId;
    }

    @Override
    protected Serializable pkVal() {
        return this.sycnId;
    }

    @Override
    public String toString() {
        return "SyncRecord{" +
        ", sycnId=" + sycnId +
        ", voucherId=" + voucherId +
        ", danjuType=" + danjuType +
        ", accountBook=" + accountBook +
        ", accountsOrgnId=" + accountsOrgnId +
        ", billCycle=" + billCycle +
        ", voucherWord=" + voucherWord +
        ", voucherNumber=" + voucherNumber +
        ", syncTime=" + syncTime +
        ", fDate=" + fDate +
        ", financeCheckStatus=" + financeCheckStatus +
        ", financeCheckTime=" + financeCheckTime +
        ", syncUserId=" + syncUserId +
        ", syncType=" + syncType +
        ", remark=" + remark +
        ", syncStatus=" + syncStatus +
        ", syncMessage=" + syncMessage +
        ", projectIds=" + projectIds +
        ", billBalanceRecordId=" + billBalanceRecordId +
        "}";
    }
}
