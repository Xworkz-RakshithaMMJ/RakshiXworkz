package com.xworkz.coupon.dao;

import java.util.List;

import com.xworkz.coupon.entity.CouponEntity;


public interface CouponDAO {

	public void create(CouponEntity entity);
	
	public void create(List<CouponEntity> entities);

	public CouponEntity getById(int id);

	public void UpdateBrandAndCodeById(String brandName, String code, int id);

	public void deleteById(int id);

}
