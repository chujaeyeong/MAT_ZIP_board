package com.mat.zip.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mat.zip.board.model.PhotoComVO;

@Component
public class PhotoComDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	// 리뷰게시판 댓글 등록 insert
	public int insert(PhotoComVO vo) {
		int result = my.insert("photoComVO.createPhotoCom", vo);
		return result;
	}
	
	// 자유게시판 댓글 삭제 delete
	public int delete(PhotoComVO vo) {
		int result = my.delete("photoComVO.deletePhotoCom", vo);
		return result;
	}

	// 자유게시판 댓글 list (photo_id)
	public List<PhotoComVO> photoComList(int photo_id) {
		List<PhotoComVO> list = my.selectList("photoComVO.photoComList", photo_id);
		System.out.println(list.size());
		return list;
	}
	
}
