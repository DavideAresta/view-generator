package it.aresta.viewgenerator.views.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.enel.next.online.library.domain.services.NextBaseService;
import it.aresta.viewgenerator.views.dtos.NextRowAction;
import it.aresta.viewgenerator.views.services.RowActionService;
import it.aresta.viewgenerator.views.entities.RowActionEntity;
import it.aresta.viewgenerator.views.repositories.RowActionRepository;

@Service
public class NextRowActionService  implements RowActionService {

	@Autowired
	private RowActionRepository rowActionRepository;
	
	@Override
	public void deleteById(Long buttonId) {
		rowActionRepository.delete(buttonId);
	}

	@Override
	public NextRowAction save(NextRowAction rowAction) {
		final RowActionEntity rowActionEntity = orikaMapperFacade.map(rowAction, RowActionEntity.class);
		return orikaMapperFacade.map(rowActionRepository.save(rowActionEntity), NextRowAction.class);
	}

	@Override
	public NextRowAction getRowActionById(Long id) {
		return orikaMapperFacade.map(rowActionRepository.findOne(id), NextRowAction.class);
	}

}
