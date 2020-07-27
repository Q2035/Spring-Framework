package top.hellooooo.hellospring.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author Q
 * @Date 2020/7/27 9:54 AM
 * @Description 创建一个Spring定义的FactoryBean
 */
public class ColorFactoryBean implements FactoryBean<Color> {
	/**
	 * @return 返回一个Color对象，这个对象会被添加到容器中
	 * @throws Exception
	 */
	@Override
	public Color getObject() throws Exception {
		System.out.println("ColorFactoryBean...getObject...");
		return new Color();
	}

	@Override
	public Class<?> getObjectType() {
		return Color.class;
	}
}
