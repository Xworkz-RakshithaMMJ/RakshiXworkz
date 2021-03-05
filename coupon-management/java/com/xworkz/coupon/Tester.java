package com.xworkz.coupon;

import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class Tester {

	public static void main(String[] args) {
		
		CouponEntity entity=new CouponEntity("Ajio","C123",12,"Dress");
		CouponDAO dao=new CouponDAOImpl();
		dao.create(entity);
	}
}
