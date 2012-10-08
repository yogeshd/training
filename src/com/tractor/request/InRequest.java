package com.tractor.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.tractor.validator.Groups.PersonCreate;



@XmlRootElement
@XmlType(name="xxx",
         propOrder={"name", "personId"})
@XmlAccessorType(XmlAccessType.FIELD)
public class InRequest extends BaseRequest{

private static final long serialVersionUID = 2080346689473283409L;
	@NotNull(groups=PersonCreate.class)
	@Size(min=1,max=25)	
	@Pattern(regexp="([a-zA-Z0-9]|\\s)+")
	@XmlElement(type=String.class)
	private String name;
	
	@Size(min=1,max=25)	
	@Pattern(regexp="([a-zA-Z0-9]|\\s)+")
	@XmlElement(type=String.class)
	private String personId;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}
  
}
