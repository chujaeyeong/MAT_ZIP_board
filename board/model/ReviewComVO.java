package com.mat.zip.board.model;

import java.util.Date;

public class ReviewComVO {
	private int review_com_id;
	private int review_id;
	private String user_id;
	private String review_comment;
	private Date created_date;
	private Date updated_date;
	
	public int getReview_com_id() {
		return review_com_id;
	}
	public void setReview_com_id(int review_com_id) {
		this.review_com_id = review_com_id;
	}
	public int getReview_id() {
		return review_id;
	}
	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getReview_comment() {
		return review_comment;
	}
	public void setReview_comment(String review_comment) {
		this.review_comment = review_comment;
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
		return "ReviewComVO [review_com_id=" + review_com_id + ", review_id=" + review_id + ", user_id=" + user_id
				+ ", review_comment=" + review_comment + ", created_date=" + created_date + ", updated_date="
				+ updated_date + "]";
	}

}
