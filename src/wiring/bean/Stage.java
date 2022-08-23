package wiring.bean;

public class Stage {
	private static Stage stage = new Stage();
	public static Stage getInstance() {
		return stage;
	}
}
