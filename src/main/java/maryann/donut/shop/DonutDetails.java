package maryann.donut.shop;

import java.util.List;

public class DonutDetails extends Donut {

	private Integer calories;
	private List<String> extras;
	private String photo;

	public DonutDetails() {

	}

	public DonutDetails(Integer calories, List<String> extras, String photo) {
		super();
		this.calories = calories;
		this.extras = extras;
		this.photo = photo;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public List<String> getExtras() {
		return extras;
	}

	public void setExtras(List<String> extras) {
		this.extras = extras;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
