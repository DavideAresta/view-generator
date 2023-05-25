package it.aresta.viewgenerator.views.utils;

import java.time.LocalDate;
import java.util.UUID;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.module.jsonSchema.factories.VisitorContext;

public class VisitorContextWithoutSchemaInlining extends VisitorContext {

	@Override
	public String javaTypeToUrn(JavaType jt) {
		return super.javaTypeToUrn(jt);
	}

	@Override
	public String addSeenSchemaUri(final JavaType aSeenSchema) {
		return getSeenSchemaUri(aSeenSchema);
	}

	@Override
	public String getSeenSchemaUri(final JavaType aSeenSchema) {
		return isEligibleForInlineSchema(aSeenSchema) ? javaTypeToUrn(aSeenSchema) : null;
	}

	private boolean isEligibleForInlineSchema(final JavaType type) {
		return type.getRawClass() != String.class && !isBoxedPrimitive(type) && !type.isPrimitive()
				&& !type.isMapLikeType() && !type.isCollectionLikeType() && (type.getRawClass() == LocalDate.class || type.getRawClass() == UUID.class);
	}

	private boolean isBoxedPrimitive(final JavaType type) {
		return type.getRawClass() == Boolean.class || type.getRawClass() == Byte.class
				|| type.getRawClass() == Long.class || type.getRawClass() == Integer.class
				|| type.getRawClass() == Short.class || type.getRawClass() == Float.class
				|| type.getRawClass() == Double.class;
	}
}