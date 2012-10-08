package com.tractor.aop;


import org.springframework.aop.ThrowsAdvice;
import java.lang.reflect.Method;



/**
 * ThrowsAdvice抽象クラス
 * @author sangki.cho
 * @version 1.0
 *
 *
 * @param <T> java.lang.Throwable型�?�generics
 */
public abstract class BaseThrowAdvice<T> implements ThrowsAdvice {

	/**
	 * ジョイント�?イント�?�処�?�中�?�例外�?�発生�?�れ�?�場�?��?�実行�?�れる処�?�
	 * @param e 発生�?��?�例外(generics)
	 */
	public void afterThrowing(T e){
		
	}

	/**
	 * ジョイント�?イント�?�処�?�中�?�例外�?�発生�?�れ�?�場�?��?�実行�?�れる処�?�
	 * @param method ジョイント�?イント(メソッドオブジェクト)
	 * @param args ジョイント�?イント�?�引数�?��?列
	 * @param target ターゲットオブジェクト(アスペクト対象)
	 * @param e 発生�?��?�例外(generics)
	 */
	public void afterThrowing(Method method,Object[] args,Object target, T e){

	}

}
