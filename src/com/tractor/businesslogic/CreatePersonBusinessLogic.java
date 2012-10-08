package com.tractor.businesslogic;

import org.springframework.stereotype.Component;

import com.tractor.entity.InEntity;
import com.tractor.entity.OutEntity;
import com.tractor.exception.TractorException;
@Component
public interface CreatePersonBusinessLogic {
	
	public OutEntity createUser(InEntity in) throws TractorException;
}
