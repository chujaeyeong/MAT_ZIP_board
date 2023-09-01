package com.mat.zip.board.dao.implementations;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mat.zip.board.dao.ReviewDAO;
import com.mat.zip.board.model.EmojiMapVO;
import com.mat.zip.board.model.MZRegisterReceiptDTO;
import com.mat.zip.board.model.ReviewVO;
import com.mat.zip.registerAndSearch.model.MZRegisterInfoVO;

@Repository
public class ReviewDAOImpl implements ReviewDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	
	@Override
	public int insertReview(ReviewVO vo) {
		return sqlSession.insert("com.mat.zip.mapper.ReviewMapper.insertReview", vo);
	}

	@Override
	public List<MZRegisterReceiptDTO> getReceiptWithRestaurant(String user_id) {
	    return sqlSession.selectList("com.mat.zip.mapper.ReviewMapper.getReceiptWithRestaurant", user_id);
	}

	@Override
	public ReviewVO oneReviewId(int review_id) {
		return sqlSession.selectOne("com.mat.zip.mapper.ReviewMapper.oneReviewId", review_id);
	}

	@Override
	public int delete(int review_id) {
		return sqlSession.delete("com.mat.zip.mapper.ReviewMapper.delete", review_id);
	}

	@Override
	public int update(ReviewVO vo) {
		return sqlSession.update("com.mat.zip.mapper.ReviewMapper.update", vo);
	}

	@Override
	public void incrementReviewViewCount(int review_id) {
		sqlSession.update("com.mat.zip.mapper.ReviewMapper.incrementReviewViewCount", review_id);
	}

	@Override
	public List<ReviewVO> allReview() {
		return sqlSession.selectList("com.mat.zip.mapper.ReviewMapper.allReview");
	}
	
	@Override
	public List<EmojiMapVO> findAllEmojis() {
		return sqlSession.selectList("com.mat.zip.mapper.ReviewMapper.findAllEmojis");
	}
	
	@Override
	public List<ReviewVO> searchReview(String searchTerm) {
	    return sqlSession.selectList("com.mat.zip.mapper.ReviewMapper.searchReview", searchTerm);
	}
	
}
