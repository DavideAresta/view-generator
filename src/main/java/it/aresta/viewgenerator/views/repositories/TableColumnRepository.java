package it.aresta.viewgenerator.views.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aresta.viewgenerator.views.entities.TableColumnEntity;

public interface TableColumnRepository extends JpaRepository<TableColumnEntity, Long> {

}
