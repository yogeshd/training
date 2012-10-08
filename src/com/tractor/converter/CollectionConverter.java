package com.tractor.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class CollectionConverter<S,T> extends AbstractConverter<S,T>{	
	
	
	
    public <S1,T1> List<T1> convert(List<S1> sourceList, Class<T1> targetType){
        
        
    	List<T1> targetList = null;
    	
        if(sourceList != null){        	
        	

        	targetList = new ArrayList<T1>(sourceList.size());
            
            for (S1 source: sourceList) {
            	
            	targetList.add(conversionService.convert(source, targetType));
            }
            
        }/*else{
        	
        	targetList = Collections.emptyList();
        }*/
        
        return targetList;
    }
    

    public <S1,T1> List<T1> convert(List<S1> sourceList, Class<T1> targetType,Boolean emptyFlg){
        
    	List<T1> targetList = convert(sourceList,targetType);
    	
    	if(targetList == null && emptyFlg){
    		targetList = Collections.emptyList();
    	}
    	
    	return targetList;
    	
    }
    

	

}
