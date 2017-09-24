package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class WelcomePage {
	/*
	 * This method will load Login Page.
	 */
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String loadLoginPage() {
		return "hello";
	}
}