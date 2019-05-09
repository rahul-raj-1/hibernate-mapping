package com.example.hibernatemapping.aspect;

import java.time.LocalDate;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectForApp {
	
	/*	@Before("execution(* com.example.hibernatemapping.controller..*(..) ) " ) 
	 * This will/should log all controller  com.example.hibernatemapping.controller
	 * package
	 * We can log 
	 */

	@Before(value="execution(* com.example.hibernatemapping.controller.AppController..*(..) ) " ) 
	public void before(JoinPoint jp)
	{
		
		System.out.println( " in before");
		
		System.out.println(jp.getSignature().getName() );
		System.out.println(jp.getArgs());		
		System.out.println(  jp.getKind());
		
		
	}
	
	
	
	@Around(value="execution(* com.example.hibernatemapping.controller.AppController..*(..) ) " ) 
	public Object around(ProceedingJoinPoint pjp) throws Throwable
	{
		
		System.out.println( " in around");
		 LocalDate date =LocalDate.now();
		 
			System.out.println(  " befor result is "  );

		Object result= pjp.proceed();
		
		System.out.println(  " result is " + result.getClass() );
		
		return result;
		}
	
	
}
