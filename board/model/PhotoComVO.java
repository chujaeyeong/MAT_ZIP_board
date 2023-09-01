package com.mat.zip.board.model;

import java.util.Date;

public class PhotoComVO {
	
	private int photo_com_id;
	private int photo_id;
	private String user_id;
	private String photo_comment;
	private Date created_date;
	private Date updated_date;
	
	public int getPhoto_com_id() {
		return photo_com_id;
	}
	public void setPhoto_com_id(int photo_com_id) {
		this.photo_com_id = photo_com_id;
	}
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
	public String getPhoto_comment() {
		return photo_comment;
	}
	public void setPhoto_comment(String photo_comment) {
		this.photo_comment = photo_comment;
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
		return "PhotoComVO [photo_com_id=" + photo_com_id + ", photo_id=" + photo_id + ", user_id=" + user_id
				+ ", photo_comment=" + photo_comment + ", created_date=" + created_date + ", updated_date="
				+ updated_date + "]";
	}
	
}
