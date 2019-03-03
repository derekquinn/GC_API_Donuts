package maryann.donut.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DonutController {

	@Autowired
	private DonutApiService donutApiService;

	@RequestMapping("/")
	public ModelAndView index() {

		List<Donut> donut = this.donutApiService.showMeTheDonuts();
		return new ModelAndView("index", "donut", donut);
	}

	@PostMapping("/")
	public ModelAndView index(Long id) {

		List<DonutDetails> donutD = donutApiService.showMeADonut(id);

		return new ModelAndView("details", "donutD", donutD);
	}

	@RequestMapping("/details")
	public ModelAndView getDetails() {

		return new ModelAndView("details");
	}
}
