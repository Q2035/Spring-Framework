package top.hellooooo.sourcecode.charpter06.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hellooooo.sourcecode.charpter06.config.TestEvent;

/**
 * @Author Q
 * @Date 03/08/2020 20:17
 * @Description
 */
public class TestListener {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("listener.xml");
		TestEvent event = new TestEvent("Hello", "mgs");
		applicationContext.publishEvent(event);
	}
}
