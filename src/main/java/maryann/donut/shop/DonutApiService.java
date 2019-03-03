package maryann.donut.shop;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DonutApiService {

	private RestTemplate restTemplate = new RestTemplate();

	public List<Donut> showMeTheDonuts() {

		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		DonutResponse response = restTemplate.getForObject(url, DonutResponse.class);

		return response.getDonuts();
	}

	public DonutDetails showMeADonut() {

		String url = "https://grandcircusco.github.io/demo-apis/donuts/3.json";
		DonutDetails detailsresponse = restTemplate.getForObject(url, DonutDetails.class);
		
	
		return detailsresponse;
	}

}
