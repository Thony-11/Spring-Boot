package com.example.signalement.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.signalement.models.Utilisateur;

@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {
	public Utilisateur findByUsermailAndUserpassword(String usermail,String userpassword);
}
