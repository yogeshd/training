package com.tractor.aop;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

/**
 * BeforeAdvice抽象クラス
 * @author sangki.cho
 * @version 1.0
 *
 */
public abstract class BaseBeforeAdvice implements MethodBeforeAdvice {	
	

	public void before(Method method, Object[] args, Object target) throws Throwable {

	}

}
