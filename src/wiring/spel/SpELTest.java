package wiring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpELTest {
	public static void main( String[] args ) {
		ApplicationContext ctx 
			= new ClassPathXmlApplicationContext( "/wiring/spel/ApplicationContext.xml" );
		Prop prop = (Prop) ctx.getBean( "prop" );
		System.out.println( "값 : " + prop.getStr() );
	}
}
