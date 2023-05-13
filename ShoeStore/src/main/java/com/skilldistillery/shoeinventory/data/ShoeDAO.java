package com.skilldistillery.shoeinventory.data;

import java.util.List;

import com.skilldistillery.shoeinventory.entities.Shoes;


public interface ShoeDAO {

	
	
	Shoes findById(int shoeId);
	List<Shoes> findAll();
	Shoes create(Shoes shoe);
	boolean deleteById(int shoeId);
	boolean updateShoe(int ShoeId, Shoes shoe);
}
