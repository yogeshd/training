package com.tractor.constant;


/**
 * contact enum
 * @author skcho
 * @version 1.0
 *
 */
public enum MethodTypeEnum{
	
	
	POST("post"),
	
	GET("get"),
	
	FIND("find");
	
    private final String value;
    
    public String value() {
        return value;
    }

    private MethodTypeEnum(String value) {
        this.value = value;
    }
    
    public static boolean isExist(String value) {
        for (MethodTypeEnum d : values()) {
            if (d.value().equals(value)) {
                return false;
            }
        }
        return true;
    }
    
    public static MethodTypeEnum convertFrom(String value){
    	
        for (MethodTypeEnum e : values()) {
            if(e.value.equals(value)){
                return e;
            }
        }
        
        return null;
        
    }
}
