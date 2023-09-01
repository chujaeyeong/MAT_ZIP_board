package com.mat.zip.board.model;

import java.util.Date;

public class PostVO {
	private int post_id;
	private String user_id;
	private String food_cg;
	private String category;
	private String post_title;
	private String post_content;
	private String post_file;
	private Date created_date;
	private Date updated_date;
	private int post_view_count;
	
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
	public String getFood_cg() {
		return food_cg;
	}
	public void setFood_cg(String food_cg) {
		this.food_cg = food_cg;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPost_title() {
		return post_title;
	}
	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}
	public String getPost_content() {
		return post_content;
	}
	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}
	public String getPost_file() {
		return post_file;
	}
	public void setPost_file(String post_file) {
		this.post_file = post_file;
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
	public int getPost_view_count() {
		return post_view_count;
	}
	public void setPost_view_count(int post_view_count) {
		this.post_view_count = post_view_count;
	}
	
	@Override
	public String toString() {
		return "PostVO [post_id=" + post_id + ", user_id=" + user_id + ", food_cg=" + food_cg + ", category=" + category
				+ ", post_title=" + post_title + ", post_content=" + post_content + ", post_file=" + post_file
				+ ", created_date=" + created_date + ", updated_date=" + updated_date + ", post_view_count="
				+ post_view_count + "]";
	}
}
