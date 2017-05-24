package com.gzu.bbs.pojo;

public class PlatetypeVo {
	private Platetype platetype;
	public Platetype getPlatetype() {
		return platetype;
	}
	public void setPlatetype(Platetype platetype) {
		this.platetype = platetype;
	}
	public Integer getNowPage() {
		return nowPage;
	}
	public void setNowPage(Integer nowPage) {
		this.nowPage = nowPage;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	private Integer nowPage;
	private int size;
	private int start;
	private int count;
}
