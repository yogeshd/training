package com.tractor.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="base",
		 propOrder={"status"})
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class BaseResponse implements Serializable{
	

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5016085031722632343L;
	
	
	/**
	 * status
	 */
    @XmlElement(type=Integer.class)
	private Integer status;


	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

    

   
	
	
	
	

}

