package com.tractor.aop.validator;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import com.tractor.aop.BaseBeforeAdvice;




/**
 * 
 * abstract validator before advice 
 * @author sangki.cho
 * @version 1.0
 *
 */
public abstract class AbstractValidatorBeforeAdvice extends BaseBeforeAdvice {
	
	
	/**
	 * method name executed
	 */
	private static final String METHOD_NAME="validate";
	/**
	 * validator
	 */
	protected Validator validator;	
	
	
	/**
	 * @param validator the validator to set
	 */
	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	
	

	/**
	 * {@inheritDoc}
	 */
	
	public void before(Method method, Object[] args, Object target) throws Throwable {	
		
		//super.before(method, args, target);

		try{
			
			getClass().getMethod(METHOD_NAME, args[0].getClass()).invoke(this, args[0]);
			
		}catch(InvocationTargetException ite){
			
			//OpenapiException can be cause of InvocationTargetException which occure in reflection.
			throw ite.getTargetException();

		}
		
		
		
	}
	
	/**
	 * 
	 * @param violations
	 * @return
	 */
	protected <T> List<String> getMessageList(Set<ConstraintViolation<T>> violations){
		

		List<String> messageList = new ArrayList<String>();
		
		for (ConstraintViolation<T> violation : violations) {
			
			messageList.add(violation.getPropertyPath().toString() + " " + violation.getMessage());
		}
		
		return messageList;
		
	}
}
