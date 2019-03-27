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
public class DatabaseInfo extends Model<DatabaseInfo> {

    private static final long serialVersionUID = 1L;

    private String dbName;
    private Date creationDate;


    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
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
        return "DatabaseInfo{" +
        ", dbName=" + dbName +
        ", creationDate=" + creationDate +
        "}";
    }
}
