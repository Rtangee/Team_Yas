package wiring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateBean {
	@Bean
	public Role student() {
		Student student = new Student();
		student.setName( "홍길동" );
		return student;
	}
	@Bean
	public Role teacher() {
		Teacher teacher = new Teacher();
		teacher.setName( "이순신" );
		return teacher;
	}
	@Bean
	public Role company() {
		Company company = new Company();
		company.setName( "김유신" );
		return company;
	}
	@Bean
	public Performer actor() {
		Actor actor = new Actor();
		actor.setName( "강감찬" );
		actor.setAge( 20 );
		actor.setRole( company() );
		return actor;
	}

	@Bean
	public Instrument drum() {
		return new Drum();
	}
	@Bean
	public Instrument guitar() {
		return new Guitar();
	}
	@Bean
	public Instrument piano() {
		return new Piano();
	}
	@Bean
	public Song hello() {
		return new Hello();
	}
	@Bean
	public Song bounce() {
		return new Bounce();
	}
	@Bean
	public Performer singer() {
		Singer singer = new Singer();
		singer.setSong( bounce() );
		singer.setInstrument( piano() );
		return singer;
	}
	
	
} // class
























