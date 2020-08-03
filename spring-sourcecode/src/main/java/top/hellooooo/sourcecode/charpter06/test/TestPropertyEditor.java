package top.hellooooo.sourcecode.charpter06.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Q
 * @Date 03/08/2020 15:43
 * @Description
 */
public class TestPropertyEditor {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("propertyeditor.xml");
		System.out.println(applicationContext.getBean("man"));
	}
}
