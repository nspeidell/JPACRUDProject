package com.skilldistillery.shoeinventory.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.shoeinventory.entities.Shoes;

@Service
@Transactional
public class ShoeDAOImpl implements ShoeDAO {

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
		System.out.println("hitting the create");
		em.persist(shoe);
		return shoe;
	}

	@Override
	public boolean deleteById(int shoeId) {
		Shoes shoe = em.find(Shoes.class, shoeId);
		if (shoe != null) {
			em.remove(shoe);
			System.out.println("return true " + shoe);
			return true;
		} else {
			System.out.println("return false");
			return false;
		}
	}

	@Override
	public boolean updateShoe(int shoeId, Shoes editedShoe) {
		Shoes shoe = em.find(Shoes.class, shoeId);
		System.out.println("update shoe dao null");
		if (shoe != null) {
			System.out.println("update shoe dao");
			shoe.setModel(editedShoe.getModel());
			shoe.setName(editedShoe.getName());
			shoe.setSize(editedShoe.getSize());
			shoe.setPurchaseDate(editedShoe.getPurchaseDate());
			System.out.println(editedShoe.getPurchaseDate());
			System.out.println(shoe.getPurchaseDate());
			shoe.setValue(editedShoe.getValue());
			shoe.setUsed(editedShoe.getUsed());
			em.persist(shoe);
			System.out.println("return true " + shoe);
			if (editedShoe != null) {

				return true;
			}

		}
		return false;

	}
}