package com.aks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aks.dao.contactrepository;
import com.aks.model.AKSContact;

@Controller
public class homecontroller {

	@Autowired
    private contactrepository repository;
	
	@GetMapping("base")
	public String homepage() {
		return "base.html";
	}
	
	    @GetMapping("home")
		public String homepage1() {
		return "home.html";	
		}
	    
	    @GetMapping("chatbox")
	    public String chat(Model m) {
	    	return "chat.html";
	    }
	    
	    @GetMapping("Product")
	    public String Productpage() {
	    	return "product.html";
	    }
	    
	    @GetMapping("About")
	    public String aboutpage() {
	    	return "about.html";
	    }
	    
	    @GetMapping("insert")
	    public String saving() {
	    	return "insertdata.html";
	    }
	    @GetMapping("Contactus")
	    public String contactpage() {
	    	return "contact.html";
	    }
	    @PostMapping("form-submit")
	    public String contactform(@ModelAttribute AKSContact contact,Model m){
	    	this.repository.save(contact);
	    	System.out.println("form-page called");
	    	System.out.println(contact);
	    	m.addAttribute("msg", "Msg Send Succesfully");
	    	return "contact.html";
	    }
	}
