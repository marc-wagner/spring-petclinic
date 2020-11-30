package guru.springframework.springpetclinic.controllers;

import guru.springframework.springpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
		System.out.println( "ownerController constructor called");
		System.out.println( ownerService.findAll().size());
	}


	@RequestMapping({"","/index","/index.html","/"})
	public String listOwners(Model model){
		System.out.println( "ownerController listOwners called");
		System.out.println( ownerService.findAll().size());
		model.addAttribute("owners", ownerService.findAll());
	return "owners/index";
	}
}
