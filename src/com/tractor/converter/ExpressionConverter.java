package com.tractor.converter;

import java.util.ArrayList;import java.util.List;

import org.springframework.util.CollectionUtils;



/**
 * 
 * expression converter
 * @author skcho
 * @version 1.0
 *
 */
public abstract class ExpressionConverter<S,T> extends CollectionConverter<S,T>{
	
	
//	
//	/**
//	 * 
//	 * @param expressionRequestArray
//	 * @return
//	 */
//    public List<GlbExpressionTbl> convert(ExpressionRequest... expressionRequestArray){
//        
//    	List<ExpressionRequest> expressionRequestList = new ArrayList<ExpressionRequest>(expressionRequestArray.length);
//    	
//    	
//    	for(ExpressionRequest expressionRequest : expressionRequestArray){
//    		
//    		if(expressionRequest != null){
//    			expressionRequestList.add(expressionRequest);
//    		}
//    	}
//    	
//    	
//    	List<GlbExpressionTbl> glbExpressionTblList = CollectionUtils.isEmpty(expressionRequestList) ? new ArrayList<GlbExpressionTbl>(0) : 
//    		                                                                                           convert(new ArrayList<String>(expressionRequestList.get(0).keySet()),GlbExpressionTbl.class,true);
//    	
//    	if(CollectionUtils.isEmpty(glbExpressionTblList)) return glbExpressionTblList;
//    	
//    	for(GlbExpressionTbl glbExpressionTbl : glbExpressionTblList){
//    		
//    		for(ExpressionRequest expressionRequest  : expressionRequestArray){
//    			
//    			if(expressionRequest instanceof NameRequest){
//    				
//    				//set name in specific language code
//    				glbExpressionTbl.setName1(expressionRequest.get(glbExpressionTbl.getLanguageCd()));
//    				
//    			}else if(expressionRequest instanceof RepresentativeRequest){
//    				
//    				//set representative in specific language code
//    				glbExpressionTbl.setName2(expressionRequest.get(glbExpressionTbl.getLanguageCd()));
//    				
//    			}else if(expressionRequest instanceof DescriptionRequest){
//    				
//    				//set description in specific language code
//    				glbExpressionTbl.setDescriptionShort1(expressionRequest.get(glbExpressionTbl.getLanguageCd()));
//    				
//    			}else if(expressionRequest instanceof SubDescriptionRequest){
//    				
//    				//set sub description in specific language code
//    				glbExpressionTbl.setDescriptionLong1(expressionRequest.get(glbExpressionTbl.getLanguageCd()));
//    				
//    			}
//    			
//    		}
//    		
//    		if("value".equals(glbExpressionTbl.getLanguageCd())){
//    			//TODO:constant
//    			glbExpressionTbl.setLanguageCd("C");
//    			
//    		}
//    		
//    		
//    	}
//    	
//    	return glbExpressionTblList;
//    }
//    
//    
//    public <S1> GlbConceptTbl convert(S1 source,Class<GlbConceptTbl> targetType,String referencingTableName){
//    	
//    	GlbConceptTbl  glbConceptTbl = conversionService.convert(source,targetType);
//    	glbConceptTbl.setReferencingTableName(referencingTableName);
//    	
//    	return glbConceptTbl;
//    	
//    }
//    
//
//    /**
//     * 
//     * @param strArray
//     * @return
//     */
//    public GlbExpressionTbl convert(String name1,
//    		                        String name2,
//    		                        String descriptionShort1,
//    		                        String descriptionShort2,
//    		                        String descriptionLong1,
//    		                        String descriptionLong2){
//    	
//    	GlbExpressionTbl glbExpressionTbl  = new GlbExpressionTbl();
//    	
//    	//TODO:constant
//    	glbExpressionTbl.setLanguageCd("C");
//    	
//    	glbExpressionTbl.setName1(name1);
//    	glbExpressionTbl.setName2(name2);
//    	glbExpressionTbl.setDescriptionShort1(descriptionShort1);
//    	glbExpressionTbl.setDescriptionShort2(descriptionShort2);
//    	glbExpressionTbl.setDescriptionLong1(descriptionLong1);
//    	glbExpressionTbl.setDescriptionLong2(descriptionLong2);
//    	
//    	return glbExpressionTbl;
//        
//        
//    }

}
