package it.aresta.viewgenerator.views.services;

import it.aresta.viewgenerator.views.dtos.RowAction;

public interface RowActionService {

	void deleteById(Long buttonId);

	RowAction save(RowAction rowAction);

	RowAction getRowActionById(Long id);
}
