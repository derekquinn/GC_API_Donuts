package maryann.donut.shop;

import java.util.List;

public class DonutDetails {

	private Long id;
	private String ref;
	private String name;
	private Integer calories;
	private List<String> extras;
	private String photo;

	public DonutDetails() {

	}

	public DonutDetails(String ref, String name, Integer calories, List<String> extras, String photo, Long id) {
		super();
		this.ref = ref;
		this.name = name;
		this.calories = calories;
		this.extras = extras;
		this.photo = photo;
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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