package com.tractor.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * AroundAdvice抽象クラス
 * @author sangki.cho
 * @version 1.0
 *
 */
public abstract class BaseAroundAdvice implements MethodInterceptor {	
	

	public Object invoke(MethodInvocation invocation) throws Throwable {
		return null;
	}

}
