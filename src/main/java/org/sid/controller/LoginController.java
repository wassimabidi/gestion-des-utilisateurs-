package org.sid.controller;


import org.sid.models.Enseignant;
import org.sid.models.Etudiant;
import org.sid.models.Utilisateur;
import org.sid.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginController {
	@Autowired (required = false)
	private UserRepository UserRepo ;
	 
@RequestMapping("/")
public String checkMvc()
{
	return "login1";}
@RequestMapping("/login1")
public String loginHomePage(@RequestParam("email") String email,@RequestParam("password") String password,Model model)
{   
	Utilisateur u=null; ;
	try {
		u = UserRepo.findbyName(email,password);
	}catch (Exception e ) {System.out.println("User NOT Found");
	}
	if(u instanceof Etudiant) {
	 model.addAttribute("email",email);
	return "homepage";}
	else if (u instanceof Enseignant)
	{model.addAttribute("email",email);
	return "homepage1";
		
	}
	else 
		
	
	model.addAttribute("error", "User NOT Found");
	return "homepage3";
}
}
