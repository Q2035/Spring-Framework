package top.hellooooo.blog.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author Q
 * @Date 07/11/2020 13:48
 * @Description
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"top.hellooooo.blog.bean.Dog"};
	}
}
