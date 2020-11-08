package top.hellooooo.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.hellooooo.hellospring.bean.Person;
import top.hellooooo.hellospring.config.MyConfig;
import top.hellooooo.hellospring.config.MyConfig2;

/**
 * @Author Q
 * @Date 2020/7/22 10:01 PM
 */
public class MyApplication {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);
		printAllBeans(context);
//		Person person = (Person) context.getBean("person");
//		System.out.println(person);
//		String[] beanNamesForType = context.getBeanNamesForType(Person.class);
//		for (String s : beanNamesForType) {
//			System.out.println(s);
//		}
	}

	static void printAllBeans(ApplicationContext context) {
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println("|" + beanDefinitionName);

		}
	}
}
