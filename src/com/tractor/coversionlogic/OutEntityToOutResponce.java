package com.tractor.coversionlogic;

import com.tractor.converter.AbstractConverter;
import com.tractor.entity.OutEntity;
import com.tractor.response.OutResponse;

public class OutEntityToOutResponce extends AbstractConverter<OutEntity, OutResponse> {

	@Override
	public OutResponse convert(OutEntity source) {
		// TODO Auto-generated method stub
		OutResponse response= new OutResponse();
		response.setProp1(source.getProp11());
		response.setProp2(source.getProp22());
		response.setProp3(source.getProp33());
		
		return response;
		
		
	}
	
	

}
