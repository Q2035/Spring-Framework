package top.hellooooo.sourcecode.charpter06.config;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.charset.Charset;

/**
 * @Author Q
 * @Date 03/08/2020 14:44
 * @Description 假如现在有这样一个需求，工程在运行过程中用到的某个设置（例如VAR）是从系统环境变量中取得的，
 * 而如果用户没有在系统环境变量中配置这个参数，那么工程可能不会工作。
 * 这一要求可能会有各种各样的解决办法，当然，在Spring中可以这样做，你可以直接修改Spring的源码，
 * 例如修改ClassPathXmlApplicationContext。
 * 当然，最好的办法还是对源码进行扩展，我们可以自定义类
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
	public MyClassPathXmlApplicationContext(String... configLocations) throws BeansException {
		super(configLocations);
	}

	/**
	 * 验证的时候也就是程序走到getEnvironment().validateRequiredProperties()代码的时候，
	 * 如果系统并没有检测到对应VAR的环境变量，那么将抛出异常
	 */
	@Override
	protected void initPropertySources() {
		System.out.println(new String(getEnvironment().getProperty("JAVA_HOME").getBytes(Charset.forName("gbk")),Charset.forName("UTF-8")));
//		添加验证要求
//		getEnvironment().setRequiredProperties("VAR");
	}
}
