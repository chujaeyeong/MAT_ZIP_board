package com.mat.zip.board.model;

import com.mat.zip.registerAndSearch.model.MZRegisterInfoVO;
import com.mat.zip.registerAndSearch.model.RestaurantVO;

public class MZRegisterReceiptDTO {
	
	private MZRegisterInfoVO mzRegisterInfoVO;
    private RestaurantVO restaurantVO;

    public MZRegisterReceiptDTO() {}

	public MZRegisterInfoVO getMzRegisterInfoVO() {
		return mzRegisterInfoVO;
	}

	public void setMzRegisterInfoVO(MZRegisterInfoVO mzRegisterInfoVO) {
		this.mzRegisterInfoVO = mzRegisterInfoVO;
	}

	public RestaurantVO getRestaurantVO() {
		return restaurantVO;
	}

	public void setRestaurantVO(RestaurantVO restaurantVO) {
		this.restaurantVO = restaurantVO;
	}

	@Override
	public String toString() {
		return "MZRegisterReceiptDTO [mzRegisterInfoVO=" + mzRegisterInfoVO + ", restaurantVO=" + restaurantVO + "]";
	}
    
    

//    public MZRegisterReceiptDTO(MZRegisterInfoVO mzRegisterInfoVO, RestaurantVO restaurantVO) {
//        this.mzRegisterInfoVO = mzRegisterInfoVO;
//        this.restaurantVO = restaurantVO;
//    }
//
//    public MZRegisterInfoVO getMzRegisterInfoVO() {
//        return mzRegisterInfoVO;
//    }
//
//    public void setMzRegisterInfoVO(MZRegisterInfoVO mzRegisterInfoVO) {
//        this.mzRegisterInfoVO = mzRegisterInfoVO;
//    }
//
//    public RestaurantVO getRestaurantVO() {
//        return restaurantVO;
//    }
//
//    public void setRestaurantVO(RestaurantVO restaurantVO) {
//        this.restaurantVO = restaurantVO;
//    }
//
//	@Override
//	public String toString() {
//		return "MZRegisterReceiptDTO [mzRegisterInfoVO=" + mzRegisterInfoVO + ", restaurantVO=" + restaurantVO + "]";
//	}
	
}
