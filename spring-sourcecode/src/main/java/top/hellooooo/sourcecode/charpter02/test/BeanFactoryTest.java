package top.hellooooo.sourcecode.charpter02.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hellooooo.sourcecode.charpter02.bean.MyTestBean;

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
		ApplicationContext context = new ClassPathXmlApplicationContext("charpter02.xml");
		MyTestBean myTestBean = (MyTestBean) context.getBean("myTestBean");
		System.out.println(myTestBean);
//		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("charpter02.xml"));
//		System.out.println(beanFactory.getBean("myTestBean"));
	}
}
