package com.gzu.bbs.pojo;

import java.util.Date;

public class Post {
    private Integer postid;

    private String posttitle;

    private String userid;

    private String username;

    private Integer clickamount;

    private Integer goodamount;

    private Integer replyamount;

    private Date latestreplytime;

    private String pictureid;

    private Integer topflag;

    private Integer plateid;

    private String content;
    
    private Date posttime;

    public Date getPosttime() {
		return posttime;
	}

	public void setPosttime(Date posttime) {
		this.posttime = posttime;
	}

	public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPosttitle() {
        return posttitle;
    }

    public void setPosttitle(String posttitle) {
        this.posttitle = posttitle == null ? null : posttitle.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getClickamount() {
        return clickamount;
    }

    public void setClickamount(Integer clickamount) {
        this.clickamount = clickamount;
    }

    public Integer getGoodamount() {
        return goodamount;
    }

    public void setGoodamount(Integer goodamount) {
        this.goodamount = goodamount;
    }

    public Integer getReplyamount() {
        return replyamount;
    }

    public void setReplyamount(Integer replyamount) {
        this.replyamount = replyamount;
    }

    public Date getLatestreplytime() {
        return latestreplytime;
    }

    public void setLatestreplytime(Date latestreplytime) {
        this.latestreplytime = latestreplytime;
    }

    public String getPictureid() {
        return pictureid;
    }

    public void setPictureid(String pictureid) {
        this.pictureid = pictureid == null ? null : pictureid.trim();
    }

    public Integer getTopflag() {
        return topflag;
    }

    public void setTopflag(Integer topflag) {
        this.topflag = topflag;
    }

    public Integer getPlateid() {
        return plateid;
    }

    public void setPlateid(Integer plateid) {
        this.plateid = plateid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}