package com.skilldistillery.shoeinventory.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoesTest {
private static EntityManagerFactory emf;
private EntityManager em;
private Shoes shoes;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAShoeInventory");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		shoes = em.find(Shoes.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		shoes = null;
	}

	@Test
	void test() {
		assertNotNull(shoes);
		assertEquals("Jordan 1", shoes.getModel());
	}

}
