package top.hellooooo.sourcecode.charpter07.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hellooooo.sourcecode.charpter07.bean.TestBean;

/**
 * @Author Q
 * @Date 04/08/2020 09:01
 * @Description
 */
public class AOPTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
		TestBean test = (TestBean) applicationContext.getBean("test");
		test.test();
	}
}
