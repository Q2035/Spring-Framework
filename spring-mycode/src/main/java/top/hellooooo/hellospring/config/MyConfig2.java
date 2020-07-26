package top.hellooooo.hellospring.config;

import org.springframework.context.annotation.*;
import top.hellooooo.hellospring.bean.Color;
import top.hellooooo.hellospring.bean.Person;
import top.hellooooo.hellospring.bean.Red;
import top.hellooooo.hellospring.condition.LinuxCondition;
import top.hellooooo.hellospring.condition.MacCondition;
import top.hellooooo.hellospring.condition.MyImportBeanDefinitionRegister;
import top.hellooooo.hellospring.condition.MyImportSelector;

/**
 * @Author Q
 * @Date 2020/7/23 8:34 PM
 */
@Configuration
//导入组件，ID默认为权限定名
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegister.class})
public class MyConfig2 {

	//	@Scope("prototype")
	@Bean
	public Person person() {
//		System.out.println("Person Construct...");
		return new Person("zhangsan", 20);
	}

	@Conditional({MacCondition.class})
	@Bean("key")
	public Person person01() {
		return new Person("key", 20);
	}

	@Conditional(LinuxCondition.class)
	@Bean("pass")
	public Person person02() {
		return new Person("pass", 21);
	}
}
