package com.tractor.exception;



/**
 * validation exception
 * @author sangki.cho
 * @version 1.0
 *
 */
public class ValidationException extends Exception {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7322063264052703428L;

	public ValidationException(){
		super();
	}


	public ValidationException(String message){
		super(message);
	}
	
	public ValidationException(String message,Throwable t){
		super(message,t);
	}

}
