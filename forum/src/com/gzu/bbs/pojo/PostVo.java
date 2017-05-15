package com.gzu.bbs.pojo;

public class PostVo {
	private int begin;
	private int size;
	
	private int sum;
	private int pagecount;
	private Integer currentPage;
	
	private PostCustom postCustom;
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public int getBegin() {
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public PostCustom getPostCustom() {
		return postCustom;
	}
	public void setPostCustom(PostCustom postCustom) {
		this.postCustom = postCustom;
	}

	
}
