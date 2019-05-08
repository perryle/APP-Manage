package cn.ekgc.amp.pojo.entity;

import java.io.Serializable;
/**
 * app类
 * @author Perryle
 * @since 2019-05-08
 */
import java.util.Date;
public class App implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long appId;						//app主键
	private String appName;						//app名称
	private Developer developer;				//开发者
	private Category category;					//类型
	private String logo;						//logo地址
	private String appInfo;						//app简介
	private Dictionary platform;					//所属平台
	private Dictionary examine;					//审核状态
	private Dictionary status;						
	private Admin checker;					//审核人员
	private Date createDate;					//创建时间
	private Date updatedaDate;					//修改时间
	public Long getAppId() {
		return appId;
	}
	public void setAppId(Long appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public Developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public Dictionary getPlatform() {
		return platform;
	}
	public void setPlatform(Dictionary platform) {
		this.platform = platform;
	}
	public Dictionary getExamine() {
		return examine;
	}
	public void setExamine(Dictionary examine) {
		this.examine = examine;
	}
	public Dictionary getStatus() {
		return status;
	}
	public void setStatus(Dictionary status) {
		this.status = status;
	}
	public Admin getChecker() {
		return checker;
	}
	public void setChecker(Admin checker) {
		this.checker = checker;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdatedaDate() {
		return updatedaDate;
	}
	public void setUpdatedaDate(Date updatedaDate) {
		this.updatedaDate = updatedaDate;
	}
	
}
