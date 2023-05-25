package it.aresta.viewgenerator.views.services;

import it.aresta.viewgenerator.views.dtos.Table;
import it.aresta.viewgenerator.views.dtos.TableColumn;

public interface TableService {

	void deleteById(Long buttonId);

	Table save(Table button);

	Table getById(Long id);

	TableColumn saveColumn(TableColumn tableColumn);

	void deleteColumnById(Long tableColumnId);
}
