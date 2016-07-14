package spring.in.action.old.springidol;


public class Juggler implements Performer {

	private int beanBags = 3;
	
	public Juggler() {
		// TODO Auto-generated constructor stub
	}
	
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}
	
	public void perform()  {
		System.out.println("JUNGGLING " + beanBags + " BEANBAGS");
		
	}
	

}
