package cn.ekgc.amp.pojo.vo;

import java.io.Serializable;
/**
 * 分页类
 * @author Perryle
 * @since 2019-05-08
 * @param <E> 分页显示对象
 */
import java.util.List;

import cn.ekgc.amp.util.ConstantUtil;
public class Page<E> implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer pageNum;			//当前页码
	private Integer pageSize;			//显示数量
	private List<E> list;				//显示列表
	private Integer totalPage;			//总页数
	private Integer totalCount;			//查询总条数
	public Page() {}
	public Page(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		}else {
			this.pageNum = ConstantUtil.PAGE_NUM;
		}
		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		}else {
			this.pageSize = ConstantUtil.PAGE_SIZE;
		}
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public List<E> getList() {
		return list;
	}
	public void setList(List<E> list) {
		this.list = list;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	
}
