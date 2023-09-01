package com.mat.zip.board.dao;

import java.util.List;

import com.mat.zip.board.model.EmojiMapVO;
import com.mat.zip.board.model.MZRegisterReceiptDTO;
import com.mat.zip.board.model.ReviewVO;
import com.mat.zip.registerAndSearch.model.MZRegisterInfoVO;

public interface ReviewDAO {

	public int insertReview(ReviewVO vo);

	List<MZRegisterReceiptDTO> getReceiptWithRestaurant(String user_id);

	public ReviewVO oneReviewId(int review_id);

	public int delete(int review_id);

	public int update(ReviewVO vo);

	public void incrementReviewViewCount(int review_id);

	public List<ReviewVO> allReview();
	
	public List<EmojiMapVO> findAllEmojis();
	
	public List<ReviewVO> searchReview(String searchTerm);

}
