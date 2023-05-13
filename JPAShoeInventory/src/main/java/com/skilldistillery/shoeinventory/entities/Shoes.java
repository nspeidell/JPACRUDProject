package com.skilldistillery.shoeinventory.entities;

import java.util.Objects;

import javax.persistence.Column;
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
	private double size;
	@Column(name="purchase_date")
	private String purchaseDate;
	@Column(name="current_value")
	private double value;
	private String used;


	public Shoes() {
		super();
	}


	@Override
	public int hashCode() {
		return Objects.hash(model, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shoes other = (Shoes) obj;
		return Objects.equals(model, other.model) && Objects.equals(name, other.name);
	}


	public Shoes(int id, String model, String name, double size, String purchaseDate, double value, String used) {
		super();
		this.id = id;
		this.model = model;
		this.name = name;
		this.size = size;
		this.purchaseDate = purchaseDate;
		this.value = value;
		this.used = used;
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


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public String getPurchaseDate() {
		return purchaseDate;
	}


	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}


	public String getUsed() {
		return used;
	}


	public void setUsed(String used) {
		this.used = used;
	}


	@Override
	public String toString() {
		return "Shoes [id=" + id + ", model=" + model + ", name=" + name + ", size=" + size + ", purchaseDate="
				+ purchaseDate + ", value=" + value + ", condition=" + used + "]";
	}





}
