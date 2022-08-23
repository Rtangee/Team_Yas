package wiring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanWiringTest {
	public static void main( String[] args ) throws PerformanceException {
//		// 강한 결합
//		Juggler kim = new Juggler();
//		kim.perform();
//		
//		// 느슨한 결합
//		Performer hong = new Juggler();
//		hong.perform();
		
		// DI 종속 객체 주입
		ApplicationContext ctx 
			= new ClassPathXmlApplicationContext( "/wiring/bean/ApplicationContext.xml" );
		Performer hong = (Performer) ctx.getBean( "hong" );
		hong.perform();
		
		
		
		// singleton / prototype
		Ticket t1 = (Ticket) ctx.getBean( "ticket" );
		t1.reservation();
		System.out.println( t1 );
		Ticket t2 = (Ticket) ctx.getBean( "ticket" );
		t2.reservation();
		System.out.println( t2 );
		
		
		
		// 연습용
		Performer singer = (Performer) ctx.getBean( "singer" );
		singer.perform();
		
	}
}














