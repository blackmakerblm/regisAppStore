package org.nima.pack.repository;

import org.nima.pack.metier.categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepo extends JpaRepository <categorie,Long> {
}