package aop.jikexueyuan.spring.aop.cglib;

public class Main {

	public static void main(String[] args) {
//		StudentBean s1 = (StudentBean) (new CGLibProxyFactory().createStudent(new StudentBean()));
		StudentBean si = new StudentBean("mengh");
		StudentBean s2 = (StudentBean) (new CGLibProxyFactory().createStudent(si));
		
//		s1.print("he");
		s2.print();
		
		
	}

}
