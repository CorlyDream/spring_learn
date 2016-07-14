package spring.in.action.old.springidol;

public class Stage {

	public Stage() {
		// TODO Auto-generated constructor stub
	}
	
	private static class StageSingletonHolder {
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
}
