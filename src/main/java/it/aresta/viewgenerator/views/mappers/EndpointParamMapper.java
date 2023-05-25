package it.aresta.viewgenerator.views.mappers;

import org.mapstruct.Mapper;

import it.aresta.viewgenerator.views.dtos.EndpointParam;
import it.aresta.viewgenerator.views.entities.EndpointParamEntity;

@Mapper(componentModel = "spring")
public interface EndpointParamMapper {
    
    EndpointParam toDto(EndpointParamEntity definitionEntity);
    EndpointParamEntity toEntity(EndpointParam definition);
}
