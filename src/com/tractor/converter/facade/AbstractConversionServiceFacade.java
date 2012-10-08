package com.tractor.converter.facade;

import org.springframework.core.convert.ConversionService;

/*import com.rakuten.gep.merchant.api.entity.Find;
import com.rakuten.gep.merchant.api.entity.FindKey;
import com.rakuten.gep.merchant.api.request.FindKeyRequest;
import com.rakuten.gep.merchant.api.response.FindResponse;
*/
public abstract class AbstractConversionServiceFacade {
	
	/**
	 * conversion service
	 */		
	protected ConversionService conversionService;
	
	/**
	 * set conversion service
	 * @param conversionService conversion service
	 */	
	public void setConversionService(ConversionService conversionService){
		this.conversionService = conversionService;
	}
	
	
	//public abstract FindKey convertRequest(FindKeyRequest from,FindKey to) throws Throwable;
	
	//public abstract FindResponse convertResponse(Find from,FindResponse to) throws Throwable;
	

	protected abstract <F,T> T convert(F from, Class<T> targetType) throws Throwable;
    

}
