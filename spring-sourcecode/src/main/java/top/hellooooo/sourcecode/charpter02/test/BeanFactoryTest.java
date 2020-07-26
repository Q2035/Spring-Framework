package top.hellooooo.sourcecode.charpter02.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author Q
 * @Date 2020/7/25 7:17 PM
 * @Description
 */
public class BeanFactoryTest {
	public static void main(String[] args) {
		testSimpleLoad();
	}

	public static void testSimpleLoad(){
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("charpter02.xml"));
		System.out.println(beanFactory.getBean("myTestBean"));
	}
}
