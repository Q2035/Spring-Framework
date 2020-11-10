package top.hellooooo.blog.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;

/**
 * @Author Q
 * @Date 09/11/2020 14:01
 * @Description
 */
@ComponentScan("top.hellooooo.blog.autowire")
public class AutowiredConfig {
	@Scope("prototype")
	@Bean
	public B b(){
		return new B();
	}
}
