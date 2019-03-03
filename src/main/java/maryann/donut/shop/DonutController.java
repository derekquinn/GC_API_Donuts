package maryann.donut.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DonutController {
	
	@Autowired
	private DonutApiService donutApiService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		
		List<Donut> donut = this.donutApiService.showMeTheDonuts();
		return new ModelAndView("index", "donut", donut);
	}
}
