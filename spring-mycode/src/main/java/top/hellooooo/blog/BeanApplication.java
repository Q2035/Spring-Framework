package top.hellooooo.blog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.hellooooo.blog.bean.Cat;
import top.hellooooo.blog.bean.Dog;
import top.hellooooo.blog.bean.User;
import top.hellooooo.blog.config.BeanConfig;
import top.hellooooo.blog.config.ImportConfig;

/**
 * @Author Q
 * @Date 07/11/2020 10:54
 * @Description
 */
public class BeanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportConfig.class);
//		printBeans(applicationContext);
//		User user = applicationContext.getBean(User.class);
//		System.out.println(user);
		Dog bean = applicationContext.getBean(Dog.class);
		Dog dog = (Dog) applicationContext.getBean("dog");
		System.out.println(bean == dog);
		((AnnotationConfigApplicationContext) applicationContext).close();
	}

	public static void printBeans(ApplicationContext applicationContext) {
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
}
