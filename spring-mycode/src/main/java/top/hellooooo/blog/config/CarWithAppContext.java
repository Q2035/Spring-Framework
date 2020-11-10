package top.hellooooo.blog.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author Q
 * @Date 09/11/2020 09:17
 * @Description
 */
public class CarWithAppContext implements ApplicationContextAware {

	protected ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
