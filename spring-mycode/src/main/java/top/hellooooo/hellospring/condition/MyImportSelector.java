package top.hellooooo.hellospring.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

/**
 * @Author Q
 * @Date 2020/7/25 4:00 PM
 * @Description
 */
public class MyImportSelector implements ImportSelector {
	/**
	 *
	 * @param importingClassMetadata 当前标注@Import类的所有注解的信息
	 * @return 导入容器中的组件的全类名
	 */
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
		for (String annotationType : annotationTypes) {
			System.out.println("annotation:" + annotationType);
		}
		return new String[]{"top.hellooooo.hellospring.bean.Yellow","top.hellooooo.hellospring.bean.Blue"};
	}
}
