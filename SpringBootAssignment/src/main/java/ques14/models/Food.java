package ques14.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int foodId;
	
	@NotBlank(message = "Food name cannot be blank")
	private String foodName;
	
	@NotNull(message = "Food price cannot be blank")
	private double foodPrice;

	@ManyToOne
	@JsonBackReference
	private Restaurant restaurant;

	public Food() {}

	public Food(int foodId, String foodName, double foodPrice, Restaurant restaurant) {
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.restaurant = restaurant;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}	
}