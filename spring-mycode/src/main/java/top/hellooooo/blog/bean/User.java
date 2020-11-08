package top.hellooooo.blog.bean;

/**
 * @Author Q
 * @Date 07/11/2020 10:55
 * @Description
 */
public class User {
	private String name;

	private void init(){
		System.out.println("User...Init...");
	}

	private void destroy(){
		System.out.println("User...Destroy...");
	}

	public User(String name) {
		System.out.println("User...Construct");
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}
}
