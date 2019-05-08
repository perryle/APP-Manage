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
	private Long versionId;				//版本主键
	private App app;						//appId
	private String apkName;					//apk名称
	private String supportRom;				//支持硬件
	private Double softwareSize;			//软件大小
	private String downloadLink;			//下载链接
	private Dictionary examine;				//审核状态
	private Dictionary status;				//app状态
	private Admin checker;				//审核者
	private Date createDate;				//添加时间
	private Date updateDate;				//修改时间
	public Long getVersionId() {
		return versionId;
	}
	public void setVersionId(Long versionId) {
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
	public Double getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(Double softwareSize) {
		this.softwareSize = softwareSize;
	}
	public String getDownloadLink() {
		return downloadLink;
	}
	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
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
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
