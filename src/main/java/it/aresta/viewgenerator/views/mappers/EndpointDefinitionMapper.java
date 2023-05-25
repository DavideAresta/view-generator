package it.aresta.viewgenerator.views.mappers;

import org.mapstruct.Mapper;

import it.aresta.viewgenerator.views.dtos.EndpointDefinition;
import it.aresta.viewgenerator.views.entities.EndpointDefinitionEntity;

@Mapper(componentModel = "spring")
public interface EndpointDefinitionMapper {
    
    EndpointDefinition toDto(EndpointDefinitionEntity definitionEntity);
    EndpointDefinitionEntity toEntity(EndpointDefinition definition);
}
