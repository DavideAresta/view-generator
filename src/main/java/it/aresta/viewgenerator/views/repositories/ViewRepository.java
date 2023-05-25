package it.aresta.viewgenerator.views.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aresta.viewgenerator.views.entities.ViewEntity;

public interface ViewRepository extends JpaRepository<ViewEntity, Long> {

	Optional<ViewEntity> findByCommodityAndContextAndScenario(String commodity, String context, String scenario);
}
