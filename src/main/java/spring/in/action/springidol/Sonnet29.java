package spring.in.action.springidol;

public class Sonnet29 implements Poem {

	private static String[] LINES = {
		"When, in disagrace with fortune and men's eyes,",
		"I all alone beweep my outcast state"
	};
	
	public Sonnet29() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void recite() {
		for (int i = 0; i < LINES.length; i++) {
			System.out.println(LINES[i]);
		}

	}

}
