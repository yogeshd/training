package com.tractor.exception;



/** 
 * data inconsistent exception
 * @author sangki.cho
 * @version 1.0
 *
 */
public class ConflictException extends Exception {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 618688062709754795L;

	public ConflictException(){
		super();
	}


	public ConflictException(String message){
		super(message);
	}
	
	public ConflictException(String message,Throwable t){
		super(message,t);
	}

}
