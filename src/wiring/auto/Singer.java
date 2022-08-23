package wiring.auto;

public class Singer implements Performer {
	private String name;
	private Song song;
	public void setName( String name ) {
		this.name = name;
	}
	public void setSong( Song song ) {
		this.song = song;
	}		
	public Singer() {}
	public Singer( String name, Song song ) {
		this.name = name;
		this.song = song;
	}
	public void perform() throws PerformanceException {
		System.out.println( name + "이 노래합니다" );
		song.singing();
	}
}














