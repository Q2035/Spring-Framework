package top.hellooooo.sourcecode.charpter06.bean;

/**
 * @Author Q
 * @Date 03/08/2020 14:47
 * @Description
 */
public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}
}
