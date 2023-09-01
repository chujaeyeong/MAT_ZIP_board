package com.mat.zip.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mat.zip.board.model.ReviewComVO;

@Component
public class ReviewComDAO {
	
	@Autowired
	SqlSessionTemplate my;

	// 리뷰게시판 댓글 등록 insert
	public int insert(ReviewComVO vo) {
		int result = my.insert("reviewComVO.createReviewCom", vo);
		return result;
	}
	
	// 자유게시판 댓글 삭제 delete
	public int delete(ReviewComVO vo) {
		int result = my.delete("reviewComVO.deleteReviewCom", vo);
		return result;
	}

	// 자유게시판 댓글 list (review_id)
	public List<ReviewComVO> reviewComList(int review_id) {
		List<ReviewComVO> list = my.selectList("reviewComVO.reviewComList", review_id);
		System.out.println(list.size());
		return list;
	}

}
