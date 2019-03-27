package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class AlertError extends Model<AlertError> {

    private static final long serialVersionUID = 1L;

    private Double autoid;
    private String dbName;
    private String errType;
    private String errCode;
    private String errContent;
    private Date creationDate;


    public Double getAutoid() {
        return autoid;
    }

    public void setAutoid(Double autoid) {
        this.autoid = autoid;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getErrType() {
        return errType;
    }

    public void setErrType(String errType) {
        this.errType = errType;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrContent() {
        return errContent;
    }

    public void setErrContent(String errContent) {
        this.errContent = errContent;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "AlertError{" +
        ", autoid=" + autoid +
        ", dbName=" + dbName +
        ", errType=" + errType +
        ", errCode=" + errCode +
        ", errContent=" + errContent +
        ", creationDate=" + creationDate +
        "}";
    }
}
