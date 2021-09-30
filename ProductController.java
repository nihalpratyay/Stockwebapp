package com.nihal.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nihal.stock.model.AdminDTO;
import com.nihal.stock.model.ProductDTO;
import com.nihal.stock.model.UserDTO;
import com.nihal.stock.service.ProductService;

@RequestMapping("/")
@Component
public class ProductController {
	@Autowired
	private ProductService service;
	
	@RequestMapping("/link1")
	public String getView1() {
		return "register";
	}
	
	@RequestMapping("/link2")
	public String getView2() {
		return "category";
	}
	
	@RequestMapping("/link3")
	public String getView3() {
		return "company";
	}
	
	@RequestMapping("/link4")
	public String getView4() {
		return "name";
	}
	
	@RequestMapping("/link5")
	public String getView5() {
		return "quantity";
	}
	
	@RequestMapping("/link6")
	public String getView6() {
		return "price";
	}
	
	@RequestMapping("/link7")
	public String getView7() {
		return "reg";
	}
	
	@RequestMapping("/link8")
	public String getView8() {
		return "login";
	}
	
	@RequestMapping("/link9")
	public String getView9() {
		return "regadmin";
	}
	
	@RequestMapping("/link10")
	public String getView10() {
		return "reguser";
	}
	
	@RequestMapping("/link11")
	public String getView11() {
		return "loginadmin";
	}
	
	@RequestMapping("/link12")
	public String getView12() {
		return "loginuser";
	}
	
	@PostMapping("/registration")
	public String register(@ModelAttribute ProductDTO dto) {
		service.save(dto);
		return "regsuccess";
	}
	
	@GetMapping("/searchCategory")
	public ModelAndView searchCategory(@RequestParam String pCategory) {
		List<ProductDTO> lDtos=service.searchCategory( pCategory);
		return new ModelAndView("viewall","lDtos",lDtos);
	}
	
	@GetMapping("/searchName")
	public ModelAndView searchName(@RequestParam String pName) {
		List<ProductDTO> lDtos=service.searchName(pName);
		return new ModelAndView("viewall","lDtos",lDtos);
	}
	
	@GetMapping("/searchCompany")
	public ModelAndView searchCompany(@RequestParam String pCompany) {
		List<ProductDTO> lDtos=service.searchCompany( pCompany);
		return new ModelAndView("viewall","lDtos",lDtos);
	}
	@PostMapping("/updatequantity")
	public String updateQuantity(@RequestParam String pName, @RequestParam int pQuantity) {
		int row=service.updateQuantity(pName,pQuantity);
		if (row==1) {
			return "successupdate";
		} else {
			return "failupdate";

		}
	}
	@PostMapping("/updateprice")
	public String updatePrice(@RequestParam String pName, @RequestParam double pPrice) {
		int row=service.updatePrice(pName,pPrice);
		if (row==1) {
			return "successupdate";
		} else {
			return "failupdate";

		}
	}
	
	@PostMapping("/registeradmin")
	public String registerAdmin(@ModelAttribute AdminDTO dto) {
		service.save(dto);
		return "adminregsuccess";
	}
	
	@PostMapping("/registeruser")
	public String registerUser(@ModelAttribute UserDTO udto) {
		service.save(udto);
		return "userregsuccess";
	}
	
	@PostMapping("/loginadmin")
	public String loginAdmin(@RequestParam String adminUsername, @RequestParam String adminPassword) {
		AdminDTO dto=service.loginValidation(adminUsername,adminPassword);
		if (dto!=null) {
			return "success";
		} else {
			return "fail";

		}
	}
	
	@PostMapping("/loginuser")
	public String loginUser(@RequestParam String userUsername, @RequestParam String userPassword) {
		UserDTO udto=service.userLogin(userUsername,userPassword);
		if (udto!=null) {
			return "successuser";
		} else {
			return "fail";

		}
	}

}
