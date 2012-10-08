package com.tractor.converter.factory;

import java.util.Set;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.support.GenericConversionService;

import com.tractor.converter.AbstractConverter;
	   

/**
 * abstract conversion service factory
 * @author skcho
 *
 */
public abstract class AbstractConversionServiceFactoryBean extends ConversionServiceFactoryBean {
	

	private Set<?> converters;
	
	
	@Override
	@SuppressWarnings("rawtypes")
	protected GenericConversionService createConversionService() {
		// TODO Auto-generated method stub
		GenericConversionService conversionService = super.createConversionService();
		

		for(Object obj : converters){
			
			((AbstractConverter)obj).setConversionService(conversionService);
			
		}
		
		return conversionService;
	}
	
	@Override
	public void setConverters(Set<?> converters) {		
		
		super.setConverters(converters);
		
		//set converters
		this.converters = converters;
		
		
	}


}
