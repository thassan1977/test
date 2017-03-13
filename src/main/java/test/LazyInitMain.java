package test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInitMain {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		BeanFactory beanfactory = new ClassPathXmlApplicationContext(
		"context.xml");
		System.out.println("Initialization done when require");
		beanfactory.getBean("addressBean");
		
		
	}
}
