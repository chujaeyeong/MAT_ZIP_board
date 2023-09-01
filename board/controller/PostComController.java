package com.mat.zip.board.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mat.zip.board.dao.PostComDAO;
import com.mat.zip.board.dao.PostDAO;
import com.mat.zip.board.model.PostComVO;

@Controller
public class PostComController {

	@Autowired
	PostComDAO dao;
	
	@Autowired
	PostDAO dao2;
	
	// 자유게시판 댓글 등록 insert
	@RequestMapping("/board/createPostCom")
	@ResponseBody
	public void insert(PostComVO vo) {
		System.out.println("creatPostCom 요청됨.");
		System.out.println(vo);
		dao.insert(vo);
	}

	// 자유게시판 댓글 삭제 delete (Ajax request)
	@RequestMapping(value = "/board/deletePostCom", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Void> deletePostCom(@RequestParam int post_com_id, HttpServletRequest request) {
	    HttpSession session = request.getSession();
	    String user_id = (String) session.getAttribute("user_id");

	    PostComVO vo = new PostComVO();
	    vo.setPost_com_id(post_com_id);
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

	// 자유게시판 댓글 list (post_id 별)
	@RequestMapping(value = "/board/postComList", method = RequestMethod.GET) // ajax
	@ResponseBody
	public ResponseEntity<List<PostComVO>> postComList(@RequestParam int post_id) {
	  List<PostComVO> list = dao.postComList(post_id);
	  return new ResponseEntity<List<PostComVO>>(list, HttpStatus.OK);
	}
}
