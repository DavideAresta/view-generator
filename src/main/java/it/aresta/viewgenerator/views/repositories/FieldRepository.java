package it.aresta.viewgenerator.views.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import it.aresta.viewgenerator.views.entities.FieldEntity;

public interface FieldRepository extends JpaRepository<FieldEntity, Long> {

}
