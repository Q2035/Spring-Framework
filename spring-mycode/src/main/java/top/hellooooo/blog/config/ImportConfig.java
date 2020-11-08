package top.hellooooo.blog.config;

import org.springframework.context.annotation.Import;
import top.hellooooo.blog.bean.FactoryBeanCat;

/**
 * @Author Q
 * @Date 07/11/2020 11:24
 * @Description
 */
@Import({ForImport.class, FactoryBeanCat.class})
public class ImportConfig {
}
