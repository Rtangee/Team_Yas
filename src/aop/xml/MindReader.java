package aop.xml;

public class MindReader implements Magician {
	public void intercept( String thoughts ) {
		System.out.println( "독심술사의 생각 : " + thoughts );
	}
}
