package it.aresta.viewgenerator.views.services;

import it.aresta.viewgenerator.views.enums.ValidationType;

public interface ValidationService {

	ValidationType[] listValidationType();
	
	void deleteValidator(Long id);
}
