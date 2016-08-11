package spring.in.action.chapter10.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spittr.entity.DefaultValue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		DefaultValue defaultValue = new DefaultValue();
		defaultValue.setName("corly");
		defaultValue.setAge(33);
		DefaultValueDao defaultValueDao = (DefaultValueDao) context.getBean("defaultValueDao");
		defaultValueDao.add(defaultValue);
	}

}
