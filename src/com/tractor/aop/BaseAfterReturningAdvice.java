package com.tractor.aop;


import org.springframework.aop.AfterReturningAdvice;
import java.lang.reflect.Method;


/**
 * AfterReturningAdvice抽象クラス
 * @author sangki.cho
 * @version 1.0 
 */
public abstract class BaseAfterReturningAdvice implements AfterReturningAdvice {
	

	public void afterReturning(Object retunValue, Method method, Object[] args,	Object target) throws Throwable {
		
	}
	

}
