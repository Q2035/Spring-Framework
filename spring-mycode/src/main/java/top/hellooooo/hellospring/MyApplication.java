package top.hellooooo.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hellooooo.hellospring.bean.Person;
import top.hellooooo.hellospring.config.MyConfig;

/**
 * @Author Q
 * @Date 2020/7/22 10:01 PM
 */
public class MyApplication {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//		Person person = (Person) context.getBean("person");
//		System.out.println(person);
		String[] beanNamesForType = context.getBeanNamesForType(Person.class);
		for (String s : beanNamesForType) {
			System.out.println(s);
		}
	}
}
