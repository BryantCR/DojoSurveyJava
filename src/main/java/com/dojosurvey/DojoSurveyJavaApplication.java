package com.dojosurvey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@SpringBootApplication
@Controller
public class DojoSurveyJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojoSurveyJavaApplication.class, args);
	}
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	
	public String displayForm() {
		return "index.jsp";
		//System.out.println("Ok");
	}
	
	@RequestMapping( value = "/formfilled", method = RequestMethod.POST )
	
	public String formResults( @RequestParam(value="firstName") String firstName, @RequestParam(value="dojoLocation") String dojoLocation,
			@RequestParam(value="fLanguage") String fLanguage, @RequestParam(value="comment") String comment, Model model, RedirectAttributes redirectAttributes) {
		
		model.addAttribute("result", new DojoInfo(firstName, dojoLocation, fLanguage, comment));
		return "showview.jsp";
	}
	
	@RequestMapping( value = "/showview", method = RequestMethod.GET )
	
	public String displayViewForm(Model model) {		
		return "showview.jsp";
		//System.out.println("Ok");
	}
	
	@RequestMapping( value = "/home", method = RequestMethod.GET )
	
	public String home() {
		return "redirect:/";
	}
	

}
