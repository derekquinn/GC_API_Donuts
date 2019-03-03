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

	public List<DonutDetails> showMeADonut(Long id) {

		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		DonutDetailsResponse response = restTemplate.getForObject(url, DonutDetailsResponse.class);
		return response.getADonut();
	}

}
