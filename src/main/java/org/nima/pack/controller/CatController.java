package org.nima.pack.controller;

import java.util.List;

import org.nima.pack.metier.categorie;
import org.nima.pack.repository.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CatController {
	@Autowired
	CatRepo crepo;
	@PostMapping(path = "/categorie/create")
	public void ajouterCategorie(@RequestBody categorie c){
		crepo.save(c);
	}
	@GetMapping(path = "categorie")
	public List<categorie> getCategorie() {
		return crepo.findAll();
	}
}
