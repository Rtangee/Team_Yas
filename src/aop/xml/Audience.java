package aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	public void takeSeat() {
		System.out.println( "자리에 앉는다" );
	}
	public void turnOffPhone() {
		System.out.println( "핸드폰을 끈다" );
	}
	public void applaud() {
		System.out.println( "짝~! 짝~! 짝~! 짝~!" );
	}
	public void refund() {
		System.out.println( "우~! 돈내놔라!" );
	}
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
















