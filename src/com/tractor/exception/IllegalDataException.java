package com.tractor.exception;

/** 
 * illegal data exception
 * 
 * @author sangki.cho
 * @version 1.0
 *
 */
public class IllegalDataException extends Exception {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -129255703399446148L;

	public IllegalDataException(String message){
		super(message);
		
	}

}
