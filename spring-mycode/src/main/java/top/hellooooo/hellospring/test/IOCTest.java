package top.hellooooo.hellospring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import top.hellooooo.hellospring.bean.Person;
import top.hellooooo.hellospring.config.MyConfig;
import top.hellooooo.hellospring.config.MyConfig2;

/**
 * @Author Q
 * @Date 2020/7/23 8:16 AM
 */
public class IOCTest {

	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);

	public static void main(String[] args) {
		IOCTest iocTest = new IOCTest();
		iocTest.testImport();
	}

	public void test01(){
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}

	public void test02() {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
		Person person = (Person) context.getBean("person");
		Person person2 = (Person) context.getBean("person");

		System.out.println(person == person2);

	}

	public void test03() {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);
		Environment environment = context.getEnvironment();
//		动态获取环境变量
		String property = environment.getProperty("os.name");
		System.out.println(property);

		String[] beanNamesForType = context.getBeanNamesForType(Person.class);
		for (String s : beanNamesForType) {
			System.out.println(s);
		}
	}

	public void testImport(){
		printBeans(context);
	}

	private void printBeans(ApplicationContext context) {
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
}