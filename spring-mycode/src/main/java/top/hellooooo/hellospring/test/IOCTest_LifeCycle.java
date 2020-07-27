package top.hellooooo.hellospring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.hellooooo.hellospring.config.MainConfigOfLifeCycle;

/**
 * @Author Q
 * @Date 2020/7/27 10:10 AM
 * @Description
 */
public class IOCTest_LifeCycle {
	public static void main(String[] args) {
		test01();
	}

	public static void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
		System.out.println("容器创建完成");
		applicationContext.close();
	}
}
