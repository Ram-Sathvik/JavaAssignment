package ques14.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int restId;
	
	@NotBlank(message = "Restaurant name cannot be blank")
	private String restname;
	
	@NotBlank(message = "Location cannot be blank")
	private String restLocation;
	
	@OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Food> foodsList = new ArrayList<Food>();

	public Restaurant() {}

	public Restaurant(int restId, String restname, String restLocation, List<Food> foodsList) {
		this.restId = restId;
		this.restname = restname;
		this.restLocation = restLocation;
		this.foodsList = foodsList;
	}

	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public String getRestname() {
		return restname;
	}

	public void setRestname(String restname) {
		this.restname = restname;
	}

	public String getRestLocation() {
		return restLocation;
	}

	public void setRestLocation(String restLocation) {
		this.restLocation = restLocation;
	}

	public List<Food> getFoodsList() {
		return foodsList;
	}

	public void setFoodsList(List<Food> foodsList) {
		this.foodsList = foodsList;
	}
}