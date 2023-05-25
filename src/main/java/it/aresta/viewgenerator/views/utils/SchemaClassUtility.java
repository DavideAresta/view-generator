package it.aresta.viewgenerator.views.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;

@Component
public class SchemaClassUtility {
	
	@Autowired
	private ObjectMapper objectMapper;
	
	public JsonSchema getSchemaByClassName(String className) throws JsonMappingException, ClassNotFoundException {
		Class<?> clazz = Class.forName(className);		
		final SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
		visitor.setVisitorContext(new VisitorContextWithoutSchemaInlining());
		objectMapper.writer().acceptJsonFormatVisitor(clazz, visitor);
		final JsonSchema jsonSchema = visitor.finalSchema();
		return jsonSchema;
	}
	
}
