package wiring.scan;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component( "hong" )
public class Actor implements Performer {
	@Value( "강감찬" )
	private String name;
	@Value( "20" )
	private int age;
	@Resource( name="teacher" )
	private Role role;
	public void perform() {
		System.out.println( "이름 : " + name + "\t" + "나이 : " + age );
		role.play();		
	}
}
