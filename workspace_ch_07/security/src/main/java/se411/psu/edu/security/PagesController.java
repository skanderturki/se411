package se411.psu.edu.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {

    @RequestMapping("/")
    public String home() { 
        return "index";
    }
    
    @RequestMapping("/homepage")
    public String homepage() { 
    	return "redirect:/";
    }
    
    @RequestMapping("/login")
    public String login() { 
        return "login";
    }
	
    @RequestMapping("/dashboard")
    public String dashboard() { 
        return "dashboard";
    }
}
