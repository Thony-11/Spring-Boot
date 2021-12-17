package com.example.signalement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.signalement.models.Utilisateur;
import com.example.signalement.repository.UtilisateurRepository;
import com.example.signalement.staus.Response;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
public class UtilisateurController {
	private int status_error = 404;
    private int status_success = 200;

    
	@Autowired
    private UtilisateurRepository utilisateurRepository;

	@GetMapping("utilisateur/all")
    public List<Utilisateur> getAllUtilisateur() {
        return (List<Utilisateur>) utilisateurRepository.findAll();
    }
	
	@PostMapping("login/admin")
	public Response loginAdmin(@RequestBody Utilisateur data) {
		Utilisateur log = utilisateurRepository.findByUsermailAndUserpassword(data.getUsermail(),data.getUserpassword());
		Response resp = new Response();
		if(log == null) {
			resp = new Response(status_error,"Identifiant incorrecte!");
		}else {
			resp = new Response(status_success,"Connexion réussie!",log);
		}
		return resp;
	}

}
