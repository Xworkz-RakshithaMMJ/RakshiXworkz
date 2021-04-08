package com.xworkz.food.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.food.constants.FoodQuality;
import com.xworkz.food.constants.FoodType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "fooditems")
public class FoodItemEntity {

	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="PRICE")
	private double price;
	@Column(name="QUANTITY")
	private int quantity;
	@Column(name="FOOD_TYPE")
	private FoodType foodType;
	@Column(name="QUALITY")
	private FoodQuality quality;
	@Column(name="RATING")
	private int rating;

	public FoodItemEntity(String name, double price, int quantity, FoodType foodType, FoodQuality quality, int rating) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.foodType = foodType;
		this.quality = quality;
		this.rating = rating;
	}

}
