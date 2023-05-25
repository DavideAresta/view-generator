package it.aresta.viewgenerator.views.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.enel.next.online.library.domain.services.NextBaseService;
import it.aresta.viewgenerator.views.enums.ValidationType;
import it.aresta.viewgenerator.views.services.ValidationService;
import it.aresta.viewgenerator.views.repositories.ValidationRepository;

@Service
public class NextValidationService  implements ValidationService  {

	@Autowired
	private ValidationRepository validatorRepository;

	@Override
	public ValidationType[] listValidationType() {
		return ValidationType.values();
	}
	
	@Override
	public void deleteValidator(Long id) {
		validatorRepository.delete(id);
	}

}
	