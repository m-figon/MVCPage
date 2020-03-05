package spring.facebook.mvc;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Profile")
public class ProfileController {
	@RequestMapping("/addNewProfile")
	public String addNewProfile(Model theModel) {
		Profile theProfile = new Profile();
		theModel.addAttribute("profile",theProfile);
		return "addnewprofile";
		
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("profile") Profile theProfile) {
		return "profilecreated";
	}

}