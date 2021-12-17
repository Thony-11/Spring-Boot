
package com.example.signalement.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	

	private int id_type_user;
	
	private int id_region;
	
	private String username;
	
	private String usermail;
	
	private String userpassword;
	
	public Utilisateur() {};

	public Utilisateur(int id_type_user, int id_region, String username, String usermail, String userpasword) {
		super();
		this.id_type_user = id_type_user;
		this.id_region = id_region;
		this.username = username;
		this.usermail = usermail;
		this.userpassword = userpasword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_type_user() {
		return id_type_user;
	}

	public void setId_type_user(int id_type_user) {
		this.id_type_user = id_type_user;
	}

	public int getId_region() {
		return id_region;
	}

	public void setId_region(int id_region) {
		this.id_region = id_region;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsermail() {
		return usermail;
	}

	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpasword(String userpasword) {
		this.userpassword = userpasword;
	}
	
}
