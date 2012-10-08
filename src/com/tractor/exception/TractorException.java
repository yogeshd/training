package com.tractor.exception;

import java.util.List;


/** 
 * merchant exception
 * 
 * @author sangki.cho
 * @version 1.0
 *
 */
public class TractorException extends AbstractException {
	


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5908657451054907895L;

	/**
	 * 
	 * @param message
	 */
	public TractorException(String message){
		super(message);
		
	}
	

	/**
	 * 
	 * @param message
	 * @param throwable
	 */
	public TractorException(String message,Throwable throwable){
		
		super(message,throwable);
		
	}
	
	/**
	 * 
	 * @param message
	 * @param messageList
	 * @param throwable
	 */
	public TractorException(String message,List<String> messageList,Throwable throwable){
		
		super(message,messageList,throwable);
		
	}


	

}
