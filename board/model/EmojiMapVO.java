package com.mat.zip.board.model;

public class EmojiMapVO {
	
	private int id;
	private String keyword;
	private String emoji;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getEmoji() {
		return emoji;
	}
	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}
	
	@Override
	public String toString() {
		return "EmojiMapVO [id=" + id + ", keyword=" + keyword + ", emoji=" + emoji + "]";
	}
	
}
