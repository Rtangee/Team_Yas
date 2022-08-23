package wiring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Instrumentalist implements Performer {
	@Value( "#{singer.name}" )
	private String song;
	
	@Autowired( required=false )
	@Qualifier( "piano" )
	private Instrument instrument;
	
	/*
	public void setSong( String song ) {
		this.song = song;
	}
	*/
	public Instrumentalist() {}
	public Instrumentalist( String song, Instrument instrument ) {
		this.song = song;
		this.instrument = instrument;
	}
	
	/*
	@Autowired
	public void myInstrument( Instrument instrument ) {
		this.instrument = instrument;
	}
	*/
	/*
	@Autowired
	public void setInstrument( Instrument instrument ) {
		this.instrument = instrument;
	}
	*/
	public void perform() {
		System.out.println( song + "을 연주합니다" );
		instrument.playing();
	}	
}









