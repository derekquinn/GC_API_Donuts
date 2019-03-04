package maryann.donut.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping("/details/{id}/")
	public ModelAndView getDetails(@PathVariable("id")int id) {

		DonutDetails donutdetails = donutApiService.showMeADonut(id);

		System.out.println(donutdetails.toString());

		return new ModelAndView("details", "donutdetails", donutdetails);
	}
}
