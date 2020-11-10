package top.hellooooo.blog.autowire;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author Q
 * @Date 09/11/2020 14:37
 * @Description
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before{" + beanName + ":" + bean.getClass().getName() + "}");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after{" + beanName + ":" + bean.getClass().getName() + "}");
		return bean;
	}
}
