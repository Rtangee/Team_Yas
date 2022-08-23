package wiring.bean;

public class PoeticJuggler extends Juggler {
	private Poem poem;
	public PoeticJuggler() {}
	public PoeticJuggler( int beanBags, Poem poem ) {
		super( beanBags );
		this.poem = poem;
	}
	public void perform() throws PerformanceException {		
		super.perform();
		poem.recite();
	}
}
