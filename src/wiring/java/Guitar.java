package wiring.java;

import org.springframework.stereotype.Component;

// @Component
public class Guitar implements Instrument {
	public void playing() {
		System.out.println( "기타 : 띵가 띵가 띵가" );
	}
}
