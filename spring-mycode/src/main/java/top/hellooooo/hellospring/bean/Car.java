package top.hellooooo.hellospring.bean;

/**
 * @Author Q
 * @Date 2020/7/27 10:07 AM
 * @Description
 */
public class Car {
	public Car() {
		System.out.println("Car construct...");
	}
	public void init(){
		System.out.println("car...init...");
	}
	public void destroy(){
		System.out.println("car...destroy...");
	}
}
