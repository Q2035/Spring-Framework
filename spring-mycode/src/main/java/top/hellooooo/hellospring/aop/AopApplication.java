package top.hellooooo.hellospring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.hellooooo.hellospring.aop.bean.MathCalculator;
import top.hellooooo.hellospring.aop.config.MainConfigOfAOP;

/**
 * @Author Q
 * @Date 11/11/2020 08:29
 * @Description
 */
public class AopApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
		MathCalculator bean = applicationContext.getBean(MathCalculator.class);
		int div = bean.div(12, 3);
		System.out.println(div);
	}
}
