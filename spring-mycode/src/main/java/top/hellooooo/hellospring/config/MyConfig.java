package top.hellooooo.hellospring.config;

import org.springframework.context.annotation.*;
import top.hellooooo.hellospring.bean.Person;

/**
 * @Author Q
 * @Date 2020/7/23 8:09 AM
 */
@ComponentScans(
		value = {
				@ComponentScan(value = "top.hellooooo.hellospring",
//						excludeFilters = {
//							@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
//						}
//						这里需要注意的是，要让自定义的Filter生效需要取消默认的过滤器
						includeFilters = {
								@ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
						},
						useDefaultFilters = false
				)
		}
)
@Configuration
public class MyConfig {

	@Bean
	public Person person() {
		return new Person("lisi", 42);
	}

}
