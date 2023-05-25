package it.aresta.viewgenerator.views.dtos;

import it.aresta.viewgenerator.views.enums.FieldSize;
import it.aresta.viewgenerator.views.enums.FieldType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractField<T> extends ViewBaseObject implements Comparable<AbstractField<T>> {

	private String code;
	private Meta meta = new Meta();
	private Object defaultValue;
	private String label;
	private FieldType type;
	private FieldSize size = FieldSize.SMALL;
	private Integer listOrder;
	private EndpointDefinition optionsEndpoint = new EndpointDefinition();
	private Boolean multi;

	
	public AbstractField(String code, String label) {
		this.code = code;
		this.label = label;
	};

	public AbstractField(String code, String label, Meta meta) {
		super();
		this.code = code;
		this.meta = meta;
		this.label = label;

	}

	public AbstractField(String code, String label, Meta meta, T defaultValue) {
		super();
		this.code = code;
		this.meta = meta;
		this.defaultValue = defaultValue;
		this.label = label;
	}


}
