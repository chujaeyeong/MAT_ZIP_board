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

import com.mat.zip.board.dao.PhotoComDAO;
import com.mat.zip.board.dao.PhotoDAO;
import com.mat.zip.board.model.PhotoComVO;

@Controller
public class PhotoComController {
	
	@Autowired
	PhotoComDAO dao;
	
	@Autowired
	PhotoDAO dao2;
	
	// 리뷰게시판 댓글 등록 insert
	@RequestMapping(value = "/board/createPhotoCom", method = RequestMethod.POST)
	@ResponseBody
	public void insert(PhotoComVO vo) {
		System.out.println("creatPhotoCom 요청됨.");
		System.out.println(vo);
		dao.insert(vo);
	}

	// 리뷰게시판 댓글 삭제 delete (Ajax request)
	@RequestMapping(value = "/board/deletePhotoCom", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Void> deletePhotoCom(@RequestParam int photo_com_id, HttpServletRequest request) {
	    HttpSession session = request.getSession();
	    String user_id = (String) session.getAttribute("user_id");

	    PhotoComVO vo = new PhotoComVO();
	    vo.setPhoto_com_id(photo_com_id);
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

	// 리뷰게시판 댓글 list (photo_id 별)
	@RequestMapping(value = "/board/photoComList", method = RequestMethod.GET) // ajax
	@ResponseBody
	public ResponseEntity<List<PhotoComVO>> photoComList(@RequestParam int photo_id) {
	  List<PhotoComVO> list = dao.photoComList(photo_id);
	  return new ResponseEntity<List<PhotoComVO>>(list, HttpStatus.OK);
	}

}
