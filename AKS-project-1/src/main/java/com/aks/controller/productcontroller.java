package com.aks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aks.dao.productrespository;
import com.aks.model.AKSproducts;

@Controller
@RequestMapping(value="/Product")
public class productcontroller {

	@Autowired
	productrespository respository;
	
	@RequestMapping(value="/{Id}")
	public String specificproduct(@PathVariable("Id") String name,Model m) {
		AKSproducts user = this.respository.getUserByName(name);
		m.addAttribute("product", user);
		System.out.println(user.getColor());
		System.out.println(name);
		return "specificproduct.html";
	}
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public String savedata(@ModelAttribute("product") AKSproducts product) {
		System.out.println("done");
		return "insertdata.html";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String savedata2(@ModelAttribute("product") AKSproducts product) {
		System.out.println("save method called");
		this.respository.save(product);
		System.out.println("done");
		return "insertdata.html";
	}
}
