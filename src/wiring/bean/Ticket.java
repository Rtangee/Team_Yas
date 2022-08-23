package wiring.bean;

public class Ticket {
	private int cnt;
	public void reservation() {
		System.out.println( "티켓 번호 : " + ++cnt );
	}
}
