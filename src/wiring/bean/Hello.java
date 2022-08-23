package wiring.bean;

public class Hello implements Song {
	private String str = "네 눈빛을 보면 꽤 낯 가려 보여\r\n" + 
			"자존심도 좋지만 난 너 생각뿐야\r\n" + 
			"Ah~ 손끝만 스쳐도 그댄 벌써 나를 알아보리\r\n" + 
			"Ah~ 우린 운명이라고 나의 느낌이 말해주지";
	public void singing() {
		System.out.println( "Hello : " + str );
	}
}
