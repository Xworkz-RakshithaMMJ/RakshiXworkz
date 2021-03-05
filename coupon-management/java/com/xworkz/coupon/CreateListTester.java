package com.xworkz.coupon;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;



public class CreateListTester {

	public static void main(String[] args) {
		
		CouponEntity entity1 = new CouponEntity("Trends","C324",3,"Footwear");
		CouponEntity entity2 = new CouponEntity("sudexo","C456",5,"Food");
		CouponDAO dao=new CouponDAOImpl();
		List<CouponEntity> list = new ArrayList<CouponEntity>();
		list.add(entity2);
		list.add(entity1);
		dao.create(list);
	}
}
