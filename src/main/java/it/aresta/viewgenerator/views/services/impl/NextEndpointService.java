package it.aresta.viewgenerator.views.services.impl;

import org.springframework.stereotype.Service;

import it.aresta.viewgenerator.views.enums.EndpointParamType;
import it.aresta.viewgenerator.views.services.EndpointService;

@Service
public class NextEndpointService implements EndpointService {

	@Override
	public EndpointParamType[] listEndpointParamType() {
		return EndpointParamType.values();
	}


}
