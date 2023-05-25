package it.aresta.viewgenerator.views.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.enel.next.online.library.domain.services.NextBaseService;
import it.aresta.viewgenerator.views.dtos.NextField;
import it.aresta.viewgenerator.views.enums.FieldSize;
import it.aresta.viewgenerator.views.enums.FieldType;
import it.aresta.viewgenerator.views.services.FieldService;
import it.aresta.viewgenerator.views.entities.FieldEntity;
import it.aresta.viewgenerator.views.repositories.FieldRepository;
import it.aresta.viewgenerator.views.repositories.ValidationRepository;

@Service
public class NextFieldService  implements FieldService {

	@Autowired
	private FieldRepository fieldRepository;

	@Override
	public FieldSize[] listFieldSize() {
		return FieldSize.values();
	}

	@Override
	public FieldType[] listFieldType() {
		return FieldType.values();
	}

	@Override
	public NextField<?> save(NextField<?> field) {
		return orikaMapperFacade.map(fieldRepository.save(orikaMapperFacade.map(field, FieldEntity.class)),
				NextField.class);
	}

	@Override
	public NextField<?> getFieldById(Long id) {
		return orikaMapperFacade.map(fieldRepository.findOne(id), NextField.class);
	}

	@Override
	public void deleteField(Long id) {
		fieldRepository.delete(id);

	}

}
