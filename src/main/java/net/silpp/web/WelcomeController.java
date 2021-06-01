package net.silpp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	@GetMapping("/helloworld")
	//@RequestMapping("/helloworld")
	//@ResponseBody
	public String welcome() {
		return "welcome";
	}
}
 