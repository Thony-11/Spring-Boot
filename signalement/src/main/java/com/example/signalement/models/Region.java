package com.example.signalement.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "region")
public class Region {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nom;
	private String province;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Region(String nom, String province) {
		super();
		this.nom = nom;
		this.province = province;
	}
	public Region() {}
}
