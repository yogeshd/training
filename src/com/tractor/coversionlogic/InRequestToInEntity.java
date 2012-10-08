package com.tractor.coversionlogic;

import com.tractor.converter.AbstractConverter;
import com.tractor.entity.InEntity;
import com.tractor.request.InRequest;

public class InRequestToInEntity extends AbstractConverter<InRequest, InEntity> {

	@Override
	public InEntity convert(InRequest source) {
		
		InEntity entity=new InEntity();
		
		entity.setWhatname(source.getName());
		entity.setWhatpersonid(source.getPersonId());
		// TODO Auto-generated method stub
		return entity;
	}
	

}
