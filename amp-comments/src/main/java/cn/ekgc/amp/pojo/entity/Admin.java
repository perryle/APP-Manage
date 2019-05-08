package cn.ekgc.amp.pojo.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 后台管理员类
 * @author Perryle
 * @since 2019-05-08
 */
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer adminId;
	private String adminNo;
	private String adminName;
	private String password;
	private Integer roleId;
	private Integer createAdmin;
	private Date createDate;
	private Integer updateAdmin;
	private Date updateDate;
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAdminNo() {
		return adminNo;
	}
	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getCreateAdmin() {
		return createAdmin;
	}
	public void setCreateAdmin(Integer createAdmin) {
		this.createAdmin = createAdmin;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getUpdateAdmin() {
		return updateAdmin;
	}
	public void setUpdateAdmin(Integer updateAdmin) {
		this.updateAdmin = updateAdmin;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
