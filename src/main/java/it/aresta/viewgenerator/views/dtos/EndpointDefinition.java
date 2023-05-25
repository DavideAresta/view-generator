package it.aresta.viewgenerator.views.dtos;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMethod;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EndpointDefinition {

	private String endpointCode;
	private String url;
	private List<EndpointParam> params;
	private RequestMethod method = RequestMethod.GET;

	public EndpointDefinition(String url, List<EndpointParam> params) {
		super();
		this.url = url;
		this.params = params;
	}

	public EndpointDefinition(String uRL) {
		super();
		this.url = uRL;
	}
	
	public EndpointDefinition(String uRL, RequestMethod requestMethod) {
		super();
		this.url = uRL;
		this.method = requestMethod;
	}
	
	public EndpointDefinition(String uRL, RequestMethod requestMethod, List<EndpointParam> queryParams) {
		super();
		this.url = uRL;
		this.params = queryParams;
		this.method = requestMethod;
	}

}
