package com.skilldistillery.shoeinventory.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shoes {
@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String model;
	private String name;

	public Shoes() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shoes [id=" + id + ", model=" + model + ", name=" + name + "]";
	}

}
