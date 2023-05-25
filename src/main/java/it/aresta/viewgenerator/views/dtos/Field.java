package it.aresta.viewgenerator.views.dtos;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.JsonMappingException;

import it.aresta.viewgenerator.views.enums.FieldSize;
import it.aresta.viewgenerator.views.enums.FieldType;
import it.aresta.viewgenerator.views.exceptions.FieldModelException;
import it.aresta.viewgenerator.views.exceptions.FieldTypeException;
import it.aresta.viewgenerator.views.utils.SchemaClassUtility;

@JsonInclude(Include.NON_NULL)
public class Field<T> extends AbstractField<T> {

	public Field() {
		super();
	}
	
	public Field(String name, String label) {
		super(name, label);
	}

	public Field(String name, String label, Meta meta) {
		super(name, label, meta);
	}

	public Field(String name, String label, Meta meta, T defaultValue) {
		super(name, label, meta, defaultValue);
	}

	@Component
	public static class FieldBuilder {

		
		@Autowired
		private SchemaClassUtility schemaClassUtility;
		
		private static final Logger LOGGER = LoggerFactory.getLogger(FieldBuilder.class);

		private Field<?> field;

		public FieldBuilder createField(String name, String label) {
			this.field = new Field<>(name, label);
			return this;
		}

		public Field<?> createTextField(String name, String label) {
			this.field = new Field<>(name, label);
			this.field.setType(FieldType.TEXT);
			withModel(String.class);
			return field;
		}
		
		public Field<?> createDateField(String name, String label) {
			this.field = new Field<>(name, label);
			this.field.setType(FieldType.DATE);
			withModel(LocalDate.class);
			return field;
		}
		
		public Field<?> createDateField(String name, String label, LocalDate defaultValue) {
			createDateField(name, label);
			withDefaultValue(defaultValue);
			return field;
		}
		
		public FieldBuilder withType(FieldType type) {
			this.field.setType(type);
			return this;
		}

		public FieldBuilder withMeta(Meta meta) {
			this.field.setMeta(meta);
			return this;
		}

		public FieldBuilder asAutocomplete(EndpointDefinition optionsEndpoint) {
			field.setDefaultValue(this.field.getDefaultValue());
			field.getMeta().setModel(this.field.getMeta().getModel());
			field.setOptionsEndpoint(optionsEndpoint);
			field.setType(FieldType.AUTOCOMPLETE);
			field.setMulti(false);
			return this;
		}
		
		public FieldBuilder asAutocomplete(String url, List<EndpointParam> params) {
			final EndpointDefinition optionsEndpoint = new EndpointDefinition(url, params);
			field.setOptionsEndpoint(optionsEndpoint);
			field.setDefaultValue(this.field.getDefaultValue());
			field.getMeta().setModel(this.field.getMeta().getModel());
			field.setType(FieldType.AUTOCOMPLETE);
			field.setMulti(false);
			return this;
		}
		
		public FieldBuilder asAutocomplete(String url) {
			final EndpointDefinition optionsEndpoint = new EndpointDefinition(url);			
			field.setDefaultValue(this.field.getDefaultValue());
			field.getMeta().setModel(this.field.getMeta().getModel());
			field.setOptionsEndpoint(optionsEndpoint);
			field.setType(FieldType.AUTOCOMPLETE);
			field.setMulti(false);
			return this;
		}

		public FieldBuilder asList() {
			field.setType(FieldType.LIST);
			field.setDefaultValue(this.field.getDefaultValue());
			field.getMeta().setModel(this.field.getMeta().getModel());
			return this;
		}

		public FieldBuilder withModel(Class<?> clazz) {
			try {
				this.field.getMeta().setModel(schemaClassUtility.getSchemaByClassName(clazz.getName()));
			} catch (JsonMappingException | ClassNotFoundException e) {
				LOGGER.error("Error deserializing class model", e);
			} 
			return this;
		}

		public FieldBuilder withValidators(List<Validator> validators) {
			this.field.getMeta().setValidators(validators);
			return this;
		}

		public FieldBuilder withAsyncValidators(List<AsyncValidator> asyncValidators) {
			this.field.getMeta().setAsyncValidators(asyncValidators);
			return this;
		}

		public FieldBuilder withDefaultValue(Object defaultValue) {
			this.field.setDefaultValue(defaultValue);
			return this;
		}
		
		public FieldBuilder withSize(FieldSize size) {
			this.field.setSize(size);
			return this;
		}
		
		public FieldBuilder withMulti() throws FieldModelException {
			if (this.field.getType() == null || !this.field.getType().equals(FieldType.AUTOCOMPLETE)) {
				throw new FieldModelException("the MULTI property is settable only on AUTOCOMPLETE fields (current field: " + field.getCode() + ")");
			}
			this.field.setMulti(Boolean.TRUE);
			return this;
		}

		public Field<?> build() throws FieldModelException, FieldTypeException {
			
			if (this.field.getType() == null) {
				throw new FieldTypeException("You need to define the type of the next field");
			}
			return field;
		}

	}

	@Override
	public int compareTo(AbstractField<T> o) {
		
		return this.getListOrder() - o.getListOrder();
	}

}
