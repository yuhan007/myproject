package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户账单生成记录表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class UserBillCalculaterecord extends Model<UserBillCalculaterecord> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String serialId;
    /**
     * 计算时间
     */
    private Date calculateTime;
    /**
     * 计算状态（0：失败，1：全部成功，2：部分成功）
     */
    private Double status;
    /**
     * 计算成功的用户数
     */
    private Double successCount;
    /**
     * 计算失败的用户数
     */
    private Double failCount;
    /**
     * 备注
     */
    private String remark;


    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public Date getCalculateTime() {
        return calculateTime;
    }

    public void setCalculateTime(Date calculateTime) {
        this.calculateTime = calculateTime;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    public Double getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Double successCount) {
        this.successCount = successCount;
    }

    public Double getFailCount() {
        return failCount;
    }

    public void setFailCount(Double failCount) {
        this.failCount = failCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Serializable pkVal() {
        return this.serialId;
    }

    @Override
    public String toString() {
        return "UserBillCalculaterecord{" +
        ", serialId=" + serialId +
        ", calculateTime=" + calculateTime +
        ", status=" + status +
        ", successCount=" + successCount +
        ", failCount=" + failCount +
        ", remark=" + remark +
        "}";
    }
}
