package top.hellooooo.blog.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author Q
 * @Date 07/11/2020 14:03
 * @Description
 */
public class FactoryBeanCat implements FactoryBean<Cat> {
	@Override
	public Cat getObject() throws Exception {
		return new Cat();
	}

	@Override
	public Class<?> getObjectType() {
		return top.hellooooo.hellospring.bean.Cat.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
