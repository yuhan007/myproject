package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 账单结算记录表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class BillBalanceRecord extends Model<BillBalanceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String serialId;
    /**
     * 结算单编号（确认函编号）
     */
    private String balanceId;
    /**
     * 结算金额
     */
    private Double balanceAmount;
    /**
     * 结算时间
     */
    private Date balanceTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 录入人ID，系统预设的值为0
     */
    private String insertUserId;
    /**
     * 录入时间
     */
    private Date insertTime;
    /**
     * 收款账户编号
     */
    private String bankAccountId;
    /**
     * 财务审核时间
     */
    private Date financeCheckTime;
    /**
     * 财务审核状态
     */
    private Double financeCheckStatus;
    /**
     * 财务审核人
     */
    private String financeCheckUserId;
    /**
     * 同步时间
     */
    private Date synchronizationTime;
    /**
     * 同步状态
     */
    private Double synchronizationStatus;
    /**
     * 同步人
     */
    private String synchronizationUserId;
    /**
     * 入账审核时间
     */
    private Date admissionCheckTime;
    /**
     * 入账审核状态-1不通过，0待通过，1通过
     */
    private Double admissionCheckStatus;
    /**
     * 入账审核人
     */
    private String admissionCheckUserId;
    /**
     * 入账审核备注
     */
    private String admissionCheckRemark;
    /**
     * 入账备注
     */
    private String insertRemark;


    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
    }

    public Double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public Date getBalanceTime() {
        return balanceTime;
    }

    public void setBalanceTime(Date balanceTime) {
        this.balanceTime = balanceTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getInsertUserId() {
        return insertUserId;
    }

    public void setInsertUserId(String insertUserId) {
        this.insertUserId = insertUserId;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public Date getFinanceCheckTime() {
        return financeCheckTime;
    }

    public void setFinanceCheckTime(Date financeCheckTime) {
        this.financeCheckTime = financeCheckTime;
    }

    public Double getFinanceCheckStatus() {
        return financeCheckStatus;
    }

    public void setFinanceCheckStatus(Double financeCheckStatus) {
        this.financeCheckStatus = financeCheckStatus;
    }

    public String getFinanceCheckUserId() {
        return financeCheckUserId;
    }

    public void setFinanceCheckUserId(String financeCheckUserId) {
        this.financeCheckUserId = financeCheckUserId;
    }

    public Date getSynchronizationTime() {
        return synchronizationTime;
    }

    public void setSynchronizationTime(Date synchronizationTime) {
        this.synchronizationTime = synchronizationTime;
    }

    public Double getSynchronizationStatus() {
        return synchronizationStatus;
    }

    public void setSynchronizationStatus(Double synchronizationStatus) {
        this.synchronizationStatus = synchronizationStatus;
    }

    public String getSynchronizationUserId() {
        return synchronizationUserId;
    }

    public void setSynchronizationUserId(String synchronizationUserId) {
        this.synchronizationUserId = synchronizationUserId;
    }

    public Date getAdmissionCheckTime() {
        return admissionCheckTime;
    }

    public void setAdmissionCheckTime(Date admissionCheckTime) {
        this.admissionCheckTime = admissionCheckTime;
    }

    public Double getAdmissionCheckStatus() {
        return admissionCheckStatus;
    }

    public void setAdmissionCheckStatus(Double admissionCheckStatus) {
        this.admissionCheckStatus = admissionCheckStatus;
    }

    public String getAdmissionCheckUserId() {
        return admissionCheckUserId;
    }

    public void setAdmissionCheckUserId(String admissionCheckUserId) {
        this.admissionCheckUserId = admissionCheckUserId;
    }

    public String getAdmissionCheckRemark() {
        return admissionCheckRemark;
    }

    public void setAdmissionCheckRemark(String admissionCheckRemark) {
        this.admissionCheckRemark = admissionCheckRemark;
    }

    public String getInsertRemark() {
        return insertRemark;
    }

    public void setInsertRemark(String insertRemark) {
        this.insertRemark = insertRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.serialId;
    }

    @Override
    public String toString() {
        return "BillBalanceRecord{" +
        ", serialId=" + serialId +
        ", balanceId=" + balanceId +
        ", balanceAmount=" + balanceAmount +
        ", balanceTime=" + balanceTime +
        ", remark=" + remark +
        ", insertUserId=" + insertUserId +
        ", insertTime=" + insertTime +
        ", bankAccountId=" + bankAccountId +
        ", financeCheckTime=" + financeCheckTime +
        ", financeCheckStatus=" + financeCheckStatus +
        ", financeCheckUserId=" + financeCheckUserId +
        ", synchronizationTime=" + synchronizationTime +
        ", synchronizationStatus=" + synchronizationStatus +
        ", synchronizationUserId=" + synchronizationUserId +
        ", admissionCheckTime=" + admissionCheckTime +
        ", admissionCheckStatus=" + admissionCheckStatus +
        ", admissionCheckUserId=" + admissionCheckUserId +
        ", admissionCheckRemark=" + admissionCheckRemark +
        ", insertRemark=" + insertRemark +
        "}";
    }
}
