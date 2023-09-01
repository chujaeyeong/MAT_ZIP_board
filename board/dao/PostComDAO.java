package com.mat.zip.board.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mat.zip.board.model.PostComVO;

@Component
public class PostComDAO {

	@Autowired
	SqlSessionTemplate my;

	// 자유게시판 댓글 등록 insert
	public int insert(PostComVO vo) {
		int result = my.insert("postComVO.createPostCom", vo);
		return result;
	}
	
	// 자유게시판 댓글 삭제 delete
	public int delete(PostComVO vo) {
		int result = my.delete("postComVO.deletePostCom", vo);
		return result;
	}

	// 자유게시판 댓글 list (post_id)
	public List<PostComVO> postComList(int post_id) {
		List<PostComVO> list = my.selectList("postComVO.postComList", post_id);
		System.out.println(list.size());
		return list;
	}
}
