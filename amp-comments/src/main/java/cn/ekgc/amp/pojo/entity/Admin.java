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
	private Long adminId;				//管理员主键
	private String adminNo;					//管理员编号
	private String adminName;				//管理员姓名
	private String password;				//登录密码
	private Role role;					//角色
	private Admin createAdmin;			//创建人员
	private Date createDate;				//创建时间
	private Admin updateAdmin;			//修改人员
	private Date updateDate;				//修改时间
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
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
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
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
