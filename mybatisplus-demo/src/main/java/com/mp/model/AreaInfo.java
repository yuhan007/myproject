package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 区域信息表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class AreaInfo extends Model<AreaInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 区域编码
     */
    private String areaCode;
    /**
     * 区域名称
     */
    private String areaName;
    /**
     * 上级区域编码
     */
    private String parentCode;
    /**
     * 区域等级
     */
    private String areaLevel;
    /**
     * 状态，'1'：启用，'0'：禁用
     */
    private String status;
    private String jindieAreaCode;
    private Double issync;
    /**
     * 同步时间
     */
    private Date syncTime;


    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(String areaLevel) {
        this.areaLevel = areaLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJindieAreaCode() {
        return jindieAreaCode;
    }

    public void setJindieAreaCode(String jindieAreaCode) {
        this.jindieAreaCode = jindieAreaCode;
    }

    public Double getIssync() {
        return issync;
    }

    public void setIssync(Double issync) {
        this.issync = issync;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "AreaInfo{" +
        ", areaCode=" + areaCode +
        ", areaName=" + areaName +
        ", parentCode=" + parentCode +
        ", areaLevel=" + areaLevel +
        ", status=" + status +
        ", jindieAreaCode=" + jindieAreaCode +
        ", issync=" + issync +
        ", syncTime=" + syncTime +
        "}";
    }
}
