package it.aresta.viewgenerator.views.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Embeddable
public class EndpointParamEntity {

	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private String type;

}
