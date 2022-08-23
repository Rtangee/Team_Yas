package aop.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MindReader implements Magician {
	@Pointcut( "execution( * aop.anno.Thinker.thinking( String ) ) && args( thoughts )" )
	public void thinking( String thoughts ) {}
	
	@Before( "thinking( thoughts )" )
	public void intercept( String thoughts ) {
		System.out.println( "독심술사의 생각 : " + thoughts );
	}
}








