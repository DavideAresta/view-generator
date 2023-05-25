package it.aresta.viewgenerator.views.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.enel.next.online.library.domain.services.NextBaseService;
import it.aresta.viewgenerator.views.dtos.NextView;
import it.aresta.viewgenerator.views.enums.ViewScenarioType;
import it.aresta.viewgenerator.views.enums.ViewType;
import it.aresta.viewgenerator.views.services.ViewService;
import it.aresta.viewgenerator.views.entities.ViewEntity;
import it.aresta.viewgenerator.views.repositories.ViewRepository;
import ma.glasnost.orika.MapperFacade;

@Service
public class NextViewService  implements ViewService {

	@Autowired
	private ViewRepository viewRepository;
	
	@Autowired
	private MapperFacade mapperFacade;
	
	@Override
	public NextView getView(String commodity, String context, String scenario) throws Exception {
		ViewEntity view = viewRepository.findByCommodityAndContextAndScenario(commodity, context, scenario)
				.orElseThrow(() -> new Exception("Empty view for commodity: " + commodity +", context: " + context + " and scenario: " + scenario));
		return mapperFacade.map(view, NextView.class);
	}

	@Override
	public NextView saveView(NextView view) {
		return mapperFacade.map(viewRepository.save(mapperFacade.map(view, ViewEntity.class)), NextView.class);
	}

	@Override
	public void deleteView(Long viewId) {
		viewRepository.delete(viewId);
	}

	@Override
	public Iterable<?> list() {
		return viewRepository.findAll();
	}

	@Override
	public ViewType[] listViewTypes() {
		return ViewType.values();
	}

	@Override
	public ViewScenarioType[] listViewScenario() {
		return ViewScenarioType.values();
	}

	@Override
	public NextView getViewById(Long id) {
		return orikaMapperFacade.map(viewRepository.findOne(id), NextView.class);
	}

	
}
