package it.aresta.viewgenerator.views.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.aresta.viewgenerator.views.dtos.Form;
import it.aresta.viewgenerator.views.entities.FormEntity;

@Mapper(componentModel = "spring")
public interface FormMapper {

    Form toDto(FormEntity entity);

    @Mapping(target = "fields", ignore = true)
    FormEntity toEntity(Form form);
    
}
