package top.hellooooo.blog.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @Author Q
 * @Date 09/11/2020 14:01
 * @Description
 */
@Component
public abstract class A {

	static {
		System.out.println("A...Static...Block");
	}

	private B b;

	@Lookup("b")
	public abstract B createB();

	public void process(){
		System.out.println(createB().hashCode());
		System.out.println(createB().hashCode());
		this.b = createB();
	}

	@Override
	public String toString() {
		return "A{" +
				"b=" + b.hashCode() +
				'}';
	}
}
