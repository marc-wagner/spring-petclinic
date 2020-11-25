package guru.springframework.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({"/","","index","index.html"})
	public String index(){
		System.err.println("controller : index called successfully");
		return "index";
	}
}
