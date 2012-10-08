package com.tractor.aop;


import org.springframework.aop.AfterAdvice;
import java.lang.reflect.Method;


/**
 * AfterAdvice抽象クラス
 * 
 * @author sangki.cho
 * @version 1.0
 *
 */

public abstract class BaseAfterAdvice implements AfterAdvice {
	
	/**
	 * ジョイント�?イント�?�処�?��?�終了後�?�実行�?�れる処�?�
	 *
	 * @param method ジョイント�?イント(メソッドオブジェクト)
	 * @param args ジョイント�?イント�?�引数�?��?列
	 * @param target ターゲットオブジェクト(アスペクト対象)
	 * @throws Throwable　処�?�中�?�発生�?�る例外
	 */
	public void after(Method method, Object[] args, Object target) throws Throwable {
		
	}
	
	

}
