package top.hellooooo.blog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.hellooooo.blog.autowire.A;
import top.hellooooo.blog.autowire.AutowiredConfig;

import java.io.IOException;

/**
 * @Author Q
 * @Date 07/11/2020 10:54
 * @Description
 */
public class BeanApplication {

	public static void main(String[] args) throws IOException {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowiredConfig.class);
		A bean = applicationContext.getBean(A.class);
		bean.process();
		A bean2 = applicationContext.getBean(A.class);
		bean2.process();
		System.out.println(bean);
		System.out.println(bean2);
	}

	public static void printBeans(ApplicationContext applicationContext) {
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
}
