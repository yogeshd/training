package com.tractor.exception;


/**
 * system exception 
 * 
 * @author sangki.cho
 * @version 1.0
 *
 */
public class SystemException extends RuntimeException {
	
	

	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2630319608628077858L;


	/**
	 * default constructor
	 */
	public SystemException(){		
		super();
	}
	
	
	/**
	 * constructor having message
	 * @param message
	 */
	public SystemException(String message){
		super(message);
	}
	
	
	/**
	 * constructor having cause
	 * @param cause
	 */
	public SystemException(Throwable cause){
		super(cause);
	}
	
	
	/**
	 * constructor having message and cause
	 * @param message
	 * @param cause
	 */
	public SystemException(String message,Throwable cause){
		super(message,cause);
	}

}
