package com.skilldistillery.shoeinventory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.shoeinventory.data.ShoeDAO;
import com.skilldistillery.shoeinventory.entities.Shoes;

@Controller
public class ShoesController {

	@Autowired
	private ShoeDAO shoeDao;
	
	@RequestMapping(path= {"/","home.do"})
	public String home(Model model) {
		model.addAttribute("shoeInventory", shoeDao.findAll());
		return "home";
	}
	@RequestMapping(path = "GetShoeData.do", params = "idLookup", method = RequestMethod.GET)
	public ModelAndView findShoeById(int idLookup) {
		ModelAndView mv = new ModelAndView();
		Shoes shoe = shoeDao.findById(idLookup);
		mv.addObject("shoe", shoe);
		mv.setViewName("shoe");
		return mv;
	}
}
