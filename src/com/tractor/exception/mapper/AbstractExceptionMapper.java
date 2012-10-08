package com.tractor.exception.mapper;




import java.util.Properties;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tractor.exception.AbstractException;
import com.tractor.exception.AuthenticationException;
import com.tractor.exception.AuthorizationException;
import com.tractor.exception.ConflictException;
import com.tractor.exception.DataNotFoundException;
import com.tractor.exception.IllegalDataException;
import com.tractor.exception.ValidationException;
import com.tractor.response.ErrorResponse;

/*
import com.rakuten.gep.merchant.api.exception.AbstractException;
import com.rakuten.gep.merchant.api.exception.AuthenticationException;
import com.rakuten.gep.merchant.api.exception.AuthorizationException;
import com.rakuten.gep.merchant.api.exception.ConflictException;
import com.rakuten.gep.merchant.api.exception.DataNotFoundException;
import com.rakuten.gep.merchant.api.exception.IllegalDataException;
import com.rakuten.gep.merchant.api.exception.ValidationException;
import com.rakuten.gep.merchant.api.response.ErrorResponse;
*/


/**
 * 
 * @author sangki.cho
 * @version 1.0
 *
 */
public abstract class AbstractExceptionMapper<E extends Throwable> implements ExceptionMapper<E>{
	
	
	/**
	 * warn logger
	 */
	protected static final Logger warn = LoggerFactory.getLogger("log.warn");
	
	/**
	 * error logger
	 */
	protected static final Logger error = LoggerFactory.getLogger("log.error");
	
	/**
	 * fatal logger
	 */
	//protected static final Logger fatal = LoggerFactory.getLogger("log.fatal");
	
	
	/**
	 * properties
	 */
	protected Properties properties;
	
	/**
	 * response content type
	 */
	protected String contentType = "application/json;charset=utf-8";
	
	
	/**
	 * set properties 
	 * @param properties properties
	 */
	public void setProperties(Properties properties){
		this.properties = properties;
	}	
	
	
	/**
	 * set response content type
	 * @param contentType response content type
	 */
	public void setContentType(String contentType){
		
		this.contentType = contentType;
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Response toResponse(E e) {
		
		log(e);
		
		//in case error,set HTTP status code to 500 in default.
		Status status = Response.Status.INTERNAL_SERVER_ERROR;
		ErrorResponse error = new ErrorResponse();
		error.setMessage(((AbstractException)e).getMessageList());
		
		
    	
    	if(e.getCause() instanceof ValidationException){
			
			
    		//in case of validation error,set HTTP status code to 400.
    		status = Response.Status.BAD_REQUEST;
			
		}else if(e.getCause() instanceof ConflictException){			
			
			//in case of conflict error,set HTTP status code to 409.
    		status = Response.Status.CONFLICT;
			
		}else if(e.getCause() instanceof AuthenticationException || e.getCause() instanceof AuthorizationException){
			
			//in case of authentication or authorized error,set HTTP status code to 401.
    		status = Response.Status.UNAUTHORIZED;
			
		}else if(e.getCause() instanceof DataNotFoundException){
			
			//in case of data not found error,set HTTP status code to 404.
    		status = Response.Status.NOT_FOUND;
			
		}
    	
    	error.setStatus(status.getStatusCode());
    	
		return Response.status(status).entity(error).header("Content-type",contentType).build();

	}
	
	/**
	 * {@inheritDoc}
	 */
	protected void log(Throwable t) {
		

		if((t.getCause() instanceof AuthenticationException || 
			t.getCause() instanceof AuthorizationException ||
			t.getCause() instanceof ValidationException || 
			t.getCause() instanceof ConflictException ||
			t.getCause() instanceof DataNotFoundException) && warn.isWarnEnabled()){
				
				
			    //authentication,authorization,validation,conflict,data not found(400 status)
				warn.warn(t.getMessage() + t.getCause().getMessage(),t.getCause());
				
				
				
			}else if(t.getCause() instanceof IllegalDataException && error.isErrorEnabled()){
				
				//illegal data(500 status)
				error.error(t.getMessage() + t.getCause().getMessage(),t.getCause());
				
				
			}else if(error.isErrorEnabled()) {
				
				//the others(500 status)
				error.error(t.getMessage() + t.getCause().getMessage(),t.getCause());
			}
		
	}
	
	

}
