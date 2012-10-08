package com.tractor.exception;


/**
 * authentication exception
 * 
 * @author sangki.cho
 * @version 1.0
 *
 */
public class AuthenticationException extends Exception {
	
	

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3286166902649166521L;

	/**
	 * default constructor
	 */
	public AuthenticationException(){		
		super();
	}
	
	/**
	 * constructor receiving message
	 * @param message
	 */
	public AuthenticationException(String message){
		super(message);
	}
	
	/**
	 * constructor receiving cause
	 * @param cause
	 */
	public AuthenticationException(Throwable cause){
		super(cause);
	}
	
	/**
	 * constructor receiving message and cause
	 * @param message
	 * @param cause
	 */
	public AuthenticationException(String message,Throwable cause){
		super(message,cause);
	}

}
