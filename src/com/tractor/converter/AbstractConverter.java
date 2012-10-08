package com.tractor.converter;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

public abstract class AbstractConverter<S,T> implements Converter<S, T> {
	
	protected ConversionService conversionService;
	
	public void setConversionService(ConversionService conversionService){
		this.conversionService = conversionService;
	}
	
	public T convert(S source) {
		return null;		
	};
	

}
