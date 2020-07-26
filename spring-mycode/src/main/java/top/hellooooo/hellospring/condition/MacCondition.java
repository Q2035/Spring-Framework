package top.hellooooo.hellospring.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author Q
 * @Date 2020/7/25 3:39 PM
 * @Description 判断是否为Mac OS
 */
public class MacCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//		除了判断操作系统之外还可以判断Bean是否被注册
//		eg.判断person对象是否被注册
//		context.getRegistry().containsBeanDefinition("person");
		if (context.getEnvironment().getProperty("os.name").toLowerCase().contains("mac")) {
			return true;
		}
		return false;
	}
}
