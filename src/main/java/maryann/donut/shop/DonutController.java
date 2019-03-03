package maryann.donut.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DonutController {
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
}
