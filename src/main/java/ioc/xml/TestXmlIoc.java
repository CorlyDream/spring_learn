package ioc.xml;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class TestXmlIoc {

	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("beans.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);
		Student stu = (Student) factory.getBean("student");
		System.out.println(stu.getName());
//		FileSystemXmlApplicationContext fsx = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
//		Student stu = (Student) fsx.getBean("student");
//		System.out.println(stu.getName());
	}

}
