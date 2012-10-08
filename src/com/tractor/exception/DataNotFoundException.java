package com.tractor.exception;

/** 
 * data not found exception
 * 
 * @author sangki.cho
 * @version 1.0
 *
 */
public class DataNotFoundException extends Exception {
	
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -800174784904909133L;

	public DataNotFoundException(String message){
		super(message);
		
	}

}
