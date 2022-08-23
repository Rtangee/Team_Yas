package wiring.anno;

import java.util.Iterator;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Singer implements Performer {
	@Value( "조용필" )
	private String name;
	@Resource( name="ss" )
	private Song[] songs;
	@Resource( name="ins" )
	private Map<String, Instrument> instruments;
	
	public String getName() {
		return name;
	}
	
	public void perform() throws PerformanceException {
		System.out.println( name );
		for( Song song : songs ) {
			song.singing();
		}
		Iterator<String> keys = instruments.keySet().iterator();
		while( keys.hasNext() ) {
			String key = keys.next();
			Instrument instrument = instruments.get( key );
			System.out.println( key );
			instrument.playing();
		}
	}
}














