package com.tractor.exception;

import java.util.List;


/** 
 * abstract exception
 * 
 * @author sangki.cho
 * @version 1.0
 *
 */
public abstract class AbstractException extends Exception {
	

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1651199708433151614L;
	
	/**
	 * message list
	 */
	private List<String> messageList;
	

	/**
	 * 
	 * @param message
	 */
	public AbstractException(String message){
		super(message);
		
	}
	

	/**
	 * 
	 * @param message
	 * @param throwable
	 */
	public AbstractException(String message,Throwable throwable){
		
		super(message,throwable);
		
	}
	
	/**
	 * 
	 * @param message
	 * @param messageList
	 * @param throwable
	 */
	public AbstractException(String message,List<String> messageList,Throwable throwable){
		
		super(message,throwable);
		this.messageList = messageList;
		
	}


	/**
	 * @return the messageList
	 */
	public List<String> getMessageList() {
		return messageList;
	}


	/**
	 * @param messageList the messageList to set
	 */
	public void setMessageList(List<String> messageList) {
		this.messageList = messageList;
	}	
	
	

}
