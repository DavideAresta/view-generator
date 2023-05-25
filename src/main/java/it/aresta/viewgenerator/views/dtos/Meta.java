package it.aresta.viewgenerator.views.dtos;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.module.jsonSchema.JsonSchema;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Meta extends ViewBaseObject {

	private List<Validator> validators = new ArrayList<>();
	private List<AsyncValidator> asyncValidators = new ArrayList<>();
	private JsonSchema model;
	private EndpointDefinition updateFormState;
	private Boolean readonly = false;
	private Boolean visibility = true;
	private Boolean disable = false;

	public Meta() {
		super();
	}

	public Meta(List<Validator> validators) {
		super();
		this.validators = validators;
	}

	public Meta(List<Validator> validators, List<AsyncValidator> asyncValidators) {
		super();

		this.validators = validators;
		this.asyncValidators = asyncValidators;
	}

}
