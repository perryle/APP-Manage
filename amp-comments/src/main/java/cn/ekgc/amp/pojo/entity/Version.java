package cn.ekgc.amp.pojo.entity;

import java.io.Serializable;
/**
 * 版本信息类
 * @author Perryle
 * @since 2019-05-08
 */
import java.util.Date;
public class Version implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer versionId;
	private App app;
	private String apkName;
	private String supportRom;
	private String softwareSize;
	private String downliadLink;
	private Integer statusId;
	private Integer checker;
	private Date createDate;
	private Date updatedaDate;
	public Integer getVersionId() {
		return versionId;
	}
	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}
	public App getApp() {
		return app;
	}
	public void setApp(App app) {
		this.app = app;
	}
	public String getApkName() {
		return apkName;
	}
	public void setApkName(String apkName) {
		this.apkName = apkName;
	}
	public String getSupportRom() {
		return supportRom;
	}
	public void setSupportRom(String supportRom) {
		this.supportRom = supportRom;
	}
	public String getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(String softwareSize) {
		this.softwareSize = softwareSize;
	}
	public String getDownliadLink() {
		return downliadLink;
	}
	public void setDownliadLink(String downliadLink) {
		this.downliadLink = downliadLink;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
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
