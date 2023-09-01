package com.mat.zip.board.service.implementations;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mat.zip.board.dao.ReviewDAO;
import com.mat.zip.board.model.EmojiMapVO;
import com.mat.zip.board.model.MZRegisterReceiptDTO;
import com.mat.zip.board.model.ReviewVO;
import com.mat.zip.board.service.ReviewService;
import com.mat.zip.registerAndSearch.model.MZRegisterInfoVO;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewDAO reviewDao;
	
	
	
	@Override
	public int insertReview(ReviewVO vo) {
		return reviewDao.insertReview(vo);
	}

	@Override
	public List<MZRegisterReceiptDTO> getReceiptWithRestaurant(String user_id) {
	    return reviewDao.getReceiptWithRestaurant(user_id);
	}

	@Override
	public ReviewVO oneReviewId(int review_id) {
		return reviewDao.oneReviewId(review_id);
	}

	@Override
	public int delete(int review_id) {
		return reviewDao.delete(review_id);
	}

	@Override
	public int update(ReviewVO vo) {
		return reviewDao.update(vo);
	}

	@Override
	public void incrementReviewViewCount(int review_id) {
		reviewDao.incrementReviewViewCount(review_id);
	}

	@Override
	public List<ReviewVO> allReview() {
		return reviewDao.allReview();
	}
	
	@Override
	public List<EmojiMapVO> findAllEmojis() {
	    return reviewDao.findAllEmojis();
	}
	
	@Override
    public List<String> findEmojisInReview(String review_content) {
        List<EmojiMapVO> emojiMap = reviewDao.findAllEmojis();
        List<String> emojis = new ArrayList<>();
        
        for (EmojiMapVO emoji : emojiMap) {
            if (review_content.contains(emoji.getKeyword())) {
                emojis.add(emoji.getEmoji());
            }
        }
        
        return emojis;
    }
	
	@Override
	public List<ReviewVO> searchReview(String searchTerm) {
	    return reviewDao.searchReview(searchTerm);
	}
	
	
}
