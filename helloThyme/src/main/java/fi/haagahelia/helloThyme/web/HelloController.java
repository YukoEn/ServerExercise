package fi.haagahelia.helloThyme.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(@RequestParam(name="name") String inputName, @RequestParam(name="age") String inputAge, Model model) {
		model.addAttribute("name", inputName);		
		model.addAttribute("age", inputAge);
		return "hello";
	}
	
}
