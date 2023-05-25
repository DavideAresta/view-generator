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
@Table(name = "nov_table")
public class TableEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	private EndpointDefinitionEntity apiEndpoint;

	@Column(name = "code")
	private String code;

	@Column(name = "label")
	private String label;

	@Column(name = "model_class_name")
	private String modelClassName;

	@OrderBy("list_order ASC")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "table_id")
	private List<TableColumnEntity> columns;

	@Column(name = "type")
	private String type;

	@Column(name = "api_model_class_name")
	private String apiModelClassName;

	@Column(name = "form_code")
	private String formCode;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "table_id")
	private List<RowActionEntity> rowActions;

}
