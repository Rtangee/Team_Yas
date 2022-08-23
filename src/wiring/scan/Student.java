package wiring.scan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component
public class Student implements Role {
	@Value( "홍길동" )
	private String name;
	public void play() {
		System.out.println( "학생 " + name + "을 연기합니다" );
	}
}
