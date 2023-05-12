package com.skilldistillery.shoeinventory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.shoeinventory.data.ShoeDAO;

@Controller
public class ShoesController {

	@Autowired
	private ShoeDAO shoeDao;
	
	@RequestMapping(path= {"/","home.do"})
	public String home(Model model) {
		model.addAttribute("shoeInventory", shoeDao.findAll());
		return "home";
	}
}
