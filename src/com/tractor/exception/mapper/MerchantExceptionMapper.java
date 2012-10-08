package com.tractor.exception.mapper;



import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;


import com.sun.jersey.api.spring.Autowire;
import com.sun.jersey.api.spring.AutowireMode;
import com.sun.jersey.spi.resource.Singleton;
import com.tractor.exception.TractorException;


/**
 * merchant exception handler
 * 
 * @author sangki.cho
 * @version 1.0
 *
 */
@Singleton
@Autowire(mode=AutowireMode.BY_NAME)
@Provider
public class MerchantExceptionMapper extends AbstractExceptionMapper<TractorException> {	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Response toResponse(TractorException e) {		
		
		return super.toResponse(e);
	}	
	
}
