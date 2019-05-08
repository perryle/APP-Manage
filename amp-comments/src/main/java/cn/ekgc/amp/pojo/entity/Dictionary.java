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
	private Long dictionaryId;				//字典主键
	private Dictionary parent;				//上一级字典
	private String dictionaryName;				//字典名称
	private Admin createAdmin;				//创建人
	private Date createDate;					//创建时间
	private Admin updateAdmin;				//修改人
	private Date updateDate;					//修改时间
	public Long getDictionaryId() {
		return dictionaryId;
	}
	public void setDictionaryId(Long dictionaryId) {
		this.dictionaryId = dictionaryId;
	}
	public Dictionary getParent() {
		return parent;
	}
	public void setParent(Dictionary parent) {
		this.parent = parent;
	}
	public String getDictionaryName() {
		return dictionaryName;
	}
	public void setDictionaryName(String dictionaryName) {
		this.dictionaryName = dictionaryName;
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
