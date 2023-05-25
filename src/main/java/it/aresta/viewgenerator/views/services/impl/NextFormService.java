package it.aresta.viewgenerator.views.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.enel.next.online.library.domain.services.NextBaseService;
import it.aresta.viewgenerator.views.dtos.NextForm;
import it.aresta.viewgenerator.views.services.FormService;
import it.aresta.viewgenerator.views.entities.FormEntity;
import it.aresta.viewgenerator.views.repositories.FormRepository;

@Service
public class NextFormService  implements FormService {

	@Autowired
	private FormRepository formRepository;

	@Override
	public NextForm saveForm(NextForm form) {
		return orikaMapperFacade.map(formRepository.save(orikaMapperFacade.map(form, FormEntity.class)),
				NextForm.class);
	}

	@Override
	public void deleteForm(Long formId) {
		formRepository.delete(formId);
	}

	@Override
	public NextForm getFormById(Long id) {
		return orikaMapperFacade.map(formRepository.findOne(id), NextForm.class);
	}

	@Override
	public List<String> getFormCodeListByModelClassName(String modelClassName) {
		return formRepository.findByModelClassName(modelClassName).stream().map( form -> form.getCode()).collect(Collectors.toList());
	}

}
