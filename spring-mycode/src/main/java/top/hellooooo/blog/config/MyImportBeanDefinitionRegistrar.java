package top.hellooooo.blog.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import top.hellooooo.blog.bean.Dog;

import java.util.Set;

/**
 * @Author Q
 * @Date 07/11/2020 13:51
 * @Description
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
		for (String annotationType : annotationTypes) {
			System.out.println("---->" + annotationType);
		}
		BeanDefinition dog = new RootBeanDefinition(Dog.class);
		registry.registerBeanDefinition("dog", dog);
	}
}
