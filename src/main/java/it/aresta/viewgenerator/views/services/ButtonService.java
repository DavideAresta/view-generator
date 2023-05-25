package it.aresta.viewgenerator.views.services;

import it.aresta.viewgenerator.views.dtos.Button;
import it.aresta.viewgenerator.views.enums.ButtonActionEnum;

public interface ButtonService {

	ButtonActionEnum[] listButtonActionEnum();

	void deleteById(Long buttonId);

	Button save(Button button);

	Button getButtonById(Long id);
}
