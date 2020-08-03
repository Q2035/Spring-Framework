package top.hellooooo.sourcecode.charpter06.config;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author Q
 * @Date 03/08/2020 20:14
 * @Description 定义监听器
 */
public class TestListener implements ApplicationListener<TestEvent> {
	@Override
	public void onApplicationEvent(TestEvent event) {
		if (event instanceof TestEvent) {
			event.print();
		}
	}
}
