package it.aresta.viewgenerator.views.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "nov_field")
public class FieldEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "code")
	private String code;

	@Column(name = "label")
	private String label;

	@Column(name = "type")
	private String type;

	@Column(name = "size")
	private String size;

	@Column(name = "list_order")
	private Integer listOrder;

	@Column(name = "multi")
	private Boolean multi;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "meta_id", referencedColumnName = "id")
	private MetaEntity meta;

	@Embedded
	private EndpointDefinitionEntity optionsEndpoint;
	
	@Lob
	@Column(name = "default_value")
	private String defaultValue;

}
