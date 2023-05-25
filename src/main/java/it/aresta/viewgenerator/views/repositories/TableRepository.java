package it.aresta.viewgenerator.views.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aresta.viewgenerator.views.entities.TableEntity;

public interface TableRepository extends JpaRepository<TableEntity, Long> {

}
