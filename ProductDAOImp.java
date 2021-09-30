package com.nihal.stock.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.nihal.stock.model.AdminDTO;
import com.nihal.stock.model.ProductDTO;
import com.nihal.stock.model.UserDTO;

@Component
public class ProductDAOImp implements ProductDAO{
	private EntityManager getEntityManager() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("user");
		EntityManager manager=factory.createEntityManager();
		return manager;
		
	}
	public void save(ProductDTO dto) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(dto);
		transaction.commit();
		manager.close();
		
	}
	public List<ProductDTO> searchCategory(String pCategory) {
		EntityManager manager=getEntityManager();
		Query query=manager.createQuery("from ProductDTO where pCategory='"+pCategory+"'");
		return query.getResultList();
	}
	
	public List<ProductDTO> searchCompany(String pCompany) {
		EntityManager manager=getEntityManager();
		Query query=manager.createQuery("from ProductDTO where pCompany='"+pCompany+"'");
		return query.getResultList();
	}
	
	public List<ProductDTO> searchName(String pName) {
		EntityManager manager=getEntityManager();
		Query query=manager.createQuery("from ProductDTO where pName='"+pName+"'");
		return query.getResultList();
	}
	@Override
	public int updateQuantity(String pName, int pQuantity) {
		try {
			EntityManager manager= getEntityManager();
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			Query query=manager.createQuery("update ProductDTO set pQuantity='"+pQuantity+"' where pName='"+pName+"'");
			int row= query.executeUpdate();
			transaction.commit();
		    return row;
		} catch(NoResultException e) {
			return 0;
		}
		
	}
	public int updatePrice(String pName, double pPrice) {
		try {
			EntityManager manager= getEntityManager();
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			Query query=manager.createQuery("update ProductDTO set pPrice='"+pPrice+"' where pName='"+pName+"'");
			int row= query.executeUpdate();
			transaction.commit();
		    return row;
		} catch(NoResultException e) {
			return 0;
		}
		
	}
	public void save(AdminDTO dto) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(dto);
		transaction.commit();
		manager.close();
     		
	}
	public void save(UserDTO udto) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(udto);
		transaction.commit();
		manager.close();
		
	}
	
	public AdminDTO loginValidation(String adminUsername, String adminPassword) {
		try {
			EntityManager manager= getEntityManager();
			Query query=manager.createQuery("from AdminDTO where adminUsername=?0 and adminPassword=?1");
			query.setParameter(0, adminUsername);
			query.setParameter(1, adminPassword);
			return  (AdminDTO) query.getSingleResult();
		} catch(NoResultException e) {
			return null;
		}
	}
	
	public UserDTO userLogin(String userUsername, String userPassword) {
		try {
			EntityManager manager= getEntityManager();
			Query query=manager.createQuery("from UserDTO where userUsername=?0 and userPassword=?1");
			query.setParameter(0, userUsername);
			query.setParameter(1, userPassword);
			return  (UserDTO) query.getSingleResult();
		} catch(NoResultException e) {
			return null;
		}
	}
	
	
	
	

}
