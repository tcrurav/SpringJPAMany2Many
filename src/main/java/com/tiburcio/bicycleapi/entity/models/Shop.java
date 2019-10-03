package com.tiburcio.bicycleapi.entity.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "shops")
public class Shop implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(unique = true, columnDefinition = "VARCHAR(45)")
	private String cif;
	
	@NotEmpty
	private String address;
	
	@ManyToMany
    @JoinTable(name = "bicycles_in_shops",
            joinColumns = @JoinColumn(name = "shop_cif"),
            inverseJoinColumns = @JoinColumn(name = "bicycle_id"))
    private Set<Bicycle> bicyclesInShop = new HashSet<>();
	
	public Shop() {}

	public Shop(String cif, @NotEmpty String address) {
		super();
		this.cif = cif;
		this.address = address;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Bicycle> getBicyclesInShop() {
		return bicyclesInShop;
	}

	public void setBicyclesInShop(Set<Bicycle> bicyclesInShop) {
		this.bicyclesInShop = bicyclesInShop;
	}

}
