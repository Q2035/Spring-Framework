package top.hellooooo.hellospring.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import top.hellooooo.hellospring.aop.aspect.LogAspect;
import top.hellooooo.hellospring.aop.bean.MathCalculator;

/**
 * @Author Q
 * @Date 11/11/2020 08:11
 * @Description
 */
@EnableAspectJAutoProxy //开启基于注解的AOP代理
@Configuration
public class MainConfigOfAOP {
	//将业务逻辑类加入容器
	@Bean
	public MathCalculator calculator(){
		return new MathCalculator();
	}

	//将切面类加入容器
	@Bean
	public LogAspect logAspect(){
		return new LogAspect();
	}
}
