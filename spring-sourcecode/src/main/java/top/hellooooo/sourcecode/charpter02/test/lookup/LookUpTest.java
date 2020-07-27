package top.hellooooo.sourcecode.charpter02.test.lookup;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookUpTest {
     public static void main(String[] args) {
         ApplicationContext bf =
                 new ClassPathXmlApplicationContext("lookup.xml");
         GetBeanTest test=(GetBeanTest) bf.getBean("getBeanTest");
         test.showMe();
     }
}
