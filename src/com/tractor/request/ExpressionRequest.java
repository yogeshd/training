package com.tractor.request;


import java.util.HashMap;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;




/**
 * 
 * multilingual expression request
 * 
 * @author sangki.cho
 * @version 1.0
 */
@XmlRootElement
@XmlType(name="expression")
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class ExpressionRequest extends HashMap<String,String>{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4112146434604609122L;
	

}
