package com.mat.zip.board.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mat.zip.board.dao.PostComDAO;
import com.mat.zip.board.dao.PostDAO;
import com.mat.zip.board.model.PostComVO;
import com.mat.zip.board.model.PostVO;
import com.mat.zip.mzMember.model.MzMemberDTO;

@Controller
public class PostController {

	@Autowired
	PostDAO dao;

	@Autowired
	PostComDAO dao2;

	// 자유게시판 게시물 등록 insert
	@RequestMapping("/board/createPost")
	public void insert(PostVO vo, HttpServletRequest request, HttpSession session,
			@RequestParam(required = false) MultipartFile file, Model model) throws Exception {

		String user_id = (String) session.getAttribute("user_id");

		vo.setUser_id(user_id);

		String savedName = null;
		if (file != null && !file.isEmpty()) {
			savedName = file.getOriginalFilename();
			String uploadPath = request.getSession().getServletContext().getRealPath("resources/img");
			File target = new File(uploadPath, savedName);

			// 이미 파일이 존재하는 경우, 파일명에 시간을 붙여 고유하게 만듭니다.
			if (target.exists()) {
				savedName = System.currentTimeMillis() + "_" + savedName;
				target = new File(uploadPath, savedName);
			}
			file.transferTo(target);
			vo.setPost_file(savedName);
		}
		model.addAttribute("savedName", savedName);
		System.out.println("img 넣기 전 >> " + vo);
		System.out.println("img넣은 후 >> " + vo);

		dao.insert(vo);
	}

	// 자유게시판 게시물 수정 update 처리
	@PostMapping(value = "/board/updatePost")
	public String update(PostVO vo, HttpServletRequest request, @RequestParam(required = false) MultipartFile file,
			Model model) throws Exception {

		System.out.println("update요청됨.");

		String savedName = null;
		if (file != null && !file.isEmpty()) {
			savedName = file.getOriginalFilename();
			String uploadPath = request.getSession().getServletContext().getRealPath("resources/img");
			File target = new File(uploadPath, savedName);

			// 이미 파일이 존재하는 경우, 파일명에 시간을 붙여 고유하게 만듭니다.
			if (target.exists()) {
				savedName = System.currentTimeMillis() + "_" + savedName;
				target = new File(uploadPath, savedName);
			}
			file.transferTo(target);
			vo.setPost_file(savedName);
		}
		model.addAttribute("savedName", savedName);
		System.out.println("img 넣기 전 >> " + vo);
		System.out.println("img넣은 후 >> " + vo);

		System.out.println(vo);

		dao.update(vo);

		return "/board/updatePostSuccess"; // 수정 성공 후 리다이렉트 할 페이지 지정
	}

	// 자유게시판 게시물 수정 페이지로 이동
	@RequestMapping(value = "/board/updatePost", method = RequestMethod.GET)
	public void updatepage(int post_id, Model model) {
		System.out.println("update page로 이동 요청.");
		PostVO vo = dao.onePostId(post_id);
		model.addAttribute("vo", vo);
	}

	// 자유게시판 게시물 삭제 delete
	@RequestMapping("/board/deletePost")
	public void delete(PostVO vo) {
		System.out.println("delete 요청됨. ");
		System.out.println(vo);

		dao.delete(vo);
	}

	// 조건별 검색 : post_id로 검색하기
	@RequestMapping("/board/onePostId")
	public void onePostId(int post_id, Model model) {
		System.out.println("onePostId요청됨.");
		PostVO vo = dao.onePostId(post_id);

		List<PostComVO> list = dao2.postComList(post_id);

		model.addAttribute("vo", vo);
		model.addAttribute("list", list);
	}

	// 조회수 증가
	@RequestMapping("/board/increasePostViewCount")
	@ResponseBody
	public void increasePostViewCount(int post_id) {
		System.out.println("조회수 증가 전");
		dao.incrementPostViewCount(post_id);
		System.out.println("조회수 증가 완료");
	}

	// 자유게시판 전체 게시글 검색
	@RequestMapping("/board/allPost") // ajax
	public void allPost(Model model) {
		List<PostVO> list = dao.allPost();
		System.out.println(list.size()); // list size
		model.addAttribute("list", list);
	}
	
	// 리뷰게시물 제목으로 검색
	@ResponseBody
	@RequestMapping(value = "/board/searchPost", method = RequestMethod.GET)
	public ResponseEntity<List<PostVO>> searchPost(@RequestParam("searchTerm") String searchTerm) {
	    try {
	        List<PostVO> searchResults = dao.searchPost(searchTerm);
	        return new ResponseEntity<List<PostVO>>(searchResults, HttpStatus.OK);
	    } catch (Exception e) {
	        return new ResponseEntity<List<PostVO>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	

}
