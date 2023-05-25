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
@Table(name = "nov_table_column")
public class TableColumnEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "code")
	private String code;

	@Column(name = "label")
	private String label;

	@Column(name = "type")
	private String type;

	@Column(name = "sortable")
	private boolean sortable;

	@Column(name = "filterable")
	private boolean filterable;

	@Column(name = "list_order")
	private Integer listOrder;
	
	@Column(name = "visibility")
	private boolean visibility;
	
}
