package com.xworkz.vendor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.vendor.contants.HotelVendor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name="hotelvendor")
public class HotelVendorEntity {

	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="LOCATION")
	private String location;
	@Column(name="PHONE_NO")
	private long phoneNo;
	@Column(name="RATING")
	private int rating;
	@Column(name="HOTEL_VENDOR")
	private HotelVendor vendor;

	public HotelVendorEntity(String name, String location, long phoneNo, int rating, HotelVendor vendor) {
		super();
		this.name = name;
		this.location = location;
		this.phoneNo = phoneNo;
		this.rating = rating;
		this.vendor = vendor;
	}

}
