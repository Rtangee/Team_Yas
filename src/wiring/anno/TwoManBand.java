package wiring.anno;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class TwoManBand implements Performer {
	@Value( "#{singer.name}, 김유신" )
	private String[] name;
	
	@Value( "names" )
	private List<String> names;
	
	@Resource( name="instruments" )
	private List<Instrument> instruments;
	
	@Resource( name="songs" )	
	private Map<String, Song> songs;
	
	public void perform() throws PerformanceException {
		for( String n : name ) {
			System.out.print( n + "\t" );
		}
		System.out.println();
		
		for( String name : names ) {
			System.out.print( name + "\t" );
		}
		System.out.println();
		for( Instrument instrument : instruments ) {
			instrument.playing();
		}
		System.out.println();
		Iterator <String> keys = songs.keySet().iterator();
		while( keys.hasNext() ) {
			String key = keys.next();
			Song song = songs.get( key );
			System.out.println( key );
			song.singing();
		}
		
	}
}

























