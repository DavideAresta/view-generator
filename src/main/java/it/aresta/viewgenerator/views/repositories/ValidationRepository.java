package it.aresta.viewgenerator.views.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aresta.viewgenerator.views.entities.ValidatorEntity;

public interface ValidationRepository extends JpaRepository<ValidatorEntity, Long> {

}
