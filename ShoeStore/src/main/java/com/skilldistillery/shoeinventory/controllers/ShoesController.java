package com.skilldistillery.shoeinventory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.shoeinventory.data.ShoeDAO;
import com.skilldistillery.shoeinventory.entities.Shoes;

@Controller
public class ShoesController {

	@Autowired
	private ShoeDAO shoeDao;
	
	@RequestMapping(path= {"/","home.do"})
	public String home(Model model) {
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
	
	@RequestMapping(path= {"GetShoeList.do"})
	public String shoeListLoad(Model model) {
		  List<Shoes> shoe = shoeDao.findAll();
		  model.addAttribute("shoeList", shoe);
		return "shoeList";
	}
	@RequestMapping(path = "GetShoeData.do", params = "list", method = RequestMethod.GET)
	public Model shoeList(Model model) {
		model.addAttribute("shoeInventory", shoeDao.findAll());
		return model;
	}

	@RequestMapping(path = "NewShoe.do", method = RequestMethod.POST)
	public ModelAndView createShoe(Shoes shoe) {
		ModelAndView mv = new ModelAndView();
		Shoes dbShoe = shoeDao.create(shoe);
		mv.addObject("shoe", dbShoe);
		mv.setViewName("shoe");
		return mv;
	}
	@RequestMapping(path = {"deleteShoe.do"}, params = "id", method= RequestMethod.GET)
	public ModelAndView deleteShoe(int id) {
		System.out.println("hitting delete method");
		ModelAndView mv = new ModelAndView();
		boolean deleted = shoeDao.deleteById(id);
		System.out.println(deleted);
		mv.addObject("deleted", deleted);
		mv.setViewName("deleteResult");
		return mv;
	}
	@RequestMapping(path = {"editShoe.do"}, method= RequestMethod.GET)
public ModelAndView editShoe(int id) {
		System.out.println("hitting the editshoe method");
		Shoes shoe  = shoeDao.findById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("shoe", shoe);
		mv.setViewName ("editShoe");		
		System.out.println("************************" + shoe);
	return mv;
}
	
	@RequestMapping(path = {"SubmitEditShoe.do"}, method= RequestMethod.POST)
	public ModelAndView submitShoe(ModelAndView mv, Shoes shoe, @RequestParam int id, RedirectAttributes redir) {
		System.out.println("hitting the submitshoe method");
		Shoes userEditedShoe = shoe;
		System.out.println("@@@@@@@@@@@@@@" + userEditedShoe);
		boolean updated = shoeDao.updateShoe(id, userEditedShoe);
		System.out.println(updated);
		mv.addObject("updated", updated);
	//	redir.addFlashAttribute("updated", updated);
		mv.setViewName ("updateResult");
		return mv;
	}

	@RequestMapping(path = {"updateShoe.do"}, method= RequestMethod.GET)
	public ModelAndView editFormRoute() {
		System.out.println("hitting the editformroute method");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("updateResult");
		return mv;
	}
}
