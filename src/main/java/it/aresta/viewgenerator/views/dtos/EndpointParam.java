package it.aresta.viewgenerator.views.dtos;

import it.aresta.viewgenerator.views.enums.EndpointParamType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EndpointParam extends ViewBaseObject {

	private String name;
	private EndpointParamType type;
	
}
