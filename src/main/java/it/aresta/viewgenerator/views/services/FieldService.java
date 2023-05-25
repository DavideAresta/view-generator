package it.aresta.viewgenerator.views.services;

import it.aresta.viewgenerator.views.dtos.Field;
import it.aresta.viewgenerator.views.enums.FieldSize;
import it.aresta.viewgenerator.views.enums.FieldType;

public interface FieldService {

	FieldSize[] listFieldSize();
	FieldType[] listFieldType();
	Field<?> save(Field<?>  field);
	Field<?> getFieldById(Long id);
	void deleteField(Long id);
}
