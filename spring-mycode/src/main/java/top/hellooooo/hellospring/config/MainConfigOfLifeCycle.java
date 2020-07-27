package top.hellooooo.hellospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import top.hellooooo.hellospring.bean.Car;

/**
 * @Author Q
 * @Date 2020/7/27 10:06 AM
 * @Description
 */
@Configuration
@ComponentScan("top.hellooooo.hellospring.bean")
public class MainConfigOfLifeCycle {
	/**
	 * 除了initMethod，还可以让Bean实现InitializingBean接口达到初始化目的
	 * 同样，也有DisposableBean接口
	 * @return
	 */
//	@Bean(initMethod = "init",destroyMethod = "destroy")
	@Bean
	public Car car(){
		return new Car();
	}
}
