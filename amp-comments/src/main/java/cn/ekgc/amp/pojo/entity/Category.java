package cn.ekgc.amp.pojo.entity;

import java.io.Serializable;
/**
 * 类别类
 * @author Administrator
 * @since 2019-05-08
 */
import java.util.Date;
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer categoryId;
	private String categoryCode;
	private String categoryName;
	private String createAdmin;
	private Date createDate;
	private String updateAdmin;
	private Date updateDate;
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCreateAdmin() {
		return createAdmin;
	}
	public void setCreateAdmin(String createAdmin) {
		this.createAdmin = createAdmin;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUpdateAdmin() {
		return updateAdmin;
	}
	public void setUpdateAdmin(String updateAdmin) {
		this.updateAdmin = updateAdmin;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
}
