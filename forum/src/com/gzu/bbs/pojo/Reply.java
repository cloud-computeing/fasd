package com.gzu.bbs.pojo;

import java.util.Date;

public class Reply {
    private Integer id;

    private Integer postid;

    private String replyerid;

    private String replyername;

    private Date replytime;

    private String replytoobjectid;

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

    public String getReplyerid() {
        return replyerid;
    }

    public void setReplyerid(String replyerid) {
        this.replyerid = replyerid == null ? null : replyerid.trim();
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

    public String getReplytoobjectid() {
        return replytoobjectid;
    }

    public void setReplytoobjectid(String replytoobjectid) {
        this.replytoobjectid = replytoobjectid == null ? null : replytoobjectid.trim();
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent == null ? null : replycontent.trim();
    }
}