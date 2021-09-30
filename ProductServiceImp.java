package com.nihal.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nihal.stock.dao.ProductDAO;
import com.nihal.stock.model.AdminDTO;
import com.nihal.stock.model.ProductDTO;
import com.nihal.stock.model.UserDTO;

@Component
public class ProductServiceImp implements ProductService{
	@Autowired
	private ProductDAO dao;

	@Override
	public void save(ProductDTO dto) {
		dao.save(dto);
     		
	}

	
	public List<ProductDTO> searchCategory(String pCategory) {
		return dao.searchCategory(pCategory);
	}

	public List<ProductDTO> searchCompany(String pCompany) {
		return dao.searchCompany(pCompany);
	}

	public List<ProductDTO> searchName(String pName) {
		return dao.searchName(pName);
	}

	public int updateQuantity(String pName, int pQuantity) {
		return dao.updateQuantity(pName, pQuantity);
	}

	public int updatePrice(String pName, double pPrice) {
		return dao.updatePrice(pName, pPrice);
	}

	public void save(AdminDTO dto) {
		dao.save(dto);
		
	}

	public void save(UserDTO udto) {
		dao.save(udto);
		
	}


	
	public AdminDTO loginValidation(String adminUsername, String adminPassword) {
		return dao.loginValidation(adminUsername,adminPassword);
	}

	public UserDTO userLogin(String userUsername, String userPassword) {
		return dao.userLogin(userUsername, userPassword);
	}

	

}
