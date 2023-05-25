package it.aresta.viewgenerator.views.mappers;

import it.aresta.viewgenerator.views.dtos.Field;
import it.aresta.viewgenerator.views.entities.FieldEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FieldMapper {
    
    Field<?> toDto(FieldEntity entity);
    FieldEntity toEntity(Field<?> field);
}
