package com.tractor.request;


import java.io.Serializable;
import java.util.Locale;



import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;

import org.hibernate.validator.constraints.NotBlank;

import com.tractor.validator.Groups.PersonCreate;
import com.tractor.validator.Groups.PersonGet;

//import com.rakuten.gep.merchant.api.validator.Groups.MerchantCreate;



/**
 * base request
 * 
 * @author sangki.cho
 * @version 1.0
 */
@XmlRootElement
@XmlType(name="basxe",
         propOrder={"clientId","countryCode"})
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class BaseRequest implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2042970280093351725L;

	/**
	 * client id
	 */	
	@NotBlank
	@XmlElement(type=String.class)
	private String clientId;
	
	/**
	 * ISO 3166 alpha-2
	 */	
	
	@NotBlank(groups={PersonCreate.class})
	@XmlElement(type=String.class)
	private String countryCode;
	
		

	
	/**
	 * validator group
	 */
	@XmlTransient
	private Class<?> validatorGroup; 	
	
	
	public BaseRequest(){
		
	}
	
	
	public BaseRequest(String clientId){
		this.clientId = clientId;
	}

	/**
	 * @return the clientId
	 */	
	public String getClientId() {
		return clientId;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}


	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	
	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}


	/**
	 * @return the validatorGroup
	 */
	public Class<?> getValidatorGroup() {
		return validatorGroup;
	}


	/**
	 * @param validatorGroup the validatorGroup to set
	 */
	public void setValidatorGroup(Class<?> validatorGroup) {
		this.validatorGroup = validatorGroup;
	}


	
	
	
	

}

