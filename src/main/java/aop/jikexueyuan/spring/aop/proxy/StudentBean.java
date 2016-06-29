package aop.jikexueyuan.spring.aop.proxy;

public class StudentBean implements StudentInterface{
	private String name;
	public StudentBean() {
		
	}
	
	public StudentBean(String name){
		this.name = name;
	}
	
	@Override
	public String print(String name) {
		System.out.println("Hello World "+name);
		return "print Method";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getAge(int age) {
		System.out.println("My Age is "+age);
		return 11111;
	}

	
}
