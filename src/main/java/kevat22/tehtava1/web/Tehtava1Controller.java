package kevat22.tehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
