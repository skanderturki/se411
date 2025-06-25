package psu.edu.ch06.crud02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {

	@RequestMapping("/")             // This is the URI path
	  public String home() { 
	  return "index";                // index is the name of the template (index.html)
	}

	
}
