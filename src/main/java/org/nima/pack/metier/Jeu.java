package org.nima.pack.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Jeu {

    @Id @GeneratedValue
    private long id;
    private String titre;
    private double prix;
    private String description;

    @ManyToOne
    private categorie cat;
}