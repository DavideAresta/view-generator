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
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "nov_form")
public class FormEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "model_class_name")
	private String modelClassName;

	@Column(name = "code")
	private String code;
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "list_order")
	private Integer listOrder;

	@OrderBy("list_order ASC")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "form_id")
	private List<FieldEntity> fields;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "form_id")
	private List<ButtonEntity> buttons;
	
	@Embedded
	private EndpointDefinitionEntity submitEndpoint;

}
