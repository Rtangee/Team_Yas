package wiring.bean;

import java.util.Iterator;
import java.util.Map;

public class TwoManBand implements Performer {
	private Map<String, Instrument> instruments;
	public void setInstruments( Map<String, Instrument> instruments ) {
		this.instruments = instruments;
	}
	public void perform() throws PerformanceException {
		Iterator<String> keys = instruments.keySet().iterator(); 
		while( keys.hasNext() ) {
			String key = keys.next();
			System.out.println( key + " : " );
			instruments.get(key).playing(); 
		}
	}
}












