package wiring.bean;

public class Flower implements Poem {
	String str = "내가 그의 이름을 불러주기 전에는\r\n" + 
			"그는 다만\r\n" + 
			"하나의 몸짓에 지나지 않았다.\r\n";
	public void recite() {
		System.out.println( "Flower : " + str );
	}
}
