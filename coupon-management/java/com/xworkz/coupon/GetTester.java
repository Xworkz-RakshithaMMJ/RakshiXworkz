package com.xworkz.coupon;

import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class GetTester {

	public static void main(String[] args) {
		CouponDAO dao=new CouponDAOImpl();
		CouponEntity entity=dao.getById(1);
		System.out.println(entity);
	}

}
