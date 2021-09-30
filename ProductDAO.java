package com.nihal.stock.dao;

import java.util.List;

import com.nihal.stock.model.AdminDTO;
import com.nihal.stock.model.ProductDTO;
import com.nihal.stock.model.UserDTO;

public interface ProductDAO {

	void save(ProductDTO dto);

	List<ProductDTO> searchCategory(String pCategory);

	List<ProductDTO> searchCompany(String pCompany);

	List<ProductDTO> searchName(String pName);

	int updateQuantity(String pName, int pQuantity);

	int updatePrice(String pName, double pPrice);

	void save(AdminDTO dto);

	void save(UserDTO udto);

	AdminDTO loginValidation(String adminUsername, String adminPassword);

	UserDTO userLogin(String userUsername, String userPassword);

	

}
