package com.gzu.bbs.pojo;

import java.util.Date;

public class Reply {
    private Integer id;

    private Integer postid;

    private Integer replyerid;

    private String replyername;

    private Date replytime;

    private Integer replytoobjectid;

    private String replycontent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getReplyerid() {
        return replyerid;
    }

    public void setReplyerid(Integer replyerid) {
        this.replyerid = replyerid;
    }

    public String getReplyername() {
        return replyername;
    }

    public void setReplyername(String replyername) {
        this.replyername = replyername == null ? null : replyername.trim();
    }

    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }

    public Integer getReplytoobjectid() {
        return replytoobjectid;
    }

    public void setReplytoobjectid(Integer replytoobjectid) {
        this.replytoobjectid = replytoobjectid;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent == null ? null : replycontent.trim();
    }
}