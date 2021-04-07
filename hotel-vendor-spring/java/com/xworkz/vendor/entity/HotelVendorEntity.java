package com.xworkz.vendor.entity;

import com.xworkz.vendor.contants.HotelVendor;

public class HotelVendorEntity {

	private String name;
	private String location;
	private long phoneNo;
	private int rating;
	private HotelVendor vendor;

	public HotelVendorEntity() {
		System.out.println("HotelVendorEntity" + this.getClass().getSimpleName());
	}

	public HotelVendorEntity(String name, String location, long phoneNo, int rating, HotelVendor vendor) {
		super();
		this.name = name;
		this.location = location;
		this.phoneNo = phoneNo;
		this.rating = rating;
		this.vendor = vendor;
	}

	@Override
	public String toString() {
		return "HotelVendorEntity [name=" + name + ", location=" + location + ", phoneNo=" + phoneNo + ", rating="
				+ rating + ", vendor=" + vendor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (phoneNo ^ (phoneNo >>> 32));
		result = prime * result + rating;
		result = prime * result + ((vendor == null) ? 0 : vendor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelVendorEntity other = (HotelVendorEntity) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		if (rating != other.rating)
			return false;
		if (vendor != other.vendor)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public HotelVendor getVendor() {
		return vendor;
	}

	public void setVendor(HotelVendor vendor) {
		this.vendor = vendor;
	}
	
}
