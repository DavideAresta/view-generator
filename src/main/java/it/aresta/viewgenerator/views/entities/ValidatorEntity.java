package it.aresta.viewgenerator.views.entities;

import jakarta.persistence.Column;
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
@Table(name = "nov_validator")
public class ValidatorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "type")
	private String type;
	
	@Column(name = "boundary_value")
	private Integer boundaryValue;

	@Column(name = "pattern")
	private String pattern;
	
}
