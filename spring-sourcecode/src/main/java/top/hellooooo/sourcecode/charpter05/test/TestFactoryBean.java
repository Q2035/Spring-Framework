package top.hellooooo.sourcecode.charpter05.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hellooooo.sourcecode.charpter05.bean.Car;

/**
 * @Author Q
 * @Date 02/08/2020 21:47
 * @Description
 */
public class TestFactoryBean {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factorybean.xml");
//		调用getBean("car") 时，Spring通过反射机制发现CarFactoryBean实现了FactoryBean的接口，
//		这时Spring容器就调用接口方法CarFactoryBean#getObject()方法返回。
//		如果希望获取CarFactoryBean的实例，则需要在使用getBean(beanName)
//		方法时在beanName前显示的加上 "&" 前缀，例如getBean("&car")。
		Object car =  applicationContext.getBean("&car");
		System.out.println(car);
	}
}
