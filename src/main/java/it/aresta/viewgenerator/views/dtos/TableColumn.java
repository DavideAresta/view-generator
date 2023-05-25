package it.aresta.viewgenerator.views.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TableColumn extends ViewBaseObject {

	private String code;

	private String label;

	private String type;

	private boolean sortable;

	private boolean filterable;

	private Integer listOrder;
	
	private boolean visibility;


}
