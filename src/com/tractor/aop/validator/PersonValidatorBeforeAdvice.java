package com.tractor.aop.validator;


import java.util.ArrayList;import java.util.List;import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.groups.Default;

import com.tractor.exception.SystemException;
import com.tractor.exception.TractorException;
import com.tractor.exception.ValidationException;
import com.tractor.request.InRequest;


public class PersonValidatorBeforeAdvice extends AbstractValidatorBeforeAdvice{
	
	
	
	
	/**
	 * 
	 * @param from
	 * @throws Throwable
	 */
	public void validate(InRequest from) throws Throwable{	
		

		Set<ConstraintViolation<InRequest>> violations = null;
		
		
		try{			
			
			violations = validator.validate(from,Default.class,from.getValidatorGroup());
			
			if(!violations.isEmpty()){				
				throw new ValidationException("{validation error}");
			}
			
			
		}catch(Throwable t){

			
			List<String> messageList;
			String message;	

			if(t instanceof ValidationException){
				
				
				//in case of validation exception
				message = "{getMerchant}";
				
				messageList = getMessageList(violations);
				
			}else{
				
				
				//in case of another runtime exception
				message  =  "{getMerchant : " + 
			                "{clientId=" + from.getClientId() + "}," +
			                "{merchantId=" + from.getPersonId() + "}}";
				
				t = new SystemException(t);
				
				
				messageList = new ArrayList<String>();
				//TODO:error message
				messageList.add("getMerchant system error");
				
        		
        	}

			

			throw new TractorException(message,messageList,t);
			
			
		}
		
		
	}
	
	
	

}
