package it.aresta.viewgenerator.views.services;

import it.aresta.viewgenerator.views.dtos.NextView;
import it.aresta.viewgenerator.views.enums.ViewScenarioType;
import it.aresta.viewgenerator.views.enums.ViewType;

public interface ViewService {

	NextView getView(String commodity, String context, String scenario) throws Exception;
	
	NextView saveView(NextView view) throws Exception;

	void deleteView(Long viewId);
	
	Iterable<?> list();
	
	ViewType[] listViewTypes();
	
	ViewScenarioType[] listViewScenario();

	NextView getViewById(Long id);
	
}
