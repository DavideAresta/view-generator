package it.aresta.viewgenerator.views.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "nov_button")
public class ButtonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "label")
	private String label;

	@Column(name = "code")
	private String code;

	@Column(name = "action")
	private String action;

	@Column(name = "visibility")
	private Boolean visibility;

	@Embedded
	private EndpointDefinitionEntity endpointDefinition;

	@Column(name = "context")
	private String context;

	@Column(name = "commodity")
	private String commodity;

	@Column(name = "scenario")
	private String scenario;
	
	@Column(name = "ok_message")
	private String okMessage;

}
