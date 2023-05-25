package it.aresta.viewgenerator.views.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name = "nov_view")
public class ViewEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "commodity")
	private String commodity;

	@Column(name = "context")
	private String context;

	@Column(name = "scenario")
	private String scenario;

	@Column(name = "label")
	private String label;

	@Column(name = "view_type")
	private String viewType;

	@OrderBy("list_order ASC")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "view_id")
	private List<FormEntity> forms;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "view_id")
	private List<TableEntity> tables;

}
