package com.mp.model;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 凭证科目明细表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class VoucherSubjectDetail extends Model<VoucherSubjectDetail> {

    private static final long serialVersionUID = 1L;

    /**
     * 科目明细编号
     */
    private String subjectDetailId;
    /**
     * 同步编号
     */
    private String syncId;
    /**
     * 摘要
     */
    private String summary;
    /**
     * 科目编码
     */
    private String subjectCode;
    /**
     * 借方金额
     */
    private Double fdebit;
    /**
     * 贷方金额
     */
    private Double fcredit;


    public String getSubjectDetailId() {
        return subjectDetailId;
    }

    public void setSubjectDetailId(String subjectDetailId) {
        this.subjectDetailId = subjectDetailId;
    }

    public String getSyncId() {
        return syncId;
    }

    public void setSyncId(String syncId) {
        this.syncId = syncId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public Double getFdebit() {
        return fdebit;
    }

    public void setFdebit(Double fdebit) {
        this.fdebit = fdebit;
    }

    public Double getFcredit() {
        return fcredit;
    }

    public void setFcredit(Double fcredit) {
        this.fcredit = fcredit;
    }

    @Override
    protected Serializable pkVal() {
        return this.subjectDetailId;
    }

    @Override
    public String toString() {
        return "VoucherSubjectDetail{" +
        ", subjectDetailId=" + subjectDetailId +
        ", syncId=" + syncId +
        ", summary=" + summary +
        ", subjectCode=" + subjectCode +
        ", fdebit=" + fdebit +
        ", fcredit=" + fcredit +
        "}";
    }
}
