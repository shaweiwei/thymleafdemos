package com.wymessi.po;

import java.util.Date;

/**
 * 领域标签持久类
 * 
 * @author 王冶
 *
 */
public class Field {

	private long id;
	private String fieldName; // 领域名
	private long createUserId; // 创建人id
	private String createUserName; //因layui的限制所创建，用于显示layui表格的限制
	private Date createTime; // 创建时间
	private Date lastUpdateTime; // 创建时间
	
	private SysUser user; // 项目申请者持久类

	public SysUser getUser() {
		return user;
	}

	public void setUser(SysUser user) {
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(long createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	@Override
	public int hashCode() {
		return this.fieldName.hashCode()*18;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {  
            return false;  
        }  
        if (obj == this) {  
            return true;  
        }  
        if (!(obj instanceof Field)) {  
            return false;  
        }  
        Field f = (Field) obj;  
        if (this.fieldName.equals(f.getFieldName())) {  
            return true;  
        }  
        return false;  
	}
	
	
}
