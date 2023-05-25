package it.aresta.viewgenerator.views.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aresta.viewgenerator.views.enums.ButtonActionEnum;
import it.aresta.viewgenerator.views.services.ButtonService;
import it.aresta.viewgenerator.views.dtos.Button;
import it.aresta.viewgenerator.views.entities.ButtonEntity;
import it.aresta.viewgenerator.views.repositories.ButtonRepository;

@Service
public class ButtonServiceImpl  implements ButtonService {

	@Autowired
	private ButtonRepository buttonRepository;
	
	@Override
	public ButtonActionEnum[] listButtonActionEnum() {
		return ButtonActionEnum.values();
	}

	@Override
	public void deleteById(Long buttonId) {
		buttonRepository.deleteById(buttonId);
	}

	@Override
	public Button save(Button button) {
		final ButtonEntity buttonEntity = orikaMapperFacade.map(button, ButtonEntity.class);
		return orikaMapperFacade.map(buttonRepository.save(buttonEntity), Button.class);
	}

	@Override
	public Button getButtonById(Long id) {
		return orikaMapperFacade.map(buttonRepository.findById(id), Button.class);
	}

}
