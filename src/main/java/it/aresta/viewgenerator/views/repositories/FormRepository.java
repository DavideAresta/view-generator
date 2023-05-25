package it.aresta.viewgenerator.views.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import it.aresta.viewgenerator.views.entities.FormEntity;

public interface FormRepository extends JpaRepository<FormEntity, Long> {

	List<FormEntity> findByModelClassName(String modelClassName);
}
