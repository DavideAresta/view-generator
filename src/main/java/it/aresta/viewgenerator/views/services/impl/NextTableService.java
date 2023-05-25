package it.aresta.viewgenerator.views.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.enel.next.online.library.domain.services.NextBaseService;
import it.aresta.viewgenerator.views.dtos.NextTable;
import it.aresta.viewgenerator.views.dtos.NextTableColumn;
import it.aresta.viewgenerator.views.services.TableService;
import it.aresta.viewgenerator.views.entities.TableColumnEntity;
import it.aresta.viewgenerator.views.entities.TableEntity;
import it.aresta.viewgenerator.views.repositories.TableColumnRepository;
import it.aresta.viewgenerator.views.repositories.TableRepository;

@Service
public class NextTableService  implements TableService {

	@Autowired
	private TableRepository tableRepository;
	
	@Autowired
	private TableColumnRepository tableColumnRepository;

	@Override
	public void deleteById(Long buttonId) {
		tableRepository.delete(buttonId);
	}

	@Override
	public NextTable save(NextTable table) {
		return orikaMapperFacade.map(tableRepository.save(orikaMapperFacade.map(table, TableEntity.class)),
				NextTable.class);
	}

	@Override
	public NextTable getById(Long id) {
		return orikaMapperFacade.map(tableRepository.findOne(id), NextTable.class);
	}

	@Override
	public NextTableColumn saveColumn(NextTableColumn tableColumn) {
		return orikaMapperFacade.map(tableColumnRepository.save(orikaMapperFacade.map(tableColumn, TableColumnEntity.class)),
				NextTableColumn.class);
	}

	@Override
	public void deleteColumnById(Long tableColumnId) {
		tableColumnRepository.delete(tableColumnId);
		
	}

}
