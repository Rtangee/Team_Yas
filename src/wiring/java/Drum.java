package wiring.java;

import org.springframework.stereotype.Component;

// @Component
public class Drum implements Instrument {
	public void playing() {
		System.out.println("드럼 : 뚱땅 뚱땅 뚱땅" );
	}
}
