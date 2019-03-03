package maryann.donut.shop;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DonutResponse {

	@JsonProperty("results")
	private List<Donut> donuts;

	public List<Donut> getDonuts() {
		return donuts;
	}

	public void setDonuts(List<Donut> donuts) {
		this.donuts = donuts;
	}

	@Override
	public String toString() {
		return "DonutResponse [donuts=" + donuts + "]";
	}

}
