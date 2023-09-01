package com.mat.zip.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mat.zip.board.dao.ReviewComDAO;
import com.mat.zip.board.dao.ReviewDAO;
import com.mat.zip.board.model.ReviewComVO;

@Controller
public class ReviewComController {
	
	@Autowired
	ReviewComDAO dao;
	
	@Autowired
	ReviewDAO dao2;
	
	// 리뷰게시판 댓글 등록 insert
	@RequestMapping(value = "/board/createReviewCom", method = RequestMethod.POST)
	@ResponseBody
	public void insert(ReviewComVO vo) {
		System.out.println("creatReviewCom 요청됨.");
		System.out.println(vo);
		dao.insert(vo);
	}

	// 리뷰게시판 댓글 삭제 delete (Ajax request)
	@RequestMapping(value = "/board/deleteReviewCom", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Void> deleteReviewCom(@RequestParam int review_com_id, HttpServletRequest request) {
	    HttpSession session = request.getSession();
	    String user_id = (String) session.getAttribute("user_id");

	    ReviewComVO vo = new ReviewComVO();
	    vo.setReview_com_id(review_com_id);
	    vo.setUser_id(user_id);

	    int result = dao.delete(vo);

	    if (result == 1) {
	        // 삭제 성공
	        return new ResponseEntity<Void>(HttpStatus.OK);
	    } else {
	        // 삭제 실패
	        return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	    }
	}

	// 리뷰게시판 댓글 list (review_id 별)
	@RequestMapping(value = "/board/reviewComList", method = RequestMethod.GET) // ajax
	@ResponseBody
	public ResponseEntity<List<ReviewComVO>> reviewComList(@RequestParam int review_id) {
	  List<ReviewComVO> list = dao.reviewComList(review_id);
	  return new ResponseEntity<List<ReviewComVO>>(list, HttpStatus.OK);
	}

}
