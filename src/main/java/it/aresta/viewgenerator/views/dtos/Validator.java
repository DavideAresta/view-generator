package it.aresta.viewgenerator.views.dtos;

import it.aresta.viewgenerator.views.enums.ValidationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Validator extends ViewBaseObject  {

	private ValidationType type;
	private Integer boundaryValue;
	private String pattern;

}
