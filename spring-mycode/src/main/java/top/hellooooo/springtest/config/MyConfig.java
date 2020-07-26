package top.hellooooo.springtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.hellooooo.springtest.pojo.User;

@Configuration
public class MyConfig {

	@Bean
	public User user(){
		return new User("靓仔");
	}
}
