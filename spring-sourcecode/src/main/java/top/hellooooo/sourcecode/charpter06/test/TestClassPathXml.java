package top.hellooooo.sourcecode.charpter06.test;

import org.springframework.context.ApplicationContext;
import top.hellooooo.sourcecode.charpter06.config.MyClassPathXmlApplicationContext;

/**
 * @Author Q
 * @Date 03/08/2020 14:49
 * @Description
 */
public class TestClassPathXml {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("initpropertysource.xml");
		System.out.println(applicationContext.getBean("user"));
	}
}
