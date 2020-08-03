package top.hellooooo.sourcecode.charpter05.circle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CirCleApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("circle.xml");
		final Object circleA = applicationContext.getBean("circleA");
		System.out.println(circleA);
	}
}
