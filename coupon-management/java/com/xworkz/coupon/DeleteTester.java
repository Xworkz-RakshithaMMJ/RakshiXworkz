package com.xworkz.coupon;

import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;

public class DeleteTester {

	public static void main(String[] args) {
		CouponDAO dao=new CouponDAOImpl();
		dao.deleteById(3);
	}

}
