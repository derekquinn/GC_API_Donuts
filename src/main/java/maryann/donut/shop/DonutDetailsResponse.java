package maryann.donut.shop;

import java.util.List;

public class DonutDetailsResponse extends DonutDetails {

	private List<DonutDetails> donutDetails;

	public List<DonutDetails> getADonut() {
		return donutDetails;
	}

	public void setDonuts(List<DonutDetails> donutDetails) {
		this.donutDetails = donutDetails;
	}

}