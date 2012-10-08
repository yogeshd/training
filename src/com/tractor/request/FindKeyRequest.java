package com.tractor.request;

import java.io.Serializable;
import javax.validation.Valid;




public class FindKeyRequest implements Serializable {
	
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8326390969645247532L;


	/**
	 * merchant key request
	 */
	@Valid
	private InRequest inRequest;


	public InRequest getInRequest() {
		return inRequest;
	}


	public void setInRequest(InRequest inRequest) {
		this.inRequest = inRequest;
	}
	
	
	

	
	
	
	
	

	
}
