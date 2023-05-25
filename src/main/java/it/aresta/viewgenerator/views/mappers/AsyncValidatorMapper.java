package it.aresta.viewgenerator.views.mappers;

import org.mapstruct.Mapper;

import it.aresta.viewgenerator.views.dtos.AsyncValidator;
import it.aresta.viewgenerator.views.entities.AsyncValidatorEntity;

@Mapper(componentModel = "spring")
public interface AsyncValidatorMapper {
    
    AsyncValidator toDto(AsyncValidatorEntity buttonEntity);
    AsyncValidatorEntity toEntity(AsyncValidator button);

}
