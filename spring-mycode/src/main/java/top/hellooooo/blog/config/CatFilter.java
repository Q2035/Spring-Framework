package top.hellooooo.blog.config;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Author Q
 * @Date 08/11/2020 16:36
 * @Description
 */
public class CatFilter implements TypeFilter {

	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		String className = classMetadata.getClassName();
		if (className.toLowerCase().contains("dog")) {
			return true;
		}
		return false;
	}
}
