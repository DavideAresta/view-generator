package it.aresta.viewgenerator.views.dtos;

import java.util.List;

import it.aresta.viewgenerator.views.enums.TableTypeEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Table extends ViewBaseObject {

	private String apiModelClassName;

	private EndpointDefinition apiEndpoint;

	private String code;

	private String label;

	private String modelClassName;

	private List<TableColumn> columns;

	private TableTypeEnum type;

	private String formCode;

	private List<RowAction> rowActions;

}
