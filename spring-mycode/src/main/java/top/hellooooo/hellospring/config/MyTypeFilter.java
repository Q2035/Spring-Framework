package top.hellooooo.hellospring.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Author Q
 * @Date 2020/7/23 8:45 AM
 */
public class MyTypeFilter implements TypeFilter {

	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
//		metadataReader the metadata reader for the target class 读取扫描到的类的信息
//		metadataReaderFactory a factory for obtaining metadata readers 获取到其他任何类信息了
//		当前类注解信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
//		获取当前正在扫描的类的信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
//		获取当前类的资源信息（类路径）
		Resource resource = metadataReader.getResource();

		System.out.println("----->" + classMetadata.getClassName());

		if (classMetadata.getClassName().contains("myConfig")) {
			return true;
		}
		return false;
	}
}
