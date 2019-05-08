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
	private Integer appId;
	private String appName;
	private Developer developer;
	private Version category;
	private String appInfo;
	private Integer flatform;
	private Integer statusId;
	private Integer saleId;
	private Integer checker;
	private Date createDate;
	private Date updatedaDate;
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
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
	public Version getCategory() {
		return category;
	}
	public void setCategory(Version category) {
		this.category = category;
	}
	public String getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public Integer getFlatform() {
		return flatform;
	}
	public void setFlatform(Integer flatform) {
		this.flatform = flatform;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public Integer getSaleId() {
		return saleId;
	}
	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}
	public Integer getChecker() {
		return checker;
	}
	public void setChecker(Integer checker) {
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
