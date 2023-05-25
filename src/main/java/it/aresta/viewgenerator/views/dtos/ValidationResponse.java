package it.aresta.viewgenerator.views.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidationResponse {
		
		private boolean result;
		private String message;
		
     	public ValidationResponse(boolean result, String message) {
			super();
			this.result = result;
			this.message = message;
		}

		public ValidationResponse(boolean result) {
			super();
			this.result = result;
		}

		public ValidationResponse() {
			super();
		}
		
		
	}