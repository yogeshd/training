package com.tractor.exception;


/**
 * authorization exception
 * 
 * @author sangki.cho
 * @version 1.0
 *
 */
public class AuthorizationException extends Exception {
	

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 9151088765522168838L;

	/**
	 * default constructor
	 */
	public AuthorizationException(){		
		super();
	}
	
	/**
	 * constructor receiving message
	 * @param message
	 */
	public AuthorizationException(String message){
		super(message);
	}
	
	/**
	 * constructor receiving cause
	 * @param cause
	 */
	public AuthorizationException(Throwable cause){
		super(cause);
	}
	
	
	/**
	 * constructor receiving message and cause
	 * @param message
	 * @param cause
	 */
	public AuthorizationException(String message,Throwable cause){
		super(message,cause);
	}

}
