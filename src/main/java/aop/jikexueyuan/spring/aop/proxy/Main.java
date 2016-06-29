package aop.jikexueyuan.spring.aop.proxy;

public class Main {

	public static void main(String[] args) {
		StudentInterface si = new StudentBean("Leon");
		ProxyFactory factory = new ProxyFactory();
		StudentInterface s2 = (StudentInterface) factory.createStudentProxy(si);
		s2.print("corly");
		s2.getAge(2);
	}

}
