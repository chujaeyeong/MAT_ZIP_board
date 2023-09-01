package com.mat.zip.board.service;

import java.util.List;

import com.mat.zip.board.model.PhotoVO;

public interface PhotoService {
	
	public int insertPhoto(PhotoVO vo);
	
	public PhotoVO onePhotoId(int photo_id);
	
	public int deletePhoto(int photo_id);
	
	public int updatePhoto(PhotoVO vo);
	
	public void incrementPhotoViewCount(int photo_id);
	
	public List<PhotoVO> allPhoto();
	
	public List<PhotoVO> searchPhoto(String searchTerm);
	
}
