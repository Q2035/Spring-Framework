package top.hellooooo.hellospring.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import top.hellooooo.hellospring.bean.RainBow;

/**
 * @Author Q
 * @Date 2020/7/25 4:10 PM
 * @Description
 */
public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
	/**
	 *
	 * @param importingClassMetadata annotation metadata of the importing class
	 * @param registry current bean definition registry
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		boolean red = registry.containsBeanDefinition("top.hellooooo.hellospring.bean.Red");
		boolean blue = registry.containsBeanDefinition("top.hellooooo.hellospring.bean.Blue");
		if (red && blue) {
			RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
			registry.registerBeanDefinition("rainBow",beanDefinition);
		}
	}
}
