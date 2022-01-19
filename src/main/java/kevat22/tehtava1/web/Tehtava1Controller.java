package kevat22.tehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Tehtava1Controller {
	@RequestMapping("index")
	@ResponseBody
	public String mainPage() {
		return("This is the main page");
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String contactPage() {
		return("This is the contact page");
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayWelcome(@RequestParam(name="location", required=false, defaultValue = "Porvoo") String paikka,
			@RequestParam(name="name", required=false, defaultValue = "Runeberg") String nimi) {
		return "Welcome to " + paikka + " " + nimi + "!";
	}

}
