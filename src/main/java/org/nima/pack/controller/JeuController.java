package org.nima.pack.controller;

import org.nima.pack.metier.Jeu;
import org.nima.pack.repository.JeuRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class JeuController {
    private JeuRepository j;

    public JeuController(JeuRepository j) {
        this.j = j;
    }

    @PostMapping(path = "/jeux/create")
    public void ajoutJeu(@RequestBody Jeu jeu){
        j.save(jeu);
    }
    
}