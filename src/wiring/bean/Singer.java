package wiring.bean;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Singer implements Performer {
	private String name;
	private List<Song> songs;
	private Map<String, Instrument> instruments;
	public void setName( String name ) {
		this.name = name;
	}
	public void setSongs( List<Song> songs ) {
		this.songs = songs;
	}
	public void setInstruments( Map<String, Instrument> instruments ) {
		this.instruments = instruments;
	}
		
	public void perform() throws PerformanceException {
		System.out.println( name + "이 노래합니다" );
		for( Song song : songs ) {
			song.singing();
		}
		Iterator<String> keys = instruments.keySet().iterator();
		while( keys.hasNext() ) {
			String key = keys.next();
			System.out.println( key + " : " );
			instruments.get( key ).playing();
		}
		
	}
}














