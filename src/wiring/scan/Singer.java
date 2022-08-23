package wiring.scan;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Singer implements Performer {

	@Resource( name="bounce" )
	private Song song;
	@Resource( name="drum" )
	private Instrument instrument;
		
	public void perform() throws PerformanceException {
		song.singing();
		instrument.playing();
	}
}














