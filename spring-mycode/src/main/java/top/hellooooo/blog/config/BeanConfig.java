package top.hellooooo.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.hellooooo.blog.bean.User;

/**
 * @Author Q
 * @Date 07/11/2020 10:56
 * @Description
 */
@Configuration
public class BeanConfig {

	@Bean(initMethod = "init",destroyMethod = "destroy")
	public User user(){
		return new User("Q");
	}

}
