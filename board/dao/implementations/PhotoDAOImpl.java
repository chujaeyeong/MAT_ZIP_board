package com.mat.zip.board.dao.implementations;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mat.zip.board.dao.PhotoDAO;
import com.mat.zip.board.model.PhotoVO;

@Repository
public class PhotoDAOImpl implements PhotoDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertPhoto(PhotoVO vo) {
		return sqlSession.insert("com.mat.zip.mapper.PhotoMapper.insertPhoto", vo);
	}

	@Override
	public int deletePhoto(int photo_id) {
		return sqlSession.delete("com.mat.zip.mapper.PhotoMapper.deletePhoto", photo_id);
	}
	
	@Override
	public PhotoVO onePhotoId(int photo_id) {
		return sqlSession.selectOne("com.mat.zip.mapper.PhotoMapper.onePhotoId", photo_id);
	}
	
	@Override
	public int updatePhoto(PhotoVO vo) {
		return sqlSession.update("com.mat.zip.mapper.PhotoMapper.updatePhoto", vo);
	}

	@Override
	public void incrementPhotoViewCount(int photo_id) {
		sqlSession.update("com.mat.zip.mapper.PhotoMapper.incrementPhotoViewCount", photo_id);
	}

	@Override
	public List<PhotoVO> allPhoto() {
		return sqlSession.selectList("com.mat.zip.mapper.PhotoMapper.allPhoto");
	}

	@Override
	public List<PhotoVO> searchPhoto(String searchTerm) {
		return sqlSession.selectList("com.mat.zip.mapper.PhotoMapper.searchPhoto", searchTerm);
	}
	
	
}
