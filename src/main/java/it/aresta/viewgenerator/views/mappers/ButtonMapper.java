package it.aresta.viewgenerator.views.mappers;

import org.mapstruct.Mapper;

import it.aresta.viewgenerator.views.dtos.Button;
import it.aresta.viewgenerator.views.entities.ButtonEntity;

@Mapper(componentModel = "spring")
public interface ButtonMapper {
    Button toDto(ButtonEntity buttonEntity);
    ButtonEntity toEntity(Button button);
}
