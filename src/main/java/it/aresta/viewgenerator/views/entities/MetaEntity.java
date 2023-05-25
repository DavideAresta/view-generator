package it.aresta.viewgenerator.views.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "nov_meta")
public class MetaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "meta_id")
	private List<ValidatorEntity> validators;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "meta_id")
	private List<AsyncValidatorEntity> asyncValidators;
	
	@Embedded
	private EndpointDefinitionEntity updateFormState;

	@Column(name = "readonly")
	private Boolean readonly;
	
	@Column(name = "visibility")
	private Boolean visibility;
	
	@Column(name = "disable")
	private Boolean disable;

}
