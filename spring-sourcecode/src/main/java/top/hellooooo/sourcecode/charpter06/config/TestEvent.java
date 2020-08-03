package top.hellooooo.sourcecode.charpter06.config;

import org.springframework.context.ApplicationEvent;

/**
 * @Author Q
 * @Date 03/08/2020 20:09
 * @Description
 */
public class TestEvent extends ApplicationEvent {

	public static final long serialVersionUID = 100l;

	public String msg;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public TestEvent(Object source) {
		super(source);
	}

	public TestEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public void print(){
		System.out.println(msg);
	}
}
