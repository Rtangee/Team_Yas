package aop.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopannoTest {
	public static void main( String[] args ) throws PerformanceException {
		ApplicationContext ctx
			= new ClassPathXmlApplicationContext( "/aop/anno/ApplicationContext.xml" );
		
		Performer hong = (Performer) ctx.getBean( "hong" );
		hong.perform();
		
		Performer singer = (Performer) ctx.getBean( "singer" );
		singer.perform();

		Thinker volunteer = (Thinker) ctx.getBean( "volunteer" );
		volunteer.thinking( "짜장면" );
		
	}
}







