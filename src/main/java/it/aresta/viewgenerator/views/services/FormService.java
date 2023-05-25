package it.aresta.viewgenerator.views.services;

import java.util.List;

import it.aresta.viewgenerator.views.dtos.Form;

public interface FormService {

	Form saveForm(Form form);

	void deleteForm(Long formId);

	Form getFormById(Long id);

	List<String> getFormCodeListByModelClassName(String modelClassName);
}
