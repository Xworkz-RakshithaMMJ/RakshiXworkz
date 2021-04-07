package com.xworkz.food.entity;

import com.xworkz.food.constants.FoodQuality;
import com.xworkz.food.constants.FoodType;

public class FoodItemEntity {

	private String name;
	private double price;
	private int quantity;
	private FoodType foodType;
	private FoodQuality quality;
	private int rating;
	
	public FoodItemEntity() {
		System.out.println("invoked FoodItemEntity");
	}

	public FoodItemEntity(String name, double price, int quantity, FoodType foodType, FoodQuality quality, int rating) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.foodType = foodType;
		this.quality = quality;
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((quality == null) ? 0 : quality.hashCode());
		result = prime * result + quantity;
		result = prime * result + rating;
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
		FoodItemEntity other = (FoodItemEntity) obj;
		if (foodType != other.foodType)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quality != other.quality)
			return false;
		if (quantity != other.quantity)
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FoodItemEntity [name=" + name + ", price=" + price + ", quantity=" + quantity + ", foodType=" + foodType
				+ ", quality=" + quality + ", rating=" + rating + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}

	public FoodQuality getQuality() {
		return quality;
	}

	public void setQuality(FoodQuality quality) {
		this.quality = quality;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
