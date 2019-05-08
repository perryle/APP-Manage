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
	private Long categoryId;					//类型主键
	private String categoryCode;				//类型编号
	private String categoryName;				//类型名称
	private Admin createAdmin;					//创建人员
	private Date createDate;					//创建时间
	private Admin updateAdmin;					//修改人员
	private Date updateDate;					//修改时间
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
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
	public Admin getCreateAdmin() {
		return createAdmin;
	}
	public void setCreateAdmin(Admin createAdmin) {
		this.createAdmin = createAdmin;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Admin getUpdateAdmin() {
		return updateAdmin;
	}
	public void setUpdateAdmin(Admin updateAdmin) {
		this.updateAdmin = updateAdmin;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
