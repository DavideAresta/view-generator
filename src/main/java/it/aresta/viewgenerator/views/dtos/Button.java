package it.aresta.viewgenerator.views.dtos;

import it.aresta.viewgenerator.views.enums.ButtonActionEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Button extends ViewBaseObject {

	private String label;
	private ButtonActionEnum action;
	private String code;
	private EndpointDefinition endpointDefinition;
	private Boolean visibility;
	private String context;
	private String commodity;
	private String scenario;
	private String okMessage;

	public Button(String code, String label, ButtonActionEnum action) {
		super();
		this.code = code;
		this.label = label;
		this.action = action;
	}

	public Button(String code, String label, ButtonActionEnum action, EndpointDefinition endpointDefinition) {
		super();
		this.code = code;
		this.label = label;
		this.action = action;
		this.endpointDefinition = endpointDefinition;
	}

		
}
