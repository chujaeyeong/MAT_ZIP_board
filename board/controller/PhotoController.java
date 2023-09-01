package com.mat.zip.board.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mat.zip.board.model.PhotoVO;
import com.mat.zip.board.service.PhotoService;

@Controller
@RequestMapping("/board/*")
public class PhotoController {

	private static Logger logger = LoggerFactory.getLogger(PhotoController.class);

	@Autowired
	private PhotoService photoService;

	// insertPhoto 실행
	@PostMapping("/insertPhoto")
	public String insertPhoto(PhotoVO vo, Model model, HttpServletRequest request, HttpSession session,
			@RequestParam(required = false) MultipartFile file) throws Exception {

		// 세션에서 user_id를 가져와 vo에 넣자
		String user_id = (String) session.getAttribute("user_id");
		vo.setUser_id(user_id);

		if (user_id == null) {
			// 사용자가 로그인하지 않은 경우 로그인 페이지로 리다이렉션합니다.
			return "redirect:/login";
		}

		System.out.println("이미지 파일 처리를 시작합니다... ");

		// 이미지 파일 저장 부분
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
			vo.setPhoto_file(savedName);
		}

		System.out.println("이미지 처리를 완료했습니다. ");

		model.addAttribute("savedName", savedName);
		System.out.println("img 넣기 전 >> " + vo);
		System.out.println("img넣은 후 >> " + vo);

		photoService.insertPhoto(vo);
		return "board/insertPhotoSuccess";
	}

	// 사진게시물 조회수 증가
	@RequestMapping("incrementPhotoViewCount")
	@ResponseBody
	public void incrementPhotoViewCount(@RequestParam("photo_id") int photo_id) {
		System.out.println("조회수 증가 전");
		photoService.incrementPhotoViewCount(photo_id);
		System.out.println("조회수 증가 완료");
	}

	// 사진게시물 전체 게시글 list
	@RequestMapping(value = "/allPhoto2", method = RequestMethod.GET)
	public String allPhoto(Model model) {

		logger.info("allPhoto...");
		model.addAttribute("photo", photoService.allPhoto());

		return "/board/allPhoto2";
	}

	// 게시물 상세 정보 조회 (onePhotoId) 페이지로 이동
	@RequestMapping(value = "/onePhotoId", method = RequestMethod.GET)
	public String onePhotoId(int photo_id, Model model) {

		logger.info("onePhotoId...");

		PhotoVO vo = photoService.onePhotoId(photo_id); // photo_id값을 넘김

		System.out.println(vo);
		model.addAttribute("data", vo);

		return "/board/onePhotoId";
	}

	// 수정 페이지로 이동
	@RequestMapping(value = "/updatePhoto", method = RequestMethod.GET)
	public String updateGet(@RequestParam("photo_id") int photo_id, Model model) {

		logger.info("updateGet...");
		model.addAttribute("data", photoService.onePhotoId(photo_id));

		return "/board/updatePhoto";
	}

	// 게시물 수정 처리
	@RequestMapping(value = "/updatePhoto", method = RequestMethod.POST)
	public String update(PhotoVO vo, RedirectAttributes redirectAttributes, 
						HttpServletRequest request, MultipartFile file, Model model) throws Exception {

		logger.info("update Photo...");

		// 이미지 파일 저장 부분
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
			vo.setPhoto_file(savedName);
		}
		
		System.out.println("이미지 처리를 완료했습니다. ");

		model.addAttribute("savedName", savedName);
		System.out.println("img 넣기 전 >> " + vo);
		System.out.println("img넣은 후 >> " + vo);
		
		photoService.updatePhoto(vo);
		redirectAttributes.addFlashAttribute("msg", "updateSuccess");

		return "board/updatePhotoSuccess";
	}

	// 게시물 삭제 처리
	@RequestMapping(value = "/deletePhoto", method = RequestMethod.POST)
	public String delete(@RequestParam("photo_id") int photo_id, RedirectAttributes redirectAttributes) {

		logger.info("delete Photo...");
		photoService.deletePhoto(photo_id);
		redirectAttributes.addFlashAttribute("msg", "deleteSuccess");

		return "redirect:/board/allPhoto2";

	}

	// 리뷰게시물 제목으로 검색
	@ResponseBody
	@RequestMapping(value = "/searchPhoto", method = RequestMethod.GET)
	public List<PhotoVO> search(@RequestParam("searchTerm") String searchTerm) {
		return photoService.searchPhoto(searchTerm);
	}

}
