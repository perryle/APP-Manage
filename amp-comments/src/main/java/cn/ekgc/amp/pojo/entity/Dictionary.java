package cn.ekgc.amp.pojo.entity;

import java.io.Serializable;
/**
 * 字典信息类
 * @author Perryle
 * @since 2019-05-08
 */
import java.util.Date;
public class Dictionary implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer dictionaryId;
	private Dictionary parentId;
	private String dictionaryName;
	private Integer createAdmin;
	private Date createDate;
	private Integer updateAdmin;
	private Date updateDate;
	public Integer getDictionaryId() {
		return dictionaryId;
	}
	public void setDictionaryId(Integer dictionaryId) {
		this.dictionaryId = dictionaryId;
	}
	public Dictionary getParentId() {
		return parentId;
	}
	public void setParentId(Dictionary parentId) {
		this.parentId = parentId;
	}
	public String getDictionaryName() {
		return dictionaryName;
	}
	public void setDictionaryName(String dictionaryName) {
		this.dictionaryName = dictionaryName;
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
