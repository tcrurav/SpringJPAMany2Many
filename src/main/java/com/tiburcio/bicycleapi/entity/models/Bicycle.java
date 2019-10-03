package com.tiburcio.bicycleapi.entity.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "bicycles")
public class Bicycle implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	@NotEmpty
	private String model;
	
	@Column(name = "model_price")
	private float price;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "bicyclesInShop")
	Set<Shop> shopsWhereTofindThisBicycle = new HashSet<>();
	
	public Bicycle() {}

	public Bicycle(long id, String model, float price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Set<Shop> getShopsWhereTofindThisBicycle() {
		return shopsWhereTofindThisBicycle;
	}

	public void setShopsWhereTofindThisBicycle(Set<Shop> shopsWhereTofindThisBicycle) {
		this.shopsWhereTofindThisBicycle = shopsWhereTofindThisBicycle;
	}
	
}
