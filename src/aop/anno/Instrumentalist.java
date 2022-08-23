package aop.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component( "hong" )
public class Instrumentalist implements Performer {
	@Value( "Hello" )
	private String song;
	@Resource( name="piano" )	
	private Instrument instrument;
	public void setSong( String song ) {
		this.song = song;
	}
	public void setInstrument( Instrument instrument ) {
		this.instrument = instrument;
	}
	public void perform() {
		System.out.println( song + "을 연주합니다" );
		instrument.playing();
	}	
}
