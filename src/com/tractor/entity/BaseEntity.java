package com.tractor.entity;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.tractor.validator.TransactionTarget;




/**
 * 
 * @author skcho
 *
 */
public abstract class BaseEntity {
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
	
	/**
	 * 
	 * @param type
	 * @return
	 * @throws Throwable
	 */
	public <T> Boolean isTransactionTarget(Class<T> type) throws Throwable{
		
		
		Object obj;
		Annotation annotation;
		Boolean result = false;
		
		for(Method method : type.getMethods()){
			
			annotation = method.getAnnotation(TransactionTarget.class);
			
			if(annotation != null){
				
				obj = method.invoke(this);
				
				/*if(obj instanceof String){
					
					if( (result = StringUtils.isNotBlank((String)obj)) ){
						break;
					}
					
				}else if(obj != null){
					
					result = true;
					break;
					
				}*/
				
				if(obj != null){
					result = true;
					break;
				}
			}
			
		}
		
		return result;
		
	}

}

