package com.example.signalement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.signalement.models.Region;
import com.example.signalement.repository.RegionRepository;
import com.example.signalement.staus.Response;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
public class RegionController {
	private int status_error = 404;
    private int status_success = 200;
    
	@Autowired
	private RegionRepository regionRepository;
	
	
	@GetMapping("region/all")
    public Response getAllUtilisateur() {
		Response resp = new Response();
        try {
        	List<Region> list =  (List<Region>) regionRepository.findAll();
        	resp = new Response(status_success,"Success",list);
        }
        catch(Exception ex) {
        	resp = new Response(status_error,"Serveur error");
        }
        return resp;
    } 
}
