package com.mat.zip.board.model;

import java.util.Date;

public class PostComVO {
	private int post_com_id;
	private int post_id;
	private String user_id;
	private String post_comment;
	private Date created_date;
	private Date updated_date;
	
	public int getPost_com_id() {
		return post_com_id;
	}
	public void setPost_com_id(int post_com_id) {
		this.post_com_id = post_com_id;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPost_comment() {
		return post_comment;
	}
	public void setPost_comment(String post_comment) {
		this.post_comment = post_comment;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
	
	@Override
	public String toString() {
		return "PostComVO [post_com_id=" + post_com_id + ", post_id=" + post_id + ", user_id=" + user_id
				+ ", post_comment=" + post_comment + ", created_date=" + created_date + ", updated_date=" + updated_date
				+ "]";
	}
}
