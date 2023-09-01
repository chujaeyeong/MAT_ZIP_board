package com.mat.zip.board.model;

import java.util.Date;

public class ReviewVO {
	private int review_id; // 리뷰게시글 id
	private String user_id; // 회원 id 
	private int receipt_id; // 영수증 id 
	private String store_id; // 상호명  
	private String store_cg; // 판매 음식 종류 
	private String category; // 회원 선호 음식 종류 
	private String review_title; // 리뷰게시글 제목 
	private String review_content; // 리뷰게시글 본문 
	private String review_file; // 리뷰게시글 이미지파일명 
	private int review_scope; // 리뷰 점수 
	private String emoticon; // 감정  
	private Date created_date; // 최초작성일자 
	private Date updated_date; // 최종 수정일자 
	private int review_view_count; // 조회수 
	
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
	public int getReceipt_id() {
		return receipt_id;
	}
	public void setReceipt_id(int receipt_id) {
		this.receipt_id = receipt_id;
	}
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getStore_cg() {
		return store_cg;
	}
	public void setStore_cg(String store_cg) {
		this.store_cg = store_cg;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getReview_title() {
		return review_title;
	}
	public void setReview_title(String review_title) {
		this.review_title = review_title;
	}
	public String getReview_content() {
		return review_content;
	}
	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}
	public String getReview_file() {
		return review_file;
	}
	public void setReview_file(String review_file) {
		this.review_file = review_file;
	}
	public int getReview_scope() {
		return review_scope;
	}
	public void setReview_scope(int review_scope) {
		this.review_scope = review_scope;
	}
	public String getEmoticon() {
		return emoticon;
	}
	public void setEmoticon(String emoticon) {
		this.emoticon = emoticon;
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
	public int getReview_view_count() {
		return review_view_count;
	}
	public void setReview_view_count(int review_view_count) {
		this.review_view_count = review_view_count;
	}
	
	@Override
	public String toString() {
		return "ReviewVO [review_id=" + review_id + ", user_id=" + user_id + ", receipt_id=" + receipt_id
				+ ", store_id=" + store_id + ", store_cg=" + store_cg + ", category=" + category + ", review_title="
				+ review_title + ", review_content=" + review_content + ", review_file=" + review_file
				+ ", review_scope=" + review_scope + ", emoticon=" + emoticon + ", created_date=" + created_date
				+ ", updated_date=" + updated_date + ", review_view_count=" + review_view_count + "]";
	}
	
}
