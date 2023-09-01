package com.mat.zip.board.model;

import java.util.Date;

public class PhotoVO {
	private int photo_id;
	private String user_id;
	private String photo_cg;
	private String category;
	private String photo_title;
	private String photo_content;
	private String photo_file;
	private Date created_date;
	private Date updated_date;
	private int photo_view_count;
	
	public int getPhoto_id() {
		return photo_id;
	}
	public void setPhoto_id(int photo_id) {
		this.photo_id = photo_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPhoto_cg() {
		return photo_cg;
	}
	public void setPhoto_cg(String photo_cg) {
		this.photo_cg = photo_cg;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPhoto_title() {
		return photo_title;
	}
	public void setPhoto_title(String photo_title) {
		this.photo_title = photo_title;
	}
	public String getPhoto_content() {
		return photo_content;
	}
	public void setPhoto_content(String photo_content) {
		this.photo_content = photo_content;
	}
	public String getPhoto_file() {
		return photo_file;
	}
	public void setPhoto_file(String photo_file) {
		this.photo_file = photo_file;
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
	public int getPhoto_view_count() {
		return photo_view_count;
	}
	public void setPhoto_view_count(int photo_view_count) {
		this.photo_view_count = photo_view_count;
	}
	
	@Override
	public String toString() {
		return "PhotoVO [photo_id=" + photo_id + ", user_id=" + user_id + ", photo_cg=" + photo_cg + ", category="
				+ category + ", photo_title=" + photo_title + ", photo_content=" + photo_content + ", photo_file="
				+ photo_file + ", created_date=" + created_date + ", updated_date=" + updated_date
				+ ", photo_view_count=" + photo_view_count + "]";
	}
	
}
