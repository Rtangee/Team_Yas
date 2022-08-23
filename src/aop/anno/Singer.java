package aop.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Singer implements Performer {
	@Value( "홍길동" )
	private String name;
	@Resource( name="bounce" )
	private Song song;
	public void setName( String name ) {
		this.name = name;
	}
	public void setSong( Song song ) {
		this.song = song;
	}		
	public void perform() throws PerformanceException {
		System.out.println( name + "이 노래합니다" );
		song.singing();
	}
}














