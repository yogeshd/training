package com.tractor.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.sun.jersey.api.spring.Autowire;
import com.sun.jersey.api.spring.AutowireMode;
import com.sun.jersey.spi.resource.Singleton;
import com.tractor.converter.facade.TractorConversionServiceFacade;
import com.tractor.entity.InEntity;
import com.tractor.entity.OutEntity;
import com.tractor.exception.TractorException;
import com.tractor.request.InRequest;
import com.tractor.response.OutResponse;
import com.tractor.validator.Groups.PersonCreate;

@Singleton
@Controller
@Autowire(mode=AutowireMode.BY_NAME)
@Path("tractor")
public class TractorResource {
	
	
	
	private com.tractor.converter.facade.TractorConversionServiceFacade tractorConversionServiceFacade;
	
	@Autowired
	private com.tractor.businesslogic.CreatePersonBusinessLogic businessLogic;
	

	public void setTractorConversionServiceFacade(
			TractorConversionServiceFacade tractorConversionServiceFacade) {
		this.tractorConversionServiceFacade = tractorConversionServiceFacade;
	}



	@Path("/create")
	@POST
	@Consumes("application/json")		
	@Produces("application/json")
	public OutResponse createTractor(@HeaderParam("X-Client-Id") String clientId,InRequest inRequest) throws TractorException
	{
		inRequest.setClientId(clientId);
		inRequest.setValidatorGroup(PersonCreate.class);
		InEntity to=new InEntity();
		OutResponse outResponse=new OutResponse();
		
		to=tractorConversionServiceFacade.convertRequest(inRequest, to);
		
		OutEntity out=businessLogic.createUser(to);		
		
		return tractorConversionServiceFacade.convertResponse(out,outResponse);
		
		
	}

}
