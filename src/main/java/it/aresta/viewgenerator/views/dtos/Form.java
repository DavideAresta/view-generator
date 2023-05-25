package it.aresta.viewgenerator.views.dtos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.module.jsonSchema.JsonSchema;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Form extends ViewBaseObject {

	private String modelClassName;
	private JsonSchema model;
	private String code;
	private String label;
	private List<Field<?>> fields = new ArrayList<>();
	private Set<Button> buttons = new HashSet<>();
	private EndpointDefinition submitEndpoint;

	private Form(String code, String description) {
		this.code = code;
		this.label = description;
	}

	public void addField(Field<?> field) {
		field.setListOrder(this.getFields().size());
		this.getFields().add(field);
	}

	public void addButton(Button button) {
		this.getButtons().add(button);
	}

	
	public static class NextFormBuilder {

		private Form form;

		public NextFormBuilder createForm(String id, String description) {
			this.form = new Form(id, description);
			return this;
		}

		public NextFormBuilder addField(Field<?> field) {
			this.form.addField(field);
			return this;
		}

		public NextFormBuilder addButton(Button button) {
			this.form.addButton(button);
			return this;
		}

		public Form build() {
			return this.form;
		}
	}

}
