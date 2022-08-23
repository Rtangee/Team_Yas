package aop.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	@Pointcut( "execution( * aop.anno.Performer.perform( .. ) )" )
	public void performance() {}
	
	@Before( "performance()" )
	public void takeSeat() {
		System.out.println( "자리에 앉는다" );
	}
	@Before( "performance()" )
	public void turnOffPhone() {
		System.out.println( "핸드폰을 끈다" );
	}
	@AfterReturning( "performance()" )
	public void applaud() {
		System.out.println( "짝~! 짝~! 짝~! 짝~!" );
	}
	@AfterThrowing( "performance()" )
	public void refund() {
		System.out.println( "우~! 돈내놔라!" );
	}
	@Around( "performance()" )
	public void performance( ProceedingJoinPoint joinPoint ) {
		try {
			long start = System.currentTimeMillis();
			joinPoint.proceed();
			long end = System.currentTimeMillis();
			System.out.println( "공연시간 : " + (end-start) );			
		} catch( Throwable t ) {
			t.printStackTrace();
		}		
	}
}
















