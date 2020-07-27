package top.hellooooo.sourcecode.charpter02.test.replace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Q
 * @Date 2020/7/27 7:10 PM
 * @Description
 */
public class ReplaceMethodTestApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("replace.xml");
		TestChangeMethod testChangeMethod = (TestChangeMethod) context.getBean("testChangeMethod");
		testChangeMethod.changeMe();
	}
}
