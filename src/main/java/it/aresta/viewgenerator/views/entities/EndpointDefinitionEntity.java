package it.aresta.viewgenerator.views.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Embeddable
public class EndpointDefinitionEntity {

	@Column(name = "endpoint_code")
	private String endpointCode;

	@Column(name = "url")
	private String url;

	@ElementCollection
	private List<EndpointParamEntity> params;

	@Column(name = "method")
	private String method;
}
