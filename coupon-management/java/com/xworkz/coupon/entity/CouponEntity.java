package com.xworkz.coupon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="coupon")
public class CouponEntity {

	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="C_ID")
	private int c_id;
	@Column(name="NAME")
	private String name;
	@Column(name="CODE")
	private String code;
	@Column(name="VALIDITY_IN_MONTHS")
	private int validitiyInMonths;
	@Column(name="TYPE")
	private String type;
	
	public CouponEntity(String name, String code, int validitiyInMonths, String type) {
		super();
		this.name = name;
		this.code = code;
		this.validitiyInMonths = validitiyInMonths;
		this.type = type;
	}
}
