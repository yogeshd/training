package com.tractor.converter.facade;

import com.tractor.entity.InEntity;
import com.tractor.entity.OutEntity;
import com.tractor.exception.TractorException;
import com.tractor.request.InRequest;
import com.tractor.response.OutResponse;



public class TractorConversionServiceFacade extends AbstractConversionServiceFacade{

	@Override
	protected <F, T> T convert(F from, Class<T> targetType) throws TractorException {
		// TODO Auto-generated method stub
	try{
			
			return conversionService.convert(from, targetType);	
			
		}catch(Throwable t){
			
			throw new TractorException(t.getMessage(),t);
			
		}
	}

	public InEntity convertRequest(InRequest from,InEntity to) throws TractorException
	{
		return convert(from, InEntity.class);
		
	}
	
	public OutResponse convertResponse(OutEntity from,OutResponse to) throws TractorException
	{
		return convert(from, OutResponse.class);
		
	}
}
