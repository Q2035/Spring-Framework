package top.hellooooo.hellospring.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author Q
 * @Date 2020/7/25 3:39 PM
 * @Description 判断是否为Linux操作系统
 */
public class LinuxCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		if (context.getEnvironment().getProperty("os.name").contains("linux")) {
			return true;
		}
		return false;
	}
}
