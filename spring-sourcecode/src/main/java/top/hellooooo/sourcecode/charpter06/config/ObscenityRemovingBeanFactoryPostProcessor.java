package top.hellooooo.sourcecode.charpter06.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Q
 * @Date 03/08/2020 19:21
 * @Description
 */
public class ObscenityRemovingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	private Set<String> obscenties;

	public ObscenityRemovingBeanFactoryPostProcessor(){
		this.obscenties = new HashSet<>();
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanNames = beanFactory.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			BeanDefinition bd = beanFactory.getBeanDefinition(beanName);
			StringValueResolver valueResolver = (str) -> {
				if (isObscene(str)) {
					return "******";
				}
				return str;
			};
			BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(valueResolver);
			visitor.visitBeanDefinition(bd);
		}
	}

	public boolean isObscene(Object value) {
		String potentialObscenity = value.toString().toUpperCase();
		return this.obscenties.contains(potentialObscenity);
	}

	public void setObscenties(Set<String> obscenties) {
		this.obscenties.clear();
		for (String obscenty : obscenties) {
			this.obscenties.add(obscenty.toUpperCase());
		}
	}
}
