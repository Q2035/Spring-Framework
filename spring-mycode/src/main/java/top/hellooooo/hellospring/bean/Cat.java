package top.hellooooo.hellospring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Author Q
 * @Date 2020/7/27 10:51 AM
 * @Description
 */
@Component
public class Cat implements DisposableBean, InitializingBean {
	public Cat() {
		System.out.println("cat...construct...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("cat...destroy...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("cat...init...");
	}
}
