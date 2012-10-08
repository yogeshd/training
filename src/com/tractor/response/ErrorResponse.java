package com.tractor.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;


/**
 * error response
 * 
 * @author skcho
 * @version 1.0
 *
 */
@XmlRootElement
@XmlType(name="error",
         propOrder={"message"})
@XmlAccessorType(XmlAccessType.FIELD)
public class ErrorResponse extends BaseResponse{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -9032494931727369764L;
	
	 /**
     * message
     */
    @XmlElement(type=String.class)
    private List<String> message;

	/**
	 * @return the message
	 */
	public List<String> getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(List<String> message) {
		this.message = message;
	}
    
    
	
	
		
	
	

}
