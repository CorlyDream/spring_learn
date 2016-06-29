package aop.jikexueyuan.spring.aop.aspect;

public class Student {
	public String print(String name){
		System.out.println(name);
		return "Hello Word";
	}
}
