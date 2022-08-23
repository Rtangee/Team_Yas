package wiring.anno;

class InherSuper {
	String name = "부모클래스";
	public String getName() {
		return name;
	}
}
public class InherTest extends InherSuper {
	String name = "자식클래스";
	public String getName() {
		return name;
	}
	public static void main( String[] args ) {
		// 부모클래스 참조변수 = 부모클래스 인스턴스
		InherSuper is = new InherSuper();
		System.out.println( "is : " + is.name );
		System.out.println( "is : " + is.getName() );
		
		// 자식클래스 참조변수 = 자식클래스 인스턴스
		InherTest it = new InherTest();
		System.out.println( "it : " + it.name );
		System.out.println( "it : " + it.getName() );
		
		
		// 부모클래스 참조변수 = 자식클래스 인스턴스
		is = new InherTest();
		System.out.println( "is : " + is.name );
		System.out.println( "is : " + is.getName() );		
		
		// 자식클래스 참조변수 = 부모클래스 인스턴스	
		it = (InherTest) new InherSuper();
		
		
	}
}














