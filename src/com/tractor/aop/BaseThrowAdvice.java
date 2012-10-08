package com.tractor.aop;


import org.springframework.aop.ThrowsAdvice;
import java.lang.reflect.Method;



/**
 * ThrowsAdviceæŠ½è±¡ã‚¯ãƒ©ã‚¹
 * @author sangki.cho
 * @version 1.0
 *
 *
 * @param <T> java.lang.Throwableåž‹ã?®generics
 */
public abstract class BaseThrowAdvice<T> implements ThrowsAdvice {

	/**
	 * ã‚¸ãƒ§ã‚¤ãƒ³ãƒˆãƒ?ã‚¤ãƒ³ãƒˆã?®å‡¦ç?†ä¸­ã?«ä¾‹å¤–ã?Œç™ºç”Ÿã?•ã‚Œã?Ÿå ´å?ˆã?«å®Ÿè¡Œã?•ã‚Œã‚‹å‡¦ç?†
	 * @param e ç™ºç”Ÿã?—ã?Ÿä¾‹å¤–(generics)
	 */
	public void afterThrowing(T e){
		
	}

	/**
	 * ã‚¸ãƒ§ã‚¤ãƒ³ãƒˆãƒ?ã‚¤ãƒ³ãƒˆã?®å‡¦ç?†ä¸­ã?«ä¾‹å¤–ã?Œç™ºç”Ÿã?•ã‚Œã?Ÿå ´å?ˆã?«å®Ÿè¡Œã?•ã‚Œã‚‹å‡¦ç?†
	 * @param method ã‚¸ãƒ§ã‚¤ãƒ³ãƒˆãƒ?ã‚¤ãƒ³ãƒˆ(ãƒ¡ã‚½ãƒƒãƒ‰ã‚ªãƒ–ã‚¸ã‚§ã‚¯ãƒˆ)
	 * @param args ã‚¸ãƒ§ã‚¤ãƒ³ãƒˆãƒ?ã‚¤ãƒ³ãƒˆã?®å¼•æ•°ã?®é…?åˆ—
	 * @param target ã‚¿ãƒ¼ã‚²ãƒƒãƒˆã‚ªãƒ–ã‚¸ã‚§ã‚¯ãƒˆ(ã‚¢ã‚¹ãƒšã‚¯ãƒˆå¯¾è±¡)
	 * @param e ç™ºç”Ÿã?—ã?Ÿä¾‹å¤–(generics)
	 */
	public void afterThrowing(Method method,Object[] args,Object target, T e){

	}

}
