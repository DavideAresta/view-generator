package it.aresta.viewgenerator.views.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AsyncValidator extends ViewBaseObject  {

	private EndpointDefinition validationEndpoint;

}
