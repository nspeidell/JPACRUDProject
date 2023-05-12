package com.skilldistillery.shoeinventory.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.shoeinventory.entities.Shoes;

@Service
@Transactional
public class ShoeDAOImpl implements ShoeDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Shoes findById(int shoeId) {
		// TODO Auto-generated method stub
		return em.find(Shoes.class, shoeId);
	}

	@Override
	public List<Shoes> findAll() {
		// TODO Auto-generated method stub
		String jpql = "SELECT s FROm Shoes s";
		
		return em.createQuery(jpql, Shoes.class).getResultList();
	}

	@Override
	public Shoes create(Shoes shoe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int shoeId) {
		// TODO Auto-generated method stub
		return false;
	}

}
