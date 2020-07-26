package top.hellooooo.springtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.hellooooo.springtest.config.MyConfig;
import top.hellooooo.springtest.pojo.User;

public class MyApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		User bean = annotationConfigApplicationContext.getBean(User.class);
		System.out.println(bean);
	}
}
