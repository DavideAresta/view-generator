package it.aresta.viewgenerator.views.dtos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RowDescriptor<T> {
	private T data;
	private List<Button> buttons;

	public RowDescriptor(T data) {
		super();
		this.data = data;
	}

	public RowDescriptor(T data, List<Button> buttons) {
		super();
		this.data = data;
		this.buttons = buttons;
	}

	public RowDescriptor() {
	}

}
