package wiring.java;

import org.springframework.stereotype.Component;

// @Component
public class Piano implements Instrument {
	public void playing() {
		System.out.println( "피아노 : 띵동 띵동 띵동" );
	}
}
