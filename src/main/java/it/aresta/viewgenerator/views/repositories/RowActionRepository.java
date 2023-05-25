package it.aresta.viewgenerator.views.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aresta.viewgenerator.views.entities.RowActionEntity;

public interface RowActionRepository extends JpaRepository<RowActionEntity, Long> {

}
