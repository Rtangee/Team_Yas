package wiring.auto;

public class Instrumentalist implements Performer {
	private String song;
	private Instrument instrument;
	public void setSong( String song ) {
		this.song = song;
	}
	public Instrumentalist() {}
	public Instrumentalist( String song, Instrument instrument ) {
		this.song = song;
		this.instrument = instrument;
	}
	public void setInstrument( Instrument instrument ) {
		this.instrument = instrument;
	}
	public void perform() {
		System.out.println( song + "을 연주합니다" );
		instrument.playing();
	}	
}
