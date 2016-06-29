package spring.in.action.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
		Performer performer = (Performer) ctx.getBean("kenny");
		performer.perform();
//		Instrumentalist auditorium = (Instrumentalist)ctx.getBean("kenny");
//		System.out.println(auditorium.getSong());
	}

}
