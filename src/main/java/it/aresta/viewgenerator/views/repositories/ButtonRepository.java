package it.aresta.viewgenerator.views.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aresta.viewgenerator.views.entities.ButtonEntity;

public interface ButtonRepository extends JpaRepository<ButtonEntity, Long> {

}
