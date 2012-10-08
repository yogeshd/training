package com.tractor.businesslogic.impl;

import org.springframework.stereotype.Component;

import com.tractor.businesslogic.CreatePersonBusinessLogic;
import com.tractor.entity.InEntity;
import com.tractor.entity.OutEntity;
import com.tractor.exception.TractorException;
@Component
public class CreatePersonBusinessLogicImpl implements CreatePersonBusinessLogic {

	public OutEntity createUser(InEntity in) throws TractorException {
		// TODO Auto-generated method stub
		
		OutEntity entity=new OutEntity();
		entity.setProp11("prop11");
		entity.setProp22("prop22");
		entity.setProp33("prop33");
		return entity;
	}

}
