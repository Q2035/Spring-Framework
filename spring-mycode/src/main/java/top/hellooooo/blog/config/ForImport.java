package top.hellooooo.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import top.hellooooo.blog.bean.Cat;
import top.hellooooo.blog.bean.User;

/**
 * @Author Q
 * @Date 07/11/2020 11:23
 * @Description
 */
@Configuration
@ComponentScan(value = "top.hellooooo.blog.bean", includeFilters = @ComponentScan.Filter(
		value = CatFilter.class,
		type = FilterType.CUSTOM
))
public class ForImport {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public User user() {
		return new User("Q");
	}
}
